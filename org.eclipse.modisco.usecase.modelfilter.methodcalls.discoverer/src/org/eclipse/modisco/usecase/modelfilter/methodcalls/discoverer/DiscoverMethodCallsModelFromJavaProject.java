/**
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Nicolas Bros (Mia-Software) - Bug 343647 - [Model Filter] NPE when navigating into "method calls" resulting model
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.MethodcallsConstants;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.internal.converter.MethodCallsGraphConverter;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel;

public class DiscoverMethodCallsModelFromJavaProject extends
		AbstractModelDiscoverer<IJavaProject> {

	public boolean isApplicableTo(final IJavaProject source) {
		return source.getProject().isAccessible();
	}

	@Override
	protected void basicDiscoverElement(final IJavaProject javaProject,
			final IProgressMonitor monitor) throws DiscoveryException {
		IProject project = javaProject.getProject();
		DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
		discoverer.discoverElement(javaProject, monitor);
		Resource javaModel = discoverer.getTargetModel();
		String filepath = project.getFullPath().append(project.getName())
				+ MethodcallsConstants.MODEL_EXTENSION;
		setDefaultTargetURI(URI.createPlatformResourceURI(filepath, true));
		javaModel.setURI(deriveJavaModelUri());
		MethodCallsGraphConverter callsConverter = new MethodCallsGraphConverter();
		CallsModel model = callsConverter
				.convertJavaResourceToMethodCallsModel(javaModel,
						project.getName());
		createTargetModel();
		getTargetModel().getContents().add(model);
		getResourceSet().getResources().add(javaModel);
	}

	private URI deriveJavaModelUri() {
		URI mainURI = getTargetURI();
		if (mainURI == null || mainURI.toString().trim().length() == 0) {
			mainURI = getDefaultTargetURI();
		}
		String lastSegment = mainURI.lastSegment();
		String baseName;
		if (lastSegment
				.endsWith(MethodcallsConstants.MODEL_EXTENSION)) {
			baseName = lastSegment
					.substring(
							0,
							lastSegment.length()
									- MethodcallsConstants.MODEL_EXTENSION
											.length());
		} else if (lastSegment.endsWith(".xmi")) { //$NON-NLS-1$
			baseName = lastSegment.substring(0, lastSegment.length() - ".xmi".length()); //$NON-NLS-1$
		} else {
			baseName = lastSegment;
		}
		mainURI = mainURI.trimSegments(1);
		return mainURI.appendSegment(baseName + JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX);
	}

	@Override
	protected void saveTargetModel() throws IOException {
		super.saveTargetModel();
		Map<String, Object> options = new HashMap<String, Object>();
		final int flushThreshold = 65536;
		options.put(XMLResource.OPTION_FLUSH_THRESHOLD, Integer.valueOf(flushThreshold));
		options.put(XMLResource.OPTION_USE_FILE_BUFFER, Boolean.TRUE);

		// save Java Resource
		Resource targetModel = getTargetModel();
		if (targetModel != null) {
			EList<Resource> resources = targetModel.getResourceSet().getResources();
			for (Resource resource : resources) {
				if (resource != targetModel) {
					resource.save(options);
				}
			}
		}
	}
}
