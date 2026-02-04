/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.editor.dialogs;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.modisco.infra.browser.custom.ui.controls.QuerySetsSelectionControl;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.ui.internal.controls.MetamodelSelectionControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

/**
 * A dialog to change the customized metamodel and imported query sets in a
 * customization.
 */
public class CustomizationPropertiesDialog extends Dialog {

	private static final int METAMODEL_GROUP_WIDTH = 400;
	private static final int METAMODEL_GROUP_HEIGHT = 400;
	private static final int IMPORTS_GROUP_WIDTH = 400;
	private static final int IMPORTS_GROUP_HEIGHT = 500;

	private String initialMetamodel;
	private boolean initialAllQuerySetsAvailable = true;
	private List<String> initialQuerySets;

	private MetamodelSelectionControl metamodelSelectionControl;

	private String fMetamodel;
	private boolean allQuerySetsAvailable;
	private String[] selectedQuerySets;
	private QuerySetsSelectionControl querySetsSelectionControl;
	private final boolean readOnly;

	public CustomizationPropertiesDialog(final Shell parentShell, final boolean readOnly) {
		super(parentShell);
		this.readOnly = readOnly;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		contents.setLayout(new GridLayout(2, true));

		final Composite leftPane = new Composite(contents, SWT.NONE);
		leftPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		leftPane.setLayout(new GridLayout());

		createMetamodelPane(leftPane);

		final Composite rightPane = new Composite(contents, SWT.NONE);
		rightPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		rightPane.setLayout(new GridLayout());
		createImportedQuerySetsPane(rightPane);

		return contents;
	}

	private void createMetamodelPane(final Composite contents) {
		final Group metamodelGroup = new Group(contents, SWT.NONE);
		metamodelGroup.setLayout(new GridLayout());
		metamodelGroup.setText(Messages.CustomizationPropertiesDialog_metamodel);
		final GridData metamodelGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		metamodelGroupData.widthHint = CustomizationPropertiesDialog.METAMODEL_GROUP_WIDTH;
		metamodelGroupData.heightHint = CustomizationPropertiesDialog.METAMODEL_GROUP_HEIGHT;
		metamodelGroup.setLayoutData(metamodelGroupData);

		this.metamodelSelectionControl = new MetamodelSelectionControl(metamodelGroup);
		this.metamodelSelectionControl.setEnabled(!this.readOnly);
		this.metamodelSelectionControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		if (this.initialMetamodel != null) {
			this.metamodelSelectionControl.getFilteredList().setSelection(
					new String[] { this.initialMetamodel });
		}
	}

	private void createImportedQuerySetsPane(final Composite contents) {
		final Group importsGroup = new Group(contents, SWT.NONE);
		importsGroup.setLayout(new GridLayout());
		importsGroup.setText(Messages.CustomizationPropertiesDialog_querySets);
		final GridData importsGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		importsGroupData.widthHint = CustomizationPropertiesDialog.IMPORTS_GROUP_WIDTH;
		importsGroupData.heightHint = CustomizationPropertiesDialog.IMPORTS_GROUP_HEIGHT;
		importsGroup.setLayoutData(importsGroupData);

		this.querySetsSelectionControl = new QuerySetsSelectionControl(importsGroup);
		this.querySetsSelectionControl.setEnabled(!this.readOnly);
		this.querySetsSelectionControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		this.querySetsSelectionControl.setAllQuerySetsAvailable(this.initialAllQuerySetsAvailable);

		if (this.initialQuerySets != null) {
			this.querySetsSelectionControl.setSelectedQuerySets(this.initialQuerySets);
		}
	}

	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(Messages.CustomizationPropertiesDialog_customizationProperties);
		newShell.setImage(ImageProvider.getInstance().getMoDiscoIcon());
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		if (!this.readOnly) {
			if (this.metamodelSelectionControl.getFirstSelectedElement() == null) {
				MessageDialog.openWarning(getShell(),
						Messages.CustomizationPropertiesDialog_noMetamodelSelected,
						Messages.CustomizationPropertiesDialog_metamodelMustBeSelected);
				return;
			}
			this.fMetamodel = (String) this.metamodelSelectionControl.getFirstSelectedElement();
			this.allQuerySetsAvailable = this.querySetsSelectionControl.getAllQuerySetsAvailable();
			this.selectedQuerySets = this.querySetsSelectionControl.getSelectedQuerySets();
		}
		super.okPressed();
	}

	public void setInitialMetamodel(final String metamodel) {
		this.initialMetamodel = metamodel;
	}

	public void setInitialQuerySets(final List<String> querySets) {
		this.initialQuerySets = querySets;
	}

	public String getMetamodel() {
		return this.fMetamodel;
	}

	public String[] getSelectedQuerySets() {
		return this.selectedQuerySets;
	}

	public boolean isAllQuerySetsAvailable() {
		return this.allQuerySetsAvailable;
	}

	public void setInitialImportAllQuerySets(final boolean importAllQuerySets) {
		this.initialAllQuerySetsAvailable = importAllQuerySets;
	}
}
