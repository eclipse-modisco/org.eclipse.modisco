/** 
 * Copyright (c) 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 506318 - [New Browser] Drag and drop support
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class EmfUtils {

	private EmfUtils() {
		// Must not be used
	}

	public static Collection<EObject> getCollectionFrom(
			final ResourceSet resourceSet,
			final Collection<?> collection) {
		final Collection<EObject> result = new ArrayList<EObject>(
				collection.size());
		for (Object object : collection) {
			if (object instanceof EObject) {
				final EObject eObject = (EObject) object;
				if (eObject.eResource().getResourceSet() == resourceSet) {
					result.add(eObject);
				} else {
					final EObject createEObjectFrom = basicCreateEObjectFrom(
							resourceSet, eObject);
					result.add(createEObjectFrom);
				}
			}
		}
		return result;
	}

	public static EObject getEObjectFrom(final ResourceSet resourceSet,
			final EObject eObject) {
		EObject result = eObject;
		if (eObject.eResource().getResourceSet() != resourceSet) {
			result = basicCreateEObjectFrom(resourceSet, eObject);
		}
		return result;
	}

	private static EObject basicCreateEObjectFrom(final ResourceSet resourceSet,
			final EObject eObject) {
		final URI uri = EcoreUtil.getURI(eObject);
		return resourceSet.getEObject(uri, true);
	}
}
