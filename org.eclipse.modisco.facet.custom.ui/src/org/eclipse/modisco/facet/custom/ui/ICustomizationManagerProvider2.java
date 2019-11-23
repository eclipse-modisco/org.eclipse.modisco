/*******************************************************************************
 * Copyright (c) 2015 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Thomas Cicognani (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets 
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.facet.custom.core.ICustomizationManagerProvider;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;

/**
 * @since 1.1
 */
public interface ICustomizationManagerProvider2 extends
		ICustomizationManagerProvider {

	interface ICustomShortcut {
		Customization getCustom();

		String getLabel();

		ImageDescriptor getIcon();
	}

	List<ICustomShortcut> getCustomShortcuts();

}
