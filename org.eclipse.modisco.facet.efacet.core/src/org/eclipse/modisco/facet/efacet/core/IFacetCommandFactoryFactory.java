/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.efacet.core;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.efacet.core.internal.FacetCommandFactoryFactory;

/**
 * @since 0.3
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IFacetCommandFactoryFactory {
	
	IFacetCommandFactoryFactory DEFAULT = new FacetCommandFactoryFactory();
	
	IFacetCommandFactory createCommandFactory(EditingDomain editingDomain);
}
