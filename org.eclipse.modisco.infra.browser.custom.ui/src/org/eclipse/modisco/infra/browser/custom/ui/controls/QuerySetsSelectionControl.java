/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.custom.ui.controls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.browser.custom.ui.Messages;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * A control to select which query sets must be imported.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class QuerySetsSelectionControl extends Composite {

	private static final String COMBO_ALL = Messages.QuerySetsSelectionControl_allExistingQuerySets;
	private static final String COMBO_SELECTED = Messages.QuerySetsSelectionControl_querySetsSelectedBelowOnly;
	private static final int COMBO_ALL_INDEX = 0;
	private static final int COMBO_SELECTED_INDEX = 1;

	private final Combo comboQuerySets;
	private final CheckboxTableViewer importsList;
	private final Button buttonSelectAll;
	private final Button buttonDeselectAll;

	/** Create the control */
	public QuerySetsSelectionControl(final Composite parent) {
		super(parent, SWT.NONE);
		setLayout(new GridLayout());

		final Composite comboComposite = new Composite(this, SWT.NONE);
		comboComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		comboComposite.setLayout(new GridLayout(2, false));
		final Label label = new Label(comboComposite, SWT.NONE);
		label.setText(Messages.QuerySetsSelectionControl_availableQuerySets);

		this.comboQuerySets = new Combo(comboComposite, SWT.DROP_DOWN | SWT.READ_ONLY);
		this.comboQuerySets.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		this.comboQuerySets.add(QuerySetsSelectionControl.COMBO_ALL);
		this.comboQuerySets.add(QuerySetsSelectionControl.COMBO_SELECTED);

		setAllQuerySetsAvailable(true);

		this.importsList = CheckboxTableViewer.newCheckList(this, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.MULTI);
		this.importsList.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final Composite buttonsComposite = new Composite(this, SWT.NONE);
		buttonsComposite.setLayout(new GridLayout(2, false));
		buttonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		this.buttonSelectAll = new Button(buttonsComposite, SWT.PUSH);
		this.buttonSelectAll.setText(Messages.QuerySetsSelectionControl_selectAll);
		this.buttonDeselectAll = new Button(buttonsComposite, SWT.PUSH);
		this.buttonDeselectAll.setText(Messages.QuerySetsSelectionControl_deselectAll);

		this.comboQuerySets.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				updateQuerySetsControlsEnablement();
			}
		});

		this.buttonSelectAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				QuerySetsSelectionControl.this.importsList.setAllChecked(true);
			}
		});

		this.buttonDeselectAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				QuerySetsSelectionControl.this.importsList.setAllChecked(false);
			}
		});

		final List<String> querySets = loadQuerySets();
		Collections.sort(querySets);

		this.importsList.setContentProvider(new IStructuredContentProvider() {

			public Object[] getElements(final Object inputElement) {
				@SuppressWarnings("unchecked")
				final List<String> serviceSets = (List<String>) inputElement;
				return serviceSets.toArray();
			}

			public void dispose() {
				// nothing
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// nothing
			}
		});

		this.importsList.setInput(querySets);

		updateQuerySetsControlsEnablement();
	}

	private List<String> loadQuerySets() {
		final List<String> querySets = new ArrayList<String>();
		final Collection<ModelQuerySet> allModelQuerySet = ModelQuerySetCatalog.getSingleton()
				.getAllModelQuerySets();
		for (final ModelQuerySet modelQuerySet : allModelQuerySet) {
			if (modelQuerySet != null) {
				querySets.add(modelQuerySet.getName());
			}
		}
		return querySets;
	}

	private void updateQuerySetsControlsEnablement() {
		final boolean enabled = this.comboQuerySets.getSelectionIndex() == QuerySetsSelectionControl.COMBO_SELECTED_INDEX;
		this.importsList.getControl().setEnabled(enabled);
		this.buttonSelectAll.setEnabled(enabled);
		this.buttonDeselectAll.setEnabled(enabled);

	}

	public void setAllQuerySetsAvailable(final boolean value) {
		if (value) {
			this.comboQuerySets.select(QuerySetsSelectionControl.COMBO_ALL_INDEX);
		} else {
			this.comboQuerySets.select(QuerySetsSelectionControl.COMBO_SELECTED_INDEX);
		}
	}

	public boolean getAllQuerySetsAvailable() {
		return (this.comboQuerySets.getSelectionIndex() == QuerySetsSelectionControl.COMBO_ALL_INDEX);
	}

	public void setSelectedQuerySets(final List<String> querySets) {
		this.importsList.setCheckedElements(querySets.toArray());
	}

	public String[] getSelectedQuerySets() {
		final Object[] checkedElements = this.importsList.getCheckedElements();
		final List<String> importedQuerySetsList = new ArrayList<String>();
		for (final Object object : checkedElements) {
			importedQuerySetsList.add(object.toString());
		}
		return importedQuerySetsList.toArray(new String[importedQuerySetsList.size()]);
	}

}
