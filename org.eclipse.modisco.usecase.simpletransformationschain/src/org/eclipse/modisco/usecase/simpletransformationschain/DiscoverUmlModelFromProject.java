/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.usecase.simpletransformationschain;

import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.usecase.simpletransformationschain.internal.Activator;

public class DiscoverUmlModelFromProject extends AbstractModelDiscoverer<IProject> {

	private URL customTransformation = null;

	@Parameter(name = "CUSTOM_TRANSFORMATION", description = "A URL pointing to an ATL transformation that will be used instead of the default one.")
	public void setCustomTransformation(final URL customTransformation) {
		this.customTransformation = customTransformation;
	}

	protected URL getCustomTransformation() {
		return this.customTransformation;
	}

	public boolean isApplicableTo(final IProject source) {
		try {
			return source.isAccessible() && source.getNature(JavaCore.NATURE_ID) != null;
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
			return false;
		}
	}

	@Override
	protected void basicDiscoverElement(final IProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		DiscoverUmlModelFromJavaProject discoverer = new DiscoverUmlModelFromJavaProject();
		discoverer.setCustomTransformation(getCustomTransformation());
		discoverer.setRefreshSourceBeforeDiscovery(getRefreshSourceBeforeDiscovery());
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetModel(getTargetModel());
		discoverer.setTargetURI(getTargetURI());
		discoverer.discoverElement(JavaCore.create(source), monitor);
		setTargetModel(discoverer.getTargetModel());
	}
}
