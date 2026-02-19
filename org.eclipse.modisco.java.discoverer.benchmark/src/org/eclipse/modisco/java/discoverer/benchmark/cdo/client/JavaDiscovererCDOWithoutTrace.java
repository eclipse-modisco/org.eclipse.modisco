/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *     Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 */
package org.eclipse.modisco.java.discoverer.benchmark.cdo.client;

import java.text.SimpleDateFormat;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.cdo.server.Server;
import org.eclipse.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.modisco.java.discoverer.benchmark.Messages;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.server.DerbyCDOServerNoAudits;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;

public class JavaDiscovererCDOWithoutTrace extends BenchmarkJavaDiscovererCDO {

	private static final long SLEEP_TIME = 20000;

	@Override
	protected Resource createTargetModel() {
		try {
			IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Starting server: " //$NON-NLS-1$
					+ DerbyCDOServerNoAudits.class.getSimpleName());
			Activator.getDefault().getLog().log(status);
			Server server = new DerbyCDOServerNoAudits();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
			server.start("db" + formatter.format(System.currentTimeMillis()), this.getPort()); //$NON-NLS-1$
			// ILaunch iLaunch = launch(serverClass.getSimpleName(), port);
			Thread.sleep(JavaDiscovererCDOWithoutTrace.SLEEP_TIME);
			IStatus status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Starting discovery"); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status2);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return super.createTargetModel();
	}

	@Override
	protected Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.ALGO_VARIANT,
				Messages.JavaDiscovererCDOWithoutTrace_0);
		return properties;
	}
}
