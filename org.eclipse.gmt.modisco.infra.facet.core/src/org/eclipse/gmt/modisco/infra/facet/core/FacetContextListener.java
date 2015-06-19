/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.facet.core;

import org.eclipse.gmt.modisco.infra.facet.Facet;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public interface FacetContextListener {
	void facetAdded(Facet facet);

	void facetsCleared();
}
