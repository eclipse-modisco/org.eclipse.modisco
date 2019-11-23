/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software)
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.util.WorkbenchUtils;
import org.eclipse.modisco.infra.query.JavaModelQuery;
import org.eclipse.modisco.infra.query.editor.presentation.QueryEditor;
import org.eclipse.modisco.infra.query.ui.Activator;
import org.eclipse.modisco.infra.query.ui.Messages;
import org.eclipse.modisco.infra.query.ui.exceptions.ClassAlreadyExistsException;
import org.eclipse.modisco.infra.query.ui.exceptions.ResourceURIExpectedException;
import org.eclipse.modisco.infra.query.ui.wizards.NewClassCreationWizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class CreateJavaQueryClassHandler extends AbstractHandler {

	public CreateJavaQueryClassHandler() {
		//
	}

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<JavaModelQuery> selectedQueries = new ArrayList<JavaModelQuery>();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof JavaModelQuery) {
					JavaModelQuery element = (JavaModelQuery) selectedElement;
					selectedQueries.add(element);
				}
			}
		}
		for (JavaModelQuery query : selectedQueries) {
			try {
				EditingDomain editingDomain = null;
				// if using the action on an open query set editor, edit the
				// editor's resource instead of modifying the underlying file
				IWorkbenchPart activePart = WorkbenchUtils.getActivePart();
				if (activePart instanceof QueryEditor) {
					QueryEditor queryEditor = (QueryEditor) activePart;
					ResourceSet resourceSet = queryEditor.getEditingDomain().getResourceSet();
					if (resourceSet.getResources().contains(query.eResource())) {
						editingDomain = queryEditor.getEditingDomain();
					}
				}

				NewClassCreationWizard wizard = new NewClassCreationWizard(query, editingDomain);
				IWorkbench workbench = Activator.getDefault().getWorkbench();
				IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
				Shell shell = window.getShell();
				WizardDialog dialog = new WizardDialog(shell, wizard);
				dialog.create();
				dialog.open();
			} catch (ResourceURIExpectedException e) {
				MessageDialog.openError(Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getShell(),
						Messages.CreateJavaQueryImplClass_cannotCreate,
						Messages.CreateJavaQueryImplClass_modelURIMustBePlatform);
				MoDiscoLogger.logError(e, Activator.getDefault());
			} catch (ClassAlreadyExistsException e) {
				MessageDialog.openError(Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getShell(),
						Messages.CreateJavaQueryImplClass_cannotCreateImplClass,
						Messages.CreateJavaQueryImplClass_implClassAlreadyExists);
				MoDiscoLogger.logError(e, Activator.getDefault());
			} catch (Exception e) {
				MessageDialog.openError(Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getShell(),
						Messages.CreateJavaQueryImplClass_unknownError,
						Messages.CreateJavaQueryImplClass_cannotCreateImplClass2);
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return null;
	}
}
