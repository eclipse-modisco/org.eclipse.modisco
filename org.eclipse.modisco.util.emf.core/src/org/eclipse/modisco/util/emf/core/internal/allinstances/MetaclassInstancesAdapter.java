/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 308234 - NPE with Facet when saving
 *     Nicolas Bros (Mia-Software) - Bug 307999 - [Facet] Not real time update face
 *     Nicolas Bros (Mia-Software) - Bug 327633 - [Model Browser] avoid blocking the UI
 *     Fabien Giquel (Mia-Software) - Bug 336903 - [Model Browser] : metaclasses cache issue with some model update events
 *     Nicolas Bros (Mia-Software) -  Bug 339930 - Anticipate UI freeze : MoDisco project & externalize Strings
 *     Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *     Fabien Giquel (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/
package org.eclipse.modisco.util.emf.core.internal.allinstances;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.util.emf.core.internal.Activator;

/**
 * An adapter that acts as a cache for lists of instances by EClass. It works by
 * listening to changes in the model and updating the cache accordingly.
 * <p>
 * It must be created on a {@link Resource} through
 * {@link MetaclassInstancesAdapterFactory}, by doing the following: <code>
 * MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactory.getInstance().adapt(resource, MetaclassInstances.class);
 * </code>
 */
public class MetaclassInstancesAdapter extends AdapterImpl implements MetaclassInstances {

	private final Resource resource;

	/** All the model elements of the metaclass */
	private Map<EClass, Set<EObject>> instancesByEClass;
	/** All the model elements of the metaclass or one of its sub-types */
	private Map<EClass, Set<EObject>> instancesByType;

	/** Indicates if cache has been cleared and must be computed at next access */
	private boolean cacheInvalidated;

	/** model change listeners */
	private final List<ModelChangeListener> listeners = new ArrayList<ModelChangeListener>();

	/** Is the {@link Resource} linked to this Adapter already lazy-loaded? */
	private boolean resolved = false;

	protected MetaclassInstancesAdapter(final Resource resource, final boolean clearCache) {
		this.resource = resource;
		// this is to allow sub-classes to do initialization in their
		// constructor before calling clearCache()
		if (clearCache) {
			clearAndComputeCache();
		}
	}

	protected void clearAndComputeCache() {
		synchronized (this) {
			this.instancesByEClass = new HashMap<EClass, Set<EObject>>();
			this.instancesByType = new HashMap<EClass, Set<EObject>>();

			final TransactionalEditingDomain transactDomain = getTransactionalEditingDomain(this.resource);

			if (transactDomain == null) {
				// Standard case
				computeCache();
			} else {
				try {
					// prevent from concurrent model access in external tool
					transactDomain.runExclusive(new Runnable() {
						public void run() {
							computeCache();
						}
					});
				} catch (InterruptedException e) {
					Logger.logWarning(e,
							"InterruptedException during Model allOfClass computing.", Activator.getDefault()); //$NON-NLS-1$
					// task was interrupted, trying without exclusive access
					computeCache();
				}
			}

			this.cacheInvalidated = false;
		}
	}

	public void clearCache() {
		synchronized (this) {
			this.instancesByEClass = new HashMap<EClass, Set<EObject>>();
			this.instancesByType = new HashMap<EClass, Set<EObject>>();

			this.cacheInvalidated = true;
		}
	}

	private void validateCache() {
		if (this.cacheInvalidated) {
			clearAndComputeCache();
		}
		this.cacheInvalidated = false;
	}

	private void computeCache() {
		final TreeIterator<EObject> allContents = this.resource.getAllContents();
		while (allContents.hasNext()) {
			final EObject eObject = allContents.next();
			addModelElement(eObject, false);
		}
	}


	/**
	 * Add a new element to the set of elements corresponding to its metaclass.
	 *
	 * @param element
	 *            the element to add
	 * @param recursively
	 *            whether to also add elements contained in the given element
	 */
	protected synchronized void addModelElement(final EObject element, final boolean recursively) {
		// make sure there is only one occurrence
		element.eAdapters().remove(this);
		// so that this element will notify us when it's changed
		element.eAdapters().add(this);

		List<EClass> eClasses = getEClasses(element);
		for (EClass eClass : eClasses) {
			if (eClass == null) {
				Logger.logWarning(
						"Element has null eClass: " + element, Activator.getDefault()); //$NON-NLS-1$
				continue;
			}

			// direct instances
			associateToEClass(element, eClass);

			// instances of subclasses (including this class)
			associateToType(element, eClass);
			EList<EClass> allSuperTypes = eClass.getEAllSuperTypes();
			for (EClass superType : allSuperTypes) {
				associateToType(element, superType);
			}

			// fireModelChanged();

			if (recursively) {
				// also add the contained elements recursively
				EList<EObject> contents = element.eContents();
				for (EObject contained : contents) {
					addModelElement(contained, true);
				}
			}
		}
	}

	/**
	 * Remove this instance from the list of instances of the metaclass and its
	 * super-classes
	 */
	protected synchronized void removeModelElement(final EObject element, final boolean recursively) {
		element.eAdapters().remove(this);

		List<EClass> eClasses = new ArrayList<EClass>();
		for (Entry<EClass, Set<EObject>> entry : this.instancesByEClass.entrySet()) {
			if (entry.getValue().contains(element)) {
				eClasses.add(entry.getKey());
			}
		}
		for (EClass eClass : eClasses) {
			disassociateFromEClass(element, eClass);
		}

		List<EClass> types = new ArrayList<EClass>();
		for (Entry<EClass, Set<EObject>> entry : this.instancesByType.entrySet()) {
			if (entry.getValue().contains(element)) {
				types.add(entry.getKey());
			}
		}
		for (EClass eClass : types) {
			disassociateFromType(element, eClass);
		}

		if (recursively) {
			// also remove the contained elements recursively
			EList<EObject> contents = element.eContents();
			for (EObject contained : contents) {
				removeModelElement(contained, true);
			}
		}
	}

	@Override
	public synchronized void notifyChanged(final Notification msg) {
		// try {
		// StringBuilder builder = new StringBuilder();
		// switch (msg.getEventType()) {
		// case Notification.CREATE:
		// builder.append("CREATE ");
		// break;
		// case Notification.SET:
		// builder.append("SET ");
		// break;
		// case Notification.UNSET:
		// builder.append("UNSET ");
		// break;
		// case Notification.ADD:
		// builder.append("ADD ");
		// break;
		// case Notification.REMOVE:
		// builder.append("REMOVE ");
		// break;
		// case Notification.ADD_MANY:
		// builder.append("ADD_MANY ");
		// break;
		// case Notification.REMOVE_MANY:
		// builder.append("REMOVE_MANY ");
		// break;
		// case Notification.MOVE:
		// builder.append("MOVE ");
		// break;
		// case Notification.REMOVING_ADAPTER:
		// builder.append("REMOVING_ADAPTER ");
		// break;
		// case Notification.RESOLVE:
		// builder.append("RESOLVE ");
		// break;
		// default:
		// builder.append("<<<UNKNOWN>>> ");
		// break;
		// }
		//
		// builder.append("oldvalue=").append(msg.getOldValue()).append(" newvalue=")
		// .append(msg.getNewValue()).append(" feature=").append(msg.getFeature());
		//
		// System.out.println(builder.toString());
		// } catch (Throwable e) {
		// Logger.logError(e, CommonModiscoActivator.getDefault());
		// }

		// CREATE = 0
		// SET = 1
		// UNSET = 2
		// ADD = 3
		// REMOVE = 4
		// ADD_MANY = 5
		// REMOVE_MANY = 6
		// MOVE = 7
		// REMOVING_ADAPTER = 8
		// RESOLVE = 9

		// handle the change
		handleChanged(msg);
		// pass on the notification to listeners
		notifyModelChanged(msg);
	}

	protected void handleChanged(final Notification msg) {
		final int eventType = msg.getEventType();
		final Object feature = msg.getFeature();
		final Object oldValue = msg.getOldValue();
		final Object newValue = msg.getNewValue();
		final Object notifier = msg.getNotifier();

		// Avoid sending thousands of small events while a Resource is being
		// loaded. Instead, recompute the cache only once at the end, when
		// receiving Notification.RESOLVE for the proxy which caused the load.
		if (notifier instanceof ResourceImpl) {
			ResourceImpl resourceImpl = (ResourceImpl) notifier;
			if (resourceImpl.isLoading()) {
				return;
			}
		} else if (notifier instanceof EObject) {
			EObject eObject = (EObject) notifier;
			Resource eResource = eObject.eResource();
			if (eResource instanceof ResourceImpl) {
				ResourceImpl resourceImpl = (ResourceImpl) eResource;
				if (resourceImpl.isLoading()) {
					return;
				}
			}
		}

		switch (eventType) {
		case Notification.ADD:
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				if (!reference.isContainment()) {
					return;
				}
			}
			if (newValue instanceof EObject) {
				addModelElement((EObject) newValue, true);
			}
			break;

		case Notification.REMOVE:
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				if (!reference.isContainment()) {
					return;
				}
			}
			if (oldValue instanceof EObject) {
				if (notifier instanceof Resource && ((EObject) oldValue).eContainer() != null) {
					return; // object is removed from Resource.contents but is
							// still owned by another element
				}
				removeModelElement((EObject) oldValue, true);
			}
			break;

		case Notification.ADD_MANY:
			if (newValue instanceof EList<?>) {
				EList<?> eList = (EList<?>) newValue;
				for (Object object : eList) {
					if (object instanceof EObject) {
						addModelElement((EObject) object, true);
					}
				}
			}
			break;

		case Notification.REMOVE_MANY:
			if (newValue instanceof EList<?>) {
				EList<?> eList = (EList<?>) newValue;
				for (Object object : eList) {
					if (object instanceof EObject) {
						removeModelElement((EObject) object, true);
					}
				}
			}
			break;

		// features that have a multiplicity of 1
		case Notification.SET:
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				/*
				 * setting a reference should add or remove elements only if the
				 * reference is a composition link
				 */
				if (!reference.isContainment()) {
					break;
				}

				// old value must be considered as removed from the model (bug
				// 336903)
				if (oldValue != null && oldValue instanceof EObject) {
					removeModelElement((EObject) oldValue, true);
				}
				if (newValue != null && newValue instanceof EObject) {
					addModelElement((EObject) newValue, true);
				}
			}
			break;

		case Notification.UNSET:
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				/*
				 * unsetting a reference should remove the element only if the
				 * reference is a composition link
				 */
				if (!reference.isContainment()) {
					break;
				}
			}
			if (oldValue instanceof EObject) {
				removeModelElement((EObject) oldValue, true);
			}
			break;
		case Notification.RESOLVE:
			if (newValue instanceof EObject) {
				EObject resolvedEObject = (EObject) newValue;
				Resource eResource = resolvedEObject.eResource();
				EList<Adapter> eAdapters = eResource.eAdapters();
				for (Adapter adapter : eAdapters) {
					if (adapter instanceof MetaclassInstancesAdapter) {
						MetaclassInstancesAdapter adapter2 = (MetaclassInstancesAdapter) adapter;
						adapter2.resolved();
					}
				}
			}
			break;
		default:
		}
	}

	/**
	 * Called by a {@link MetaclassInstancesAdapter} from another
	 * {@link Resource} when a proxy {@link EObject} it contains is resolved, to
	 * signal this {@link MetaclassInstancesAdapter} that its {@link Resource}
	 * was lazy-loaded to resolve the proxy.
	 */
	protected void resolved() {
		synchronized (this) {
			if (this.resolved) {
				return;
			}
			this.resolved = true;
		}
		clearCache();
	}

	/**
	 * Normally, an {@link EObject} only has one {@link EClass}, but this is to
	 * allow handling Facets on a derived class.
	 */
	protected List<EClass> getEClasses(final EObject element) {
		return Collections.singletonList(element.eClass());
	}

	protected synchronized void associateToEClass(final EObject element, final EClass eClass) {
		Set<EObject> instancesForEClass = this.instancesByEClass.get(eClass);
		if (instancesForEClass == null) {
			instancesForEClass = new LinkedHashSet<EObject>();
			this.instancesByEClass.put(eClass, instancesForEClass);
		}
		instancesForEClass.add(element);
	}

	protected synchronized void associateToType(final EObject element, final EClass eClass) {
		Set<EObject> instancesForType = this.instancesByType.get(eClass);
		if (instancesForType == null) {
			instancesForType = new LinkedHashSet<EObject>();
			this.instancesByType.put(eClass, instancesForType);
		}
		instancesForType.add(element);
	}

	protected synchronized void disassociateFromEClass(final EObject element, final EClass eClass) {
		Set<EObject> instancesForEClass = this.instancesByEClass.get(eClass);
		if (instancesForEClass != null) {
			instancesForEClass.remove(element);
			if (instancesForEClass.isEmpty()) {
				// last instance removed
				this.instancesByEClass.remove(eClass);
			}
		}
	}

	protected synchronized void disassociateFromType(final EObject element, final EClass eClass) {
		Set<EObject> instancesForType = this.instancesByType.get(eClass);
		if (instancesForType != null) {
			instancesForType.remove(element);
			if (instancesForType.isEmpty()) {
				// last instance removed
				this.instancesByType.remove(eClass);
			}
		}
	}

	@Override
	public boolean isAdapterForType(final Object type) {
		return (type == MetaclassInstances.class);
	}

	public synchronized Collection<EObject> getInstances(final EClass eClass,
			final boolean includingSubclasses) {
		validateCache();
		final Set<EObject> set;
		if (includingSubclasses) {
			set = this.instancesByType.get(eClass);
		} else {
			set = this.instancesByEClass.get(eClass);
		}
		if (set == null) {
			return Collections.emptySet();
		}
		// return a copy to avoid the caller getting a
		// ConcurrentModificationException when iterating
		// on the list while it is being modified
		return new ArrayList<EObject>(set);
		// return Collections.unmodifiableSet(set);
	}

	protected Map<EClass, Set<EObject>> getInstancesByEClass() {
		return this.instancesByEClass;
	}

	protected Map<EClass, Set<EObject>> getInstancesByType() {
		return this.instancesByType;
	}

	protected Resource getResource() {
		return this.resource;
	}

	public void addListener(final ModelChangeListener listener) {
		if (!this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}
	}

	public void removeListener(final ModelChangeListener listener) {
		this.listeners.remove(listener);
	}

	protected void notifyModelChanged(final Notification msg) {
		for (ModelChangeListener listener : this.listeners) {
			listener.modelChanged(msg);
		}
	}

	private static TransactionalEditingDomain getTransactionalEditingDomain(
			final Resource aResource) {
		TransactionalEditingDomain transactDomain = null;
		if (aResource != null
				&& aResource.getResourceSet() instanceof IEditingDomainProvider) {
			EditingDomain editDomain = ((IEditingDomainProvider) aResource
					.getResourceSet()).getEditingDomain();
			if (editDomain instanceof TransactionalEditingDomain) {
				transactDomain = (TransactionalEditingDomain) editDomain;
			}
		}
		return transactDomain;
	}
}
