/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.CellNavigationStrategy;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerFocusCellManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.core.ModelElementItemEx;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.editors.table.ColumnDescription.Type;
import org.eclipse.modisco.infra.browser.editors.table.TableEditorInput.ElementsDescription;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.internal.utils.StringUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.ResourceEditorInput;
import org.eclipse.modisco.infra.facet.FacetStructuralFeature;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

public class TableEditor extends EditorPart implements ISelectionProvider, IMenuListener,
		ITableEditor {

	private static final int LABEL_COLUMN_WIDTH = 125;
	private static final int DEFAULT_COLUMN_WIDTH = 100;
	private static final int MAX_INITIAL_COLUMN_WIDTH = 300;
	public static final String EDITOR_ID = "org.eclipse.modisco.infra.browser.table.editorID"; //$NON-NLS-1$
	/**
	 * The number of items above which a virtual table is used. The virtual
	 * style is not always used because it prevents correct packing of columns
	 * (since the elements' labels are not computed in advance).
	 */
	private static final int USE_VIRTUAL_THRESHOLD = 1000;

	/** The data key for columns that are hidden because they are empty */
	private static final String KEY_EMPTY_HIDDEN = "emptyHidden"; //$NON-NLS-1$

	/**
	 * The data key for columns that are hidden because the feature (attribute
	 * or reference) they represent is not common to all the elements
	 */
	private static final String KEY_NOT_COMMON_HIDDEN = "notCommonHidden"; //$NON-NLS-1$

	private TableViewer tableViewer;
	private TableEditorInput tableEditorInput;
	private TableEditorLabelProvider tableEditorLabelProvider;
	private List<ColumnDescription> columnsConfiguration;
	private TableEditorToolBar toolBar;
	private TableEditorContentProvider tableEditorContentProvider;
	private TableViewerFocusCellManager tableViewerFocusCellManager;
	private final Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		if (input instanceof TableEditorInput) {
			this.tableEditorInput = (TableEditorInput) input;
			setSite(site);
			setInput(this.tableEditorInput);
			setPartName(Messages.TableEditor_tableViewer);
		} else {
			throw new PartInitException("Input should be of type TableEditorInput"); //$NON-NLS-1$
		}
	}

	protected TableEditorInput getTableEditorInput() {
		return this.tableEditorInput;
	}

	@Override
	public void createPartControl(final Composite parent) {

		final Composite editorComposite = new Composite(parent, SWT.NONE);
		final GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 2;
		editorComposite.setLayout(gridLayout);

		createToolBar(editorComposite);
		this.toolBar.setLabelText(this.tableEditorInput.getDescription());

		final GridData tableGridData = new GridData();
		tableGridData.grabExcessHorizontalSpace = true;
		tableGridData.grabExcessVerticalSpace = true;
		tableGridData.horizontalAlignment = SWT.FILL;
		tableGridData.verticalAlignment = SWT.FILL;

		int virtualFlag = 0;
		if (this.tableEditorInput.getElements().size() > TableEditor.USE_VIRTUAL_THRESHOLD) {
			virtualFlag = SWT.VIRTUAL;
		}

		loadDefaultCustomizations();

		this.tableViewer = new TableViewer(editorComposite, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | virtualFlag);

		FocusCellOwnerDrawHighlighter focusCellOwnerDrawHighlighter = new FocusCellOwnerDrawHighlighter(
				this.tableViewer);
		this.tableViewerFocusCellManager = new TableViewerFocusCellManager(this.tableViewer,
				focusCellOwnerDrawHighlighter);

		this.tableViewer.getTable().setLayoutData(tableGridData);

		// use the same font size as in the main editor
		this.tableViewer.getTable().setFont(
				this.tableEditorInput.getBrowserConfiguration().getAppearanceConfiguration()
						.getCustomFont());
		this.tableViewer.getTable().setLinesVisible(true);
		this.tableViewer.getTable().setHeaderVisible(true);

		this.tableEditorContentProvider = new TableEditorContentProvider();
		this.columnsConfiguration = createColumnConfiguration();

		this.tableEditorLabelProvider = new TableEditorLabelProvider(this.columnsConfiguration,
				this.tableEditorInput.getBrowserConfiguration());

		createColumns(this.columnsConfiguration);

		this.tableViewer.setContentProvider(this.tableEditorContentProvider);
		this.tableViewer.setLabelProvider(this.tableEditorLabelProvider);
		this.tableViewer.setInput(this.tableEditorInput);

		this.tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				tableSelectionChanged();
			}
		});

		// notify listeners when selecting a cell using the keyboard
		this.tableViewer.getTable().addKeyListener(new KeyListener() {
			private final CellNavigationStrategy cellNavigationStrategy = new CellNavigationStrategy();

			public void keyReleased(final KeyEvent e) {
				// nothing
			}

			public void keyPressed(final KeyEvent e) {
				Event event = new Event();
				event.keyCode = e.keyCode;
				if (this.cellNavigationStrategy.isNavigationEvent(null, event)) {
					tableSelectionChanged();
				}
			}
		});

		createContextMenuFor(this.tableViewer);
		registerOpenListeners();
		registerCloseWhenMainEditorClosed();

		getSite().setSelectionProvider(this);

		packColumns();
	}

	protected void tableSelectionChanged() {
		for (ISelectionChangedListener listener : new ArrayList<ISelectionChangedListener>(
				this.selectionChangedListeners)) {
			listener.selectionChanged(new SelectionChangedEvent(this, getSelection()));
		}
	}

	private void createToolBar(final Composite parent) {
		final Composite toolBarComposite = new Composite(parent, SWT.NONE);
		this.toolBar = new TableEditorToolBar(toolBarComposite, this);
	}

	private void registerCloseWhenMainEditorClosed() {
		final EcoreBrowser editor = this.tableEditorInput.getBrowserConfiguration().getEditor();
		if (editor == null) {
			return;
		}

		editor.getEditorSite().getPage().addPartListener(new IPartListener() {

			public void partClosed(final IWorkbenchPart part) {
				final EcoreBrowser browser = TableEditor.this.tableEditorInput
						.getBrowserConfiguration().getEditor();
				if (browser != null && part == browser) {
					TableEditor.this.getSite().getPage().closeEditor(TableEditor.this, false);
					part.getSite().getPage().removePartListener(this);
				}
			}

			public void partOpened(final IWorkbenchPart part) {
				// nothing
			}

			public void partDeactivated(final IWorkbenchPart part) {
				// nothing
			}

			public void partBroughtToTop(final IWorkbenchPart part) {
				// nothing
			}

			public void partActivated(final IWorkbenchPart part) {
				// nothing
			}
		});
	}

	/**
	 * Registers listeners used to open an element in the main editor by
	 * double-click or &lt;Enter&gt;
	 */
	private void registerOpenListeners() {
		// double-click
		this.tableViewer.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(final MouseEvent e) {
				final ViewerCell cell = TableEditor.this.tableViewer.getCell(new Point(e.x, e.y));
				int column;
				if (cell == null) {
					column = 0;
				} else {
					column = cell.getColumnIndex();
				}

				openSelectionInModelBrowser(column);
			}
		});

		// enter
		this.tableViewer.getTable().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					openSelectionInModelBrowser(0);
				}
			}
		});
	}

	/** pack the table's columns with a limit on max width */
	private void packColumns() {
		final TableColumn[] tableColumns = this.tableViewer.getTable().getColumns();
		for (final TableColumn tableColumn : tableColumns) {
			tableColumn.pack();
			if (tableColumn.getWidth() > TableEditor.MAX_INITIAL_COLUMN_WIDTH) {
				tableColumn.setWidth(TableEditor.MAX_INITIAL_COLUMN_WIDTH);
			}
		}
	}

	/** Create a configuration about what to display in columns */
	protected List<ColumnDescription> createColumnConfiguration() {
		ElementsDescription elementsDescription = this.tableEditorInput.getElementsDescription();

		final ArrayList<ColumnDescription> columns = new ArrayList<ColumnDescription>();
		if (showLabelColumn()) {
			columns.add(new ColumnDescription(ColumnDescription.Type.DEFAULT_LABEL));
		}
		if (showMetaclassColumn()) {
			columns.add(new ColumnDescription(ColumnDescription.Type.METACLASS_NAME));
		}
		if (elementsDescription.containsEObjects() && showEContainerColumn()) {
			columns.add(new ColumnDescription(ColumnDescription.Type.ECONTAINER));
		}
		if (elementsDescription.containsContexts()) {
			// context, for query results
			columns.add(new ColumnDescription(ColumnDescription.Type.CONTEXT));
		}

		for (final EStructuralFeature feature : this.tableEditorInput.getFeatures()) {
			columns.add(new ColumnDescription(feature));
		}

		// // first, non-derived references
		// for (final EReference reference :
		// this.tableEditorInput.getReferences()) {
		// if (!reference.isDerived()) {
		// columns.add(new ColumnDescription(reference));
		// }
		// }
		//
		// // then derived references
		// for (final EReference reference :
		// this.tableEditorInput.getReferences()) {
		// if (reference.isDerived()) {
		// columns.add(new ColumnDescription(reference));
		// }
		// }

		return columns;
	}

	protected boolean showLabelColumn() {
		return true;
	}

	protected boolean showMetaclassColumn() {
		return true;
	}

	protected boolean showEContainerColumn() {
		return true;
	}

	/** Whether no element has this reference set */
	private boolean isEmpty(final EReference reference) {
		final Object[] elements = this.tableEditorContentProvider
				.getElements(this.tableEditorInput);
		FacetContext facetContext = this.tableEditorInput.getBrowserConfiguration()
				.getAppearanceConfiguration().getFacetContext();
		for (final Object e : elements) {
			TableElement tableElement = (TableElement) e;
			Object element = tableElement.getElement();
			if (element instanceof EObject) {
				final EObject eObject = (EObject) element;
				if (hasStructuralFeature(eObject, reference, facetContext)) {
					final Object value = getStructuralFeatureValue(eObject, reference,
							getFacetContext());
					if (reference.isMany()) {
						@SuppressWarnings("unchecked")
						final EList<EObject> list = (EList<EObject>) value;
						if (!list.isEmpty()) {
							return false;
						}
					} else {
						if (value != null) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	/** Whether no element has this attribute set */
	private boolean isEmpty(final EAttribute attribute) {
		final Object[] elements = this.tableEditorContentProvider
				.getElements(this.tableEditorInput);
		FacetContext facetContext = this.tableEditorInput.getBrowserConfiguration()
				.getAppearanceConfiguration().getFacetContext();
		for (final Object e : elements) {
			TableElement tableElement = (TableElement) e;
			Object element = tableElement.getElement();
			if (element instanceof EObject) {
				final EObject eObject = (EObject) element;
				if (hasStructuralFeature(eObject, attribute, facetContext)) {
					final Object value = getStructuralFeatureValue(eObject, attribute,
							getFacetContext());
					if (attribute.isMany()) {
						@SuppressWarnings("unchecked")
						final EList<EObject> list = (EList<EObject>) value;
						if (!list.isEmpty()) {
							return false;
						}
					} else {
						if (value != null) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	private void createColumns(final List<ColumnDescription> columns) {
		int columnIndex = 0;
		for (final ColumnDescription columnDescription : columns) {
			final TableViewerColumn column = new TableViewerColumn(this.tableViewer, SWT.NONE);
			final TableColumn tableColumn = column.getColumn();
			tableColumn.setWidth(TableEditor.DEFAULT_COLUMN_WIDTH);
			tableColumn.setResizable(true);
			tableColumn.setMoveable(true);
			column.getColumn().setData(columnDescription);

			switch (columnDescription.getType()) {
			// shows the same thing as in model browser tree
			case DEFAULT_LABEL:
				tableColumn.setText(Messages.TableEditor_columnName_Label);
				tableColumn.setWidth(TableEditor.LABEL_COLUMN_WIDTH);
				break;
			case METACLASS_NAME:
				tableColumn.setText(Messages.TableEditor_columnName_Metaclass);
				break;
			case CONTEXT:
				tableColumn.setText(Messages.TableEditor_ColumnName_queryContext);
				break;
			case ECONTAINER:
				tableColumn.setText("/eContainer"); //$NON-NLS-1$
				break;
			case ATTRIBUTE:
				final EAttribute attribute = columnDescription.getAttribute();
				if (attribute.isDerived()) {
					tableColumn.setText("/" + attribute.getName()); //$NON-NLS-1$
				} else {
					tableColumn.setText(attribute.getName());
				}
				tableColumn.setImage(ImageProvider.getInstance().getAttributeIcon());
				break;
			case REFERENCE:
				final EReference reference = columnDescription.getReference();
				final String multiplicity;
				if (showMultiplicityInColumnNames()) {
					multiplicity = LinkItem.getMultiplicity(reference);
				} else {
					multiplicity = ""; //$NON-NLS-1$
				}
				if (reference.isDerived()) {
					tableColumn.setText("/" + reference.getName() + multiplicity); //$NON-NLS-1$
				} else {
					tableColumn.setText(reference.getName() + multiplicity);
				}

				tableColumn.setImage(LinkItem.getImageFor(reference));
				// tableColumn.setImage(ImageProvider.getInstance().getLinkIcon());
				break;
			default:
				MoDiscoBrowserPlugin.logWarning("Unhandled column description type"); //$NON-NLS-1$
			}

			final int fColumnIndex = columnIndex;
			@SuppressWarnings("unused")
			TableSorter tableSorter = new TableSorter(this.tableViewer, column) {
				@Override
				protected int doCompare(final Viewer viewer, final Object e1, final Object e2) {
					// reuse the label provider to get the name to compare
					final String label1 = TableEditor.this.tableEditorLabelProvider.getColumnText(
							e1, fColumnIndex);
					final String label2 = TableEditor.this.tableEditorLabelProvider.getColumnText(
							e2, fColumnIndex);
					return label1.compareToIgnoreCase(label2);
				}
			};

			columnIndex++;
		}
	}

	protected boolean showMultiplicityInColumnNames() {
		return true;
	}

	@Override
	public void setFocus() {
		if (this.tableViewer != null) {
			this.tableViewer.getTable().setFocus();
		}
	}

	/**
	 * Whether the table editor can be opened on the given selection.
	 * <code>true</code> if the selection is a link or a collection of model
	 * objects.
	 */
	public static boolean canBeOpenedOnSelection(final ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof LinkItem) {
				final LinkItem linkItem = (LinkItem) structuredSelection.getFirstElement();
				return linkItem.getChildren().size() > 0;
			}

			boolean empty = true;
			final Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				final Object selectedElement = iterator.next();
				if (selectedElement instanceof ModelElementItem) {
					empty = false;
				} else {
					return false;
				}
			}
			return !empty;
		}
		return false;
	}

	private void openSelectionInModelBrowser(final int column) {
		final EObject element = findElementToOpenInModelBrowser(column);
		if (element != null) {
			openElementInModelBrowser(element);
		}
	}

	/** @return the first selected element or <code>null</code> if none */
	private TableElement getSelectedElement() {
		final ISelection selection = this.tableViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			return (TableElement) structuredSelection.getFirstElement();
		}
		return null;
	}

	public EObject findElementToOpenInModelBrowser(final int column) {
		return findElementToOpenInModelBrowser(column, getFacetContext(),
				this.columnsConfiguration, getSelectedElement());
	}

	/**
	 * Find and return the element that should be opened when the given column
	 * is clicked
	 *
	 * @param tableElement
	 */
	public static EObject findElementToOpenInModelBrowser(final int column,
			final FacetContext facetContext, final List<ColumnDescription> columnDescriptions,
			final TableElement mainElement) {
		if (mainElement == null) {
			return null;
		}
		final EObject mainModelElement;
		if (mainElement.getElement() instanceof EObject) {
			mainModelElement = (EObject) mainElement.getElement();
		} else {
			mainModelElement = null;
		}

		EObject targetObject = null;
		final ColumnDescription columnDescription = columnDescriptions.get(column);
		final Object value;
		switch (columnDescription.getType()) {
		case ATTRIBUTE:
			if (mainModelElement != null
					&& hasStructuralFeature(mainModelElement, columnDescription.getAttribute(),
							facetContext)) {
				value = getStructuralFeatureValue(mainModelElement,
						columnDescription.getAttribute(), facetContext);
				if (value instanceof EObject) {
					targetObject = (EObject) value;
				}
			}
			break;
		case REFERENCE:
			if (mainModelElement != null
					&& hasStructuralFeature(mainModelElement, columnDescription.getReference(),
							facetContext)) {
				value = getStructuralFeatureValue(mainModelElement,
						columnDescription.getReference(), facetContext);
				if (columnDescription.getReference().isMany()) {
					@SuppressWarnings("unchecked")
					final EList<EObject> list = (EList<EObject>) value;
					if (list.size() == 1) {
						targetObject = list.get(0);
					}
				} else {
					targetObject = (EObject) value;
				}
			}
			break;
		case ECONTAINER:
			if (mainModelElement != null) {
				targetObject = mainModelElement.eContainer();
			}
			break;
		case CONTEXT:
			if (mainElement instanceof TableElementWithContext) {
				TableElementWithContext tableElementWithContext = (TableElementWithContext) mainElement;
				targetObject = tableElementWithContext.getContext();
			}
			break;
		case DEFAULT_LABEL:
			targetObject = mainModelElement;
			break;
		default:
			break;
		}

		if (targetObject != null) {
			return targetObject;
		}
		return null;
	}

	private void openElementInModelBrowser(final EObject element) {
		final EcoreBrowser editor = TableEditor.this.tableEditorInput.getBrowserConfiguration()
				.getEditor();
		if (editor != null) {
			editor.getSite().getPage().activate(editor);
			editor.browseTo(element);
		} else {
			// try to re-open the element in the same browser it came from
			Resource resource = element.eResource();
			if (resource != null) {
				ResourceSet resourceSet = resource.getResourceSet();
				IEditorReference[] editorReferences = getSite().getPage().getEditorReferences();
				for (IEditorReference editorReference : editorReferences) {
					IEditorPart anEditor = editorReference.getEditor(false);
					if (anEditor instanceof EcoreBrowser) {
						EcoreBrowser browser = (EcoreBrowser) anEditor;
						if (browser.getResourceSet() == resourceSet) {
							browser.browseTo(element);
							browser.getSite().getPage().activate(browser);
							return;
						}
					}
				}
			}

			// if that failed (the editor is now closed maybe), then open a new
			// model browser and select the element
			final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage();
			try {
				final URI elementURI = EcoreUtil.getURI(element);
				URI resourceURI = elementURI.trimFragment();
				final IEditorInput editorInput;
				if (resourceURI.isPlatformResource()) {
					String platformString = resourceURI.toPlatformString(true);
					IResource res = ResourcesPlugin.getWorkspace().getRoot()
							.findMember(platformString);
					if (res instanceof IFile) {
						IFile file = (IFile) res;
						editorInput = new FileEditorInput(file);
					} else {
						MoDiscoBrowserPlugin.logError("Cannot open model: " + resourceURI); //$NON-NLS-1$
						return;
					}
				} else if (EPackage.Registry.INSTANCE.containsKey(resourceURI.toString())) {
					editorInput = new URIEditorInput(resourceURI);
				} else {
					// open a model browser on a new resource containing the
					// element
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource tempResource = resourceSet.createResource(URI
							.createURI("http://modisco/browser/table/temp")); //$NON-NLS-1$
					tempResource.getContents().add(element);
					editorInput = new ResourceEditorInput(tempResource);
				}

				IEditorPart newEditor = IDE.openEditor(activePage, editorInput,
						EcoreBrowser.EDITOR_ID, true);
				if (newEditor instanceof EcoreBrowser) {
					EcoreBrowser browser = (EcoreBrowser) newEditor;
					String uriFragment = element.eResource().getURIFragment(element);
					browser.browseToByURI(uriFragment);
				}
			} catch (final PartInitException e) {
				MoDiscoBrowserPlugin.logException(e);
			}
		}
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
		// nothing
	}

	@Override
	public void doSaveAs() {
		// nothing
	}

	/** Hide columns which don't contain any elements */
	public void setHideEmptyColumns(final boolean hideEmptyColumns) {
		try {
			this.tableViewer.getControl().setRedraw(false);
			for (final ColumnDescription columnDescription : this.columnsConfiguration) {
				boolean bEmpty = false;
				if (columnDescription.getType() == Type.ATTRIBUTE) {
					bEmpty = isEmpty(columnDescription.getAttribute());
				} else if (columnDescription.getType() == Type.REFERENCE) {
					bEmpty = isEmpty(columnDescription.getReference());
				}

				final TableColumn column = findColumn(columnDescription);
				if (hideEmptyColumns && bEmpty) {
					if (column != null) {
						// indicates that the column is hidden because it is
						// empty
						column.setData(TableEditor.KEY_EMPTY_HIDDEN, Boolean.TRUE);
						hideColumn(column);
					}
				} else if (!hideEmptyColumns
						&& Boolean.TRUE == column.getData(TableEditor.KEY_EMPTY_HIDDEN)) {
					column.setData(TableEditor.KEY_EMPTY_HIDDEN, Boolean.FALSE);
					showEmptyColumn(column);
				}
			}
		} finally {
			this.tableViewer.getControl().setRedraw(true);
		}
	}

	/**
	 * Sort columns by type of link (attributes first, then references, then
	 * derived references, ...)
	 */
	public void setSortColumnsByType(final boolean bSort) {
		try {
			this.tableViewer.getControl().setRedraw(false);
			TableColumn[] columns = this.tableViewer.getTable().getColumns();
			int[] order = new int[columns.length];
			if (bSort) {
				int i = 0;
				for (int j = 0; j < this.columnsConfiguration.size(); j++) {
					ColumnDescription columnDescription = this.columnsConfiguration.get(j);
					if (columnDescription.getType() == Type.CONTEXT
							|| columnDescription.getType() == Type.DEFAULT_LABEL
							|| columnDescription.getType() == Type.ECONTAINER
							|| columnDescription.getType() == Type.METACLASS_NAME) {
						order[i++] = j;
					}
				}

				for (int j = 0; j < this.columnsConfiguration.size(); j++) {
					ColumnDescription columnDescription = this.columnsConfiguration.get(j);
					if (columnDescription.getType() == Type.ATTRIBUTE) {
						order[i++] = j;
					}
				}

				final class Link {
					private final int index;
					private final EReference reference;

					private Link(final int index, final EReference reference) {
						this.index = index;
						this.reference = reference;
					}
				}

				List<Link> links = new ArrayList<Link>();
				for (int j = 0; j < this.columnsConfiguration.size(); j++) {
					ColumnDescription columnDescription = this.columnsConfiguration.get(j);
					if (columnDescription.getType() == Type.REFERENCE) {
						links.add(new Link(j, columnDescription.getReference()));
					}
				}

				Collections.sort(links, new Comparator<Link>() {
					public int compare(final Link o1, final Link o2) {
						final int r1 = ModelElementItem.getReferenceRank(o1.reference);
						final int r2 = ModelElementItem.getReferenceRank(o2.reference);
						return r1 - r2;
					}
				});

				for (Link link : links) {
					order[i++] = link.index;
				}

			} else {
				for (int i = 0; i < columns.length; i++) {
					order[i] = i;
				}
			}
			this.tableViewer.getTable().setColumnOrder(order);

		} catch (Exception e) {
			MoDiscoLogger.logError(e, "Error sorting columns by type", //$NON-NLS-1$
					MoDiscoBrowserPlugin.getPlugin());
		} finally {
			this.tableViewer.getControl().setRedraw(true);
		}
	}

	/**
	 * Whether to show columns which are specific to a few elements (false), or
	 * only columns which are common to all the elements (true)
	 */
	public void setOnlyShowCommonColumns(final boolean onlyShowCommonColumns) {
		try {
			this.tableViewer.getControl().setRedraw(false);
			final EClass[] metaclasses = this.tableEditorInput.getMetaclasses();

			for (final ColumnDescription columnDescription : this.columnsConfiguration) {
				boolean common = true;
				if (columnDescription.getType() == Type.ATTRIBUTE) {
					common = isCommon(columnDescription.getAttribute(), metaclasses);
				} else if (columnDescription.getType() == Type.REFERENCE) {
					common = isCommon(columnDescription.getReference(), metaclasses);
				}

				final TableColumn column = findColumn(columnDescription);
				if (onlyShowCommonColumns && !common) {
					if (column != null) {
						// indicates that the column is hidden because its
						// feature
						// is not common to all the elements
						column.setData(TableEditor.KEY_NOT_COMMON_HIDDEN, Boolean.TRUE);
						hideColumn(column);
					}
				} else if (!onlyShowCommonColumns
						&& Boolean.TRUE == column.getData(TableEditor.KEY_NOT_COMMON_HIDDEN)) {
					column.setData(TableEditor.KEY_NOT_COMMON_HIDDEN, Boolean.FALSE);
					showEmptyColumn(column);
				}
			}
		} finally {
			this.tableViewer.getControl().setRedraw(true);
		}
	}

	/** Hide the given table column */
	private void hideColumn(final TableColumn column) {
		column.setWidth(0);
		column.setResizable(false);
	}

	/** Show the given column after checking that it shouldn't be hidden anymore */
	private void showEmptyColumn(final TableColumn column) {
		if (Boolean.TRUE != column.getData(TableEditor.KEY_EMPTY_HIDDEN)
				&& Boolean.TRUE != column.getData(TableEditor.KEY_NOT_COMMON_HIDDEN)) {
			column.pack();
			column.setResizable(true);
		}
	}

	/** @return whether the given feature is common to all the given metaclasses */
	private boolean isCommon(final EStructuralFeature feature, final EClass[] metaclasses) {
		for (final EClass metaclass : metaclasses) {
			if (!metaclass.getEAllStructuralFeatures().contains(feature)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Find the column with the given {@link ColumnDescription}
	 *
	 * @return the column
	 */
	private TableColumn findColumn(final ColumnDescription columnDescription) {
		final TableColumn[] columns = this.tableViewer.getTable().getColumns();
		for (final TableColumn tableColumn : columns) {
			if (tableColumn.getData() == columnDescription) {
				return tableColumn;
			}
		}
		return null;
	}

	/**
	 * Get a descriptive label that will be shown when a table editor is opened
	 * on the given reference
	 */
	public static String getEditorDescriptionFor(final EObject parent, final EReference reference,
			final BrowserConfiguration browserConfiguration) {

		final String parentLabel = new ModelElementItemEx(parent, null, browserConfiguration)
				.getText();
		return NLS.bind(Messages.TableEditor_contentsDescription, parentLabel, reference.getName());
	}

	private static Object getStructuralFeatureValue(final EObject eObject,
			final EStructuralFeature structuralFeature, final FacetContext facetContext) {
		if (structuralFeature instanceof FacetStructuralFeature) {
			try {
				return facetContext.get(eObject, structuralFeature);
			} catch (Exception e) {
				MoDiscoBrowserPlugin.logException(e);
				return null;
			}
		}
		return eObject.eGet(structuralFeature);
	}

	private static boolean hasStructuralFeature(final EObject eObject,
			final EStructuralFeature structuralFeature, final FacetContext facetContext) {
		final EClass eClass = eObject.eClass();
		if (facetContext.getFacetFeatures(eObject).contains(structuralFeature)) {
			return true;
		}
		return eClass.getEAllStructuralFeatures().contains(structuralFeature);
	}

	public void addSelectionChangedListener(final ISelectionChangedListener listener) {
		if (!this.selectionChangedListeners.contains(listener)) {
			this.selectionChangedListeners.add(listener);
		}
	}

	public ISelection getSelection() {
		ViewerCell focusCell = this.tableViewerFocusCellManager.getFocusCell();
		if (focusCell == null) {
			return new StructuredSelection();
		}
		int columnIndex = focusCell.getColumnIndex();
		EObject eObject = findElementToOpenInModelBrowser(columnIndex);
		if (eObject == null) {
			return new StructuredSelection();
		}
		return new StructuredSelection(eObject);
	}

	private FacetContext getFacetContext() {
		return this.tableEditorInput.getBrowserConfiguration().getAppearanceConfiguration()
				.getFacetContext();
	}

	public void removeSelectionChangedListener(final ISelectionChangedListener listener) {
		this.selectionChangedListeners.remove(listener);
	}

	public void setSelection(final ISelection selection) {
		this.tableViewer.setSelection(selection);
	}

	/**
	 * Create a context menu for the viewer, add a listener, and register the
	 * menu for extension.
	 */
	protected void createContextMenuFor(final StructuredViewer viewer) {
		final MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		final Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, this);
	}

	public void menuAboutToShow(final IMenuManager menuManager) {
		int columnIndex = this.tableViewerFocusCellManager.getFocusCell().getColumnIndex();
		final ColumnDescription columnDescription = TableEditor.this.columnsConfiguration
				.get(columnIndex);

		EObject element = null;
		final TableElement mainElement = getSelectedElement();

		final EObject mainModelElement;
		if (columnDescription.getType() == Type.CONTEXT) {
			mainModelElement = ((TableElementWithContext) mainElement).getContext();
		} else {
			if (mainElement != null && mainElement.getElement() instanceof EObject) {
				mainModelElement = (EObject) mainElement.getElement();
			} else {
				return;
			}
		}

		if (columnDescription.getType() == Type.REFERENCE) {
			boolean oneElement = true;
			if (columnDescription.getReference().isMany()) {
				// test whether the many-valued list has only 1 element
				@SuppressWarnings("unchecked")
				final EList<EObject> list = (EList<EObject>) getStructuralFeatureValue(
						mainModelElement, columnDescription.getReference(), getFacetContext());
				oneElement = list.size() == 1;
			}

			if (oneElement) {
				element = findElementToOpenInModelBrowser(columnIndex);
				if (element != null) {
					createBrowseMenuItemFor(element, menuManager);
				}
			} else {
				createViewInTableMenuItemFor(mainModelElement, columnDescription.getReference(),
						menuManager);
			}
		} else if (columnDescription.getType() == Type.ECONTAINER) {
			element = mainModelElement.eContainer();
			if (element != null) {
				createBrowseMenuItemFor(element, menuManager);
			}
		}

		if (element != mainModelElement) {
			createBrowseMenuItemFor(mainModelElement, menuManager);
		}
	}

	private void createBrowseMenuItemFor(final EObject element, final IMenuManager menuManager) {
		if (element == null) {
			return;
		}

		final String text = TableEditor.this.tableEditorLabelProvider.getTextFor(element);
		menuManager.add(new Action(NLS.bind(Messages.TableEditor_browse,
				StringUtils.truncateBeforeNewline(text))) {
			@Override
			public void run() {
				openElementInModelBrowser(element);
			}
		});
	}

	private void createViewInTableMenuItemFor(final EObject parentElement,
			final EReference reference, final IMenuManager menuManager) {
		@SuppressWarnings("unchecked")
		final EList<EObject> elements = (EList<EObject>) getStructuralFeatureValue(parentElement,
				reference, getFacetContext());

		menuManager.add(new Action(Messages.openTableEditorOnSelection) {
			@Override
			public boolean isEnabled() {
				return elements.size() > 0;
			}

			@Override
			public void run() {
				final BrowserConfiguration browserConfiguration = TableEditor.this.tableEditorInput
						.getBrowserConfiguration();
				final String description = getEditorDescriptionFor(parentElement, reference,
						browserConfiguration);
				getFactory().openOn(TableEditor.this.tableEditorInput.getBrowserConfiguration(),
						elements, description);
			}

		});
	}

	/** Override to open with a subclassed factory */
	protected TableEditorFactory getFactory() {
		return TableEditorFactory.getInstance();
	}

	protected CustomizationEngine getCustomizationEngine() {
		return this.tableEditorInput.getBrowserConfiguration().getAppearanceConfiguration()
				.getCustomizationEngine();
	}

	public void loadCustomizations(final List<MetamodelView> customizationsToLoad) {
		final CustomizationEngine customizationEngine = getCustomizationEngine();
		customizationEngine.clear();
		for (final MetamodelView customizationToLoad : customizationsToLoad) {
			customizationEngine.registerCustomization(customizationToLoad);
		}
		customizationEngine.loadCustomizations();
	}

	private void loadDefaultCustomizations() {
		if (getCustomizationEngine().getRegisteredCustomizations().isEmpty()) {
			loadCustomizations(CustomizationsCatalog.getInstance()
					.getRegistryDefaultCustomizations());
		}
	}
}
