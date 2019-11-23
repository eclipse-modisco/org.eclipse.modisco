/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.util;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.internal.catalog.DiscovererRegistry;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.LaunchFactory;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.osgi.util.NLS;

/**
 * Some Launch model utility services dedicated to UI for workspace local
 * serialization
 */
public final class LaunchModelUtils {

	public static final String DISCOVERER_LAUNCH_MODEL = "discoverer_launch_model"; //$NON-NLS-1$
	private static int nLaunchModel = 0;

	private LaunchModelUtils() {
		// utility class
	}

	public static LaunchConfiguration createLaunchConfigurationModel() {
		Resource launchResource = createLaunchResource();
		LaunchConfiguration launchConfigurationModel = LaunchFactory.eINSTANCE
				.createLaunchConfiguration();
		// open the model by default
		launchConfigurationModel.setOpenModelAfterDiscovery(true);
		launchResource.getContents().add(launchConfigurationModel);
		return launchConfigurationModel;
	}

	public static Resource createLaunchResource() {
		ResourceSet resourceSet = DiscovererRegistry.INSTANCE.getResourceSet();
		Resource launchResource = resourceSet
				.createResource(URI
						.createURI("http://eclipse.org/MoDisco/launchModel" + LaunchModelUtils.nLaunchModel++)); //$NON-NLS-1$
		return launchResource;
	}

	public static Object getDiscoveryParameterValue(final LaunchConfiguration launchConfig,
			final DiscovererParameter parameter) {
		Object value = null;
		for (ParameterValue candidate : launchConfig.getParameterValues()) {
			if (candidate.getParameter().getId().equals(parameter.getId())) {
				value = candidate.getValue();
			}
		}
		return value;
	}

	public static void setDiscoveryParameterValue(final LaunchConfiguration launchConfig,
			final DiscovererParameter parameter, final Object value) {
		ParameterValue parameterValue = null;
		for (ParameterValue candidate : launchConfig.getParameterValues()) {
			if (candidate.getParameter().getId().equals(parameter.getId())) {
				parameterValue = candidate;
			}
		}
		if (parameterValue == null) { // Not created yet
			parameterValue = LaunchFactory.eINSTANCE.createParameterValue();
			parameterValue.setParameter(parameter);
			launchConfig.getParameterValues().add(parameterValue);
		}

		parameterValue.setValue(value);
	}

	/**
	 * Validate the given {@link LaunchConfiguration}.
	 *
	 * @return <code>null</code> if OK, or a localized String indicating the
	 *         error.
	 */
	public static String validate(final LaunchConfiguration launchConfiguration) {
		DiscovererDescription discoverer = launchConfiguration.getDiscoverer();
		if (discoverer == null) {
			return org.eclipse.modisco.infra.discovery.ui.Messages.DiscoverersMainTab_discovererNotFound;
		}

		EList<DiscovererParameter> parameterDefinitions = discoverer.getParameterDefinitions();
		for (DiscovererParameter discovererParameter : parameterDefinitions) {
			if (discovererParameter.isRequiredInput()) {
				boolean hasValue = false;
				EList<ParameterValue> parameterValues = launchConfiguration.getParameterValues();
				for (ParameterValue parameterValue : parameterValues) {
					if (parameterValue.getParameter().getId().equals(discovererParameter.getId())) {
						hasValue = parameterValue.getValue() != null;
						break;
					}
				}
				if (!hasValue) {
					return NLS.bind(Messages.LaunchModelUtils_valueNotSet,
							discovererParameter.getId());
				}
			}
		}

		// TODO: the value could be further validated for each type

		Object source = launchConfiguration.getSource();
		if (source == null || source instanceof IWorkspaceRoot) {
			return Messages.LaunchModelUtils_sourceMustBeSet;
		}

		if (source instanceof IResource) {
			IResource resource = (IResource) source;
			if (!resource.exists()) {
				return Messages.LaunchModelUtils_sourceMustBeExistingResource;
			}
		}

		if (!(IDiscoveryManager.INSTANCE.isApplicable(discoverer, source))) {
			return Messages.LaunchModelUtils_discovererNotApplicableOnSource;
		}

		// OK
		return null;
	}
}
