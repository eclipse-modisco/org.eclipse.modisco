/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Handles saving and restoring browser settings. Settings are saved when the
 * corresponding Eclipse editor is closed.
 */
public class BrowserSettingsPersistence implements IPartListener {
	private static final String MODISCO_BROWSER_SETTINGS = "MoDiscoModelBrowserSettings"; //$NON-NLS-1$
	private static final String LAST_APPLIED_FACETS_SETTINGS = "LastAppliedFacets"; //$NON-NLS-1$
	private static final String LAST_APPLIED_CUSTOMIZATIONS_SETTINGS = "LastAppliedCustomizations"; //$NON-NLS-1$
	private final String metamodelURI;
	private final IWorkbenchPart fPart;
	private final BrowserConfiguration browserConfiguration;

	/**
	 * @param metamodelURI
	 *            the metamodel for which settings will be saved
	 * @param part
	 *            when this part is closed, the settings will be saved to disk
	 * @param browserConfiguration
	 *            the browser configuration that will be saved when the part is
	 *            closed
	 */
	public BrowserSettingsPersistence(final String metamodelURI, final IWorkbenchPart part,
			final BrowserConfiguration browserConfiguration) {
		this.metamodelURI = metamodelURI;
		this.fPart = part;
		this.browserConfiguration = browserConfiguration;

		// register close listener to save user settings when editor is closed
		part.getSite().getPage().addPartListener(this);
	}

	/**
	 * @return the dialog settings section for the current metamodel
	 */
	public IDialogSettings loadLastSettingsForCurrentMetamodel() {
		try {
			String filename = getSettingsFilename();
			DialogSettings settings = new DialogSettings(
					BrowserSettingsPersistence.MODISCO_BROWSER_SETTINGS);
			if (new File(filename).isFile()) {
				settings.load(filename);
				if (this.metamodelURI != null) {
					return settings.getSection(this.metamodelURI);
				}
			}
		} catch (Exception e) {
			MoDiscoBrowserPlugin.logException(e);
		}
		return null;
	}

	/**
	 * Get the {@link Facet}s that were previously applied on a model instance
	 * of the same metamodel
	 */
	public List<Facet> getLastFacets(final IDialogSettings settingsForCurrentMetamodel) {
		if (settingsForCurrentMetamodel == null) {
			return Collections.emptyList();
		}
		String[] lastFacetNames = settingsForCurrentMetamodel
				.getArray(BrowserSettingsPersistence.LAST_APPLIED_FACETS_SETTINGS);
		if (lastFacetNames == null) {
			return Collections.emptyList();
		}
		List<Facet> facetsToLoad = new ArrayList<Facet>();
		final Collection<FacetSet> facetSets = FacetSetCatalog.getSingleton().getAllFacetSets();
		for (FacetSet facetSet : facetSets) {
			EList<Facet> facets = facetSet.getFacets();
			for (Facet facet : facets) {
				String name = facetSet.getName() + "#" + facet.getName(); //$NON-NLS-1$
				for (String lastFacetName : lastFacetNames) {
					if (name.equals(lastFacetName)) {
						facetsToLoad.add(facet);
						break;
					}
				}
			}
		}
		return facetsToLoad;
	}

	/**
	 * Save the currently applied {@link Facet}s
	 *
	 * @param sectionForCurrentMetamodel
	 */
	private void saveLastFacetNames(final IDialogSettings sectionForCurrentMetamodel) {
		Collection<Facet> appliedFacets = this.browserConfiguration.getAppearanceConfiguration().getFacetContext().getAppliedFacets();
		String[] facetNames = new String[appliedFacets.size()];
		Iterator<Facet> facetsIterator = appliedFacets.iterator();
		for (int i = 0; i < appliedFacets.size(); i++) {
			Facet facet = facetsIterator.next();
			FacetSet facetSet = facet.getFacetSet();
			facetNames[i] = facetSet.getName() + "#" + facet.getName(); //$NON-NLS-1$
		}

		sectionForCurrentMetamodel.put(BrowserSettingsPersistence.LAST_APPLIED_FACETS_SETTINGS,
				facetNames);
	}

	/**
	 * Get the customizations that were previously applied on a model instance
	 * of the same metamodel
	 */
	public List<MetamodelView> getLastCustomizations(
			final IDialogSettings settingsForCurrentMetamodel) {
		if (settingsForCurrentMetamodel == null) {
			return Collections.emptyList();
		}
		String[] lastCustomizationNames = settingsForCurrentMetamodel
				.getArray(BrowserSettingsPersistence.LAST_APPLIED_CUSTOMIZATIONS_SETTINGS);
		if (lastCustomizationNames == null) {
			return Collections.emptyList();
		}
		List<MetamodelView> customizationsToLoad = new ArrayList<MetamodelView>();
		Collection<MetamodelView> allCustomizations = CustomizationsCatalog.getInstance()
				.getAllCustomizations();
		for (MetamodelView metamodelView : allCustomizations) {
			String name = metamodelView.getName();
			if (name != null) {
				for (String lastCustomizationName : lastCustomizationNames) {
					if (name.equals(lastCustomizationName)) {
						customizationsToLoad.add(metamodelView);
						break;
					}
				}
			}
		}
		return customizationsToLoad;
	}

	/** Save the currently applied customizations */
	private void saveLastCustomizationNames(final IDialogSettings sectionForCurrentMetamodel) {
		List<MetamodelView> customizations = this.browserConfiguration.getAppearanceConfiguration().getCustomizationEngine()
				.getRegisteredCustomizations();
		String[] customizationNames = new String[customizations.size()];
		for (int i = 0; i < customizations.size(); i++) {
			customizationNames[i] = customizations.get(i).getName();
		}

		sectionForCurrentMetamodel
				.put(BrowserSettingsPersistence.LAST_APPLIED_CUSTOMIZATIONS_SETTINGS,
						customizationNames);
	}

	private String getSettingsFilename() {
		IPath stateLocation = MoDiscoBrowserPlugin.getPlugin().getStateLocation();
		String filename = stateLocation.append(BrowserSettingsPersistence.MODISCO_BROWSER_SETTINGS)
				.toOSString();
		return filename;
	}

	public void partClosed(final IWorkbenchPart part) {
		if (part == this.fPart) {
			this.browserConfiguration.getAppearanceConfiguration().save();

			try {
				if (this.metamodelURI != null) {
					String filename = getSettingsFilename();
					DialogSettings settings = new DialogSettings(
							BrowserSettingsPersistence.MODISCO_BROWSER_SETTINGS);

					if (new File(filename).isFile()) {
						try {
							settings.load(filename);
						} catch (IOException e) {
							MoDiscoLogger.logWarning(e,
									"previous browser settings couldn't be loaded", //$NON-NLS-1$
									MoDiscoBrowserPlugin.getPlugin());
						}
					}

					IDialogSettings section = settings.getSection(this.metamodelURI);
					if (section == null) {
						section = settings.addNewSection(this.metamodelURI);
					}

					saveLastFacetNames(section);
					saveLastCustomizationNames(section);

					settings.save(filename);
				} else {
					MoDiscoLogger.logError("couldn't find metamodel URI; " //$NON-NLS-1$
							+ "skipped saving settings", MoDiscoBrowserPlugin.getPlugin()); //$NON-NLS-1$
				}

			} catch (Exception e) {
				MoDiscoBrowserPlugin.logException(e);
			}

			this.fPart.getSite().getPage().removePartListener(this);
		}
	}

	public void partActivated(final IWorkbenchPart part) {
		// nothing
	}

	public void partDeactivated(final IWorkbenchPart part) {
		// nothing
	}

	public void partOpened(final IWorkbenchPart part) {
		// nothing
	}

	public void partBroughtToTop(final IWorkbenchPart part) {
		// nothing
	}
}
