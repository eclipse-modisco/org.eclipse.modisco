/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.util;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class OverlayIconInfo {
	private final OverlayIconPosition iconPosition;
	private final String path;

	public OverlayIconInfo(final String path, final OverlayIconPosition iconPosition) {
		this.path = path;
		this.iconPosition = iconPosition;
	}

	public String getPath() {
		return this.path;
	}

	public OverlayIconPosition getIconPosition() {
		return this.iconPosition;
	}
}