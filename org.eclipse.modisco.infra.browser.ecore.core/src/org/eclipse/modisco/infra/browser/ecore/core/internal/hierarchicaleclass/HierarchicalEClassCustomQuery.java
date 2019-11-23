/**
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471597 - [New Browser] Add a customization to display subclasses from an EClass
 */
package org.eclipse.modisco.infra.browser.ecore.core.internal.hierarchicaleclass;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.efacet.core.FacetUtils;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.query.java.core.IJavaQuery3;
import org.eclipse.modisco.facet.query.java.core.IParameterValueList2;

public class HierarchicalEClassCustomQuery implements
		IJavaQuery3<EClass, List<EStructuralFeature>> {

	public List<EStructuralFeature> evaluate(final EClass context,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetMgr,
			final DerivedTypedElement derivedTypeElt)
			throws DerivedTypedElementException {
		final List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
		final ResourceSet resourceSet = facetMgr.getResourceSet();
		final URI uri = URI
				.createPlatformPluginURI(
						"/org.eclipse.modisco.infra.browser.ecore.core/facet/hierarchicalEClass.efacet", //$NON-NLS-1$
						true);
		final Resource ressource = resourceSet.getResource(uri, true);
		final FacetSet facetSet = (FacetSet) ressource.getContents().get(0);
		final Facet facet = FacetUtils.getFacet(facetSet, "facet"); //$NON-NLS-1$
		final EStructuralFeature eStructFeature = FacetUtils.getETypedElement(
				facet, "subClasses", EStructuralFeature.class); //$NON-NLS-1$
		result.add(eStructFeature);
		return result;
	}

}
