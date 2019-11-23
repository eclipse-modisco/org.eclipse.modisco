/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.kdm.source.extension.ui.adapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.kdm.source.extension.ui.Activator;
import org.eclipse.modisco.kdm.source.extension.ui.interfaces.RevealingStrategy;
import org.eclipse.modisco.kdm.source.extension.ui.interfaces.SourceStrategy;
import org.eclipse.modisco.kdm.source.extension.ui.registry.EditorRegistry;

public class SourceAccessAdapterFactory extends AdapterFactoryImpl {

	private static List<SourceStrategy> listSourceStrategy;
	private static List<RevealingStrategy> listRevealingStrategy;

	@Override
	protected Adapter createAdapter(final Notifier target) {
		Adapter adapter = null;
		if (SourceAccessAdapterFactory.listSourceStrategy == null) {
			initializeSourceStrategy();
		}
		SourceStrategy sourceStrategy = findSourceStrategy(target);

		if (SourceAccessAdapterFactory.listRevealingStrategy == null) {
			initializeRevealingStrategy();
		}
		RevealingStrategy revealingStrategy = findRevealingStrategy(target);

		if (sourceStrategy != null && revealingStrategy != null) {
			adapter = new SourceAccessAdapter(sourceStrategy, revealingStrategy,
					target);
			associate(adapter, target);
		}
		return adapter;
	}


	/**
	 * Look for the extension point containing the registered
	 * {@link SourceStrategy} extension
	 *
	 * @return
	 */
	protected static void initializeSourceStrategy() {

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extPointStrategySource = registry
				.getExtensionPoint(EditorRegistry.EXTENSION_POINT_STRATEGY_SOURCE_ID);

		for (IExtension ext : extPointStrategySource.getExtensions()) {
			for (IConfigurationElement configElt : ext
					.getConfigurationElements()) {

				String strategyResolutionClass = configElt
						.getAttribute(EditorRegistry.CLASS);
				String metamodelUri = configElt
						.getAttribute(EditorRegistry.METAMODEL);
				if (strategyResolutionClass != null && metamodelUri != null) {
					try {
						SourceStrategy sourceStrategy = (SourceStrategy) configElt
								.createExecutableExtension(EditorRegistry.CLASS);
						// Add the sourceStrategy to the list
						addSourceStrategy(sourceStrategy);

					} catch (CoreException e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				} else {
					MoDiscoLogger.logError("Metamodel or class in extension: " //$NON-NLS-1$
							+ ext.getNamespaceIdentifier() + " is null", //$NON-NLS-1$
							Activator.getDefault());
				}
			}
		}
	}

	/**
	 * Look for the extension point containing the registered
	 * {@link RevealingStrategy} extension
	 *
	 * @return
	 */
	protected static void initializeRevealingStrategy() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extPointStrategyRevealing = registry
				.getExtensionPoint(EditorRegistry.EXTENSION_POINT_STRATEGY_REVEALING_ID);

		for (IExtension ext : extPointStrategyRevealing.getExtensions()) {
			for (IConfigurationElement configElt : ext
					.getConfigurationElements()) {
				String strategyOpeningClass = configElt
						.getAttribute(EditorRegistry.CLASS);

				if (strategyOpeningClass != null) {
					try {
						RevealingStrategy revealingStrategy = (RevealingStrategy) configElt
								.createExecutableExtension(EditorRegistry.CLASS);
						// Add the revealing strategy to the list
						addRevealingSrategy(revealingStrategy);
					} catch (CoreException e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}
			}
		}
	}


	private static RevealingStrategy findRevealingStrategy(final Notifier target) {
		for (RevealingStrategy revealingStrategy : getRevealingStrategies()) {
			if (revealingStrategy.isApplicableTo(target)) {
				return revealingStrategy;
			}
		}
		return null;
	}

	private static SourceStrategy findSourceStrategy(final Notifier target) {
		for (SourceStrategy srcStrategy : getSourceStrategies()) {
			if (srcStrategy.isApplicableTo(target)) {
				return srcStrategy;
			}
		}
		return null;
	}

	/**
	 * @return the listSourceStrategy
	 */
	private static List<SourceStrategy> getSourceStrategies() {
		if (SourceAccessAdapterFactory.listSourceStrategy == null) {
			SourceAccessAdapterFactory.listSourceStrategy = new ArrayList<SourceStrategy>();
		}
		return SourceAccessAdapterFactory.listSourceStrategy;
	}

	private static void addSourceStrategy(final SourceStrategy sourceStrategy) {
		if (!getSourceStrategies().contains(sourceStrategy)) {
			getSourceStrategies().add(sourceStrategy);
		}
	}

	private static void addRevealingSrategy(final RevealingStrategy revealingStrategy) {
		if (!getRevealingStrategies().contains(revealingStrategy)) {
			getRevealingStrategies().add(revealingStrategy);
		}
	}

	/**
	 * @return the listRevealingStrategy
	 */
	private static List<RevealingStrategy> getRevealingStrategies() {
		if (SourceAccessAdapterFactory.listRevealingStrategy == null) {
			SourceAccessAdapterFactory.listRevealingStrategy = new ArrayList<RevealingStrategy>();
		}
		return SourceAccessAdapterFactory.listRevealingStrategy;
	}

}
