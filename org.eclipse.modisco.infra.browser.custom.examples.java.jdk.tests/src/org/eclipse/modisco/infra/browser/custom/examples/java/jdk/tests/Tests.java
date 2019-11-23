/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.java.jdk.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.IFilter;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Gregoire DUPE
 *
 */
public class Tests {

	private static final String PLUGIN_URI = "platform:/plugin/org.eclipse.modisco.infra.browser.custom.examples.java.jdk"; //$NON-NLS-1$

	@Test
	public void emfHighlightuiCustom() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI + "/_example_EMFHighlight.uiCustom"); //$NON-NLS-1$
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void jdkAndEclipseFacets() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI
				+ "/_example_jdkAndEclipseFacets.facetSet"); //$NON-NLS-1$
		FileUtils.checkEMFResource(uri, 1);
		FacetSetCatalog catalog = FacetSetCatalog.getSingleton();
		FacetSet facetSet = catalog.getFacetSet("_example_jdkAndEclipseFacets"); //$NON-NLS-1$
		Assert.assertNotNull(facetSet);
	}


	@Test
	public void jdkAndEclipseFacetsCustomization() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI
				+ "/_example_jdkAndEclipseFacetsCustomization.uiCustom"); //$NON-NLS-1$
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void jdkAndEclipseQuerySet() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI
				+ "/_example_jdkAndEclipseQuerySet.querySet"); //$NON-NLS-1$
		FileUtils.checkEMFResource(uri, 1);
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog
				.getModelQuerySet("_example_jdkAndEclipseQuerySet"); //$NON-NLS-1$
		Assert.assertNotNull(querySet);
	}

	@Test
	public void javaExample() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI
				+ "/org.eclipse.gmf.runtime.diagram.ui.actions.javaxmi"); //$NON-NLS-1$
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void bug308991() throws CoreException, IOException,
			InterruptedException {
		final List<IStatus> statusList = new ArrayList<IStatus>();
		ILogListener listener = new ILogListener() {
			public void logging(final IStatus status, final String plugin) {
				statusList.add(status);
			}
		};
		ILog log = Platform.getLog(Platform
				.getBundle("org.eclipse.modisco.infra.common.core")); //$NON-NLS-1$
		log.addLogListener(listener);
		ProjectUtils
				.importPlugin(
						Platform.getBundle("org.eclipse.modisco.infra.browser.custom.examples.java.jdk"), //$NON-NLS-1$
						new IFilter() {
							public boolean filter(final Object object) {
								boolean result = true;
								if (object instanceof File) {
									File file = (File) object;
									result = !file.getName().equals(
											".checkstyle"); //$NON-NLS-1$
								} else if (object instanceof String) {
									String str = (String) object;
									result = !str.equals(".checkstyle"); //$NON-NLS-1$
								}
								return result;
							}
						});
		IProject project = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getProject(
						"org.eclipse.modisco.infra.browser.custom.examples.java.jdk"); //$NON-NLS-1$
		ProjectUtils.refresh(project);
		log.removeLogListener(listener);
		if (!statusList.isEmpty()) {
			MultiStatus status = new MultiStatus(Activator.getDefault()
					.getBundle().getSymbolicName(), IStatus.ERROR, statusList
					.toArray(new IStatus[] {}), "Test failed.", new Exception()); //$NON-NLS-1$
			CoreException e = new CoreException(status);
			MoDiscoLogger.logError(e, Activator.getDefault());
			throw e;
		}
	}

}
