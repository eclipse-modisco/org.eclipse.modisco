/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.facet.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.modisco.infra.common.core.internal.builder.EcoreCatalog;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.modisco.infra.facet.FacetPackage;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.internal.Activator;
import org.eclipse.modisco.infra.facet.validation.EValidatorAdapter;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public final class FacetSetCatalog extends EcoreCatalog implements ModiscoCatalogChangeListener {

	public static final String REGISTRATION_EXTENSION_POINT_ID = "org.eclipse.modisco.infra.facet.registration"; //$NON-NLS-1$

	public static final String FILE_EXTENSION = "facetSet"; //$NON-NLS-1$

	private static FacetSetCatalog singleton = null;

	public static synchronized FacetSetCatalog getSingleton() {
		if (FacetSetCatalog.singleton == null) {
			EValidator validator = EValidator.Registry.INSTANCE
					.getEValidator(FacetPackage.eINSTANCE);
			if (validator == null) {
				// Registers the validator adapter in the EMF validator registry
				EValidator.Registry.INSTANCE.put(FacetPackage.eINSTANCE, new EValidatorAdapter());
			}
			EcoreCatalog.getSingleton();
			ModelQuerySetCatalog.getSingleton();
			FacetSetCatalog.singleton = new FacetSetCatalog();
		}
		return FacetSetCatalog.singleton;
	}

	private HashMap<EPackage, HashSet<FacetSet>> ePackageToDefaultFacetSetMap;

	public synchronized Map<EPackage, HashSet<FacetSet>> getEPackageToDefaultFacetSetMap() {
		if (this.ePackageToDefaultFacetSetMap == null) {
			this.ePackageToDefaultFacetSetMap = new HashMap<EPackage, HashSet<FacetSet>>();
		}
		return this.ePackageToDefaultFacetSetMap;
	}

	private FacetSetCatalog() {
		super();
		addChangeListener(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRootObjectName(final EObject rootObject) {
		return ((FacetSet) rootObject).getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRootObjectNsUri(final EObject rootObject) {
		return ((FacetSet) rootObject).getNsURI();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<?> getRootClass() {
		return FacetSet.class;
	}

	/**
	 * This method returns the facet set of the resource having for name the
	 * "name" parameter value.
	 *
	 * @param name
	 *            the name of a resource contained in the catalog
	 * @return return a facet set
	 */
	public FacetSet getFacetSet(final String name) {
		return (FacetSet) getRootObject(name);
	}

	/**
	 * Get the set of default {@link FacetSet}s that apply to the given
	 * {@link EPackage}.
	 *
	 * @param ePackage
	 *            the package for which matching {@link FacetSet}s will be
	 *            returned
	 * @return the set of default {@link FacetSet}s
	 */
	public Set<FacetSet> getDefaultFacetSets(final EPackage ePackage) {
		return getEPackageToDefaultFacetSetMap().get(ePackage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRegistryExtensionPoint() {
		return FacetSetCatalog.REGISTRATION_EXTENSION_POINT_ID;
	}

	/**
	 * This methods returns the facet sets of all the resources contained in the
	 * catalog.
	 *
	 * @return returns all the facet sets
	 */
	public Collection<FacetSet> getAllFacetSets() {
		Collection<FacetSet> result = new ArrayList<FacetSet>();
		for (EObject eObject : getAllRootObjects()) {
			if (eObject instanceof FacetSet) {
				FacetSet facetSet = (FacetSet) eObject;
				result.add(facetSet);
			}
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getMoDiscoSubProtocol() {
		return "facet"; //$NON-NLS-1$
	}

	@Override
	protected synchronized void postOpenResource(final URI uri, final IFile file, final EObject root)
			throws Exception {
		super.postOpenResource(uri, file, root);
		if (root instanceof FacetSet) {
			FacetSet facetSet = (FacetSet) root;
			EAnnotation annotation = facetSet.getEAnnotation("default"); //$NON-NLS-1$
			if (annotation != null) {
				if (annotation.getReferences().size() == 1
						&& annotation.getReferences().get(0) instanceof EPackage) {
					EPackage ePackage = (EPackage) annotation.getReferences().get(0);
					HashSet<FacetSet> facetSets = getEPackageToDefaultFacetSetMap().get(ePackage);
					if (facetSets == null) {
						facetSets = new HashSet<FacetSet>();
						getEPackageToDefaultFacetSetMap().put(ePackage, facetSets);
					}
					facetSets.add(facetSet);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.modisco.infra.common.core.internal.builder.EcoreCatalog
	 * #getActivator()
	 */
	@Override
	protected Plugin getActivator() {
		return Activator.getDefault();
	}

	@Override
	public String getFileExtension() {
		return FacetSetCatalog.FILE_EXTENSION;
	}

	public void changed(final EObject eObject, final IFile file) {
		EcoreCatalog.getSingleton().updateNotify(eObject, file);
	}

	public void added(final EObject eObject, final IFile file) {
		EcoreCatalog.getSingleton().addNotify(eObject, file);
	}

	public void removed(final IFile file) {
		EcoreCatalog.getSingleton().removeNotify(file);
	}

	@Override
	protected void postRestoreInstalledURI(final EObject modiscoResourceRoot) {
		// Bug 313309 - Installed version of Facet not in the registry after
		// deleting workspace version
		if (modiscoResourceRoot instanceof FacetSet) {
			FacetSet facetSet = (FacetSet) modiscoResourceRoot;
			String nsURI = facetSet.getNsURI();
			if (nsURI != null) {
				EPackage.Registry.INSTANCE.put(nsURI, facetSet);
			}
		}
	}
}