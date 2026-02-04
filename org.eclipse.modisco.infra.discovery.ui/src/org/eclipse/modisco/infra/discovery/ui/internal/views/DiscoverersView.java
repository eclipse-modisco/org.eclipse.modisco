/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.views;

import java.util.Collection;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.facet.common.ui.internal.controls.PersistableColumn;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

/** An Eclipse view that displays a list of available discoverers. */
public class DiscoverersView extends ViewPart {

	private TableViewer discoverersViewer;
	private TableViewer parametersViewer;
	private Composite parentComposite;
	private Composite mainComposite;

	private static final String NAME_COLUMN = "DiscoverersView_NameColumn"; //$NON-NLS-1$
	private static final String TYPE_COLUMN = "DiscoverersView_DescriptionColumn"; //$NON-NLS-1$
	private static final String INPUT_TYPE_COLUMN = "DiscoverersView_InputTypeColumn"; //$NON-NLS-1$
	private static final String DECLARING_BUNDLE_COLUMN = "DiscoverersView_DeclaringBundleColumn"; //$NON-NLS-1$
	private static final String PARAM_NAME_COLUMN = "DiscoverersView_ParamName"; //$NON-NLS-1$
	private static final String PARAM_TYPE_COLUMN = "DiscoverersView_ParamType"; //$NON-NLS-1$
	private static final String PARAM_DIRECTION_COLUMN = "DiscoverersView_ParamDirection"; //$NON-NLS-1$
	private static final String PARAM_REQUIRED_COLUMN = "DiscoverersView_ParamRequired"; //$NON-NLS-1$
	private static final String PARAM_DESCRIPTION_COLUMN = "DiscoverersView_ParamDescription"; //$NON-NLS-1$
	private static final int NAME_COLUMN_WIDTH = 200;
	private static final int TYPE_COLUMN_WIDTH = 150;
	private static final int DECLARING_BUNDLE_COLUMN_WIDTH = 400;
	private static final int INPUT_TYPE_COLUMN_WIDTH = 150;
	private static final int PARAM_NAME_COLUMN_WIDTH = 160;
	private static final int PARAM_TYPE_COLUMN_WIDTH = 100;
	private static final int PARAM_DIRECTION_COLUMN_WIDTH = 60;
	private static final int PARAM_REQUIRED_COLUMN_WIDTH = 60;
	private static final int PARAM_DESCRIPTION_COLUMN_WIDTH = 400;

	private static final String SASH_POSITION1 = "sashPosition1"; //$NON-NLS-1$
	private static final String SASH_POSITION2 = "sashPosition2"; //$NON-NLS-1$
	private static final String LAYOUT_ORIENTATION = "orientation"; //$NON-NLS-1$

	private enum LayoutStyle {
		Horizontal, Vertical
	}

	/** static because we want to save it before closing Eclipse */
	private static LayoutStyle layoutStyle = DiscoverersView.LayoutStyle.Vertical;
	private PersistableColumn nameColumn;
	private PersistableColumn implClassColumn;
	private PersistableColumn paramNameColumn;
	private PersistableColumn paramTypeColumn;
	private PersistableColumn paramDirectionColumn;
	private PersistableColumn paramRequiredColumn;
	private PersistableColumn paramDescColumn;
	private PersistableColumn inputTypeColumn;
	private PersistableColumn declaringBundleColumn;
	private SashForm sashForm;
	private static Integer sashPosition1;
	private static Integer sashPosition2;

	protected static LayoutStyle getLayoutStyle() {
		return DiscoverersView.layoutStyle;
	}

	protected void changeLayoutStyle(final LayoutStyle newLayoutStyle) {
		if (newLayoutStyle == DiscoverersView.layoutStyle) {
			return;
		}
		DiscoverersView.layoutStyle = newLayoutStyle;
		createMainComposite();
	}

	@Override
	public void createPartControl(final Composite parent) {
		this.parentComposite = parent;
		parent.setLayout(gridLayoutWithNoMargins());
		createMainComposite();
		// automatic layout:
		// parent.addControlListener(new ControlAdapter() {
		// @Override
		// public void controlResized(final ControlEvent e) {
		// Point size = parent.getSize();
		// if (size.x > size.y) {
		// changeLayoutStyle(LayoutStyle.Horizontal);
		// } else {
		// changeLayoutStyle(LayoutStyle.Vertical);
		// }
		// }
		// });
	}

	private void createMainComposite() {
		if (this.mainComposite != null) {
			this.mainComposite.dispose();
		}
		this.mainComposite = new Composite(this.parentComposite, SWT.NONE);
		this.mainComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.mainComposite.setLayout(gridLayoutWithNoMargins());

		final int direction;
		if (DiscoverersView.layoutStyle == DiscoverersView.LayoutStyle.Horizontal) {
			direction = SWT.HORIZONTAL;
		} else {
			direction = SWT.VERTICAL;
		}

		this.sashForm = new SashForm(this.mainComposite, SWT.SMOOTH | direction);
		this.sashForm.setLayout(new FillLayout());
		this.sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Control discoverersGroup = createDiscoverersGroup(this.sashForm);
		createParametersGroup(this.sashForm);

		discoverersGroup.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(final ControlEvent e) {
				DiscoverersView.sashPosition1 = new Integer(DiscoverersView.this.sashForm
						.getWeights()[0]);
				DiscoverersView.sashPosition2 = new Integer(DiscoverersView.this.sashForm
						.getWeights()[1]);
			}
		});

		if (DiscoverersView.sashPosition1 != null && DiscoverersView.sashPosition2 != null) {
			this.sashForm.setWeights(new int[] { DiscoverersView.sashPosition1.intValue(),
					DiscoverersView.sashPosition2.intValue() });
		}
		this.parentComposite.layout();
	}

	private Group createDiscoverersGroup(final Composite parent) {
		Group contextGroup = new Group(parent, SWT.NONE);
		contextGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		contextGroup.setText(Messages.DiscoverersView_title);
		GridLayout groupLayout = new GridLayout();
		contextGroup.setLayout(groupLayout);
		createDiscoverersViewer(contextGroup);
		return contextGroup;
	}

	private void createDiscoverersViewer(final Group contextGroup) {
		this.discoverersViewer = new TableViewer(contextGroup, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION);
		this.discoverersViewer.getTable().setLinesVisible(true);
		this.discoverersViewer.getTable().setHeaderVisible(true);
		this.discoverersViewer.getTable().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		this.discoverersViewer.setContentProvider(getDiscoverersContentProvider());
		createDiscovererNameColumn(this.discoverersViewer);
		createDiscovererInputTypeColumn(this.discoverersViewer);
		createDiscovererImplClassColumn(this.discoverersViewer);
		createDiscovererDeclaringBundleColumn(this.discoverersViewer);
		this.discoverersViewer.setInput(getDiscoverersInput());

		this.discoverersViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				discovererSelectionChanged();
			}
		});
	}

	private void discovererSelectionChanged() {
		IStructuredSelection selection = (IStructuredSelection) this.discoverersViewer
				.getSelection();
		Object firstElement = selection.getFirstElement();
		if (firstElement instanceof DiscovererDescription) {
			DiscovererDescription discovererDescription = (DiscovererDescription) firstElement;
			this.parametersViewer.setInput(discovererDescription);
		}
	}

	private void createParametersGroup(final Composite parent) {
		Group contextGroup = new Group(parent, SWT.NONE);
		contextGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		contextGroup.setText(Messages.DiscoverersView_params);
		GridLayout groupLayout = new GridLayout();
		contextGroup.setLayout(groupLayout);
		createParametersViewer(contextGroup);
	}

	private void createParametersViewer(final Group contextGroup) {
		this.parametersViewer = new TableViewer(contextGroup, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION);
		this.parametersViewer.getTable().setLinesVisible(true);
		this.parametersViewer.getTable().setHeaderVisible(true);
		this.parametersViewer.getTable()
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		this.parametersViewer.setContentProvider(getParametersContentProvider());
		createParameterNameColumn(this.parametersViewer);
		createParameterTypeColumn(this.parametersViewer);
		createParameterDirectionColumn(this.parametersViewer);
		createParameterRequiredColumn(this.parametersViewer);
		createParameterDescriptionColumn(this.parametersViewer);
	}

	private static IContentProvider getParametersContentProvider() {
		return new IStructuredContentProvider() {
			public Object[] getElements(final Object inputElement) {
				DiscovererDescription discovererDescription = (DiscovererDescription) inputElement;
				List<DiscovererParameter> parameterDefinitions = discovererDescription
						.getParameterDefinitions();
				return parameterDefinitions.toArray();
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// nothing
			}

			public void dispose() {
				// nothing
			}
		};
	}

	private static GridLayout gridLayoutWithNoMargins() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		return gridLayout;
	}

	@Override
	public void setFocus() {
		//
	}

	private void createDiscovererNameColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			private Image discovererImage;

			@Override
			public String getText(final Object element) {
				DiscovererDescription discovererDescription = (DiscovererDescription) element;
				return discovererDescription.getId();
			}

			@Override
			public Image getImage(final Object element) {
				if (this.discovererImage == null) {
					this.discovererImage = Activator
							.getImageDescriptor("icons/discoverer16x16.png").createImage(); //$NON-NLS-1$
				}
				return this.discovererImage;
			}

			@Override
			public void dispose() {
				super.dispose();
				if (this.discovererImage != null) {
					this.discovererImage.dispose();
				}
			}
		};
		this.nameColumn = new PersistableColumn(Messages.DiscoverersView_name,
				DiscoverersView.NAME_COLUMN, DiscoverersView.NAME_COLUMN_WIDTH,
				columnLabelProvider, viewer);
	}

	private void createDiscovererImplClassColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererDescription discovererDescription = (DiscovererDescription) element;
				return discovererDescription.getImplementationType().getName();
			}
		};
		this.implClassColumn = new PersistableColumn(Messages.DiscoverersView_implClass,
				DiscoverersView.TYPE_COLUMN, DiscoverersView.TYPE_COLUMN_WIDTH,
				columnLabelProvider, viewer);
	}

	private void createDiscovererDeclaringBundleColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererDescription discovererDescription = (DiscovererDescription) element;
				return discovererDescription.getImplementationBundle().getSymbolicName();
			}
		};
		this.declaringBundleColumn = new PersistableColumn(
				Messages.DiscoverersView_declaringBundle, DiscoverersView.DECLARING_BUNDLE_COLUMN,
				DiscoverersView.DECLARING_BUNDLE_COLUMN_WIDTH, columnLabelProvider, viewer);

	}

	private void createDiscovererInputTypeColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererDescription discovererDescription = (DiscovererDescription) element;
				return discovererDescription.getSourceType().getName();
			}
		};
		this.inputTypeColumn = new PersistableColumn(Messages.DiscoverersView_inputType,
				DiscoverersView.INPUT_TYPE_COLUMN, DiscoverersView.INPUT_TYPE_COLUMN_WIDTH,
				columnLabelProvider, viewer);

	}

	private void createParameterNameColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererParameter discoveryParameter = (DiscovererParameter) element;
				return discoveryParameter.getId();
			}
		};
		this.paramNameColumn = new PersistableColumn(Messages.DiscoverersView_name,
				DiscoverersView.PARAM_NAME_COLUMN, DiscoverersView.PARAM_NAME_COLUMN_WIDTH,
				columnLabelProvider, viewer);
	}

	private void createParameterTypeColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererParameter discoveryParameter = (DiscovererParameter) element;
				return discoveryParameter.getType().getSimpleName();
			}
		};
		this.paramTypeColumn = new PersistableColumn(Messages.DiscoverersView_type,
				DiscoverersView.PARAM_TYPE_COLUMN, DiscoverersView.PARAM_TYPE_COLUMN_WIDTH,
				columnLabelProvider, viewer);
	}

	private void createParameterDirectionColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererParameter discoveryParameter = (DiscovererParameter) element;
				return discoveryParameter.getDirection().toString();
			}
		};
		this.paramDirectionColumn = new PersistableColumn(Messages.DiscoverersView_direction,
				DiscoverersView.PARAM_DIRECTION_COLUMN,
				DiscoverersView.PARAM_DIRECTION_COLUMN_WIDTH, columnLabelProvider, viewer);
	}

	private void createParameterRequiredColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererParameter discoveryParameter = (DiscovererParameter) element;
				return Boolean.toString(discoveryParameter.isRequiredInput());
			}
		};
		this.paramRequiredColumn = new PersistableColumn(Messages.DiscoverersView_required,
				DiscoverersView.PARAM_REQUIRED_COLUMN, DiscoverersView.PARAM_REQUIRED_COLUMN_WIDTH,
				columnLabelProvider, viewer);
	}

	private void createParameterDescriptionColumn(final TableViewer viewer) {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				DiscovererParameter discoveryParameter = (DiscovererParameter) element;
				return discoveryParameter.getDescription();
			}
		};
		this.paramDescColumn = new PersistableColumn(Messages.DiscoverersView_description,
				DiscoverersView.PARAM_DESCRIPTION_COLUMN,
				DiscoverersView.PARAM_DESCRIPTION_COLUMN_WIDTH, columnLabelProvider, viewer);
	}

	protected static IContentProvider getDiscoverersContentProvider() {
		return new IStructuredContentProvider() {
			public Object[] getElements(final Object inputElement) {
				@SuppressWarnings("unchecked")
				Collection<DiscovererDescription> discovererDescription = (Collection<DiscovererDescription>) inputElement;
				return discovererDescription.toArray();
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// nothing
			}

			public void dispose() {
				// nothing
			}
		};
	}

	protected static Object getDiscoverersInput() {
		return IDiscoveryManager.INSTANCE.getDiscoverers();
	}

	private final Action horizontalLayoutAction = new Action(Messages.DiscoverersView_horizontal,
			IAction.AS_RADIO_BUTTON) {
		@Override
		public ImageDescriptor getImageDescriptor() {
			return Activator.getImageDescriptor("icons/th_horizontal.gif"); //$NON-NLS-1$
		}

		@Override
		public void run() {
			changeLayoutStyle(DiscoverersView.LayoutStyle.Horizontal);
		}
	};
	private final Action verticalLayoutAction = new Action(Messages.DiscoverersView_vertical,
			IAction.AS_RADIO_BUTTON) {
		@Override
		public ImageDescriptor getImageDescriptor() {
			return Activator.getImageDescriptor("icons/th_vertical.gif"); //$NON-NLS-1$
		}

		@Override
		public void run() {
			changeLayoutStyle(DiscoverersView.LayoutStyle.Vertical);
		}
	};

	@Override
	public void init(final IViewSite site, final IMemento memento) throws PartInitException {
		super.init(site, memento);
		site.getActionBars().getToolBarManager().add(this.horizontalLayoutAction);
		site.getActionBars().getToolBarManager().add(this.verticalLayoutAction);

		if (memento != null) {
			PersistableColumn.loadState(memento, DiscoverersView.NAME_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.TYPE_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.INPUT_TYPE_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.DECLARING_BUNDLE_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.PARAM_NAME_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.PARAM_TYPE_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.PARAM_DIRECTION_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.PARAM_REQUIRED_COLUMN);
			PersistableColumn.loadState(memento, DiscoverersView.PARAM_DESCRIPTION_COLUMN);
			DiscoverersView.sashPosition1 = memento.getInteger(DiscoverersView.SASH_POSITION1);
			DiscoverersView.sashPosition2 = memento.getInteger(DiscoverersView.SASH_POSITION2);
			String layout = memento.getString(DiscoverersView.LAYOUT_ORIENTATION);
			if (layout != null) {
				DiscoverersView.layoutStyle = DiscoverersView.LayoutStyle.valueOf(layout);
			}
		}
		if (DiscoverersView.layoutStyle == DiscoverersView.LayoutStyle.Horizontal) {
			this.horizontalLayoutAction.setChecked(true);
		} else {
			this.verticalLayoutAction.setChecked(true);
		}

	}

	@Override
	public void saveState(final IMemento memento) {
		super.saveState(memento);
		this.nameColumn.saveState(memento);
		this.implClassColumn.saveState(memento);
		this.inputTypeColumn.saveState(memento);
		this.declaringBundleColumn.saveState(memento);
		this.paramNameColumn.saveState(memento);
		this.paramTypeColumn.saveState(memento);
		this.paramDirectionColumn.saveState(memento);
		this.paramRequiredColumn.saveState(memento);
		this.paramDescColumn.saveState(memento);
		memento.putInteger(DiscoverersView.SASH_POSITION1, this.sashForm.getWeights()[0]);
		memento.putInteger(DiscoverersView.SASH_POSITION2, this.sashForm.getWeights()[1]);
		memento.putString(DiscoverersView.LAYOUT_ORIENTATION, DiscoverersView.layoutStyle.name());
	}
}
