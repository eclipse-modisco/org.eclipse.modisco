/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 338702 - [Discovery] specify initial value for Parameters
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.core.internal.catalog.DiscovererRegistry;

/**
 * Registry for accessing {@link IDiscoverer} instances.
 *
 */
public final class DiscoveryManager implements IDiscoveryManager {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * getDiscoverer(java.lang.String)
	 */
	public IDiscoverer<?> createDiscovererImpl(final String id) {
		DiscovererDescription discovererDescription = getDiscovererDescription(id);
		if (discovererDescription != null) {
			return createDiscovererImpl(discovererDescription);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * getDiscoverer
	 * (org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription)
	 */
	public IDiscoverer<?> createDiscovererImpl(final DiscovererDescription description) {
		return DiscovererRegistry.INSTANCE.createDiscoverer(description);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * getApplicableDiscoverers(java.lang.Object)
	 */
	public Collection<DiscovererDescription> getApplicableDiscoverers(final Object source) {
		Set<DiscovererDescription> result = new HashSet<DiscovererDescription>();
		for (DiscovererDescription aDiscoveryHandler : getDiscoverers()) {
			if (isApplicable(aDiscoveryHandler, source)) {
				result.add(aDiscoveryHandler);
			}
		}
		return Collections.unmodifiableSet(result);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * isApplicable
	 * (org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription,
	 * java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public boolean isApplicable(final DiscovererDescription discovererDefinition,
			final Object source) {
		// We must check the parameterized source type (T) of delegate
		// before calling isApplicableTo to avoid ClassCastException (case of
		// wildcard declarations)
		Class<?> discovererSourceType = discovererDefinition.getSourceType();
		// used a cached discoverer to avoid having to create a new instance
		// each time this method is called
		IDiscoverer<?> cachedDiscoverer = DiscovererRegistry.INSTANCE
				.getCachedDiscoverer(discovererDefinition);

		return discovererSourceType != null && discovererSourceType.isInstance(source)
				&& ((IDiscoverer<Object>) cachedDiscoverer).isApplicableTo(source);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * getDiscoverers()
	 */
	public Collection<DiscovererDescription> getDiscoverers() {
		return DiscovererRegistry.INSTANCE.getDiscovererDescriptions();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * getDiscovererDescription(java.lang.Class)
	 */
	public static DiscovererDescription getDiscovererDescription(final Class<?> discovererClass) {
		Collection<DiscovererDescription> discovererDescriptions = DiscovererRegistry.INSTANCE
				.getDiscovererDescriptions();
		for (DiscovererDescription discovererDescription : discovererDescriptions) {
			if (discovererClass.equals(discovererDescription.getImplementationType())) {
				return discovererDescription;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * getDiscovererDescription(java.lang.String)
	 */
	public DiscovererDescription getDiscovererDescription(final String id) {
		for (DiscovererDescription discovererDescription : getDiscoverers()) {
			if (id.equals(discovererDescription.getId())) {
				return discovererDescription;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * getDiscovererDescription
	 * (org.eclipse.modisco.infra.discovery.core.IDiscoverer)
	 */
	public DiscovererDescription getDiscovererDescription(final IDiscoverer<?> discoverer) {
		for (DiscovererDescription discovererDescription : getDiscoverers()) {
			if (discovererDescription.getImplementationType().equals(discoverer.getClass())) {
				return discovererDescription;
			}
			// IDiscoverer<?> cachedDiscoverer = DiscovererRegistry.INSTANCE
			// .getCachedDiscoverer(discovererDescription);
			// if (cachedDiscoverer.getClass().equals(discoverer.getClass())) {
			// return discovererDescription;
			// }
		}
		return null;
	}

	/**
	 * This method computes at runtime the source type argument for one
	 * discoverer implementation (generic T type)
	 */
	protected static void computeSourceType(final DiscovererDescription discovererDescription) {
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

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * canRetrieveValue
	 * (org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter)
	 */
	public boolean canRetrieveValue(final DiscovererParameter parameter) {
		boolean result = parameter.getField() != null
				&& Modifier.isPublic(parameter.getField().getModifiers());
		result = result
				|| (parameter.getGetter() != null && Modifier.isPublic(parameter.getGetter()
						.getModifiers()));

		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#getValue
	 * (org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter,
	 * org.eclipse.modisco.infra.discovery.core.IDiscoverer)
	 */
	public Object getValue(final DiscovererParameter parameter, final IDiscoverer<?> discoverer)
			throws DiscoveryException {
		Object parameterValue = null;
		try {
			if (parameter.getField() != null
					&& Modifier.isPublic(parameter.getField().getModifiers())) {
				parameterValue = parameter.getField().get(discoverer);
			} else if (parameter.getGetter() != null
					&& Modifier.isPublic(parameter.getGetter().getModifiers())) {
				parameterValue = parameter.getGetter().invoke(discoverer);
			} else {
				throw new DiscoveryException(discoverer.getClass()
						+ " discoverer does not implement public read access to the parameter " //$NON-NLS-1$
						+ parameter.getId());
			}
		} catch (IllegalArgumentException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId(), e);
		} catch (IllegalAccessException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId(), e);
		} catch (InvocationTargetException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId(), e);
		}

		return parameterValue;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#setValue
	 * (org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter,
	 * org.eclipse.modisco.infra.discovery.core.IDiscoverer, java.lang.Object)
	 */
	public void setValue(final DiscovererParameter parameter, final IDiscoverer<?> discoverer,
			final Object parameterValue) throws DiscoveryException {
		try {
			if (parameter.getField() != null
					&& Modifier.isPublic(parameter.getField().getModifiers())) {
				parameter.getField().set(discoverer, parameterValue);
			} else if (parameter.getSetter() != null
					&& Modifier.isPublic(parameter.getSetter().getModifiers())) {
				parameter.getSetter().invoke(discoverer, parameterValue);
			} else {
				throw new DiscoveryException(discoverer.getClass()
						+ " discoverer does not implement public write access to the parameter " //$NON-NLS-1$
						+ parameter.getId());
			}
		} catch (IllegalArgumentException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId() + " : " + parameterValue, e); //$NON-NLS-1$
		} catch (IllegalAccessException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId() + " : " + parameterValue, e); //$NON-NLS-1$
		} catch (InvocationTargetException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId() + " : " + parameterValue, e); //$NON-NLS-1$
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#
	 * discoverElement(org.eclipse.modisco.infra.discovery.core.IDiscoverer,
	 * java.lang.Object, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	public void discoverElement(final IDiscoverer<?> discoverer, final Object source,
			final Map<String, Object> parametersValues, final IProgressMonitor monitor)
			throws DiscoveryException {
		DiscovererDescription discoDesc = getDiscovererDescription(discoverer);

		// affect parameters input values
		for (Map.Entry<String, Object> entry : parametersValues.entrySet()) {
			DiscovererParameter parameter = discoDesc.getParameterDefinition(entry.getKey());
			if (parameter == null) {
				throw new DiscoveryException("Illegal parameter name : " + entry.getKey() //$NON-NLS-1$
						+ " for discoverer : " + discoDesc.getId()); //$NON-NLS-1$
			}
			setValue(parameter, discoverer, entry.getValue());
		}

		final IProgressMonitor progressMonitor;
		if (monitor != null) {
			progressMonitor = monitor;
		} else {
			progressMonitor = new NullProgressMonitor();
		}
		// launch discovery
		((IDiscoverer<Object>) discoverer).discoverElement(source, progressMonitor);

		// give output values
		for (DiscovererParameter parameter : discoDesc.getParameterDefinitions()) {
			if (parameter.getDirection().equals(DirectionKind.OUT)
					|| parameter.getDirection().equals(DirectionKind.INOUT)) {
				parametersValues.put(parameter.getId(), getValue(parameter, discoverer));
			}
		}
	}

	public boolean hasInitialValue(final DiscovererParameter parameter,
			final DiscovererDescription discoverer) {
		return parameter.getInitializer() != null
				&& Modifier.isPublic(parameter.getInitializer().getModifiers());
	}

	public Object getInitialValue(final DiscovererParameter parameter,
			final DiscovererDescription discoverer, final Object source) throws DiscoveryException {
		Object parameterValue = null;
		try {
			if (parameter.getInitializer() != null) {
				if (Modifier.isPublic(parameter.getInitializer().getModifiers())) {
					IDiscoverer<?> cachedDiscoverer = DiscovererRegistry.INSTANCE
							.getCachedDiscoverer(discoverer);
					parameterValue = parameter.getInitializer().invoke(cachedDiscoverer, source);
				} else {
					throw new DiscoveryException(
							discoverer.getClass()
									+ " discoverer does not implement public read access to the parameter initializer " //$NON-NLS-1$
									+ parameter.getId());
				}
			} else {
				return null;
			}
		} catch (IllegalArgumentException e) {
			throw new DiscoveryException("Illegal parameter initializer for " //$NON-NLS-1$
					+ parameter.getId(), e);
		} catch (IllegalAccessException e) {
			throw new DiscoveryException("Illegal parameter initializer for " //$NON-NLS-1$
					+ parameter.getId(), e);
		} catch (InvocationTargetException e) {
			throw new DiscoveryException("Illegal parameter initializer for " //$NON-NLS-1$
					+ parameter.getId(), e);
		}
		return parameterValue;
	}
}
