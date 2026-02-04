/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.custom.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.modisco.infra.browser.custom.ui.Messages;
import org.eclipse.modisco.infra.browser.custom.ui.controls.QuerySetsSelectionControl;
import org.eclipse.swt.widgets.Composite;

/** A wizard page that allows selecting a list of query sets. */
public class SelectQuerySetsPage extends WizardPage {

	private QuerySetsSelectionControl querySetsSelectionControl;

	public SelectQuerySetsPage() {
		super(Messages.SelectQuerySetsPage_selectAvailableQuerySets);
		setTitle(Messages.SelectQuerySetsPage_selectAvailableQuerySets);
		setDescription(Messages.SelectQuerySetsPage_selectAvailableQuerySetsInCustomization);
	}

	public void createControl(final Composite parent) {
		this.querySetsSelectionControl = new QuerySetsSelectionControl(parent);
		// can finish the wizard even if this page is not seen
		setPageComplete(true);
		setControl(this.querySetsSelectionControl);
	}

	public QuerySetsSelectionControl getQuerySetsSelectionControl() {
		return this.querySetsSelectionControl;
	}
}
