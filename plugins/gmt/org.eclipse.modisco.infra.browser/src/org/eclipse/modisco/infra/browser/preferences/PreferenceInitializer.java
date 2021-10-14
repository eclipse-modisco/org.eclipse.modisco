/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;

/**
 * Class used to initialize default preference values for the Browser.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = MoDiscoBrowserPlugin.getPlugin().getPreferenceStore();
		// general rule is to keep the same behavior as EMF by default
		store.setDefault(PreferenceConstants.P_BROWSER_ASK_LOADING_DEPTH, false);
		store.setDefault(PreferenceConstants.P_BROWSER_LOADING_DEPTH, 0);
		store.setDefault(PreferenceConstants.P_BROWSER_OVERRIDE_METAMODEL_SPECIFIC_SETTINGS, false);
		store.setDefault(PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_SETTING,
				PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_ASK);
	}

}
