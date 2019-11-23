/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software)
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 338702 - [Discovery] specify initial value for Parameters
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core;

import org.eclipse.osgi.util.NLS;

/**
* @deprecated Will be removed,
*             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470701
*/
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.discovery.core.messages"; //$NON-NLS-1$
	public static String AbstractDiscoverer_CannotCheck;
	public static String AbstractDiscoverer_CannotLaunch_2;
	public static String AbstractDiscoverer_checkingParamValues;
	public static String AbstractDiscoverer_discovering;
	public static String AbstractDiscoverer_refreshingSource;
	public static String AbstractDiscoverer_testingApplicability;
	public static String AbstractModelDiscoverer_savingModel;
	public static String DiscoveryAnnotationControls_0;
	public static String DiscoveryAnnotationControls_1;
	public static String DiscoveryAnnotationControls_2;
	public static String DiscoveryAnnotationControls_3;
	public static String DiscoveryAnnotationControls_4;
	public static String DiscoveryAnnotationControls_5;
	public static String DiscoveryAnnotationControls_6;
	public static String DiscoveryAnnotationControls_7;
	public static String DiscoveryAnnotationControls_8;
	public static String DiscoveryAnnotationControls_9;

	public static String DiscoveryAnnotationControls_initializerMethodMustHaveNonVoidReturnType;
	public static String DiscoveryAnnotationControls_initializerMethodMustHaveOneParameter;
	public static String DiscoveryAnnotationControls_initializerTypeMatchesFieldType;
	public static String DiscoveryAnnotationControls_initializerTypeMatchesGetterType;
	public static String DiscoveryAnnotationControls_initializerTypeMatchesSetterType;
	public static String DiscoveryAnnotationControls_methodMustBePublic;
	public static String DiscoveryAnnotationControls_noMoreThanOneInitializer;

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Empty
	}
}
