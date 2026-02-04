/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.modisco.infra.discovery.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

/**
 * A discoverer is a process which discovers information from one input source.
 * Such a process can be parameterized through additional input data.
 *
 * <p>
 * A basic implementation is provided in {@link AbstractDiscoverer}.
 *
 * <p>
 * In the context of model-driven reverse-engineering, a common category of
 * discoverers is characterized by injecting information into a result model.
 * Class {@link AbstractModelDiscoverer} provides a basic implementation for
 * such discoverers.
 */
public interface IDiscoverer<T> {

	/**
	 * To determine if the source object can be handled by the discoverer. Each
	 * discoverer has to implement this method with its own criteria to filter
	 * the selected object.
	 *
	 * <p>
	 * Some usual implementations are proposed on {@link AbstractDiscoverer}.
	 *
	 * @param source
	 *            the selected object.
	 * @return <code>true</code> if the selected object is managed by this
	 *         discoverer, <code>false</code> otherwise.
	 */
	boolean isApplicableTo(T source);

	/**
	 * Generic method to launch a discovery from a source element.
	 *
	 * <p>
	 * Additional discovery parameters values (input or output) should be
	 * managed using fields and methods annotated with a {@link Parameter}
	 * annotation. See the class {@link AbstractDiscoverer} as an example.
	 *
	 * @param source
	 *            the selected object.
	 * @param monitor
	 *            a progress monitor used to report progress and respond to
	 *            cancellation. May be a {@link NullProgressMonitor} if no
	 *            monitor is to be used.
	 * @throws DiscoveryException
	 *             abnormal discovery process termination
	 */
	void discoverElement(T source, IProgressMonitor monitor) throws DiscoveryException;
}
