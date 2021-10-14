/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Grégoire Dupé (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *     Grégoire Dupé (Mia-Software) - Bug 480654 - IllegalStateException in NavigationView.addEObjects (611)
 */
package org.eclipse.modisco.facet.efacet.ui.internal.exported.view;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.efacet.ui.internal.sync.generated.SynchronizedNavigationViewFactory;
import org.eclipse.modisco.facet.efacet.ui.internal.view.NavigationViewFactory;
import org.eclipse.swt.widgets.Display;

/**
 * This interface allows to get an instance of the {@link INavigationView} interface
 * 
 * @author Gregoire Dupe
 * 
 */
public interface INavigationViewFactory {

	/**
	 * This is the default instance of this interface.
	 */
	INavigationViewFactory DEFAULT = new SynchronizedNavigationViewFactory(new NavigationViewFactory(), Display.getDefault());

	/**
	 * This method is the only way to open and access the navigation view.
	 * @param editingDomain 
	 * 
	 * @return an instance of {@link INavigationView}
	 */
	/*
	 * FIXME gdupe> It would be better if that method would be able to throw an
	 * exception, rather than to "silently" log the problems.
	 */
	INavigationView openNavigationView(EditingDomain editingDomain);

}
