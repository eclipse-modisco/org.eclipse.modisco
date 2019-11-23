/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.core.adapters.instances;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.modisco.infra.facet.core.FacetContextListener;
import org.eclipse.modisco.infra.facet.core.extensions.RefreshStrategy;
import org.eclipse.modisco.infra.facet.core.internal.Activator;
import org.eclipse.modisco.infra.facet.core.internal.extensions.RefreshStrategiesRegistry;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.infra.query.core.exception.ProjectDisabledException;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstancesAdapter;

/**
 * An adapter that acts as a cache for lists of instances by EClass (extending
 * {@link MetaclassInstancesAdapter} for supporting {@link Facet}s). It works by
 * listening to changes in the model and updating the cache accordingly.
 * <p>
 * It must be created on a {@link Resource} through
 * {@link MetaclassInstancesAdapterFactoryWithFacet}, by doing the following:
 * <p>
 * <code>
 * MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(facetContext);<br>
 * MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactoryWithFacet.getInstance().adapt(resource, MetaclassInstances.class);
 * </code>
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class MetaclassInstancesAdapterWithFacet extends MetaclassInstancesAdapter implements
		FacetContextListener {

	private final FacetContext facetContext;

	protected MetaclassInstancesAdapterWithFacet(final Resource resource,
			final FacetContext facetContext) {
		super(resource, false);
		this.facetContext = facetContext;
		this.facetContext.addListener(this);
		clearCache();
	}

	/**
	 * Normally, an {@link EObject} only has one {@link EClass}, but we override
	 * this to handle {@link Facet}s.
	 */
	@Override
	protected List<EClass> getEClasses(final EObject element) {
		final List<EClass> eClasses = new ArrayList<EClass>();
		eClasses.add(element.eClass());
		eClasses.addAll(this.facetContext.getFacets(element));
		return eClasses;
	}

	public void facetAdded(final Facet facet) {
		TreeIterator<EObject> allContents = getResource().getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			try {
				if (this.facetContext.isInstance(eObject, facet)) {
					associateToEClass(eObject, facet);
					associateToType(eObject, facet);
				}
			} catch (ProjectDisabledException e) {
				// Don't print any message, the user should already have
				// received an error message, having the same cause.
				assert true;
			} catch (ModelQueryException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		notifyModelChanged(null);
	}

	public void facetsCleared() {
		removeFacets(getInstancesByEClass().keySet());
		removeFacets(getInstancesByType().keySet());
		notifyModelChanged(null);
	}

	private void removeFacets(final Set<EClass> eClasses) {
		Iterator<EClass> eClassesIterator = eClasses.iterator();
		while (eClassesIterator.hasNext()) {
			EClass eClass = eClassesIterator.next();
			if (eClass instanceof Facet) {
				eClassesIterator.remove();
			}
		}
	}

	public FacetContext getFacetContext() {
		return this.facetContext;
	}

	/** Refresh Facets when a model element changes */
	@Override
	protected void handleChanged(final Notification msg) {
		super.handleChanged(msg);

		final Object notifier = msg.getNotifier();
		final int eventType = msg.getEventType();

		if (notifier instanceof EObject) {
			switch (eventType) {
			case Notification.ADD:
			case Notification.ADD_MANY:
			case Notification.MOVE:
			case Notification.REMOVE:
			case Notification.REMOVE_MANY:
			case Notification.SET:
			case Notification.UNSET:
				EObject eObject = (EObject) notifier;
				elementChanged(eObject, msg);
				break;
			default:
				// nothing
			}
		}
	}

	private void elementChanged(final EObject eObject, final Notification msg) {

		Set<EObject> impactedElements = new HashSet<EObject>();
		List<RefreshStrategy> refreshStrategies = RefreshStrategiesRegistry.getInstance()
				.getRefreshStrategies(this.facetContext.getAppliedFacets());
		for (RefreshStrategy refreshStrategy : refreshStrategies) {
			Collection<EObject> elementsImpactedFromChange = refreshStrategy
					.findElementsImpactedFromChange(eObject, msg);
			if (elementsImpactedFromChange != null) {
				impactedElements.addAll(elementsImpactedFromChange);
			}
		}

		for (EObject impactedElement : impactedElements) {
			removeModelElement(impactedElement, false);
			addModelElement(impactedElement, false);
		}

		if (!impactedElements.contains(eObject)) {
			// also, always refresh the changed element
			removeModelElement(eObject, false);
			addModelElement(eObject, false);
		}
	}
}
