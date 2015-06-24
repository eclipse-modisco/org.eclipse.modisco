/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *     Gregoire DUPE (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks

 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.cdo.derby.DerbyCDOServer;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.client.BenchmarkJavaDiscovererCDO;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.client.nousage.JavaDiscovererCDONoUsages;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.server.DerbyCDOServerNoAudits;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.server.H2CDOServer;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererClassicalEMF;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFMinimalEObject;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFNoUsages;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalClassicalEMF;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.Statistics;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class RunBenchmark extends AbstractRunBenchmark {

	@Override
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		try {
			createReport(source);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

	}

	@Override
	public MultiProjectBenchmark createReport(final Object source) throws CoreException, IOException {
		initStatProject((IJavaProject) source);
		benchmark(source);
		Statistics.copyLog(getStatProject().getLocation().toFile());
		Report report = new Report(getStatProject());
		MultiProjectBenchmark benchmarkModel = report.generate();

		try {
			getStatProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
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

	protected void benchmark(final Object source) {
		// XMI, incremental
		begin("XMI, incremental"); //$NON-NLS-1$
		disco(source, JavaDiscovererIncrementalEMF.class);
		end();

		// XMI, MinimalEObject
		begin("XMI, MinimalEObject"); //$NON-NLS-1$
		disco(source, JavaDiscovererEMFMinimalEObject.class);
		end();

		// XMI, Without usages
		begin("XMI, Without usages"); //$NON-NLS-1$
		disco(source, JavaDiscovererEMFNoUsages.class);
		end();

		// Reference discoverer
		begin("Reference discoverer"); //$NON-NLS-1$
		disco(source, JavaDiscovererClassicalEMF.class);
		end();

		// Incremental and classical EMF
		begin("Incremental and classical EMF"); //$NON-NLS-1$
		disco(source, JavaDiscovererIncrementalClassicalEMF.class);
		end();

		// CDO+H2, No audits, With usage
		begin("CDO+H2, No audits, With usage"); //$NON-NLS-1$
		serverAndDisco(source, H2CDOServer.class, BenchmarkJavaDiscovererCDO.class);
		end();

		// CDO+H2, No audits, Without usages
		begin("CDO+H2, No audits, Without usages"); //$NON-NLS-1$
		serverAndDisco(source, H2CDOServer.class, JavaDiscovererCDONoUsages.class);
		end();

		// CDO+Derby, No audits, With usages
		begin("CDO+Derby, No audits, With usages"); //$NON-NLS-1$
		serverAndDisco(source, DerbyCDOServerNoAudits.class, BenchmarkJavaDiscovererCDO.class);
		end();

		// CDO+Derby, No audits, Without usages
		begin("CDO+Derby, No audits, Without usages"); //$NON-NLS-1$
		serverAndDisco(source, DerbyCDOServerNoAudits.class, JavaDiscovererCDONoUsages.class);
		end();

		// CDO+Derby, with audits, With usages
		begin("CDO+Derby, with audits, With usages"); //$NON-NLS-1$
		serverAndDisco(source, DerbyCDOServer.class, BenchmarkJavaDiscovererCDO.class);
		end();
	}
}
