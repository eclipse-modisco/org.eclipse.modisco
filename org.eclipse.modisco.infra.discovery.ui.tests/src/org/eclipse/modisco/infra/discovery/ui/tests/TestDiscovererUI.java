/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.tests;

import junit.framework.Assert;

import org.eclipse.modisco.infra.discovery.ui.internal.registry.DiscovererUI;
import org.eclipse.modisco.infra.discovery.ui.internal.registry.DiscovererUIRegistry;
import org.junit.Test;

public class TestDiscovererUI {
	@Test
	public void testDiscovererUIExtension() {
		DiscovererUI discovererUI = DiscovererUIRegistry.getInstance()
				.getDiscovererUI("BasicDiscovererForTests");
		Assert.assertNotNull("discoverer not found in registry", discovererUI);
		Assert.assertEquals(discovererUI.getId(),
				"BasicDiscovererForTests");
		Assert.assertNotNull(discovererUI.getLabel());
		Assert.assertTrue(discovererUI.getLabel().length() > 0);
		Assert.assertNotNull(discovererUI.getImageIcon());
	}
}
