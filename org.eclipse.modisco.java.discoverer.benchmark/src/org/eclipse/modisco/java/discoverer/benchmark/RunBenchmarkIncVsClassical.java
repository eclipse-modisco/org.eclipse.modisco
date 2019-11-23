/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.benchmark;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererClassicalEMF;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.Statistics;

public class RunBenchmarkIncVsClassical extends AbstractRunBenchmark {

	private static final int NB_BENCHMARK = 10;

	@Override
	public void discoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		for (int i = 0; i < RunBenchmarkIncVsClassical.NB_BENCHMARK; i++) {
			initStatProject(source);
			// XMI, incremental
			disco(source, JavaDiscovererIncrementalEMF.class, monitor);
			// Reference discoverer
			disco(source, JavaDiscovererClassicalEMF.class, monitor);
		}
		Statistics.copyLog(getStatProject().getLocation().toFile());
	}
}
