/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.examples.cnf;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.modisco.infra.browser.uicore.CustomizationManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * @deprecated Will be replaced by EMF Facet,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.modisco.infra.browser.cnf"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private CustomizationManager fCustomizationManager;

	public Activator() {
		// nothing
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		Activator.plugin = this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		Activator.plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return Activator.plugin;
	}

	public CustomizationManager getCustomizationManager() {
		if (this.fCustomizationManager == null) {
			this.fCustomizationManager = new CustomizationManager();
			init(this.fCustomizationManager);
		}
		return this.fCustomizationManager;
	}

	private void init(final CustomizationManager customizationManager) {
		// the appearance can be customized here:
		// customizationManager.setShowEmptyLinks(true);
		// customizationManager.setShowAttributes(true);
		try {
			// FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet(
			//					"MyFacet"); //$NON-NLS-1$
			// if (facetSet != null) {
			// EList<Facet> facets = facetSet.getFacets();
			// for (Facet facet : facets) {
			// getCustomizationManager().loadFacet(facet);
			// }
			// }

			// Collection<MetamodelView> allCustomizations =
			// CustomizationsCatalog.getInstance()
			// .getAllCustomizations();
			// for (MetamodelView metamodelView : allCustomizations) {
			//				if ("javaTypesCustomizationFacet".equals(metamodelView.getName())) { //$NON-NLS-1$
			// getCustomizationManager().registerCustomization(metamodelView);
			// }
			// }

			// load customizations defined as default through the customization extension
			List<MetamodelView> registryDefaultCustomizations = CustomizationsCatalog.getInstance()
					.getRegistryDefaultCustomizations();
			for (MetamodelView metamodelView : registryDefaultCustomizations) {
				customizationManager.registerCustomization(metamodelView);
			}
			customizationManager.loadCustomizations();
		} catch (Throwable e) {
			Activator.getDefault().getLog().log(
					new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Error initializing customizations", e)); //$NON-NLS-1$
		}
	}
}
