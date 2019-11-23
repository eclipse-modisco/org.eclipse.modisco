/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.wizards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.CodeGeneration;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.wizards.NewContainerWizardPage;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.util.JavaUtils;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.wizards.TypeCellEditor.IJavaProjectProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import com.ibm.icu.lang.UCharacter;

/** The single page of the {@link NewDiscovererWizard} */
public class NewDiscovererMainWizardPage extends NewTypeWizardPage {

	private static final int NAME_COLUMN_INDEX = 0;
	private static final int TYPE_COLUMN_INDEX = 1;
	private static final int DESCRIPTION_COLUMN_INDEX = 2;
	private static final int DIRECTION_COLUMN_INDEX = 3;
	private static final int REQUIRED_COLUMN_INDEX = 4;
	private static final int MULTIVALUED_COLUMN_INDEX = 5;

	public static final String NAME_COLUMN_PROPERTY = "name"; //$NON-NLS-1$
	public static final String TYPE_COLUMN_PROPERTY = "type"; //$NON-NLS-1$
	public static final String DESCRIPTION_COLUMN_PROPERTY = "description"; //$NON-NLS-1$
	public static final String DIRECTION_COLUMN_PROPERTY = "direction"; //$NON-NLS-1$
	public static final String REQUIRED_COLUMN_PROPERTY = "required"; //$NON-NLS-1$
	public static final String MULTIVALUED_COLUMN_PROPERTY = "multivalued"; //$NON-NLS-1$

	private static final String TXT_DISCOVERER_NAME = "txtDiscovererName"; //$NON-NLS-1$
	private static final String CHECKBOX_EXTEND_ABSTRACT_MODEL_DISCOVERER = "checkboxExtendAbstractModelDiscoverer"; //$NON-NLS-1$
	private static final String COMBO_INPUT_TYPE = "txtInputType"; //$NON-NLS-1$
	private static final String PARAMETERS_TABLE = "parametersTable"; //$NON-NLS-1$

	private Text txtDiscovererName;
	private Table tableParameters;
	private Combo fComboInputType;
	private IStatus fTxtDiscovererNameStatus;
	private IStatus fComboInputTypeStatus;
	private List<IStatus> fParametersTableStatus;
	private Button checkboxExtendAbstractModelDiscoverer;
	private String fInputType;
	private final List<DiscoveryParameterLine> fParameters = new ArrayList<DiscoveryParameterLine>();
	private TableViewer tableViewerParameters;
	private String fDiscovererName;
	private boolean fRegisterPopupMenu;
	private Image pageImage = null;
	private Button checkboxPopupMenu;
	private Text fDiscovererLabelText;
	private String fDiscovererLabel;

	protected final class ParametersTableContentProvider implements IStructuredContentProvider {
		public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			//
		}

		public void dispose() {
			//
		}

		public Object[] getElements(final Object inputElement) {
			if (inputElement instanceof List) {
				List<?> list = (List<?>) inputElement;
				if (NewDiscovererMainWizardPage.this.checkboxExtendAbstractModelDiscoverer != null
						&& NewDiscovererMainWizardPage.this.checkboxExtendAbstractModelDiscoverer
								.getSelection()) {
					List<DiscoveryParameterLine> parameters = AbstractModelDiscovererParameters
							.getInstance().getParameters();
					// add parameters added through inheritance
					Object[] result = new Object[list.size() + parameters.size()];
					for (int i = 0; i < list.size(); i++) {
						result[i] = list.get(i);
					}
					for (int i = 0; i < parameters.size(); i++) {
						result[list.size() + i] = parameters.get(i);
					}
					return result;
				}
				return list.toArray();
			}
			throw new IllegalArgumentException();
		}
	}

	protected static final class ParametersTableLabelProvider implements ITableLabelProvider,
			IColorProvider {
		public String getColumnText(final Object element, final int columnIndex) {
			if (element instanceof DiscoveryParameterLine) {
				DiscoveryParameterLine discoveryParameterLine = (DiscoveryParameterLine) element;
				switch (columnIndex) {
				case NewDiscovererMainWizardPage.NAME_COLUMN_INDEX:
					return discoveryParameterLine.getName();
				case NewDiscovererMainWizardPage.TYPE_COLUMN_INDEX:
					return discoveryParameterLine.getType();
				case NewDiscovererMainWizardPage.DESCRIPTION_COLUMN_INDEX:
					return discoveryParameterLine.getDescription();
				case NewDiscovererMainWizardPage.DIRECTION_COLUMN_INDEX:
					return discoveryParameterLine.getDirection().toString();
				case NewDiscovererMainWizardPage.REQUIRED_COLUMN_INDEX:
					// out param => "required" is disabled
					if (discoveryParameterLine.getDirection() == DirectionKind.OUT) {
						return Messages.NewDiscovererMainWizardPage_NA;
					}
					return Boolean.toString(discoveryParameterLine.isRequired());
				case NewDiscovererMainWizardPage.MULTIVALUED_COLUMN_INDEX:
					return Boolean.toString(discoveryParameterLine.isMultivalued());
				default:
					MoDiscoLogger.logError("unhandled case", Activator.getDefault()); //$NON-NLS-1$
				}
			}
			return null;
		}

		public Image getColumnImage(final Object element, final int columnIndex) {
			return null;
		}

		public boolean isLabelProperty(final Object element, final String property) {
			return true;
		}

		public void dispose() {
			//
		}

		public void addListener(final ILabelProviderListener listener) {
			//
		}

		public void removeListener(final ILabelProviderListener listener) {
			//
		}

		public Color getForeground(final Object element) {
			if (AbstractModelDiscovererParameters.isInheritedParameter(element)) {
				return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
			}
			return null;
		}

		public Color getBackground(final Object element) {
			return null;
		}
	}

	/**
	 * Create the wizard.
	 */
	public NewDiscovererMainWizardPage() {
		super(true, NewDiscovererMainWizardPage.class.getName());
		setTitle(Messages.NewDiscovererMainWizardPage_newMoDiscoDiscoverer);
		setDescription(Messages.NewDiscovererMainWizardPage_createNewDiscoverer);
	}

	/**
	 * Create contents of the wizard.
	 *
	 * @param parent
	 */
	public void createControl(final Composite parent) {
		initializeDialogUnits(parent);

		Composite container = new Composite(parent, SWT.NULL);
		container.setFont(parent.getFont());

		final int nColumns = 4;
		container.setLayout(new GridLayout(nColumns, false));

		createContainerControls(container, nColumns);
		createPackageControls(container, nColumns);
		createTypeNameControls(container, nColumns);
		createSeparator(container, nColumns);
		createInputType(container);
		createDiscovererNameField(container);

		Label lblParameters = new Label(container, SWT.NONE);
		lblParameters.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblParameters.setText(Messages.NewDiscovererMainWizardPage_discoverParamsDecl);

		createParametersTable(container);
		createTableButtons(container);

		createSeparator(container, nColumns);
		createExtendCheckbox(container);
		createPopupMenuGroup(container);

		updateSuperType();
		setControl(container);
		Dialog.applyDialogFont(container);
	}

	private void createInputType(final Composite container) {
		Label lblInputType = new Label(container, SWT.NONE);
		lblInputType.setText(Messages.NewDiscovererMainWizardPage_inputType);

		this.fComboInputType = new Combo(container, SWT.BORDER);
		this.fComboInputType.setItems(new String[] { "org.eclipse.core.resources.IFile", //$NON-NLS-1$
				"org.eclipse.core.resources.IFolder", "org.eclipse.core.resources.IProject" }); //$NON-NLS-1$//$NON-NLS-2$
		this.fComboInputType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		this.fComboInputType.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				handleFieldChanged(NewDiscovererMainWizardPage.COMBO_INPUT_TYPE);
				updateSuperType();
			}
		});

		Button btnBrowseInputType = new Button(container, SWT.NONE);
		btnBrowseInputType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnBrowseInputType.setText(Messages.NewDiscovererMainWizardPage_browse);
		btnBrowseInputType.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				IType type = chooseInputType();
				if (type != null) {
					NewDiscovererMainWizardPage.this.fComboInputType.setText(type
							.getFullyQualifiedName('.'));
					handleFieldChanged(NewDiscovererMainWizardPage.COMBO_INPUT_TYPE);
					updateSuperType();
				}
			}
		});
	}

	private void createDiscovererNameField(final Composite container) {
		Label lblDiscovererName = new Label(container, SWT.NONE);
		lblDiscovererName.setText(Messages.NewDiscovererMainWizardPage_uiName);

		this.txtDiscovererName = new Text(container, SWT.BORDER);
		this.txtDiscovererName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		this.txtDiscovererName.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				handleFieldChanged(NewDiscovererMainWizardPage.TXT_DISCOVERER_NAME);
			}
		});
		spacer(container);
	}

	@SuppressWarnings("unused")
	private static void spacer(final Composite container) {
		new Label(container, SWT.NONE);
	}

	private static final int PARAMETER_TABLE_HEIGHT = 120;
	private static final int NAME_COLUMN_WIDTH = 85;
	private static final int TYPE_COLUMN_WIDTH = 85;
	private static final int DESCRIPTION_COLUMN_WIDTH = 120;
	private static final int DIRECTION_COLUMN_WIDTH = 70;
	private static final int REQUIRED_COLUMN_WIDTH = 60;
	private static final int MULTIVALUED_COLUMN_WIDTH = 75;

	private void createParametersTable(final Composite container) {
		this.tableViewerParameters = new TableViewer(container, SWT.MULTI | SWT.BORDER
				| SWT.FULL_SELECTION);
		this.tableParameters = this.tableViewerParameters.getTable();
		this.tableParameters.setLinesVisible(true);
		this.tableParameters.setHeaderVisible(true);
		GridData gdTableParameters = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		gdTableParameters.heightHint = NewDiscovererMainWizardPage.PARAMETER_TABLE_HEIGHT;
		this.tableParameters.setLayoutData(gdTableParameters);

		TableViewerColumn tableViewerColumnName = new TableViewerColumn(this.tableViewerParameters,
				SWT.NONE);
		TableColumn tableColumnName = tableViewerColumnName.getColumn();
		tableColumnName.setWidth(NewDiscovererMainWizardPage.NAME_COLUMN_WIDTH);
		tableColumnName.setText(Messages.NewDiscovererMainWizardPage_name);

		TableViewerColumn tableViewerColumnType = new TableViewerColumn(this.tableViewerParameters,
				SWT.NONE);
		TableColumn tableColumnType = tableViewerColumnType.getColumn();
		tableColumnType.setWidth(NewDiscovererMainWizardPage.TYPE_COLUMN_WIDTH);
		tableColumnType.setText(Messages.NewDiscovererMainWizardPage_type);

		TableViewerColumn tableViewerColumnDescription = new TableViewerColumn(
				this.tableViewerParameters, SWT.NONE);
		TableColumn tableColumnDescription = tableViewerColumnDescription.getColumn();
		tableColumnDescription.setWidth(NewDiscovererMainWizardPage.DESCRIPTION_COLUMN_WIDTH);
		tableColumnDescription.setText(Messages.NewDiscovererMainWizardPage_description);

		TableViewerColumn tableViewerColumnDirection = new TableViewerColumn(
				this.tableViewerParameters, SWT.NONE);
		TableColumn tableColumnDirection = tableViewerColumnDirection.getColumn();
		tableColumnDirection.setWidth(NewDiscovererMainWizardPage.DIRECTION_COLUMN_WIDTH);
		tableColumnDirection.setText(Messages.NewDiscovererMainWizardPage_direction);

		TableViewerColumn tableViewerColumnRequired = new TableViewerColumn(
				this.tableViewerParameters, SWT.NONE);
		TableColumn tableColumnRequired = tableViewerColumnRequired.getColumn();
		tableColumnRequired.setWidth(NewDiscovererMainWizardPage.REQUIRED_COLUMN_WIDTH);
		tableColumnRequired.setText(Messages.NewDiscovererMainWizardPage_required);

		TableViewerColumn tableViewerColumnMultivalued = new TableViewerColumn(
				this.tableViewerParameters, SWT.NONE);
		TableColumn tableColumnMultivalued = tableViewerColumnMultivalued.getColumn();
		tableColumnMultivalued.setWidth(NewDiscovererMainWizardPage.MULTIVALUED_COLUMN_WIDTH);
		tableColumnMultivalued.setText(Messages.NewDiscovererMainWizardPage_multivalued);

		this.tableViewerParameters.setColumnProperties(new String[] {
				NewDiscovererMainWizardPage.NAME_COLUMN_PROPERTY,
				NewDiscovererMainWizardPage.TYPE_COLUMN_PROPERTY,
				NewDiscovererMainWizardPage.DESCRIPTION_COLUMN_PROPERTY,
				NewDiscovererMainWizardPage.DIRECTION_COLUMN_PROPERTY,
				NewDiscovererMainWizardPage.REQUIRED_COLUMN_PROPERTY,
				NewDiscovererMainWizardPage.MULTIVALUED_COLUMN_PROPERTY });

		this.tableViewerParameters.setContentProvider(new ParametersTableContentProvider());
		this.tableViewerParameters.setLabelProvider(new ParametersTableLabelProvider());
		this.tableViewerParameters.setInput(this.fParameters);

		createCellEditors(); // $hide$
	}

	protected void createCellEditors() {
		final int nColumns = 6;
		CellEditor[] editors = new CellEditor[nColumns];
		editors[NewDiscovererMainWizardPage.NAME_COLUMN_INDEX] = new TextCellEditor(
				this.tableParameters);
		editors[NewDiscovererMainWizardPage.TYPE_COLUMN_INDEX] = new TypeCellEditor(
				this.tableParameters, new IJavaProjectProvider() {
					public IJavaProject getJavaProject() {
						return NewDiscovererMainWizardPage.this.getJavaProject();
					}
				});
		editors[NewDiscovererMainWizardPage.DESCRIPTION_COLUMN_INDEX] = new TextCellEditor(
				this.tableParameters);
		DirectionKind[] values = DirectionKind.values();
		String[] valueNames = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			valueNames[i] = values[i].name();
		}
		editors[NewDiscovererMainWizardPage.DIRECTION_COLUMN_INDEX] = new ComboBoxCellEditor(
				this.tableParameters, valueNames, SWT.READ_ONLY);
		editors[NewDiscovererMainWizardPage.REQUIRED_COLUMN_INDEX] = new CheckboxCellEditor(
				this.tableParameters);
		editors[NewDiscovererMainWizardPage.MULTIVALUED_COLUMN_INDEX] = new CheckboxCellEditor(
				this.tableParameters);
		this.tableViewerParameters.setCellEditors(editors);
		this.tableViewerParameters.setCellModifier(new ParameterCellModifier(this));
	}

	private void createTableButtons(final Composite container) {
		Composite buttonsComposite = new Composite(container, SWT.NONE);
		buttonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		buttonsComposite.setLayout(new GridLayout(1, false));

		Button btnAddParameter = new Button(buttonsComposite, SWT.NONE);
		btnAddParameter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddParameter.setText(Messages.NewDiscovererMainWizardPage_add);

		btnAddParameter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				DiscoveryParameterLine discoveryParameterLine = new DiscoveryParameterLine();
				getParameters().add(discoveryParameterLine);
				getTableViewerParameters().refresh();
				getTableViewerParameters().editElement(discoveryParameterLine, 0);
				parameterDataWasModified();
			}
		});

		Button btnRemoveParameter = new Button(buttonsComposite, SWT.NONE);
		btnRemoveParameter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnRemoveParameter.setText(Messages.NewDiscovererMainWizardPage_remove);
		btnRemoveParameter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) getTableViewerParameters()
						.getSelection();
				Iterator<?> iterator = selection.iterator();
				while (iterator.hasNext()) {
					Object element = iterator.next();
					if (!AbstractModelDiscovererParameters.isInheritedParameter(element)) {
						getParameters().remove(element);
					}
				}
				getTableViewerParameters().refresh();
				parameterDataWasModified();
			}
		});

	}

	private void createExtendCheckbox(final Composite container) {
		Group group = new Group(container, SWT.NONE);
		group.setText(Messages.NewDiscovererMainWizardPage_handlesModel);
		final int horizontalSpan = 3;
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, horizontalSpan, 1));
		group.setLayout(new GridLayout());
		spacer(container);

		// Label lblDiscovererWillHandleModel = new Label(container, SWT.NONE);
		// lblDiscovererWillHandleModel.setLayoutData(new GridData(SWT.LEFT,
		// SWT.CENTER, false, false,
		// 4, 1));
		// lblDiscovererWillHandleModel.setText(Messages.NewDiscovererMainWizardPage_handlesModel);
		// spacer(container);

		this.checkboxExtendAbstractModelDiscoverer = new Button(group, SWT.CHECK);
		this.checkboxExtendAbstractModelDiscoverer
				.setText(Messages.NewDiscovererMainWizardPage_extendAbstractModelDiscoverer);

		this.checkboxExtendAbstractModelDiscoverer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				updateSuperType();
				getTableViewerParameters().refresh();
				handleFieldChanged(NewDiscovererMainWizardPage.CHECKBOX_EXTEND_ABSTRACT_MODEL_DISCOVERER);
			}
		});

		// spacer(container);
	}

	private void createPopupMenuGroup(final Composite container) {
		Group group = new Group(container, SWT.NONE);
		group.setText(Messages.NewDiscovererMainWizardPage_makeUIContributions);
		final int horizontalSpan = 3;
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, horizontalSpan, 1));
		group.setLayout(new GridLayout(2, false));
		spacer(container);

		this.checkboxPopupMenu = new Button(group, SWT.CHECK);
		this.checkboxPopupMenu.setText(Messages.NewDiscovererMainWizardPage_registerMenuAction);
		this.checkboxPopupMenu
				.setToolTipText(Messages.NewDiscovererMainWizardPage_registerMenuActionTooltip);
		this.checkboxPopupMenu
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));

		final Label label = new Label(group, SWT.NONE);
		label.setText(Messages.NewDiscovererMainWizardPage_discovererLabel);
		label.setToolTipText(Messages.NewDiscovererMainWizardPage_discovererLabelTooltip);
		label.setEnabled(false);

		this.fDiscovererLabelText = new Text(group, SWT.BORDER);
		this.fDiscovererLabelText.setEnabled(false);
		this.fDiscovererLabelText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		this.checkboxPopupMenu.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				NewDiscovererMainWizardPage.this.fDiscovererLabelText
						.setEnabled(NewDiscovererMainWizardPage.this.checkboxPopupMenu
								.getSelection());
				label.setEnabled(NewDiscovererMainWizardPage.this.checkboxPopupMenu.getSelection());
			}
		});
	}

	@Override
	protected String getTypeNameLabel() {
		return Messages.NewDiscovererMainWizardPage_className;
	}

	protected void updateSuperType() {
		String text = this.fComboInputType.getText();
		if (text.trim().length() == 0) {
			text = "java.lang.Object"; //$NON-NLS-1$
		}
		if (this.checkboxExtendAbstractModelDiscoverer.getSelection()) {
			setSuperClass("org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer<" //$NON-NLS-1$
					+ text + ">", true); //$NON-NLS-1$
		} else {
			setSuperClass("org.eclipse.modisco.infra.discovery.core.AbstractDiscoverer<" //$NON-NLS-1$
					+ text + ">", true); //$NON-NLS-1$
		}
	}

	private void doStatusUpdate() {
		// statuses of all used components
		List<IStatus> statuses = new ArrayList<IStatus>();
		statuses.add(this.fContainerStatus);
		statuses.add(this.fPackageStatus);
		statuses.add(this.fTypeNameStatus);
		statuses.add(this.fComboInputTypeStatus);
		statuses.add(this.fTxtDiscovererNameStatus);
		statuses.addAll(this.fParametersTableStatus);

		// the most severe status will be displayed and the OK button
		// enabled/disabled.
		updateStatus(statuses.toArray(new IStatus[statuses.size()]));
	}

	@Override
	protected void handleFieldChanged(final String fieldName) {
		super.handleFieldChanged(fieldName);

		if (fieldName == NewDiscovererMainWizardPage.TXT_DISCOVERER_NAME
				|| fieldName == NewContainerWizardPage.CONTAINER) {
			this.fTxtDiscovererNameStatus = txtDiscovererNameStatus();
		}

		if (fieldName == NewDiscovererMainWizardPage.COMBO_INPUT_TYPE
				|| fieldName == NewContainerWizardPage.CONTAINER) {
			this.fComboInputTypeStatus = comboInputTypeStatus();
		}

		if (fieldName == NewDiscovererMainWizardPage.PARAMETERS_TABLE
				|| fieldName == NewContainerWizardPage.CONTAINER) {
			this.fParametersTableStatus = parametersTableStatuses();
		}

		doStatusUpdate();
	}

	private IStatus txtDiscovererNameStatus() {
		if (this.txtDiscovererName == null || this.txtDiscovererName.getText().trim().length() == 0) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					Messages.NewDiscovererMainWizardPage_uiNameIsEmpty);
		}

		String text = this.txtDiscovererName.getText();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (" #/\\<>&'\"".indexOf(c) != -1) { //$NON-NLS-1$
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						Messages.NewDiscovererMainWizardPage_noSpecialChars);
			}
		}
		return new Status(IStatus.OK, Activator.PLUGIN_ID, (String) null);
	}

	private IStatus comboInputTypeStatus() {
		if (this.fComboInputType != null) {
			String name = this.fComboInputType.getText();
			return JavaConventions.validateJavaTypeName(name, JavaCore.VERSION_1_5,
					JavaCore.VERSION_1_5);
		}
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				Messages.NewDiscovererMainWizardPage_inputTypeFieldInvalid);
	}

	@Override
	protected IStatus containerChanged() {
		IStatus status = super.containerChanged();
		if (status.isOK()) {
			IFile manifestResource = (IFile) getJavaProject().getProject().findMember(
					new Path("/META-INF/MANIFEST.MF")); //$NON-NLS-1$
			if (manifestResource == null) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						"Project is not a plug-in project (doesn't have a Manifest.MF)"); //$NON-NLS-1$
			}
		}
		return status;
	}

	private List<IStatus> parametersTableStatuses() {
		List<IStatus> statuses = new ArrayList<IStatus>();

		for (DiscoveryParameterLine parameter : this.fParameters) {
			String name = parameter.getName();
			if (name.length() == 0) {
				statuses.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						Messages.NewDiscovererMainWizardPage_parameterWithEmptyName));
			} else {
				IStatus nameStatus = JavaConventions.validateFieldName(name, JavaCore.VERSION_1_5,
						JavaCore.VERSION_1_5);
				if (!nameStatus.isOK()) {
					statuses.add(nameStatus);
				}
			}
			String type = parameter.getType();
			IStatus typeNameStatus = JavaConventions.validateJavaTypeName(type,
					JavaCore.VERSION_1_5, JavaCore.VERSION_1_5);
			if (!typeNameStatus.isOK()) {
				statuses.add(typeNameStatus);
			}

			String description = parameter.getDescription();
			if (description.trim().length() == 0) {
				statuses.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
						Messages.NewDiscovererMainWizardPage_parameterMustHaveDescription));
			}
		}
		return statuses;
	}

	/** Initialize the page from the current selection */
	public void init(final IStructuredSelection selection) {
		IJavaElement javaElement = getInitialJavaElement(selection);
		initContainerPage(javaElement);
		initTypePage(javaElement);
		doStatusUpdate();
	}

	protected IType chooseInputType() {
		IJavaProject project = getJavaProject();

		ArrayList<String> bundlesInSearchPath = new ArrayList<String>();
		bundlesInSearchPath.add("org.eclipse.emf.ecore"); //$NON-NLS-1$
		return JavaUtils.openTypeSelectionDialog(project, bundlesInSearchPath, getShell(),
				getContainer(), IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES,
				Messages.NewDiscovererMainWizardPage_chooseInputType,
				Messages.NewDiscovererMainWizardPage_chooseInputTypeLong);
	}

	@Override
	protected void createTypeMembers(final IType type, final ImportsManager imports,
			final IProgressMonitor monitor) throws CoreException {
		StringBuffer buf = new StringBuffer();
		final String lineDelimiter = "\n"; // OK, since content is formatted afterwards //$NON-NLS-1$
		// shorten name and add import if needed
		String inputType = imports.addImport(this.fInputType);

		for (DiscoveryParameterLine parameter : this.fParameters) {
			String shortType = imports.addImport(parameter.getType());
			String shortParameter = imports
					.addImport("org.eclipse.modisco.infra.discovery.core.annotations.Parameter"); //$NON-NLS-1$
			String capitalizedName;
			if (parameter.getName().length() > 0) {
				capitalizedName = UCharacter.toUpperCase(parameter.getName().charAt(0))
						+ parameter.getName().substring(1);
			} else {
				capitalizedName = ""; //$NON-NLS-1$
			}

			// private Type paramName;
			// buf.append(
			// CodeGeneration.getFieldComment(type.getCompilationUnit(),
			// parameter.getType(),
			// parameter.getName(), lineDelimiter)).append(lineDelimiter);
			if (parameter.getDescription().trim().length() > 0) {
				buf.append("/** ").append(parameter.getDescription()).append(" */") //$NON-NLS-1$ //$NON-NLS-2$
						.append(lineDelimiter);
			}
			buf.append("private ").append(shortType).append(maybeArray(parameter.isMultivalued())).append(" ").append(parameter.getName()) //$NON-NLS-1$ //$NON-NLS-2$
					.append(";").append(lineDelimiter); //$NON-NLS-1$
			type.createField(buf.toString(), null, false, monitor);
			buf.setLength(0);

			// @Parameter{name="paramName"}
			// public Type getParamName() {
			// return this.paramName;
			// }
			if (parameter.getDirection().equals(DirectionKind.OUT)
					|| parameter.getDirection().equals(DirectionKind.INOUT)) {
				buf.append("@").append(shortParameter).append("(name=\"") //$NON-NLS-1$ //$NON-NLS-2$
						.append(parameter.getName()).append("\"") //$NON-NLS-1$
						.append(maybeDescription(parameter.getDescription())).append(")") //$NON-NLS-1$
						.append(lineDelimiter);
				buf.append("public ").append(shortType).append(maybeArray(parameter.isMultivalued())).append(" get").append(capitalizedName) //$NON-NLS-1$//$NON-NLS-2$
						.append("() {").append(lineDelimiter); //$NON-NLS-1$
				buf.append("return this.").append(parameter.getName()).append(";") //$NON-NLS-1$ //$NON-NLS-2$
						.append(lineDelimiter);
				buf.append("}").append(lineDelimiter); //$NON-NLS-1$
				type.createMethod(buf.toString(), null, false, monitor);
				buf.setLength(0);
			}

			// @Parameter{name="paramName"}
			// public void setParamName(Type value) {
			// this.paramName = value;
			// }
			if (parameter.getDirection().equals(DirectionKind.IN)
					|| parameter.getDirection().equals(DirectionKind.INOUT)) {
				buf.append("@").append(shortParameter).append("(name=\"") //$NON-NLS-1$ //$NON-NLS-2$
						.append(parameter.getName()).append("\"") //$NON-NLS-1$
						.append(maybeDescription(parameter.getDescription()))
						.append(maybeRequiresInputValue(parameter.isRequired())).append(")") //$NON-NLS-1$
						.append(lineDelimiter);
				buf.append("public void set").append(capitalizedName).append("(").append(shortType).append(maybeArray(parameter.isMultivalued())) //$NON-NLS-1$//$NON-NLS-2$
						.append(" value) {").append(lineDelimiter); //$NON-NLS-1$
				buf.append("this.").append(parameter.getName()).append(" = value;") //$NON-NLS-1$ //$NON-NLS-2$
						.append(lineDelimiter);
				buf.append("}").append(lineDelimiter); //$NON-NLS-1$
				type.createMethod(buf.toString(), null, false, monitor);
				buf.setLength(0);
			}
		}

		// public boolean isApplicableTo(IFile source) {
		// // TO.DO Auto-generated method stub
		// return false;
		// }
		buf.append("public boolean isApplicableTo(final ").append(inputType).append(" source) {").append(lineDelimiter); //$NON-NLS-1$//$NON-NLS-2$
		final String isApplicableToBodyContent = CodeGeneration.getMethodBodyContent(
				type.getCompilationUnit(), type.getTypeQualifiedName('.'),
				"isApplicableTo", false, "return false;", lineDelimiter); //$NON-NLS-1$ //$NON-NLS-2$
		if (isApplicableToBodyContent != null && isApplicableToBodyContent.length() != 0) {
			buf.append(isApplicableToBodyContent);
		}
		buf.append(lineDelimiter);
		buf.append("}"); //$NON-NLS-1$
		type.createMethod(buf.toString(), null, false, monitor);

		// @Override
		// protected void basicDiscoverElement(final IFile source, final
		// IProgressMonitor monitor)
		// throws DiscoveryException {
		// // TO.DO Auto-generated method stub
		// }
		buf.setLength(0);
		String discoveryException = imports
				.addImport("org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException"); //$NON-NLS-1$
		String progressMonitor = imports.addImport("org.eclipse.core.runtime.IProgressMonitor"); //$NON-NLS-1$
		buf.append("@Override").append(lineDelimiter); //$NON-NLS-1$
		buf.append("protected void basicDiscoverElement(final ").append(inputType).append(" source, final ").append(progressMonitor).append(" monitor) throws ").append(discoveryException).append(" {").append(lineDelimiter); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		final String basicDiscoverElementBodyContent = CodeGeneration.getMethodBodyContent(
				type.getCompilationUnit(), type.getTypeQualifiedName('.'),
				"basicDiscoverElement", false, "", lineDelimiter); //$NON-NLS-1$ //$NON-NLS-2$
		if (basicDiscoverElementBodyContent != null
				&& basicDiscoverElementBodyContent.length() != 0) {
			buf.append(basicDiscoverElementBodyContent);
		}
		buf.append(lineDelimiter);
		buf.append("}"); //$NON-NLS-1$
		type.createMethod(buf.toString(), null, false, monitor);

		if (monitor != null) {
			monitor.done();
		}
	}

	private static String maybeRequiresInputValue(final boolean required) {
		if (required) {
			return ", requiresInputValue = true"; //$NON-NLS-1$
		}
		return ""; //$NON-NLS-1$
	}

	private static String maybeDescription(final String description) {
		if (description.trim().length() == 0) {
			return ""; //$NON-NLS-1$
		}
		// escape double quotes
		return ", description = \"" + description.replaceAll("\"", "\\\"") + "\""; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	private static String maybeArray(final boolean multivalued) {
		if (multivalued) {
			return "[]"; //$NON-NLS-1$
		}
		return ""; //$NON-NLS-1$
	}

	protected TableViewer getTableViewerParameters() {
		return this.tableViewerParameters;
	}

	public List<DiscoveryParameterLine> getParameters() {
		return this.fParameters;
	}

	public void preFinishPage() {
		this.fInputType = this.fComboInputType.getText();
		this.fDiscovererName = this.txtDiscovererName.getText();
		this.fRegisterPopupMenu = this.checkboxPopupMenu.getSelection();
		this.fDiscovererLabel = this.fDiscovererLabelText.getText();
	}

	public void finishPage(final IProgressMonitor monitor) {
		try {
			createType(monitor);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	public void parameterDataWasModified() {
		handleFieldChanged(NewDiscovererMainWizardPage.PARAMETERS_TABLE);
		this.tableViewerParameters.refresh();
	}

	public String getInputType() {
		return this.fInputType;
	}

	public String getDiscovererName() {
		return this.fDiscovererName;
	}

	public boolean isRegisterPopupMenu() {
		return this.fRegisterPopupMenu;
	}

	public String getDiscovererLabel() {
		return this.fDiscovererLabel;
	}

	@Override
	public void setVisible(final boolean visible) {
		super.setVisible(visible);
		if (visible) {
			setFocus();
		}
	}

	@Override
	protected void setFocus() {
		setFocusOnContainer();
	}

	@Override
	public Image getImage() {
		if (this.pageImage == null) {
			this.pageImage = Activator
					.getImageDescriptor("icons/discoverer_banner.png").createImage(); //$NON-NLS-1$
		}
		return this.pageImage;
	}

	@Override
	public void dispose() {
		super.dispose();
		if (this.pageImage != null) {
			this.pageImage.dispose();
		}
	}
}
