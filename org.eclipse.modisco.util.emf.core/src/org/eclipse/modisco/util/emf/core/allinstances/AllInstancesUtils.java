/**
 * Copyright (c) 2015, 2019 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 */
package org.eclipse.modisco.util.emf.core.allinstances;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstancesAdapterFactory;

/**
 * @since 1.0.0
 */
public final class AllInstancesUtils {

	private AllInstancesUtils() {
		// Must not be used
	}

	public static List<EObject> allInstances(final EClass eClass,
			final Resource resource, final boolean includingSubTypes) {
		final List<EObject> result = new ArrayList<EObject>();
		final MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactory
				.getInstance().adapt(resource, MetaclassInstances.class);
		result.addAll(instances.getInstances(eClass, includingSubTypes));
		return result;
	}
}
