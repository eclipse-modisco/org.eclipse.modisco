/*******************************************************************************
 * Copyright (c) 2011, 2020 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.usecase.simpletransformationschain.internal.Activator;

/**
 * @deprecated See Bug 559506- the KDMtoUML transformation has not been revised for UML2 5.0.0.
 */
@Deprecated
public class DiscoverUmlModelWithBidirectionalAssociationsFromProject extends
		AbstractModelDiscoverer<IProject> {

	private URL customTransformation = null;

	@Parameter(name = "CUSTOM_TRANSFORMATION", description = "A URL pointing to an ATL transformation that will be used instead of the default one.")
	public void setCustomTransformation(final URL customTransformation) {
		this.customTransformation = customTransformation;
	}

	protected URL getCustomTransformation() {
		return this.customTransformation;
	}

	@Override
	public boolean isApplicableTo(final IProject source) {
		try {
			return source.isAccessible() && source.getNature(JavaCore.NATURE_ID) != null;
		} catch (CoreException e) {
			Logger.logError(e, Activator.getDefault());
			return false;
		}
	}

	@Override
	protected void basicDiscoverElement(final IProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject discoverer = new DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject();
		discoverer.setCustomTransformation(getCustomTransformation());
		discoverer.setRefreshSourceBeforeDiscovery(getRefreshSourceBeforeDiscovery());
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetModel(getTargetModel());
		discoverer.setTargetURI(getTargetURI());
		discoverer.discoverElement(JavaCore.create(source), monitor);
		setTargetModel(discoverer.getTargetModel());
	}
}
