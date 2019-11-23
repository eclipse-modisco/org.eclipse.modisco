/*******************************************************************************
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 377866 - selection customization
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui;

import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.ui.internal.PropertiesHandlerFactory;

/**
 * Factory for {@link ISelectionPropertiesHandler}
 * 
 * @since 0.2
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ISelectionPropertiesHandlerFactory {

	ISelectionPropertiesHandlerFactory DEFAULT = new PropertiesHandlerFactory();

	ISelectionPropertiesHandler createSelectionPropertiesHandler(
			ICustomizationManager customManager);
}
