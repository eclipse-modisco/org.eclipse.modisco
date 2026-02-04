/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class DragAndDropUtils {

	private DragAndDropUtils() {
		// utility class
	}

	/**
	 * For each element in the given collection, look for its equivalent (based
	 * on the element's URI) in the given {@link ResourceSet}.
	 *
	 * @param collection
	 *            the input elements
	 * @param resourceSet
	 *            the {@link ResourceSet} in which to look for corresponding
	 *            elements
	 * @return the collection in which elements are replaced by their equivalent
	 *         in the given {@link ResourceSet}
	 */
	public static List<Object> translateCrossDomainObjects(final Collection<?> collection,
			final ResourceSet resourceSet) {
		ArrayList<Object> result = new ArrayList<Object>();
		for (Object o : collection) {
			if (o instanceof EObject) {
				EObject eObject = (EObject) o;
				EObject eObject2 = resourceSet.getEObject(EcoreUtil.getURI(eObject), true);
				if (eObject2 != null) {
					result.add(eObject2);
				}
			} else {
				result.add(o);
			}
		}
		return result;
	}
}
