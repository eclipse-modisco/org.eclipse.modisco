/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.JavaModelUtils;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.DiscoverMethodCallsModelFromJavaModel;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.DiscoverMethodCallsModelFromJavaProject;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.internal.converter.MethodCallsGraphConverter;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.Activator;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.Messages;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.MethodCallsJavaBridge;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.editor.MethodCallsModelEditor;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.editor.PrefuseGraphInput;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

public class DisplayMethodCallsHandler extends AbstractHandler {
	public DisplayMethodCallsHandler() {
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
		} else if (object instanceof AbstractMethodDeclaration) {
			final AbstractMethodDeclaration abstractMethodDeclaration = (AbstractMethodDeclaration) object;
			openOn(abstractMethodDeclaration);
		} else if (object instanceof IMethod) {
			final IMethod method = (IMethod) object;
			openOn(method);
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
		} else {
			MoDiscoLogger.logWarning("Input not handled: " //$NON-NLS-1$
					+ object.getClass().getName(), Activator.getDefault());
		}

	}

	private static void openOn(final IMethod method) {
		Job job = new Job(Messages.DisplayMethodCallsHandler_displayMethodCalls) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					IJavaProject javaProject = method.getJavaProject();
					DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
					discoverer.discoverElement(javaProject, monitor);
					Resource javaModel = discoverer.getTargetModel();
					MethodCallsGraphConverter callsConverter = new MethodCallsGraphConverter();
					CallsModel model = callsConverter
							.convertJavaResourceToMethodCallsModel(javaModel,
									javaProject.getElementName());

					/*
					 * we will retrieve java operation (in model), corresponding
					 * to java method if not, we will use the whole model
					 */
					PrefuseGraphInput input;
					CallNode callNode = MethodCallsJavaBridge.getCallNode(
							model, method);
					if (callNode != null) {
						input = new PrefuseGraphInput(callNode,
								method.getJavaProject());
					} else {
						input = new PrefuseGraphInput(model.eResource(),
								method.getJavaProject());
					}
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

	private static void openOn(
			final AbstractMethodDeclaration abstractMethodDeclaration) {
		Job job = new Job(Messages.DisplayMethodCallsHandler_displayMethodCalls) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IJavaProject javaProject = retrieveJavaProject(abstractMethodDeclaration);
				if (javaProject != null) {
					MethodCallsGraphConverter callsConverter = new MethodCallsGraphConverter();
					CallsModel model = callsConverter
							.convertJavaResourceToMethodCallsModel(
									abstractMethodDeclaration.eResource(),
									javaProject.getElementName());

					/*
					 * we will retrieve java operation (in model), corresponding
					 * to java method if not, we will use the whole model
					 */
					PrefuseGraphInput input;
					CallNode callNode = MethodCallsJavaBridge.getCallNode(
							model, abstractMethodDeclaration);
					if (callNode != null) {
						input = new PrefuseGraphInput(callNode, javaProject);
					} else {
						input = new PrefuseGraphInput(model.eResource(),
								javaProject);
					}
					openPrefuseEditor(input);
				} else {
					MessageDialog
							.openError(
									null,
									Messages.DisplayMethodCallsHandler_noJavaProject,
									Messages.DisplayMethodCallsHandler_noJavaProjectLong);
				}
				return Status.OK_STATUS;
			}

			private Model retrieveModel(final EObject eObject) {
				Model model = null;
				EObject parent = eObject.eContainer();
				if (parent != null) {
					if (parent instanceof Model) {
						model = (Model) parent;
					} else {
						model = retrieveModel(parent);
					}
				}
				return model;
			}

			private IJavaProject retrieveJavaProject(
					final AbstractMethodDeclaration method) {
				IJavaProject tempProject = null;
				// retrieval of Java project
				Model model = retrieveModel(method);
				if (model != null) {
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace()
							.getRoot();
					String projectName = model.getName();
					IProject project = root.getProject(projectName);
					if (project != null) {
						if (project instanceof IJavaProject) {
							tempProject = (IJavaProject) project;
						} else {
							try {
								if (project.hasNature(JavaCore.NATURE_ID)) {
									tempProject = JavaCore.create(project);
								}
							} catch (CoreException e) {
								MoDiscoLogger.logError(e,
										Activator.getDefault());
							}
						}
					}
				}
				return tempProject;
			}
		};
		job.schedule();
	}

	private static void openOn(final IFile file) {
		Job job = new Job(Messages.DisplayMethodCallsHandler_displayMethodCalls) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					DiscoverMethodCallsModelFromJavaModel discoverer = new DiscoverMethodCallsModelFromJavaModel();
					discoverer.discoverElement(file, monitor);
					Resource model = discoverer.getTargetModel();
					PrefuseGraphInput input = new PrefuseGraphInput(model,
							JavaCore.create(file.getProject()));
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

	private static void openOn(final IJavaProject javaProject) {
		Job job = new Job(Messages.DisplayMethodCallsHandler_displayMethodCalls) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					DiscoverMethodCallsModelFromJavaProject discoverer = new DiscoverMethodCallsModelFromJavaProject();
					discoverer.discoverElement(javaProject, monitor);
					Resource model = discoverer.getTargetModel();
					PrefuseGraphInput input = new PrefuseGraphInput(model,
							javaProject);
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
							MethodCallsModelEditor.EDITOR_ID, true);
				} catch (PartInitException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
		});
	}
}
