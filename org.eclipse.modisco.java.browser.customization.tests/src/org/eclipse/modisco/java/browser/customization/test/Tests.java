/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.browser.customization.test;

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
import org.eclipse.modisco.infra.common.core.internal.utils.IFilter;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Tests {

	public static final String NAME = "javaTypesCustomizationFacet"; //$NON-NLS-1$

	@Test
	public void javaTypesCustomizationFacetTest() {

		FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet(
				Tests.NAME);
		Assert.assertNotNull(facetSet);

		Facet facet = facetSet.getFacet("AbstractBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet);
		Facet facet1 = facetSet.getFacet("StaticBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet1);
		Facet facet2 = facetSet.getFacet("TransientBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet2);
		Facet facet3 = facetSet.getFacet("SynchronizedBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet3);
		Facet facet4 = facetSet.getFacet("VolatileBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet4);
		Facet facet5 = facetSet.getFacet("NativeBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet5);
		Facet facet6 = facetSet.getFacet("FinalBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet6);
		Facet facet7 = facetSet.getFacet("DeprecatedBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet7);
		Facet facet8 = facetSet.getFacet("SuppressWarningsBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet8);
		Facet facet9 = facetSet.getFacet("DefaultMethodDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet9);
		Facet facet10 = facetSet.getFacet("PublicMethodDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet10);
		Facet facet11 = facetSet.getFacet("PrivateMethodDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet11);
		Facet facet12 = facetSet.getFacet("ProtectedMethodDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet12);
		Facet facet13 = facetSet.getFacet("ProtectedFieldDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet13);
		Facet facet14 = facetSet.getFacet("PrivateFieldDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet14);
		Facet facet15 = facetSet.getFacet("DefaultFieldDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet15);
		Facet facet16 = facetSet.getFacet("PublicFieldDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet16);
		Facet facet17 = facetSet.getFacet("AccessElement"); //$NON-NLS-1$
		Assert.assertNotNull(facet17);
		Facet facet18 = facetSet.getFacet("UnresolvedElement"); //$NON-NLS-1$
		Assert.assertNotNull(facet18);
		Facet facet19 = facetSet.getFacet("StaticImport"); //$NON-NLS-1$
		Assert.assertNotNull(facet19);
		Facet facet20 = facetSet.getFacet("TypeReference"); //$NON-NLS-1$
		Assert.assertNotNull(facet20);
		Facet facet21 = facetSet.getFacet("PrivateConstructorDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet21);
		Facet facet22 = facetSet.getFacet("PrivateClassDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet22);
		Facet facet23 = facetSet.getFacet("GeneratedBodyDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet23);
		Facet facet24 = facetSet.getFacet("ProtectedConstructorDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet24);
		Facet facet25 = facetSet.getFacet("ProtectedClassDeclaration"); //$NON-NLS-1$
		Assert.assertNotNull(facet25);
	}

	@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470350
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
						Platform.getBundle("org.eclipse.modisco.infra.browser.custom.examples.uml"), //$NON-NLS-1$
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
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(
				"org.eclipse.modisco.java.browser.customization"); //$NON-NLS-1$
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
