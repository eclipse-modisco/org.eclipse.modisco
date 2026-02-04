/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] EMF Facet customization meta-model
 *      Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *      Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *      Gregoire Dupe (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *      Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 */
package org.eclipse.modisco.facet.custom.core.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.custom.core.ICustomizationPropertiesCatalogManager;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManager;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManagerConfiguration;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManagerFactory;

/**
 * Customization catalog implementation using the catalog manager features
 * provided by the plug-in org.eclipse.modisco.facet.util.emf.core
 * 
 * @author Gregoire Dupe
 * 
 */
public class CustomizationPropertiesCatalogManager implements
		ICustomizationPropertiesCatalogManager {

	private static final String CUSTOM_SUFIX = "customproperties"; //$NON-NLS-1$
	private final ICatalogManager catalogMgr;

	public CustomizationPropertiesCatalogManager(final ResourceSet resourceSet) {
		final ICatalogManagerConfiguration catalogMgrConfig = 
				new CatalogManagerConfiguration();
		this.catalogMgr = ICatalogManagerFactory.DEFAULT.getOrCreateCatalogManager(
				catalogMgrConfig, resourceSet, this.getClass().getName());
	}

	public List<FacetSet> getAllRegisteredCustomizationPropertySet() {
		final List<FacetSet> result = new ArrayList<FacetSet>();
		for (final EObject eObject : this.catalogMgr.getInstalledEntries(EObject.class)) {
			if (eObject instanceof FacetSet) {
				final FacetSet facetSet = (FacetSet) eObject;
				result.add(facetSet);
			} else {
				throw new RuntimeException(
						"Only facetSets must be stored in the customization properties catalog"); //$NON-NLS-1$
			}
		}
		return result;
	}

	public List<FacetOperation> getCustomizationPropertiesByName(
			final String customPropName) {
		final List<FacetOperation> result = new ArrayList<FacetOperation>();
		for (final EObject facetSet : this.catalogMgr.getInstalledEntries(EObject.class)) {
			final Iterator<EObject> iterator = facetSet.eAllContents();
			while (iterator.hasNext()) {
				final EObject eObject = iterator.next();
				if (eObject instanceof FacetOperation) {
					final FacetOperation customProperty = (FacetOperation) eObject;
					if (customPropName.equals(customProperty.getName())) {
						result.add(customProperty);	
					}
				}
			}
		}
		return result;
	}

	
	public class CatalogManagerConfiguration implements ICatalogManagerConfiguration {

		public boolean canBeManaged(final EObject root) {
			return root instanceof FacetSet;
		}

		public boolean isValid(final EObject root) {
			boolean result = false;
			if (root instanceof FacetSet) {
				final FacetSet customProperties = (FacetSet) root;
				// We have to force the integrator to use the suffix
				// "customproperties" to name them facetSet declaring custom
				// properties. Otherwise we won't be able to know if a facetSet is a
				// custom property declaration
				result = customProperties.getName().endsWith(CUSTOM_SUFIX);
			}
			return result;
		}

	}

}