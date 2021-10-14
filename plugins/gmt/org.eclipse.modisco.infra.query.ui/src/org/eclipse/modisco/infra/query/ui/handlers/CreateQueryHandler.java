/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.modisco.infra.common.ui.internal.util.WorkbenchUtils;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.editor.presentation.QueryEditor;
import org.eclipse.modisco.infra.query.ui.wizards.CreateQueryWizard;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class CreateQueryHandler extends AbstractHandler {

	public CreateQueryHandler() {
		// nothing
	}

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object selected = structuredSelection.getFirstElement();
			ModelQuerySet modelQuerySet = null;
			EClass eClass = null;
			if (selected instanceof ModelQuerySet) {
				modelQuerySet = (ModelQuerySet) selected;
			} else if (selected instanceof EClass) {
				eClass = (EClass) selected;
			} else if (selected instanceof EObject) {
				EObject eObject = (EObject) selected;
				eClass = eObject.eClass();
			}

			Resource resourceToEdit = null;
			EditingDomain editingDomain = null;
			// if using the action on an open query set editor, edit the
			// editor's resource instead of modifying the underlying file
			if (modelQuerySet != null) {
				IWorkbenchPart activePart = WorkbenchUtils.getActivePart();
				if (activePart instanceof QueryEditor) {
					QueryEditor queryEditor = (QueryEditor) activePart;
					ResourceSet resourceSet = queryEditor.getEditingDomain().getResourceSet();
					if (resourceSet.getResources().contains(modelQuerySet.eResource())) {
						resourceToEdit = modelQuerySet.eResource();
						editingDomain = queryEditor.getEditingDomain();
					}
				}
			}

			CreateQueryWizard createQueryWizard = new CreateQueryWizard(modelQuerySet, eClass,
					resourceToEdit, editingDomain);
			WizardDialog wizardDialog = new WizardDialog(null, createQueryWizard);
			wizardDialog.open();
		}
		return null;
	}
}
