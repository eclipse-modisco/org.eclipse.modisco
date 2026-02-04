/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;

/**
 * @author Gregoire DUPE
 */
public class MoDiscoResourceListenerGroup {

	private final Map<IMoDiscoResourceListener, HashSet<URI>> listeners = new HashMap<IMoDiscoResourceListener, HashSet<URI>>();
	private final URI watchedResourceUri;

	public MoDiscoResourceListenerGroup(final URI watchedResourceUri) {
		this.watchedResourceUri = watchedResourceUri;
		if (MoDiscoResourceSet.DEBUG) {
			String message = this.getClass().getSimpleName()
					+ "." + this.getClass().getSimpleName() + "(): " //$NON-NLS-1$ //$NON-NLS-2$
				+ this.watchedResourceUri;
			System.out.println(message);
			// IStatus status = new Status(IStatus.INFO,
			// CommonModiscoActivator.PLUGIN_ID, message);
			// CommonModiscoActivator.getDefault().getLog().log(status);
		}
	}

	public void notifyChange() {
		if (MoDiscoResourceSet.DEBUG) {
			String message = this.getClass().getSimpleName()
					+ ".notifyChange(): " + this.watchedResourceUri //$NON-NLS-1$
					+ " nbListeners=" + this.listeners.size(); //$NON-NLS-1$
			System.out.println(message);
			// IStatus status = new Status(IStatus.INFO,
			// CommonModiscoActivator.PLUGIN_ID, message);
			// CommonModiscoActivator.getDefault().getLog().log(status);
		}
		List<Runnable> toDoList = new ArrayList<Runnable>();
		for (IMoDiscoResourceListener listener : this.listeners.keySet()) {
			final IMoDiscoResourceListener fListener = listener;
			for (URI clientUri : this.listeners.get(listener)) {
				final URI fClientURI = clientUri;
				Runnable toDo = new Runnable() {
					public void run() {
						try {
							if (MoDiscoResourceSet.DEBUG) {
								System.out
										.println(MoDiscoResourceListenerGroup.this.getClass()
												.getSimpleName()
												+ ".notifyChange(): aListenedResourceHasChanged(changed=" + MoDiscoResourceListenerGroup.this.watchedResourceUri + ", depending=" + fClientURI + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
							}
							fListener.aListenedResourceHasChanged(
									MoDiscoResourceListenerGroup.this.watchedResourceUri,
									fClientURI);
						} catch (Exception e) {
							MoDiscoLogger
									.logError(
											e,
											"An exception happened while notifying change of: " //$NON-NLS-1$
											+ MoDiscoResourceListenerGroup.this.watchedResourceUri
											+ " to: " + fListener, CommonModiscoActivator //$NON-NLS-1$
													.getDefault());
						}
					}
				};
				toDoList.add(toDo);
			}
		}
		for (Runnable toDo : toDoList) {
			toDo.run();
		}
	}

	public void addListener(final IMoDiscoResourceListener listener, final URI resourceUri) {
		HashSet<URI> list = this.listeners.get(listener);
		if (list == null) {
			list = new HashSet<URI>();
			this.listeners.put(listener, list);
		}
		list.add(resourceUri);
	}

	public void remove(final IMoDiscoResourceListener listener, final URI dependingResource) {
		HashSet<URI> uriSet = this.listeners.get(listener);
		if (uriSet != null) {
			uriSet.remove(dependingResource);
		}
	}

}
