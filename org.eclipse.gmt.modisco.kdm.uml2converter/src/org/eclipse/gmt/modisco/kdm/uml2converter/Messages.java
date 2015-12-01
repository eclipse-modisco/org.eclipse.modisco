/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.kdm.uml2converter;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.kdm.uml2converter.messages"; //$NON-NLS-1$
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