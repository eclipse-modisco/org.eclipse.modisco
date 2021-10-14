/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.ui.wizards;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.modisco.infra.browser.custom.ui.Messages;
import org.eclipse.modisco.infra.common.ui.internal.controls.MetamodelSelectionControl;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredList;

/** A wizard page that allows selecting a metamodel. */
public class SelectMetamodelsPage extends WizardPage {

	private MetamodelSelectionControl metamodelSelectionControl;

	public SelectMetamodelsPage() {
		super(Messages.SelectMetamodelsPage_selectMetamodel);
		setTitle(Messages.SelectMetamodelsPage_selectMetamodel);
		setDescription(Messages.SelectMetamodelsPage_selectMetamodelToCustomize);
	}

	@Override
	public void setVisible(final boolean visible) {
		super.setVisible(visible);
		if (visible) {
			this.metamodelSelectionControl.getFilterText().setFocus();
			// otherwise first element is selected
			this.metamodelSelectionControl.getFilteredList().setSelection(new int[0]);
			setPageComplete(false);
		}
	}

	public void createControl(final Composite parent) {
		this.metamodelSelectionControl = new MetamodelSelectionControl(parent);
		final FilteredList filteredList = this.metamodelSelectionControl.getFilteredList();

		filteredList.addSelectionListener(new SelectionListener() {
			public void widgetSelected(final SelectionEvent e) {
				if (e.item != null) {
					setPageComplete(filteredList.getSelection().length == 1);
				}
			}

			public void widgetDefaultSelected(final SelectionEvent e) {
				getWizard().performFinish();
				IWizardContainer container = getContainer();
				if (container instanceof Window) {
					Window window = (Window) container;
					window.close();
				}
			}
		});

		// avoid the page being "complete" when still on a previous page
		filteredList.setSelection(new int[0]);
		setPageComplete(false);

		setControl(this.metamodelSelectionControl);
	}

	public String getSelectedMetamodel() {
		return (String) this.metamodelSelectionControl.getFirstSelectedElement();
	}
}
