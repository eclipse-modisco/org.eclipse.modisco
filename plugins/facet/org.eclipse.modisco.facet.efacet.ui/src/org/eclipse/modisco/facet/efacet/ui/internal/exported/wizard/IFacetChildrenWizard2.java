/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 	Nicolas Guyomar (Mia-Software) - Bug 349546 - EMF Facet facetSet editor
 *  Gregoire Dupe (Mia-Software) - Bug 361617 - Deprecation of APIs for the old Facet metamodels
 */
package org.eclipse.modisco.facet.efacet.ui.internal.exported.wizard;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.Facet;

/**
 * 
 * @since 0.2
 */
//TODO This interface has to be renamed to ICreateFacetInFacetSetWizard before the release of 0.2
public interface IFacetChildrenWizard2 {

	public int open();

	public void setFacet(Facet facet);

	public void setChildrenName(String name);

	public void setUpperBound(int upperBound);

	public void setLowerBound(int lowerBound);

	public void setType(EClass type);

	public void canChangeFacet(boolean canChange);

	public void canChangeChildrenName(boolean canChange);

	public void canChangeUpperBound(boolean canChange);

	public void canChangeLowerBound(boolean canChange);

	public void canChangeType(boolean canChange);

}
