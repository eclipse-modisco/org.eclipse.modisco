/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author GBarbier
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.messages"; //$NON-NLS-1$
	public static String DependenciesEditor_incorrectInputType;
	public static String DependenciesEditor_modelPartName;
	public static String DependenciesEditor_packagePartName;
	public static String DependenciesEditor_partName;
	public static String DependenciesEditor_typePartName;
	public static String PrefuseGraphInput_title;
	public static String PrefuseGraphInput_tooltip;
	public static String DisplayDependenciesHandler_discoverJavaProject;
	public static String DisplayDependenciesHandler_openJavaModelFile;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
