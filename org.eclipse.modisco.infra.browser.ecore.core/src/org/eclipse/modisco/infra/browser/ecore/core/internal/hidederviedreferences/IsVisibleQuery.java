/** 
 * Copyright (c) 2014, 2015 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 358914 - [Move to EMF Facet][Browser] Switch to EMF Facet
 *    Thomas Cicognani (Soft-Maint) - Bug 470903 - The custom HideDerivedReferences doesn't use the super method
 */
package org.eclipse.modisco.infra.browser.ecore.core.internal.hidederviedreferences;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.core.exception.SuperInvokeException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.query.java.core.IJavaQuery3;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class IsVisibleQuery implements IJavaQuery3<EObject, Boolean> {
	public Boolean evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager, final DerivedTypedElement feature)
			throws DerivedTypedElementException {
		boolean result = false;
		if (parameterValues.size() == 0) {
			throw new DerivedTypedElementException(
					"parameterValues must not be empty"); //$NON-NLS-1$
		}

		final Object paramValue = parameterValues.get(0).getValue();
		if (paramValue instanceof EStructuralFeature) {
			final EStructuralFeature eStructFeature = (EStructuralFeature) paramValue;
			result = !eStructFeature.isDerived();
		} else if (paramValue == null) {
			result = true;
		} else {
			final String message = String
					.format("Unexpected parameter type (%s instead of EStructuralFeature)", //$NON-NLS-1$
							paramValue.getClass().getName());
			throw new DerivedTypedElementException(message);
		}

		if (result) {
			try {
				/*
				 * The object is visible if this custom says it is AND if the
				 * previous/super customs say it is
				 */
				result &= facetManager.getSuperValueOf(feature, source,
						parameterValues, Boolean.class).booleanValue();
			} catch (FacetManagerException e) {
				throw new DerivedTypedElementException(e);
			} catch (SuperInvokeException e) {
				throw new DerivedTypedElementException(e);
			}
		}

		return Boolean.valueOf(result);
	}
}
