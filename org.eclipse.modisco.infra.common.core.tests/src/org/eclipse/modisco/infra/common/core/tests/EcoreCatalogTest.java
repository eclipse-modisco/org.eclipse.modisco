/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.tests;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.internal.builder.EcoreBuilder;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class EcoreCatalogTest {

	private static final String FILE_EXT = "." + EcoreBuilder.FILE_EXTENSION; //$NON-NLS-1$

	/**
	 * Check that when we move a facet to another directory we don't get wrong
	 * name conflict error markers.
	 *
	 * @throws Exception
	 */
	@Test
	public void bug309657() throws Exception {
		final String name = "bug309657"; //$NON-NLS-1$
		IProject project = ProjectUtils.createTestProject(name, Activator.getDefault().getBundle(),
				"."); //$NON-NLS-1$
		FileUtils.copyFileFromBundle("resources/" + name + EcoreCatalogTest.FILE_EXT, //$NON-NLS-1$
				project, name + EcoreCatalogTest.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		IFolder folder = project.getFolder("f1"); //$NON-NLS-1$
		folder.create(true, true, new NullProgressMonitor());
		IFile sourceFile = project.getFile(name + EcoreCatalogTest.FILE_EXT);
		IPath sourcePath = sourceFile.getFullPath();
		IPath targetPath = new Path(folder.getFullPath() + "/" + name //$NON-NLS-1$
				+ EcoreCatalogTest.FILE_EXT);
		sourceFile.move(targetPath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFile(targetPath);
		IMarker[] markers = targetFile.findMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
		targetFile.move(sourcePath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		markers = sourceFile.findMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
	}

	/**
	 * Check that when we change the nsURI of an Ecore file the old nsURI is
	 * removed from the EPackage.Registry. Check that when we remove an ecore
	 * file the corresponding EPackage is removed from the EPackage.Registry
	 *
	 * @throws Exception
	 */
	@Test
	public void bug309990() throws Exception {
		final String name = "bug309990"; //$NON-NLS-1$
		String nsURI = "http://www.eclipse.org/MoDisco/bug309990"; //$NON-NLS-1$
		Assert.assertNull(EPackage.Registry.INSTANCE.get(nsURI));
		IProject project = ProjectUtils.createTestProject(name, Activator.getDefault().getBundle(),
				"."); //$NON-NLS-1$
		FileUtils.copyFileFromBundle("resources/" + name + EcoreCatalogTest.FILE_EXT, //$NON-NLS-1$
				project, name + EcoreCatalogTest.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		Assert.assertNotNull(EPackage.Registry.INSTANCE.get(nsURI));
		FileUtils.copyFileFromBundle("resources/" + name + "_bis" + EcoreCatalogTest.FILE_EXT, //$NON-NLS-1$ //$NON-NLS-2$
				project, name + EcoreCatalogTest.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		Assert.assertNotNull(EPackage.Registry.INSTANCE.get(nsURI + "_bis")); //$NON-NLS-1$
		Assert.assertNull(EPackage.Registry.INSTANCE.get(nsURI));
		project.getFile(name + EcoreCatalogTest.FILE_EXT).delete(true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		Assert.assertNull(EPackage.Registry.INSTANCE.get(nsURI + "_bis")); //$NON-NLS-1$
	}
}
