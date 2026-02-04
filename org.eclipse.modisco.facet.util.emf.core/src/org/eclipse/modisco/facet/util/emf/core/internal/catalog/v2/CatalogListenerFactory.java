/*******************************************************************************
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *    Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.internal.catalog.v2;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.facet.util.core.DebugUtils;
import org.eclipse.modisco.facet.util.emf.core.internal.Activator;


public class CatalogListenerFactory implements AdapterFactory {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator
			.getDefault());

	public boolean isFactoryForType(final Object type) {
		return type == CatalogListener.class;
	}

	public Object adapt(final Object object, final Object type) {
		Object result = null;
		if (object instanceof Notifier) {
			result = adapt((Notifier) object, type);
		}
		return result;
	}

	public static void adapt(final Object object,
			final Resource resource) {
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			adaptResource(eObject, resource);
		}
	}

	public Adapter adapt(final Notifier target, final Object type) {
		Adapter result = null;
		if ((isFactoryForType(type)) && (target instanceof EObject)) {
			final EObject eObject = (EObject) target;
			result = adapt(target, eObject);
		}
		return result;
	}

	public static CatalogListener adaptResource(final Notifier target,
			final Resource resource) {
		CatalogListener result = findAdatper(target);
		if (result == null) {
			result = adaptNew(target, resource);
		}
		return result;
	}

	private static CatalogListener findAdatper(final Notifier target) {
		CatalogListener result = null;
		for (final Adapter adapter : target.eAdapters()) {
			if (adapter instanceof CatalogListener) {
				result = (CatalogListener) adapter;
				break;
			}
		}
		return result;
	}

	private static CatalogListener adaptNew(final Notifier target,
			final Resource resource) {
		if (DEBUG) {
			DebugUtils.debug(target.toString());
		}
		final CatalogListener result = new CatalogListener(resource);
		target.eAdapters().add(result);
		return result;
	}

	public Adapter adaptNew(final Notifier target, final Object type) {
		Adapter result = null;
		if ((type == CatalogListener.class) && (target instanceof EObject)) {
			final EObject eObject = (EObject) target;
			result = adapt(target, eObject);
		}
		return result;
	}

	public void adaptAllNew(final Notifier notifier) {
		if (notifier instanceof EObject) {
			final EObject eObject = (EObject) notifier;
			adapt(notifier, eObject);
		}
	}

	public static void removeAdapter(final Object oldValue) {
		if (DEBUG) {
			DebugUtils.debug(oldValue.toString());
		}
		if (oldValue instanceof EObject) {
			final EObject notifier = (EObject) oldValue;
			final CatalogListener validationAdapter = findAdatper(notifier);
			if (validationAdapter != null) {
				notifier.eAdapters().remove(validationAdapter);
				for (EObject subEObject : notifier.eContents()) {
					removeAdapter(subEObject);
				}
			}
		}
	}
}
