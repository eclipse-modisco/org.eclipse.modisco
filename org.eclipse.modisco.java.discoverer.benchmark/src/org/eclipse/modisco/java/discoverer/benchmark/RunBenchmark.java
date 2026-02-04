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
 *     Grégoire Dupe (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 */
package org.eclipse.modisco.java.discoverer.benchmark;

import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.common.cdo.derby.DerbyCDOServer;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.client.BenchmarkJavaDiscovererCDO;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.client.nousage.JavaDiscovererCDONoUsages;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.server.DerbyCDOServerNoAudits;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.server.H2CDOServer;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererClassicalEMF;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFMinimalEObject;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFNoUsages;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalClassicalEMF;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.Statistics;

public class RunBenchmark extends AbstractRunBenchmark {

	@Override
	public MultiProjectBenchmark createReport(final IJavaProject source,
			final IProgressMonitor monitor) throws CoreException, IOException {
		initStatProject(source);
		benchmark(source, monitor);
		Statistics.copyLog(getStatProject().getLocation().toFile());
		Report report = new Report(getStatProject());
		MultiProjectBenchmark benchmarkModel = report.generate();

		try {
			getStatProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			MoDiscoLogger.logWarning(e, Activator.getDefault());
		}
		return benchmarkModel;
	}

	private long before;

	private void begin(final String name) {
		System.out.println("beginning: " + name); //$NON-NLS-1$
		this.before = System.currentTimeMillis();
	}

	private void end() {
		System.out.println("took : " + (System.currentTimeMillis() - this.before)); //$NON-NLS-1$
	}

	protected void benchmark(final IJavaProject source, final IProgressMonitor monitor) {
		// XMI, incremental
		begin("XMI, incremental"); //$NON-NLS-1$
		disco(source, JavaDiscovererIncrementalEMF.class, monitor);
		end();

		// XMI, MinimalEObject
		begin("XMI, MinimalEObject"); //$NON-NLS-1$
		disco(source, JavaDiscovererEMFMinimalEObject.class, monitor);
		end();

		// XMI, Without usages
		begin("XMI, Without usages"); //$NON-NLS-1$
		disco(source, JavaDiscovererEMFNoUsages.class, monitor);
		end();

		// Reference discoverer
		begin("Reference discoverer"); //$NON-NLS-1$
		disco(source, JavaDiscovererClassicalEMF.class, monitor);
		end();

		// Incremental and classical EMF
		begin("Incremental and classical EMF"); //$NON-NLS-1$
		disco(source, JavaDiscovererIncrementalClassicalEMF.class, monitor);
		end();

		// CDO+H2, No audits, With usage
		begin("CDO+H2, No audits, With usage"); //$NON-NLS-1$
		serverAndDisco(source, H2CDOServer.class, BenchmarkJavaDiscovererCDO.class, monitor);
		end();

		// CDO+H2, No audits, Without usages
		begin("CDO+H2, No audits, Without usages"); //$NON-NLS-1$
		serverAndDisco(source, H2CDOServer.class, JavaDiscovererCDONoUsages.class, monitor);
		end();

		// CDO+Derby, No audits, With usages
		begin("CDO+Derby, No audits, With usages"); //$NON-NLS-1$
		serverAndDisco(source, DerbyCDOServerNoAudits.class, BenchmarkJavaDiscovererCDO.class,
				monitor);
		end();

		// CDO+Derby, No audits, Without usages
		begin("CDO+Derby, No audits, Without usages"); //$NON-NLS-1$
		serverAndDisco(source, DerbyCDOServerNoAudits.class, JavaDiscovererCDONoUsages.class,
				monitor);
		end();

		// CDO+Derby, with audits, With usages
		begin("CDO+Derby, with audits, With usages"); //$NON-NLS-1$
		serverAndDisco(source, DerbyCDOServer.class, BenchmarkJavaDiscovererCDO.class, monitor);
		end();
	}
}
