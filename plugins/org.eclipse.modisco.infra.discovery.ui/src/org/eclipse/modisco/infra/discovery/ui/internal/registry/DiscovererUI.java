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

import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.swt.graphics.Image;

/**
 * The definition for the UI part of a {@link IDiscoverer}, defined using the
 * <code>org.eclipse.modisco.infra.discovery.ui.discoverer</code> extension
 * point.
 */
public class DiscovererUI {
	private final String id;
	private final String label;
	private final String path;
	private final Image image;

	public DiscovererUI(final String id, final String label, final String path, final Image image) {
		this.id = id;
		this.label = label;
		this.path = path;
		this.image = image;
	}

	public String getId() {
		return this.id;
	}

	public String getLabel() {
		return this.label;
	}

	public String getPath() {
		if (this.path == null) {
			return ""; //$NON-NLS-1$
		}
		return this.path;
	}

	public Image getImageIcon() {
		return this.image;
	}
}
