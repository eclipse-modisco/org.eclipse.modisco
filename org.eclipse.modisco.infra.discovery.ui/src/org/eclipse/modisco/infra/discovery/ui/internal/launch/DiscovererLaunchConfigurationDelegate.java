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

package org.eclipse.modisco.infra.discovery.ui.internal.launch;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.emf.core.IBrowserRegistry;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.utils.LaunchConfigUtils;
import org.eclipse.modisco.infra.discovery.ui.internal.util.LaunchModelUtils;
import org.eclipse.osgi.util.NLS;

public class DiscovererLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.
	 * eclipse.debug.core.ILaunchConfiguration, java.lang.String,
	 * org.eclipse.debug.core.ILaunch,
	 * org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(final ILaunchConfiguration configuration, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		try {
			LaunchConfiguration configurationModel = LaunchConfigUtils
					.getConfigurationModel(configuration);
			// validate launch configuration model before execution
			String validationResult = LaunchModelUtils.validate(configurationModel);
			if (validationResult != null) {
				Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, validationResult);
				throw new CoreException(status);
			}

			String name = configurationModel.getDiscoverer().getId();
			Object source = configurationModel.getSource();
			IDiscoverer<?> discoverer = IDiscoveryManager.INSTANCE.createDiscovererImpl(name);

			// initialization of discoverer parameters
			Map<String, Object> parameters = new HashMap<String, Object>();
			EList<ParameterValue> parameterValues = configurationModel.getParameterValues();
			for (ParameterValue parameterValue : parameterValues) {
				if (parameterValue.getValue() != null) {
					parameters
							.put(parameterValue.getParameter().getId(), parameterValue.getValue());
				}
			}

			final IProgressMonitor progressMonitor;
			if (monitor != null) {
				progressMonitor = monitor;
			} else {
				progressMonitor = new NullProgressMonitor();
			}
			progressMonitor
					.beginTask(NLS.bind(
							Messages.DiscovererLaunchConfigurationDelegate_discoveringModel, name),
							IProgressMonitor.UNKNOWN);
			IDiscoveryManager.INSTANCE.discoverElement(discoverer, source, parameters,
					progressMonitor);

			if (discoverer instanceof AbstractModelDiscoverer<?>
					&& configurationModel.isOpenModelAfterDiscovery()) {
				AbstractModelDiscoverer<?> modelDiscoverer = (AbstractModelDiscoverer<?>) discoverer;
				Resource targetModel = modelDiscoverer.getTargetModel();
				// avoid null URI (it causes NPEs in EMF)
				if (targetModel.getURI() == null) {
					DiscovererDescription discovererDescription = IDiscoveryManager.INSTANCE
							.getDiscovererDescription(discoverer);
					targetModel.setURI(URI.createURI("temp:/" + discovererDescription.getId() //$NON-NLS-1$
							+ "/" + System.currentTimeMillis())); //$NON-NLS-1$
				}
				IBrowserRegistry.INSTANCE.browseResource(targetModel);
			}

		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Please, check your discoverer configuration.", e); //$NON-NLS-1$
			throw new CoreException(status);
		}
	}
}
