/*******************************************************************************
 * Copyright (c) 2010, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 339930 - Anticipate UI freeze : MoDisco project & externalize Strings
 *     Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *     Fabien Giquel (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/
package org.eclipse.modisco.util.emf.core.internal.allinstances;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/** Handles a cache for instances by metaclass */
public interface MetaclassInstances {
	/**
	 * Return the list of instances for the given metaclass
	 *
	 * @param eClass
	 *            the metaclass
	 * @param includingSubclasses
	 *            whether to include instances of subclasses too
	 * @return instances of the given metaclass, or an empty set if none
	 */
	Collection<EObject> getInstances(EClass eClass, boolean includingSubclasses);

	/** Clears the cache. Cache will be computed again at next access */
	void clearCache();

	/** Add a listener to be notified when the model changes */
	void addListener(ModelChangeListener listener);

	/** Remove a previously set listener */
	void removeListener(ModelChangeListener listener);

}
