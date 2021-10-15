/*******************************************************************************
 * Copyright (c) 2012, 2019 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.ui.util;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererListFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.LaunchFactory;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;
import org.eclipse.modisco.infra.discovery.ui.internal.dialogs.GenericParametersDialog;
import org.eclipse.modisco.infra.discovery.ui.internal.util.LaunchConfigurationUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;

/**
 * class implementing the cell editor for selecting the list of discoverers to bench
 * @author Guillaume Doux
 *
 */


public class DiscovererListComposite extends AbstractCellEditorComposite<IDiscovererList> {

	/** the control that is used to edit the contents of the cell */
	private final Button button;
	private Text text = null;

	private IDiscovererList discoverers  = null;

	private final Composite parentControl;

	public DiscovererListComposite(final Composite parent) {
		this(parent, SWT.NONE);
	}

	public DiscovererListComposite(final Composite parent, final int style) {
		super(parent);
		this.parentControl = parent;

		GridLayout gd = new GridLayout(2, false);
		gd.marginHeight = 0;
		gd.marginWidth = 0;
		gd.horizontalSpacing = 0;
		setLayout(gd);

		this.text = new Text(this, style);
		this.text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		this.button = new Button(this, SWT.PUSH);
		this.button.setText("..."); //$NON-NLS-1$
		GridData data = new GridData(SWT.FILL, SWT.FILL, false, true);
		this.button.setLayoutData(data);

		this.button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				browseResource();
			}
		});

		// commit the cell editor when the mouse is clicked
		// anywhere outside the text field
		final Listener clickListener = new Listener() {
			public void handleEvent(final Event event) {
				if (event.widget instanceof Control) {
					Control control = (Control) event.widget;
					if (control.getShell() == getParentControl().getShell()) {
						if (event.widget != getButton() && event.widget != getText()) {
							fireCommit();
						}
					}
				}
			}
		};
		Display.getDefault().addFilter(SWT.MouseDown, clickListener);

		// this listener is only here to remove
		// the other listener from the Display
		this.text.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(final DisposeEvent e) {
				Display.getDefault().removeFilter(SWT.MouseDown, clickListener);
			}
		});

		this.text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent event) {
				// Enter key pressed
				if ((event.keyCode == SWT.CR && event.stateMask == 0)
						|| (event.keyCode == SWT.KEYPAD_CR && event.stateMask == 0)) {
					fireCommit();
				} else if (event.keyCode == SWT.ESC && event.stateMask == 0) {
					// Escape key pressed
					close();
				}
			}
		});

		this.text.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				fireChanged();
			}
		});

		this.text.forceFocus();
	}

	protected Button getButton() {
		return this.button;
	}

	protected Text getText() {
		return this.text;
	}

	protected void commit() {
		fireCommit();
	}

	protected Composite getParentControl() {
		return this.parentControl;
	}

	public IDiscovererList getValue() {
		return this.discoverers;
	}


	protected void browseResource() {
		final WorkbenchContentProvider discovererContentProvider = new WorkbenchContentProvider() {
			@Override
			public Object[] getChildren(final Object element) {
				if (IDiscoveryManager.INSTANCE.getDiscoverers().size() == 0) {
					return new Object[0];
				}
				List<String> discovererIds = new LinkedList<String>();
				for (DiscovererDescription discoDesc : IDiscoveryManager.INSTANCE.getDiscoverers()) {
					discovererIds.add(discoDesc.getId());
				}
				return discovererIds.toArray();
			}
		};

		final LabelProvider discovererLabelProvider = new LabelProvider() {

			@Override
			public String getText(final Object element) {
				return (String) element;
			}

		};
		//		// TODO: externalize string
		final ListSelectionDialog dialog = new ListSelectionDialog(getShell(), IDiscoveryManager.INSTANCE.getDiscoverers(), discovererContentProvider, discovererLabelProvider, "Please select one or more discoverers");
		//		// TODO: externalize string
		dialog.setTitle("Select Discoverers"); //$NON-NLS-1$
		final int code = dialog.open();
		if (code == Window.OK) {
			Object[] result = dialog.getResult();
			if (result.length > 0) {
				IDiscovererList selectedDiscoverers = IDiscovererListFactory.INSTANCE.createDiscovererList();
				for (Object name : result) {
					//Here we create a temporary Discovery element
					AbstractModelDiscoverer<IProject> discoverer = (AbstractModelDiscoverer<IProject>) IDiscoveryManager.INSTANCE.createDiscovererImpl((String) name);
					Discovery disco = BenchmarkFactory.eINSTANCE.createDiscovery();
					disco.setDiscovererId((String) name);
					DiscovererDescription discovererDescription = IDiscoveryManager.INSTANCE.getDiscovererDescription((String) name);
					if (discovererDescription != null) {
						disco.setDiscovererClassName(discovererDescription.getImplementationType().getCanonicalName());
						disco.setCopyOfDiscovererDescription(discovererDescription);
					}
					LaunchConfigurationUtils lcu = new LaunchConfigurationUtils(discovererDescription, null, this.getShell());
					List<DiscovererParameter> inParameters = lcu.getExpectedInputParameters(discovererDescription);
					if (!inParameters.isEmpty()) {
						LaunchConfiguration configuration = LaunchFactory.eINSTANCE.createLaunchConfiguration();
						configuration.setOpenModelAfterDiscovery(false);
						boolean showOpenModelCheckbox = (discoverer instanceof AbstractModelDiscoverer<?>);
						GenericParametersDialog genericParametersDialog = new GenericParametersDialog(this.getShell(),
								inParameters, discovererDescription.getId(), showOpenModelCheckbox, configuration);
						int res = genericParametersDialog.open();
						if (res == Window.OK) {
							Object[] parameterValues = genericParametersDialog.getParameterValues();
							assert parameterValues.length == inParameters.size();
							for (int i = 0; i < inParameters.size(); i++) {
								DiscovererParameter parameter = inParameters.get(i);
								ParameterValue pvalue = LaunchFactory.eINSTANCE.createParameterValue();
								pvalue.setParameter(parameter);
								pvalue.setValue(parameterValues[i]);
								configuration.getParameterValues().add(pvalue);
							}
						}
						disco.setDiscovererLaunchConfiguration(configuration);
					}
					selectedDiscoverers.add(disco);
				}
				setValue(selectedDiscoverers);
				fireCommit();
			}
		}
	}


	public void setValue(final IDiscovererList value) {
		if (value != null) {
			this.discoverers = value;
			if (this.discoverers.size() == 1) {
				this.text.setText(this.discoverers.get(0).getDiscovererId());
			} else {
				if (this.discoverers.size() > 1) {
					this.text.setText("\"" + this.discoverers.get(0).getDiscovererId() + "\" and " + (this.discoverers.size() - 1) + " more ...");
				} else {
					this.text.setText("");
				}
			}
		}
	}

}
