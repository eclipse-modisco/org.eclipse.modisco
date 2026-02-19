/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *    Gregoire DUPE (Mia-Software) - Bug 367497 - [Unit Test Failure] org.eclipse.modisco.infra.browser.custom.examples.java.jdk.tests.Tests.bug308991
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.jdt.apt.core.util.AptPreferenceConstants;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.internal.Messages;
import org.eclipse.modisco.infra.common.core.internal.MoDiscoProject;
import org.eclipse.modisco.infra.common.core.internal.exception.MoDiscoCommonRuntimeException;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.Bundle;

/**
 * @author Gregoire DUPE (Mia-Software), Fabien Giquel (Mia-Software)
 *
 */
public final class ProjectUtils {

	private ProjectUtils() {
		// Nothing
	}

	private static final String JAVA_VERSION = "JavaSE-1.8"; //$NON-NLS-1$

	public static void addPdeClassPath(final IProject project) throws JavaModelException {
		IJavaProject javaProject = JavaCore.create(project);
		IClasspathEntry[] oldClassPath = javaProject.getRawClasspath();
		for (IClasspathEntry classpathEntry : oldClassPath) {
			if (classpathEntry.getPath().equals(new Path("org.eclipse.pde.core.requiredPlugins"))) { //$NON-NLS-1$
				return;
			}
		}
		IClasspathEntry[] newClassPath = new IClasspathEntry[oldClassPath.length + 1];
		System.arraycopy(oldClassPath, 0, newClassPath, 0, oldClassPath.length);
		newClassPath[oldClassPath.length] = JavaCore.newContainerEntry(new Path(
				"org.eclipse.pde.core.requiredPlugins")); //$NON-NLS-1$
		javaProject.setRawClasspath(newClassPath, new NullProgressMonitor());
	}

	/**
	 * @author Gregoire DUPE (Mia-Software) - Removing "Require-Bundle"
	 *         statement
	 */
	public static void createManifest(final IProject project) throws CoreException {
		IFolder folder = project.getFolder("META-INF"); //$NON-NLS-1$
		if (!folder.exists()) {
			folder.create(true, true, new NullProgressMonitor());
		}
		IFile manifestFile = folder.getFile("MANIFEST.MF"); //$NON-NLS-1$
		if (!manifestFile.exists()) {
			StringBuffer manifestSB = new StringBuffer();
			manifestSB.append("Manifest-Version: 1.0\n"); //$NON-NLS-1$
			manifestSB.append("Bundle-ManifestVersion: 2\n"); //$NON-NLS-1$
			manifestSB.append("Bundle-Name: " + project.getName() + "\n"); //$NON-NLS-1$ //$NON-NLS-2$
			final String packageName = ProjectUtils.packageName(project.getName());
			manifestSB.append("Bundle-SymbolicName: " + packageName //$NON-NLS-1$
					+ ";singleton:=true\n"); //$NON-NLS-1$
			manifestSB.append("Bundle-Version: 0.0.1.qualifier\n"); //$NON-NLS-1$
			manifestSB
					.append("Bundle-Activator: " + ProjectUtils.bundleActivatorQualifiedName(packageName) + "\n"); //$NON-NLS-1$ //$NON-NLS-2$
			//manifestSB.append("Bundle-Vendor: bundle vendor\n"); //$NON-NLS-1$
			manifestSB.append("Require-Bundle: org.eclipse.core.runtime,\n"); //$NON-NLS-1$
			manifestSB.append(" org.eclipse.modisco.infra.common.core,\n"); //$NON-NLS-1$
			manifestSB.append(" org.eclipse.modisco.infra.query.core\n"); //$NON-NLS-1$
			manifestSB.append("Bundle-RequiredExecutionEnvironment: " //$NON-NLS-1$
					+ ProjectUtils.JAVA_VERSION + "\n"); //$NON-NLS-1$
			manifestSB.append("Bundle-ActivationPolicy: lazy\n"); //$NON-NLS-1$
			manifestSB.append("Bundle-ClassPath: .,bin\n"); //$NON-NLS-1$
			InputStream source = new ByteArrayInputStream(manifestSB.toString().getBytes());
			manifestFile.create(source, true, new NullProgressMonitor());
		}
	}

	private static String bundleActivatorQualifiedName(final String packageName) {
		return packageName + ".Activator"; //$NON-NLS-1$
	}

	private static void createActivator(final IProject project) throws CoreException {
		final String packageName = ProjectUtils.packageName(project.getName());
		final String qualifiedName = ProjectUtils.bundleActivatorQualifiedName(packageName);
		final String path = qualifiedName.replaceAll("\\.", "/"); //$NON-NLS-1$ //$NON-NLS-2$
		IFile activatorFile = project
				.getFile(new Path("src").append(path).addFileExtension("java")); //$NON-NLS-1$ //$NON-NLS-2$
		FolderUtils.createFolder((IFolder) activatorFile.getParent());
		if (!activatorFile.exists()) {
			try {
				String template = FileUtils.getFileContents(CommonModiscoActivator.getDefault()
						.getBundle(), "resources/Activator.java.template"); //$NON-NLS-1$
				String activatorContents = template.replace("{0}", packageName); //$NON-NLS-1$
				InputStream source = new ByteArrayInputStream(activatorContents.getBytes());
				activatorFile.create(source, true, new NullProgressMonitor());
			} catch (IOException e) {
				MoDiscoLogger.logError(e, "Couldn't create Activator", CommonModiscoActivator //$NON-NLS-1$
						.getDefault());
			}
		}
	}

	/** Transform the given name into a valid package and bundle name */
	public static String packageName(final String name) {
		StringBuilder builder = new StringBuilder();
		char prev = ' ';
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == '_') {
				builder.append(c);
				prev = c;
			} else if (c >= '0' && c <= '9') {
				if (builder.length() == 0 || prev == '.') {
					builder.append("_"); //$NON-NLS-1$
				}
				builder.append(c);
				prev = c;
			} else if (c == '.') {
				if (prev == '.') {
					continue;
				}
				if (builder.length() == 0 || prev >= '0' && prev <= '9') {
					builder.append("_"); //$NON-NLS-1$
				}
				builder.append(c);
				prev = c;
			} else {
				builder.append("_"); //$NON-NLS-1$
			}
		}

		String result = builder.toString();
		// first letter to lowercase
		if (result.length() > 0 && Character.isUpperCase(result.charAt(0))) {
			result = Character.toLowerCase(result.charAt(0)) + result.substring(1);
		}

		IStatus status = JavaConventions.validatePackageName(result, JavaCore.VERSION_1_5,
				JavaCore.VERSION_1_5);
		if (!status.isOK()) {
			MoDiscoLogger.logWarning("Couldn't make valid package name from project name: " //$NON-NLS-1$
					+ status.getMessage(), CommonModiscoActivator.getDefault());
			return name;
		}
		return result;
	}

	public static void addPdeNature(final IProject project) throws CoreException {
		String pluginNature = "org.eclipse.pde.PluginNature"; //$NON-NLS-1$
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		if (!Arrays.asList(natures).contains(pluginNature)) {
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = pluginNature;
			description.setNatureIds(newNatures);
			project.setDescription(description, new NullProgressMonitor());
		}
	}

	public static void addPdeBuilder(final IProject project) throws CoreException {
		IProjectDescription projectDescription = project.getDescription();
		ICommand[] oldBuildSpec = project.getDescription().getBuildSpec();
		for (ICommand command : oldBuildSpec) {
			if ("org.eclipse.pde.ManifestBuilder".equals(command.getBuilderName())) { //$NON-NLS-1$
				return;
			}
		}
		ICommand[] newBuildSpec = new ICommand[oldBuildSpec.length + 2];
		System.arraycopy(oldBuildSpec, 0, newBuildSpec, 0, oldBuildSpec.length);
		ICommand command1 = project.getDescription().newCommand();
		command1.setBuilderName("org.eclipse.pde.ManifestBuilder"); //$NON-NLS-1$
		ICommand command2 = project.getDescription().newCommand();
		command2.setBuilderName("org.eclipse.pde.SchemaBuilder"); //$NON-NLS-1$
		newBuildSpec[oldBuildSpec.length] = command1;
		newBuildSpec[oldBuildSpec.length + 1] = command2;
		projectDescription.setBuildSpec(newBuildSpec);
		project.setDescription(projectDescription, new NullProgressMonitor());
	}

	/**
	 * @author Gregoire DUPE (Mia-Software) - classpath entries modification
	 */
	public static void configureAsJavaProject(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		ProjectUtils.addNature(project, monitor, JavaCore.NATURE_ID);
		IJavaProject javaProject = JavaCore.create(project);
		// Set output folder
		IPath path = project.getFullPath().append("bin"); //$NON-NLS-1$
		javaProject.setOutputLocation(path, null);
		List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();
		// Set source folder
		IFolder sourceFolder = project.getFolder("src"); //$NON-NLS-1$
		if (!sourceFolder.exists()) {
			sourceFolder.create(false, true, monitor);
			classpathEntries.add(JavaCore.newSourceEntry(javaProject.getPath().append(
					new Path("src")))); //$NON-NLS-1$
		}
		Path jrePath = new Path(JavaRuntime.JRE_CONTAINER
				+ "/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/" //$NON-NLS-1$
				+ ProjectUtils.JAVA_VERSION);
		boolean hasJrePath = false;
		IClasspathEntry[] existingClassPath = javaProject.getRawClasspath();
		for (IClasspathEntry classpathEntry : existingClassPath) {
			if (jrePath.equals(classpathEntry.getPath())) {
				hasJrePath = true;
			}
		}
		if (!hasJrePath) {
			// add the jre api to the classpath
			classpathEntries.add(JavaCore.newContainerEntry(jrePath));
			javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[0]), monitor);
		}
	}

	public static IProject importPlugin(final Bundle bundle) throws CoreException, IOException {
		return ProjectUtils.importPlugin(bundle, new IFilter() {
			@Override
			public boolean filter(final Object fileName) {
				return true;
			}
		});
	}

	public static IProject importPlugin(final Bundle bundle, final IFilter filter)
			throws CoreException, IOException {
		final String bundleName = bundle.getSymbolicName();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(bundleName);
		if (project.exists()) {
			int n = 1;
			final int maxIter = 100;
			while (project.exists() && n < maxIter) {
				String uniqueName = bundleName + " (" + n + ")"; //$NON-NLS-1$ //$NON-NLS-2$
				project = ResourcesPlugin.getWorkspace().getRoot().getProject(uniqueName);
				n++;
			}
		}
		project.create(new NullProgressMonitor());
		project.open(new NullProgressMonitor());
		ZipFile zip = null;
		try {
			final String bundlePath = bundle.getLocation();
			String filePath;
			final Location platformInstall = Platform.getInstallLocation();
			final URL url = platformInstall.getURL();
			final String installPath = url.toString().replaceAll(".*file:", ""); //$NON-NLS-1$ //$NON-NLS-2$
			if (bundlePath
					.startsWith("initial@reference:file:")) { //$NON-NLS-1$
				// cas d'un chemin relatif
				filePath = bundlePath.replaceAll(
						"initial@reference:file:", //$NON-NLS-1$
						installPath);
			} else {
				filePath = bundlePath.replaceFirst("^reference:file:", ""); //$NON-NLS-1$ //$NON-NLS-2$
			}
			File bundleFile = new File(filePath);
			if (bundleFile.isDirectory()) {
				FolderUtils.copyDirectory(bundleFile, project.getLocation().toFile(), filter);
			} else {
				try {
					zip = new ZipFile(new File(filePath));
				} catch (Exception e1) {
					throw new MoDiscoCommonRuntimeException(
							"Failed to open the zip file :" + filePath, e1); //$NON-NLS-1$
				}
				Enumeration<? extends ZipEntry> entries = zip.entries();
				List<IStatus> errors = new ArrayList<IStatus>();
				while (entries.hasMoreElements()) {
					try {
						ZipEntry zipEntry = entries.nextElement();
						if (filter.filter(zipEntry.getName())) {
							if (zipEntry.isDirectory()) {
								IFolder f = project.getFolder(zipEntry.getName());
								if (!f.exists()) {
									f.create(true, true, new NullProgressMonitor());
								}
							} else {
								InputStream inputStream = zip.getInputStream(zipEntry);
								IFile f = project.getFile(zipEntry.getName());
								if (!f.getParent().exists()) {
									if (f.getParent() instanceof IFolder) {
										IFolder folder = (IFolder) f.getParent();
										folder.create(true, true, new NullProgressMonitor());
									}
								}
								if (f.exists()) {
									f.delete(true, new NullProgressMonitor());
								}
								f.create(inputStream, true, new NullProgressMonitor());
							}
						}
					} catch (Exception e) {
						errors.add(new Status(IStatus.ERROR, CommonModiscoActivator.PLUGIN_ID, e
								.getMessage(), e));
					}
				}
				if (errors.size() > 0) {
					IStatus[] statusArray = errors.toArray(new IStatus[0]);
					IStatus status = new MultiStatus(CommonModiscoActivator.PLUGIN_ID,
							IStatus.ERROR, statusArray, "Errors happened", new Exception()); //$NON-NLS-1$
					CoreException exception = new CoreException(status);
					throw exception;
				}
			}
		} finally {
			if (zip != null) {
				zip.close();
			}
		}
		project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		project.build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());
		project.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
		return project;
	}

	public static void configureAsPluginProject(final IProject project) throws CoreException {
		// TODO PDE Operations would be useful here but they are internal in PDE
		ProjectUtils.addPdeNature(project);
		// PDE builders are automatically added when the PDE nature is added
		// ProjectUtils.addPdeBuilder(project);
		ProjectUtils.addPdeClassPath(project);
		ProjectUtils.createManifest(project);
		ProjectUtils.createActivator(project);
	}

	public static void addNature(final IProject project, final IProgressMonitor monitor,
			final String natureId) throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		if (!Arrays.asList(natures).contains(natureId)) {
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 1, natures.length);
			newNatures[0] = natureId;
			description.setNatureIds(newNatures);
			project.setDescription(description, monitor);
		}
	}

	/**
	 * @author Gregoire DUPE (Mia-Software) - initial implementation
	 */
	public static void createBuildProperties(final IProject project) throws CoreException {
		IFile buildFile = project.getFile("build.properties"); //$NON-NLS-1$
		if (!buildFile.exists()) {
			StringBuffer buildSB = new StringBuffer();
			buildSB.append("source.. = src/\n"); //$NON-NLS-1$
			buildSB.append("output.. = bin/\n"); //$NON-NLS-1$
			buildSB.append("bin.includes = META-INF/,\\\n"); //$NON-NLS-1$
			buildSB.append("               .\n"); //$NON-NLS-1$
			InputStream source = new ByteArrayInputStream(buildSB.toString().getBytes());
			buildFile.create(source, true, new NullProgressMonitor());
		}
	}

	/**
	 * Create MoDisco project
	 *
	 * @param project
	 * @param monitor
	 * @throws CoreException
	 */
	public static void create(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		ProjectUtils.createPluginProject(project, monitor, false);
		ProjectUtils.addNature(project, monitor, MoDiscoProject.NATURE_ID);
		monitor.done();
	}

	public static void createPluginProject(final IProject project, final IProgressMonitor monitor,
			final boolean monitorDone) throws CoreException {
		IPath projectLocation = project.getLocation();
		monitor.beginTask(Messages.ProjectUtils_0, IProgressMonitor.UNKNOWN);
		if (!project.exists()) {
			IProjectDescription description = project.getWorkspace().newProjectDescription(
					project.getName());
			if (!Platform.getLocation().equals(projectLocation)) {
				description.setLocation(projectLocation);
			}
			project.create(monitor);
			project.open(monitor);
			monitor.subTask(Messages.ProjectUtils_1);
			ProjectUtils.configureAsJavaProject(project, monitor);
			monitor.subTask(Messages.ProjectUtils_2);
			ProjectUtils.configureAsPluginProject(project);
			ProjectUtils.createBuildProperties(project);
		} else {
			MoDiscoLogger.logWarning("Project creation aborted : the project already exists", //$NON-NLS-1$
					CommonModiscoActivator.getDefault());
		}
		if (monitorDone) {
			monitor.done();
		}
	}

	public static IProject createTestProject(final String projectName,
			final Bundle bundleContainingResources, final String resourceFolder) throws Exception {
		return ProjectUtils.createTestProject(projectName, bundleContainingResources,
				resourceFolder, true);
	}

	public static IProject createTestPluginProject(final String projectName,
			final Bundle bundleContainingResources, final String resourceFolder) throws Exception {
		return ProjectUtils.createTestProject(projectName, bundleContainingResources,
				resourceFolder, false);
	}

	public static IProject createTestProject(final String projectName,
			final Bundle bundleContainingResources, final String resourceFolder,
			final boolean isMoDisco) throws Exception {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		ws.getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		IProject projectToCreate = ws.getRoot().getProject(projectName);
		if (projectToCreate.exists()) {
			projectToCreate.delete(true, true, new NullProgressMonitor());
		}
		if (!projectToCreate.exists()) {
			if (isMoDisco) {
				ProjectUtils.create(projectToCreate, new NullProgressMonitor());
			} else {
				ProjectUtils.createPluginProject(projectToCreate, new NullProgressMonitor(), true);
			}
		} else {
			throw new Exception(projectName + " project already exists"); //$NON-NLS-1$
		}
		String manifestLocation = "resources/" + resourceFolder //$NON-NLS-1$
				+ "/MANIFEST.MF_" + projectName; //$NON-NLS-1$
		if (bundleContainingResources.getResource(manifestLocation) != null) {
			FileUtils.copyFileFromBundle(manifestLocation, projectToCreate,
					"META-INF/MANIFEST.MF", bundleContainingResources); //$NON-NLS-1$
		}
		return projectToCreate;
	}

	public static void refresh(final IProject project) throws CoreException, InterruptedException {
		project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_REFRESH, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
	}

	public static boolean isMoDiscoProject(final IProject project) {
		try {
			if (!project.isAccessible()) {
				return false;
			}
			return project.getNature(MoDiscoProject.NATURE_ID) != null;
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
			return false;
		}
	}

	public static boolean isInMoDiscoProject(final IPath path) {
		final IProject project;
		if (path.segmentCount() == 1) {
			project = ResourcesPlugin.getWorkspace().getRoot().getProject(path.segment(0));
		} else {
			IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
			project = folder.getProject();
		}
		return isMoDiscoProject(project);
	}

	public static void enableAPT(final IProject project) {
		IJavaProject javaProject = JavaCore.create(project);
		if (javaProject != null) {
			try {
				IScopeContext context = new ProjectScope(project);
				IEclipsePreferences node = context.getNode(AptPreferenceConstants.APT_STRING_BASE
						+ ".core"); //$NON-NLS-1$
				node.put(AptPreferenceConstants.APT_ENABLED, "true"); //$NON-NLS-1$
				node.sync();
				IEclipsePreferences javaNode = context.getNode(JavaCore.PLUGIN_ID);
				javaNode.put(AptPreferenceConstants.APT_PROCESSANNOTATIONS, "enabled"); //$NON-NLS-1$
				javaNode.sync();
			} catch (Exception e) {
				MoDiscoLogger.logError(e, "Error enabling apt processing", //$NON-NLS-1$
						CommonModiscoActivator.getDefault());
			}
		}
	}

}
