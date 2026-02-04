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

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import org.eclipse.acceleo.aql.evaluation.GenerationResult;
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
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
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
					".java")); //$NON-NLS-1$
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
				MoDiscoLogger.logError(e1, Activator.getDefault());
			}
		} else {
			String subDestinationPath = "/"; //$NON-NLS-1$
			if (!destinationPath.equals("/")) { //$NON-NLS-1$
				IFolder folder = destinationProject.getFolder(destinationPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						MoDiscoLogger.logError(e1, Activator.getDefault());
					}
				}
				subDestinationPath = folder.getProjectRelativePath().toString();
			}
			while (e.hasMoreElements()) {
				Object object = e.nextElement();
				if (object instanceof String) {
					String subpath = (String) object;
					if (!subpath.matches(".*/\\.svn/")) { //$NON-NLS-1$
						String dest = subDestinationPath
								+ subpath.substring(sourcePath.length() - 1);
						deepCopy(subpath, sourceBundle, destinationProject,
								dest);
					}
				} else {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
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
		File outputDirectory = new File(path.toOSString(), "JavaOutput." + getClass().getName()); //$NON-NLS-1$
		// String bundleLocation = Activator.getDefault().getBundle()
		// .getLocation();
		//		IPath path = new Path(bundleLocation.replaceAll("reference.file..", "") //$NON-NLS-1$ //$NON-NLS-2$
		//				+ "target"); //$NON-NLS-1$
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

	protected void generateJavaCode3(final File javaModel, final File outputDirectory) throws IOException {

		GenerateJavaExtended javaGenerator = new GenerateJavaExtended(URI
				.createFileURI(javaModel.getAbsolutePath()), outputDirectory,
				new ArrayList<Object>());
		Assert.assertNotNull("Java Model instance is null before generation", //$NON-NLS-1$
				javaGenerator.getModel());
		Assert.assertTrue(
				"Java Model instance not found in java model before generation", //$NON-NLS-1$
				javaGenerator.getModel().eClass().getName().equals("Model")); //$NON-NLS-1$
		javaGenerator.doGenerate(null);
	}

	protected void generateJavaCode4(final File javaModel, final File outputDirectory) throws IOException {

		List<String> resourcePaths = Collections.singletonList(javaModel.getAbsolutePath());
		GenerateJavaExtended javaGenerator = new GenerateJavaExtended(resourcePaths, outputDirectory.getAbsolutePath());
		
		List<Resource> resources = javaGenerator.loadResources(new ResourceSetImpl(), resourcePaths, new BasicMonitor());
		Assert.assertFalse("No Java Model before generation", //$NON-NLS-1$
				resources.isEmpty());
		Assert.assertFalse("No Java Model before generation", //$NON-NLS-1$
				resources.get(0).getContents().isEmpty());
		Assert.assertTrue(
				"Java Model instance not found in java model before generation", //$NON-NLS-1$
				resources.get(0).getContents().get(0).eClass().getName().equals("Model")); //$NON-NLS-1$
		GenerationResult generationResult = javaGenerator.generate(new BasicMonitor());

		assertTrue("Acceleo generation failed", generationResult.getDiagnostic().getSeverity() < Diagnostic.WARNING);
	}

	protected String generateJavaCodeDirect(final File javaModel, final File outputDirectory) throws IOException {

		List<String> resourcePaths = Collections.singletonList(javaModel.getAbsolutePath());
		GenerateJavaExtended javaGenerator = new GenerateJavaExtended(resourcePaths, outputDirectory.getAbsolutePath());
		
		List<Resource> resources = javaGenerator.loadResources(new ResourceSetImpl(), resourcePaths, new BasicMonitor());
		Assert.assertFalse("No Java Model before generation", //$NON-NLS-1$
				resources.isEmpty());
		Assert.assertFalse("No Java Model before generation", //$NON-NLS-1$
				resources.get(0).getContents().isEmpty());
		Assert.assertTrue(
				"Java Model instance not found in java model before generation", //$NON-NLS-1$
				resources.get(0).getContents().get(0).eClass().getName().equals("Model")); //$NON-NLS-1$

		JavaModel2JavaTextSwitch javaModel2javaTextSwitch = new JavaModel2JavaTextSwitch(outputDirectory.getAbsolutePath());
		Map<String, String> file2text = javaModel2javaTextSwitch.generate(resources);
		List<String> fileKeys = new ArrayList<>(file2text.keySet());
		Collections.sort(fileKeys);
		for (String fileKey : fileKeys) {
			String fileText = file2text.get(fileKey);
			System.out.println("*******************************************");
			System.out.println(fileKey);
			System.out.println("*******************************************");
			System.out.println(fileText);
			File file = new File(fileKey);
			file.getParentFile().mkdirs();
			FileWriter fw = new FileWriter(file);
			fw.append(fileText);
			fw.close();
		}
		return "";
		
		
	//	GenerationResult generationResult = javaGenerator.generate(new BasicMonitor());

	//	assertTrue("Acceleo generation failed", generationResult.getDiagnostic().getSeverity() < Diagnostic.WARNING);
	//	return javaModel2javaTextSwitch.toString();
	}

	/**
	 * Gets a IProject for deploying tests resources.
	 *
	 * @return
	 * @throws CoreException
	 */
	private IProject getWorkspaceAuxiliaryProject() throws CoreException {
		String projectName = "Java." + getClass().getName(); //$NON-NLS-1$
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
