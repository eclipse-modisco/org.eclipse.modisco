/*
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.actions;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.Activator;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor.DependenciesEditor;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor.PrefuseGraphInput;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class DiscoverDependenciesFromTypeDeclaration extends AbstractDiscovererImpl implements
		Discoverer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.discoverersmanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof Type) {
			result = true;
		}
		return result;
	}

	public String toString() {
		return Messages.DiscoverDependenciesFromTypeDeclaration_discoveryName;
	}

	private final Model retrieveModel(EObject eObject) {
		Model model = null;
		EObject parent = eObject.eContainer();
		if (parent != null) {
			if (parent instanceof Model) {
				model = (Model) parent;
			} else {
				model = this.retrieveModel(parent);
			}
		}
		return model;
	}

	private final IJavaProject retrieveJavaProject(Type type) {
		IJavaProject tempProject = null;
		// retrieval of Java project
		Model model = this.retrieveModel(type);
		if (model != null) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
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
						MoDiscoLogger.logError(e, JavaActivator.getDefault());
					}
				}
			}
		}
		return tempProject;
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource resource = null;
		Type type = (Type) source;
		resource = type.eResource();
		// retrieval of Java project
		IJavaProject project = this.retrieveJavaProject(type);
		if (project != null) {
			final PrefuseGraphInput input = new PrefuseGraphInput(type, project);
			;

			// access UI resources so that we can obtain the current eclipse
			// workbench activePage
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					try {
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage();
						// programmatically opens the j2se5 model using the
						// default editor if one is present
						IDE.openEditor(page, input, DependenciesEditor.EditorID, true);
					} catch (PartInitException e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}
			});
		} else {
			MoDiscoLogger.logInfo(
					Messages.DiscoverDependenciesFromTypeDeclaration_javaProjectNotFound,
					Activator.getDefault());
		}
		parameters.put(this.getTargetModelParameter(), resource);
	}

}
