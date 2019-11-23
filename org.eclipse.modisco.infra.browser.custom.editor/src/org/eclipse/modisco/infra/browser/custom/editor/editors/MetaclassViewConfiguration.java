/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.editor.editors;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.modisco.infra.browser.custom.editor.Activator;

/** Display options for the metaclass viewer. */
public class MetaclassViewConfiguration {

	private static final String SORT_LINKS_SETTING = "sortLinks"; //$NON-NLS-1$
	private static final String SORT_LINKS_BY_TYPE_SETTING = "sortLinksByType"; //$NON-NLS-1$
	private static final String SHOW_DERIVED_LINKS_SETTING = "showDerivedLinks"; //$NON-NLS-1$
	private static final String SHOW_FULL_QUALIFIED_NAMES_SETTING = "showFullQualifiedNames"; //$NON-NLS-1$
	private static final String SHOW_MULTIPLICITY_SETTING = "showMultiplicity"; //$NON-NLS-1$

	/** Sort links by name in the tree? */
	private boolean sortLinks = false;
	/** Sort links by type in the tree? */
	private boolean sortLinksByType = false;
	/** Show derived links (links computed from other links) */
	private boolean showDerivedLinks = false;
	/** Show full qualified names or short names of metaclasses? */
	private boolean showMetaclassesFullQualifiedNames = false;
	/** Show multiplicity? */
	private boolean showMultiplicity = false;

	public void setSortLinks(final boolean sortLinks) {
		this.sortLinks = sortLinks;
	}

	public boolean isSortLinks() {
		return this.sortLinks;
	}

	public void setSortLinksByType(final boolean sortLinksByType) {
		this.sortLinksByType = sortLinksByType;
	}

	public boolean isSortLinksByType() {
		return this.sortLinksByType;
	}

	public void setShowDerivedLinks(final boolean showDerivedLinks) {
		this.showDerivedLinks = showDerivedLinks;
	}

	public boolean isShowDerivedLinks() {
		return this.showDerivedLinks;
	}

	public void setShowMetaclassesFullQualifiedNames(final boolean showMetaclassesFullQualifiedNames) {
		this.showMetaclassesFullQualifiedNames = showMetaclassesFullQualifiedNames;
	}

	public boolean isShowMetaclassesFullQualifiedNames() {
		return this.showMetaclassesFullQualifiedNames;
	}

	public void setShowMultiplicity(final boolean showMultiplicity) {
		this.showMultiplicity = showMultiplicity;
	}

	public boolean isShowMultiplicity() {
		return this.showMultiplicity;
	}

	/** Load user settings */
	public void load() {
		final IDialogSettings dialogSettings = Activator.getDefault().getDialogSettings();

		this.showDerivedLinks = getPreference(
				MetaclassViewConfiguration.SHOW_DERIVED_LINKS_SETTING, true, dialogSettings);
		this.sortLinks = getPreference(MetaclassViewConfiguration.SORT_LINKS_SETTING, false,
				dialogSettings);
		this.sortLinksByType = getPreference(MetaclassViewConfiguration.SORT_LINKS_BY_TYPE_SETTING,
				false, dialogSettings);
		this.showMultiplicity = getPreference(MetaclassViewConfiguration.SHOW_MULTIPLICITY_SETTING,
				false, dialogSettings);
		this.showMetaclassesFullQualifiedNames = getPreference(
				MetaclassViewConfiguration.SHOW_FULL_QUALIFIED_NAMES_SETTING, false, dialogSettings);
	}

	private boolean getPreference(final String settingKey, final boolean defaultValue,
			final IDialogSettings dialogSettings) {
		final String value = dialogSettings.get(settingKey);
		if (value == null) {
			return defaultValue;
		}
		return Boolean.valueOf(value).booleanValue();
	}

	/** Save user settings */
	public void save() {
		final IDialogSettings dialogSettings = Activator.getDefault().getDialogSettings();
		dialogSettings.put(MetaclassViewConfiguration.SHOW_DERIVED_LINKS_SETTING,
				this.showDerivedLinks);
		dialogSettings.put(MetaclassViewConfiguration.SORT_LINKS_SETTING, this.sortLinks);
		dialogSettings.put(MetaclassViewConfiguration.SORT_LINKS_BY_TYPE_SETTING,
				this.sortLinksByType);
		dialogSettings.put(MetaclassViewConfiguration.SHOW_FULL_QUALIFIED_NAMES_SETTING,
				this.showMetaclassesFullQualifiedNames);
		dialogSettings.put(MetaclassViewConfiguration.SHOW_MULTIPLICITY_SETTING,
				this.showMultiplicity);
	}
}
