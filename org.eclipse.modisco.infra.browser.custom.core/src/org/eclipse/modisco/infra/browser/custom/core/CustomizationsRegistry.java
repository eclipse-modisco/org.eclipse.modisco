/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.core;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class CustomizationsRegistry {



	private static CustomizationsRegistry instance = null;

	private final List<URL> uiCustomURLS = new ArrayList<URL>();
	private final List<URL> uiCustomDefaultURLS = new ArrayList<URL>();

	private CustomizationsRegistry() {
		// nothing
	}

	public static CustomizationsRegistry getInstance() {
		if (CustomizationsRegistry.instance == null) {
			CustomizationsRegistry.instance = new CustomizationsRegistry();
		}
		return CustomizationsRegistry.instance;
	}

	public List<URL> getUiCustomURLS() {
		return this.uiCustomURLS;
	}

	public List<URL> getUiCustomDefaultURLS() {
		return this.uiCustomDefaultURLS;
	}

}
