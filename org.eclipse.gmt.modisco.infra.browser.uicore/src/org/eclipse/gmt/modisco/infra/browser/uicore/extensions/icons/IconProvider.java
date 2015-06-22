/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;

/**
 * The interface that must be implemented in order to use the "icons" extension.
 * Implementors may choose to use the {@link FilteredIconProvider} interface
 * instead if they want to add a filter.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface IconProvider {

	/**
	 * @return the icon that must be displayed for the given {@link EObject}, or
	 *         <code>null</code> to keep the default icon, which can be empty,
	 *         or let another {@link IconProvider} provide the icon
	 */
	Image getIcon(EObject eObject);
}
