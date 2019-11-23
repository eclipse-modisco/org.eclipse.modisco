/*******************************************************************************
 * Copyright (c) 2015 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Thomas Cicognani (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets
 *     Grégoire Dupé (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets 
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui;

import java.util.List;
import java.util.Set;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

/**
 * @since 1.1
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public final class FacetSetShortcutActionUtils {

	private FacetSetShortcutActionUtils() {
		// NOT TO BE USED
	}

	public static void setImageDescriptor(final Action action,
			final ImageDescriptor imageDescriptor) {
		if (imageDescriptor != null) {
			action.setImageDescriptor(imageDescriptor);
		}
	}

	public static <T extends FacetSet> void runAction(final Action action,
			final String actionId, final Set<T> availableFS,
			final List<T> activatedFS) {
		for (T facetSet : availableFS) {
			final String facetSetName = facetSet.getName();
			if (facetSetName.equals(actionId)) {
				setActivatedFacetSets(action, facetSet, activatedFS);
				break;
			}
		}
	}

	private static <T extends FacetSet> void setActivatedFacetSets(
			final Action action, final T facetSet, final List<T> activatedFS) {
		/*
		 * The condition is inverted because the toggle state changes before
		 * launching the run method
		 */
		if (action.isChecked()) {
			activatedFS.add(0, facetSet);
		} else {
			activatedFS.remove(facetSet);
		}
	}

}
