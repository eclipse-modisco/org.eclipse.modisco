/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel - initial API and implementation
 *    Gregoire Dupe (Mia-Software) - Bug 453476 - Stop using EMF Facet's deprecated APIs
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.facet.util.emf.catalog.Catalog;
import org.eclipse.modisco.facet.util.emf.catalog.CatalogSet;
import org.eclipse.modisco.facet.util.emf.core.ICatalogSetManager2;
import org.eclipse.modisco.facet.util.emf.core.ICatalogSetManagerFactory;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.junit.Test;

public class TestDiscoverersReferential {

	private static final String BASIC_DISCOVERER_FOR_TESTS = "BasicDiscovererForTests"; //$NON-NLS-1$
	private static final String BASIC_DISCOVERER_SUCLASS_FOR_TESTS = "BasicDiscovererForTests2"; //$NON-NLS-1$

	@Test
	public void testDiscovererReferential() {

		// test discoverers retrieving
		Assert.assertFalse(IDiscoveryManager.INSTANCE.getDiscoverers()
				.isEmpty());

		// test discoverers catalog registration
		boolean catalogFound = false;
		final ICatalogSetManager2 catalogSetManager = ICatalogSetManagerFactory.DEFAULT
				.createICatalogSetManager(new ResourceSetImpl());
		final CatalogSet catalogSet = catalogSetManager.getCatalogSet();
		for (Catalog aCatalog : catalogSet.getCatalogs()) {
			if (aCatalog instanceof DiscovererCatalog) {
				catalogFound = true;

				EList<DiscovererDescription> discoDescriptions = ((DiscovererCatalog) aCatalog)
						.getInstalledDiscoverers();
				Assert.assertFalse(discoDescriptions.isEmpty());
			}
		}
		Assert.assertTrue(catalogFound);

		// test discoverer search by name
		IDiscoverer<?> basicDiscoverer = IDiscoveryManager.INSTANCE
				.createDiscovererImpl(TestDiscoverersReferential.BASIC_DISCOVERER_FOR_TESTS);
		Assert.assertNotNull(basicDiscoverer);

		DiscovererDescription discovererDesc = IDiscoveryManager.INSTANCE
				.getDiscovererDescription(TestDiscoverersReferential.BASIC_DISCOVERER_FOR_TESTS);
		Assert.assertNotNull(discovererDesc);

		// test discoverer search for a given source
		Collection<DiscovererDescription> applicableDiscoverers = IDiscoveryManager.INSTANCE
				.getApplicableDiscoverers(new Object());
		Assert.assertFalse(applicableDiscoverers.isEmpty());

	}

	@Test
	public void testParametersGenericAPI() {
		DiscovererDescription basicDiscoverer = IDiscoveryManager.INSTANCE
				.getDiscovererDescription(TestDiscoverersReferential.BASIC_DISCOVERER_FOR_TESTS);

		DiscovererParameter DISCO_IN = basicDiscoverer
				.getParameterDefinition("DISCO_IN"); //$NON-NLS-1$
		Assert.assertNotNull(DISCO_IN);
		Assert.assertTrue(DISCO_IN.getDescription() == null
				|| DISCO_IN.getDescription().length() == 0);
		Assert.assertTrue(DISCO_IN.getDirection() == DirectionKind.IN);
		Assert.assertTrue(DISCO_IN.getType() == Integer.class);
		Assert.assertTrue(DISCO_IN.isRequiredInput());
		// Assert.assertTrue(DISCO_IN.getDeclaringAnnotations().size() == 1);

		DiscovererParameter DISCO_OUT = basicDiscoverer
				.getParameterDefinition("DISCO_OUT"); //$NON-NLS-1$
		Assert.assertNotNull(DISCO_OUT);
		Assert.assertTrue(DISCO_OUT.getDescription().equals("DISCO_OUT desc")); //$NON-NLS-1$
		Assert.assertTrue(DISCO_OUT.getDirection() == DirectionKind.OUT);
		Assert.assertTrue(DISCO_OUT.getType() == URI.class);
		Assert.assertFalse(DISCO_OUT.isRequiredInput());
		// Assert.assertTrue(DISCO_OUT.getDeclaringAnnotations().size() == 1);

		DiscovererParameter DISCO_INOUT_1 = basicDiscoverer
				.getParameterDefinition("DISCO_INOUT_1"); //$NON-NLS-1$
		Assert.assertNotNull(DISCO_INOUT_1);
		Assert.assertTrue(DISCO_INOUT_1.getDescription().equals(
				"DISCO_INOUT_1 desc")); //$NON-NLS-1$
		Assert.assertTrue(DISCO_INOUT_1.getDirection() == DirectionKind.INOUT);
		Assert.assertTrue(DISCO_INOUT_1.getType() == Integer.class);
		Assert.assertTrue(DISCO_INOUT_1.isRequiredInput());
		// Assert.assertTrue(DISCO_INOUT_1.getDeclaringAnnotations().size() ==
		// 2);

		DiscovererParameter DISCO_INOUT_2 = basicDiscoverer
				.getParameterDefinition("DISCO_INOUT_2"); //$NON-NLS-1$
		Assert.assertNotNull(DISCO_INOUT_2);
		Assert.assertTrue(DISCO_INOUT_2.getDirection() == DirectionKind.INOUT);
		Assert.assertTrue(DISCO_INOUT_2.getType() == String.class);
		Assert.assertFalse(DISCO_INOUT_2.isRequiredInput());
		// Assert.assertTrue(DISCO_INOUT_2.getDeclaringAnnotations().size() ==
		// 1);

	}

	@Test
	public void testParametersGenericAPIInheritance() {
		// Test Parameters inheritance
		DiscovererDescription basicDiscovererSubClass = IDiscoveryManager.INSTANCE
				.getDiscovererDescription(TestDiscoverersReferential.BASIC_DISCOVERER_SUCLASS_FOR_TESTS);
		Assert.assertNotNull(basicDiscovererSubClass);
		Assert.assertTrue(basicDiscovererSubClass.getParameterDefinitions()
				.size() == 4);
	}

	@Test
	public void testGenericInvocation() {
		IDiscoverer<?> basicDiscoverer = IDiscoveryManager.INSTANCE
				.createDiscovererImpl(TestDiscoverersReferential.BASIC_DISCOVERER_FOR_TESTS);

		Map<String, Object> parametersValues = new HashMap<String, Object>();
		parametersValues.put("DISCO_IN", new Integer(2)); //$NON-NLS-1$
		parametersValues.put("DISCO_INOUT_1", new Integer(3)); //$NON-NLS-1$

		try {
			IDiscoveryManager.INSTANCE.discoverElement(basicDiscoverer,
					new Object(), parametersValues, new NullProgressMonitor());

			String DISCO_INOUT_2_value = (String) parametersValues
					.get("DISCO_INOUT_2"); //$NON-NLS-1$
			Assert.assertNotNull(DISCO_INOUT_2_value);
			Assert.assertEquals(DISCO_INOUT_2_value, "2"); //$NON-NLS-1$

		} catch (DiscoveryException e) {
			Assert.fail("Discovery fails : " + e.getMessage()); //$NON-NLS-1$
			e.printStackTrace();
		}

	}
}
