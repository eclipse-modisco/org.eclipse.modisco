/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - Tree icons added
					 - Query and QuerySet class removed
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.editor.dialogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.gmt.modisco.infra.query.ui.controls.QueryFilteredTree;
import org.eclipse.gmt.modisco.infra.query.ui.filters.QueryReturnTypeFilter;
import org.eclipse.gmt.modisco.infra.query.ui.filters.QueryScopeFilter;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredTree;

/**
 * A dialog to set the value of a customized feature. The user can choose
 * between a static and dynamic value:
 * <ul>
 * <li>In the case of a static value, the value is given directly by the user.
 * <li>For a dynamic value, the user must choose a query that will return the
 * value.
 * </ul>
 */
public abstract class EditFeatureValueDialog extends Dialog {

	private static final int QUERIES_TREE_WIDTH = 250;
	private static final int QUERIES_TREE_HEIGHT = 300;

	/** Whether the dialog has a section for selecting a condition query */
	private final boolean withCondition;
	/** Whether there is a "default" choice (to reset a feature value) */
	private final boolean withDefault;

	private Button rbStatic;
	private Button rbQuery;
	private Button rbDefault;
	private TreeViewer conditionQueryViewer;
	private TreeViewer fQueryViewer;

	public enum ValueType {
		STATIC, DERIVED, DEFAULT
	}

	private ValueType selectedValueType;

	/** The static value, which must be set in derived classes */
	private String staticValue;

	/** The initial static value, which is used in derived classes */
	private String initialStaticValue;
	private String fInitialQuerySetName;
	private String fInitialQueryName;
	private String initialConditionQuerySetName;
	private String initialConditionQueryName;

	/** The selected query set name, if the type is set to "computed" */
	private String selectedQuerySetName;
	/** The selected query name, if the type is set to "computed" */
	private String selectedQueryName;

	/** The selected condition query set name, if withCondition is true */
	private String selectedConditionQuerySetName;
	/** The selected condition query name, if withCondition is true */
	private String selectedConditionQueryName;
	private final List<String> availableQuerySets;
	private final List<Class<?>> fExpectedReturnTypes;
	private final EClass fExpectedScope;

	/**
	 * @param parentShell
	 *            the parent shell
	 * @param withCondition
	 *            whether the dialog has a section for selecting a condition
	 *            query
	 * @param withDefault
	 *            whether there is a "default" choice (to reset a feature value)
	 * @param availableQuerySets
	 *            list of query sets that are visible in the dialog (
	 *            <code>null</code> for all)
	 * @param expectedReturnTypes
	 *            the list of return types that should be accepted
	 * @param customizedMetaclass
	 */
	protected EditFeatureValueDialog(final Shell parentShell, final boolean withCondition,
			final boolean withDefault, final List<String> availableQuerySets,
			final List<Class<?>> expectedReturnTypes, final EClass customizedMetaclass) {
		super(parentShell);
		this.withCondition = withCondition;
		this.withDefault = withDefault;
		this.availableQuerySets = availableQuerySets;
		this.fExpectedReturnTypes = expectedReturnTypes;
		this.fExpectedScope = customizedMetaclass;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Collection<ModelQuerySet> querySets = loadQuerySets();

		// Composite composite = (Composite) super.createDialogArea(parent);

		final Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final int numColumns;
		if (this.withCondition) {
			numColumns = 2;
		} else {
			numColumns = 1;
		}
		contents.setLayout(new GridLayout(numColumns, true));

		// condition query
		if (this.withCondition) {
			createConditionPane(querySets, contents);
		}
		// static value or result query
		final Composite rightPane = new Composite(contents, SWT.NONE);
		rightPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		rightPane.setLayout(new GridLayout());

		final Group featureValueGroup = new Group(rightPane, SWT.NONE);
		featureValueGroup.setLayout(new GridLayout());
		featureValueGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		featureValueGroup.setText(Messages.EditFeatureValueDialog_featureValue);

		final Group typeGroup = new Group(featureValueGroup, SWT.NONE);
		typeGroup.setLayout(new GridLayout());
		typeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		typeGroup.setText(Messages.EditFeatureValueDialog_type);

		if (this.withDefault) {
			this.rbDefault = new Button(typeGroup, SWT.RADIO);
			this.rbDefault.setText(Messages.EditFeatureValueDialog_defaultValue);
		}
		this.rbStatic = new Button(typeGroup, SWT.RADIO);
		this.rbStatic.setText(Messages.EditFeatureValueDialog_staticValue);
		this.rbQuery = new Button(typeGroup, SWT.RADIO);
		this.rbQuery.setText(Messages.EditFeatureValueDialog_queryValue);

		final Composite dynamicZone = new Composite(featureValueGroup, SWT.NONE);
		dynamicZone.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		final StackLayout stackLayout = new StackLayout();
		dynamicZone.setLayout(stackLayout);

		final Composite staticValueComposite = new Composite(dynamicZone, SWT.NONE);
		staticValueComposite.setLayout(new GridLayout());
		// Group valueGroup = new Group(staticValueComposite, SWT.NONE);
		// valueGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// true));
		// valueGroup.setLayout(new GridLayout());
		// valueGroup.setText("Value");
		// Button cbValue = new Button(valueGroup, SWT.CHECK);
		// cbValue.setText("Is Italic");
		createValueEditor(staticValueComposite);

		final Composite dynamicValueComposite = new Composite(dynamicZone, SWT.NONE);
		dynamicValueComposite.setLayout(new GridLayout());
		// Group queryGroup = new Group(dynamicValueComposite, SWT.NONE);
		// queryGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// true));
		// queryGroup.setLayout(new GridLayout());
		// queryGroup.setText(this.withCondition ? "Query for result" :
		// "Query");
		// List lstQuery = new List(queryGroup, SWT.BORDER);

		List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		filters.add(new QueryScopeFilter(this.fExpectedScope));
		filters.add(new QueryReturnTypeFilter(this.fExpectedReturnTypes));

		final FilteredTree filteredTree = new QueryFilteredTree(dynamicValueComposite, querySets,
				filters, false);
		final GridData queryGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		queryGridData.widthHint = EditFeatureValueDialog.QUERIES_TREE_WIDTH;
		queryGridData.heightHint = EditFeatureValueDialog.QUERIES_TREE_HEIGHT;
		filteredTree.setLayoutData(queryGridData);
		this.fQueryViewer = filteredTree.getViewer();
		selectQueryInViewer(this.fInitialQuerySetName, this.fInitialQueryName, this.fQueryViewer,
				querySets);

		final Composite defaultValueComposite = new Composite(dynamicZone, SWT.NONE);

		this.rbStatic.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				stackLayout.topControl = staticValueComposite;
				dynamicZone.layout();
			}
		});
		this.rbQuery.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				stackLayout.topControl = dynamicValueComposite;
				dynamicZone.layout();
			}
		});
		if (this.withDefault) {
			this.rbDefault.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					stackLayout.topControl = defaultValueComposite;
					dynamicZone.layout();
				}
			});
		}

		if (this.selectedValueType == null) {
			this.selectedValueType = EditFeatureValueDialog.ValueType.STATIC;
		}

		switch (this.selectedValueType) {
		case DERIVED:
			this.rbQuery.setSelection(true);
			stackLayout.topControl = dynamicValueComposite;
			break;
		case DEFAULT:
			this.rbDefault.setSelection(true);
			stackLayout.topControl = defaultValueComposite;
			break;
		case STATIC:
		default:
			this.rbStatic.setSelection(true);
			stackLayout.topControl = staticValueComposite;
		}

		dynamicZone.layout();

		return contents;
	}

	private void createConditionPane(final Collection<ModelQuerySet> querySets,
			final Composite contents) {
		Composite leftPane = new Composite(contents, SWT.NONE);
		leftPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		leftPane.setLayout(new GridLayout());

		final Group conditionGroup = new Group(leftPane, SWT.NONE);
		conditionGroup.setLayout(new GridLayout());
		conditionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		conditionGroup.setText(Messages.EditFeatureValueDialog_queryForCondition);

		final FilteredTree filteredTree = new QueryFilteredTree(conditionGroup, querySets,
				conditionQueriesFilter(), false);
		final GridData queryGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		queryGridData.widthHint = EditFeatureValueDialog.QUERIES_TREE_WIDTH;
		queryGridData.heightHint = EditFeatureValueDialog.QUERIES_TREE_HEIGHT;
		filteredTree.setLayoutData(queryGridData);
		this.conditionQueryViewer = filteredTree.getViewer();
		selectQueryInViewer(this.initialConditionQuerySetName, this.initialConditionQueryName,
				this.conditionQueryViewer, querySets);
	}

	private List<ViewerFilter> conditionQueriesFilter() {
		List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
		filters.add(new QueryScopeFilter(this.fExpectedScope));
		List<Class<?>> expectedReturnTypes = new ArrayList<Class<?>>();
		expectedReturnTypes.add(Boolean.class);
		expectedReturnTypes.add(boolean.class);
		filters.add(new QueryReturnTypeFilter(expectedReturnTypes));
		return filters;
	}

	private void selectQueryInViewer(final String initialQuerySetName,
			final String initialQueryName, final TreeViewer queryViewer,
			final Collection<ModelQuerySet> querySets) {
		if (initialQuerySetName == null || initialQueryName == null) {
			return;
		}

		for (final ModelQuerySet querySet : querySets) {
			if (initialQuerySetName.equals(querySet.getName())) {
				for (final ModelQuery query : querySet.getQueries()) {
					if (initialQueryName.equals(query.getName())) {
						queryViewer.setSelection(new StructuredSelection(query));
						break;
					}
				}
			}
		}
	}

	/**
	 * Create the editor for the static value (text field, checkbox, list, etc.)
	 */
	protected abstract void createValueEditor(Composite parent);

	public String getStaticValue() {
		return this.staticValue;
	}

	@Override
	protected void okPressed() {
		// retrieve values before the dialog is closed and the widgets become
		// unavailable
		if (this.rbStatic.getSelection()) {
			this.selectedValueType = EditFeatureValueDialog.ValueType.STATIC;
		} else if (this.rbQuery.getSelection()) {
			this.selectedValueType = EditFeatureValueDialog.ValueType.DERIVED;
			final IStructuredSelection selection = (IStructuredSelection) this.fQueryViewer
					.getSelection();
			final Object firstElement = selection.getFirstElement();
			if (firstElement instanceof ModelQuery) {
				final ModelQuery query = (ModelQuery) firstElement;
				this.selectedQueryName = query.getName();
				this.selectedQuerySetName = query.getModelQuerySet().getName();
			} else {
				MessageDialog.openWarning(getShell(),
						Messages.EditFeatureValueDialog_noQuerySelected,
						Messages.EditFeatureValueDialog_queryMustBeSelected);
				return;
			}
		} else if (this.withDefault && this.rbDefault.getSelection()) {
			this.selectedValueType = EditFeatureValueDialog.ValueType.DEFAULT;
		}

		if (this.withCondition) {
			final IStructuredSelection selection = (IStructuredSelection) this.conditionQueryViewer
					.getSelection();
			final Object firstElement = selection.getFirstElement();
			if (firstElement instanceof ModelQuery) {
				final ModelQuery query = (ModelQuery) firstElement;
				this.selectedConditionQueryName = query.getName();
				this.selectedConditionQuerySetName = query.getModelQuerySet().getName();
			} else {
				MessageDialog.openWarning(getShell(),
						Messages.EditFeatureValueDialog_noConditionQuerySelected,
						Messages.EditFeatureValueDialog_conditionQueryMustBeSelected);
				return;
			}
		}

		super.okPressed();
	}

	/** Get the selected value type after the dialog is closed */
	public ValueType getSelectedValueType() {
		return this.selectedValueType;
	}

	/** Set the initial type before the dialog is opened */
	public void setSelectedValueType(final ValueType selectedValueType) {
		this.selectedValueType = selectedValueType;
	}

	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(Messages.EditFeatureValueDialog_editFeatureValue);
		newShell.setImage(ImageProvider.getInstance().getMoDiscoIcon());
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	public void setInitialStaticValue(final String value) {
		this.initialStaticValue = value;
	}

	/** Set the initially selected query before the dialog is opened */
	public void setSelectedQuery(final String querySetName, final String queryName) {
		this.fInitialQuerySetName = querySetName;
		this.fInitialQueryName = queryName;
	}

	/** Set the initially selected condition query before the dialog is opened */
	public void setSelectedConditionQuery(final String querySetName, final String queryName) {
		this.initialConditionQuerySetName = querySetName;
		this.initialConditionQueryName = queryName;
	}

	public String getSelectedQueryName() {
		return this.selectedQueryName;
	}

	public String getSelectedQuerySetName() {
		return this.selectedQuerySetName;
	}

	public String getSelectedConditionQueryName() {
		return this.selectedConditionQueryName;
	}

	public String getSelectedConditionQuerySetName() {
		return this.selectedConditionQuerySetName;
	}

	private Collection<ModelQuerySet> loadQuerySets() {
		final Collection<ModelQuerySet> allModelQuerySets = ModelQuerySetCatalog.getSingleton()
				.getAllModelQuerySets();
		final List<ModelQuerySet> querySets = new ArrayList<ModelQuerySet>();
		for (final ModelQuerySet modelQuerySet : allModelQuerySets) {
			if (modelQuerySet != null) {
				// only show query sets that have been selected
				if (this.availableQuerySets == null
						|| this.availableQuerySets.contains(modelQuerySet.getName())) {
					querySets.add(modelQuerySet);
				}
			}
		}
		return querySets;
	}

	protected void setStaticValue(final String staticValue) {
		this.staticValue = staticValue;
	}

	protected String getInitialStaticValue() {
		return this.initialStaticValue;
	}
}
