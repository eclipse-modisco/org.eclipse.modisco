/*******************************************************************************
 * Copyright (c) 2010, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;

/**
 * An Eclipse adapter factory used to adapt a {@link ModelElementItem} to the {@link EObject} it
 * represents.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class AdapterFactory implements IAdapterFactory {

	@Override
	@Deprecated
	@SuppressWarnings("unchecked")
	public <T> T getAdapter(final Object adaptableObject, final Class<T> adapterType) {
		if (adapterType == EObject.class) {
			if (adaptableObject instanceof ModelElementItem) {
				ModelElementItem modelElementItem = (ModelElementItem) adaptableObject;
				return (T) modelElementItem.getEObject();
			}
		}
		return null;
	}

	@Deprecated
	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] { EObject.class };
	}

}
