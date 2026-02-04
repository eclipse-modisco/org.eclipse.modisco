/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;

/**
 * @author Gregoire DUPE (Mia-Software)
 * @see ModiscoResourceFactoryImpl
 */
public class ModiscoURIHandler implements URIHandler {

	private static final String DEBUG_ID = "org.eclipse.modisco.infra.common.core/debug/ModiscoURIHandler/debug"; //$NON-NLS-1$
	public static final boolean DEBUG = CommonModiscoActivator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(ModiscoURIHandler.DEBUG_ID));

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#canHandle(org.eclipse.emf.common
	 * .util.URI)
	 */
	public boolean canHandle(final URI uri) {
		return uri != null && "modisco".equals(uri.scheme()); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#contentDescription(org.eclipse
	 * .emf.common.util.URI, java.util.Map)
	 */
	public Map<String, ?> contentDescription(final URI uri, final Map<?, ?> options)
			throws IOException {
		URI convertedURI = convertURI(uri);
		for (URIHandler defaultUriHandler : URIHandler.DEFAULT_HANDLERS) {
			if (defaultUriHandler.canHandle(convertedURI)) {
				return defaultUriHandler.contentDescription(convertedURI, options);
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#createInputStream(org.eclipse
	 * .emf.common.util.URI, java.util.Map)
	 */
	public InputStream createInputStream(final URI uri, final Map<?, ?> options) throws IOException {
		URI convertedURI = convertURI(uri);
		for (URIHandler defaultUriHandler : URIHandler.DEFAULT_HANDLERS) {
			if (defaultUriHandler.canHandle(convertedURI)) {
				return defaultUriHandler.createInputStream(convertedURI, options);
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#createOutputStream(org.eclipse
	 * .emf.common.util.URI, java.util.Map)
	 */
	public OutputStream createOutputStream(final URI uri, final Map<?, ?> options)
			throws IOException {
		URI convertedURI = convertURI(uri);
		for (URIHandler defaultUriHandler : URIHandler.DEFAULT_HANDLERS) {
			if (defaultUriHandler.canHandle(convertedURI)) {
				return defaultUriHandler.createOutputStream(convertedURI, options);
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#delete(org.eclipse.emf.common
	 * .util.URI, java.util.Map)
	 */
	public void delete(final URI uri, final Map<?, ?> options) throws IOException {
		URI convertedURI = convertURI(uri);
		for (URIHandler defaultUriHandler : URIHandler.DEFAULT_HANDLERS) {
			if (defaultUriHandler.canHandle(convertedURI)) {
				defaultUriHandler.delete(convertedURI, options);
				break;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#exists(org.eclipse.emf.common
	 * .util.URI, java.util.Map)
	 */
	public boolean exists(final URI uri, final Map<?, ?> options) {
		URI convertedURI;
		try {
			convertedURI = convertURI(uri);
			for (URIHandler defaultUriHandler : URIHandler.DEFAULT_HANDLERS) {
				if (defaultUriHandler.canHandle(convertedURI)) {
					return defaultUriHandler.exists(convertedURI, options);
				}
			}
		} catch (IOException e) {
			return false;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#getAttributes(org.eclipse.emf
	 * .common.util.URI, java.util.Map)
	 */
	public Map<String, ?> getAttributes(final URI uri, final Map<?, ?> options) {
		URI convertedURI;
		try {
			convertedURI = convertURI(uri);
			for (URIHandler defaultUriHandler : URIHandler.DEFAULT_HANDLERS) {
				if (defaultUriHandler.canHandle(convertedURI)) {
					return defaultUriHandler.getAttributes(convertedURI, options);
				}
			}
		} catch (IOException e) {
			return null;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.emf.ecore.resource.URIHandler#setAttributes(org.eclipse.emf
	 * .common.util.URI, java.util.Map, java.util.Map)
	 */
	public void setAttributes(final URI uri, final Map<String, ?> attributes,
			final Map<?, ?> options) throws IOException {
		URI convertedURI = convertURI(uri);
		for (URIHandler defaultUriHandler : URIHandler.DEFAULT_HANDLERS) {
			if (defaultUriHandler.canHandle(convertedURI)) {
				defaultUriHandler.setAttributes(convertedURI, attributes, options);
				break;
			}
		}
	}

	private URI convertURI(final URI uri) throws IOException {
		URI convertedURI;
		try {
			String schemeSpecificPart = uri.segment(0);
			IModiscoProtocolExtension factoryExt = ModiscoProtocolExtensionRegistry
					.getFactoryExtMap().get(schemeSpecificPart);
			if (factoryExt == null) {
				IOException e = new ModiscoProtocolException(
						"Wrong sub modisco protocol: " + schemeSpecificPart); //$NON-NLS-1$
				throw e;
			}
			convertedURI = factoryExt.getURI(uri.segment(1));
			if (convertedURI == null) {
				IOException e = new ModiscoProtocolException(
						"Model not found: " + schemeSpecificPart + ": " //$NON-NLS-1$ //$NON-NLS-2$
								+ uri.segment(1));

				throw e;
			}
		} catch (IOException e) {
			if (ModiscoURIHandler.DEBUG) {
				IStatus status = new Status(IStatus.ERROR, CommonModiscoActivator.PLUGIN_ID,
						e.getMessage(), e);
				CommonModiscoActivator.getDefault().getLog().log(status);
			}
			throw e;
		}
		return convertedURI;
	}

}
