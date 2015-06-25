/** 
 * Copyright (c) 2014, 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442017 - A customization counting elements by reference
 *    Thomas Cicognani (Soft-Maint) - Bug 471000 - Reactivate the customization which counts elements by reference
 */
package org.eclipse.modisco.infra.browser.ecore.core.internal.linkscount;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.query.java.core.IJavaQuery3;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class LinksCountQuery implements IJavaQuery3<EObject, String> {
	public String evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager, final DerivedTypedElement feature)
			throws DerivedTypedElementException {
		try {
			String size = ""; //$NON-NLS-1$
			if (parameterValues != null) {
				final ETypedElement sfParam = (ETypedElement) parameterValues
						.getParameterValueByName("eStructuralFeature").getValue(); //$NON-NLS-1$
				if (sfParam instanceof EReference) {
					size = getSizeForReference(source, facetManager, sfParam);
				}
			}
			return facetManager.getSuperValueOf(feature, source,
					parameterValues, String.class) + size;
		} catch (Exception e) {
			throw new DerivedTypedElementException(e);
		}
	}

	private static String getSizeForReference(final EObject source,
			final IFacetManager facetManager, final ETypedElement sfParam)
			throws FacetManagerException {
		String size = ""; //$NON-NLS-1$
		final Object object = facetManager.getOrInvoke(source, sfParam,
				Object.class);
		if (object instanceof Collection) {
			final Collection<?> collection = (Collection<?>) object;
			final int listSize = collection.size();
			if (listSize > 0) {
				size = String.format(" (%d)", //$NON-NLS-1$
						Integer.valueOf(listSize));
			}
		} else if (object != null) {
			size = " (1)"; //$NON-NLS-1$
		}
		return size;
	}
}

