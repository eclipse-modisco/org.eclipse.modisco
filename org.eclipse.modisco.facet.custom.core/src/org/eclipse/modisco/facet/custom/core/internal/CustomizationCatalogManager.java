/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Grégoire Dupé (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *      Grégoire Dupé (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Nicolas Bros (Mia-Software) - Bug 372626 - Aggregates
 *      Grégoire Dupé (Mia-Software) - Bug 373078 - API Cleaning
 *      Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model 
 *      Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 */
package org.eclipse.modisco.facet.custom.core.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.custom.core.ICustomizationCatalogManager;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManager;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManagerConfiguration;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManagerFactory;

/**
 * Customization catalog implementation using the catalog manager features provided by the plug-in
 * org.eclipse.modisco.facet.util.emf.core
 * 
 * @author Grégoire Dupé
 * 
 */
public class CustomizationCatalogManager implements
		ICustomizationCatalogManager {

	private final ICatalogManager catalogMgr;

	public CustomizationCatalogManager(final ResourceSet resourceSet) {
		final ICatalogManagerConfiguration catalogMgrConfig = 
				new CatalogManagerConfiguration();
		this.catalogMgr = ICatalogManagerFactory.DEFAULT.getOrCreateCatalogManager(
				catalogMgrConfig, resourceSet, this.getClass().getName());
	}
	

	public List<Customization> getCustomizationsByName(final String name) {
		final List<Customization> result = new ArrayList<Customization>();
		for (EObject eObject : this.catalogMgr.getInstalledEntries(EObject.class)) {
			if (eObject instanceof Customization) {
				final Customization customization = (Customization) eObject;
				if (name.equals(customization.getName())) {
					result.add(customization);
				}
			} else {
				throw new RuntimeException("Only customizations (and aggregates) must be stored in the customization catalog"); //$NON-NLS-1$
			}
		}
		return result;
	}

	public void registerCustomization(final Customization customization) {
		this.catalogMgr.addWsEntry(customization);
	}

	public List<Customization> getCustomizationsApplicableOn(
			final Collection<EObject> eObjects) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Customization> getRegisteredCustomizations() {
		final List<Customization> result = new ArrayList<Customization>();
		final List<EObject> installedEntries = this.catalogMgr
				.getInstalledEntries(EObject.class);
		for (EObject eObject : installedEntries) {
			if (eObject instanceof Customization) {
				final Customization customization = (Customization) eObject;
				result.add(customization);
			} else {
				throw new RuntimeException("Only customizations (and aggregates) must be stored in the customization catalog"); //$NON-NLS-1$
			}
		}
		return Collections.unmodifiableList(result);
	}

	public class CatalogManagerConfiguration implements ICatalogManagerConfiguration {

		public boolean canBeManaged(final EObject root) {
			return root instanceof Customization;
		}

		public boolean isValid(final EObject root) {
			return true;
		}

	}

}
