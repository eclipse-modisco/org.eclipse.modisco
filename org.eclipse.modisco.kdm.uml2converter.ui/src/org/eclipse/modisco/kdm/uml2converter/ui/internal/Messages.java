/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.uml2converter.ui.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.kdm.uml2converter.ui.internal.messages"; //$NON-NLS-1$
	public static String KDMtoUML2Converter_22;
	public static String KDMtoUML2Converter_27;
	public static String KDMtoUML2Converter_42;
	public static String DiscoverUmlModelFromKdmModel_4;
	public static String Convert_0;
	public static String ConvertWithCustomTransformation_2;
	public static String ConvertWithCustomTransformation_3;
	public static String ConvertWithCustomTransformation_6;
	public static String ConvertWithCustomTransformation_9;
	public static String ConvertWithTraces_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Empty
	}
}
