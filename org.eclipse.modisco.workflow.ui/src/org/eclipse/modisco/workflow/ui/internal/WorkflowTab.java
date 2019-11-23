/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.ui.internal;

import java.util.List;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.modisco.workflow.core.WorkflowModel;
import org.eclipse.modisco.workflow.core.WorkflowModelListener;
import org.eclipse.modisco.workflow.core.internal.defaultengine.WorkflowController;
import org.eclipse.modisco.workflow.core.internal.defaultengine.WorkflowControllerImpl;
import org.eclipse.modisco.workflow.core.internal.defaultengine.WorkflowModelImpl;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.modisco.workflow.ui.internal.wizard.WizardToSelectLaunchers;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;

public class WorkflowTab extends AbstractLaunchConfigurationTab implements WorkflowModelListener {

	private static final int HEIGHT = 200;
	private static final int WIDTH = 400;
	private TableViewer tableViewer;
	private WorkflowTableContextMenu popUp;
	private WorkflowModel workflowModel;
	private final WorkflowController workflowController;
	private boolean isValid;

	public WorkflowTab() {
		initWorkflowModel();
		this.workflowController = new WorkflowControllerImpl();
	}

	final WorkflowModel getWorkflowModel() {
		return this.workflowModel;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	public void createControl(final Composite parent) {
		Composite rootContainer = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		rootContainer.setLayout(layout);
		final int nColumns = 3;
		layout.numColumns = nColumns;
		final int verticalSpacing = 9;
		layout.verticalSpacing = verticalSpacing;

		Label labelWFTransfo = new Label(rootContainer, SWT.NULL);
		labelWFTransfo.setText(Messages.WorkflowTab_basicLabel);
		GridData gdLabel = new GridData();
		gdLabel.horizontalSpan = nColumns;
		labelWFTransfo.setLayoutData(gdLabel);
		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		this.tableViewer = new TableViewer(rootContainer, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		this.tableViewer.setContentProvider(getContentProvider());
		this.tableViewer.setLabelProvider(getLabelProvider());
		Table table = this.tableViewer.getTable();
		table.setLayoutData(gridData);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(final MouseEvent evt) {
				final int rightButton = 3;
				if (evt.button == rightButton) {
					setupContextMenu(evt);
				}
			}
		});
		table.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					removeWork();
				}
			}
		});
		// add panel of buttons to manage the table
		@SuppressWarnings("unused")
		AdditionalButtonsComposite buttonsComposite = new AdditionalButtonsComposite(rootContainer,
				SWT.NONE, this);
		setControl(rootContainer);
	}

	private static IContentProvider getContentProvider() {
		return new IStructuredContentProvider() {
			public Object[] getElements(final Object inputElement) {
				if (inputElement instanceof List<?>) {
					List<?> elements = (List<?>) inputElement;
					return elements.toArray();
				}
				return null;
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				//
			}

			public void dispose() {
				//
			}
		};
	}

	private static IBaseLabelProvider getLabelProvider() {
		return new LabelProvider() {
			@Override
			public String getText(final Object object) {
				if (object instanceof Element) {
					Element element = (Element) object;
					return element.getName();
				}
				return null;
			}

			@Override
			public Image getImage(final Object object) {
				if (object instanceof Element) {
					Element element = (Element) object;
					return DebugUITools.getImage(element.getType());
				}
				return null;
			}
		};
	}

	public TableViewer getTableViewer() {
		return this.tableViewer;
	}

	public Table getTable() {
		return this.tableViewer.getTable();
	}

	protected final void setupContextMenu(final MouseEvent evt) {
		Point p = new Point(evt.x, evt.y);
		TableItem item = getTable().getItem(p);
		if (item == null) {
			getPopUp().createPopupMenuNoSelectionItem(getShell());
			getTable().setMenu(getPopUp().getMenuNoSelection());
		} else {
			getPopUp().createPopupMenuSelectionItem(getShell());
			getTable().setMenu(getPopUp().getMenuSelection());
		}
	}

	public WorkflowTableContextMenu getPopUp() {
		if (this.popUp == null) {
			this.popUp = new WorkflowTableContextMenu(this);
		}
		return this.popUp;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		// no defaults
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(final ILaunchConfiguration configuration) {
		initWorkflowModel();
		this.workflowModel.initialize(configuration);
		updateStatus();
		getTableViewer().setInput(this.workflowModel.getAllElements());
	}

	private final void initWorkflowModel() {
		if (this.workflowModel != null) {
			this.workflowModel.removeListener(this);
		}
		this.workflowModel = new WorkflowModelImpl();
		this.workflowModel.addListener(this);
	}

	private final void updateStatus() {
		setMessage(Messages.WorkflowTab_basicLabel);
		this.isValid = true;
		String errorMessage = this.workflowController.validate(this.workflowModel);
		if (errorMessage != null) {
			this.isValid = false;
		}
		setErrorMessage(errorMessage);
		updateLaunchConfigurationDialog();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse
	 * .debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		this.workflowModel.save(configuration);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return Messages.WorkflowTab_name;
	}

	public void elementAdded(final Element element) {
		refreshTable();
		updateStatus();
	}

	/**
	 * Allows to refresh the table selection
	 */
	private final void refreshTable() {
		getTableViewer().refresh();
	}

	public void elementInserted(final int index, final Element element) {
		getTable().select(index);
		refreshTable();
		updateStatus();
	}

	public void elementRemoved(final int index) {
		refreshTable();
		updateStatus();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		return Activator.getImageDescriptor(UIConstants.WORKFLOW_ICON_PATH).createImage();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		return this.isValid;
	}

	/**
	 * Load a work in the workflow
	 */
	public void loadAdditionalWork() {
		// Image oldImage = Window.getDefaultImage();
		WizardToSelectLaunchers wizard = new WizardToSelectLaunchers(this.workflowModel);
		// Create the wizard dialog
		WizardDialog dialog = new WizardDialog(PlatformUI.createDisplay().getActiveShell(), wizard);
		// Open the wizard dialog
		dialog.setPageSize(WorkflowTab.WIDTH, WorkflowTab.HEIGHT);
		// Window.setDefaultImage(Activator.getImageDescriptor(Constants.pathLittleImage)
		// .createImage());
		dialog.open();
		// restore default icon
		// Window.setDefaultImage(oldImage);
	}

	/**
	 * Remove the selected work from the workflow
	 */
	public void removeWork() {
		int index = getTable().getSelectionIndex();
		if (index != -1) {
			this.workflowModel.removeElement(index);
		}
	}

	/**
	 * Up the selected work in the workflow
	 */
	public void moveWorkUp() {
		int index = getTable().getSelectionIndex();
		if (index > 0) {
			this.workflowModel.moveElementUp(index);
		}
	}

	/**
	 * Down the selected work in the workflow
	 */
	public void moveWorkDown() {
		int index = getTable().getSelectionIndex();
		if (index >= 0 && index < getTable().getItemCount() - 1) {
			this.workflowModel.moveElementDown(index);
		}
	}
}
