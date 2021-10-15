/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.registry;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.infra.common.core.internal.extensions.AbstractRegistry;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

/**
 * The singleton registry for extensions to the
 * <code>org.eclipse.modisco.infra.discovery.ui.discoverer</code> extension
 * point. It initializes the registry by reading extensions when first accessed.
 */
public class DiscovererUIRegistry extends AbstractRegistry {

	private static final String EXTENSION_POINT_NAMESPACE = "org.eclipse.modisco.infra.discovery.ui"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAME = "discoverer"; //$NON-NLS-1$

	private static final String DISCOVERER_ELEMENT = "discoverer"; //$NON-NLS-1$
	private static final String ID_ATTRIBUTE = "discovererID"; //$NON-NLS-1$
	private static final String LABEL_ATTRIBUTE = "label"; //$NON-NLS-1$
	private static final String PATH_ATTRIBUTE = "path"; //$NON-NLS-1$
	private static final String ICON_ATTRIBUTE = "icon"; //$NON-NLS-1$

	private static DiscovererUIRegistry instance = null;

	/** A map of discoverer UI names to {@link DiscovererUI} */
	private final Map<String, DiscovererUI> discovererUI = new HashMap<String, DiscovererUI>();

	public static DiscovererUIRegistry getInstance() {
		if (DiscovererUIRegistry.instance == null) {
			DiscovererUIRegistry.instance = new DiscovererUIRegistry();
		}
		return DiscovererUIRegistry.instance;
	}

	public DiscovererUIRegistry() {
		initialize();
	}

	/**
	 * Query the discoverers UI registry for a {@link DiscovererUI} for the
	 * discoverer with the given name.
	 *
	 * @param name
	 *            the name of the {@link DiscovererUI} that is looked for
	 *
	 * @return the {@link DiscovererUI} or <code>null</code> if none was found
	 *         with the given name
	 */
	public DiscovererUI getDiscovererUI(final String name) {
		return this.discovererUI.get(name);
	}

	@Override
	public String getExtensionPointName() {
		return DiscovererUIRegistry.EXTENSION_POINT_NAME;
	}

	@Override
	public String getExtensionPointNamespace() {
		return DiscovererUIRegistry.EXTENSION_POINT_NAMESPACE;
	}

	@Override
	protected void handleRootElement(final IConfigurationElement configurationElement) {
		final String name = configurationElement.getName();
		if (name.equalsIgnoreCase(DiscovererUIRegistry.DISCOVERER_ELEMENT)) {
			readDiscovererElement(configurationElement);
		} else {
			logUnknownElement(configurationElement);
		}
	}

	/** Read a 'discoverer' element */
	private void readDiscovererElement(final IConfigurationElement configurationElement) {
		final String discovererID = configurationElement
				.getAttribute(DiscovererUIRegistry.ID_ATTRIBUTE);
		if (discovererID == null) {
			logMissingAttribute(configurationElement, DiscovererUIRegistry.ID_ATTRIBUTE);
			return;
		}

		if (IDiscoveryManager.INSTANCE.getDiscovererDescription(discovererID) == null) {
			logError(
					configurationElement,
					"attribute " + DiscovererUIRegistry.ID_ATTRIBUTE + "=\"" + discovererID + "\" doesn't refer to an existing discoverer."); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		}

		final String discovererLabel = configurationElement
				.getAttribute(DiscovererUIRegistry.LABEL_ATTRIBUTE);
		if (discovererLabel == null) {
			logMissingAttribute(configurationElement, DiscovererUIRegistry.LABEL_ATTRIBUTE);
			return;
		}
		// (optional)
		final String discovererPath = configurationElement
				.getAttribute(DiscovererUIRegistry.PATH_ATTRIBUTE);
		// (optional)
		final String discovererIcon = configurationElement
				.getAttribute(DiscovererUIRegistry.ICON_ATTRIBUTE);

		Image image = null;
		if (discovererIcon != null) {
			Bundle bundle = Platform.getBundle(configurationElement.getDeclaringExtension()
					.getNamespaceIdentifier());
			URL url = bundle.getResource(discovererIcon);
			if (url == null) {
				logError(configurationElement, "icon attribute does not refer to an existing file"); //$NON-NLS-1$
				return;
			}

			image = ImageDescriptor.createFromURL(url).createImage(false);
			if (image == null) {
				logError(configurationElement,
						"Could not create an image from the icon attribute: " //$NON-NLS-1$
								+ discovererIcon);
			}
		}

		this.discovererUI.put(discovererID, new DiscovererUI(discovererID, discovererLabel,
				discovererPath, image));
	}
}
