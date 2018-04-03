/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.ui.internal.wizard;

import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.modisco.workflow.core.internal.defaultengine.WorkflowController;
import org.eclipse.modisco.workflow.core.internal.defaultengine.WorkflowControllerImpl;
import org.eclipse.modisco.workflow.ui.internal.Activator;
import org.eclipse.modisco.workflow.ui.internal.Messages;
import org.eclipse.modisco.workflow.ui.internal.UIConstants;
import org.eclipse.modisco.workflow.ui.internal.Utils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class LaunchersPage extends WizardPage {

	private static final int HEIGHT = 400;
	private static final int WIDTH = 450;
	private Table launchersTable;
	private final HashMap<TableItem, ILaunchConfiguration> launchConfigurationMap;
	private TableItem[] itemsSelected;
	private final WorkflowController workflowController;
	private final String rootConfigName;

	public TableItem[] getItemsSelected() {
		return this.itemsSelected;
	}

	public HashMap<TableItem, ILaunchConfiguration> getLaunchConfigurationMap() {
		return this.launchConfigurationMap;
	}

	protected LaunchersPage(final String rootConfigName) {
		super(Messages.LaunchersPage_launchersList);
		setImageDescriptor(Activator.getImageDescriptor(UIConstants.WORKFLOW_BANNER_ICON_PATH));
		setDescription(Messages.LaunchersPage_wizardDescription);
		this.workflowController = new WorkflowControllerImpl();
		this.rootConfigName = rootConfigName;
		this.itemsSelected = new TableItem[] {};
		this.launchConfigurationMap = new HashMap<TableItem, ILaunchConfiguration>();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 *      .Composite)
	 */
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		final int numColumns = 3;
		layout.numColumns = numColumns;
		final int verticalSpacing = 9;
		layout.verticalSpacing = verticalSpacing;

		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		this.launchersTable = new Table(container, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		this.launchersTable.setLayoutData(gridData);
		this.launchersTable.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				launcherSelected();
			}
		});
		this.launchersTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(final MouseEvent e) {
				LaunchersPage.this.getWizard().performFinish();
				LaunchersPage.this.getShell().close();
			}
		});
		setTitle(Messages.LaunchersPage_selectLaunchConfig);
		loadLauncher();
		initializeDialogUnits(container);
		setControl(container);
	}

	protected void launcherSelected() {
		this.itemsSelected = this.launchersTable.getSelection();
		setPageComplete(true);
	}

	/** Load all the launchers in the table */
	private final void loadLauncher() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		boolean recursionMessage = false;
		try {
			for (ILaunchConfiguration launch : manager.getLaunchConfigurations()) {
				if (this.workflowController.hasPotentialRecursion(this.rootConfigName, launch)) {
					recursionMessage = true;
				} else {
					TableItem item = new TableItem(this.launchersTable, SWT.NULL);
					item.setText(launch.getName());
					item.setImage(DebugUITools.getImage(launch.getType().getIdentifier()));
					this.launchConfigurationMap.put(item, launch);
				}
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		if (recursionMessage) {
			setMessage(Messages.LaunchersPage_messageExtended);
		} else {
			setMessage(Messages.LaunchersPage_message);
		}
		setPageComplete(false);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.dialogs.DialogPage#setVisible(boolean)
	 */
	@Override
	public void setVisible(final boolean visible) {
		if (visible) {
			getShell().setSize(LaunchersPage.WIDTH, LaunchersPage.HEIGHT);
			getShell().setLocation(Utils.centerShell(getShell()));
		}
		super.setVisible(visible);
	}
}
