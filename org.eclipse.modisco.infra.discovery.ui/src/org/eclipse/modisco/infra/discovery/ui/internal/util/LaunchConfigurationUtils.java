package org.eclipse.modisco.infra.discovery.ui.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.core.internal.catalog.DiscovererRegistry;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.LaunchFactory;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.swt.widgets.Shell;

public class LaunchConfigurationUtils {


	private final DiscovererDescription fDiscovererDesc;
	private final Object[] fSources;
	private final Shell shell;

	public LaunchConfigurationUtils(final DiscovererDescription discoverer, final Object[] sourceParameter,
			final Shell shell) {
		this.fDiscovererDesc = discoverer;
		this.fSources = sourceParameter;
		this.shell = shell;
	}


	public void saveParameters(final Map<DiscovererParameter, Object> parameterValuesMap,
			final boolean openModel) {
		if (this.fSources.length != 1) {
			return;
		}
		Object source = this.fSources[0];
		LaunchConfiguration launchConfiguration = getLaunchConfigurationModel(source);
		IResource iResource = getIResourceFromSource(source);
		if (iResource == null) {
			return;
		}

		launchConfiguration.setDiscoverer(this.fDiscovererDesc);
		launchConfiguration.setSource(iResource);
		launchConfiguration.setOpenModelAfterDiscovery(openModel);
		launchConfiguration.getParameterValues().clear();
		for (Entry<DiscovererParameter, Object> entry : parameterValuesMap.entrySet()) {
			ParameterValue parameterValue = LaunchFactory.eINSTANCE.createParameterValue();
			parameterValue.setParameter(entry.getKey());
			parameterValue.setValue(entry.getValue());
			launchConfiguration.getParameterValues().add(parameterValue);
		}
		try {
			launchConfiguration.eResource().save(Collections.emptyMap());
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	public LaunchConfiguration getLaunchConfigurationModel(final Object source) {
		if (this.fDiscovererDesc == null || this.fDiscovererDesc.getId() == null) {
			return null;
		}
		IResource iresource = getIResourceFromSource(source);

		IPath stateLocation = Activator.getDefault().getStateLocation();
		IPath launchParametersFile = stateLocation.append("launchParameters"); //$NON-NLS-1$
		ResourceSet resourceSet = new ResourceSetImpl();
		URI resourceURI = URI.createFileURI(launchParametersFile.toOSString());
		Resource resource;
		if (new File(launchParametersFile.toOSString()).exists()) {
			resource = resourceSet.getResource(resourceURI, true);
		} else {
			resource = resourceSet.createResource(resourceURI);
		}
		// must be in the registry's ResourceSet in order to resolve proxies
		EList<Resource> registryResources = DiscovererRegistry.INSTANCE.getResourceSet()
				.getResources();
		if (!registryResources.contains(resource)) {
			registryResources.add(resource);
		}

		if (iresource != null) {
			EList<EObject> contents = resource.getContents();
			// try to find an existing LaunchConfiguration for the
			// couple (discoverer, source)
			for (EObject eObject : contents) {
				if (eObject instanceof LaunchConfiguration) {
					LaunchConfiguration launchConfiguration = (LaunchConfiguration) eObject;
					DiscovererDescription discoverer = launchConfiguration.getDiscoverer();
					if (discoverer != null) {
						String discovererID = discoverer.getId();
						if (this.fDiscovererDesc.getId() == discovererID) {
							if (iresource.equals(launchConfiguration.getSource())) {
								return launchConfiguration;
							}
						}
					}
				} else {
					MoDiscoLogger.logError("expected " + LaunchConfiguration.class.getSimpleName(), //$NON-NLS-1$
							Activator.getDefault());
				}
			}
		}
		// not found => create a new one
		LaunchConfiguration launchConfiguration = LaunchFactory.eINSTANCE
				.createLaunchConfiguration();
		launchConfiguration.setOpenModelAfterDiscovery(true);
		resource.getContents().add(launchConfiguration);

		// initialize parameters that have default values
		EList<DiscovererParameter> parameters = this.fDiscovererDesc.getParameterDefinitions();
		for (DiscovererParameter parameter : parameters) {
			if (IDiscoveryManager.INSTANCE.hasInitialValue(parameter, this.fDiscovererDesc)) {
				Object initialValue;
				try {
					initialValue = IDiscoveryManager.INSTANCE.getInitialValue(parameter,
							this.fDiscovererDesc, source);
					ParameterValue parameterValue = LaunchFactory.eINSTANCE.createParameterValue();
					parameterValue.setParameter(parameter);
					parameterValue.setValue(initialValue);
					launchConfiguration.getParameterValues().add(parameterValue);
				} catch (DiscoveryException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
		}

		return launchConfiguration;

	}

	public static IResource getIResourceFromSource(final Object source) {
		IResource iresource = null;
		if (source instanceof IResource) {
			iresource = (IResource) source;
		} else {
			iresource = (IResource) Platform.getAdapterManager()
					.getAdapter(source, IResource.class);
		}
		if (iresource == null) {
			return null;
		}
		return iresource;
	}

	public static List<DiscovererParameter> getExpectedInputParameters(
			final DiscovererDescription discoverer) {
		List<DiscovererParameter> inParameters = new ArrayList<DiscovererParameter>();
		Collection<DiscovererParameter> params = discoverer.getParameterDefinitions();
		for (DiscovererParameter param : params) {
			if (param.getDirection() == DirectionKind.IN
					|| param.getDirection() == DirectionKind.INOUT) {
				inParameters.add(param);
			}
		}
		return inParameters;
	}

	public DiscovererDescription getDiscoverer() {
		return this.fDiscovererDesc;
	}

}
