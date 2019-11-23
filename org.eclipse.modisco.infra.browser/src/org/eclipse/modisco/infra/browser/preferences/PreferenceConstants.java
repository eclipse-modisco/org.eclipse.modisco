/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.preferences;

/**
 * Constant definitions for Browser plug-in preferences
 */
public final class PreferenceConstants {

	private PreferenceConstants() {
		// constants class: no need to instantiate
	}

	/**
	 * The depth to load resources in the MoDisco model browser (-1 for maximum
	 * depth)
	 */
	public static final String P_BROWSER_LOADING_DEPTH = "browser_loading_depth"; //$NON-NLS-1$
	/**
	 * Whether to ask the depth to load resources in the MoDisco model browser
	 * each time a model is opened
	 */
	public static final String P_BROWSER_ASK_LOADING_DEPTH = "browser_ask_loading_depth"; //$NON-NLS-1$

	/**
	 * Whether user settings override settings defined in the "loadingDepth"
	 * extension point
	 */
	public static final String P_BROWSER_OVERRIDE_METAMODEL_SPECIFIC_SETTINGS = "override_metamodel_specific_settings"; //$NON-NLS-1$

	/**
	 * Whether to ask the user whether to enable the derived links when adding a
	 * Facet
	 */
	public static final String P_BROWSER_ENABLE_DERIVED_LINKS_SETTING = "enable_derived_links_prompt"; //$NON-NLS-1$
	public static final String P_BROWSER_ENABLE_DERIVED_LINKS_ASK = "enable_derived_links_ask"; //$NON-NLS-1$
	public static final String P_BROWSER_ENABLE_DERIVED_LINKS_ALWAYS = "enable_derived_links_always"; //$NON-NLS-1$
	public static final String P_BROWSER_ENABLE_DERIVED_LINKS_NEVER = "enable_derived_links_never"; //$NON-NLS-1$
}
