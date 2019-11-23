/**
 *  Copyright (c) 2010-2012 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 368698 - GenerateJsp.emtl is missing in org.eclipse.modisco.jee.jsp.generation
 */
package org.eclipse.modisco.jee.jsp.generation.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Enumeration;

import junit.framework.Assert;

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
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.jee.jsp.generation.files.GenerateJsp;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * Test on generated jsp files from jspxmi model file.
 *
 */
public class DiffGeneratedJspTest {
	private static final String JSP_DISCOVERER_TESTS_PLUGINID = org.eclipse.modisco.jee.jsp.discoverer.tests.Activator.PLUGIN_ID;
	private static final String RESOURCES_TEST1_XML = "resources/org.eclipse.modisco.jee.jsp.discoverer.tests.jspxmi"; //$NON-NLS-1$
	private static final String RESOURCES_TEST1_JSP = "resources/"; //$NON-NLS-1$
	private static final String DEPLOYED_TEST1_JSP = "resources/"; //$NON-NLS-1$
	private static final String GENERATE_JSP_EMTL_FILE = "GenerateJsp.emtl";

	private final class JspFileFilter implements FilenameFilter {
		public JspFileFilter() {
			//
		}

		public boolean accept(final File file, final String fileName) {
			return ((new File(file, fileName).isDirectory() && fileName
					.indexOf("svn") == -1) || fileName.toLowerCase().endsWith(//$NON-NLS-1$
					".jsp")); //$NON-NLS-1$
		}
	}

	/** Bug 368698 - GenerateJsp.emtl is missing in org.eclipse.modisco.jee.jsp.generation */
	@Test
	public void testEmtlFilePresent() {
		assertNotNull(GenerateJsp.class.getResource(DiffGeneratedJspTest.GENERATE_JSP_EMTL_FILE));
	}

	/**
	 * Launch a jsp files generation, and simply check that for each jsp source
	 * file a jsp generated file with the same path exists.
	 *
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws CoreException
	 */
	@Test // (timeout = 5 * 60 * 1000)
	public final void testJspFileExistence() throws URISyntaxException,
			CoreException, IOException {
		File sourceJspModel = getInputModelFile();
		File targetJspDirectory = prepareOutputDirectory();
		generateJspCode(sourceJspModel, targetJspDirectory);
		Assert.assertTrue("Generation Output folder is empty", //$NON-NLS-1$
				targetJspDirectory.listFiles().length > 0);

		File sourceJspDirectory = getJspSourceDirectory();
		Assert.assertTrue("Reference folder is empty", //$NON-NLS-1$
				sourceJspDirectory.listFiles().length > 0);

		boolean compareOldAndNewFiles = FolderUtils.compareFolders(
				sourceJspDirectory, targetJspDirectory, new JspFileFilter(),
				new JSPFileComparator());

		Assert.assertTrue(Messages.DiffGeneratedJspTest_Comparison_Failure
				+ Messages.DiffGeneratedJspTest_Invite_Check
				+ sourceJspDirectory.getAbsolutePath()
				+ Messages.DiffGeneratedJspTest_Target_Directory
				+ targetJspDirectory.getAbsolutePath(), compareOldAndNewFiles);
	}

	/**
	 * Get the Jsp model for generation
	 */
	private File getInputModelFile() throws CoreException, IOException {
		IProject project = getWorkspaceAuxiliaryProject();

		FileUtils.copyFileFromBundle(DiffGeneratedJspTest.RESOURCES_TEST1_XML,
				project, DiffGeneratedJspTest.RESOURCES_TEST1_XML, Activator
						.getDefault().getBundle());
		Path path = new Path(DiffGeneratedJspTest.RESOURCES_TEST1_XML);
		IFile iFile = project.getFile(path);
		File xmlFile = iFile.getLocation().toFile();
		return xmlFile;
	}

	/**
	 * Get the jsp code reference folder
	 */
	private File getJspSourceDirectory() throws CoreException {
		// Retrieving source code from another plugin : jsp discovery tests
		// and deploy it in workspace (it cannot be used directly since
		// potentially zipped)
		IProject project = getWorkspaceAuxiliaryProject();
		Bundle jspDiscoveryTestsBundle = Platform
				.getBundle(DiffGeneratedJspTest.JSP_DISCOVERER_TESTS_PLUGINID);
		deepCopy(DiffGeneratedJspTest.RESOURCES_TEST1_JSP,
				jspDiscoveryTestsBundle, project,
				DiffGeneratedJspTest.DEPLOYED_TEST1_JSP);

		File jspDirectory = project.getLocation().toFile();

		System.out.println(Messages.DiffGeneratedJspTest_Source_Directory
				+ jspDirectory.getAbsolutePath());

		return jspDirectory;
	}

	private void deepCopy(final String sourcePath, final Bundle sourceBundle,
			final IProject destinationProject, final String destinationPath) {
		Enumeration<?> e = sourceBundle.getEntryPaths(sourcePath);
		if (e == null) {
			try { // single file
				InputStream source = sourceBundle.getEntry(sourcePath)
						.openStream();
				IFile jspFile = destinationProject.getFile(destinationPath);
				if (jspFile.exists()) {
					jspFile.delete(true, new NullProgressMonitor());
				}
				jspFile.create(source, true, new NullProgressMonitor());
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
	 * Get The target folder for jsp generation
	 *
	 * @return
	 */
	private File prepareOutputDirectory() {
		IPath path = Platform.getStateLocation(Activator.getDefault()
				.getBundle());
		File outputDirectory = new File(path.toOSString(), "JspOutput"); //$NON-NLS-1$
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

		System.out.println(Messages.DiffGeneratedJspTest_Target_Directory_2
				+ outputDirectory.getAbsolutePath());

		return outputDirectory;
	}

	private void generateJspCode(final File jspModel, final File outputDirectory)
			throws IOException {

		GenerateJsp jspGenerator = new GenerateJsp(URI.createFileURI(jspModel
				.getAbsolutePath()), outputDirectory, new ArrayList<Object>());
		Assert.assertNotNull("JSP Model instance is null before generation", //$NON-NLS-1$
				jspGenerator.getModel());
		Assert.assertTrue("JSP Model instance not found in jsp model before generation", //$NON-NLS-1$
				jspGenerator.getModel().eClass().getName().equals("Model")); //$NON-NLS-1$
		try {
			jspGenerator.doGenerate(null);
		}
		catch (IOException e) {
			throw e;
		}
		catch (Exception e) {
			throw new IOException("Acceleo generation failed", e);
		}
	}

	/**
	 * Gets a IProject for deploying tests resources.
	 *
	 * @return
	 * @throws CoreException
	 */
	private IProject getWorkspaceAuxiliaryProject() throws CoreException {
		String projectName = "Jsp." + this.getClass().getName(); //$NON-NLS-1$
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
