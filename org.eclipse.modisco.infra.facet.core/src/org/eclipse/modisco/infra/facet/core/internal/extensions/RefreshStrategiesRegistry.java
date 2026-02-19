/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.modisco.infra.facet.core.internal.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.modisco.infra.common.core.internal.extensions.AbstractRegistry;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.core.extensions.RefreshStrategy;
import org.eclipse.modisco.infra.facet.core.internal.Activator;

/**
 * Registry for the "facetRefreshStrategy" extension point
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class RefreshStrategiesRegistry extends AbstractRegistry {

	private static final String EXTENSION_POINT_NAMESPACE = "org.eclipse.modisco.infra.facet.core"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAME = "facetRefreshStrategy"; //$NON-NLS-1$

	private static final String REFRESH_STRATEGY_ELEMENT = "refreshStrategy"; //$NON-NLS-1$
	private static final String CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$

	private static RefreshStrategiesRegistry instance = null;

	private final List<RefreshStrategy> strategies = new ArrayList<RefreshStrategy>();

	public static RefreshStrategiesRegistry getInstance() {
		if (RefreshStrategiesRegistry.instance == null) {
			RefreshStrategiesRegistry.instance = new RefreshStrategiesRegistry();
		}
		return RefreshStrategiesRegistry.instance;
	}

	public RefreshStrategiesRegistry() {
		initialize();
	}

	public List<RefreshStrategy> getRefreshStrategies(final Collection<Facet> facets) {
		final List<RefreshStrategy> applicableStrategies = new ArrayList<RefreshStrategy>();
		for (RefreshStrategy strategy : this.strategies) {
			for (Facet facet : facets) {
				if (strategy.isApplicableTo(facet)) {
					applicableStrategies.add(strategy);
					break;
				}
			}
		}
		return applicableStrategies;
	}

	@Override
	protected String getExtensionPointName() {
		return RefreshStrategiesRegistry.EXTENSION_POINT_NAME;
	}

	@Override
	protected String getExtensionPointNamespace() {
		return RefreshStrategiesRegistry.EXTENSION_POINT_NAMESPACE;
	}

	@Override
	protected void handleRootElement(final IConfigurationElement configurationElement) {
		final String name = configurationElement.getName();
		if (name.equalsIgnoreCase(RefreshStrategiesRegistry.REFRESH_STRATEGY_ELEMENT)) {
			readRefreshStrategyElement(configurationElement);
		} else {
			logUnknownElement(configurationElement);
		}
	}

	/** Read a 'refreshStrategy' element */
	private void readRefreshStrategyElement(final IConfigurationElement configurationElement) {

		Object refreshStrategyObject;
		try {
			refreshStrategyObject = configurationElement
					.createExecutableExtension(RefreshStrategiesRegistry.CLASS_ATTRIBUTE);
		} catch (final CoreException e) {
			Logger.logError(e, Activator.getDefault());
			return;
		}
		if (refreshStrategyObject == null) {
			logMissingAttribute(configurationElement, RefreshStrategiesRegistry.CLASS_ATTRIBUTE);
			return;
		}

		if (refreshStrategyObject instanceof RefreshStrategy) {
			RefreshStrategy refreshStrategy = (RefreshStrategy) refreshStrategyObject;
			this.strategies.add(refreshStrategy);
		} else {
			logError(configurationElement, "a class implementing RefreshStrategy is expected"); //$NON-NLS-1$
		}

	}
}
