/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
/**
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class DiscoverKdmModelFromJavaProject extends DefaultDiscoverer {

	public static final String KDM_FILE_EXTENSION = "kdm"; //$NON-NLS-1$
	private static List<DiscoveryParameter> parametersKeys = null;
	/**
	 * A parameter key. @see DiscoveryParametersBean
	 */
	public static final DiscoveryParameter PARAMETERS_BEAN = new DiscoveryParameterImpl(
			"PARAMETERS_BEAN", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			DiscoveryParameter.class, false);

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Map<DiscoveryParameter, Object> javaDiscParams = null;

		if (parameters != null) {
			javaDiscParams = new HashMap<DiscoveryParameter, Object>(parameters);
		} else {
			javaDiscParams = new HashMap<DiscoveryParameter, Object>();
		}

		javaDiscParams.put(DefaultDiscoverer.PARAMETER_BROWSE_RESULT, false);
		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();

		javaDiscoverer.discoverElement(source, javaDiscParams);

		Resource javaModelResource = (Resource) javaDiscParams
				.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
		Resource kdmModelResource = null;

		if (javaModelResource != null) {
			try {
				URI kdmModelUri = javaModelResource.getURI().trimFileExtension()
						.appendFileExtension(DiscoverKdmModelFromJavaProject.KDM_FILE_EXTENSION);
				TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
				kdmModelResource = kdmTranslater.getKDMModelFromJavaModelWithCustomTransformation(
						javaModelResource.getURI(), kdmModelUri);

				if (kdmModelResource != null) {
					// schedule editor opening
					IFile kdmFile = null;
					if (kdmModelUri.isFile()) {
						kdmFile = ResourcesPlugin.getWorkspace().getRoot()
								.getFileForLocation(new Path(kdmModelUri.toFileString()));
					} else {
						kdmFile = ResourcesPlugin.getWorkspace().getRoot()
								.getFile(new Path(kdmModelUri.toPlatformString(true)));
					}

					// refresh the folder
					kdmFile.getProject().refreshLocal(IResource.DEPTH_ONE,
							new NullProgressMonitor());

					// browse result model
					this.openEditor(kdmFile, parameters);

					// set output parameter
					if (parameters != null) {
						parameters.put(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE,
								kdmModelResource);
					}
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, JavaActivator.getDefault());
			}
		}
	}

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
				MoDiscoLogger.logError(e, JavaActivator.getDefault());
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return Messages.DiscoverKdmModelFromJavaProject_title;
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverKdmModelFromJavaProject.parametersKeys == null) {
			DiscoverKdmModelFromJavaProject.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverKdmModelFromJavaProject.parametersKeys.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverKdmModelFromJavaProject.parametersKeys.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			DiscoverKdmModelFromJavaProject.parametersKeys
					.add(DiscoverKdmModelFromJavaProject.PARAMETERS_BEAN);
		}
		return DiscoverKdmModelFromJavaProject.parametersKeys;
	}

}
