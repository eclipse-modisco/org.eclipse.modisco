/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.views.queryExecution.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.IQuerySetProvider;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.core.exception.BundleClassPathException;
import org.eclipse.modisco.infra.query.core.exception.ExecutionEnvironmentException;
import org.eclipse.modisco.infra.query.core.exception.MissingBundleException;
import org.eclipse.modisco.infra.query.runtime.ModelQueryContext;
import org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue;
import org.eclipse.modisco.infra.query.runtime.ModelQueryResult;
import org.eclipse.modisco.infra.query.runtime.RuntimeFactory;
import org.eclipse.modisco.infra.query.ui.Activator;
import org.eclipse.modisco.infra.query.ui.Messages;
import org.eclipse.modisco.infra.query.ui.actions.CreateQuerySetAction;
import org.eclipse.modisco.infra.query.ui.controls.QueryFilteredTree;
import org.eclipse.modisco.infra.query.ui.filters.QueryScopeFilter;
import org.eclipse.modisco.infra.query.ui.views.queryExecution.internal.DropAdapter.DropAction;
import org.eclipse.modisco.infra.query.ui.views.queryExecution.internal.QueryResultDisplayersRegistry.NamedQueryResultDisplayer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
@SuppressWarnings("synthetic-access")
public class QueryExecutionView extends ViewPart {

	private static final String QUERY_SET_PROVIDER_EXTENSION_POINT = "org.eclipse.modisco.infra.query.core.querySetProvider"; //$NON-NLS-1$
	private static final int EXECUTE_BUTTON_MIN_WIDTH = 100;
	public static final String ID = "org.eclipse.modisco.infra.query.ui.queryExecutionView"; //$NON-NLS-1$

	private TreeViewer contextViewer;
	private Composite mainComposite;
	private Composite parentComposite;

	private final Set<EObject> fContext = new HashSet<EObject>();

	private final class QueryContextLabelProvider extends LabelProvider implements IColorProvider {
		private final Color gray;

		public QueryContextLabelProvider() {
			final Display display = Display.getCurrent();
			final RGB rgbGray = new RGB(128, 128, 128);
			this.gray = new Color(display, rgbGray);
		}

		@Override
		public String getText(final Object element) {
			if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				String prefix = ""; //$NON-NLS-1$
				EClass eClass = eObject.eClass();
				if (eClass != null) {
					prefix = "[" + eClass.getName() + "] "; //$NON-NLS-1$ //$NON-NLS-2$
				}
				return prefix + ModelUtils.getName(eObject);
			}
			return element.toString();
		}

		@Override
		public Image getImage(final Object element) {
			return ImageUtils.getImage(element);
		}

		public Color getBackground(final Object element) {
			return null;
		}

		public Color getForeground(final Object element) {
			if (element instanceof String) {
				return this.gray;
			}
			return null;
		}

		@Override
		public void dispose() {
			super.dispose();
			this.gray.dispose();
		}
	}

	private enum LayoutStyle {
		Horizontal, Vertical
	}

	private LayoutStyle layoutStyle = QueryExecutionView.LayoutStyle.Horizontal;
	private QueryFilteredTree querySelectionFilteredTree;
	private Combo comboResultDisplayer;
	private ModiscoCatalogChangeListener modiscoCatalogChangeListener;
	private List<IQuerySetProvider> fQuerySetProviders = null;

	public QueryExecutionView() {
		// nothing
	}

	@Override
	public void createPartControl(final Composite parent) {
		this.parentComposite = parent;
		parent.setLayout(gridLayoutWithNoMargins());
		this.layoutStyle = QueryExecutionView.LayoutStyle.Horizontal;
		createMainComposite();
		parent.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(final ControlEvent e) {
				LayoutStyle oldLayoutStyle = QueryExecutionView.this.layoutStyle;
				Point size = parent.getSize();
				if (size.x > size.y) {
					QueryExecutionView.this.layoutStyle = QueryExecutionView.LayoutStyle.Horizontal;
				} else {
					QueryExecutionView.this.layoutStyle = QueryExecutionView.LayoutStyle.Vertical;
				}
				if (QueryExecutionView.this.layoutStyle != oldLayoutStyle) {
					createMainComposite();
				}
			}
		});

		this.modiscoCatalogChangeListener = new ModiscoCatalogChangeListener() {
			public void removed(final IFile file) {
				refreshQueries();
			}

			public void changed(final EObject eObject, final IFile file) {
				refreshQueries();
			}

			public void added(final EObject eObject, final IFile file) {
				refreshQueries();
			}
		};
		ModelQuerySetCatalog.getSingleton().addChangeListener(this.modiscoCatalogChangeListener);
		createContextMenu();
	}

	protected void createContextMenu() {
		final MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new CreateQuerySetAction());
		contextMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		TreeViewer viewer = this.querySelectionFilteredTree.getViewer();
		final Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, viewer);
	}

	@Override
	public void dispose() {
		ModelQuerySetCatalog.getSingleton().removeChangeListener(this.modiscoCatalogChangeListener);
		super.dispose();
	}

	private void refreshQueries() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				updateQueriesInput();
			}
		});
	}

	private void createMainComposite() {
		if (this.mainComposite != null) {
			this.mainComposite.dispose();
		}
		this.mainComposite = new Composite(this.parentComposite, SWT.NONE);
		this.mainComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.mainComposite.setLayout(gridLayoutWithNoMargins());

		final int direction;
		if (this.layoutStyle == QueryExecutionView.LayoutStyle.Horizontal) {
			direction = SWT.HORIZONTAL;
		} else {
			direction = SWT.VERTICAL;
		}

		SashForm sashForm = new SashForm(this.mainComposite, SWT.SMOOTH | direction);
		sashForm.setLayout(new FillLayout());
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		createContextGroup(sashForm);
		// createQueryGroup(sashForm);
		Composite lastGroup = new Composite(sashForm, SWT.NONE);
		createQueryGroup(lastGroup);
		lastGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		GridLayout gridLayout;
		if (this.layoutStyle == QueryExecutionView.LayoutStyle.Horizontal) {
			gridLayout = new GridLayout(2, false);
		} else {
			gridLayout = new GridLayout();
		}
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		lastGroup.setLayout(gridLayout);
		// TODO: implement parameters (hidden in the meantime)
		// /!\ when it is added back, put the QueryGroup back in the sashForm
		// instead of lastGroup
		// createParametersGroup(lastGroup);

		createExecuteGroup(lastGroup);

	}

	private GridLayout gridLayoutWithNoMargins() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		return gridLayout;
	}

	private void createQueryGroup(final Composite parent) {
		Group queryGroup = new Group(parent, SWT.NONE);
		queryGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		queryGroup.setText(Messages.QueryExecutionView_Query);
		GridLayout groupLayout = new GridLayout();
		queryGroup.setLayout(groupLayout);
		Collection<ModelQuerySet> querySets = new ArrayList<ModelQuerySet>();
		querySets.addAll(ModelQuerySetCatalog.getSingleton().getAllModelQuerySets());
		querySets.addAll(dynamicQuerySets(new ArrayList<EObject>()));
		this.querySelectionFilteredTree = new QueryFilteredTree(queryGroup, querySets, null, false);
		GridData controlData = new GridData(SWT.FILL, SWT.FILL, true, true);
		this.querySelectionFilteredTree.setLayoutData(controlData);
		// double-click or enter to execute the selected query
		this.querySelectionFilteredTree.getViewer().addOpenListener(new IOpenListener() {
			public void open(final OpenEvent event) {
				executeClicked();
			}
		});
		QueryTooltip queryTooltip = new QueryTooltip();
		queryTooltip.installOn(this.querySelectionFilteredTree.getViewer().getTree());
	}

	private Collection<? extends ModelQuerySet> dynamicQuerySets(final Collection<EObject> context) {
		List<IQuerySetProvider> querySetProviders = getQuerySetProviders();
		List<ModelQuerySet> dynamicQuerySets = new ArrayList<ModelQuerySet>();
		for (IQuerySetProvider querySetProvider : querySetProviders) {
			dynamicQuerySets.addAll(querySetProvider.getQuerySets(context));
		}
		return dynamicQuerySets;
	}

	private List<IQuerySetProvider> getQuerySetProviders() {
		if (this.fQuerySetProviders == null) {
			this.fQuerySetProviders = new ArrayList<IQuerySetProvider>();
			IConfigurationElement[] configs = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(
							QueryExecutionView.QUERY_SET_PROVIDER_EXTENSION_POINT);
			for (IConfigurationElement config : configs) {
				Object executableExtension;
				try {
					executableExtension = config.createExecutableExtension("class"); //$NON-NLS-1$
					if (executableExtension instanceof IQuerySetProvider) {
						IQuerySetProvider querySetProvider = (IQuerySetProvider) executableExtension;
						this.fQuerySetProviders.add(querySetProvider);
					}
				} catch (CoreException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
		}
		return this.fQuerySetProviders;
	}

	private void createContextGroup(final Composite parent) {
		Group contextGroup = new Group(parent, SWT.NONE);
		contextGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		contextGroup.setText(Messages.QueryExecutionView_Context);
		GridLayout groupLayout = new GridLayout();
		contextGroup.setLayout(groupLayout);
		createContextViewer(contextGroup);
	}

	private static class ElementsGroup {
		public static final int GROUP_SIZE = 1000;
		private final List<Object> elements;
		private final int start;
		private final int end;
		private final int fullListSize;

		public ElementsGroup(final int first, final int last, final List<Object> elements,
				final int fullListSize) {
			this.start = first;
			this.end = last;
			this.elements = elements;
			this.fullListSize = fullListSize;
		}

		public List<Object> getElements() {
			return this.elements;
		}

		@Override
		public String toString() {
			final int maxDigits = (int) Math.ceil(Math.log10(this.fullListSize));

			final StringBuilder buffer = new StringBuilder();
			buffer.append("["); //$NON-NLS-1$

			final String strStartIndex = "" + this.start; //$NON-NLS-1$
			final String strEndIndex = "" + (this.end - 1); //$NON-NLS-1$

			zeroes(maxDigits - strStartIndex.length(), buffer);
			buffer.append(strStartIndex);
			buffer.append(".."); //$NON-NLS-1$
			zeroes(maxDigits - strEndIndex.length(), buffer);
			buffer.append(strEndIndex);
			buffer.append("]"); //$NON-NLS-1$

			return buffer.toString();
		}

		private void zeroes(final int count, final StringBuilder buffer) {
			for (int i = 0; i < count; i++) {
				buffer.append('0');
			}
		}
	}

	private void createContextViewer(final Group contextGroup) {
		this.contextViewer = new TreeViewer(contextGroup, SWT.MULTI | SWT.BORDER);
		GridData listData = new GridData(SWT.FILL, SWT.FILL, true, true);
		this.contextViewer.getTree().setLayoutData(listData);
		addDropSupport(this.contextViewer);
		createContextMenu(this.contextViewer);

		this.contextViewer.setContentProvider(new ITreeContentProvider() {

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// nothing
			}

			public void dispose() {
				// nothing
			}

			public Object[] getElements(final Object inputElement) {
				if (inputElement instanceof Set<?>) {
					Set<?> set = ((Set<?>) inputElement);
					if (!set.isEmpty()) {
						if (set.size() > QueryExecutionView.ElementsGroup.GROUP_SIZE) {
							final ArrayList<QueryExecutionView.ElementsGroup> groups = new ArrayList<QueryExecutionView.ElementsGroup>();
							Iterator<?> iterator = set.iterator();
							for (int start = 0; start < set.size(); start += QueryExecutionView.ElementsGroup.GROUP_SIZE) {
								// start is inclusive, end is exclusive
								int end = start + QueryExecutionView.ElementsGroup.GROUP_SIZE;
								if (end > set.size()) {
									end = set.size();
								}

								final List<Object> elementsList = new ArrayList<Object>();
								for (int i = start; i < end; i++) {
									Object element = iterator.next();
									elementsList.add(element);
								}

								groups.add(new ElementsGroup(start, end, elementsList, set.size()));
							}
							return groups.toArray(new QueryExecutionView.ElementsGroup[groups
									.size()]);
						}
						return set.toArray();
					}
					return new Object[] { Messages.QueryExecutionView_dragAndDropHint };
				}
				return null;
			}

			public boolean hasChildren(final Object element) {
				if (element instanceof ElementsGroup) {
					return true;
				}
				return false;
			}

			public Object getParent(final Object element) {
				return null;
			}

			public Object[] getChildren(final Object parentElement) {
				if (parentElement instanceof ElementsGroup) {
					ElementsGroup elementsGroup = (ElementsGroup) parentElement;
					return elementsGroup.getElements().toArray();
				}
				return null;
			}
		});

		this.contextViewer.setLabelProvider(new QueryContextLabelProvider());
		this.contextViewer.setInput(this.fContext);
		this.contextViewer.setComparator(new ViewerComparator() {
			@Override
			public int compare(final Viewer viewer, final Object e1, final Object e2) {
				LabelProvider labelProvider = (LabelProvider) QueryExecutionView.this.contextViewer
						.getLabelProvider();
				String label1 = labelProvider.getText(e1);
				String label2 = labelProvider.getText(e2);
				return label1.compareToIgnoreCase(label2);
			}
		});
	}

	private EditableContext createEditableContext() {
		return new EditableContext() {
			public void add(final EObject eObject) {
				QueryExecutionView.this.fContext.add(eObject);
			}

			public void remove(final EObject eObject) {
				QueryExecutionView.this.fContext.remove(eObject);
			}

			public void clear() {
				QueryExecutionView.this.fContext.clear();
			}

			public void done() {
				refreshContextViewer();
			}
		};
	}

	/** Create a context menu on the context pane */
	private void createContextMenu(final TreeViewer treeViewer) {
		final ContextPaneMenuManager menuManager = new ContextPaneMenuManager(this,
				createEditableContext(), treeViewer);
		final Menu menu = menuManager.createContextMenu(treeViewer.getTree());
		treeViewer.getTree().setMenu(menu);
	}

	private void addDropSupport(final TreeViewer viewer) {
		DropTargetListener dropTargetListener = new DropAdapter(new DropAction() {
			@Override
			public void dropped(final Set<EObject> eObjects) {
				QueryExecutionView.this.fContext.addAll(eObjects);
				refreshContextViewerDelayed();
			}
		});
		int dndOperations = DND.DROP_LINK | DND.DROP_COPY | DND.DROP_MOVE;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDropSupport(dndOperations, transfers, dropTargetListener);
	}

	/** Allows optimized refreshes of the viewer */
	private Job refreshJob = null;

	protected void refreshContextViewerDelayed() {
		if (this.refreshJob == null) {
			this.refreshJob = new Job(Messages.QueryExecutionView_refreshing) {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							refreshContextViewer();
						}
					});
					return Status.OK_STATUS;
				}
			};
		} else {
			/*
			 * If refreshTreeDelayed is called again before the job delay
			 * passed, then cancel the job and re-schedule a new one.
			 */
			this.refreshJob.cancel();
		}
		this.refreshJob.setPriority(Job.DECORATE);
		final int delay = 100;
		this.refreshJob.schedule(delay);
	}

	private void refreshContextViewer() {
		this.contextViewer.refresh();
		updateQueriesInput();
		updateScopeFilters();
	}

	private void updateQueriesInput() {
		Collection<ModelQuerySet> querySets = new ArrayList<ModelQuerySet>();
		querySets.addAll(ModelQuerySetCatalog.getSingleton().getAllModelQuerySets());
		querySets.addAll(dynamicQuerySets(this.fContext));
		this.querySelectionFilteredTree.setInput(querySets);
	}

	/**
	 * Only display queries that can be applied to all the context
	 * {@link EObject}s
	 */
	private void updateScopeFilters() {
		List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		Set<EClass> classes = new HashSet<EClass>();
		for (EObject eObject : this.fContext) {
			classes.add(eObject.eClass());
		}
		for (EClass eClass : classes) {
			filters.add(new QueryScopeFilter(eClass));
		}

		this.querySelectionFilteredTree.setFilters(filters);

	}

	// private void createParametersGroup(final Composite parent) {
	// Group parametersGroup = new Group(parent, SWT.NONE);
	// parametersGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
	// true));
	// parametersGroup.setText(Messages.QueryExecutionView_Parameters);
	// parametersGroup.setLayout(new GridLayout());
	// new Label(parametersGroup,
	// SWT.NONE).setText(Messages.QueryExecutionView_notImplementedYet);
	// }

	private void createExecuteGroup(final Composite parent) {
		Group executeGroup = new Group(parent, SWT.NONE);
		executeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		executeGroup.setText(Messages.QueryExecutionView_ExecuteGroup);
		executeGroup.setLayout(new GridLayout());
		createDisplayStyleComposite(executeGroup);
		Button buttonExecute = new Button(executeGroup, SWT.PUSH);
		buttonExecute.setText(Messages.QueryExecutionView_ExecuteButton);
		GridData buttonData = new GridData(SWT.CENTER, SWT.NONE, true, false);
		buttonData.minimumWidth = QueryExecutionView.EXECUTE_BUTTON_MIN_WIDTH;
		buttonExecute.setLayoutData(buttonData);
		buttonExecute.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				executeClicked();
			}
		});
	}

	protected void executeClicked() {
		final ModelQuerySetCatalog querySetCatalog = ModelQuerySetCatalog.getSingleton();
		ModelQuery selectedQuery = getSelectedQuery();
		if (selectedQuery != null) {
			try {
				final AbstractModelQuery modelQueryImpl = querySetCatalog
						.getModelQueryImpl(selectedQuery);
				ModelQueryContext modelQueryContext = RuntimeFactory.eINSTANCE
						.createModelQueryContext();
				modelQueryContext.getSelectedModelElements().addAll(this.fContext);
				// TODO: parameters
				List<ModelQueryResult> result = modelQueryImpl.evaluate(modelQueryContext,
						Collections.<ModelQueryParameterValue> emptyList());
				if (checkResult(result)) {
					displayResult(result);
				}
			} catch (ExecutionEnvironmentException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				MessageDialog.openError(getSite().getShell(),
						Messages.QueryExecutionView_execEnvNotAvailable, NLS.bind(
								Messages.QueryExecutionView_execEnvError, e.getRequiredExecEnv(),
								e.getAvailableExecEnv()));
			} catch (MissingBundleException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				MessageDialog.openError(getSite().getShell(), Messages.QueryExecutionView_0,
						NLS.bind(Messages.QueryExecutionView_1, e.getBundleName()));
			} catch (BundleClassPathException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				MessageDialog.openError(getSite().getShell(),
						Messages.QueryExecutionView_errorInBundleClasspath, NLS.bind(
								Messages.QueryExecutionView_classpathWarning, e.getProject()
										.getName(), e.getOutputLocation()));
			} catch (final Exception e) {
				StackTraceElement[] stackTrace = e.getStackTrace();
				String stack = ""; //$NON-NLS-1$
				if (stackTrace.length > 0) {
					stack = "\nat:" + stackTrace[0].toString(); //$NON-NLS-1$
				}
				String message;
				if (e.getMessage() != null) {
					message = " : " + e.getMessage(); //$NON-NLS-1$
				} else {
					message = ""; //$NON-NLS-1$
				}
				MessageDialog.openError(getSite().getShell(),
						Messages.QueryExecutionView_ErrorExecutingQuery, e.getClass()
								.getSimpleName() + message + stack);
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		} else {
			MessageDialog.openInformation(getSite().getShell(),
					Messages.QueryExecutionView_NoQuerySelected,
					Messages.QueryExecutionView_SelectQueryToExecute);
		}
	}

	private boolean checkResult(final List<ModelQueryResult> result) {
		for (ModelQueryResult modelQueryResult : result) {
			Exception exc = modelQueryResult.getException();
			if (exc != null) {
				MoDiscoLogger.logError(exc, "Query exception", Activator.getDefault()); //$NON-NLS-1$
				MessageDialog.openError(this.mainComposite.getShell(),
						Messages.QueryExecutionView_QueryException, exc.getClass().getSimpleName()
								+ " : " + exc.getMessage()); //$NON-NLS-1$
				return false;
			}
			// if (modelQueryResult.getValue() == null) {
			//				MoDiscoLogger.logError("null query result", Activator.getDefault()); //$NON-NLS-1$
			// MessageDialog.openError(this.mainComposite.getShell(),
			// Messages.QueryExecutionView_NullQueryResult,
			// Messages.QueryExecutionView_QueryReturnedNull);
			// return false;
			// }
		}
		return true;
	}

	private void displayResult(final List<ModelQueryResult> result) {
		String displayerName = this.comboResultDisplayer.getText();
		NamedQueryResultDisplayer queryResultDisplayer = QueryResultDisplayersRegistry
				.getInstance().getQueryResultDisplayer(displayerName);
		if (queryResultDisplayer != null) {
			queryResultDisplayer.getDisplayer().displayQueryResult(result);
		} else {
			String message = NLS.bind("Query Displayer with name \"{0}\" not found", displayerName); //$NON-NLS-1$
			MoDiscoLogger.logError(message, Activator.getDefault());
			MessageDialog.openWarning(getSite().getShell(),
					Messages.QueryExecutionView_NoQueryDisplayer, message);
		}
	}

	private ModelQuery getSelectedQuery() {
		ISelection selection = this.querySelectionFilteredTree.getViewer().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object selectedElement = structuredSelection.getFirstElement();
			if (selectedElement instanceof ModelQuery) {
				ModelQuery selectedQuery = (ModelQuery) selectedElement;
				return selectedQuery;
			}
		}
		return null;
	}

	private void createDisplayStyleComposite(final Group executeGroup) {
		Composite displayStyleComposite = new Composite(executeGroup, SWT.NONE);
		displayStyleComposite.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		displayStyleComposite.setLayout(new GridLayout(2, false));
		Label label = new Label(displayStyleComposite, SWT.NONE);
		label.setText(Messages.QueryExecutionView_DisplayResultIn);
		this.comboResultDisplayer = new Combo(displayStyleComposite, SWT.DROP_DOWN | SWT.READ_ONLY);

		List<NamedQueryResultDisplayer> queryResultDisplayers = QueryResultDisplayersRegistry
				.getInstance().getQueryResultDisplayers();
		for (NamedQueryResultDisplayer namedQueryResultDisplayer : queryResultDisplayers) {
			this.comboResultDisplayer.add(namedQueryResultDisplayer.getName());
		}

		this.comboResultDisplayer.select(0);
		this.comboResultDisplayer.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
	}

	@Override
	public void setFocus() {
		this.querySelectionFilteredTree.setFocus();
	}

	public void setContext(final List<EObject> selectedEObjects) {
		this.fContext.clear();
		this.fContext.addAll(selectedEObjects);
		refreshContextViewer();
	}

	public void setSelectedQueries(final List<ModelQuery> queries) {
		// this works if the queries are in a resource accessed using the
		// "modisco://" protocol
		this.querySelectionFilteredTree.getViewer().setSelection(new StructuredSelection(queries));
	}

	public ContextInfo getContextInfo() {
		ContextInfo contextSelectionInfo = new ContextInfo(new ArrayList<EObject>(this.fContext));

		ISelection selection = this.contextViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof EObject) {
					EObject eObject = (EObject) selectedElement;
					contextSelectionInfo.addSelectedEObject(eObject);
				}
			}
		}
		return contextSelectionInfo;
	}

	public final class ContextInfo {
		private final List<EObject> eObjects;
		private final List<EObject> selectedEObjects = new ArrayList<EObject>();

		private ContextInfo(final List<EObject> eObjects) {
			this.eObjects = eObjects;
		}

		public List<EObject> getEObjects() {
			return this.eObjects;
		}

		private void addSelectedEObject(final EObject eObject) {
			this.selectedEObjects.add(eObject);
		}

		public List<EObject> getSelectedEObjects() {
			return this.selectedEObjects;
		}

	}

}
