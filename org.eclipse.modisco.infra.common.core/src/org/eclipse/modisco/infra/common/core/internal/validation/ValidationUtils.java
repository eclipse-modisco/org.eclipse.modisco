/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.internal.Messages;
import org.eclipse.modisco.infra.common.core.internal.utils.BuildPropertiesUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.PluginUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.build.IBuildEntry;

public final class ValidationUtils {

	private ValidationUtils() {
		// utilities class
	}

	/**
	 * Check that all files with the given extension are registered in the
	 * plugin.xml and build.properties.
	 * <p>
	 * Puts warning markers on the plugin.xml, build.properties, or directly on
	 * the project if needed. Replaces previous markers of the same type.
	 *
	 * @param project
	 *            the project in which the element should be registered
	 * @param extensionToCheck
	 *            the file extension of the elements that should be registered
	 * @param markerType
	 *            the type of the marker that will be used
	 * @param elementType
	 *            a name for the element type in the error message
	 * @param extensionPoint
	 *            the extension point that is used to register elements of this
	 *            kind (elements must be declared with a "file" attribute)
	 */
	public static void validateRegistered(final IProject project, final String extensionToCheck,
			final String markerType, final String elementType, final String extensionPoint) {
		final List<IFile> notDeclared = new ArrayList<IFile>();
		final List<IFile> notInBuild = new ArrayList<IFile>();
		try {
			project.accept(new IResourceVisitor() {
				public boolean visit(final IResource resource) throws CoreException {
					String fileExtension = resource.getFileExtension();
					if (resource.getType() == IResource.FILE && fileExtension != null
							&& fileExtension.equals(extensionToCheck)) {
						IFile file = (IFile) resource;
						if (!PluginUtils.isRegistered(file, extensionPoint)) {
							notDeclared.add(file);
						}
						try {
							if (!BuildPropertiesUtils.isInBuild(file)) {
								notInBuild.add(file);
							}
						} catch (CoreException e) {
							MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
						}
					}
					return true;
				}
			});
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
		}

		try {
			project.deleteMarkers(markerType, true, IResource.DEPTH_ONE);
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
		}

		IResource markersResource;
		IFile pluginXML = project.getFile("plugin.xml"); //$NON-NLS-1$
		if (pluginXML.exists()) {
			markersResource = pluginXML;
			try {
				pluginXML.deleteMarkers(markerType, true, IResource.DEPTH_ONE);
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
			}
		} else {
			markersResource = project;
		}

		IResource buildMarkersResource;
		IFile buildProperties = project.getFile("build.properties"); //$NON-NLS-1$
		if (buildProperties.exists()) {
			buildMarkersResource = buildProperties;
			try {
				buildProperties.deleteMarkers(markerType, true, IResource.DEPTH_ONE);
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
			}
		} else {
			buildMarkersResource = project;
		}

		for (IFile file : notDeclared) {
			try {
				String message = NLS.bind(Messages.ValidationUtils_shouldBeRegistered, elementType,
						file.getName());
				IMarker marker = markersResource.createMarker(markerType);
				marker.setAttribute(IMarker.MESSAGE, message);
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
			}
		}

		for (IFile file : notInBuild) {
			try {
				String message = NLS.bind(Messages.ValidationUtils_shouldBeInBin,
						new Object[] { IBuildEntry.BIN_INCLUDES, elementType, file.getName() });
				IMarker marker = buildMarkersResource.createMarker(markerType);
				marker.setAttribute(IMarker.MESSAGE, message);
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
			}
		}
	}
}
