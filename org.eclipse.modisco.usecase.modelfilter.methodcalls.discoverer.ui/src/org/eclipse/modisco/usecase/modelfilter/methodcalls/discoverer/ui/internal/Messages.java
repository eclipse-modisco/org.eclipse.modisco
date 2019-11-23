/*
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author GBarbier
 *
 */
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.messages"; //$NON-NLS-1$
	public static String DisplayMethodCallsHandler_displayMethodCalls;
	public static String DisplayMethodCallsHandler_noJavaProject;
	public static String DisplayMethodCallsHandler_noJavaProjectLong;
	public static String MethodCallsModelEditor_partName;
	public static String MethodCallsModelEditor_recursion;
	public static String MethodCallsModelEditor_rootNodeName;
	public static String PrefuseGraphInput_name;
	public static String PrefuseGraphInput_tooltip;

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
