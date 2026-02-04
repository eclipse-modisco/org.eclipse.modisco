/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.customization;

import org.eclipse.modisco.infra.browser.custom.util.OverlayIconPosition;
import org.eclipse.swt.graphics.Image;

/**
 * Represents an overlay icon positioned over the man icon of an element in a tree widget. The icon
 * can have a different position depending on the value of the given {@link OverlayIconPosition}
 * instance.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class OverlayIconImageInfo {
	private final OverlayIconPosition iconPosition;
	private final Image image;

	public OverlayIconImageInfo(final Image image, final OverlayIconPosition iconPosition) {
		this.image = image;
		this.iconPosition = iconPosition;
	}

	public Image getImage() {
		return this.image;
	}

	public OverlayIconPosition getIconPosition() {
		return this.iconPosition;
	}
}