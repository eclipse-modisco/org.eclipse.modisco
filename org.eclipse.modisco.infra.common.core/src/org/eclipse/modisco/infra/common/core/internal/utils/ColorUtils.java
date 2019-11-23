/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.utils;

public final class ColorUtils {
	private static final int MAX_RGB = 255;
	private static final int MAX_GREEN = 200;

	private ColorUtils() {
		// utility class
	}

	/**
	 * Get a color between red (for 0%) and green (for 100%), depending on the
	 * given percentage.
	 *
	 * @param ratio
	 *            a value between 0.0 and 1.0, inclusive.
	 * @return a color between red and green, as a string formatted as
	 *         <code>(R,G,B)</code>
	 */
	public static String getRGB(final float ratio) {
		float f = ratio;

		if (f > 1.0f) {
			f = 1.0f;
		} else if (f < 0.0f) {
			f = 0.0f;
		}
		int g = (int) (ColorUtils.MAX_GREEN * (f) * 2);
		int r = (int) (ColorUtils.MAX_RGB * ((1.0f - f) * 2));
		if (r > ColorUtils.MAX_RGB) {
			r = ColorUtils.MAX_RGB;
		}
		if (g > ColorUtils.MAX_GREEN) {
			g = ColorUtils.MAX_GREEN;
		}
		String result = "(" + r + "," + g + ",0)"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}
}
