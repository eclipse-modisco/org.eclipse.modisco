/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.api;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;

/**
 * IEvent manager interface, used to manage the listener and teh events
 * @author Guillaume Doux
 *
 */
public interface IEventManager {

	/**
	 * Add the listener in parameter to the EventManager
	 * @param listener
	 */
	public void addListener(IEventListener listener);

	/**
	 * Remove the listener in parameter from the EventManager
	 * @param listener
	 */
	public void removeListener(IEventListener listener);

	/**
	 * Notify an event to the listeners
	 * @param event
	 */
	public void notifyEvent(Event event);

}
