/**
 * Copyright (c) 2011, 2019 Mia-Software, and Soft-Maint.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *  	Grégoire Dupé (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *      Grégoire Dupé (Mia-Software) - Bug 423181 - Unchecked cast in HandlerUtils.getStructuredSelection()
 *      Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *      Jonathan Pepin (Soft-Maint) - Bug 479754 - NullPointer on HandlerUtils.getStructuredSelection() on close Eclipse
 */
package org.eclipse.modisco.facet.util.ui.internal.exported.handler;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.facet.util.core.DebugUtils;
import org.eclipse.modisco.facet.util.ui.internal.Activator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Util class for Handlers.
 * 
 * @since 0.3
 */
public final class HandlerUtils {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator.getDefault());
	
	private HandlerUtils() {
		// Hidden constructor.
	}

	/**
	 * @since 1.0
	 */
	public static IWorkbenchWindow getWorkbenchWindow() {
		final IWorkbenchWindow[] result = new IWorkbenchWindow[1];
		final Runnable runnable = new Runnable() {
			public void run() {
				final IWorkbench workbench = PlatformUI.getWorkbench();
				DebugUtils.debug(HandlerUtils.DEBUG, 
						"PlatformUI.getWorkbench()==" + workbench); //$NON-NLS-1$
				if (workbench != null) {
					final IWorkbenchWindow[] workbenchWindows = workbench
							.getWorkbenchWindows();
					DebugUtils
						.debug(HandlerUtils.DEBUG, 
							"PlatformUI.getWorkbench().getWorkbenchWindows().length==" //$NON-NLS-1$
							+ workbenchWindows.length);
					if ((workbenchWindows.length > 0)
							&& (workbenchWindows[0].getSelectionService() != null)) {
						result[0] = workbenchWindows[0];
					}
				}				
			}
		};
		if (Thread.currentThread() == Display.getDefault().getThread()) {
			runnable.run();
		} else {
			Display.getDefault().syncExec(runnable);
		}
		return result[0];
	}
	
	/**
	 * Return the tree selection of the user's selection.
	 * 
	 * @return the current tree selection.
	 */
	public static IStructuredSelection getStructuredSelection() {
		IStructuredSelection result = null;
		final IWorkbenchWindow workbenchWindow = getWorkbenchWindow();
		if (workbenchWindow != null) {
			final ISelection selection = workbenchWindow.getSelectionService()
					.getSelection();
			if (selection instanceof IStructuredSelection) {
				result = (IStructuredSelection) selection;
			}
		}
		return result;
	}

	/**
	 * Return the current selection.
	 * 
	 * @return the current selection.
	 */
	public static Object getSelection() {
		Object result = null;
		// on a facet model, the selection is obviously a TreeSelection
		final IStructuredSelection structSelection = getStructuredSelection();
		if (structSelection != null) {
			result = structSelection.getFirstElement();
		}
		return result;
	}

	/**
	 * Return the active workbench window.
	 * 
	 * @return the active workbench window.
	 */
	public static Shell getWorkbenchWindowShell() {
		final IWorkbenchWindow iWorkbenchWindow = PlatformUI.getWorkbench()
				.getWorkbenchWindows()[0];
		final IWorkbenchPage iWorkbenchPage = iWorkbenchWindow.getPages()[0];
		final IWorkbenchPart activePart = iWorkbenchPage.getActivePart();
		final IWorkbenchPartSite site = activePart.getSite();

		return site.getShell();
	}
	
	/**
	 * @return The active page
	 * @since 1.0
	 */
	public static IWorkbenchPage getActivePage() {
		IWorkbenchPage activePage = null;
		final IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench != null) {
			final IWorkbenchWindow window = workbench
					.getActiveWorkbenchWindow();
			if (window != null) {
				activePage = window.getActivePage();
			}
		}
		return activePage;
	}
	
	/**
	 * @return The active part
	 * @since 1.0
	 */
	public static IWorkbenchPart getActivePart() {
		IWorkbenchPart activePart = null;
		final IWorkbenchPage activePage = getActivePage();
		if (activePage != null) {
			activePart = activePage.getActivePart();
		}
		return activePart;
	}
}
