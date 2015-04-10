/*********************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer.internal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.gmt.modisco.xml.internal.resource.GenericXMLHandler;
import org.eclipse.gmt.modisco.xml.resource.GenericXMLResourceFactoryImpl;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

public final class Utils {

	private Utils() {
		// Must not be used
	}
	
	private static final Resource.Factory RESOURCE_FACTORY = new GenericXMLResourceFactoryImpl();
	
	public static boolean isXmlFile(final IFile file) {
		boolean result = false;
		try {
			// without content information, propose XML discovery
			result = true;
			final IContentType xmlContentType = getXmlContentType();
			final IContentType candidateType = getCandidateType(file);
			if (candidateType != null) {
				result = candidateType.isKindOf(xmlContentType);
			}
		} catch (CoreException e) {
			final String message = String.format(
					"Could not test xml nature for file %s.", //$NON-NLS-1$
					file.toString());
			Logger.logError(e, message, XmlActivator.getDefault());
		}
		return result;
	}

	private static IContentType getXmlContentType() {
		final IContentTypeManager cTypeMgr = Platform.getContentTypeManager();
		return cTypeMgr.getContentType("org.eclipse.core.runtime.xml"); //$NON-NLS-1$
	}

	private static IContentType getCandidateType(final IFile file) throws CoreException {
		IContentType result = null;
		if (file.exists() && file.isSynchronized(IResource.DEPTH_ZERO)) {
			final IContentDescription contentDesc = file.getContentDescription();
			if (contentDesc != null) {
				result = contentDesc.getContentType();
			}
		}
		return result;
	}

	public static boolean isXmlFile(final IResource resource) {
		boolean result = false;
		if (resource instanceof IFile) {
			final IFile file = (IFile) resource;
			result = isXmlFile(file);
		}
		return result;
	}

	public static Resource discoverResource(final URI sourceURI, final boolean ignoreWhitespace,
			final boolean lightweightModel) throws DiscoveryException {
		try {
			final Resource resource = Utils.RESOURCE_FACTORY.createResource(sourceURI);
			final Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put(GenericXMLHandler.OPTION_IGNORE_WHITESPACE,
					Boolean.valueOf(ignoreWhitespace));
			parameters.put(GenericXMLHandler.OPTION_LIGHTWEIGHT_MODEL,
					Boolean.valueOf(lightweightModel));
			resource.load(parameters);
			return resource;
		} catch (IOException e) {
			final String message = String.format(
					"An error occurred during model discovery from: %s", //$NON-NLS-1$
					sourceURI.toString());
			throw new DiscoveryException(message, e);
		}
	}
	
	public static URI createSourceURI(final IFile source) {
		final String absolutePath = source.getFullPath().toString();
		return URI.createPlatformResourceURI(absolutePath, true);
	} 

}
