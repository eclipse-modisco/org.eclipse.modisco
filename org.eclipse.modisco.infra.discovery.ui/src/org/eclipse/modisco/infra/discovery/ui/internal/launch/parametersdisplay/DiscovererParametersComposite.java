/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software) - [Discovery] User feature : model opening from launch config
 */

package org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.data.DiscovererParameterDisplay;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;

public class DiscovererParametersComposite extends Composite {

	private static final class InnerParametersGroup {

		private ParametersTableComposite parametersGroup = null;
		private ExpandItem parametersItem = null;

		InnerParametersGroup() {
			// Empty
		}

		/**
		 * This method initializes inParametersGroup
		 *
		 */
		void createParametersGroup(final ExpandBar parametersBar,
				final List<DiscovererParameterDisplay> discoveryParameters, final String message,
				final boolean editable) {
			this.parametersGroup = new ParametersTableComposite(parametersBar, SWT.NONE,
					discoveryParameters, editable);
			this.parametersItem = new ExpandItem(parametersBar, SWT.NONE, 0);
			this.parametersItem.setText(message);
			this.parametersItem.setHeight(this.parametersGroup
					.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
			this.parametersItem.setControl(this.parametersGroup);
			this.parametersItem.setExpanded(!discoveryParameters.isEmpty());
		}

		void updateDisplayParameters(final List<DiscovererParameterDisplay> discoveryParameters) {
			this.parametersGroup.updateDisplayParameters(discoveryParameters);
			this.parametersItem.setHeight(this.parametersGroup
					.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
			if (discoveryParameters.size() > 0) {
				this.parametersItem.setExpanded(true);
			} else {
				this.parametersItem.setExpanded(false);
			}
		}

		public ParametersTableComposite getParametersGroup() {
			return this.parametersGroup;
		}
	}

	private Group discovererParametersGroup = null;
	private InnerParametersGroup inParametersGroup = null;
	private InnerParametersGroup inoutParametersGroup = null;
	private InnerParametersGroup outParametersGroup = null;
	private ExpandBar parametersBar = null;

	private List<DiscovererParameterDisplay> discoveryParameters;

	public DiscovererParametersComposite(final Composite parent, final int style) {
		super(parent, style);
		this.discoveryParameters = Collections.emptyList();
		initialize();
	}

	private final void initialize() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		setLayoutData(gridData);
		setLayout(gridLayout);
		createDiscovererParametersGroup();
	}

	/**
	 * This method initializes discovererParametersGroup
	 *
	 */
	private final void createDiscovererParametersGroup() {
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = GridData.FILL;
		gridData1.verticalAlignment = GridData.FILL;
		gridData1.grabExcessVerticalSpace = true;
		this.discovererParametersGroup = new Group(this, SWT.NONE);
		this.discovererParametersGroup
				.setText(Messages.DiscovererParametersComposite_DiscovererParams);
		this.discovererParametersGroup.setLayoutData(gridData1);
		this.parametersBar = new ExpandBar(this.discovererParametersGroup, SWT.V_SCROLL);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		this.parametersBar.setLayoutData(gridData);
		createOutParametersGroup();
		createInoutParametersGroup();
		createInParametersGroup();

		// set tab order
		this.parametersBar.setTabList(new Control[] { this.inParametersGroup.getParametersGroup(),
				this.inoutParametersGroup.getParametersGroup(), this.outParametersGroup.getParametersGroup() });

		this.discovererParametersGroup.setLayout(new GridLayout());
	}

	/**
	 * This method initializes inParametersGroup
	 *
	 */
	private final void createInParametersGroup() {
		this.inParametersGroup = new InnerParametersGroup();
		this.inParametersGroup.createParametersGroup(this.parametersBar,
				getInDiscoveryParameters(), Messages.DiscovererParametersComposite_inParams, true);
	}

	private final List<DiscovererParameterDisplay> getInDiscoveryParameters() {
		List<DiscovererParameterDisplay> inParameters = new ArrayList<DiscovererParameterDisplay>();
		for (DiscovererParameterDisplay parameter : this.discoveryParameters) {
			if (parameter.getParameterDescription().getDirection() == DirectionKind.IN) {
				inParameters.add(parameter);
			}
		}
		return inParameters;
	}

	/**
	 * This method initializes inoutParametersGroup
	 *
	 */
	private final void createInoutParametersGroup() {
		this.inoutParametersGroup = new InnerParametersGroup();
		this.inoutParametersGroup.createParametersGroup(this.parametersBar,
				getInDiscoveryParameters(), Messages.DiscovererParametersComposite_inoutParams,
				true);
	}

	private final List<DiscovererParameterDisplay> getInOutDiscoveryParameters() {
		List<DiscovererParameterDisplay> inoutParameters = new ArrayList<DiscovererParameterDisplay>();
		for (DiscovererParameterDisplay parameter : this.discoveryParameters) {
			if (parameter.getParameterDescription().getDirection() == DirectionKind.INOUT) {
				inoutParameters.add(parameter);
			}
		}
		return inoutParameters;
	}

	/**
	 * This method initializes outParametersGroup
	 *
	 */
	private final void createOutParametersGroup() {
		this.outParametersGroup = new InnerParametersGroup();
		this.outParametersGroup
				.createParametersGroup(this.parametersBar, getInDiscoveryParameters(),
						Messages.DiscovererParametersComposite_outParams, false);
	}

	private final List<DiscovererParameterDisplay> getOutDiscoveryParameters() {
		List<DiscovererParameterDisplay> outParameters = new ArrayList<DiscovererParameterDisplay>();
		for (DiscovererParameterDisplay parameter : this.discoveryParameters) {
			if (parameter.getParameterDescription().getDirection() == DirectionKind.OUT) {
				outParameters.add(parameter);
			}
		}
		return outParameters;
	}

	/**
	 * @param displayParameters
	 */
	public void updateDiscoveryParameters(final List<DiscovererParameterDisplay> displayParameters) {
		this.discoveryParameters = displayParameters;
		this.inParametersGroup.updateDisplayParameters(getInDiscoveryParameters());
		this.inoutParametersGroup.updateDisplayParameters(getInOutDiscoveryParameters());
		this.outParametersGroup.updateDisplayParameters(getOutDiscoveryParameters());
	}

	public ParametersTableComposite getInParametersGroup() {
		return this.inParametersGroup.getParametersGroup();
	}

	public ParametersTableComposite getInoutParametersGroup() {
		return this.inoutParametersGroup.getParametersGroup();
	}

	public ParametersTableComposite getOutParametersGroup() {
		return this.outParametersGroup.getParametersGroup();
	}

} // @jve:decl-index=0:visual-constraint="10,10"
