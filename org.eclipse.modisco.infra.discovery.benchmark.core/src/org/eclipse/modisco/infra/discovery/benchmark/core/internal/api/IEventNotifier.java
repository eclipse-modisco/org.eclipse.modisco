/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.api;

import java.util.List;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType;

/**
 * The event notifier interface
 * @author Guillaume Doux
 *
 */
public interface IEventNotifier {

	/**
	 * Gives the list of event type used in the notifier
	 * @return the list of event type
	 */
	public abstract List<EventType> getEventTypes();

	/**
	 * Add a listener to this notifier
	 * @param listener
	 */
	public abstract void addListener(IEventListener listener);

	/**
	 * Remove the listener of the notifier
	 * @param listener
	 */
	public abstract void removeListener(IEventListener listener);

}
