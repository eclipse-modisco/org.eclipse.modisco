/*******************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 483639 - [Benchmark] Incorrect standard derivation computation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal;

import java.util.List;

public final class MathUtils {

	private MathUtils() {
		// Must not be used
	}

	public static <T> double average(final List<T> objects,
			final Resolver<T> resolver) {
		long sum = 0;
		for (int i = 0; i < objects.size(); i++) {
			sum += resolver.getValue(objects.get(i));
		}
		return sum / objects.size();
	}

	public static <T> double standardDeviation(final List<T> objects,
			final Resolver<T> resolver) {
		final double avg = average(objects, resolver);
		double sum = 0;
		for (int i = 0; i < objects.size(); i++) {
			final double value = resolver.getValue(objects.get(i));
			final double delta = Math.abs(value - avg);
			sum += delta *  delta;
		}
		return Math.sqrt(sum / objects.size());
	}

	public interface Resolver<T> {
		double getValue(T object);
	}
}