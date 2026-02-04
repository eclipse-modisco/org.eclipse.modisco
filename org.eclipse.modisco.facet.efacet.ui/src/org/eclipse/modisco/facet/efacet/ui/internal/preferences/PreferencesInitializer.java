/**
 * Copyright (c) 2012, 2019 CEA-LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  Vincent Lorenzo (CEA-LIST) - Bug 357621 - Improve the label displayed for Customization and Facets
 */
package org.eclipse.modisco.facet.efacet.ui.internal.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.modisco.facet.efacet.ui.internal.Activator;
import org.eclipse.modisco.facet.efacet.ui.internal.widget.ETypedElementSelectionControl;

public class PreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.TE_SELECTION_TAB,ETypedElementSelectionControl.TAB_ID );
	}

}
