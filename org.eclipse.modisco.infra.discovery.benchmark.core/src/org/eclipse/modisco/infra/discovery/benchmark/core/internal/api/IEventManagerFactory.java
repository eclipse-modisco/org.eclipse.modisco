/*******************************************************************************
 * Copyright (c) 2011, 2019 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.api;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl.EventManagerFactory;

/**
 * Factory to create an event manager
 * @author Guillaume Doux
 *
 */
public interface IEventManagerFactory {

	/**
	 * The factory public instance
	 */
	public static IEventManagerFactory INSTANCE = new EventManagerFactory();

	/**
	 * create a new event manager
	 * @return The newlyu created event manager instance
	 */
	public IEventManager createEventManager();

}
