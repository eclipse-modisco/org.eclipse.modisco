/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *    Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetAttribute;
import org.eclipse.modisco.infra.facet.FacetReference;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.FacetStructuralFeature;
import org.eclipse.modisco.infra.facet.Shortcut;
import org.eclipse.modisco.infra.facet.core.adapters.instances.MetaclassInstancesAdapterFactoryWithFacet;
import org.eclipse.modisco.infra.facet.core.exception.ModiscoFacetException;
import org.eclipse.modisco.infra.facet.core.exception.StructuralConstraintViolationException;
import org.eclipse.modisco.infra.facet.core.internal.Activator;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;

/**
 * @author Gregoire DUPE
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class FacetContext {

	private final Set<Facet> appliedFacets = new HashSet<Facet>();
	private final List<EStructuralFeature> appliedFeatures = new ArrayList<EStructuralFeature>();
	private final Set<Resource> resources = new HashSet<Resource>();
	private final List<FacetContextListener> fListeners = new ArrayList<FacetContextListener>();

	/**
	 * @param resources
	 *            the resources that will be used to resolve {@link Shortcut}s
	 */
	public void setResources(final Collection<Resource> resources) {
		synchronized (this.resources) {
			this.resources.clear();
		}
		for (Resource resource : resources) {
			addComposedResource(resource);
		}
	}

	private void addComposedResource(final Resource resource) {
		if (resource == null) {
			return;
		}
		synchronized (this.resources) {
			this.resources.add(resource);
		}
		synchronized (resource) {
			TreeIterator<EObject> allContents = EcoreUtil.getAllContents(resource, false);
			while (allContents.hasNext()) {
				EObject element = allContents.next();
				if (element.eResource() != resource) {
					synchronized (this.resources) {
						this.resources.add(element.eResource());
					}
				}
			}
		}
	}

	public void addFacetSet(final FacetSet facetSet) {
		// this.appliedFacetSet.add(facetSet);
		for (Facet facet : facetSet.getFacets()) {
			addFacet(facet);
		}
	}

	public void addFacet(final Facet facet) {
		boolean contained;
		synchronized (this.appliedFacets) {
			contained = this.appliedFacets.contains(facet);
			if (!contained) {
				this.appliedFacets.add(facet);
			}
		}
		if (!contained) {
			notifyFacetAdded(facet);
			for (EStructuralFeature feature : facet.getEStructuralFeatures()) {
				if (feature instanceof FacetStructuralFeature || feature instanceof Shortcut) {
					synchronized (this.appliedFeatures) {
						this.appliedFeatures.add(feature);
					}
				}
			}
		}
	}

	public boolean isInstance(final EObject eObject, final Facet facet) throws ModelQueryException {
		ModelQuery modelQuery = facet.getConditionQuery();
		boolean result = false;
		boolean isSuperType = false;
		for (EClass superType : facet.getESuperTypes()) {
			if (superType.isSuperTypeOf(eObject.eClass())) {
				isSuperType = true;
				break;
			}
		}
		if (isSuperType) {
			if (modelQuery == null) {
				result = true;
			} else {
				AbstractModelQuery abstractModelQuery = ModelQuerySetCatalog.getSingleton()
						.getModelQueryImpl(modelQuery);
				try {
					Object queryResult = abstractModelQuery.basicEvaluate(eObject);
					if (queryResult instanceof Boolean) {
						result = ((Boolean) queryResult).booleanValue();
					} else {
						String message = "Query " + abstractModelQuery.toString() //$NON-NLS-1$
								+ " didn't return a boolean result as expected."; //$NON-NLS-1$
						MoDiscoLogger.logError(message, Activator.getDefault());
					}
				} catch (ModelQueryException e) {
					result = false;
					throw e;
				} catch (Exception e) {
					result = false;
					MoDiscoLogger.logError(e, Activator.getDefault());
					throw new ModelQueryException("FacetContext failed to execute a query", e); //$NON-NLS-1$
				}
			}
		}
		return result;
	}

	public Object get(final EObject eObject, final EStructuralFeature structuralFeature)
			throws ModelQueryException, ModiscoFacetException {
		if (structuralFeature == null) {
			throw new ModiscoFacetException("The parameter named structuralFeature is null"); //$NON-NLS-1$
		}
		Object result = null;
		boolean contained;
		synchronized (this.appliedFeatures) {
			contained = this.appliedFeatures.contains(structuralFeature);
		}
		if (contained) {
			Facet facet = (Facet) structuralFeature.eContainer();
			if (isInstance(eObject, facet)) {
				if (structuralFeature instanceof FacetStructuralFeature) {
					FacetStructuralFeature facetStructuralFeature = (FacetStructuralFeature) structuralFeature;
					ModelQuery modelQuery = facetStructuralFeature.getValueQuery();
					AbstractModelQuery abstractModelQuery = ModelQuerySetCatalog.getSingleton()
							.getModelQueryImpl(modelQuery);
					result = abstractModelQuery.basicEvaluate(eObject);
				} else if (structuralFeature instanceof Shortcut) {
					Shortcut shortcut = (Shortcut) structuralFeature;
					List<EObject> resultList = new BasicEList<EObject>();
					EReference oppositeRef = shortcut.getOppositeReference();
					EClass eClass = oppositeRef.getEContainingClass();
					List<EObject> list = allInstances(eClass);
					for (EObject modelElement : list) {
						EObject referedByModelElement = (EObject) modelElement.eGet(oppositeRef);
						if (referedByModelElement == eObject) {
							EObject element = modelElement;
							for (EReference eReference : shortcut.getPath()) {
								element = (EObject) element.eGet(eReference);
							}
							resultList.add(element);
						}
					}
					if (shortcut.getUpperBound() > 1) {
						result = resultList;
					} else {
						if (resultList.size() > 1) {
							throw new StructuralConstraintViolationException();
						} else if (resultList.size() == 1) {
							result = resultList.get(0);
						}
						// else result = null;
					}
				} else {
					throw new ModiscoFacetException(
							"The structuralFeature parameter must be a FacetStructuralFeature: " //$NON-NLS-1$
									+ structuralFeature.toString());
				}
			} else {
				throw new ModiscoFacetException("The eObject parameter must be an instance of : " //$NON-NLS-1$
						+ facet.getName());
			}
		} else {
			throw new ModiscoFacetException(
					"The structuralFeature must be registered into the context, please use the " //$NON-NLS-1$
							+ FacetContext.class.getSimpleName() + ".add(FacetSet) method."); //$NON-NLS-1$
		}

		if (result instanceof Collection<?> && !(result instanceof BasicEList<?>)) {
			Collection<?> list = (Collection<?>) result;
			@SuppressWarnings("unchecked")
			BasicEList basicEList = new BasicEList(list);
			result = basicEList;
		}
		return result;
	}

	protected List<EObject> allInstances(final EClass eClass) {
		List<EObject> result = new ArrayList<EObject>();
		MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(this);
		synchronized (this.resources) {
			for (Resource resource : this.resources) {
				MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactoryWithFacet
						.getInstance().adapt(resource, MetaclassInstances.class);
				result.addAll(instances.getInstances(eClass, true));
			}
		}
		return result;
	}

	public List<EStructuralFeature> getFacetFeatures(final EObject eObject) {
		List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
		for (Facet facet : getAppliedFacets()) {
			try {
				if (isInstance(eObject, facet)) {
					result.addAll(facet.getEStructuralFeatures());
				}
			} catch (ModelQueryException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
		return result;
	}

	public void addAll(final Collection<FacetSet> allFacetSets) {
		for (FacetSet facetSet : allFacetSets) {
			addFacetSet(facetSet);
		}
	}

	public EList<EAttribute> getAttributes(final EObject eObject) throws ModelQueryException {
		EList<EAttribute> result = new BasicEList<EAttribute>();
		for (Facet facet : getAppliedFacets()) {
			if (isInstance(eObject, facet)) {
				for (EStructuralFeature structuralFeature : facet.getEStructuralFeatures()) {
					if (structuralFeature instanceof FacetAttribute) {
						FacetAttribute facetAttribute = (FacetAttribute) structuralFeature;
						result.add(facetAttribute);
					}
				}
			}
		}
		return result;
	}

	public EList<EReference> getReferences(final EObject eObject) throws ModelQueryException {
		EList<EReference> result = new BasicEList<EReference>();
		for (Facet facet : getAppliedFacets()) {
			if (isInstance(eObject, facet)) {
				for (EStructuralFeature structuralFeature : facet.getEStructuralFeatures()) {
					if (structuralFeature instanceof FacetReference
							|| structuralFeature instanceof Shortcut) {
						EReference facetAttribute = (EReference) structuralFeature;
						result.add(facetAttribute);
					}
				}
			}
		}
		return result;
	}

	public List<EClass> getMetaClasses() {
		List<EClass> metaClasses = new ArrayList<EClass>();
		synchronized (this.appliedFacets) {
			metaClasses.addAll(this.appliedFacets);
		}
		return metaClasses;
	}

	public List<Facet> getFacets(final EObject eObject) {
		List<Facet> result = new ArrayList<Facet>();
		for (Facet facet : getAppliedFacets()) {
			try {
				if (isInstance(eObject, facet)) {
					result.add(facet);
				}
			} catch (ModelQueryException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}

	public Collection<Facet> getAppliedFacets() {
		return new ArrayList<Facet>(this.appliedFacets);
	}

	public void clear() {
		synchronized (this.appliedFeatures) {
			this.appliedFeatures.clear();
		}
		synchronized (this.appliedFacets) {
			this.appliedFacets.clear();
		}
		notifyFacetsCleared();
	}

	protected Collection<EStructuralFeature> getAppliedFeatures() {
		return new ArrayList<EStructuralFeature>(this.appliedFeatures);
	}

	public void addListener(final FacetContextListener listener) {
		synchronized (this.fListeners) {
			if (!this.fListeners.contains(listener)) {
				this.fListeners.add(listener);
			}
		}
	}

	public synchronized void removeListener(final FacetContextListener listener) {
		synchronized (this.fListeners) {
			this.fListeners.remove(listener);
		}
	}

	public void notifyFacetAdded(final Facet facet) {
		// copy list to allow clients to modify the listener list
		List<FacetContextListener> listeners = new ArrayList<FacetContextListener>(this.fListeners);
		for (FacetContextListener listener : listeners) {
			listener.facetAdded(facet);
		}
	}

	public void notifyFacetsCleared() {
		// copy list to allow clients to modify the listener list
		List<FacetContextListener> listeners = new ArrayList<FacetContextListener>(this.fListeners);
		for (FacetContextListener listener : listeners) {
			listener.facetsCleared();
		}
	}
}
