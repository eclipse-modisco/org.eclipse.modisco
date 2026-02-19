/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.tests;

import java.util.Set;
import java.util.Stack;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.discovery.ui.internal.registry.DiscovererUI;
import org.eclipse.modisco.infra.discovery.ui.internal.registry.DiscovererUIRegistry;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

import com.google.common.collect.Sets;

public class TestDiscovererUI {
	@Test
	public void testDiscovererUIExtension() {
		Bundle bundle = CommonModiscoActivator.getDefault().getBundle();
		String symbolicName = bundle.getSymbolicName();
		String prefix = "In plug-in=\"" + Activator.getContext().getBundle().getSymbolicName() + "\"; extension=\"org.eclipse.modisco.infra.discovery.ui.discoverer\": attribute discovererID=\"";
		String suffix = "\" doesn't refer to an existing discoverer. (" + symbolicName + "_" + bundle.getVersion() + ")";
		Status status1 = new Status(IStatus.ERROR, symbolicName, prefix + "BasicDiscovererForTests" + suffix, null);
		Status status2 = new Status(IStatus.ERROR, symbolicName, prefix + "AbstractModelDiscovererForTests" + suffix, null);
		Logger.addExpectedStatuses(Sets.newHashSet(status1, status2));
		DiscovererUI discovererUI = DiscovererUIRegistry.getInstance()
				.getDiscovererUI("BasicDiscovererForTests");
		Assert.assertNotNull("discoverer not found in registry", discovererUI);
		Assert.assertEquals(discovererUI.getId(),
				"BasicDiscovererForTests");
		Assert.assertNotNull(discovererUI.getLabel());
		Assert.assertTrue(discovererUI.getLabel().length() > 0);
		Assert.assertNotNull(discovererUI.getImageIcon());
		Stack<Set<IStatus>> residualExpectedStatuses = Logger.resetExpectedStatuses();
		Assert.assertNull("Not all expected status messages logged", residualExpectedStatuses);
	}
}
