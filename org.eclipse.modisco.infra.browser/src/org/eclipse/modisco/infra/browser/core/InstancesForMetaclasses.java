/*******************************************************************************
 * Copyright (c) 2008, 2015 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 341252 - [Model Browser] instances in composed models not displayed
 *    Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.util.EMFUtil;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.modisco.infra.facet.core.FacetContextListener;
import org.eclipse.modisco.infra.facet.core.adapters.instances.MetaclassInstancesAdapterFactoryWithFacet;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;
import org.eclipse.modisco.util.emf.core.internal.allinstances.ModelChangeListener;

/**
 * A list of metaclasses from the model, each metaclass having an associated
 * list of instances of the metaclass.
 */
public class InstancesForMetaclasses implements FacetContextListener, ModelChangeListener {

	/** Model elements sorted by EClass (using their full qualified name). */
	private final TreeMap<EClass, InstancesForMetaclass> modelElements;

	/**
	 * A list of all metaclasses which do not have a parent. That is, a list of
	 * metaclasses from which all other metaclasses can be found by derivation.
	 */
	private final ArrayList<InstancesForMetaclass> rootMetaclasses = new ArrayList<InstancesForMetaclass>();

	private final BrowserConfiguration browserConfiguration;

	/**
	 * The set of resources the contents of which are currently displayed in the
	 * types panel
	 */
	private final Set<Resource> fResources;

	private final List<MetaclassesChangeListener> listeners = new ArrayList<MetaclassesChangeListener>();

	/**
	 * @param browserConfiguration
	 *            the browser configuration
	 * @param resources
	 *            the resources from which to compute the list of metaclasses
	 */
	public InstancesForMetaclasses(final BrowserConfiguration browserConfiguration,
			final Set<Resource> resources) {
		this.browserConfiguration = browserConfiguration;
		this.fResources = new HashSet<Resource>();

		// sorted by qualified name
		this.modelElements = new TreeMap<EClass, InstancesForMetaclass>(new Comparator<EClass>() {
			public int compare(final EClass e1, final EClass e2) {
				String q1 = ModelUtils.getMetaclassQualifiedName(e1);
				String q2 = ModelUtils.getMetaclassQualifiedName(e2);
				if (q1 == null) {
					return -1;
				}
				return q1.compareTo(q2);
			}
		});

		final FacetContext facetContext = browserConfiguration.getAppearanceConfiguration()
				.getFacetContext();
		MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(facetContext);

		for (Resource resource : resources) {
			internalWatchResource(resource);
		}
		computeModelElements();

		facetContext.addListener(this);
	}

	private void computeModelElements() {
		List<Resource> resources;
		synchronized (this.fResources) {
			resources = new ArrayList<Resource>(this.fResources);
		}
		Collection<EClass> allClasses = EMFUtil.findAllClasses(resources);
		for (EClass eClass : allClasses) {
			synchronized (this.modelElements) {
				if (!this.modelElements.containsKey(eClass)) {
					InstancesForMetaclass instancesForMetaclass = new InstancesForMetaclass(eClass,
							this, this.browserConfiguration, this.fResources);
					this.modelElements.put(eClass, instancesForMetaclass);
				}
			}
		}
	}

	public void watchResource(final Resource resource) {
		boolean contained;
		synchronized (this.fResources) {
			contained = this.fResources.contains(resource);
		}
		if (!contained) {
			final FacetContext facetContext = this.browserConfiguration
					.getAppearanceConfiguration().getFacetContext();
			MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(facetContext);
			internalWatchResource(resource);
			computeModelElements();
			buildDerivationTree();
		}
	}

	private void internalWatchResource(final Resource resource) {
		MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactoryWithFacet
				.getInstance().adapt(resource, MetaclassInstances.class);
		instances.addListener(this);
		synchronized (this.fResources) {
			this.fResources.add(resource);
		}
	}

	public void unwatchResource(final Resource resource) {
		boolean contained;
		synchronized (this.fResources) {
			contained = this.fResources.contains(resource);
		}
		if (contained) {
			// always set FacetContext before using
			// MetaclassInstancesAdapterFactoryWithFacet
			MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(
					this.browserConfiguration.getAppearanceConfiguration().getFacetContext());
			MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactoryWithFacet
					.getInstance().adapt(resource, MetaclassInstances.class);
			// "touch" to mark the cache dirty
			this.browserConfiguration.getAppearanceConfiguration().touch();
			instances.removeListener(this);
			synchronized (this.fResources) {
				this.fResources.remove(resource);
			}
			computeModelElements();
			buildDerivationTree();
		}
	}

	public InstancesForMetaclass[] getInstancesForMetaclasses() {
		synchronized (this.modelElements) {
			final Collection<InstancesForMetaclass> instancesForMetaclasses = this.modelElements
					.values();
			return instancesForMetaclasses
					.toArray(new InstancesForMetaclass[instancesForMetaclasses.size()]);
		}
	}

	/**
	 * @param eClass
	 *            the metaclass
	 * @return the {@link InstancesForMetaclass} object or <code>null</code> if
	 *         the metaclass was not found
	 */
	public InstancesForMetaclass getInstancesForMetaclass(final EClass eClass) {
		synchronized (this.modelElements) {
			return this.modelElements.get(eClass);
		}
	}

	/** Builds the derivation tree of metaclasses */
	public void buildDerivationTree() {
		final InstancesForMetaclass[] instancesByMetaclass = getInstancesForMetaclasses();

		// clear previous state
		this.rootMetaclasses.clear();
		for (final InstancesForMetaclass instancesForMetaclass : instancesByMetaclass) {
			instancesForMetaclass.clearSubclasses();
		}

		// build the derivation tree
		for (final InstancesForMetaclass instancesForMetaclass : instancesByMetaclass) {
			instancesForMetaclass.buildParentsSubclasses();
			if (instancesForMetaclass.getEClass().getESuperTypes().isEmpty()) {
				this.rootMetaclasses.add(instancesForMetaclass);
			}
		}
	}

	public InstancesForMetaclass[] getRootMetaclasses() {
		return this.rootMetaclasses.toArray(new InstancesForMetaclass[this.rootMetaclasses.size()]);
	}

	public void facetAdded(final Facet facet) {
		List<Resource> resources;
		synchronized (this.fResources) {
			resources = new ArrayList<Resource>(this.fResources);
		}
		InstancesForMetaclass instancesForMetaclass = new InstancesForMetaclass(facet, this,
				this.browserConfiguration, resources);
		synchronized (this.modelElements) {
			this.modelElements.put(facet, instancesForMetaclass);
		}
	}

	public void facetsCleared() {
		synchronized (this.modelElements) {
			Iterator<EClass> iterator = this.modelElements.keySet().iterator();
			while (iterator.hasNext()) {
				EClass eClass = iterator.next();
				if (eClass instanceof Facet) {
					iterator.remove();
				}
			}
		}
	}

	public interface MetaclassesChangeListener {
		void modelChanged();
	}

	public void addListener(final MetaclassesChangeListener listener) {
		if (!this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}
	}

	public void removeListener(final MetaclassesChangeListener listener) {
		this.listeners.remove(listener);
	}

	public void notifyChanged() {
		for (MetaclassesChangeListener listener : this.listeners) {
			listener.modelChanged();
		}
	}

	public void modelChanged(final Notification msg) {
		if (msg != null && msg.getEventType() == Notification.RESOLVE) {
			computeModelElements();
			buildDerivationTree();
		}

		// pass on the notification to our listeners
		notifyChanged();
	}
}
