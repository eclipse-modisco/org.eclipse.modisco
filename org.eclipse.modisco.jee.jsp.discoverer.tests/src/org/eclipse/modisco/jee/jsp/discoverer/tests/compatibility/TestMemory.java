/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.jee.jsp.discoverer.tests.compatibility;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.modisco.jee.jsp.discoverer.actions.DefaultDiscoverer;
import org.eclipse.modisco.jee.jsp.discoverer.actions.DiscoverJspModelFromFile;
import org.eclipse.modisco.jee.jsp.discoverer.tests.Activator;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474894
 */
@Deprecated
public class TestMemory {

	private static final String RESOURCES_TEST_MEMORY = "/resources/memory.jsp"; //$NON-NLS-1$
	private static final long MAXIMUM_EXPECTED_MEM_USE = 200;

	@Test(timeout = 5 * 60 * 1000)
	public void memoryTest() throws Exception {
		final long totalMemory = Runtime.getRuntime().totalMemory();

		IProject oldProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(Activator.PLUGIN_ID);
		if (oldProject.exists()) {
			oldProject.delete(true, true, new NullProgressMonitor());
		}
		// Bundle bundle =
		// Platform.getPlugin(JUnitPlugin.PLUGIN_ID).getBundle();
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

		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, new Boolean(
				true));

		DiscoverJspModelFromFile jspDiscoverer = new DiscoverJspModelFromFile();
		jspDiscoverer.discoverElement(jspFile, parameters);

		final long memoryUsed = (Runtime.getRuntime().totalMemory() - totalMemory) / 1024 / 1024;

		System.out.println("Memory Used :" + memoryUsed);

		Assert.assertTrue(
				"Abnormal memory use for TestMemory.java\n " + memoryUsed //$NON-NLS-1$
						+ " > " + TestMemory.MAXIMUM_EXPECTED_MEM_USE, //$NON-NLS-1$
				memoryUsed < TestMemory.MAXIMUM_EXPECTED_MEM_USE);

	}
}
