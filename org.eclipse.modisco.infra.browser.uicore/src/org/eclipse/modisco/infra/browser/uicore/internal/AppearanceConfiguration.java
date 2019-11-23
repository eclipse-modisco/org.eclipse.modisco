/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Code Synchronisation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.modisco.infra.browser.uicore.ChangeListener;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ItemsFactory;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * Controls the appearance of the model browser, with:
 * <ul>
 * <li>many options such as whether to show empty links, order elements, etc.
 * <li>the possibility to load Facets
 * <li>access to the {@link CustomizationEngine}, used to customize the appearance of model elements
 * both statically and dynamically
 * </ul>
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class AppearanceConfiguration {

	public enum MetaclassesSortMode {
		ByName, ByCount
	}

	private final List<PropertyChangeListener> listeners = new ArrayList<PropertyChangeListener>();
	private CustomizationEngine customizationEngine;
	private ComposedAdapterFactory adapterFactory;

	/** Property name for the fontSizeDelta property */
	public static final String FONT_SIZE_DELTA_PROP = "fontSizeDelta"; //$NON-NLS-1$

	private static final String SHOW_EMPTY_LINKS_SETTING = "showEmptyLinks"; //$NON-NLS-1$
	private static final String SHOW_DERIVED_LINKS_SETTING = "showDerivedLinks"; //$NON-NLS-1$
	private static final String SORT_INSTANCES_SETTING = "showInstances"; //$NON-NLS-1$
	private static final String SORT_LINKS_SETTING = "sortLinks"; //$NON-NLS-1$
	private static final String SORT_LINKS_BY_TYPE_SETTING = "sortLinksByType"; //$NON-NLS-1$
	private static final String SHOW_FULL_QUALIFIED_NAMES_SETTING = "showFullQualifiedNames"; //$NON-NLS-1$
	private static final String SHOW_MULTIPLICITY_SETTING = "showMultiplicity"; //$NON-NLS-1$
	private static final String SHOW_OPPOSITE_LINKS_SETTING = "showOppositeLinks"; //$NON-NLS-1$
	private static final String SHOW_CONTAINER_SETTING = "showContainer"; //$NON-NLS-1$
	private static final String METACLASSES_SORT_MODE = "metaclassesSortMode"; //$NON-NLS-1$
	private static final String SHOW_METACLASSES_FULL_QUALIFIED_NAMES_SETTING = "showMetaclassesFullQualifiedNames"; //$NON-NLS-1$
	private static final String SHOW_EMPTY_METACLASSES = "showEmptyMetaclasses"; //$NON-NLS-1$
	private static final String GROUP_BY_PACKAGE = "groupByPackage"; //$NON-NLS-1$
	private static final String DISPLAY_INSTANCES_OF_SUBCLASSES = "displayInstancesOfSubclasses"; //$NON-NLS-1$
	private static final String SHOW_DERIVATION_TREE = "showDerivationTree"; //$NON-NLS-1$
	private static final String SHOW_ATTRIBUTES = "showAttributes"; //$NON-NLS-1$
	private static final String SHOW_EMPTY_ATTRIBUTES = "showEmptyAttributes"; //$NON-NLS-1$
	private static final String SHOW_ORDERING = "showOrdering"; //$NON-NLS-1$
	private static final String FONT_SIZE_DELTA = "fontSizeDelta"; //$NON-NLS-1$
	private static final String SHOW_TYPE_OF_LINKS = "showTypeOfLinks"; //$NON-NLS-1$
	private static final String SHOW_ELEMENT_IDS = "showElementIDs"; //$NON-NLS-1$
	private static final String SHOW_URI = "showURI"; //$NON-NLS-1$
	private static final String SYNCHRONIZE_SOURCE_CODE = "synchronizeSourceCode"; //$NON-NLS-1$

	/** show the type declared for the link element **/
	private boolean showTypeOfLinks = false;
	/** Show empty links? */
	private boolean showEmptyLinks = false;
	/** Sort model elements by name in the tree? */
	private boolean sortInstances = false;
	/** Sort links by name in the tree? */
	private boolean sortLinks = false;
	/** Sort links by type in the tree? */
	private boolean sortLinksByType = false;
	/** Show derived links (links computed from other links) */
	private boolean showDerivedLinks = false;
	/** Show full qualified names or short names? */
	private boolean showFullQualifiedNames = false;
	/** Show full qualified names or short names of metaclasses? */
	private boolean showMetaclassesFullQualifiedNames = false;
	/** Show multiplicity? */
	private boolean showMultiplicity = false;
	/** Show opposite links? */
	private boolean showOppositeLinks = false;
	/** Show EMF eContainer as a virtual link? */
	private boolean showContainer = false;
	/** Show metaclasses which don't have any instance in the model? */
	private boolean showEmptyMetaclasses = false;
	/** Whether to display metaclasses grouped by package */
	private boolean groupByPackage = false;
	/**
	 * Whether to display instances on a given metaclass when the element has the type of a subclass
	 */
	private boolean displayInstancesOfSubclasses;
	/** Whether to show metaclasses as a derivation tree */
	private boolean showDerivationTree;
	/** How to sort metaclasses (in the metaclass pane) */
	private MetaclassesSortMode fMetaclassesSortMode = AppearanceConfiguration.MetaclassesSortMode.ByName;
	/** Whether to show attributes as links */
	private boolean showAttributes;
	/** Whether to show empty attributes (null or empty list) */
	private boolean showEmptyAttributes;
	/** Whether to show ordering information */
	private boolean showOrdering;
	/** Whether to show an ID for each element */
	private boolean showElementIDs;
	/** Whether to show the EMF URI as a virtual attribute on each element */
	private boolean showURI;
	/** Whether to enable the synchronization between model element and source code */
	private boolean synchronizeSourceCode;
	/**
	 * The size difference in points between the default font size and the user's preferred size
	 */
	private int fontSizeDelta = 0;

	/**
	 * A font derived from the JFace default font, with a custom size defined by the user
	 */
	private Font customFont = null;
	/**
	 * An italic font derived from the JFace default font, with a custom size defined by the user
	 */
	private Font customItalicFont = null;

	/**
	 * A counter for modifications to the browser configuration. Allows clients of this class to
	 * recompute their cached data when the counter has changed
	 */
	private int modificationCount = 0;
	private final ItemsFactory itemsFactory;

	public AppearanceConfiguration(final ItemsFactory itemsFactory) {
		this.itemsFactory = itemsFactory;
		this.adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		createCustomizationEngine();
	}

	public ItemsFactory getItemsFactory() {
		return this.itemsFactory;
	}

	public boolean isShowEmptyLinks() {
		return this.showEmptyLinks;
	}

	public void setShowEmptyLinks(final boolean showEmptyLinks) {
		this.showEmptyLinks = showEmptyLinks;
		this.modificationCount++;
	}

	public boolean isSortInstances() {
		return this.sortInstances;
	}

	public void setSortInstances(final boolean sortInstances) {
		this.sortInstances = sortInstances;
		this.modificationCount++;
	}

	public boolean isShowDerivedLinks() {
		return this.showDerivedLinks;
	}

	public void setShowDerivedLinks(final boolean showDerivedLinks) {
		this.showDerivedLinks = showDerivedLinks;
		this.modificationCount++;
	}

	public boolean isShowFullQualifiedNames() {
		return this.showFullQualifiedNames;
	}

	public void setShowFullQualifiedNames(final boolean showFullQualifiedNames) {
		this.showFullQualifiedNames = showFullQualifiedNames;
		this.modificationCount++;
	}

	public boolean isShowMultiplicity() {
		return this.showMultiplicity;
	}

	public void setShowMultiplicity(final boolean showMultiplicity) {
		this.showMultiplicity = showMultiplicity;
		this.modificationCount++;
	}

	public boolean isShowOppositeLinks() {
		return this.showOppositeLinks;
	}

	public void setShowOppositeLinks(final boolean showOppositeLinks) {
		this.showOppositeLinks = showOppositeLinks;
		this.modificationCount++;
	}

	public boolean isShowContainer() {
		return this.showContainer;
	}

	public void setShowContainer(final boolean showContainer) {
		this.showContainer = showContainer;
		this.modificationCount++;
	}

	public MetaclassesSortMode getMetaclassesSortMode() {
		return this.fMetaclassesSortMode;
	}

	public void setMetaclassesSortMode(final MetaclassesSortMode mode) {
		this.fMetaclassesSortMode = mode;
		this.modificationCount++;
	}

	public boolean isShowMetaclassesFullQualifiedNames() {
		return this.showMetaclassesFullQualifiedNames;
	}

	public void setShowMetaclassesFullQualifiedNames(final boolean value) {
		this.showMetaclassesFullQualifiedNames = value;
		this.modificationCount++;
	}

	public void setSortLinks(final boolean value) {
		this.sortLinks = value;
		this.modificationCount++;
	}

	public boolean isSortLinks() {
		return this.sortLinks;
	}

	public void setSortLinksByType(final boolean value) {
		this.sortLinksByType = value;
		this.modificationCount++;
	}

	public boolean isSortLinksByType() {
		return this.sortLinksByType;
	}

	public void setShowEmptyMetaclasses(final boolean value) {
		this.showEmptyMetaclasses = value;
		this.modificationCount++;
	}

	public boolean isShowEmptyMetaclasses() {
		return this.showEmptyMetaclasses;
	}

	public void setGroupByPackage(final boolean value) {
		this.groupByPackage = value;
		this.modificationCount++;
	}

	public boolean isGroupByPackage() {
		return this.groupByPackage;
	}

	public void setDisplayInstancesOfSubclasses(final boolean value) {
		this.displayInstancesOfSubclasses = value;
		this.modificationCount++;
	}

	public boolean isDisplayInstancesOfSubclasses() {
		return this.displayInstancesOfSubclasses;
	}

	public void setShowDerivationTree(final boolean value) {
		this.showDerivationTree = value;
		this.modificationCount++;
	}

	public boolean isShowDerivationTree() {
		return this.showDerivationTree;
	}

	public void setShowAttributes(final boolean value) {
		this.showAttributes = value;
		this.modificationCount++;
	}

	public boolean isShowAttributes() {
		return this.showAttributes;
	}

	public void setShowEmptyAttributes(final boolean value) {
		this.showEmptyAttributes = value;
		this.modificationCount++;
	}

	public boolean isShowEmptyAttributes() {
		return this.showEmptyAttributes;
	}

	public void setShowOrdering(final boolean value) {
		this.showOrdering = value;
		this.modificationCount++;
	}

	public boolean isShowOrdering() {
		return this.showOrdering;
	}

	public void setShowTypeOfLinks(final boolean value) {
		this.showTypeOfLinks = value;
		this.modificationCount++;
	}

	public boolean isShowTypeOfLinks() {
		return this.showTypeOfLinks;
	}

	public void setShowElementIDs(final boolean showElementIDs) {
		this.showElementIDs = showElementIDs;
		this.modificationCount++;
	}

	public boolean isShowElementIDs() {
		return this.showElementIDs;
	}

	public void setSynchronizeSourceCode(final boolean synchronizeSourceCode) {
		this.synchronizeSourceCode = synchronizeSourceCode;
		this.modificationCount++;
	}

	public boolean isSynchronizeSourceCode() {
		return this.synchronizeSourceCode;
	}

	public void setShowURI(final boolean showURI) {
		this.showURI = showURI;
		this.modificationCount++;
	}

	public boolean isShowURI() {
		return this.showURI;
	}

	public void setFontSizeDelta(final int value) {
		firePropertyChanged(AppearanceConfiguration.FONT_SIZE_DELTA_PROP, this.fontSizeDelta, value);
		this.fontSizeDelta = value;
		this.modificationCount++;
	}

	public int getFontSizeDelta() {
		return this.fontSizeDelta;
	}

	public void setCustomFont(final Font customFont) {
		if (this.customFont != null && this.customFont != JFaceResources.getDialogFont()
				&& this.customFont != customFont) {
			this.customFont.dispose();
		}
		this.customFont = customFont;
		this.modificationCount++;
	}

	public Font getCustomFont() {
		if (this.customFont == null) {
			this.customFont = JFaceResources.getDialogFont();
		}
		return this.customFont;
	}

	public void setCustomItalicFont(final Font customItalicFont) {
		if (this.customItalicFont != null
				&& this.customItalicFont != JFaceResources.getDialogFont()
				&& this.customItalicFont != customItalicFont) {
			this.customItalicFont.dispose();
		}
		this.customItalicFont = customItalicFont;
		this.modificationCount++;
	}

	public Font getCustomItalicFont() {
		if (this.customItalicFont == null) {
			FontDescriptor descriptor = FontDescriptor.createFrom(getCustomFont());
			descriptor = descriptor.setStyle(SWT.ITALIC);
			this.customItalicFont = descriptor.createFont(Display.getDefault());
		}
		return this.customItalicFont;
	}

	/** Load user settings (settings are global to the workspace) */
	public void load() {
		final IDialogSettings dialogSettings = Activator.getDefault().getDialogSettings();

		this.showEmptyLinks = getPreference(AppearanceConfiguration.SHOW_EMPTY_LINKS_SETTING, true,
				dialogSettings);
		this.showDerivedLinks = getPreference(AppearanceConfiguration.SHOW_DERIVED_LINKS_SETTING,
				true, dialogSettings);
		this.sortInstances = getPreference(AppearanceConfiguration.SORT_INSTANCES_SETTING, false,
				dialogSettings);
		this.sortLinks = getPreference(AppearanceConfiguration.SORT_LINKS_SETTING, false,
				dialogSettings);
		this.sortLinksByType = getPreference(AppearanceConfiguration.SORT_LINKS_BY_TYPE_SETTING,
				false, dialogSettings);
		this.showFullQualifiedNames = getPreference(
				AppearanceConfiguration.SHOW_FULL_QUALIFIED_NAMES_SETTING, false, dialogSettings);
		this.showMultiplicity = getPreference(AppearanceConfiguration.SHOW_MULTIPLICITY_SETTING,
				false, dialogSettings);
		this.showOppositeLinks = getPreference(AppearanceConfiguration.SHOW_OPPOSITE_LINKS_SETTING,
				false, dialogSettings);
		this.showContainer = getPreference(AppearanceConfiguration.SHOW_CONTAINER_SETTING, true,
				dialogSettings);
		this.showMetaclassesFullQualifiedNames = getPreference(
				AppearanceConfiguration.SHOW_METACLASSES_FULL_QUALIFIED_NAMES_SETTING, false,
				dialogSettings);
		this.showEmptyMetaclasses = getPreference(AppearanceConfiguration.SHOW_EMPTY_METACLASSES,
				false, dialogSettings);
		this.groupByPackage = getPreference(AppearanceConfiguration.GROUP_BY_PACKAGE, false,
				dialogSettings);
		this.displayInstancesOfSubclasses = getPreference(
				AppearanceConfiguration.DISPLAY_INSTANCES_OF_SUBCLASSES, false, dialogSettings);
		this.showDerivationTree = getPreference(AppearanceConfiguration.SHOW_DERIVATION_TREE,
				false, dialogSettings);
		this.showAttributes = getPreference(AppearanceConfiguration.SHOW_ATTRIBUTES, true,
				dialogSettings);
		this.showEmptyAttributes = getPreference(AppearanceConfiguration.SHOW_EMPTY_ATTRIBUTES,
				true, dialogSettings);
		this.showOrdering = getPreference(AppearanceConfiguration.SHOW_ORDERING, false,
				dialogSettings);
		this.fontSizeDelta = getPreference(AppearanceConfiguration.FONT_SIZE_DELTA, 0,
				dialogSettings);
		this.showTypeOfLinks = getPreference(AppearanceConfiguration.SHOW_TYPE_OF_LINKS, false,
				dialogSettings);
		this.showElementIDs = getPreference(AppearanceConfiguration.SHOW_ELEMENT_IDS, false,
				dialogSettings);
		this.showURI = getPreference(AppearanceConfiguration.SHOW_URI, false, dialogSettings);
		this.synchronizeSourceCode = getPreference(AppearanceConfiguration.SYNCHRONIZE_SOURCE_CODE,
				false, dialogSettings);

		final String metaclassesSortMode = dialogSettings
				.get(AppearanceConfiguration.METACLASSES_SORT_MODE);
		if (metaclassesSortMode != null) {
			this.fMetaclassesSortMode = AppearanceConfiguration.MetaclassesSortMode
					.valueOf(metaclassesSortMode);
		}
		this.modificationCount++;
	}

	private boolean getPreference(final String settingKey, final boolean defaultValue,
			final IDialogSettings dialogSettings) {
		final String value = dialogSettings.get(settingKey);
		if (value == null) {
			return defaultValue;
		}
		return Boolean.valueOf(value).booleanValue();
	}

	private int getPreference(final String settingKey, final int defaultValue,
			final IDialogSettings dialogSettings) {
		final String value = dialogSettings.get(settingKey);
		if (value == null) {
			return defaultValue;
		}
		try {
			return Integer.parseInt(value);
		} catch (final NumberFormatException e) {
			return defaultValue;
		}
	}

	/** Save user settings (settings are global to the workspace) */
	public void save() {
		final IDialogSettings dialogSettings = Activator.getDefault().getDialogSettings();
		dialogSettings.put(AppearanceConfiguration.SHOW_EMPTY_LINKS_SETTING, this.showEmptyLinks);
		dialogSettings.put(AppearanceConfiguration.SHOW_DERIVED_LINKS_SETTING,
				this.showDerivedLinks);
		dialogSettings.put(AppearanceConfiguration.SORT_INSTANCES_SETTING, this.sortInstances);
		dialogSettings.put(AppearanceConfiguration.SORT_LINKS_SETTING, this.sortLinks);
		dialogSettings
				.put(AppearanceConfiguration.SORT_LINKS_BY_TYPE_SETTING, this.sortLinksByType);
		dialogSettings.put(AppearanceConfiguration.SHOW_FULL_QUALIFIED_NAMES_SETTING,
				this.showFullQualifiedNames);
		dialogSettings
				.put(AppearanceConfiguration.SHOW_MULTIPLICITY_SETTING, this.showMultiplicity);
		dialogSettings.put(AppearanceConfiguration.SHOW_OPPOSITE_LINKS_SETTING,
				this.showOppositeLinks);
		dialogSettings.put(AppearanceConfiguration.SHOW_CONTAINER_SETTING, this.showContainer);
		dialogSettings.put(AppearanceConfiguration.METACLASSES_SORT_MODE,
				this.fMetaclassesSortMode.name());
		dialogSettings.put(AppearanceConfiguration.SHOW_METACLASSES_FULL_QUALIFIED_NAMES_SETTING,
				this.showMetaclassesFullQualifiedNames);
		dialogSettings.put(AppearanceConfiguration.SHOW_EMPTY_METACLASSES,
				this.showEmptyMetaclasses);
		dialogSettings.put(AppearanceConfiguration.GROUP_BY_PACKAGE, this.groupByPackage);
		dialogSettings.put(AppearanceConfiguration.DISPLAY_INSTANCES_OF_SUBCLASSES,
				this.displayInstancesOfSubclasses);
		dialogSettings.put(AppearanceConfiguration.SHOW_DERIVATION_TREE, this.showDerivationTree);
		dialogSettings.put(AppearanceConfiguration.SHOW_ATTRIBUTES, this.showAttributes);
		dialogSettings.put(AppearanceConfiguration.SHOW_EMPTY_ATTRIBUTES, this.showEmptyAttributes);
		dialogSettings.put(AppearanceConfiguration.SHOW_ORDERING, this.showOrdering);
		dialogSettings.put(AppearanceConfiguration.FONT_SIZE_DELTA, this.fontSizeDelta);
		dialogSettings.put(AppearanceConfiguration.SHOW_TYPE_OF_LINKS, this.showTypeOfLinks);
		dialogSettings.put(AppearanceConfiguration.SHOW_ELEMENT_IDS, this.showElementIDs);
		dialogSettings.put(AppearanceConfiguration.SHOW_URI, this.showURI);
		dialogSettings.put(AppearanceConfiguration.SYNCHRONIZE_SOURCE_CODE,
				this.synchronizeSourceCode);
	}

	/** Mark as changed */
	public void touch() {
		this.modificationCount++;
	}

	/**
	 * @return the counter for modifications to the browser configuration. Use it to recompute
	 *         caches when the counter has changed
	 */
	public int getModCount() {
		return this.modificationCount;
	}

	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		this.listeners.add(listener);
	}

	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		this.listeners.remove(listener);
	}

	private void firePropertyChanged(final String propertyName, final int oldValue,
			final int newValue) {
		for (final PropertyChangeListener listener : this.listeners) {
			final PropertyChangeEvent event = new PropertyChangeEvent(this, propertyName,
					Integer.valueOf(oldValue), Integer.valueOf(newValue));
			listener.propertyChange(event);
		}
	}

	public void createCustomizationEngine() {
		this.customizationEngine = new CustomizationEngine();
		this.modificationCount++;
		this.customizationEngine.addChangeListener(new ChangeListener() {
			public void changed() {
				AppearanceConfiguration.this.modificationCount++;
			}
		});
	}

	public CustomizationEngine getCustomizationEngine() {
		return this.customizationEngine;
	}

	private final FacetContext facetContext = new FacetContext();

	public FacetContext getFacetContext() {
		return this.facetContext;
	}

	/**
	 * Loads a facet into the editor's {@link FacetContext}.
	 * <p>
	 * <strong>important:</strong> Once all {@link Facet}s are loaded,
	 * {@link InstancesForMetaclasses#buildDerivationTree()} must be called to account for modified
	 * {@link EClass} derivation tree.
	 */
	public void loadFacet(final Facet facet) {
		try {
			this.facetContext.addFacet(facet);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, "Error loading Facet", Activator.getDefault()); //$NON-NLS-1$
		}
		this.modificationCount++;
	}

	public Collection<Facet> getLoadedFacets() {
		return this.facetContext.getAppliedFacets();
	}

	public void clearFacets() {
		try {
			this.facetContext.clear();
		} catch (Exception e) {
			MoDiscoLogger.logError(e, "Error clearing Facets", Activator.getDefault()); //$NON-NLS-1$
		}
		this.modificationCount++;
	}

	public void setAdapterFactory(final ComposedAdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
		this.modificationCount++;
	}

	public ComposedAdapterFactory getAdapterFactory() {
		return this.adapterFactory;
	}

}
