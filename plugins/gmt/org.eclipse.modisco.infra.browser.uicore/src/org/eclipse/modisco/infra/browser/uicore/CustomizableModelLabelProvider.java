/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * A label provider used to display a model customized with a MoDico customization.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomizableModelLabelProvider extends LabelProvider implements IColorProvider,
		IFontProvider {

	/* Will likely be useful in the future */
	@SuppressWarnings("unused")
	private final CustomizationManager customizationManager;

	public CustomizableModelLabelProvider(final CustomizationManager customizationManager) {
		this.customizationManager = customizationManager;
	}

	@Override
	public String getText(final Object element) {
		final String prefix;
		if (element instanceof ModelElementItem) {
			// to leave room for icon overlays
			prefix = " "; //$NON-NLS-1$
		} else {
			prefix = ""; //$NON-NLS-1$
		}

		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return prefix + treeElement.getText();
		}
		// for multiplicity-many attributes
		return prefix + element.toString();

	}

	@Override
	public Image getImage(final Object element) {
		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return treeElement.getImage();
		}
		return null;
	}

	public Font getFont(final Object element) {
		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return treeElement.getFont();
		}
		return null;
	}

	public Color getForeground(final Object element) {
		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return treeElement.getForeground();
		}
		return null;
	}

	public Color getBackground(final Object element) {
		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return treeElement.getBackground();
		}
		return null;
	}
}
