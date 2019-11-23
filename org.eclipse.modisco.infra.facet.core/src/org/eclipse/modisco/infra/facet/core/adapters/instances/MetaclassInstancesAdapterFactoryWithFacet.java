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
package org.eclipse.modisco.infra.facet.core.adapters.instances;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public final class MetaclassInstancesAdapterFactoryWithFacet extends AdapterFactoryImpl {
	private static final MetaclassInstancesAdapterFactoryWithFacet INSTANCE = new MetaclassInstancesAdapterFactoryWithFacet();

	private FacetContext facetContext = null;

	private MetaclassInstancesAdapterFactoryWithFacet() {
		// singleton
	}

	public static MetaclassInstancesAdapterFactoryWithFacet getInstance() {
		return MetaclassInstancesAdapterFactoryWithFacet.INSTANCE;
	}

	public void setFacetContext(final FacetContext facetContext) {
		this.facetContext = facetContext;
	}

	@Override
	public boolean isFactoryForType(final Object type) {
		return type == MetaclassInstances.class;
	}

	@Override
	public Adapter adapt(final Notifier target, final Object type) {
		for (Adapter adapter : target.eAdapters()) {
			if (adapter != null && adapter.isAdapterForType(type)) {
				MetaclassInstancesAdapterWithFacet adapterWithFacet = (MetaclassInstancesAdapterWithFacet) adapter;
				if (adapterWithFacet.getFacetContext() == this.facetContext) {
					return adapter;
				}
			}
		}
		return adaptNew(target, type);
	}

	@Override
	protected Adapter createAdapter(final Notifier target) {
		if (!(target instanceof Resource)) {
			throw new IllegalArgumentException("This adapter only works on Resources"); //$NON-NLS-1$
		}
		if (this.facetContext == null) {
			throw new IllegalStateException("facetContext is not set"); //$NON-NLS-1$
		}
		return new MetaclassInstancesAdapterWithFacet((Resource) target, this.facetContext);
	}
}
