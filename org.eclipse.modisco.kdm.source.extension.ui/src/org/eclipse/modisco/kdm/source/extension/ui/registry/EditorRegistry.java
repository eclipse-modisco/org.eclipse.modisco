/**
 * *******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.kdm.source.extension.ui.registry;

public final class EditorRegistry {

	public static final String EXTENSION_POINT_STRATEGY_SOURCE_ID = "org.eclipse.modisco.kdm.source.extension.ui.source.strategy"; //$NON-NLS-1$
	public static final String EXTENSION_POINT_STRATEGY_REVEALING_ID = "org.eclipse.modisco.kdm.source.extension.ui.revealing.strategy"; //$NON-NLS-1$

	public static final String METAMODEL = "meta-model"; //$NON-NLS-1$
	public static final String CLASS = "class"; //$NON-NLS-1$

	private static EditorRegistry instance;

	private EditorRegistry() {
		// not instantiable
	}

	public static EditorRegistry getInstance() {
		if (EditorRegistry.instance == null) {
			EditorRegistry.instance = new EditorRegistry();
		}
		return EditorRegistry.instance;
	}

}
