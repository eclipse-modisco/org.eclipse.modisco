/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.modisco.infra.common.ui.internal.dialogs.MetaclassSelectionDialog;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.ui.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredList;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
@SuppressWarnings("synthetic-access")
public class CreateQueryWizardPage extends WizardPage {

	private final ModelQuerySet initialModelQuerySet;
	private final EClass initialScope;
	private ModelQuerySet querySet;
	private List<EClass> scope;
	private EClassifier returnType;
	private Text scopeText;
	private Text returnTypeText;
	private FilteredList querySetFilteredList;
	private Combo comboType;
	private Text queryNameText;
	private Text queryDescriptionText;
	private Button cbMultivalued;

	protected CreateQueryWizardPage(final ModelQuerySet initialModelQuerySet,
			final EClass initialScope) {
		super(CreateQueryWizardPage.class.getSimpleName());
		this.initialModelQuerySet = initialModelQuerySet;
		this.initialScope = initialScope;
		setTitle(Messages.CreateQueryWizardPage_createNewModelQuery);
	}

	public void createControl(final Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout mainLayout = new GridLayout(1, false);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		composite.setLayout(mainLayout);

		createQuerySetFilteredList(composite);

		Composite fieldsComposite = new Composite(composite, SWT.NONE);
		fieldsComposite.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		final int nColumns = 3;
		fieldsComposite.setLayout(new GridLayout(nColumns, false));

		createTypeField(fieldsComposite);
		createNameField(fieldsComposite);
		createDescriptionField(fieldsComposite);
		createScopeField(fieldsComposite);
		createReturnTypeField(fieldsComposite);

		if (this.initialScope != null) {
			setScope(Collections.singletonList(this.initialScope));
		}

		setControl(composite);
	}

	private void createTypeField(final Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.CreateQueryWizardPage_queryType);
		this.comboType = new Combo(parent, SWT.READ_ONLY);
		// TODO: use extension point
		this.comboType.add("Java"); //$NON-NLS-1$
		//this.comboType.add("OCL"); //$NON-NLS-1$
		this.comboType.select(0);
		// this.comboType.setEnabled(false);
		GridData comboData = new GridData(SWT.FILL, SWT.NONE, true, false);
		comboData.horizontalSpan = 2;
		this.comboType.setLayoutData(comboData);
	}

	private void createNameField(final Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.CreateQueryWizardPage_queryName);
		this.queryNameText = new Text(parent, SWT.BORDER);
		GridData textData = new GridData(SWT.FILL, SWT.NONE, true, false);
		textData.horizontalSpan = 2;
		this.queryNameText.setLayoutData(textData);
		this.queryNameText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				updateButtons();
			}
		});
	}

	protected void updateButtons() {
		final IWizardContainer container = getContainer();
		if (container != null && container.getCurrentPage() != null) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					// the state of the 1st page depends on the 2nd
					container.updateButtons();
					container.updateButtons();
				}
			});
		}
	}

	private void createDescriptionField(final Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.CreateQueryWizardPage_description);
		this.queryDescriptionText = new Text(parent, SWT.BORDER);
		GridData textData = new GridData(SWT.FILL, SWT.NONE, true, false);
		textData.horizontalSpan = 2;
		this.queryDescriptionText.setLayoutData(textData);
	}

	private void createScopeField(final Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.CreateQueryWizardPage_scope);
		this.scopeText = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		this.scopeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		Button browseButton = new Button(parent, SWT.PUSH);
		browseButton.setText(Messages.CreateQueryWizardPage_browseBtn);
		browseButton.setLayoutData(new GridData(SWT.NONE, SWT.CENTER, false, false));
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				browseScope();
			}
		});
	}

	private void browseScope() {
		MetaclassSelectionDialog metaclassSelectionDialog = new MetaclassSelectionDialog(
				getShell(), true, true);
		if (metaclassSelectionDialog.open() == Window.OK) {
			setScope(metaclassSelectionDialog.getSelectedMetaclasses());
		}
	}

	private void setScope(final List<EClass> eClasses) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < eClasses.size(); i++) {
			EClass eClass = eClasses.get(i);
			builder.append(eClass.getEPackage().getName() + "::" + eClass.getName()); //$NON-NLS-1$
			if (i != eClasses.size() - 1) {
				builder.append(", "); //$NON-NLS-1$
			}
		}
		this.scopeText.setText(builder.toString());
		this.scope = eClasses;
		updateButtons();
	}

	private void createReturnTypeField(final Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(Messages.CreateQueryWizardPage_returnType);
		this.returnTypeText = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		this.returnTypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		Button browseButton = new Button(parent, SWT.PUSH);
		browseButton.setText(Messages.CreateQueryWizardPage_browseBtn);
		browseButton.setLayoutData(new GridData(SWT.NONE, SWT.CENTER, false, false));
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				browseReturnType();
			}
		});
		spacer(parent);
		this.cbMultivalued = new Button(parent, SWT.CHECK);
		this.cbMultivalued.setText(Messages.CreateQueryWizardPage_multiValuedReturnType);
		GridData gridData = new GridData(SWT.NONE, SWT.CENTER, false, false);
		gridData.horizontalSpan = 2;
		this.cbMultivalued.setLayoutData(gridData);
	}

	private void browseReturnType() {
		MetaclassSelectionDialog metaclassSelectionDialog = new MetaclassSelectionDialog(
				getShell(), false, false);
		if (metaclassSelectionDialog.open() == Window.OK) {
			List<EClassifier> selectedMetaclasses = metaclassSelectionDialog
					.getSelectedClassifiers();
			if (selectedMetaclasses.size() > 0) {
				setReturnType(selectedMetaclasses.get(0));
			}
		}
	}

	private void setReturnType(final EClassifier eClassifier) {
		this.returnTypeText.setText(eClassifier.getEPackage().getName() + "::" //$NON-NLS-1$
				+ eClassifier.getName());
		this.returnType = eClassifier;
		updateButtons();
	}

	@SuppressWarnings("unused")
	private void spacer(final Composite parent) {
		new Label(parent, SWT.NONE);
	}

	private void createQuerySetFilteredList(final Composite parent) {
		Group querySetGroup = new Group(parent, SWT.NONE);
		querySetGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		querySetGroup.setLayout(new GridLayout());
		querySetGroup.setText(Messages.CreateQueryWizardPage_parentQuerySet);

		LabelProvider labelProvider = new LabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof ModelQuerySet) {
					ModelQuerySet modelQuerySet = (ModelQuerySet) element;
					return modelQuerySet.getName();
				}
				return super.getText(element);
			}

			@Override
			public Image getImage(final Object element) {
				return ImageUtils.getImage(element);
			}
		};
		this.querySetFilteredList = new FilteredList(querySetGroup, SWT.BORDER, labelProvider,
				false, false, true);
		this.querySetFilteredList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		Collection<ModelQuerySet> allModelQuerySets = ModelQuerySetCatalog.getSingleton()
				.getAllModelQuerySets();
		List<ModelQuerySet> editableQuerySets = new ArrayList<ModelQuerySet>();
		for (ModelQuerySet modelQuerySet : allModelQuerySets) {
			// FIXME: modelQuerySet.isIsEditable() doesn't work
			URI uri = ModelQuerySetCatalog.getSingleton().getURI(modelQuerySet.getName());
			if (uri.isPlatformResource()) {
				editableQuerySets.add(modelQuerySet);
			}
		}
		ModelQuerySet[] elements = editableQuerySets.toArray(new ModelQuerySet[editableQuerySets
				.size()]);
		this.querySetFilteredList.setElements(elements);
		// by name, because not the same object between the catalog and the
		// query editor's model
		if (this.initialModelQuerySet != null) {
			for (ModelQuerySet modelQuerySet : elements) {
				if (modelQuerySet.getName().equals(this.initialModelQuerySet.getName())) {
					this.querySetFilteredList.setSelection(new Object[] { modelQuerySet });
				}
			}
		}

		this.querySetFilteredList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				querySetChanged();
			}
		});
	}

	private void querySetChanged() {
		Object[] selection = this.querySetFilteredList.getSelection();
		if (selection.length == 1) {
			this.querySet = (ModelQuerySet) selection[0];
		} else {
			this.querySet = null;
		}
		updateButtons();
	}

	public ModelQuerySet getQuerySet() {
		return this.querySet;
	}

	public List<EClass> getScope() {
		if (this.scope != null) {
			return Collections.unmodifiableList(this.scope);
		}
		return Collections.emptyList();
	}

	public EClassifier getReturnType() {
		return this.returnType;
	}

	public String getQueryName() {
		return this.queryNameText.getText().trim();
	}

	public String getQueryDescription() {
		return this.queryDescriptionText.getText();
	}

	public boolean isReturnTypeMultiValued() {
		return this.cbMultivalued.getSelection();
	}

	@Override
	public boolean isPageComplete() {
		return this.querySet != null && this.scope != null && this.returnType != null
				&& this.queryNameText.getText().trim().length() > 0;
	}
}
