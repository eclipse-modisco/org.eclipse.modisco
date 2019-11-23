/*******************************************************************************
 * Copyright (c) 2015 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Thomas Cicognani (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets 
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal.action;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.facet.custom.core.ICustomizationCatalogManager;
import org.eclipse.modisco.facet.custom.core.ICustomizationCatalogManagerFactory;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.efacet.ui.FacetSetShortcutActionUtils;

public class ShortcutCustomAction extends Action {

	private final String actionId;
	private final ICustomizationManager customManager;

	public ShortcutCustomAction(final String actionId, final String label,
			final ImageDescriptor imageDescriptor,
			final ICustomizationManager customManager) {
		super(label, AS_CHECK_BOX);
		this.actionId = actionId;
		this.customManager = customManager;
		FacetSetShortcutActionUtils.setImageDescriptor(this, imageDescriptor);
	}

	@Override
	public void run() {
		FacetSetShortcutActionUtils.runAction(this, this.actionId,
				getAvailableFacetSets(), getAppliedFacetSets());
	}

	private Set<Customization> getAvailableFacetSets() {
		final ResourceSet resourceSet = this.customManager.getResourceSet();
		final ICustomizationCatalogManager catalog = ICustomizationCatalogManagerFactory.DEFAULT
				.getOrCreateCustomizationCatalogManager(resourceSet);
		final Set<Customization> availableCustoms = new HashSet<Customization>();
		availableCustoms.addAll(catalog.getRegisteredCustomizations());
		availableCustoms.addAll(this.customManager.getManagedCustomizations());
		return availableCustoms;
	}

	private List<Customization> getAppliedFacetSets() {
		return this.customManager.getManagedCustomizations();
	}

}
