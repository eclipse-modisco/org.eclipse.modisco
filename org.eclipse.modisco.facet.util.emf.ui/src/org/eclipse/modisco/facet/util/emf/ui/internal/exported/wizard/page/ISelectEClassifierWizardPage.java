/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.util.emf.ui.internal.exported.wizard.page;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.modisco.facet.util.emf.ui.internal.exported.util.wizard.page.SelectEClassifierWizardPage;

/**
 * Interface for {@link SelectEClassifierWizardPage}.
 * 
 * @see SelectEClassifierWizardPage
 * @since 0.3
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ISelectEClassifierWizardPage<T extends EClassifier> extends
		IWizardPage {

	/**
	 * @return the selected {@link EClassifier}.
	 */
	T getSelectedEClassifier();

	/**
	 * Set the {@link EClassifier}.
	 * 
	 * @param selection
	 *            the name of the {@link EClassifier} to select.
	 */
	void selectEClassifier(final String selection);

}