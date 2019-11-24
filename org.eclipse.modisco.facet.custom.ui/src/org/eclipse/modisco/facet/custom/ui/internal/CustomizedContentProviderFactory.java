/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *      Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *      Grégoire Dupé (Mia-Software) - Bug 506334 - Need to know which TreeElement has been updated
 */
package org.eclipse.modisco.facet.custom.ui.internal;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.ui.ICustomizedContentProviderFactory;
import org.eclipse.modisco.facet.custom.ui.ICustomizedTreeContentProvider;

public class CustomizedContentProviderFactory implements ICustomizedContentProviderFactory {

	public ICustomizedTreeContentProvider createCustomizedTreeContentProvider(final ICustomizationManager customManager) {
		return new CustomizedTreeContentProvider(customManager, new IContentListener() {
			public void onUpdate(final Object object) {
				// Nothing to do
			}
		});
	}

	public IContentProvider createCustomizedTreeContentProvider(final ICustomizationManager customManager,
			final IContentListener contentListener) {
		return new CustomizedTreeContentProvider(customManager, contentListener);
	}

}
