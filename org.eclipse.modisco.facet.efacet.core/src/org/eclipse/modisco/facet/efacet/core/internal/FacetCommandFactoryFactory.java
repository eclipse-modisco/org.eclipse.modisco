/**
 * Copyright (c) 2012 Mia-Software.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.efacet.core.internal;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.efacet.core.IFacetCommandFactory;
import org.eclipse.modisco.facet.efacet.core.IFacetCommandFactoryFactory;

public class FacetCommandFactoryFactory implements IFacetCommandFactoryFactory {

	public IFacetCommandFactory createCommandFactory(
			final EditingDomain editingDomain) {
		return new FacetCommandFactoryImpl(editingDomain);
	}

}
