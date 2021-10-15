/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 343155 - Java discoverer time benchmark
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkConstants;
import org.eclipse.modisco.infra.discovery.core.AbstractDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.benchmark.template.html.HtmlReport2;

public class JavaBenchmarkHtmlReportDiscoverer extends AbstractDiscoverer<IFile> {

	public static final String TARGET_FILENAME = "javaDiscoveryBenchmark.html"; //$NON-NLS-1$

	public boolean isApplicableTo(final IFile source) {
		try {
			return source.exists()
					&& BenchmarkConstants.CONTENT_TYPE.equals(source.getContentDescription()
							.getContentType().getId());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
			return false;
		}
	}

	public static IFile generateBenchmarkReport(final Benchmark benchmark,
			final IContainer location, final IProgressMonitor monitor) throws IOException, CoreException {

		ArrayList<Object> arguments = new ArrayList<Object>();
		arguments.add(JavaBenchmarkHtmlReportDiscoverer.TARGET_FILENAME);
		new HtmlReport2(benchmark, location.getLocation().toFile(), arguments).doGenerate(null);
		// refresh needed because Acceleo generates without using the
		// workspace IResource API
		location.refreshLocal(IResource.DEPTH_INFINITE, monitor);

		return location.getFile(new Path(JavaBenchmarkHtmlReportDiscoverer.TARGET_FILENAME));
	}

	@Override
	protected void basicDiscoverElement(final IFile source, final IProgressMonitor monitor)
			throws DiscoveryException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(
				URI.createPlatformResourceURI(source.getFullPath().toString(), true), true);
		try {
			resource.load(Collections.emptyMap());
			Benchmark benchmark = (Benchmark) resource.getContents().get(0);
			generateBenchmarkReport(benchmark, source.getParent(), monitor);
		} catch (IOException e) {
			throw new DiscoveryException(e);
		} catch (CoreException e) {
			throw new DiscoveryException(e);
		}
	}
}
