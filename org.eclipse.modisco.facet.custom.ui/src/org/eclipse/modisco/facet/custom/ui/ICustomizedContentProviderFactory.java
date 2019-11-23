/*******************************************************************************
 * Copyright (c) 2011, 2016 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Grégoire Dupé (Mia-Software) - Bug 506334 - Need to know which TreeElement has been updated
 *******************************************************************************/

package org.eclipse.modisco.facet.custom.ui;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.ui.internal.CustomizedContentProviderFactory;

/**
 * This is a factory for {@link ICustomizedContentProvider} and {@link ICustomizedTreeContentProvider}.
 *
 * @author Gregoire Dupe
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 *
 */
public interface ICustomizedContentProviderFactory {
	/**
	 * The default factory instance
	 */
	ICustomizedContentProviderFactory DEFAULT = new CustomizedContentProviderFactory();

	/**
	 * Instantiate an {@link ICustomizedTreeContentProvider}. With this content provider, your viewer's input has to be
	 * an EObject or an array or collection of EObjects.F
	 * 
	 * @param customManager
	 *            the customization manager used by the content provider
	 * @return a tree content provider
	 * @since 0.2
	 */
	ICustomizedTreeContentProvider createCustomizedTreeContentProvider(ICustomizationManager customManager);

	/**
	 * @since 1.2
	 */
	IContentProvider createCustomizedTreeContentProvider(
			ICustomizationManager customManager, IContentListener iContentUpdate);

	/**
	 * @since 1.2
	 * @noextend This interface is not intended to be extended by clients.
	 */
	interface IContentListener {
		void onUpdate(Object object);
	}
}
