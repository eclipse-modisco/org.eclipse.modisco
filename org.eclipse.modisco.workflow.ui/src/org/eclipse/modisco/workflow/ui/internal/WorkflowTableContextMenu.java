/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
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

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class WorkflowTableContextMenu {

	private Menu menuSelection;
	private Menu menuNoSelection;
	private final WorkflowTab workflowTab;

	public WorkflowTableContextMenu(final WorkflowTab workflowTab) {
		this.workflowTab = workflowTab;
	}

	/**
	 * Create a pop-up menu on item selected with right click
	 *
	 * @param shell
	 *            Shell of selection
	 */
	public void createPopupMenuSelectionItem(final Shell shell) {
		if (this.menuSelection == null) {
			this.menuSelection = new Menu(shell, SWT.POP_UP);

			MenuItem itemRemove = new MenuItem(this.menuSelection, SWT.PUSH);
			itemRemove.setText(Messages.ContextualMenuInWorkflowTable_Remove);
			itemRemove.setImage(Activator.getImageDescriptor(UIConstants.REMOVE_ICON_PATH)
					.createImage());
			itemRemove.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					WorkflowTableContextMenu.this.getButtonComposite().removeWork();
				}
			});
			MenuItem itemUp = new MenuItem(this.menuSelection, SWT.PUSH);
			itemUp.setText(Messages.ContextualMenuInWorkflowTable_Up);
			itemUp.setImage(Activator.getImageDescriptor(UIConstants.UP_ICON_PATH).createImage());
			itemUp.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					WorkflowTableContextMenu.this.getButtonComposite().moveWorkUp();
				}
			});
			MenuItem itemDown = new MenuItem(this.menuSelection, SWT.PUSH);
			itemDown.setText(Messages.ContextualMenuInWorkflowTable_Down);
			itemDown.setImage(Activator.getImageDescriptor(UIConstants.DOWN_ICON_PATH).createImage());
			itemDown.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					WorkflowTableContextMenu.this.getButtonComposite().moveWorkDown();
				}
			});
			itemRemove.setEnabled(true);
			itemUp.setEnabled(true);
			itemDown.setEnabled(true);

		}
	}

	/**
	 * Create a pop-up menu on right click on table selection (Not item
	 * selected)
	 *
	 * @param shell
	 */
	public void createPopupMenuNoSelectionItem(final Shell shell) {
		if (this.menuNoSelection == null) {
			this.menuNoSelection = new Menu(shell, SWT.POP_UP);
			MenuItem itemLoad = new MenuItem(this.menuNoSelection, SWT.PUSH);
			itemLoad.setText(Messages.ContextualMenuInWorkflowTable_Load);
			itemLoad.setImage(Activator.getImageDescriptor(UIConstants.LOAD_ICON_PATH).createImage());
			itemLoad.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					WorkflowTableContextMenu.this.getButtonComposite().loadAdditionalWork();
				}
			});
			itemLoad.setEnabled(true);

		}
	}

	// Getters
	public Menu getMenuSelection() {
		return this.menuSelection;
	}

	public Menu getMenuNoSelection() {
		return this.menuNoSelection;
	}

	public WorkflowTab getButtonComposite() {
		return this.workflowTab;
	}
}
