/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.actions;

import org.eclipse.osgi.util.NLS;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.actions.messages"; //$NON-NLS-1$
	public static String DiscoverDependenciesFromJavaModel_discoveryName;
	public static String DiscoverDependenciesFromJavaModel_javaProjectNotFound;
	public static String DiscoverDependenciesFromJavaProject_discoveryName;
	public static String DiscoverDependenciesFromJavaProject_javaProjectNotFound;
	public static String DiscoverDependenciesFromJdtPackage_discoveryName;
	public static String DiscoverDependenciesFromJdtPackage_javaProjectNotFound;
	public static String DiscoverDependenciesFromJdtType_discoveryName;
	public static String DiscoverDependenciesFromJdtType_javaProjectNotFound;
	public static String DiscoverDependenciesFromTypeDeclaration_discoveryName;
	public static String DiscoverDependenciesFromTypeDeclaration_javaProjectNotFound;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
