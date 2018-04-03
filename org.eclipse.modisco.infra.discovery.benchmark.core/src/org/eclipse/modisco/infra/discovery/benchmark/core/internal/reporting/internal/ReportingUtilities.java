/*******************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software and INRIA.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Guillaume Doux (INRIA) - Moving to the org.eclipse.modisco.infra.discovery.benchmark.core plug-in
 *     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;

/** Java services used from the Acceleo generators */
public final class ReportingUtilities {

	private ReportingUtilities() { }

	public static double maxExecutionTime(final Collection<DiscoveryIteration> iterations) {
		double maxExecutionTime = 0.0;
		for (DiscoveryIteration iteration : iterations) {
			maxExecutionTime = Math.max(iteration.getDiscoveryTimeInSeconds(),
					maxExecutionTime);
		}
		return maxExecutionTime;
	}

	public static double maxSaveTime(final Collection<DiscoveryIteration> iterations) {
		double maxSaveTime = 0.0;
		for (DiscoveryIteration iteration : iterations) {
			maxSaveTime = Math.max(iteration.getSaveTimeInSeconds(), maxSaveTime);
		}
		return maxSaveTime;
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
		case ReportingUtilities.UNIT_0:
			return "bytes"; //$NON-NLS-1$
		case ReportingUtilities.UNIT_1:
			return "KiB"; //$NON-NLS-1$
		case ReportingUtilities.UNIT_2:
			return "MiB"; //$NON-NLS-1$
		case ReportingUtilities.UNIT_3:
			return "GiB"; //$NON-NLS-1$
		case ReportingUtilities.UNIT_4:
			return "TiB"; //$NON-NLS-1$
		case ReportingUtilities.UNIT_5:
			return "PiB"; //$NON-NLS-1$
		default:
			throw new IllegalArgumentException("" + unit); //$NON-NLS-1$
		}
	}

	private static final double SECONDS_PER_MINUTE = 60.0;

	public static String timeWithUnit(final Double seconds) {
		Double remainder = seconds;
		int minutes = 0;
		while (remainder > ReportingUtilities.SECONDS_PER_MINUTE) {
			remainder -= ReportingUtilities.SECONDS_PER_MINUTE;
			minutes++;
		}

		if (minutes > 0) {
			return minutes + "m " + remainder.intValue() + "s"; //$NON-NLS-1$//$NON-NLS-2$
		}
		return String.format("%.2f", remainder) + "s"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	public static int indexOf(final List<Object> list, final Object object) {
		return list.indexOf(object);
	}
}
