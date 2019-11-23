/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.dialogs;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.facet.widgets.celleditors.IValidator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.util.DiscovererParameterDescriptionTooltip;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

/** A dialog that presents fields to enter "in" parameters for a discoverer */
public class GenericParametersDialog extends TitleAreaDialog {

	private static final String NAME_COLUMN_PROPERTY = "name"; //$NON-NLS-1$
	private static final String VALUE_COLUMN_PROPERTY = "value"; //$NON-NLS-1$
	private static final String TYPE_COLUMN_PROPERTY = "type"; //$NON-NLS-1$
	private static final int NAME_COLUMN_INDEX = 0;
	private static final int VALUE_COLUMN_INDEX = 1;
	private static final int TYPE_COLUMN_INDEX = 2;
	private static final int DIALOG_WIDTH = 725;
	private static final int DIALOG_HEIGHT = 455;

	private static final int NAME_COLUMN_WIDTH = 150;
	private static final int VALUE_COLUMN_WIDTH = 250;
	private static final int TYPE_COLUMN_WIDTH = 250;
	private static final int PARAMETERS_TABLE_HEIGHT = 120;

	private final List<DiscovererParameter> parameters;
	private final Object[] fParameterValues;
	private final AbstractCellEditorComposite<?>[] cellEditors;
	private final String discovererName;
	private TableViewer tableViewerParameters;
	private Table tableParameters;
	private Image titleImage;
	private Button checkBoxOpenModel;
	private boolean openModel;
	private final boolean showOpenModelCheckbox;

	private boolean cellEditorOpened = false;
	private final LaunchConfiguration configurationModel;

	protected static final class ParametersTableContentProvider implements
			IStructuredContentProvider {
		public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			//
		}

		public void dispose() {
			//
		}

		public Object[] getElements(final Object inputElement) {
			if (inputElement instanceof List) {
				List<?> list = (List<?>) inputElement;
				return list.toArray();
			}
			throw new IllegalArgumentException();
		}
	}

	protected final class ParametersTableLabelProvider implements ITableLabelProvider {
		public String getColumnText(final Object element, final int columnIndex) {
			if (element instanceof DiscovererParameter) {
				DiscovererParameter param = (DiscovererParameter) element;
				switch (columnIndex) {
				case GenericParametersDialog.NAME_COLUMN_INDEX:
					if (param.isRequiredInput()) {
						return param.getId() + "*"; //$NON-NLS-1$
					}
					return param.getId();
				case GenericParametersDialog.VALUE_COLUMN_INDEX:
					Object parameterValue = GenericParametersDialog.this.fParameterValues[GenericParametersDialog.this.parameters
							.indexOf(element)];
					if (parameterValue == null) {
						return ""; //$NON-NLS-1$
					}
					return parameterValue.toString();
				case GenericParametersDialog.TYPE_COLUMN_INDEX:
					return param.getType().getName();
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
	}

	/**
	 * Create the dialog.
	 *
	 * @param parentShell
	 * @param parameters
	 * @param discovererName
	 * @param showOpenModelCheckbox
	 * @param configurationModel
	 *            contains the parameters saved from the last discovery
	 */
	public GenericParametersDialog(final Shell parentShell,
			final List<DiscovererParameter> parameters, final String discovererName,
			final boolean showOpenModelCheckbox, final LaunchConfiguration configurationModel) {
		super(parentShell);
		this.parameters = parameters;
		this.discovererName = discovererName;
		this.showOpenModelCheckbox = showOpenModelCheckbox;
		this.configurationModel = configurationModel;
		this.fParameterValues = initializeParameterValues();
		this.cellEditors = new AbstractCellEditorComposite<?>[parameters.size()];
		setTitleImage(getTitleImage());
	}

	private Object[] initializeParameterValues() {
		Object[] values = new Object[this.parameters.size()];
		EList<ParameterValue> parameterValues = this.configurationModel.getParameterValues();
		for (ParameterValue parameterValue : parameterValues) {
			DiscovererParameter parameter = parameterValue.getParameter();
			int parameterIndex = getParameterIndex(parameter);
			if (parameterIndex != -1) {
				values[parameterIndex] = parameterValue.getValue();
			}
		}
		return values;
	}

	private int getParameterIndex(final DiscovererParameter parameter) {
		for (int i = 0; i < this.parameters.size(); i++) {
			DiscovererParameter param = this.parameters.get(i);
			if (param.getId().equals(parameter.getId())) {
				return i;
			}
		}
		return -1;
	}

	private Image getTitleImage() {
		if (this.titleImage == null) {
			this.titleImage = Activator
					.getImageDescriptor("icons/discoverer_banner.png").createImage(); //$NON-NLS-1$
		}
		return this.titleImage;
	}

	/**
	 * Create the contents of the dialog.
	 *
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {
		setTitle(Messages.GenericParametersDialog_title);

		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setFont(parent.getFont());

		createParametersTable(container);

		Label lblRequired = new Label(container, SWT.NONE);
		lblRequired.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblRequired.setText(Messages.GenericParametersDialog_marksRequiredParam);

		if (this.showOpenModelCheckbox) {
			this.checkBoxOpenModel = new Button(container, SWT.CHECK);
			this.checkBoxOpenModel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false,
					2, 1));
			this.checkBoxOpenModel.setText(Messages.GenericParametersDialog_openModelEditor);
			this.checkBoxOpenModel
					.setSelection(this.configurationModel.isOpenModelAfterDiscovery());
		}

		return container;
	}

	private void createParametersTable(final Composite container) {
		this.tableViewerParameters = new TableViewer(container, SWT.MULTI | SWT.BORDER
				| SWT.FULL_SELECTION);
		this.tableParameters = this.tableViewerParameters.getTable();
		this.tableParameters.setLinesVisible(true);
		this.tableParameters.setHeaderVisible(true);
		GridData gdTableParameters = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		gdTableParameters.heightHint = GenericParametersDialog.PARAMETERS_TABLE_HEIGHT;
		this.tableParameters.setLayoutData(gdTableParameters);

		TableViewerColumn tableViewerColumnName = new TableViewerColumn(this.tableViewerParameters,
				SWT.NONE);
		TableColumn tableColumnName = tableViewerColumnName.getColumn();
		tableColumnName.setWidth(GenericParametersDialog.NAME_COLUMN_WIDTH);
		tableColumnName.setText(Messages.GenericParametersDialog_name);

		TableViewerColumn tableViewerColumnValue = new TableViewerColumn(
				this.tableViewerParameters, SWT.NONE);
		TableColumn tableColumnValue = tableViewerColumnValue.getColumn();
		tableColumnValue.setWidth(GenericParametersDialog.VALUE_COLUMN_WIDTH);
		tableColumnValue.setText(Messages.GenericParametersDialog_value);
		tableViewerColumnValue.setEditingSupport(new ParameterValueEditingSupport(
				this.tableViewerParameters, this));

		TableViewerColumn tableViewerColumnType = new TableViewerColumn(this.tableViewerParameters,
				SWT.NONE);
		TableColumn tableColumnType = tableViewerColumnType.getColumn();
		tableColumnType.setWidth(GenericParametersDialog.TYPE_COLUMN_WIDTH);
		tableColumnType.setText(Messages.GenericParametersDialog_type);

		this.tableViewerParameters.setColumnProperties(new String[] {
				GenericParametersDialog.NAME_COLUMN_PROPERTY,
				GenericParametersDialog.VALUE_COLUMN_PROPERTY,
				GenericParametersDialog.TYPE_COLUMN_PROPERTY });

		this.tableViewerParameters.setContentProvider(new ParametersTableContentProvider());
		this.tableViewerParameters.setLabelProvider(new ParametersTableLabelProvider());
		this.tableViewerParameters.setInput(this.parameters);

		tableColumnName.pack();

		this.tableViewerParameters.getTable().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.F2) {
					IStructuredSelection selection = (IStructuredSelection) GenericParametersDialog.this.tableViewerParameters
							.getSelection();
					Object firstElement = selection.getFirstElement();
					GenericParametersDialog.this.tableViewerParameters.editElement(firstElement,
							GenericParametersDialog.VALUE_COLUMN_INDEX);
				}
			}
		});

		createDescriptionTooltip(this.tableParameters);
	}

	private static void createDescriptionTooltip(final Table table) {
		ToolTip tooltip = new DiscovererParameterDescriptionTooltip(table) {
			@Override
			protected DiscovererParameter getDiscovererParameterAt(final Event event) {
				TableItem item = table.getItem(new Point(event.x, event.y));
				if (item == null) {
					return null;
				}
				DiscovererParameter parameter = (DiscovererParameter) item.getData();
				return parameter;
			}
		};
		tooltip.activate();
	}

	public void validate(final boolean showErrors) {
		for (int i = 0; i < this.parameters.size(); i++) {
			Object value = this.fParameterValues[i];
			DiscovererParameter param = this.parameters.get(i);
			if (value == null && param.isRequiredInput()) {
				if (showErrors) {
					setErrorMessage(NLS.bind(Messages.GenericParametersDialog_fieldIsEmpty,
							param.getId()));
				}
				getButton(IDialogConstants.OK_ID).setEnabled(false);
				return;
			}

			if (this.cellEditors[i] != null) {
				IValidator validator = this.cellEditors[i].getValidator();
				IStatus status = validator.validate(this.cellEditors[i].getValue());
				if (status != Status.OK_STATUS) {
					if (showErrors) {
						String statusMessage = status.getMessage();
						String msg;
						if (statusMessage != null && statusMessage.trim().length() > 0) {
							msg = NLS.bind(Messages.GenericParametersDialog_invalidField1,
									param.getId(), statusMessage);
						} else {
							msg = NLS.bind(Messages.GenericParametersDialog_invalidField2,
									param.getId());
						}
						setErrorMessage(msg);
					}
					getButton(IDialogConstants.OK_ID).setEnabled(false);
					return;
				}
			}
		}
		setErrorMessage(null);
		if (this.cellEditorOpened) {
			getButton(IDialogConstants.OK_ID).setEnabled(false);
		} else {
			getButton(IDialogConstants.OK_ID).setEnabled(true);
		}
	}

	/**
	 * Create contents of the button bar.
	 *
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(final Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "&" + IDialogConstants.OK_LABEL, true); //$NON-NLS-1$
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		validate(false);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		// save settings per discoverer
		final String sectionName = this.getClass().getName() + ":" + this.discovererName; //$NON-NLS-1$
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings section = settings.getSection(sectionName);
		if (section == null) {
			section = settings.addNewSection(sectionName);
			section.put("DIALOG_WIDTH", GenericParametersDialog.DIALOG_WIDTH); //$NON-NLS-1$
			section.put("DIALOG_HEIGHT", GenericParametersDialog.DIALOG_HEIGHT); //$NON-NLS-1$
		}
		return section;
	}

	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(NLS.bind(Messages.GenericParametersDialog_shellText, this.discovererName));

	}

	public Object[] getParameterValues() {
		return this.fParameterValues;
	}

	@Override
	public boolean isHelpAvailable() {
		return false;
	}

	public Object getParameterValue(final DiscovererParameter element) {
		return this.fParameterValues[this.parameters.indexOf(element)];

	}

	public void setParameterValue(final DiscovererParameter element, final Object value) {
		this.fParameterValues[this.parameters.indexOf(element)] = value;
	}

	@Override
	public boolean close() {
		if (this.checkBoxOpenModel != null) {
			this.openModel = this.checkBoxOpenModel.getSelection();
		} else {
			this.openModel = false;
		}
		boolean closed = super.close();
		this.titleImage.dispose();
		return closed;
	}

	public boolean isOpenModel() {
		return this.openModel;
	}

	public boolean isCellEditorOpened() {
		return this.cellEditorOpened;
	}

	public void setCellEditorOpened(final boolean value) {
		this.cellEditorOpened = value;
	}
}
