/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.uicore;

import java.util.Collections;
import java.util.List;

import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * A message that appears instead of model elements, for example when the list is empty or the input
 * is <code>null</code>.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class Message implements ITreeElement {
	private final String message;

	public Message(final String message) {
		this.message = message;
	}

	public String getText() {
		return this.message;
	}

	public Image getImage() {
		return null;
	}

	public ITreeElement getTreeParent() {
		return null;
	}

	public boolean hasChildren() {
		return false;
	}

	public List<?> getChildren() {
		return Collections.emptyList();
	}

	public Color getForeground() {
		return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
	}

	public Color getBackground() {
		return null;
	}

	public Font getFont() {
		return null;
	}
}
