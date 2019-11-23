/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.core;

import org.eclipse.modisco.infra.facet.Facet;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public interface FacetContextListener {
	void facetAdded(Facet facet);

	void facetsCleared();
}
