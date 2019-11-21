/*********************************************************************************
 * Copyright (c) 2009,2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework (Bug 335003)
 *********************************************************************************/
package org.eclipse.modisco.jee.jsp.discoverer.tests;

import static org.junit.Assert.assertNotNull;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.jee.jsp.discoverer.DiscoverJspModelFromResource;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestMemory {

	private static final String RESOURCES_TEST_MEMORY = "/resources/memory.jsp"; //$NON-NLS-1$
	private static final long EXPECTED_MEM_MAXIMUM = 200;

	@Test
	public void memoryTest() throws Exception {
		final long totalMemory = Runtime.getRuntime().totalMemory();

		IProject oldProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(Activator.PLUGIN_ID);
		if (oldProject.exists()) {
			oldProject.delete(true, true, new NullProgressMonitor());
		}
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);

		IProject project = null;

		project = ProjectUtils.importPlugin(bundle);

		if (project == null) {
			throw new NullPointerException();
		}

		IFile jspFile = project.getFile(TestMemory.RESOURCES_TEST_MEMORY);
		Assert.assertTrue(
				"Could not access the test file :" + jspFile.getName(),
				jspFile.exists());

		DiscoverJspModelFromResource discoverer = new DiscoverJspModelFromResource();
		discoverer.discoverElement(jspFile, new NullProgressMonitor());
		Resource targetModel = discoverer.getTargetModel();
		assertNotNull(targetModel);

		final long memoryUsed = (Runtime.getRuntime().totalMemory() - totalMemory) / 1024 / 1024;

		System.out.println("Memory Used :" + memoryUsed);

		Assert.assertTrue(
				"Abnormal memory use for TestMemory.java\n " + memoryUsed //$NON-NLS-1$
						+ " > " + TestMemory.EXPECTED_MEM_MAXIMUM, //$NON-NLS-1$
				memoryUsed < TestMemory.EXPECTED_MEM_MAXIMUM);

	}
}
