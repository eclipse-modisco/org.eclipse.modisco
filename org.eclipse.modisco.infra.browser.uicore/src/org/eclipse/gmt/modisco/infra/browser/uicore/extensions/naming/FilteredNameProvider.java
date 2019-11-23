/*******************************************************************************
 * Copyright (c) 2008, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming;

/**
 * An extension to {@link NameProvider} that adds a way to filter elements
 * before the {@link NameProvider#getName(org.eclipse.emf.ecore.EObject)
 * getName} method is called.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface FilteredNameProvider extends NameProvider {
	/** @return whether this {@link NameProvider} filters the given metaclass */
	boolean filter(String metaclass);
}
