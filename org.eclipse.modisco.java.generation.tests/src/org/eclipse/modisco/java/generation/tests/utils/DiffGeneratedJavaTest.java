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
import java.io.InputStream;
import java.util.Enumeration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.modisco.facet.util.core.Logger;
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

	protected final class JavaFileFilter implements FilenameFilter {
		public JavaFileFilter() {
		}

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
	protected File getInputModelFile() throws CoreException, IOException {
		IProject project = getWorkspaceAuxiliaryProject();

		FileUtils.copyFileFromBundle(getJavaXmiFilePath(),
				project, getJavaXmiFilePath(), Activator
						.getDefault().getBundle());
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
	protected File getJavaSourceDirectory() throws CoreException {
		// Retrieving source code from another plugin : java discovery tests
		// and deploy it in workspace (it cannot be used directly since
		// potentially zipped)
		IProject project = getWorkspaceAuxiliaryProject();

		deepCopy(getCodeSourceReferencePath(),
				getCodeSourceReferenceBundle(), project,
				getDeployedCodeSourceReferencePath());

		Path path = new Path(getDeployedCodeSourceReferencePath());
		IFile iFile = project.getFile(path);
		File javaDirectory = iFile.getLocation().toFile();

		System.out
				.println(Messages.DiffGeneratedJavaTest_original_Files_Location
						+ javaDirectory.getAbsolutePath());

		return javaDirectory;
	}

	private void deepCopy(final String sourcePath, final Bundle sourceBundle,
			final IProject destinationProject, final String destinationPath) {
		Enumeration<?> e = sourceBundle.getEntryPaths(sourcePath);
		if (e == null) {
			try { // single file
				InputStream source = sourceBundle.getEntry(sourcePath)
						.openStream();
				IFile javaFile = destinationProject.getFile(destinationPath);
				if (javaFile.exists()) {
					javaFile.delete(true, new NullProgressMonitor());
				}
				javaFile.create(source, true, new NullProgressMonitor());
			} catch (Exception e1) {
				Logger.logError(e1, Activator.getDefault());
			}
		} else {
			String subDestinationPath = "/";
			if (!destinationPath.equals("/")) {
				IFolder folder = destinationProject.getFolder(destinationPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						Logger.logError(e1, Activator.getDefault());
					}
				}
				subDestinationPath = folder.getProjectRelativePath().toString();
			}
			while (e.hasMoreElements()) {
				Object object = e.nextElement();
				if (object instanceof String) {
					String subpath = (String) object;
					if (!subpath.matches(".*/\\.svn/")) {
						String dest = subDestinationPath
								+ subpath.substring(sourcePath.length() - 1);
						deepCopy(subpath, sourceBundle, destinationProject,
								dest);
					}
				} else {
					throw new RuntimeException("Unexpected element type");
				}
			}
		}
	}

	/**
	 * Get The target folder for java generation
	 *
	 * @return
	 */
	protected File prepareOutputDirectory() {
		IPath path = Platform.getStateLocation(Activator.getDefault()
				.getBundle());
		File outputDirectory = new File(path.toOSString(), "JavaOutput." + getClass().getName());
		// String bundleLocation = Activator.getDefault().getBundle()
		// .getLocation();
		//		IPath path = new Path(bundleLocation.replaceAll("reference.file..", "") //$NON-NLS-2$
		//				+ "target");
		// File outputDirectory = new File(path.toOSString());

		if (outputDirectory.exists()) {
			FolderUtils.clearFolder(outputDirectory);
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
