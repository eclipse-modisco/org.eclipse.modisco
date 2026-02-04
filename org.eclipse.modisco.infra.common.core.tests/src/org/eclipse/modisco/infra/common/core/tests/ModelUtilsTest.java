/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.tests;

import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.facet.FacetPackage;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.junit.Assert;
import org.junit.Test;

public class ModelUtilsTest {


	/**
	 * Tests the computing of references between EPackage (307794)
	 */
	@Test
	public void testComputeReferencedEPackages() {
		EPackage facetPackage = EPackage.Registry.INSTANCE.getEPackage(FacetPackage.eNS_URI);
		Assert.assertNotNull(facetPackage);

		EPackage queryPackage = EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		Assert.assertNotNull(queryPackage);

		EPackage ecorePackage = EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Assert.assertNotNull(ecorePackage);

		// Facet metamodel has references to Query and Ecore metamodels
		Set<EPackage> references = ModelUtils.computeReferencedPackages(facetPackage);

		Assert.assertTrue("References from Facet metamodel to Query metamodel were not computed", references.contains(queryPackage)); //$NON-NLS-1$
		Assert.assertTrue("References from Facet metamodel to Ecore metamodel were not computed", references.contains(ecorePackage)); //$NON-NLS-1$
	}
}
