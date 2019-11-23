/**
 *  Copyright (c) 2010, 2019 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 *  Contributors:
 *
 *  	   Fabien Giquel (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.generation.tests;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.jee.jsp.generation.tests.messages"; //$NON-NLS-1$
	public static String DiffGeneratedJspTest_Comparison_Failure;
	public static String DiffGeneratedJspTest_Invite_Check;
	public static String DiffGeneratedJspTest_Source_Directory;
	public static String DiffGeneratedJspTest_Target_Directory;
	public static String DiffGeneratedJspTest_Target_Directory_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		//
	}
}
