/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    David Couvrand (Soft-Maint) - Bug 418418 - [Customization] Overlay icons not implemented
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal;

import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.modisco.facet.custom.ui.IResolvingCustomizedLabelProviderFactory;

public class ResolvingCustomizedLabelProviderFactory implements IResolvingCustomizedLabelProviderFactory {

	public ICustomizedLabelProvider createCustomizedLabelProvider(final ICustomizationManager customManager) {
		return new ResolvingCustomizedLabelProvider(
				new DecoratingCustomizedLabelProvider(
						customManager));
	}

}
