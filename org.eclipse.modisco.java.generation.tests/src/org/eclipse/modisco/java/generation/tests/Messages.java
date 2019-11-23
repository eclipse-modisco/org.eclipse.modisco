/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.generation.tests;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.java.generation.tests.messages"; //$NON-NLS-1$
	public static String DiffGeneratedJavaTest_7;
	public static String DiffGeneratedJavaTest_8;
	public static String DiffGeneratedJavaTest_folders_check_invitation;
	public static String DiffGeneratedJavaTest_folders_comparison_failure;
	public static String DiffGeneratedJavaTest_original_Files_Location;
	public static String DiffGeneratedJavaTest_target_Files_Location;
	public static String JavaFileComparator_files_equal;
	public static String JavaFileComparator_files_not_equal;
	public static String JavaFileComparator_wrong_number_1;
	public static String JavaFileComparator_wrong_number_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Nothing
	}
}
