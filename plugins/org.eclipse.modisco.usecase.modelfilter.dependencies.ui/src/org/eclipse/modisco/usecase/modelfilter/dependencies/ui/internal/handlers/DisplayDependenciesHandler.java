/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.handlers;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.JavaModelUtils;
import org.eclipse.modisco.java.discoverer.internal.core.JavaJdtBridge;
import org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.Activator;
import org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.Messages;
import org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.editor.DependenciesEditor;
import org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.editor.PrefuseGraphInput;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

public class DisplayDependenciesHandler extends AbstractHandler {
	public DisplayDependenciesHandler() {
	}

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object object = iterator.next();
				open(object);
			}
		}
		return null;
	}

	private static void open(final Object object) {
		if (object instanceof IJavaProject) {
			final IJavaProject javaProject = (IJavaProject) object;
			openOn(javaProject);
		} else if (object instanceof IFile) {
			IFile file = (IFile) object;
			if (JavaModelUtils.isJavaModelFile(file)) {
				openOn(file);
			} else {
				MoDiscoLogger
						.logWarning("Not a Java model: " //$NON-NLS-1$
								+ file.getFullPath().toString(),
								Activator.getDefault());
			}
		} else if (object instanceof IType) {
			IType type = (IType) object;
			IJavaProject javaProject = type.getJavaProject();
			openOn(type, javaProject);
		} else if (object instanceof ICompilationUnit) {
			ICompilationUnit compilationUnit = (ICompilationUnit) object;
			String typeName = compilationUnit.getPath().removeFileExtension()
					.lastSegment();
			IType type = compilationUnit.getType(typeName);
			IJavaProject javaProject = type.getJavaProject();
			openOn(type, javaProject);
		} else if (object instanceof IPackageFragment) {
			IPackageFragment packageFragment = (IPackageFragment) object;
			openOn(packageFragment, packageFragment.getJavaProject());
		} else {
			MoDiscoLogger.logWarning("Input not handled: " //$NON-NLS-1$
					+ object.getClass().getName(), Activator.getDefault());
		}

	}

	private static void openOn(final IPackageFragment packageFragment,
			final IJavaProject javaProject) {
		Job job = new Job(
				Messages.DisplayDependenciesHandler_discoverJavaProject) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
					discoverer.discoverElement(javaProject,
							new NullProgressMonitor());
					Resource resource = discoverer.getTargetModel();

					JavaJdtBridge bridge = new JavaJdtBridge();
					Package modelPackage = bridge.getJavaPackage(resource,
							packageFragment);
					if (modelPackage != null) {
						PrefuseGraphInput prefuseGraphInput = new PrefuseGraphInput(
								modelPackage, javaProject);
						openPrefuseEditor(prefuseGraphInput);
					}
				} catch (DiscoveryException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	private static void openOn(final IType type, final IJavaProject javaProject) {
		Job job = new Job(
				Messages.DisplayDependenciesHandler_discoverJavaProject) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
					discoverer.discoverElement(javaProject,
							new NullProgressMonitor());
					Resource targetModel = discoverer.getTargetModel();

					JavaJdtBridge bridge = new JavaJdtBridge();
					Type modelType = bridge.getJavaType(targetModel, type);
					if (modelType != null) {
						PrefuseGraphInput prefuseGraphInput = new PrefuseGraphInput(
								modelType, javaProject);
						openPrefuseEditor(prefuseGraphInput);
					}
				} catch (DiscoveryException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	private static void openOn(final IFile file) {
		Job job = new Job(Messages.DisplayDependenciesHandler_openJavaModelFile) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource resource = resourceSet.createResource(URI
							.createPlatformResourceURI(file.getFullPath()
									.toString(), true));
					resource.load(null);
					PrefuseGraphInput input = new PrefuseGraphInput(resource,
							JavaCore.create(file.getProject()));
					openPrefuseEditor(input);
				} catch (IOException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	private static void openOn(final IJavaProject javaProject) {
		Job job = new Job(
				Messages.DisplayDependenciesHandler_discoverJavaProject) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
					discoverer.discoverElement(javaProject,
							new NullProgressMonitor());
					Resource targetModel = discoverer.getTargetModel();
					PrefuseGraphInput input = new PrefuseGraphInput(
							targetModel, javaProject);
					openPrefuseEditor(input);
				} catch (DiscoveryException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	protected static void openPrefuseEditor(final IEditorInput editorInput) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					IDE.openEditor(page, editorInput,
							DependenciesEditor.EDITOR_ID, true);
				} catch (PartInitException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
		});
	}
}
