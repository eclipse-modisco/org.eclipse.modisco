/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.extensions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.modisco.infra.common.core.internal.extensions.AbstractRegistry;

/** Registry for the "loadingDepth" extension point */
public class LoadingDepthRegistry extends AbstractRegistry {

	public static final int INFINITE = -1;
	public static final int UNDEFINED = -2;

	private static final String EXTENSION_POINT_NAMESPACE = "org.eclipse.gmt.modisco.infra.browser"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAME = "loadingDepth"; //$NON-NLS-1$

	private static final String LOADING_DEPTH_ELEMENT = "loadingDepth"; //$NON-NLS-1$
	private static final String METAMODEL_ATTRIBUTE = "metamodel"; //$NON-NLS-1$
	private static final String DEPTH_ATTRIBUTE = "depth"; //$NON-NLS-1$

	private static LoadingDepthRegistry instance = null;

	/** A map of metamodels nsURIs to loading depths */
	private final Map<String, Integer> loadingDepths = new HashMap<String, Integer>();

	public static LoadingDepthRegistry getInstance() {
		if (LoadingDepthRegistry.instance == null) {
			LoadingDepthRegistry.instance = new LoadingDepthRegistry();
		}
		return LoadingDepthRegistry.instance;
	}

	public LoadingDepthRegistry() {
		initialize();
	}

	public int getLoadingDepth(final String nsURI) {
		Integer depth = this.loadingDepths.get(nsURI);
		if (depth == null || depth < -1) {
			return LoadingDepthRegistry.UNDEFINED;
		}
		return depth;
	}

	@Override
	protected String getExtensionPointName() {
		return LoadingDepthRegistry.EXTENSION_POINT_NAME;
	}

	@Override
	protected String getExtensionPointNamespace() {
		return LoadingDepthRegistry.EXTENSION_POINT_NAMESPACE;
	}

	@Override
	protected void handleRootElement(final IConfigurationElement configurationElement) {
		final String name = configurationElement.getName();
		if (name.equalsIgnoreCase(LoadingDepthRegistry.LOADING_DEPTH_ELEMENT)) {
			readLoadingDepthElement(configurationElement);
		} else {
			logUnknownElement(configurationElement);
		}
	}

	/** Read a 'loadingDepth' element */
	private void readLoadingDepthElement(final IConfigurationElement configurationElement) {
		final String metamodel = configurationElement
				.getAttribute(LoadingDepthRegistry.METAMODEL_ATTRIBUTE);
		if (metamodel == null) {
			logMissingAttribute(configurationElement, LoadingDepthRegistry.METAMODEL_ATTRIBUTE);
			return;
		}
		final String depth = configurationElement
				.getAttribute(LoadingDepthRegistry.DEPTH_ATTRIBUTE);
		if (depth == null) {
			logMissingAttribute(configurationElement, LoadingDepthRegistry.DEPTH_ATTRIBUTE);
			return;
		}

		int intDepth;
		try {
			intDepth = Integer.parseInt(depth);
		} catch (NumberFormatException e) {
			logError(configurationElement, "depth is not a valid integer"); //$NON-NLS-1$
			return;
		}

		if (intDepth < -1) {
			logError(configurationElement, "invalid depth"); //$NON-NLS-1$
			return;
		}

		this.loadingDepths.put(metamodel, intDepth);
	}
}
