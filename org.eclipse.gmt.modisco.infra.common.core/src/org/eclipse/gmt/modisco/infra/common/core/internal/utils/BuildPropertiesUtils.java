/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Laurent Pichierri (Soft-Maint) - Bug 371204 - Compatibility with Helios (copied from org.eclipse.emf.facet.util.core.internal.BuildPropertiesUtils.getBuildModel(IPluginModelBase))
 *    Gregoire Dupe (Mia-Software) - Bug 382359 - Compatibility with Helios
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.utils;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmt.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.pde.core.IEditableModel;
import org.eclipse.pde.core.build.IBuild;
import org.eclipse.pde.core.build.IBuildEntry;
import org.eclipse.pde.core.build.IBuildModel;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;

public final class BuildPropertiesUtils {

	private BuildPropertiesUtils() {
		// utilities class
	}

	/**
	 * Get the build model of an Eclipse plug-in
	 *
	 * @param model
	 *            a plug-in's PDE model
	 * @return a build model or <code>null</code> if the build.properties file
	 *         does not exist
	 * @throws CoreException
	 */
	//Copied from org.eclipse.emf.facet.util.core.internal.BuildPropertiesUtils.getBuildModel(IPluginModelBase) (EPL)
	public static IBuildModel getBuildModel(final IPluginModelBase model) throws CoreException {
		IProject project = model.getUnderlyingResource().getProject();
		IPluginModelBase pluginModelBase = PluginRegistry.findModel(project);
		//Here we use a reflexive call to be able to build against an Helios platform.
		//This method will build with Helios, but will fail at runtime.
		//We do not have a better solution. Otherwise we would have to use an internal API.
		//We prefer some loose of functionality with Helios that to use internal API.
		IBuildModel buildModel  = null;
		try {
			Method method = pluginModelBase.getClass().getMethod("getBuildModel"); //$NON-NLS-1$
			if (method != null) {
				buildModel = (IBuildModel) method.invoke(pluginModelBase);
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
		}
		return buildModel;
	}

	/**
	 * @param project
	 *            the project for which to get a build model top level object
	 * @return a build model top level object or <code>null</code> if the
	 *         build.properties file does not exist
	 * @throws CoreException
	 */
	public static IBuild getBuild(final IProject project) throws CoreException {
		IPluginModelBase pluginModel = PluginRegistry.findModel(project);
		if (pluginModel == null) {
			return null;
		}
		IBuildModel buildModel = getBuildModel(pluginModel);
		if (buildModel == null) {
			return null;
		}
		return buildModel.getBuild();
	}

	/**
	 * @param elementFile
	 *            the file whose presence in the build.properties is being
	 *            tested
	 * @return whether the file is in the build.properties (<code>false</code>
	 *         if the build.properties file does not exist)
	 * @throws CoreException
	 */
	public static boolean isInBuild(final IFile elementFile) throws CoreException {
		final IProject project = elementFile.getProject();
		IPath filePath = elementFile.getFullPath().removeFirstSegments(1);
		IBuild build = getBuild(project);
		if (build == null) {
			return false;
		}
		IBuildEntry entry = build.getEntry(IBuildEntry.BIN_INCLUDES);
		if (entry == null) {
			return false;
		}
		String[] tokens = entry.getTokens();
		for (String token : tokens) {
			IPath path = new Path(token);
			// if "abc/" is included, then "abc/def/" is too
			if (path.isPrefixOf(filePath)) {
				return true;
			}
		}
		return false;
	}

	public static void addToBuild(final IFile elementFile) throws CoreException {
		final IProject project = elementFile.getProject();
		if (isInBuild(elementFile)) {
			return;
		}
		IPath filePath = elementFile.getFullPath().removeFirstSegments(1);
		IPluginModelBase pluginModel = PluginRegistry.findModel(project);

		IFile buildProperties = elementFile.getProject().getFile("build.properties"); //$NON-NLS-1$
		if (!buildProperties.exists()) {
			buildProperties.create(new ByteArrayInputStream(new byte[0]), true,
					new NullProgressMonitor());
		}
		IBuildModel buildModel = getBuildModel(pluginModel);
		if (buildModel == null) {
			throw new RuntimeException("Couldn't get build model"); //$NON-NLS-1$
		}
		IBuild build = buildModel.getBuild();
		IBuildEntry entry = build.getEntry(IBuildEntry.BIN_INCLUDES);

		// if entry "bin.includes" does not exist, then create it
		if (entry == null) {
			entry = buildModel.getFactory().createEntry(IBuildEntry.BIN_INCLUDES);
			build.add(entry);
		}
		entry.addToken(filePath.toPortableString());
		((IEditableModel) buildModel).save();
	}
}
