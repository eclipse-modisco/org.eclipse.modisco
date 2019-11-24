/*******************************************************************************
 * Copyright (c) 2019 Mia-Software and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Unknown - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests;

import org.junit.Assert;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.core.tests.discoverers.AbstractModelDiscovererSubClass;
import org.junit.Test;

public class TestAbstractModelDiscoverer {

	/**
	 * Test the use of {@link AbstractModelDiscoverer} basic parameters and
	 * behaviors
	 */
	@Test
	public void testAbstractModelDiscoverer() {
		AbstractModelDiscovererSubClass aDiscoverer = new AbstractModelDiscovererSubClass();
		IProject aProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("MyProject"); //$NON-NLS-1$
		try {
			aProject.create(new NullProgressMonitor());
			aProject.open(new NullProgressMonitor());
		} catch (CoreException e1) {
			Assert.fail();
		}
		aDiscoverer.setTargetURI(URI.createPlatformResourceURI(
				"/MyProject/my.ecore", true)); //$NON-NLS-1$
		aDiscoverer.setSerializeTarget(true);

		try {
			// creates a ecore file with a package having name of discovery
			// source
			aDiscoverer.discoverElement(aProject, new NullProgressMonitor());
		} catch (DiscoveryException e) {
			Assert.fail();
		}

		Resource aResource = aDiscoverer.getTargetModel();
		Assert.assertTrue(aResource != null
				&& aResource.getContents().size() > 0);

		@SuppressWarnings("null")
		EObject element = aResource.getContents().get(0);
		Assert.assertTrue(element instanceof EPackage);
		Assert.assertTrue(((EPackage) element).getName().equals(
				aProject.getName()));
	}
}
