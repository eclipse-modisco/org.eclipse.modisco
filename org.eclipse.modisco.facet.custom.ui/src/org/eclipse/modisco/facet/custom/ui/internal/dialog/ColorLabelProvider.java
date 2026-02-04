/**
 *  Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Grégoire Dupé (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *  	Grégoire Dupé (Mia-Software) - Bug 472747 - The customization loading dialog is not easily readable
 */
package org.eclipse.modisco.facet.custom.ui.internal.dialog;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.custom.ui.internal.ImageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class ColorLabelProvider extends LabelProvider implements IColorProvider {

	private final LoadCustomizationsDialog<?> loadCustomDialog;

	public ColorLabelProvider(final LoadCustomizationsDialog<?> loadCustomDialog) {
		super();
		this.loadCustomDialog = loadCustomDialog;
	}

	@Override
	public String getText(final Object element) {
		final Customization customization = (Customization) element;
		String name = customization.getName();
		if (name == null) {
			name = ""; //$NON-NLS-1$
		}
		return name.replaceAll("(.*)\\.(.*)", "$2 ($1)");  //$NON-NLS-1$//$NON-NLS-2$
	}

	@Override
	public Image getImage(final Object element) {
		Image result;
		if (this.loadCustomDialog.getLockedCustoms().contains(element)) {
			result = ImageProvider.getInstance().getGrayedUiCustomIcon();
		} else {
			result = ImageProvider.getInstance().getUiCustomIcon();
		}
		return result;
	}

	public Color getForeground(final Object element) {
		Color result = null;
		if (this.loadCustomDialog.getLockedCustoms().contains(element)) {
				result = Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
		}
		return result;
	}

	public Color getBackground(final Object element) {
		return null;
	}

}