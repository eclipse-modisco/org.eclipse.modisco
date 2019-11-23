/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - refactoring for new discovery framework
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.facet.util.emf.core.IBrowserRegistry;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.dialogs.GenericParametersDialog;
import org.eclipse.modisco.infra.discovery.ui.internal.util.LaunchConfigurationUtils;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MoDiscoMenuSelectionListener implements SelectionListener {

	private final DiscovererDescription fDiscovererDesc;
	private final Object[] fSources;
	private final Shell shell;
	private final LaunchConfigurationUtils lcUtils;

	public MoDiscoMenuSelectionListener(final DiscovererDescription discoverer,
			final Object[] sourceParameter, final Shell shell) {
		this.fDiscovererDesc = discoverer;
		this.fSources = sourceParameter;
		this.shell = shell;
		this.lcUtils = new LaunchConfigurationUtils(discoverer, sourceParameter, shell);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse
	 * .swt.events.SelectionEvent)
	 */
	public void widgetDefaultSelected(final SelectionEvent e) {
		// we will not use this method
	}

	private static class ParamsDialogResult {
		private final Map<DiscovererParameter, Object> parameterValues;
		private final boolean openModel;
		private final boolean cancelled;

		public ParamsDialogResult(final Map<DiscovererParameter, Object> parameterValues,
				final boolean openModel, final boolean cancelled) {
			this.parameterValues = parameterValues;
			this.openModel = openModel;
			this.cancelled = cancelled;
		}

		public Map<DiscovererParameter, Object> getParameterValues() {
			return this.parameterValues;
		}

		public boolean isOpenModel() {
			return this.openModel;
		}

		public boolean isCancelled() {
			return this.cancelled;
		}
	}


	/**
	 * Open a dialog box to let the user enter parameter values.
	 *
	 * @param discoverer
	 * @param source
	 *
	 * @return a map of (param, value), or <code>null</code> if cancelled by the
	 *         user
	 */
	private ParamsDialogResult chooseParameters(final IDiscoverer<?> discoverer, final Object source) {
		List<DiscovererParameter> inParameters = getExpectedInputParameters(this.fDiscovererDesc);
		if (inParameters.isEmpty()) {
			return new ParamsDialogResult(new HashMap<DiscovererParameter, Object>(), true, false);
		}

		LaunchConfiguration configurationModel = lcUtils.getLaunchConfigurationModel(source);

		boolean showOpenModelCheckbox = (discoverer instanceof AbstractModelDiscoverer<?>);

		GenericParametersDialog genericParametersDialog = new GenericParametersDialog(this.shell,
				inParameters, getDiscoverer().getId(), showOpenModelCheckbox, configurationModel);
		int result = genericParametersDialog.open();
		if (result == Window.OK) {
			Object[] parameterValues = genericParametersDialog.getParameterValues();
			assert parameterValues.length == inParameters.size();
			Map<DiscovererParameter, Object> parameterValuesMap = new HashMap<DiscovererParameter, Object>();
			for (int i = 0; i < inParameters.size(); i++) {
				DiscovererParameter parameter = inParameters.get(i);
				parameterValuesMap.put(parameter, parameterValues[i]);
			}
			lcUtils.saveParameters(parameterValuesMap, genericParametersDialog.isOpenModel());
			return new ParamsDialogResult(parameterValuesMap,
					genericParametersDialog.isOpenModel(), false);
		}
		return new ParamsDialogResult(null, false, true);
	}




	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt
	 * .events.SelectionEvent)
	 */
	public void widgetSelected(final SelectionEvent event) {
		final IDiscoverer<?> discoverer = IDiscoveryManager.INSTANCE
				.createDiscovererImpl(this.fDiscovererDesc);

		final Object[] sources = this.fSources;
		for (final Object source : sources) {
			final ParamsDialogResult paramsDialogResult = chooseParameters(discoverer, source);
			if (paramsDialogResult.isCancelled()) {
				return;
			}

			String name = MoDiscoMenuSelectionListener.this.getDiscoverer().getId();
			Job job = new Job(NLS.bind(
					Messages.MoDiscoMenuSelectionListener_modiscoDiscovererJobLabel, name)) {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					monitor.beginTask(Messages.MoDiscoMenuSelectionListener_discovering,
							sources.length * 2);
					final Map<DiscovererParameter, Object> parameterValues = paramsDialogResult
							.getParameterValues();
					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}
					discovererElement(source, parameterValues, discoverer, monitor);
					monitor.worked(1);
					if (paramsDialogResult.isOpenModel()) {
						openModelEditor(discoverer);
					}
					monitor.worked(1);
					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}
					return Status.OK_STATUS;
				}
			};
			job.setPriority(Job.LONG);
			job.setUser(true);
			job.schedule();
		}
	}

	protected static void openModelEditor(final IDiscoverer<?> discoverer) {
		if (discoverer instanceof AbstractModelDiscoverer<?>) {
			AbstractModelDiscoverer<?> modelDiscoverer = (AbstractModelDiscoverer<?>) discoverer;
			Resource targetModel = modelDiscoverer.getTargetModel();
			if (targetModel != null) {
				// avoid null URI (it causes NPEs in EMF)
				if (targetModel.getURI() == null) {
					DiscovererDescription discovererDescription = IDiscoveryManager.INSTANCE
							.getDiscovererDescription(discoverer);
					targetModel.setURI(URI.createURI("temp:/" + discovererDescription.getId() //$NON-NLS-1$
							+ "/" + System.currentTimeMillis())); //$NON-NLS-1$
				}
				IBrowserRegistry.INSTANCE.browseResource(targetModel);
			}
		}
	}



	protected void discovererElement(final Object element,
			final Map<DiscovererParameter, Object> parameterValues,
			final IDiscoverer<?> discoverer, final IProgressMonitor monitor) {
		try {
			for (Entry<DiscovererParameter, Object> paramEntry : parameterValues.entrySet()) {
				DiscovererParameter parameter = paramEntry.getKey();
				Object value = paramEntry.getValue();
				if (value != null) {
					IDiscoveryManager.INSTANCE.setValue(parameter, discoverer, value);
				}
			}
			@SuppressWarnings("unchecked")
			IDiscoverer<Object> objectDiscoverer = (IDiscoverer<Object>) discoverer;
			String name;
			DiscovererDescription discovererDescription = IDiscoveryManager.INSTANCE
					.getDiscovererDescription(discoverer);
			if (discovererDescription != null) {
				name = discovererDescription.getId();
			} else {
				name = discoverer.getClass().getName();
			}
			monitor.beginTask(
					NLS.bind(Messages.MoDiscoMenuSelectionListener_discoveringModel, name),
					IProgressMonitor.UNKNOWN);
			objectDiscoverer.discoverElement(element, monitor);
		} catch (final DiscoveryException e) {
			MoDiscoLogger.logError(e, "Error in discovery", Activator.getDefault()); //$NON-NLS-1$
			// final String location;
			// StackTraceElement[] stackTrace = e.getStackTrace();
			// if (stackTrace != null && stackTrace.length > 0) {
			//				location = "\n" + Messages.MoDiscoMenuSelectionListener_in + stackTrace[0].toString(); //$NON-NLS-1$
			// } else {
			//				location = ""; //$NON-NLS-1$
			// }
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					MessageDialog.openError(
							MoDiscoMenuSelectionListener.this.shell,
							Messages.MoDiscoMenuSelectionListener_discoveryError,
							NLS.bind(Messages.MoDiscoMenuSelectionListener_errorInDiscovery,
									e.getLocalizedMessage()));
				}
			});
		}
	}

	protected DiscovererDescription getDiscoverer() {
		return this.fDiscovererDesc;
	}

	protected static List<DiscovererParameter> getExpectedInputParameters(
			final DiscovererDescription discoverer) {
		return LaunchConfigurationUtils.getExpectedInputParameters(discoverer);
	}



}
