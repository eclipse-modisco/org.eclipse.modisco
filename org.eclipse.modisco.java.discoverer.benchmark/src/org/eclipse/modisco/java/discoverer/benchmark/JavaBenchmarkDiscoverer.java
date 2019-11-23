/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 343155 - Java discoverer time benchmark
 *    Fabien Giquel (Mia-Software) - Bug 342856 - improve Discoverers implementation
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.java.discoverer.benchmark.internal.SystemInfo;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkFactory;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject;

/** Runs a benchmark from a file containing a list of projects to benchmark */
public class JavaBenchmarkDiscoverer extends AbstractModelDiscoverer<IFile> {
	private static final int BYTES_PER_MEBIBYTE = 1024 * 1024;
	private static final double MILLISECONDS_PER_SECOND = 1000.0d;
	public static final String INPUT_FILE_NAME = "javabenchconfig.txt"; //$NON-NLS-1$
	public static final String OUTPUT_FILE_NAME = "javabench.xmi"; //$NON-NLS-1$
	private static final Integer FLUSH_LIMIT = 65536;

	private int numberOfIterations = 1;

	@Parameter(name = "ITERATIONS", description = "The number of iterations to perform.")
	public void setNumberOfIterations(final int iterations) {
		this.numberOfIterations = iterations;
	}

	public int getNumberOfIterations() {
		return this.numberOfIterations;
	}

	public boolean isApplicableTo(final IFile source) {
		return source.exists() && JavaBenchmarkDiscoverer.INPUT_FILE_NAME.equals(source.getName());
	}

	@Override
	protected void basicDiscoverElement(final IFile source, final IProgressMonitor monitor)
			throws DiscoveryException {

		IProject containingProject = source.getProject();
		setDefaultTargetURI(URI.createPlatformResourceURI(
				containingProject.getFullPath().append(JavaBenchmarkDiscoverer.OUTPUT_FILE_NAME)
						.toString(), true));
		createTargetModel();

		List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		try {
			String input = FileUtils.readInputStream(source.getContents(), source.getCharset());
			String[] lines = input.split("\\r?\\n"); //$NON-NLS-1$
			for (String line : lines) {
				line = line.trim();
				if (line.length() == 0 || line.startsWith("#")) { //$NON-NLS-1$
					continue;
				}
				IProject project = workspaceRoot.getProject(line);
				if (!project.exists()) {
					throw new DiscoveryException(
							"Project \"" + project.getName() + "\" doesn't exist"); //$NON-NLS-1$//$NON-NLS-2$
				}
				final IJavaProject javaProject = JavaCore.create(project);
				if (!javaProject.exists()) {
					throw new DiscoveryException(
							"\"" + project.getName() + "\" is not a valid Java project"); //$NON-NLS-1$ //$NON-NLS-2$
				}
				javaProjects.add(javaProject);
			}

		} catch (IOException e) {
			throw new DiscoveryException("Error reading input file", e); //$NON-NLS-1$
		} catch (CoreException e) {
			throw new DiscoveryException("Error reading input file", e); //$NON-NLS-1$
		}

		AveragedMultiDiscoveryBenchmark benchmark = benchmarkJavaProjectsDiscovery(monitor,
				javaProjects, this.numberOfIterations);

		getTargetModel().getContents().add(benchmark);
	}

	public static AveragedMultiDiscoveryBenchmark benchmarkJavaProjectsDiscovery(
			final IProgressMonitor monitor, final List<IJavaProject> javaProjects,
			final int nIterations) throws DiscoveryException {
		AveragedMultiDiscoveryBenchmark benchmark = BenchmarkFactory.eINSTANCE
				.createAveragedMultiDiscoveryBenchmark();
		benchmark
				.setJvmMaxHeapInMiB((Runtime.getRuntime().maxMemory() / JavaBenchmarkDiscoverer.BYTES_PER_MEBIBYTE));
		try {
			SystemInfo systemInfo = SystemInfo.getInstance();
			benchmark.setOsArchitecture(systemInfo.getArch());
			benchmark.setOsName(systemInfo.getOsName());
			benchmark.setOsVersion(systemInfo.getOsVersion());
			benchmark.setProcessorCacheSize(systemInfo.getProcCacheSize());
			benchmark.setProcessorCount(systemInfo.getnProcessors());
			benchmark.setProcessorDescription(systemInfo.getProcDescription());
			benchmark.setProcessorName(systemInfo.getProcName());
			benchmark.setSystemMemory(systemInfo.getMemory());
		} catch (IOException e) {
			MoDiscoLogger.logError(e,
					"Could not get system information for benchmark", Activator.getDefault()); //$NON-NLS-1$
		}

		final int nOperationsPerProject = 2;
		// TODO: externalize
		monitor.beginTask(
				"Benchmarking java projects discovery", javaProjects.size() * nIterations * nOperationsPerProject); //$NON-NLS-1$

		for (IJavaProject javaProject : javaProjects) {
			testCanceled(monitor);
			AveragedProjectDiscovery averagedProjectDiscovery = BenchmarkFactory.eINSTANCE
					.createAveragedProjectDiscovery();
			benchmark.getDiscoveries().add(averagedProjectDiscovery);
			for (int i = 0; i < nIterations; i++) {
				testCanceled(monitor);
				ProjectDiscovery projectDiscovery = BenchmarkFactory.eINSTANCE
						.createProjectDiscovery();
				projectDiscovery.setName(javaProject.getElementName());
				averagedProjectDiscovery.getOccurrences().add(projectDiscovery);
				JavaProject javaBenchmarkedProject = JavaBenchmarkFactory.eINSTANCE
						.createJavaProject();
				projectDiscovery.getProjects().add(javaBenchmarkedProject);
				javaBenchmarkedProject.setName(javaProject.getElementName());
				testCanceled(monitor);
				discoverJavaFilesInProject(javaProject, monitor, javaBenchmarkedProject,
						projectDiscovery);
				monitor.worked(1);
				testCanceled(monitor);
				benchmarkProjectDiscovery(javaProject, monitor, javaBenchmarkedProject,
						projectDiscovery);
				monitor.worked(1);
			}
		}
		return benchmark;
	}

	protected static void testCanceled(final IProgressMonitor monitor) {
		if (monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
	}

	protected static void discoverJavaFilesInProject(final IJavaProject javaProject,
			final IProgressMonitor monitor, final JavaProject javaBenchmarkedProject,
			final Discovery discovery) throws DiscoveryException {

		try {
			// TODO: externalize
			monitor.subTask("Visiting " + javaProject.getElementName()); //$NON-NLS-1$
			javaProject.getProject().accept(new IResourceVisitor() {
				public boolean visit(final IResource resource) throws CoreException {
					testCanceled(monitor);
					if (resource instanceof IFile) {
						IFile iFile = (IFile) resource;
						if ("java".equals(iFile.getFileExtension())) { //$NON-NLS-1$
							// IJavaElement javaElement =
							// javaProject.findElement(path);
							// if (javaElement instanceof ICompilationUnit) {
							// ICompilationUnit compilationUnit =
							// (ICompilationUnit) javaElement;
							org.eclipse.modisco.infra.discovery.benchmark.File file = BenchmarkFactory.eINSTANCE
									.createFile();
							javaBenchmarkedProject.getFiles().add(file);
							file.setFilepath(iFile.getFullPath().removeFirstSegments(1)
									.toPortableString());
							String input;
							try {
								input = FileUtils.readInputStream(iFile.getContents(),
										iFile.getCharset());
							} catch (IOException e) {
								throw new CoreException(new Status(IStatus.ERROR,
										Activator.PLUGIN_ID, 0, "Error reading file " //$NON-NLS-1$
												+ iFile.getFullPath().toString(), e));
							}
							String[] lines = input.split("\\r?\\n"); //$NON-NLS-1$
							file.setLines(lines.length + 1);
							file.setSizeInBytes(iFile.getLocation().toFile().length());
							// }

						}
					}
					return true;
				}
			});
		} catch (CoreException e) {
			throw new DiscoveryException("Error visiting project", e); //$NON-NLS-1$
		}
	}

	protected static void benchmarkProjectDiscovery(final IJavaProject javaProject,
			final IProgressMonitor monitor, final JavaProject javaBenchmarkedProject,
			final Discovery discovery) {

		testCanceled(monitor);
		System.gc();
		long beforeDiscovery = System.currentTimeMillis();

		String error = null;
		DiscoverJavaModelFromJavaProject discoverer = null;
		try {
			discoverer = new DiscoverJavaModelFromJavaProject();
			discoverer.discoverElement(javaProject, monitor);
		} catch (Throwable e) {
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			e.printStackTrace(new PrintWriter(byteArrayOutputStream, true));
			error = byteArrayOutputStream.toString();
		}
		discovery.setDiscoveryError(error);

		long discoveryTime = (System.currentTimeMillis() - beforeDiscovery);
		long totalMemory = Runtime.getRuntime().totalMemory();

		discovery.setDicoveryDate(new Date());
		discovery.setDiscovererClassName(DiscoverJavaModelFromJavaProject.class.getName());
		discovery.setDiscovererId(DiscoverJavaModelFromJavaProject.ID
				+ " v" + Activator.getDefault().getBundle().getVersion().toString()); //$NON-NLS-1$
		discovery.setMaxUsedMemoryInBytes(totalMemory);
		discovery
				.setTotalExecutionTimeInSeconds((discoveryTime / JavaBenchmarkDiscoverer.MILLISECONDS_PER_SECOND));

		if (discoverer != null) {
			Resource targetModel = discoverer.getTargetModel();
			discovery.setNumberOfModelElements(countModelElements(targetModel));
			IProject project = javaProject.getProject();
			String xmiFilename = project.getName() + JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX;
			IPath targetXMIPath = project.getFullPath().append(xmiFilename);
			targetModel.setURI(URI.createPlatformResourceURI(targetXMIPath.toString(), true));

			testCanceled(monitor);
			long beforeSave = System.currentTimeMillis();
			try {
				save(targetModel);
			} catch (Throwable e) {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				e.printStackTrace(new PrintWriter(byteArrayOutputStream, true));
				error = byteArrayOutputStream.toString();
				discovery.setDiscoveryError(error);
				return;
			}
			long saveTime = System.currentTimeMillis() - beforeSave;

			File xmiFile = project.getLocation().append(xmiFilename).toFile();
			discovery.setXmiSizeInBytes(xmiFile.length());
			discovery
					.setSaveTimeInSeconds((saveTime / JavaBenchmarkDiscoverer.MILLISECONDS_PER_SECOND));
		}
	}

	private static void save(final Resource targetModel) throws IOException {
		if (targetModel != null) {
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_FLUSH_THRESHOLD, JavaBenchmarkDiscoverer.FLUSH_LIMIT);
			options.put(XMLResource.OPTION_USE_FILE_BUFFER, Boolean.TRUE);
			try {
				targetModel.save(options);
			} catch (IOWrappedException e) {
				// TODO this is a temporary fix for Bug 323247
				if (e.getCause() != null && (e.getCause() instanceof CoreException)) {
					MoDiscoLogger.logWarning(e,
							"XMI serialization has failed on '" + targetModel.getURI() //$NON-NLS-1$
									+ "'. Trying again without File Buffer.", //$NON-NLS-1$
							Activator.getDefault());
					options.clear();
					targetModel.save(options);
					MoDiscoLogger.logInfo("XMI serialization is done for " + targetModel.getURI(), //$NON-NLS-1$
							Activator.getDefault());
				} else {
					throw e;
				}
			}
		}
	}

	protected static long countModelElements(final Resource targetModel) {
		TreeIterator<EObject> allContents = targetModel.getAllContents();
		long nElements = 0;
		while (allContents.hasNext()) {
			allContents.next();
			nElements++;
		}
		return nElements;
	}

}
