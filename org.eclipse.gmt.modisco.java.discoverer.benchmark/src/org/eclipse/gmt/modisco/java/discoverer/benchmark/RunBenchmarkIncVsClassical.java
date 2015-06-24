/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark;

import java.util.Map;

import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererClassicalEMF;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.Statistics;
import org.eclipse.jdt.core.IJavaProject;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class RunBenchmarkIncVsClassical extends AbstractRunBenchmark {

	private static final int NB_BENCHMARK = 10;

	@Override
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		for (int i = 0; i < RunBenchmarkIncVsClassical.NB_BENCHMARK; i++) {
			initStatProject((IJavaProject) source);
			// XMI, incremental
			disco(source, JavaDiscovererIncrementalEMF.class);
			// Reference discoverer
			disco(source, JavaDiscovererClassicalEMF.class);
		}
		Statistics.copyLog(this.getStatProject().getLocation().toFile());
	}

}
