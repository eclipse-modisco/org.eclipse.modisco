/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore;

import java.util.Collections;
import java.util.List;

import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.CustomTreePainter;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ItemsFactory;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Tree;

/**
 * This is a facade to the {@link CustomizationEngine}, {@link AppearanceConfiguration}, and
 * {@link FacetContext}. An instance of this class must be passed to
 * {@link CustomizableModelContentProvider} and {@link CustomizableModelLabelProvider}.
 * <p>
 * Note that you must call {@link CustomizationManager#installCustomPainter(Tree)
 * installCustomPainter} for all customizations to be displayed properly.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomizationManager {
	private final AppearanceConfiguration appearanceConfiguration;

	public CustomizationManager() {
		this.appearanceConfiguration = new AppearanceConfiguration(new ItemsFactory());
	}

	/**
	 * Install a {@link CustomTreePainter} on the given {@link Tree}.
	 * <p>
	 * This custom painter is necessary to display some customizations, like underlined,
	 * struckthrough, and Facet overlay icons.
	 */
	public void installCustomPainter(final Tree tree) {
		@SuppressWarnings("unused")
		CustomTreePainter customTreePainter = new CustomTreePainter(tree,
				this.appearanceConfiguration);
	}

	/**
	 * Adds the given customization to the engine. Once all customizations are added,
	 * {@link CustomizationManager#loadCustomizations() loadCustomizations} must be called to
	 * effectively load the registered customizations.
	 * <p>
	 * Customizations should be retrieved from the {@link CustomizationsCatalog}.
	 *
	 * @param customization
	 *            a customization root object, defined from metamodel
	 *            "http://www.eclipse.org/MoDisco/infra/browser/custom/0.8".
	 */
	public void registerCustomization(final MetamodelView customization) {
		this.appearanceConfiguration.getCustomizationEngine().registerCustomization(customization);
	}

	// /**
	// * Adds the customization defined in the given file to the engine. Once
	// all
	// * customizations are added,
	// * {@link CustomizationManager#loadCustomizations() loadCustomizations}
	// must
	// * be called to effectively load the registered customizations.
	// *
	// * @param customizationFile
	// * a file with the "uiCustom" extension, that contains a
	// * customization that follows the metamodel
	// * "http://www.eclipse.org/MoDisco/infra/browser/custom/0.8".
	// */
	// public void registerCustomization(final IFile customizationFile) throws
	// IOException {
	// final ResourceSet resourceSet = new ResourceSetImpl();
	// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	// CustomizationsCatalog.FILE_EXTENSION, new XMIResourceFactoryImpl());
	// final URI uri =
	// URI.createURI(customizationFile.getLocationURI().toString());
	// final Resource resource = resourceSet.createResource(uri);
	// resource.load(null);
	// final MetamodelView metamodelView = (MetamodelView)
	// resource.getContents().get(0);
	// registerCustomization(metamodelView);
	// }

	/**
	 * Loads or reloads the customizations registered by
	 * {@link CustomizationManager#registerCustomization(MetamodelView) registerCustomization}.
	 * <p>
	 * <strong>note:</strong> this method should be called after all {@link Facet}s are loaded,
	 * because customizations can reference {@link Facet}s.
	 */
	public void loadCustomizations() {
		this.appearanceConfiguration.getCustomizationEngine().loadCustomizations();
	}

	/** Removes all customizations */
	public void clearCustomizations() {
		this.appearanceConfiguration.getCustomizationEngine().clear();
	}

	/** Get registered customizations */
	public List<MetamodelView> getRegisteredCustomizations() {
		return Collections.unmodifiableList(this.appearanceConfiguration.getCustomizationEngine()
				.getRegisteredCustomizations());
	}

	/**
	 * Loads the given Facet.
	 * <p>
	 * Facets should be retrieved from the {@link FacetSetCatalog}.
	 */
	public void loadFacet(final Facet facet) {
		this.appearanceConfiguration.loadFacet(facet);
	}

	/** Removes all Facets */
	public void clearFacets() {
		this.appearanceConfiguration.clearFacets();
	}

	// package-private
	AppearanceConfiguration getAppearanceConfiguration() {
		return this.appearanceConfiguration;
	}

	public boolean isShowEmptyLinks() {
		return this.appearanceConfiguration.isShowEmptyLinks();
	}

	public void setShowEmptyLinks(final boolean showEmptyLinks) {
		this.appearanceConfiguration.setShowEmptyLinks(showEmptyLinks);
	}

	public boolean isSortInstances() {
		return this.appearanceConfiguration.isSortInstances();
	}

	public void setSortInstances(final boolean sortInstances) {
		this.appearanceConfiguration.setSortInstances(sortInstances);
	}

	public boolean isShowDerivedLinks() {
		return this.appearanceConfiguration.isShowDerivedLinks();
	}

	public void setShowDerivedLinks(final boolean showDerivedLinks) {
		this.appearanceConfiguration.setShowDerivedLinks(showDerivedLinks);
	}

	public boolean isShowFullQualifiedNames() {
		return this.appearanceConfiguration.isShowFullQualifiedNames();
	}

	public void setShowFullQualifiedNames(final boolean showFullQualifiedNames) {
		this.appearanceConfiguration.setShowFullQualifiedNames(showFullQualifiedNames);
	}

	public boolean isShowMultiplicity() {
		return this.appearanceConfiguration.isShowMultiplicity();
	}

	public void setShowMultiplicity(final boolean showMultiplicity) {
		this.appearanceConfiguration.setShowMultiplicity(showMultiplicity);
	}

	public boolean isShowOppositeLinks() {
		return this.appearanceConfiguration.isShowOppositeLinks();
	}

	public void setShowOppositeLinks(final boolean showOppositeLinks) {
		this.appearanceConfiguration.setShowOppositeLinks(showOppositeLinks);
	}

	public boolean isShowContainer() {
		return this.appearanceConfiguration.isShowContainer();
	}

	public void setShowContainer(final boolean showContainer) {
		this.appearanceConfiguration.setShowContainer(showContainer);
	}

	public boolean isSortLinks() {
		return this.appearanceConfiguration.isSortLinks();
	}

	public void setSortLinks(final boolean value) {
		this.appearanceConfiguration.setSortLinks(value);
	}

	public void setSortLinksByType(final boolean value) {
		this.appearanceConfiguration.setSortLinksByType(value);
	}

	public boolean isSortLinksByType() {
		return this.appearanceConfiguration.isSortLinksByType();
	}

	public void setShowAttributes(final boolean value) {
		this.appearanceConfiguration.setShowAttributes(value);
	}

	public boolean isShowAttributes() {
		return this.appearanceConfiguration.isShowAttributes();
	}

	public void setShowEmptyAttributes(final boolean value) {
		this.appearanceConfiguration.setShowEmptyAttributes(value);
	}

	public boolean isShowEmptyAttributes() {
		return this.appearanceConfiguration.isShowEmptyAttributes();
	}

	public void setShowOrdering(final boolean value) {
		this.appearanceConfiguration.setShowOrdering(value);
	}

	public boolean isShowOrdering() {
		return this.appearanceConfiguration.isShowOrdering();
	}

	public void setShowTypeOfLinks(final boolean value) {
		this.appearanceConfiguration.setShowTypeOfLinks(value);
	}

	public boolean isShowTypeOfLinks() {
		return this.appearanceConfiguration.isShowTypeOfLinks();
	}

	public void setShowElementIDs(final boolean showElementIDs) {
		this.appearanceConfiguration.setShowElementIDs(showElementIDs);
	}

	public boolean isShowElementIDs() {
		return this.appearanceConfiguration.isShowElementIDs();
	}

	public void setShowURI(final boolean showURI) {
		this.appearanceConfiguration.setShowURI(showURI);
	}

	public boolean isShowURI() {
		return this.appearanceConfiguration.isShowURI();
	}

	public void setFontSizeDelta(final int value) {
		this.appearanceConfiguration.setFontSizeDelta(value);
	}

	public int getFontSizeDelta() {
		return this.appearanceConfiguration.getFontSizeDelta();
	}

	public void setCustomFont(final Font customFont) {
		this.appearanceConfiguration.setCustomFont(customFont);
	}

	public Font getCustomFont() {
		return this.appearanceConfiguration.getCustomFont();
	}

	public void setCustomItalicFont(final Font customItalicFont) {
		this.appearanceConfiguration.setCustomItalicFont(customItalicFont);
	}

	public Font getCustomItalicFont() {
		return this.appearanceConfiguration.getCustomItalicFont();
	}
}
