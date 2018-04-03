/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.validation.constraints;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmt.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.gmt.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.gmt.modisco.infra.browser.custom.util.UicustomUtil;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

public class FontsValidation extends AbstractModelConstraint {

	private static Set<String> allSystemFonts = null;

	@Override
	public IStatus validate(final IValidationContext context) {
		EObject eObject = context.getTarget();
		EMFEventType eType = context.getEventType();
		// for batch mode
		if (eType == EMFEventType.NULL) {
			if (eObject instanceof StaticFeatureValue) {
				StaticFeatureValue value = (StaticFeatureValue) eObject;
				CustomizableFeatures customizedFeature = UicustomUtil.getCustomizedFeature(value);
				if (customizedFeature == CustomizableFeatures.FONT_NAME) {
					if (!isValidFont(value.getValue())) {
						return context.createFailureStatus(value.getValue());
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

	private boolean isValidFont(final String fontName) {
		return getAllsystemfonts().contains(fontName);
	}

	public static synchronized Set<String> getAllsystemfonts() {
		if (FontsValidation.allSystemFonts == null) {
			FontsValidation.allSystemFonts = new HashSet<String>();
			final Display display = new Display();
			// add all non-scalable fonts
			FontData[] fontDatas1 = display.getFontList(null, false);
			for (FontData fontData : fontDatas1) {
				FontsValidation.allSystemFonts.add(fontData.getName());
			}
			// add all scalable fonts
			FontData[] fontDatas2 = display.getFontList(null, true);
			for (FontData fontData : fontDatas2) {
				FontsValidation.allSystemFonts.add(fontData.getName());
			}
			display.dispose();
		}
		return FontsValidation.allSystemFonts;
	}
}
