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
package org.eclipse.modisco.infra.facet.core.extensions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.facet.Facet;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public interface RefreshStrategy {
	/**
	 * This method must compute and return the list of elements for which a
	 * Facet may have changed. Since this method will be called for each change
	 * in the model, it should be optimized to do the minimum amount of
	 * computation possible while still returning an accurate result.
	 *
	 * @param eObject
	 *            an EObject that changed
	 * @param msg
	 *            the associated change notification
	 * @return the list of impacted EObjects
	 */
	Collection<EObject> findElementsImpactedFromChange(EObject eObject, Notification msg);

	/**
	 * Whether the RefreshStrategy will be called when the given Facet is
	 * applied.
	 */
	boolean isApplicableTo(Facet facet);
}
