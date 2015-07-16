/**
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

package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.actions;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.Activator;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.converter.MethodCallsGraphConverter;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.editor.MethodCallsModelEditor;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.editor.PrefuseGraphInput;
import org.eclipse.gmt.modisco.usecases.modelfilter.converter.JavaConverter;
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
 * @deprecated use matching org.eclipse.modisco.x.y.z component, ,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class DiscoverMethodCallsModelFromJavaProject extends AbstractDiscovererImpl implements
		Discoverer {

	private final String methodCallsModelExtension = "methodcalls"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.discoverersmanager.DiscovererInterface#applyTo
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
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}

	public String toString() {
		return Messages.DiscoverMethodCallsModelFromJavaProject_discoveryName;
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource resource = null;
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
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		final IJavaProject project = tempProject;
		if (project != null) {

			/*
			 * retrieve or compute target uri for method calls model default is java model uri with
			 * extension replacement: javaxmi replaced by methodcalls
			 */
			try {
				JavaConverter discoverer;
				discoverer = new JavaConverter(project);
				Resource javaResource = discoverer.convertJavaProjectToJavaModel();
				URI targetUri = javaResource.getURI().trimFileExtension()
						.appendFileExtension(this.methodCallsModelExtension);
				if (parameters.containsKey(this.getTargetUriParameter())) {
					targetUri = (URI) parameters.get(this.getTargetUriParameter());
				} // else use default
				MethodCallsGraphConverter callsConverter = new MethodCallsGraphConverter();
				resource = callsConverter.convertJavaResourceToMethodCallsResource(javaResource,
						targetUri);
				try {
					project.getCorrespondingResource().refreshLocal(1, new NullProgressMonitor());
				} catch (Exception e1) {
					MoDiscoLogger.logError(e1, Activator.getDefault());
				}
				final PrefuseGraphInput input = new PrefuseGraphInput(resource, project);
				// access UI resources so that we can obtain the current eclipse
				// workbench activePage
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						try {
							IWorkbenchPage page = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage();
							// programmatically opens the j2se5 model using the
							// default editor if one is present
							IDE.openEditor(page, input, MethodCallsModelEditor.EditorID, true);
						} catch (PartInitException e) {
							MoDiscoLogger.logError(e, Activator.getDefault());
						}
					}
				});
			} catch (JavaModelException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		} else {
			MoDiscoLogger.logInfo(
					Messages.DiscoverMethodCallsModelFromJavaProject_javaProjectNotFound,
					Activator.getDefault());
		}
		parameters.put(this.getTargetModelParameter(), resource);
	}

}
