/*******************************************************************************
 * Copyright (c) 2012, 2019 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IEventListener;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IEventManager;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IEventManagerFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType;

/**
 * the event manager
 * @see IEventManager
 * @author Guillaume Doux
 *
 */
public class EventManager implements IEventManager {

	private List<IEventListener> eventListeners;

	/**
	 * Setter for the event listener list
	 * @param eventListeners
	 */
	public void setEventListeners(final List<IEventListener> eventListeners) {
		this.eventListeners = eventListeners;
	}

	/**
	 * Getter for the event listener list
	 * @return the list of listeners
	 */
	public List<IEventListener> getEventListeners() {
		return this.eventListeners;
	}

	/**
	 * Constructor, not intended to be used directly --> use the factory {@link IEventManagerFactory#createEventManager()}
	 */
	protected EventManager() {
		this.eventListeners = new ArrayList<IEventListener>();
	}

	/**
	 * @see IEventManager#addListener(IEventListener)
	 * @param eventListeners
	 */
	public void addListener(final IEventListener listener) {
		if (!this.eventListeners.contains(listener)) {
			this.eventListeners.add(listener);
		}
	}

	/**
	 * @see IEventManager#removeListener(IEventListener)
	 * @param eventListeners
	 */
	public void removeListener(final IEventListener listener) {
			this.eventListeners.remove(listener);
	}

	/**
	 * @see IEventManager#notifyEvent(EventType)
	 * @param eventListeners
	 */
	public void notifyEvent(final Event event) {
		for (IEventListener listener : this.eventListeners) {
			listener.notifyEvent(event);
		}
	}

}
