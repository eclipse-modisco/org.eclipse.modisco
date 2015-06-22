/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *    Bjorn Tietjens
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
/** 
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728 
 */
@Deprecated
public class DiscoverKdmModelFromJavaModel extends DefaultDiscoverer {

	private static List<DiscoveryParameter> parametersKeys = null;

	/**
	 * A parameter key for indicating which asm file to use for atl
	 * transformation. The given path may be :
	 * <UL>
	 * <LI>A String representation which conforms to {@link java.net.URL}
	 * representation.
	 * <LI>A relative path to this current class localization.
	 * </UL>
	 * 
	 * example: "file//C:/MyPath/MyTransformation.asm"
	 */
	public static final DiscoveryParameter PARAMETER_PATH_TO_TRANSFORMATION = new DiscoveryParameterImpl(
			"OPTION_ASM_PATH", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			String.class, false);

	@Override
	public Resource discoverElement(final Object source, final URI target) {
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, false);
		discoverElement(source, parameters);
		return (Resource) parameters.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	/**
	 * 
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		// retrieval of Java project
		final IFile iFile = (IFile) source;
		final String sourcePath = iFile.getFullPath().toString();
		Resource javaModelResource = new XMIResourceImpl();
		javaModelResource.setURI(URI.createPlatformResourceURI(sourcePath, true));
		Resource kdmModelResource = null;

		try {

			URI javaModelURI = javaModelResource.getURI();
			URI kdmModelUri = javaModelURI.trimFileExtension().appendFileExtension(
					DiscoverKdmModelFromJavaProject.KDM_FILE_EXTENSION);
			TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();

			if (parameters
					.containsKey(DiscoverKdmModelFromJavaModel.PARAMETER_PATH_TO_TRANSFORMATION)) {
				if (parameters.get(DiscoverKdmModelFromJavaModel.PARAMETER_PATH_TO_TRANSFORMATION) != null) {
					if (parameters
							.get(DiscoverKdmModelFromJavaModel.PARAMETER_PATH_TO_TRANSFORMATION) instanceof String) {
						String s = (String) parameters
								.get(DiscoverKdmModelFromJavaModel.PARAMETER_PATH_TO_TRANSFORMATION);
						// if (s != null && (s.length() > 0)) {
						kdmTranslater.setPathToTransformation(s);
						// }
					}
				}
			}

			kdmModelResource = kdmTranslater.getKDMModelFromJavaModelWithCustomTransformation(
					javaModelURI, kdmModelUri);

			if (kdmModelResource != null) {
				// schedule editor opening
				String kdmFileString = kdmModelUri.toPlatformString(true);
				IFile kdmFile = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(kdmFileString));

				// refresh the folder
				kdmFile.getProject().refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());

				// browse result model
				this.openEditor(kdmFile, parameters);

				// set output parameter
				parameters.put(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE, kdmModelResource);
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, JavaActivator.getDefault());
		}

	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverKdmModelFromJavaModel.parametersKeys == null) {
			DiscoverKdmModelFromJavaModel.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverKdmModelFromJavaModel.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverKdmModelFromJavaModel.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			DiscoverKdmModelFromJavaModel.parametersKeys
					.add(DiscoverKdmModelFromJavaModel.PARAMETER_PATH_TO_TRANSFORMATION);
		}
		return DiscoverKdmModelFromJavaModel.parametersKeys;
	}

	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IFile) {
			IFile iFile = (IFile) source;
			String extension = iFile.getFileExtension();
			result = (extension != null)
					&& (extension.equals(DefaultDiscoverer.JAVA_FILE_EXTENSION));
		}
		return result;
	}

	@Override
	public String toString() {
		return Messages.DiscoverKdmModelFromJavaModel_title;
	}

}
