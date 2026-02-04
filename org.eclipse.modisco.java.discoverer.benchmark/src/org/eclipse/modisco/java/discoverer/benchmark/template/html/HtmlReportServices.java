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
package org.eclipse.modisco.java.discoverer.benchmark.template.html;

import java.util.Collection;

import org.eclipse.modisco.infra.discovery.benchmark.Discovery;

/** Java services used from the Acceleo generators */
public final class HtmlReportServices {

	private HtmlReportServices() {
		//
	}

	public static double maxExecutionTime(final Collection<Discovery> discoveries) {
		double maxExecutionTime = 0.0;
		for (Discovery discovery : discoveries) {
			maxExecutionTime = Math.max(discovery.getTotalExecutionTimeInSeconds(),
					maxExecutionTime);
		}
		return maxExecutionTime;
	}

	public static double maxSaveTime(final Collection<Discovery> discoveries) {
		double maxSaveTime = 0.0;
		for (Discovery discovery : discoveries) {
			maxSaveTime = Math.max(discovery.getSaveTimeInSeconds(), maxSaveTime);
		}
		return maxSaveTime;
	}

	public static String lfToBr(final String str) {
		return str.replaceAll("\\n", "<br/>"); //$NON-NLS-1$//$NON-NLS-2$
	}

	public static String sizeWithUnit(final Double value) {
		final double unitChange = 1024.0;

		double result = value;
		int unit = 0;
		while (result > unitChange) {
			result /= unitChange;
			unit++;
		}

		if (unit > 0) {
			return String.format("%.1f", result) + " " + unitName(unit); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return (int) result + " " + unitName(unit); //$NON-NLS-1$
	}

	// these constants are only here to make checkstyle happy
	private static final int UNIT_0 = 0;
	private static final int UNIT_1 = 1;
	private static final int UNIT_2 = 2;
	private static final int UNIT_3 = 3;
	private static final int UNIT_4 = 4;
	private static final int UNIT_5 = 5;

	private static String unitName(final int unit) {
		// TODO: externalize strings
		switch (unit) {
		case HtmlReportServices.UNIT_0:
			return "bytes"; //$NON-NLS-1$
		case HtmlReportServices.UNIT_1:
			return "KiB"; //$NON-NLS-1$
		case HtmlReportServices.UNIT_2:
			return "MiB"; //$NON-NLS-1$
		case HtmlReportServices.UNIT_3:
			return "GiB"; //$NON-NLS-1$
		case HtmlReportServices.UNIT_4:
			return "TiB"; //$NON-NLS-1$
		case HtmlReportServices.UNIT_5:
			return "PiB"; //$NON-NLS-1$
		default:
			throw new IllegalArgumentException("" + unit); //$NON-NLS-1$
		}
	}

	private static final double SECONDS_PER_MINUTE = 60.0;

	public static String timeWithUnit(final Double seconds) {
		Double remainder = seconds;
		int minutes = 0;
		while (remainder > HtmlReportServices.SECONDS_PER_MINUTE) {
			remainder -= HtmlReportServices.SECONDS_PER_MINUTE;
			minutes++;
		}

		if (minutes > 0) {
			return minutes + "m " + remainder.intValue() + "s"; //$NON-NLS-1$//$NON-NLS-2$
		}
		return String.format("%.2f", remainder) + "s"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}
