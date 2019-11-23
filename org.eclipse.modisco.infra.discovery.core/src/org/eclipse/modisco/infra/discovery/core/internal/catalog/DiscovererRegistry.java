/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.internal.catalog;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.CatalogFactory;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.internal.Activator;
import org.osgi.framework.Bundle;

public final class DiscovererRegistry {

	/**
	 * The configuration elements, cached in order to be able to create
	 * instances through
	 * {@link IConfigurationElement#createExecutableExtension(String)}
	 */
	private Map<DiscovererDescription, IConfigurationElement> configurationElements;
	private final Map<DiscovererDescription, IDiscoverer<?>> discoverersCache = new HashMap<DiscovererDescription, IDiscoverer<?>>();
	private DiscovererCatalog discovererCatalog;
	private ResourceSet resourceSet;
	private Resource resource;

	public static final String DISCOVERER_EXTENSION_POINT = "org.eclipse.modisco.infra.discovery.core.discoverer"; //$NON-NLS-1$
	private static final String CLASS_ATT = "class"; //$NON-NLS-1$
	private static final String ID_ATT = "id"; //$NON-NLS-1$
	public static final DiscovererRegistry INSTANCE = new DiscovererRegistry();

	private DiscovererRegistry() {
		initRegisteredDiscoverers();
	}

	public IDiscoverer<?> getCachedDiscoverer(final DiscovererDescription discovererDescription) {
		return this.discoverersCache.get(discovererDescription);
	}

	public IDiscoverer<?> createDiscoverer(final DiscovererDescription discovererDescription) {
		IConfigurationElement configurationElement = this.configurationElements
				.get(discovererDescription);
		if (configurationElement == null) {
			throw new IllegalArgumentException();
		}
		try {
			Object object = configurationElement
					.createExecutableExtension(DiscovererRegistry.CLASS_ATT);
			if (object instanceof IDiscoverer<?>) {
				IDiscoverer<?> discoverer = (IDiscoverer<?>) object;
				return discoverer;
			}
			throw new IllegalStateException("Not an IDiscoverer."); //$NON-NLS-1$
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return null;
	}

	public Collection<DiscovererDescription> getDiscovererDescriptions() {
		return Collections.unmodifiableCollection(this.discovererCatalog.getInstalledDiscoverers());
	}

	public ResourceSet getResourceSet() {
		return this.resourceSet;
	}

	DiscovererCatalog getDiscovererCatalog() {
		return this.discovererCatalog;
	}

	private synchronized void initRegisteredDiscoverers() {
		this.resourceSet = new ResourceSetImpl();
		this.resource = this.resourceSet.createResource(getDiscoverersResourceURI());
		this.discovererCatalog = CatalogFactory.eINSTANCE.createDiscovererCatalog();
		this.resource.getContents().add(this.discovererCatalog);

		this.configurationElements = new HashMap<DiscovererDescription, IConfigurationElement>();

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry
				.getExtensionPoint(DiscovererRegistry.DISCOVERER_EXTENSION_POINT);

		for (IExtension extension : point.getExtensions()) {
			Bundle bundle = Platform.getBundle(extension.getContributor().getName());
			for (IConfigurationElement element : extension.getConfigurationElements()) {
				String discovererClass = element.getAttribute(DiscovererRegistry.CLASS_ATT);
				if (discovererClass != null) {
					try {
						IDiscoverer<?> discoverer = (IDiscoverer<?>) element
								.createExecutableExtension(DiscovererRegistry.CLASS_ATT);
						DiscovererDescription discoDesc = CatalogFactory.eINSTANCE
								.createDiscovererDescription();
						this.configurationElements.put(discoDesc, element);
						discoDesc.setImplementationType(discoverer.getClass());
						discoDesc.setImplementationBundle(bundle);

						String discovererId = element.getAttribute(DiscovererRegistry.ID_ATT);
						if (discovererId == null) {
							discoDesc.setId(discoverer.toString());
						} else {
							if (discovererId.indexOf(' ') > 0 || discovererId.indexOf('#') > 0
									|| discovererId.indexOf('/') > 0) {
								String alternateId = discovererId.replace(' ', '_');
								alternateId = alternateId.replace('/', '_');
								alternateId = alternateId.replace('#', '_');
								MoDiscoLogger
										.logWarning(
												"A Discoverer ID contains invalid characters : '" + discovererId + "'. '" + alternateId + "' will be used instead.", Activator.getDefault()); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
								discoDesc.setId(alternateId);
							} else {
								discoDesc.setId(discovererId);
							}
						}

						computeSourceType(discoDesc);
						DiscovererParameterUtils.getInstance().computeParameters(discoDesc);

						this.discoverersCache.put(discoDesc, discoverer);
						this.discovererCatalog.getInstalledEntries().add(discoDesc);
						this.discovererCatalog.eResource().getContents().add(discoDesc);
					} catch (CoreException e) {
						String message = "A problem occurred when instantiating discoverer configuration: " + element.getValue(); //$NON-NLS-1$
						MoDiscoLogger.logWarning(e, message, Activator.getDefault());
					}
				} else {
					String message = "A problem occurred when retrieving discoverer configuration: " + element.getValue(); //$NON-NLS-1$
					MoDiscoLogger.logWarning(message, Activator.getDefault());
				}
			}
		}

	}

	/**
	 * Computes an uri for main resource. The resource is build at runtime and
	 * does not need a serialization. However the created uri will prepare for a
	 * future serialization in workspace metadatas if needed.
	 *
	 * @return
	 */
	private static URI getDiscoverersResourceURI() {
		URI uri = URI.createURI("platform:/meta/" //$NON-NLS-1$
				+ Activator.getDefault().getBundle().getSymbolicName() + "/discoverersCatalog.xmi"); //$NON-NLS-1$
		return uri;
	}

	/**
	 * This method computes at runtime the source type argument for one
	 * discoverer implementation (generic T type)
	 *
	 */
	private static void computeSourceType(final DiscovererDescription discovererDescription) {
		Class<?> sourceType = null;
		try {
			// At runtime we look for the "isApplicableTo(T)" method to deduce
			// the instantiated T type
			for (Method aMethod : discovererDescription.getImplementationType().getMethods()) {
				if (aMethod.getName().equals("isApplicableTo") //$NON-NLS-1$
						&& aMethod.getParameterTypes().length == 1) {
					Class<?> parameterClass = aMethod.getParameterTypes()[0];
					if (sourceType == null || parameterClass != java.lang.Object.class) {
						sourceType = parameterClass;
					}
				}
			}
		} catch (IllegalArgumentException e) {
			MoDiscoLogger.logWarning(e, Activator.getDefault());
		}
		discovererDescription.setSourceType(sourceType);
	}

}
