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
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.JavaModelUtils;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.MethodcallsConstants;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.internal.converter.MethodCallsGraphConverter;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel;

public class DiscoverMethodCallsModelFromJavaModel extends
		AbstractModelDiscoverer<IFile> {

	public boolean isApplicableTo(final IFile source) {
		return JavaModelUtils.isJavaModelFile(source);
	}

	@Override
	protected void basicDiscoverElement(final IFile file,
			final IProgressMonitor monitor) throws DiscoveryException {
		IProject project = file.getProject();
		IJavaProject javaProject = null;
		try {
			if (project.hasNature(JavaCore.NATURE_ID)) {
				javaProject = JavaCore.create(project);
			}
		} catch (CoreException e) {
			throw new DiscoveryException(e);
		}
		if (javaProject != null) {
			Resource javaResource = loadJavaModel(file);
			String filepath = project.getFullPath().append(project.getName())
					+ MethodcallsConstants.MODEL_EXTENSION;
			setDefaultTargetURI(URI.createPlatformResourceURI(filepath, true));

			MethodCallsGraphConverter callsConverter = new MethodCallsGraphConverter();
			CallsModel callsModel = callsConverter
					.convertJavaResourceToMethodCallsModel(javaResource,
							project.getName());

			createTargetModel();
			getTargetModel().getContents().add(callsModel);
		}
	}

	private static Resource loadJavaModel(final IFile file) throws DiscoveryException {
		Resource result = null;
		try {
			result = ModelUtils.loadModel(file.getLocation().toFile());
		} catch (IOException e) {
			throw new DiscoveryException(e);
		}
		return result;
	}

}
