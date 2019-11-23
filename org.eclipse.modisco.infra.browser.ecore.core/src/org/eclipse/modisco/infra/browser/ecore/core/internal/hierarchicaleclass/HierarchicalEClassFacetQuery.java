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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.query.java.core.IJavaQuery2;
import org.eclipse.modisco.facet.query.java.core.IParameterValueList2;
import org.eclipse.modisco.util.emf.core.subclasses.SubClassesUtils;

public class HierarchicalEClassFacetQuery implements
		IJavaQuery2<EClass, List<EClass>> {

	public List<EClass> evaluate(final EClass context,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
			throws DerivedTypedElementException {
		return SubClassesUtils.getSubClasses(context);
	}

}
