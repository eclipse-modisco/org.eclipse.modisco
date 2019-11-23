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
package org.eclipse.modisco.infra.discovery.core;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.core.internal.DiscoveryManager;

public interface IDiscoveryManager {

	public static IDiscoveryManager INSTANCE = new DiscoveryManager();

	/**
	 * This method creates a new {@link IDiscoverer} from the
	 * {@link DiscovererDescription} with the given <code>id</code>.
	 *
	 * @return the created {@link IDiscoverer} or <code>null</code> if no
	 *         {@link DiscovererDescription} was registered with the given
	 *         <code>id</code>.
	 */
	IDiscoverer<?> createDiscovererImpl(String id);

	/**
	 * This method creates a new {@link IDiscoverer} from the given
	 * {@link DiscovererDescription}.
	 *
	 * @return the created {@link IDiscoverer} or <code>null</code> if it
	 *         couldn't be created..
	 */
	IDiscoverer<?> createDiscovererImpl(DiscovererDescription description);

	/**
	 * This method returns a collection of {@link IDiscoverer} instances which
	 * accept the "source" parameter value as a discovery source. This method
	 * basically relies on the
	 * {@link #isApplicable(DiscovererDescription, Object)} service.
	 *
	 * The resulting collection is unmodifiable.
	 */
	Collection<DiscovererDescription> getApplicableDiscoverers(Object source);

	/**
	 * This method indicates if the discoverer associated to the given
	 * {@link DiscovererDescription} instance accepts the "source" parameter
	 * value as a discovery source.
	 */
	boolean isApplicable(DiscovererDescription discovererDefinition, Object source);

	/**
	 * This method returns all existing instances of registered
	 * {@link DiscovererDescription}s.
	 *
	 * The returned collection is unmodifiable.
	 */
	Collection<DiscovererDescription> getDiscoverers();

	/**
	 * This method returns the {@link DiscovererDescription} instance for the
	 * given discoverer id.
	 */
	DiscovererDescription getDiscovererDescription(String id);

	/**
	 * This method returns the {@link DiscovererDescription} instance for the
	 * given {@link Discoverer<?>} instance.
	 */
	DiscovererDescription getDiscovererDescription(IDiscoverer<?> discoverer);

	/**
	 * This method indicates if a parameter value can be retrieved from one
	 * discoverer (thanks to one public field or public getter method).
	 */
	boolean canRetrieveValue(DiscovererParameter parameter);

	/**
	 * Retrieve a parameter value for a {@link Discoverer<?>} using the Java
	 * reflective API.
	 *
	 * @param parameter
	 *            the parameter whose value to get
	 * @param discoverer
	 *            the discoverer on which to parameter is set
	 * @return the value of the parameter
	 * @throws DiscoveryException
	 */
	Object getValue(DiscovererParameter parameter, IDiscoverer<?> discoverer)
			throws DiscoveryException;

	/**
	 * Set a parameter value for a {@link Discoverer<?>} using the Java
	 * reflective API.
	 *
	 * @param parameter
	 *            the parameter to set
	 * @param discoverer
	 *            the discoverer on which to set the parameter
	 * @param parameterValue
	 *            the value to set the parameter to
	 * @throws DiscoveryException
	 */
	void setValue(DiscovererParameter parameter, IDiscoverer<?> discoverer, Object parameterValue)
			throws DiscoveryException;

	/**
	 * Launch a discovery for a {@link IDiscoverer discoverer} using the Java
	 * reflective API.
	 * <p>
	 * This method should be called from a {@link Job}, in order to avoid
	 * freezing the UI and provide progress and cancellation.
	 *
	 * @param discoverer
	 *            the discoverer to launch
	 * @param source
	 *            the input of the discovery (file, project, etc.)
	 * @param parametersValues
	 *            values for the discoverer's parameters
	 * @param monitor
	 *            a progress monitor used to report progress and respond to
	 *            cancellation. May be a {@link NullProgressMonitor} if no
	 *            monitor is to be used.
	 * @throws DiscoveryException
	 */
	void discoverElement(IDiscoverer<?> discoverer, Object source,
			Map<String, Object> parametersValues, IProgressMonitor monitor)
			throws DiscoveryException;

	/**
	 * Whether an initial value is specified for the given parameter
	 *
	 * @param parameter
	 *            the parameter
	 * @param discoverer
	 *            the discoverer in which the parameter is defined
	 * @return whether an initial value was specified for the parameter in the
	 *         discoverer
	 */
	boolean hasInitialValue(DiscovererParameter parameter, DiscovererDescription discoverer);

	/**
	 * Returns the initial value for the given parameter, or <code>null</code>
	 * if none.
	 *
	 * @param parameter
	 *            the parameter
	 * @param discoverer
	 *            the discoverer in which the parameter is defined
	 * @param source
	 *            the element the discovery is applied on
	 * @return the initial value for the given parameter, or <code>null</code>
	 *         if none
	 * @throws DiscoveryException
	 */
	Object getInitialValue(DiscovererParameter parameter, DiscovererDescription discoverer,
			Object source) throws DiscoveryException;
}