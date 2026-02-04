/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software) - [Discovery] User feature : model opening from launch config
 *    Nicolas Guyomar (Mia-Software) - Bug 339571 - Compilation errors due to EMF Facet API cleaning
 *    Nicolas Bros (Mia-Software) - Bug 342824 - SWTException when closing the Discovery launch configuration dialog
 *    Nicolas Bros (Mia-Software) - Bug 342832 - [Discovery] Values lost when clicking anywhere in the launch config dialog
 *    Fabien Giquel (Mia-Software) - Bug 344082 - [Java Discovery] IllegalArgumentException in launch configurations
 *    Gregoire Dupe (Mia-Software) - Bug 453476 - Stop using EMF Facet's deprecated APIs
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.facet.widgets.celleditors.IListener;
import org.eclipse.modisco.facet.widgets.celleditors.core.composite.registry.ICompositeEditorFactoriesRegistry;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.data.DiscovererParameterDisplay;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.data.DiscovererParameterDisplayImpl;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay.DiscovererParametersComposite;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay.IEditingSupportListener;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay.ParametersTableComposite;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.utils.LaunchConfigUtils;
import org.eclipse.modisco.infra.discovery.ui.internal.util.LaunchModelUtils;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DiscoverersMainTab extends AbstractLaunchConfigurationTab implements DiscovererUpdate {

	private Group sourceGroup = null;
	private Group discovererKindGroup = null;
	private Combo discovererKindCombo = null;
	private Label discoverKindLabel = null;
	private Composite rootContainer = null;
	private DiscovererParametersComposite parametersContainer = null;
	private Button checkboxOpenModel = null;

	private final List<DiscovererParameterDisplay> displayParameters = new ArrayList<DiscovererParameterDisplay>();
	private boolean inCellEditorOpened;
	private boolean inoutCellEditorOpened;
	private AbstractCellEditorComposite<Object> sourceCellEditorComposite;

	/** This method initializes parametersContainer */
	private final void createDiscovererParametersContainer() {
		this.parametersContainer = new DiscovererParametersComposite(this.rootContainer, SWT.NONE);
		final ParametersTableComposite inParametersGroup = this.parametersContainer
				.getInParametersGroup();
		inParametersGroup.getEditingSupport().addListener(new IEditingSupportListener() {
			public void cellEditorOpened() {
				if (!DiscoverersMainTab.this.inCellEditorOpened) {
					DiscoverersMainTab.this.inCellEditorOpened = true;
					update();
				}
			}

			public void cellEditorClosed() {
				if (DiscoverersMainTab.this.inCellEditorOpened) {
					DiscoverersMainTab.this.inCellEditorOpened = false;
					update();
				}
			}
		});
		this.parametersContainer.getInoutParametersGroup().getEditingSupport()
				.addListener(new IEditingSupportListener() {
					public void cellEditorOpened() {
						if (!DiscoverersMainTab.this.inoutCellEditorOpened) {
							DiscoverersMainTab.this.inoutCellEditorOpened = true;
							update();
						}
					}

					public void cellEditorClosed() {
						if (DiscoverersMainTab.this.inoutCellEditorOpened) {
							DiscoverersMainTab.this.inoutCellEditorOpened = false;
							update();
						}
					}
				});
	}

	private void createOpenModelCheckbox() {
		this.checkboxOpenModel = new Button(this.rootContainer, SWT.CHECK);
		this.checkboxOpenModel.setText(Messages.DiscoverersMainTab_openModelInEditorAfterDiscovery);
		this.checkboxOpenModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				update();
			}
		});
	}

	/**
	 * This method initializes or re-initializes the source Group depending on
	 * the selected discoverer.
	 *
	 * @param discovererDescription
	 *            the selected discoverer (<code>null</code> if none)
	 */
	private final void createSourceGroup(final DiscovererDescription discoverer) {
		if (this.sourceGroup == null) {
			this.sourceGroup = new Group(this.rootContainer, SWT.NONE);
			this.sourceGroup.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
			this.sourceGroup.setText(Messages.DiscoverersMainTab_sourceElement);
			this.sourceGroup.setLayout(new GridLayout());
		}

		// remove the child controls
		for (Control child : this.sourceGroup.getChildren()) {
			child.dispose();
		}

		if (discoverer == null) {
			Text placeholder = new Text(this.sourceGroup, SWT.BORDER);
			placeholder.setEnabled(false);
			placeholder.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
		} else {
			final Class<?> sourceType = discoverer.getSourceType();
			final ICompositeEditorFactory<Object> compositeEditorFactory = (ICompositeEditorFactory<Object>) ICompositeEditorFactoriesRegistry.INSTANCE
					.getCompositeEditorFactory(sourceType);
			if (compositeEditorFactory != null) {
				this.sourceCellEditorComposite = compositeEditorFactory.createCompositeEditor(
						this.sourceGroup, SWT.BORDER);
				this.sourceCellEditorComposite.setLayoutData(new GridData(GridData.FILL,
						GridData.FILL, true, false));
				this.sourceCellEditorComposite.addChangeListener(new IListener() {
					public void handleEvent() {
						sourceChanged();
					}
				});
			} else {
				Text placeholder = new Text(this.sourceGroup, SWT.BORDER);
				placeholder.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
				placeholder.setEnabled(false);

				placeholder.setText(NLS.bind(
						Messages.DiscoverersMainTab_noCellEditorRegisteredForType, sourceType.getName()));
				placeholder.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_RED));
			}
		}
		this.sourceGroup.layout();
	}

	protected void sourceChanged() {
		// close the parameter cell editors
		this.parametersContainer.getInParametersGroup().getTableViewer().cancelEditing();
		this.parametersContainer.getInoutParametersGroup().getTableViewer().cancelEditing();

		// the source changed : since the initialValue can depend on the source,
		// initialize all parameters again
		for (DiscovererParameterDisplay parameter : this.displayParameters) {
			parameter.initialize(this.sourceCellEditorComposite.getValue());
		}
		update();
	}

	/**
	 * This method initializes discovererKindGroup
	 *
	 */
	private final void createDiscovererKindGroup() {
		GridData gridData11 = new GridData();
		gridData11.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData11.grabExcessHorizontalSpace = true;
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.grabExcessHorizontalSpace = true;
		this.discovererKindGroup = new Group(this.rootContainer, SWT.NONE);
		this.discovererKindGroup.setLayout(new GridLayout());
		this.discovererKindGroup.setLayoutData(gridData11);
		this.discovererKindGroup.setText(Messages.DiscoverersMainTab_discovererKind);
		this.discoverKindLabel = new Label(this.discovererKindGroup, SWT.NONE);
		this.discoverKindLabel.setText(Messages.DiscoverersMainTab_selectDiscoverer);
		this.discovererKindCombo = new Combo(this.discovererKindGroup, SWT.READ_ONLY);
		this.discovererKindCombo.setLayoutData(gridData1);
		this.discovererKindCombo
				.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
					@Override
					public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
						updateDiscovererParametersContainer(null);
						update();
						discovererChanged();
					}
				});
	}

	protected void discovererChanged() {
		String text = this.discovererKindCombo.getText();
		IDiscoverer<?> discoverer = IDiscoveryManager.INSTANCE.createDiscovererImpl(text);
		DiscovererDescription discovererDescription = IDiscoveryManager.INSTANCE
				.getDiscovererDescription(text);
		if (discoverer != null) {
			this.checkboxOpenModel.setEnabled(discoverer instanceof AbstractModelDiscoverer<?>);
		}
		createSourceGroup(discovererDescription);
	}

	protected final void updateDiscovererParametersContainer(
			final LaunchConfiguration configurationModel) {
		String kind = this.discovererKindCombo.getText();
		DiscovererDescription discoverer = IDiscoveryManager.INSTANCE
				.getDiscovererDescription(kind);
		this.displayParameters.clear();
		if (discoverer != null) {
			for (DiscovererParameter parameter : discoverer.getParameterDefinitions()) {
				DiscovererParameterDisplay displayParameter = new DiscovererParameterDisplayImpl(
						parameter, discoverer, this);
				if (configurationModel != null) {
					Object value = LaunchModelUtils.getDiscoveryParameterValue(configurationModel,
							parameter);
					displayParameter.setValue(value);
				} else {
					displayParameter.initialize(null);
				}
				this.displayParameters.add(displayParameter);
			}
			this.parametersContainer.updateDiscoveryParameters(this.displayParameters);
		} else {
			setErrorMessage(Messages.DiscoverersMainTab_discovererNotFound);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	public void createControl(final Composite parent) {
		this.rootContainer = new Composite(parent, SWT.NULL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		this.rootContainer.setLayout(gridLayout);
		this.rootContainer.setLayoutData(gridData);

		createDiscovererKindGroup();
		createSourceGroup(null);
		createDiscovererParametersContainer();

		createOpenModelCheckbox();

		// initialize list of discoverers kind
		initializeDiscoverersKindList();

		// set the control to be displayed in tab
		setControl(this.rootContainer);
	}

	private final void initializeDiscoverersKindList() {
		for (DiscovererDescription desc : IDiscoveryManager.INSTANCE.getDiscoverers()) {
			this.discovererKindCombo.add(desc.getId());
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return Messages.DiscoverersMainTab_discoverer;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(final ILaunchConfiguration configuration) {
		LaunchConfiguration configurationModel = LaunchConfigUtils
				.getConfigurationModel(configuration);
		DiscovererDescription discovererDescription = configurationModel.getDiscoverer();
		if (discovererDescription != null) {
			// we suppose the corresponding discover has been registered
			this.discovererKindCombo.setText(discovererDescription.getId());
			discovererChanged();
		}

		this.displayParameters.clear(); // necessary for unwanted source change events handling (344082)
		Object source = configurationModel.getSource();
		if (this.sourceCellEditorComposite != null && !this.sourceCellEditorComposite.isDisposed()) {
			this.sourceCellEditorComposite.setValue(source);
		}

		updateDiscovererParametersContainer(configurationModel);
		this.checkboxOpenModel.setSelection(configurationModel.isOpenModelAfterDiscovery());

		update();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse
	 * .debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		String kind = this.discovererKindCombo.getText();
		DiscovererDescription discoverer = IDiscoveryManager.INSTANCE
				.getDiscovererDescription(kind);

		LaunchConfiguration configurationModel = LaunchConfigUtils
				.getConfigurationModel(configuration);
		configurationModel.setDiscoverer(discoverer);

		configurationModel.getParameterValues().clear();
		if (kind.length() > 0) {
			for (DiscovererParameterDisplay parameter : this.displayParameters) {
				LaunchModelUtils.setDiscoveryParameterValue(configurationModel,
						parameter.getParameterDescription(), parameter.getValue());
			}
		}
		if (this.sourceCellEditorComposite != null && !this.sourceCellEditorComposite.isDisposed()) {
			Object value = this.sourceCellEditorComposite.getValue();
			configurationModel.setSource(value);
		}
		configurationModel.setOpenModelAfterDiscovery(this.checkboxOpenModel.getSelection());
		LaunchConfigUtils.saveConfigurationModel(configurationModel, configuration);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		// Empty
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		setMessage(null);

		try {
			if (this.discovererKindCombo.getText() == null
					|| this.discovererKindCombo.getText().length() == 0) {
				setMessage(Messages.DiscoverersMainTab_pleaseSelectDiscoverer);
				return false;
			}

			LaunchConfiguration configurationModel = LaunchConfigUtils
					.getConfigurationModel(launchConfig);
			String error = LaunchModelUtils.validate(configurationModel);
			if (error != null) {
				setErrorMessage(error);
				return false;
			}

		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

		if (this.inCellEditorOpened || this.inoutCellEditorOpened) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.modisco.infra.discoverymanager.ui.launch.DiscovererUpdate
	 * #update()
	 */
	public void update() {
		try {
			// null check : see Bug 342824 - SWTException when closing the
			// Discovery launch configuration dialog
			if (getLaunchConfigurationDialog().getTabs() != null) {
				updateLaunchConfigurationDialog();
			}
		} catch (SWTException e) {
			// error when dialog is closing
			MoDiscoLogger.logWarning(e, Activator.getDefault());
		}
	}
}
