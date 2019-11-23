/*******************************************************************************
 * Copyright (c) 2010, 2015 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/
package org.eclipse.modisco.util.emf.core.internal.allinstances;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;

public final class MetaclassInstancesAdapterFactory extends AdapterFactoryImpl {
	private static final AdapterFactory INSTANCE = new MetaclassInstancesAdapterFactory();

	private MetaclassInstancesAdapterFactory() {
		super();
	}

	public static AdapterFactory getInstance() {
		return MetaclassInstancesAdapterFactory.INSTANCE;
	}

	@Override
	public boolean isFactoryForType(final Object type) {
		return type == MetaclassInstances.class;
	}

	@Override
	protected Adapter createAdapter(final Notifier target) {
		if (!(target instanceof Resource)) {
			throw new IllegalArgumentException("This adapter only works on Resources"); //$NON-NLS-1$
		}
		return new MetaclassInstancesAdapter((Resource) target, true);
	}
}
