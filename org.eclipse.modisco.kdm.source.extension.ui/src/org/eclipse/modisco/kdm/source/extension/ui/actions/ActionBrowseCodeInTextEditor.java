/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.kdm.source.extension.ui.actions;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.kdm.source.extension.ui.Activator;
import org.eclipse.modisco.kdm.source.extension.ui.adapters.SourceAccessAdapter;
import org.eclipse.modisco.kdm.source.extension.ui.adapters.SourceAccessAdapterFactory;
import org.eclipse.modisco.kdm.source.extension.ui.utils.BrowseCodeUtils;
import org.eclipse.modisco.omg.kdm.source.SourceRegion;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

public class ActionBrowseCodeInTextEditor implements IActionDelegate {

	private static final String DEBUG_ID = "org.eclipse.modisco.kdm.source.extension.ui/debug/ActionBrowseCodeInTextEditor/debug"; //$NON-NLS-1$
	static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& new Boolean(
					Platform.getDebugOption(ActionBrowseCodeInTextEditor.DEBUG_ID))
					.booleanValue();

	/**
	 * Action called from the menu button "Browse to code source" on any
	 * {@link EObject} in the workbench
	 */
	public void run(final IAction action) {
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			EObject eObject = null;

			if (firstElement != null) {
				if (firstElement instanceof EObject) {
					eObject = (EObject) firstElement;
					if (ActionBrowseCodeInTextEditor.DEBUG) {
						System.out.println("\nEObject Casted : " + eObject); //$NON-NLS-1$
					}

				} else {
					eObject = (EObject) Platform.getAdapterManager()
							.getAdapter(firstElement, EObject.class);
					if (ActionBrowseCodeInTextEditor.DEBUG) {
						System.out.println("\nEObject Adapted : " + eObject); //$NON-NLS-1$
					}
				}
			}

			if (eObject != null) {
				BrowseCodeUtils
						.openAndSelectEObjectInSourceFile(eObject);
			} else {
				MoDiscoLogger.logWarning("Cannot browse this element", //$NON-NLS-1$
						Activator.getDefault());
			}
		}
	}

	/**
	 * This method looks for an ASTNodeSourceRegion if the selected object is an
	 * EObject If result is null, then the "Browse To Code Action" is disabled
	 */
	public void selectionChanged(final IAction action,
			final ISelection selection) {
		if (ActionBrowseCodeInTextEditor.DEBUG) {
			System.out
					.println("ActionBrowseCodeInTextEditor.selectionChanged()"); //$NON-NLS-1$
		}

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			EObject eObject = null;

			if (firstElement != null) {
				if (firstElement instanceof EObject) {
					eObject = (EObject) firstElement;

					AdapterFactory adapterFactory = new SourceAccessAdapterFactory();
					SourceAccessAdapter sourceAccessAdapter = (SourceAccessAdapter) adapterFactory
							.adapt(eObject, EObject.class);
					if (sourceAccessAdapter != null) {

						SourceRegion sourceRegion = sourceAccessAdapter
								.getSourceRegion();
						if (sourceRegion == null) {
							action.setEnabled(false);
						} else {
							sourceAccessAdapter.setSourceRegion(sourceRegion);
							action.setEnabled(true);
						}
					}
				}
			}
		}
	}

}
