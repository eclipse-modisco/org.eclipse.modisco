/**
 * Copyright (c) 2009, 2020 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter;

import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.usecase.simpletransformationschain.DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject;

/**
 * @deprecated See Bug 559506- the KDMtoUML transformation has not been revised for UML2 5.0.0.
 */
@Deprecated
public class DiscoverUmlModelWithRealTypesFromJavaProject extends
		AbstractModelDiscoverer<IJavaProject> {

	public boolean isApplicableTo(final IJavaProject source) {
		return source.getProject().isAccessible();
	}

	@Override
	protected void basicDiscoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		try {
			IProject project = source.getProject();
			setDefaultTargetURI(URI.createPlatformResourceURI(
					project.getFullPath().append(project.getName()) + "_RealTypes.uml", true)); //$NON-NLS-1$
			URL umlTransformation = this.getClass().getResource(
					"internal/transformations/RealTypeUML.asm"); //$NON-NLS-1$
			DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject discoverer = new DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject();
			discoverer.setCustomTransformation(umlTransformation);
			discoverer.discoverElement(source, monitor);
			setTargetModel(discoverer.getTargetModel());
		} catch (Exception e) {
			throw new DiscoveryException(e);
		}
	}
}
