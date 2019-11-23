/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.extensions;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface IQueryAttributesWizardPage extends IWizardPage {

	/**
	 * Initialize the wizard page
	 *
	 * @param modelQuerySet
	 *            an existing query set, in which the query will be added
	 * @param modelQuery
	 *            the query that will be added to the query set when the wizard
	 *            finishes
	 */
	void init(ModelQuerySet modelQuerySet, ModelQuery modelQuery);

	/**
	 * Called when the wizard is finished to apply the attributes defined in the
	 * wizard page to the model query.
	 *
	 * @param modelQuery
	 *            the query to which to apply the wizard page's attributes
	 */
	void apply(ModelQuery modelQuery);
}
