/**
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471447 - [New Browser] Add a customization counting instances by EClass
 *    Thomas Cicognani (Soft-Maint) - Bug 472041 - [New Browser] Add a customization counting instances by EClass in the same Resource
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.custom;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.query.java.core.IJavaQuery3;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.widget.InternalUtils;

/**
 * Add the number of instances of an EClass (in the ResourceSet) at the end of the name
 */
public class NbInstancesEClassByResourceSetQuery implements IJavaQuery3<EObject, String> {

	public String evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager, final DerivedTypedElement feature)
			throws DerivedTypedElementException {
		try {
			String instancesNbStr = ""; //$NON-NLS-1$
			if (source instanceof EClass) {
				final EClass eClass = (EClass) source;
				final Set<EObject> allInstances = InternalUtils
						.getInstancesOfFromCurrentResourceSets(eClass);
				instancesNbStr = String.format(" (%d)", //$NON-NLS-1$
						Integer.valueOf(allInstances.size()));
			}
			return facetManager.getSuperValueOf(feature, source,
					parameterValues, String.class) + instancesNbStr;
		} catch (Exception e) {
			throw new DerivedTypedElementException(e);
		}
	}

}
