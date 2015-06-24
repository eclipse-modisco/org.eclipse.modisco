/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecases.modelfilter.actions;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUml2Activator;
import org.eclipse.gmt.modisco.usecases.modelfilter.ModelFilterActivator;
import org.eclipse.gmt.modisco.usecases.modelfilter.converter.RealTypesJavaConverter;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
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
public class DiscoverUmlModelWithRealTypesFromJavaProject extends AbstractDiscovererImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = ((IJavaProject) source).getProject().isAccessible();
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if ((project.isAccessible()) && (project.hasNature(JavaCore.NATURE_ID))) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, ModelFilterActivator.getDefault());
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "Discover MethodCalls model from Java operation"; //$NON-NLS-1$
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource result = null;
		// retrieval of Java project
		IJavaProject tempProject = null;
		if (source instanceof IJavaProject) {
			tempProject = (IJavaProject) source;
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					tempProject = JavaCore.create(project);
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, ModelFilterActivator.getDefault());
			}
		}
		final IJavaProject project = tempProject;

		RealTypesJavaConverter discoverer;
		try {
			discoverer = new RealTypesJavaConverter(project);
			result = discoverer.convertJavaProjectToUml2();
		} catch (JavaModelException e) {
			MoDiscoLogger.logError(e, ModelFilterActivator.getDefault());
		}
		boolean silent = false;
		if (parameters.containsKey(this.getSilentModeParameter())) {
			silent = (Boolean) parameters.get(this.getSilentModeParameter());
		}
		// access UI resources so that we can obtain the current eclipse
		// workbench activePage
		if (silent == false) {
			final URI umlModelURIf = result.getURI();
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					try {
						IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
						IFile ifile = null;
						if (umlModelURIf.isFile()) {
							ifile = root.getFileForLocation(new Path(umlModelURIf.toFileString()));
						} else {
							ifile = root.getFile(new Path(umlModelURIf.toPlatformString(true)));
						}
						if ((ifile != null) && ifile.exists()) {
							IWorkbenchPage page = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage();
							// programmatically opens the model using the
							// default editor if one is present
							IDE.openEditor(page, ifile);
						}
					} catch (PartInitException e) {
						MoDiscoLogger.logWarning(e, KdmToUml2Activator.getDefault());
					}
				}
			});
		}
		parameters.put(this.getTargetModelParameter(), result);
	}

}
