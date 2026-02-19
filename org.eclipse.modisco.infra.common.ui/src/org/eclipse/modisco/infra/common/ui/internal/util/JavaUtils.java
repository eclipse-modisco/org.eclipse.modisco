/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.infra.common.core.internal.utils.PluginUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

public final class JavaUtils {

	private JavaUtils() {
		// utility class
	}

	/**
	 * Open a dialog to let the user choose a type.
	 *
	 * @param javaProject
	 *            a project in which types are found (may be <code>null</code>,
	 *            in which case only <code>additionalBundlesInSearchPath</code>
	 *            is used)
	 * @param additionalBundlesInSearchPath
	 *            additional bundles that are in the scope for the search. If
	 *            not <code>null</code>, then a temporary plug-in project with
	 *            these bundles will be created during the life of the dialog.
	 * @param parentShell
	 *            the parent shell of the dialog to be created
	 * @param runnableContext
	 *            the runnable context used to show progress when the dialog is
	 *            being populated
	 * @param style
	 *            flags defining the style of the dialog; the only valid values
	 *            are <code>IJavaElementSearchConstants.CONSIDER_CLASSES</code>,
	 *            <code>IJavaElementSearchConstants.CONSIDER_INTERFACES</code>,
	 *            <code>IJavaElementSearchConstants.CONSIDER_ANNOTATION_TYPES</code>
	 *            , <code>IJavaElementSearchConstants.CONSIDER_ENUMS</code>,
	 *            <code>IJavaElementSearchConstants.CONSIDER_ALL_TYPES</code>,
	 *            <code>IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES</code>
	 *            <code>IJavaElementSearchConstants.CONSIDER_CLASSES_AND_ENUMS</code>
	 *            .<br/>
	 *            Please note that the bitwise OR combination of the elementary
	 *            constants is not supported.
	 * @param title
	 *            the title of the dialog
	 * @param message
	 *            the message of the dialog
	 * @return the selected type or <code>null</code> if none
	 */
	public static IType openTypeSelectionDialog(final IJavaProject javaProject,
			final List<String> additionalBundlesInSearchPath, final Shell parentShell,
			final IRunnableContext runnableContext, final int style, final String title,
			final String message) {
		final IProject[] tempproj = new IProject[1];
		final IJavaProject[] tempJavaProj = new IJavaProject[1];
		try {
			if (additionalBundlesInSearchPath.size() > 0) {
				/*
				 * Create a temporary plug-in project in order to let the user
				 * choose among types that aren't yet on the buildpath of the
				 * new project
				 */
				try {

					ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {
						public void run(final IProgressMonitor monitor2) throws CoreException {
							try {
								tempproj[0] = ResourcesPlugin.getWorkspace().getRoot()
										.getProject(".temp" + System.currentTimeMillis()); //$NON-NLS-1$
								ProjectUtils.createPluginProject(tempproj[0],
										new NullProgressMonitor(), false);
								// remove builders to avoid building the temp
								// project
								IProjectDescription projectDescription = tempproj[0].getDescription();
								projectDescription.setBuildSpec(new ICommand[0]);
								tempproj[0].setDescription(projectDescription,
										new NullProgressMonitor());

								tempJavaProj[0] = JavaCore.create(tempproj[0]);
								PluginUtils.addRequiredBundles(tempproj[0],
										additionalBundlesInSearchPath);
							} catch (CoreException e) {
								Logger.logError(e, MoDiscoCommonUIPlugin.getDefault());
							}
						}
					}, new NullProgressMonitor());

				} catch (Exception e) {
					Logger.logError(e, MoDiscoCommonUIPlugin.getDefault());
					// continue without tempproj
				}
			}

			ArrayList<IJavaElement> scopeElements = new ArrayList<IJavaElement>();
			if (javaProject != null) {
				scopeElements.add(javaProject);
			}
			if (tempJavaProj[0] != null) {
				scopeElements.add(tempJavaProj[0]);
			}
			IJavaSearchScope scope = SearchEngine.createJavaSearchScope(scopeElements
					.toArray(new IJavaElement[scopeElements.size()]));

			SelectionDialog typeDialog = JavaUI.createTypeDialog(parentShell, runnableContext,
					scope, style, false);
			typeDialog.setTitle(title);
			typeDialog.setMessage(message);
			if (typeDialog.open() == Window.OK) {
				Object[] result = typeDialog.getResult();
				if (result.length > 0) {
					return (IType) typeDialog.getResult()[0];
				}
			}

		} catch (Exception e) {
			Logger.logError(e, MoDiscoCommonUIPlugin.getDefault());
			return null;
		} finally {
			if (tempproj[0] != null) {
				final IProject toDelete = tempproj[0];
				Job deleteJob = new Job("delete temp project") { //$NON-NLS-1$
					@Override
					protected IStatus run(final IProgressMonitor monitor1) {
						try {
							ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {
								public void run(final IProgressMonitor monitor2)
										throws CoreException {
									try {
										toDelete.delete(true, monitor2);
									} catch (CoreException e) {
										Logger.logError(e,
												MoDiscoCommonUIPlugin.getDefault());
									}
								}
							}, monitor1);
						} catch (CoreException e) {
							Logger.logError(e, MoDiscoCommonUIPlugin.getDefault());
						}
						return Status.OK_STATUS;
					}
				};
				deleteJob.setSystem(true);
				deleteJob.setPriority(Job.DECORATE);
				deleteJob.schedule();

			}
		}
		return null;
	}
}
