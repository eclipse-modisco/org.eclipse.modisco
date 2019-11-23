/*******************************************************************************
 * Copyright (c) 2011, 2016 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	   Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 *     Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 *     Grégoire Dupé (Mia-Software) - Bug 361612 - [Restructuring] New core for new version of the Facet metamodel
 *     Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *     Jonathan Pepin (Soft-Maint) - Bug 463898 - Create FacetReference not derived, without query and with opposite mechanism
 *     Jonathan Pepin (Soft-Maint) - Bug 510034 - Null value is wrongly casted in a new list
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.core.internal;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.facet.efacet.core.internal.exception.UnmatchingExpectedTypeException;

public final class CastUtils {

	private CastUtils() {
		//Must no be used.
	}

	public static <T> List<T> castToExpectedListType(final Object object,
			final Class<T> expectedType, final boolean canContainsNull)
			throws UnmatchingExpectedTypeException {
		List<T> result = null;
		if (object != null) {
			if (!(object instanceof List)) {
				throw new UnmatchingExpectedTypeException(
						"The parameter 'object' is not a List"); //$NON-NLS-1$
			}
			final List<?> list = (List<?>) object;
			result = castToExpectedListType(list, expectedType, canContainsNull);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	/*
	 * @SuppressWarnings("unchecked") jpepin> The cast checked is done by the
	 * method 'checkTypeOfAllListElements'
	 */
	public static <T> List<T> castToExpectedListType(final List<?> list,
			final Class<T> expectedType, final boolean canContainsNull)
			throws UnmatchingExpectedTypeException {
		checkTypeOfAllListElements(list, expectedType, canContainsNull);
		return (List<T>) list;
	}

	@SuppressWarnings("unchecked")
	//@SuppressWarnings("unchecked") This method is used to isolate unsafe cast.
	public static <T> T castToExpectedType(final Object value, final Class<T> expectedType)
			throws UnmatchingExpectedTypeException {
		try {
			return (T) value;
		} catch (ClassCastException e) {
			throw new UnmatchingExpectedTypeException("Type mismatch. Expected: " + //$NON-NLS-1$
					expectedType.getClass().getName() + ", got " + value.getClass().getName(), e); //$NON-NLS-1$);
		}
	}

	public static void checkTypeOfAllListElements(final List<?> list,
			final Class<?> expectedType, final boolean canContainsNull)
			throws UnmatchingExpectedTypeException {
		if (expectedType == null) {
			// null means match everything
			return;
		}
		final Iterator<?> iterator = list.iterator();
		int index = -1;
		while (iterator.hasNext()) {
			final Object object = iterator.next();
			index++;
			if (!canContainsNull && object == null) {
				throw new UnmatchingExpectedTypeException(
						"The 'no null' constraint is violated at index " //$NON-NLS-1$
								+ index, expectedType, object);
			}
			if (object != null && !expectedType.isInstance(object)) {
				throw new UnmatchingExpectedTypeException("Type mismatch at index " + index, expectedType, object); //$NON-NLS-1$
			}
		}
	}

}
