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
package org.eclipse.modisco.infra.browser.custom.editor.dialogs;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.ColorSelector;
import org.eclipse.modisco.infra.browser.custom.editor.Activator;
import org.eclipse.modisco.infra.browser.custom.util.UicustomUtil;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/** A dialog to set the value of a customized color feature with a color picker. */
public class ColorFeatureDialog extends EditFeatureValueDialog {

	public ColorFeatureDialog(final Shell parentShell, final boolean withCondition,
			final boolean withDefault, final List<String> availableQuerySets,
			final List<Class<?>> expectedReturnTypes, final EClass customizedMetaclass) {
		super(parentShell, withCondition, withDefault, availableQuerySets, expectedReturnTypes,
				customizedMetaclass);
	}

	private ColorSelector colorSelector;

	@Override
	protected void createValueEditor(final Composite parent) {
		this.colorSelector = new ColorSelector(parent);
		if (getInitialStaticValue() != null) {
			final RGB color = UicustomUtil.decodeColor(getInitialStaticValue());
			if (color != null) {
				this.colorSelector.setColorValue(color);
			} else {
				Activator.logError("Wrong color format : " //$NON-NLS-1$
						+ getInitialStaticValue());
			}
		} else {
			this.colorSelector.setColorValue(new RGB(0, 0, 0));
		}
	}

	@Override
	protected void okPressed() {
		final RGB col = this.colorSelector.getColorValue();
		setStaticValue("(" + col.red + "," + col.green + "," //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ col.blue + ")"); //$NON-NLS-1$
		super.okPressed();
	}
}
