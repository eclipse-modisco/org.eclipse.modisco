/*********************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer.internal;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

/**
 * Discover generic XML model action.
 */
public class XMLModelDiscovererFromJavaElement extends AbstractXMLModelDiscoverer<IJavaElement> {

	public boolean isApplicableTo(final IJavaElement project) {
		return true;
	}
	
	@Override
	protected void basicDiscoverElement(final IJavaElement javaElt,
			final IProgressMonitor monitor)	throws DiscoveryException {
		final IPath path = javaElt.getPath();
		final String uriStr = String.format("platform:/plugin/%s", //$NON-NLS-1$
				path.toString());
		final URI defaultUri = URI.createURI(uriStr);
		setDefaultTargetURI(defaultUri);
		final ResourceSet resourceSet = getResourceSet();
		URI uri = getTargetURI();
		if (uri == null) {
			uri = getDefaultTargetURI();
		}
		final Resource globalResource = resourceSet.createResource(uri);
		final WorkspaceVisitor vistor = new WorkspaceVisitor(globalResource,
				this.isLightweightModel(), isIgnoreWhitespace());
		try {
			setTargetModel(globalResource);
			final IResource wsResource = javaElt.getCorrespondingResource();
			wsResource.accept(vistor);
			vistor.check();
		} catch (CoreException e) {
			Logger.logError(e, XmlActivator.getDefault());
			throw new DiscoveryException(e);
		}
	}

}
