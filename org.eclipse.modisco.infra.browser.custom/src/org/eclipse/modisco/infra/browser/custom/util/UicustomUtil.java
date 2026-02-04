/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.FeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.swt.graphics.RGB;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class UicustomUtil {

	private static final int MAX_COLOR_INTENSITY = 255;

	private UicustomUtil() {
		// cannot be instantiated
	}

	private static final Pattern RGB_PATTERN = Pattern.compile("\\((\\d+),(\\d+),(\\d+)\\)"); //$NON-NLS-1$
	private static final int RGB_PATTERN_GROUP_RED = 1;
	private static final int RGB_PATTERN_GROUP_GREEN = 2;
	private static final int RGB_PATTERN_GROUP_BLUE = 3;

	/**
	 * Decode the given color string (R,G,B)
	 * 
	 * @return the corresponding color, or <code>null</code> if the given string
	 *         does not define a valid color
	 */
	public static RGB decodeColor(final String strColor) {
		Matcher matcher = UicustomUtil.RGB_PATTERN.matcher(strColor);
		if (matcher.matches()) {
			try {
				int r = Integer.parseInt(matcher.group(UicustomUtil.RGB_PATTERN_GROUP_RED));
				int g = Integer.parseInt(matcher.group(UicustomUtil.RGB_PATTERN_GROUP_GREEN));
				int b = Integer.parseInt(matcher.group(UicustomUtil.RGB_PATTERN_GROUP_BLUE));
				if (r >= 0 && r <= UicustomUtil.MAX_COLOR_INTENSITY && g >= 0
						&& g <= UicustomUtil.MAX_COLOR_INTENSITY && b >= 0
						&& b <= UicustomUtil.MAX_COLOR_INTENSITY) {
					return new RGB(r, g, b);
				}
			} catch (NumberFormatException e) {
				return null;
			}
		}
		return null;
	}

	public static OverlayIconInfo decodeOverlayIcon(final String encodedOverlayIcon) {
		String[] parts = encodedOverlayIcon.split(":"); //$NON-NLS-1$
		if (parts.length != 2) {
			throw new IllegalArgumentException("overlay icon should be encoded as 'path:position'"); //$NON-NLS-1$
		}
		return new OverlayIconInfo(parts[0], OverlayIconPosition.valueOf(parts[1]));
	}

	public static String encodeOverlayIcon(final String path, final OverlayIconPosition iconPosition) {
		return path + ":" + iconPosition; //$NON-NLS-1$
	}

	public static CustomizableFeatures getCustomizedFeature(final FeatureValue featureValue) {
		CustomViewFeature feature = featureValue.getFeature();
		if (feature == null) {
			return featureValue.getCase().getFeature().getCustomizedFeature();
		}
		return feature.getCustomizedFeature();
	}

	/**
	 * @return the {@link FeatureValue} of the given {@link CustomViewFeature}
	 *         or {@link FeatureValueCase}, or <code>null</code> if the given
	 *         element is not of one of these types
	 */
	public static FeatureValue getFeatureValue(final Object element) {
		if (element instanceof CustomViewFeature) {
			CustomViewFeature customViewFeature = (CustomViewFeature) element;
			return customViewFeature.getDefaultValue();
		} else if (element instanceof FeatureValueCase) {
			FeatureValueCase valueCase = (FeatureValueCase) element;
			return valueCase.getValue();
		}
		return null;
	}
}
