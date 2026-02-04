/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * An EMF adapter factory used to instantiate {@link ElementIDAdapter}, that is used to associate an
 * id to an {@link EObject}.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class ElementIDAdapterFactory extends AdapterFactoryImpl {

	private static final AdapterFactory INSTANCE = new ElementIDAdapterFactory();

	private ElementIDAdapterFactory() {
		// singleton
	}

	public static AdapterFactory getInstance() {
		return ElementIDAdapterFactory.INSTANCE;
	}

	@Override
	public boolean isFactoryForType(final Object type) {
		return type == ElementID.class;
	}

	@Override
	protected Adapter createAdapter(final Notifier target) {
		return new ElementIDAdapter();
	}

}
