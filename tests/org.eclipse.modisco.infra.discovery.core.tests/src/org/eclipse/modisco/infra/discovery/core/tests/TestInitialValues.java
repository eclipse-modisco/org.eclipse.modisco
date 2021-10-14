/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 338702 - [Discovery] specify initial value for Parameters
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.tests.discoverers.BasicDiscovererWithInitialValue;
import org.junit.Test;

public class TestInitialValues {

	@Test
	public void testInitialValue() throws Exception {
		DiscovererDescription discovererDescription = IDiscoveryManager.INSTANCE.getDiscovererDescription("BasicDiscovererWithInitialValue");
		DiscovererParameter discovererParameter = discovererDescription.getParameterDefinitions().get(0);
		assertTrue(IDiscoveryManager.INSTANCE.hasInitialValue(discovererParameter, discovererDescription));
		Object initialValue = IDiscoveryManager.INSTANCE.getInitialValue(discovererParameter, discovererDescription, new Object());
		assertEquals(initialValue, BasicDiscovererWithInitialValue.DEFAULT_VALUE);
	}

	@Test
	public void testNoInitialValue() throws Exception {
		DiscovererDescription discovererDescription = IDiscoveryManager.INSTANCE.getDiscovererDescription("BasicDiscovererForTests");
		DiscovererParameter parameterDefinition = discovererDescription.getParameterDefinition("DISCO_IN");
		assertFalse(IDiscoveryManager.INSTANCE.hasInitialValue(parameterDefinition, discovererDescription));
		Object initialValue = IDiscoveryManager.INSTANCE.getInitialValue(parameterDefinition, discovererDescription, new Object());
		assertNull(initialValue);
	}
}
