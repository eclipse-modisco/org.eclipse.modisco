/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
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
package org.eclipse.modisco.kdm.source.extension.ui.utils;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.kdm.source.extension.ui.Activator;
import org.eclipse.modisco.kdm.source.extension.ui.adapters.SourceAccessAdapter;
import org.eclipse.modisco.kdm.source.extension.ui.adapters.SourceAccessAdapterFactory;

public final class BrowseCodeUtils {

	private BrowseCodeUtils() {
		// not instantiable
	}

	private static final String DEBUG_ID = "org.eclipse.modisco.kdm.source.extension.ui/debug/BrowseCodeUtils/debug"; //$NON-NLS-1$
	public static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& new Boolean(
					Platform.getDebugOption(BrowseCodeUtils.DEBUG_ID))
					.booleanValue();

	/**
	 * Add an adapter to the selection and try to open correponding file and
	 * select the piece of code
	 *
	 * @param eObject
	 *            the selected object to be opened
	 */
	public static void openAndSelectEObjectInSourceFile(final EObject eObject) {

		if (BrowseCodeUtils.DEBUG) {
			System.out
					.println("BrowseCodeUtils.openEObjectContainerFile()"); //$NON-NLS-1$
		}

		// Add an SourceAccessAdapter to the eObject
		AdapterFactory adapterFactory = new SourceAccessAdapterFactory();
		SourceAccessAdapter sourceAccessAdapter = (SourceAccessAdapter) adapterFactory.adapt(
				eObject, EObject.class);

		if (sourceAccessAdapter != null) {
			sourceAccessAdapter.revealInTextEditor();

		} else {
			if (BrowseCodeUtils.DEBUG) {
				System.out.println("eObjectAdapter is null"); //$NON-NLS-1$
			}
		}
	}
}
