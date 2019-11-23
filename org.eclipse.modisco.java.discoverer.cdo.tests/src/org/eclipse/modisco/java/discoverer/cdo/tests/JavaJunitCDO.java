/**
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.cdo.tests;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.common.cdo.derby.DerbyCDOServer;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.cdo.JavaDiscovererCDO;
import org.eclipse.modisco.java.discoverer.tests.JavaJUnitEMF;
import org.junit.AfterClass;
import org.junit.Ignore;

@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=399504
public class JavaJunitCDO extends JavaJUnitEMF {

	private final int port = 2036;
	private static DerbyCDOServer server;

	@Override
	protected void loadResource(final IJavaProject javaProject)
			throws Exception {
		if (JavaJunitCDO.server == null) {
			JavaJunitCDO.server = new DerbyCDOServer();
			JavaJunitCDO.server.start("db" + System.currentTimeMillis(), //$NON-NLS-1$
					this.port);
		}
		// ILaunch iLaunch = launch(serverClass.getSimpleName(), port);
		synchronized (JavaJunitCDO.server) {
			long before = System.currentTimeMillis();
			final int waitTime = 100;
			while (!JavaJunitCDO.server.isStarted()) {
				JavaJunitCDO.server.wait(waitTime);
			}
			System.out
					.println("CDO server took " + (System.currentTimeMillis() - before) + " ms to start"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"Starting discovery"); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status);
		JavaDiscovererCDO discoverer = new JavaDiscovererCDO() {
			@Override
			protected void endAnalyzeJavaProject(final Model model) {
				// leave the session open
			}
		};
		discoverer.setPort(this.port);
		Resource resource = null;

		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		resource = discoverer.getTargetModel();

		if (resource == null) {
			throw new IllegalStateException(
					"Resource is null : error in discovery"); //$NON-NLS-1$
		}
		setResource(resource);
	}

	@AfterClass
	public static void stopServer() {
		JavaJunitCDO.server.stop();
	}
}
