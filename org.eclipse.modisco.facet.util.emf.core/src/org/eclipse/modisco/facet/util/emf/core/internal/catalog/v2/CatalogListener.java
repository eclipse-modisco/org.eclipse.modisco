/*******************************************************************************
 * Copyright (c) 2015, 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *    Thomas Cicognani (Mia-Software) - Bug 483684 - NullPointerException on CatalogManager
 *    Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.internal.catalog.v2;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.emf.core.internal.Activator;


class CatalogListener implements Adapter {

/*
	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator
			.getDefault());
*/
	private final Resource resource;

	private static final Map<String, String> SAVE_OPTIONS = new HashMap<String, String>();
	static {
		final String fileEncoding = System.getProperty("file.encoding"); //$NON-NLS-1$
		SAVE_OPTIONS.put(XMLResource.OPTION_ENCODING, fileEncoding);
	}

	public CatalogListener(final Resource resource) {
		this.resource = resource;
	}

	private EObject target;

	public void notifyChanged(final Notification notification) {
		final int eventType = notification.getEventType();
		switch (eventType) {
		case Notification.SET:
			notifyChangedForSet(notification);
			break;
		case Notification.ADD:
			notifyChangedForAdd(notification);
			break;
		case Notification.ADD_MANY:
			notifyChangedForAddMany(notification);
			break;
		case Notification.REMOVE:
			notifyChangedForRemove(notification);
			break;
		case Notification.REMOVE_MANY:
			notifyChangedForRemoveMany(notification);
			break;
		default:
			break;
		}
		try {
			final URI uri = this.resource.getURI();
			final String uriStr = uri.toString();
			if (!uriStr.startsWith("tmp")) { //$NON-NLS-1$
				this.resource.save(SAVE_OPTIONS);
			}
		} catch (IOException e) {
			Logger.logError(e, Activator.getDefault());
		}
	}

	private void notifyChangedForSet(final Notification notification) {
		final Object newValue = notification.getNewValue();
		CatalogListenerFactory.adapt(newValue, this.resource);
	}

	private static void notifyChangedForRemoveMany(
			final Notification notification) {
		@SuppressWarnings("unchecked")
		/*
		 * @SuppressWarnings("unchecked") TCI> Safe cast
		 */
		final Collection<Object> oldValues = (Collection<Object>) notification
				.getOldValue();
		ifIsContainement(notification, new Runnable() {
			public void run() {
				for (Object oldValuesItem : oldValues) {
					CatalogListenerFactory.removeAdapter(oldValuesItem);
				}
			}
		});
	}

	private static void notifyChangedForRemove(final Notification notification) {
		final Object oldValue = notification.getOldValue();
		ifIsContainement(notification, new Runnable() {
			public void run() {
				CatalogListenerFactory.removeAdapter(oldValue);
			}
		});
	}

	private void notifyChangedForAddMany(final Notification notification) {
		@SuppressWarnings("unchecked")
		/*
		 * @SuppressWarnings("unchecked") TCI> Safe cast
		 */
		final Collection<Object> newValues = (Collection<Object>) notification
				.getNewValue();
		ifIsContainement(notification, new Runnable() {
			public void run() {
				for (Object newValuesItem : newValues) {
					CatalogListenerFactory.adapt(newValuesItem, 
							CatalogListener.this.getResource());
				}
			}
		});
	}

	private void notifyChangedForAdd(final Notification notification) {
		final Object newValue = notification.getNewValue();
		ifIsContainement(notification, new Runnable() {
			public void run() {
				CatalogListenerFactory.adapt(newValue, 
						CatalogListener.this.getResource());
			}
		});
	}

	protected Resource getResource() {
		return this.resource;
	}

	private static void ifIsContainement(final Notification notification,
			final Runnable runnable) {
		final Object feature = notification.getFeature();
		if (feature instanceof EReference
				&& ((EReference) feature).isContainment()) {
			runnable.run();
		}
	}

	public Notifier getTarget() {
		return this.target;
	}

	public void setTarget(final Notifier newTarget) {
		if (newTarget instanceof EObject) {
			this.target = (EObject) newTarget;
			propagate(newTarget);
		}
	}

	private void propagate(final Notifier newTarget) {
		if (newTarget instanceof EObject) {
			final EObject eObject = (EObject) newTarget;
			for (final EObject subEObject : eObject.eContents()) {
				CatalogListenerFactory.adaptResource(subEObject, this.resource);
			}
		}
	}

	public boolean isAdapterForType(final Object type) {
		return EObject.class.isInstance(type);
	}

}
