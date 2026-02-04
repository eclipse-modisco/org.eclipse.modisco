/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Grégoire Dupé - Bug 365843 - [Unit Test Failure][0.2/3.8][0.2/4.2] org.eclipse.modisco.facet.widgets.nattable.tests.swtbot.Bug344925Test.testBug344925
 *    Grégoire Dupé - Bug 367613 - Table widget refactoring
 *    Grégoire Dupé (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Grégoire Dupé (Mia-Software) - Bug 373078 - API Cleaning
 *    Grégoire Dupé (Mia-Software) - Bug 483451 - Logger and DebugUtils : Add "String.format" API
 *******************************************************************************/
package org.eclipse.modisco.facet.util.core;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.Bundle;

/**
 * @since 0.2
 */
public final class DebugUtils {

	/**
	 * Position of the caller in the stack.
	 */
	private static final int CALLER = 3;

	private DebugUtils() {
		// Must not be used
	}
	
	public static void debug(final boolean condition) {
		if (condition) {
			String location = getCallerLocation(0);
			System.out.println(location);
		}
	}
	
	public static void debug(final boolean condition, final String message) {
		if (condition) {
			String location = getCallerLocation(0);
			System.out.println(location + ": " //$NON-NLS-1$
					+ message);
		}
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void debug(final boolean condition, final String messageTemplate,
			final Object... args) {
		if (condition) {
			debug(1, messageTemplate, args);
		}
	}

	/**
	 * This methods returns the qualified name of the calling method.
	 * @param stackOffset
	 * @return
	 */
	public static String getCallerLocation(final int stackOffset) {
		StackTraceElement traceElement = Thread.currentThread().getStackTrace()[DebugUtils.CALLER + stackOffset];
		String location = traceElement.getClassName() + '.'
				+ traceElement.getMethodName();
		return location;
	}

	public static boolean getDebugStatus(final Plugin plugin) {
		final String debugOption = getDebugOption(plugin);
		return internalGetDebugStatus(plugin, debugOption);
	}

	public static boolean getDebugStatus(final Plugin plugin, final String suboption) {
		final String debugOption = getDebugOption(plugin) + '/' + suboption;
		return internalGetDebugStatus(plugin, debugOption);
	}
	
	private static boolean internalGetDebugStatus(final Plugin plugin,
			final String debugOption) {
		final String debugOptionValue = Platform.getDebugOption(debugOption);
		final boolean isDebuggingOption = Boolean.parseBoolean(debugOptionValue);
		boolean result = plugin.isDebugging() && isDebuggingOption;
		return result;
	}

	private static String getDebugOption(final Plugin plugin) {
		final Bundle bundle = plugin.getBundle();
		final StackTraceElement traceElement = Thread.currentThread().getStackTrace()[DebugUtils.CALLER];
		final String className = traceElement.getClassName();
		Class<?> classs;
		try {
			classs = bundle.loadClass(className);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		final String debugOption = bundle.getSymbolicName() + "/debug/" + classs.getSimpleName(); //$NON-NLS-1$
		return debugOption;
	}

	public static void debug(final String message) {
		debug(message, 1);
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void debug(final String messageTemplate,
			final Object... args) {
		debug(1, messageTemplate, args);
	}

	public static void debug(final String message, final int stackOffset) {
		String location = getCallerLocation(stackOffset);
		System.out.println(location + ": " //$NON-NLS-1$
				+ message);
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void debug(final int stackOffset,
			final String messageTemplate, final Object... args) {
		final String message = String.format(messageTemplate, args); 
		debug(message, stackOffset + 1);
	}
}
