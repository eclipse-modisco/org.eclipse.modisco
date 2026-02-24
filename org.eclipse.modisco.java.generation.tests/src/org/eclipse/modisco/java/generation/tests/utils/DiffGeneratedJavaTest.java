/*******************************************************************************
 * Copyright (c) 2009, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.generation.tests.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.common.core.files.FileUtils;
import org.eclipse.modisco.common.tests.TestFileUtils;
import org.eclipse.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.modisco.java.generation.tests.Activator;
import org.eclipse.modisco.java.generation.tests.Messages;
import org.junit.Assert;
import org.osgi.framework.Bundle;

/**
 * Test on generated java files from javaxmi model file. Generated java code is
 * compared char by char (excluding white spaces).
 *
 */
public abstract class DiffGeneratedJavaTest {

	private static final Bundle TEST_BUNDLE = Activator
			.getDefault().getBundle();

	protected final class JavaFileFilter implements FilenameFilter {
		public JavaFileFilter() {
		}

		@Override
		public boolean accept(final File file, final String fileName) {
			return ((new File(file, fileName).isDirectory() && fileName
					.indexOf("svn") == -1) || fileName.toLowerCase().endsWith(//$NON-NLS-1$
					".java"));
		}
	}

	protected abstract String getJavaXmiFilePath();

	/**
	 * Get the Java model for generation
	 */
	protected File getInputModelFile() throws Exception {
		IProject project = getWorkspaceAuxiliaryProject();

		FileUtils.copyFileFromBundle(TEST_BUNDLE, getJavaXmiFilePath(), project, getJavaXmiFilePath());
		Path path = new Path(getJavaXmiFilePath());
		IFile iFile = project.getFile(path);
		File xmlFile = iFile.getLocation().toFile();
		return xmlFile;
	}

	protected abstract String getCodeSourceReferencePath();
	protected abstract Bundle getCodeSourceReferenceBundle();
	protected abstract String getDeployedCodeSourceReferencePath();


	/**
	 * Get the Java code reference folder
	 */
	protected File getJavaSourceDirectory() throws Exception {
		// Retrieving source code from another plugin : java discovery tests
		// and deploy it in workspace (it cannot be used directly since
		// potentially zipped)
		IProject project = getWorkspaceAuxiliaryProject();

		TestFileUtils.deepCopy(getCodeSourceReferenceBundle(), getCodeSourceReferencePath(),
				project, getDeployedCodeSourceReferencePath());

		Path path = new Path(getDeployedCodeSourceReferencePath());
		IFile iFile = project.getFile(path);
		File javaDirectory = iFile.getLocation().toFile();

		System.out
				.println(Messages.DiffGeneratedJavaTest_original_Files_Location
						+ javaDirectory.getAbsolutePath());

		return javaDirectory;
	}

	/**
	 * Get The target folder for java generation
	 *
	 * @return
	 */
	protected File prepareOutputDirectory() {
		IPath path = Platform.getStateLocation(TEST_BUNDLE);
		File outputDirectory = new File(path.toOSString(), "JavaOutput." + getClass().getName());
		// String bundleLocation = Activator.getDefault().getBundle()
		// .getLocation();
		//		IPath path = new Path(bundleLocation.replaceAll("reference.file..", "") //$NON-NLS-2$
		//				+ "target");
		// File outputDirectory = new File(path.toOSString());

		if (outputDirectory.exists()) {
			TestFileUtils.clearFolder(outputDirectory);
		} else {
			outputDirectory.mkdir();
		}

		System.out.println(Messages.DiffGeneratedJavaTest_target_Files_Location
				+ outputDirectory.getAbsolutePath());

		return outputDirectory;
	}

	protected void generateJavaCode(final File javaModel, final File outputDirectory) throws IOException {

		URI modelURI = URI.createFileURI(javaModel.getAbsolutePath());
		GenerateJavaExtended javaGenerator = new GenerateJavaExtended(modelURI, outputDirectory, null);
		
		Assert.assertNotNull("Java Model instance is null before generation",
				javaGenerator.getModel());
		Assert.assertTrue(
				"Java Model instance not found in java model before generation",
				javaGenerator.getModel().eClass().getName().equals("Model"));
		javaGenerator.doGenerate(null);
	}

	/**
	 * Gets a IProject for deploying tests resources.
	 *
	 * @return
	 * @throws CoreException
	 */
	private IProject getWorkspaceAuxiliaryProject() throws CoreException {
		String projectName = "Java." + getClass().getName();
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		ws.getRoot().refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
		IProject project = ws.getRoot().getProject(projectName);
		if (!project.exists()) {
			project.create(new NullProgressMonitor());
		}
		project.open(new NullProgressMonitor());
		return project;
	}

}
