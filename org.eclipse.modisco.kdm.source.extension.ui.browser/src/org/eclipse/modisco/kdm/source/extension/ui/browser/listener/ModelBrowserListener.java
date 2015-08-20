/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.kdm.source.extension.ui.browser.listener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.extensions.listeners.DoubleClickListener;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.modisco.kdm.source.extension.ui.utils.BrowseCodeUtils;

/**
 * This class only map the event "doubleClick" in the browser in order to call
 * the openEObjectContainerFile method without adding a dependency between
 * MoDisco Browser and kdm.source.extension
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=475243
 */
@Deprecated
public class ModelBrowserListener implements DoubleClickListener {

	public void synchronizeEObject(final EObject eObject,
			final IStatusLineManager statusLineManager) {

	BrowseCodeUtils
				.openAndSelectEObjectInSourceFile(eObject);

	}
}
