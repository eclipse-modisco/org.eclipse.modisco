/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark.internal.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark;
import org.eclipse.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.modisco.java.discoverer.benchmark.JavaBenchmarkDiscoverer;
import org.eclipse.modisco.java.discoverer.benchmark.JavaBenchmarkHtmlReportDiscoverer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

public class BenchmarkAction extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			final List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
			while (iterator.hasNext()) {
				Object object = iterator.next();
				if (object instanceof IJavaProject) {
					IJavaProject javaProject = (IJavaProject) object;
					javaProjects.add(javaProject);
				} else if (object instanceof IProject) {
					IProject project = (IProject) object;
					IJavaProject javaProject = JavaCore.create(project);
					if (!javaProject.exists()) {
						throw new ExecutionException("Not a Java project : " + project.getName()); //$NON-NLS-1$
					}
					javaProjects.add(javaProject);
				}
			}
			if (javaProjects.isEmpty()) {
				return null;
			}

			// TODO: externalize strings
			InputDialog inputDialog = new InputDialog(HandlerUtil.getActiveShell(event),
					"Iterations", "Number of iterations:", "3", new IInputValidator() { //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
						public String isValid(final String newText) {
							try {
								int value = Integer.parseInt(newText);
								if (value < 1) {
									return "Please enter a positive number"; //$NON-NLS-1$
								}
							} catch (NumberFormatException e) {
								return "You must enter a valid number"; //$NON-NLS-1$
							}
							return null;
						}
					});
			if (inputDialog.open() == Window.CANCEL) {
				return null;
			}
			final int nIterations = Integer.parseInt(inputDialog.getValue());

			// TODO: externalize string
			Job job = new Job("Benchmark Java Projects") { //$NON-NLS-1$

				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					try {

						IProject project = ResourcesPlugin.getWorkspace().getRoot()
								.getProject("javaBenchmark_" + System.currentTimeMillis()); //$NON-NLS-1$
						try {
							// don't use the Job's monitor because it prevents
							// progress display afterwards
							project.create(new NullProgressMonitor());
							project.open(new NullProgressMonitor());
						} catch (CoreException e) {
							throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
									"Couldn't create a project for benchmark results", e)); //$NON-NLS-1$
						}

						ResourceSet resourceSet = new ResourceSetImpl();
						Resource resource = resourceSet.createResource(URI
								.createURI("memory:/javaBenchmark/" //$NON-NLS-1$
										+ System.currentTimeMillis()));
						AveragedMultiDiscoveryBenchmark benchmark = JavaBenchmarkDiscoverer
								.benchmarkJavaProjectsDiscovery(monitor, javaProjects, nIterations);
						resource.getContents().add(benchmark);

						final IFile benchmarkReportFile = JavaBenchmarkHtmlReportDiscoverer
								.generateBenchmarkReport(benchmark, project, monitor);

						resource.setURI(URI.createPlatformResourceURI(benchmarkReportFile
								.getProject().getFile(JavaBenchmarkDiscoverer.OUTPUT_FILE_NAME)
								.getFullPath().toString(), true));
						resource.save(Collections.EMPTY_MAP);

						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								IWorkbenchPage activePage = PlatformUI.getWorkbench()
										.getActiveWorkbenchWindow().getActivePage();
								try {
									IDE.openEditor(activePage, benchmarkReportFile);
								} catch (PartInitException e) {
									MoDiscoLogger.logError(e, Activator.getDefault());
								}
							}
						});
					} catch (Exception e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
		}
		return null;
	}
}
