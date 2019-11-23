/*******************************************************************************
 * Copyright (c) 2012, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *     Grégoire Dupé (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *     Grégoire Dupé (Mia-Software) - Bug 474286 - ClassCastException in NavigationViewFactory.openNavigationView (36)
 *     Grégoire Dupé (Mia-Software) - Bug 480654 - IllegalStateException in NavigationView.addEObjects (611)
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.view;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.efacet.ui.internal.Activator;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationView;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationViewFactory;
import org.eclipse.modisco.facet.efacet.ui.internal.sync.generated.SynchronizedNavigationView;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class NavigationViewFactory implements INavigationViewFactory {

	public static final String VIEW_ID = "org.eclipse.emf.facet.efacet.ui.view.navigation"; //$NON-NLS-1$

	/*
	 * FIXME gdupe> It would be better if that method would be able to throw an
	 * exception, rather than to "silently" log the problems.
	 */
	public INavigationView openNavigationView(final EditingDomain editingDomain) {
		INavigationView result = null;
		try {
			final IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
			if (window != null) {
				final IWorkbenchPage activePage = window.getActivePage();
				if (activePage != null) {
					final IViewPart view = activePage.showView(
							NavigationViewFactory.VIEW_ID);
					if (view instanceof INavigationView) {
						result = new SynchronizedNavigationView(
								(INavigationView) view,
								window.getShell().getDisplay());
					} else {
						final String message = String.format(
								"Something wrong happend when trying to open the EMF Facet navigation view. The view was expected to be of type %s but is of type %s", //$NON-NLS-1$
								INavigationView.class.getName(),
								view.getClass().getName()
							);
						Logger.logError(message, Activator.getDefault());
					}
				}
			}
		} catch (final PartInitException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return result;
	}

}
