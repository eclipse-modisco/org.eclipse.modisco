/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.actions;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.TypeView;
import org.eclipse.modisco.infra.browser.dialogs.LoadCustomizationsDialog;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.osgi.util.NLS;

public class LoadCustomizationsAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public LoadCustomizationsAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.BrowserActionBarContributor_loadCustomization, IAction.AS_PUSH_BUTTON);
		setToolTipText(Messages.BrowserActionBarContributor_loadCustomization);
		setImageDescriptor(ImageProvider.getInstance().getAddUiCustomIconDescriptor());
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public void run() {

		final EcoreBrowser browser = this.browserActionBarContributor.getBrowser();
		if (browser != null) {
			final List<MetamodelView> registeredCustomizations = browser.getBrowserConfiguration()
					.getAppearanceConfiguration().getCustomizationEngine()
					.getRegisteredCustomizations();

			final LoadCustomizationsDialog loadCustomizationsDialog = new LoadCustomizationsDialog(
					browser.getSite().getShell(), registeredCustomizations,
					browser.getReferencedEPackages());
			if (loadCustomizationsDialog.open() == Window.OK) {
				try {
					List<MetamodelView> selectedCustomizations = loadCustomizationsDialog
							.getSelectedCustomizations();

					if (loadCustomizationsDialog.isLoadRequiredFacetsSelected()) {
						// load facets corresponding to customizations
						loadFacetsForCustomizations(selectedCustomizations, browser);
					}

					browser.loadCustomizations(selectedCustomizations);

				} catch (final Exception e) {
					MoDiscoBrowserPlugin.logException(
							Messages.BrowserActionBarContributor_loadingCustomizationFailed, e);
				}
			}
		}
	}

	private void loadFacetsForCustomizations(final List<MetamodelView> customizations,
			final EcoreBrowser browser) {
		final Set<Facet> referencedFacets = new HashSet<Facet>();
		final Collection<FacetSet> facetSets = FacetSetCatalog.getSingleton().getAllFacetSets();

		for (MetamodelView customization : customizations) {
			String metamodelURI = customization.getMetamodelURI();
			// find customized FacetSet
			FacetSet customizedFacetSet = null;
			if (metamodelURI != null) {
				for (FacetSet facetSet : facetSets) {
					if (metamodelURI.equals(facetSet.getNsURI())) {
						customizedFacetSet = facetSet;
						break;
					}
				}
			}
			if (customizedFacetSet == null) {
				continue;
			}

			// find customized Facets
			EList<TypeView> types = customization.getTypes();
			for (TypeView typeView : types) {
				String metaclassName = typeView.getMetaclassName();
				Facet facet = findFacetWithFullyQualifiedName(metaclassName, customizedFacetSet);
				if (facet != null) {
					referencedFacets.add(facet);
				} else {
					MoDiscoBrowserPlugin.logWarning(NLS.bind(
							Messages.BrowserActionBarContributor_missingRequiredFacet,
							new Object[] { metaclassName, customizedFacetSet.getName(),
									customization.getName() }));
				}
			}

			LoadFacetsAction.loadFacets(referencedFacets, browser);
		}
	}

	private Facet findFacetWithFullyQualifiedName(final String metaclassName,
			final FacetSet customizedFacetSet) {
		EList<Facet> facets = customizedFacetSet.getFacets();
		for (Facet facet : facets) {
			String facetName = ModelUtils.getMetaclassQualifiedName(facet);
			if (metaclassName.equals(facetName)) {
				return facet;
			}
		}
		return null;
	}

}
