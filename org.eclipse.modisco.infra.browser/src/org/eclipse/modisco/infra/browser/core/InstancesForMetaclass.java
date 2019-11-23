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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.core.adapters.instances.MetaclassInstancesAdapterFactoryWithFacet;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;
import org.eclipse.osgi.util.NLS;

/**
 * All the model elements for a metaclass. Each {@link InstancesForMetaclass}
 * corresponds to a metaclass, and has a list of all the instances of this
 * metaclass in the model.
 */
public class InstancesForMetaclass {

	/** The list of subclasses of this metaclass */
	private final ArrayList<InstancesForMetaclass> subclasses = new ArrayList<InstancesForMetaclass>();

	/** The EClass corresponding to this metaclass */
	private final EClass eClass;

	/**
	 * The list of all metaclasses. Used to find the instance list of super
	 * metaclasses.
	 */
	private final InstancesForMetaclasses instancesForMetaclasses;

	private final BrowserConfiguration browserConfiguration;

	private ArrayList<EObject> cachedElements = null;
	private int cachedElementsModCount = -1;
	private ArrayList<EObject> cachedDerivedElements = null;
	private int cachedDerivedElementsModCount = -1;

	private final Collection<Resource> fResources;

	/**
	 * @param eClass
	 *            the {@link EClass} corresponding to the metaclass.
	 * @param browserConfiguration
	 * @param resources
	 */
	public InstancesForMetaclass(final EClass eClass,
			final InstancesForMetaclasses instancesForMetaclasses,
			final BrowserConfiguration browserConfiguration, final Collection<Resource> resources) {
		this.eClass = eClass;
		this.instancesForMetaclasses = instancesForMetaclasses;
		this.browserConfiguration = browserConfiguration;
		// this collection is purposefully shared with the parent InstancesForMetaclasses
		// this fixes Bug 341252 - [Model Browser] instances in composed models not displayed
		this.fResources = resources;
	}

	private final Object cacheLock = new Object();

	public ArrayList<EObject> getElements() {
		// cache visible elements list (with modcount)
		synchronized (this.cacheLock) {
			if (this.cachedElements == null
					|| this.cachedElementsModCount != this.browserConfiguration
							.getAppearanceConfiguration().getModCount()) {
				final CustomizationEngine customizationEngine = this.browserConfiguration
						.getAppearanceConfiguration().getCustomizationEngine();

				MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(
						this.browserConfiguration.getAppearanceConfiguration().getFacetContext());
				ArrayList<EObject> visibleElements = new ArrayList<EObject>();
				List<Resource> resources;
				synchronized (this) {
					resources = new ArrayList<Resource>(this.fResources);
				}
				for (Resource resource : resources) {
					MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactoryWithFacet
							.getInstance().adapt(resource, MetaclassInstances.class);
					Collection<EObject> elements = instances.getInstances(this.eClass, false);
					customizationEngine.filterVisible(elements, visibleElements);
				}
				this.cachedElements = visibleElements;

				this.cachedElementsModCount = this.browserConfiguration
						.getAppearanceConfiguration().getModCount();
			}
		}
		return this.cachedElements;
	}

	public synchronized ArrayList<EObject> getDerivedElements() {
		// cache visible elements list (with modcount)
		if (this.cachedDerivedElements == null
				|| this.cachedDerivedElementsModCount != this.browserConfiguration
						.getAppearanceConfiguration().getModCount()) {
			final CustomizationEngine customizationEngine = this.browserConfiguration
					.getAppearanceConfiguration().getCustomizationEngine();

			MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(
					this.browserConfiguration.getAppearanceConfiguration().getFacetContext());
			ArrayList<EObject> visibleElements = new ArrayList<EObject>();
			for (Resource resource : this.fResources) {
				MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactoryWithFacet
						.getInstance().adapt(resource, MetaclassInstances.class);
				Collection<EObject> elements = instances.getInstances(this.eClass, true);
				customizationEngine.filterVisible(elements, visibleElements);
			}
			this.cachedDerivedElements = visibleElements;

			this.cachedDerivedElementsModCount = this.browserConfiguration
					.getAppearanceConfiguration().getModCount();
		}
		return this.cachedDerivedElements;
	}

	/** Cached class qualified name */
	private String classQualifiedName = null;

	/**
	 * A parent for the object when it is in a tree (when metaclasses are
	 * grouped by packages)
	 */
	private Object parent;

	/** @return the number of instances of the metaclass */
	public int size() {
		return getElements().size();
	}

	/** @return the number of instances of this metaclass or its subclasses */
	public int totalSize() {
		return getDerivedElements().size();
	}

	/** @return the EClass corresponding to this {@link InstancesForMetaclass} */
	public EClass getEClass() {
		return this.eClass;
	}

	public synchronized String getClassQualifiedName() {
		if (this.classQualifiedName == null) {
			this.classQualifiedName = ModelUtils.getMetaclassQualifiedName(getEClass());
		}
		return this.classQualifiedName;
	}

	public void setParent(final Object parent) {
		this.parent = parent;
	}

	public Object getParent() {
		return this.parent;
	}

	/** Add this class to the subclasses of its parents */
	public synchronized void buildParentsSubclasses() {
		final EList<EClass> superTypes = this.eClass.getESuperTypes();
		for (final EClass superclass : superTypes) {
			final InstancesForMetaclass instancesForSuperclass = this.instancesForMetaclasses
					.getInstancesForMetaclass(superclass);
			if (instancesForSuperclass != null) {
				instancesForSuperclass.addSubclass(this);
			} else if (!(this.eClass instanceof Facet)) {
				MoDiscoBrowserPlugin.logWarning(NLS.bind(Messages.InstancesForMetaclass_notFound,
						ModelUtils.getMetaclassQualifiedName(superclass)));
			}
		}
	}

	/** Clears the list of subclasses of this class */
	public synchronized void clearSubclasses() {
		this.subclasses.clear();
	}

	public synchronized InstancesForMetaclass[] getSubclasses() {
		return this.subclasses.toArray(new InstancesForMetaclass[this.subclasses.size()]);
	}

	/** Add the given class to the subclasses of this class */
	private synchronized void addSubclass(final InstancesForMetaclass instancesForMetaclass) {
		this.subclasses.add(instancesForMetaclass);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClassQualifiedName() + " " + size(); //$NON-NLS-1$
	}
}
