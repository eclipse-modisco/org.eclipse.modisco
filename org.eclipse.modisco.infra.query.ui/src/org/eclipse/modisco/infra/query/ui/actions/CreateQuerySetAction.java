/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.modisco.infra.query.editor.presentation.QueryModelWizard;
import org.eclipse.modisco.infra.query.ui.Messages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class CreateQuerySetAction extends Action {

	public CreateQuerySetAction() {
		// nothing
		setText(Messages.CreateQuerySetAction_createQuerySet);
	}

	@Override
	public void run() {
		QueryModelWizard createQuerySetWizard = new QueryModelWizard();
		createQuerySetWizard.setOpenEditor(false);
		IWorkbench workbench = PlatformUI.getWorkbench();
		// ISelection selection =
		// workbench.getActiveWorkbenchWindow().getSelectionService().getSelection();
		createQuerySetWizard.init(workbench, new StructuredSelection());
		WizardDialog wizardDialog = new WizardDialog(null, createQuerySetWizard);
		wizardDialog.open();
	}
}
