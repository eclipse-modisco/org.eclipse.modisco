/**
 * Copyright (c) 2011, 2019 Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 	Nicolas Guyomar (Mia-Software) - Bug 349546 - EMF Facet facetSet editor
 */
package org.eclipse.modisco.facet.efacet.ui.internal.exported.wizard;

import org.eclipse.emf.ecore.EClassifier;

public interface ISelectETypeWizard {
	public int open();

	public EClassifier getSelectedEType();
}
