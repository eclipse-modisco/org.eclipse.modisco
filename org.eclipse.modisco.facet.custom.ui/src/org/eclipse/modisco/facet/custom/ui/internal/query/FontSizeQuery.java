/**
 *  Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] EMF Facet customization meta-model
 *      Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 */
package org.eclipse.modisco.facet.custom.ui.internal.query;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.query.java.core.IJavaQuery2;
import org.eclipse.modisco.facet.query.java.core.IParameterValueList2;
import org.eclipse.swt.widgets.Display;

public class FontSizeQuery implements IJavaQuery2<EObject, Integer> {

	public Integer evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
			throws DerivedTypedElementException {
		return Integer.valueOf(Display.getDefault().getSystemFont().getFontData()[0].getHeight());
	}

}
