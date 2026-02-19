/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 339657 - Move Logger to org.eclipse.modisco.facet.util.core
 *    Nicolas Bros (Mia-Software) - Bug 340031 - NPE in org.eclipse.modisco.facet.util.core.Logger#log
 *    Grégoire Dupé (Mia-Software) - Bug 483451 - Logger and DebugUtils : Add "String.format" API
 *******************************************************************************/
package org.eclipse.modisco.facet.util.core;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.modisco.facet.util.core.internal.Activator;

/**
 * Helper for logging using Eclipse API
 * 
 * @author fgiquel
 * 
 */
public final class Logger {

	private Logger() {
		// Nothing
	}

	public static void logError(final Throwable e, final Plugin plugin) {
		Logger.log(e, IStatus.ERROR, e.getMessage(), plugin);
	}

	public static void logError(final String message, final Plugin plugin) {
		Logger.log(null, IStatus.ERROR, message, plugin);
	}

	public static void logError(final Throwable e, final String message, final Plugin plugin) {
		Logger.log(e, IStatus.ERROR, message, plugin);
	}

	public static void logWarning(final Throwable e, final Plugin plugin) {
		Logger.log(e, IStatus.WARNING, e.getMessage(), plugin);
	}

	public static void logWarning(final String message, final Plugin plugin) {
		Logger.log(null, IStatus.WARNING, message, plugin);
	}

	public static void logWarning(final Throwable e, final String message, final Plugin plugin) {
		Logger.log(e, IStatus.WARNING, message, plugin);
	}

	public static void logInfo(final Throwable e, final Plugin plugin) {
		Logger.log(e, IStatus.INFO, e.getMessage(), plugin);
	}

	public static void logInfo(final String message, final Plugin plugin) {
		Logger.log(null, IStatus.INFO, message, plugin);
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void logError(final Plugin plugin,
			final String messageTemplate, final Object... args) {
		Logger.log(null, IStatus.ERROR, plugin, messageTemplate, args);
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void logError(final Throwable e, final Plugin plugin,
			final String messageTemplate, final Object... args) {
		Logger.log(e, IStatus.ERROR, plugin, messageTemplate, args);
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void logWarning(final Plugin plugin,
			final String messageTemplace, final Object... args) {
		Logger.log(null, IStatus.WARNING, plugin, messageTemplace, args);
	}

	/**
	 * @since 1.1
	 */
	public static void logWarning(final Throwable e, final Plugin plugin,
			final String messageTemplace, final Object... args) {
		Logger.log(e, IStatus.WARNING, plugin, messageTemplace, args);
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void logInfo(final Plugin plugin,
			final String messageTemplace, final Object... args) {
		Logger.log(null, IStatus.INFO, plugin, messageTemplace, args);
	}

	/**
	 * An exception that is instantiated with the sole purpose of providing a
	 * stack trace when there wouldn't be one otherwise.
	 */
	protected static class LogStackTrace extends Exception {
		private static final long serialVersionUID = 309882934616507415L;
	}

	/**
	 * @since 1.1
	 * @param messageTemplate
	 *            A format string (cf. java.util.Formatter)
	 * @param args
	 *            Arguments referenced by messageTemplates
	 */
	public static void log(final Throwable e, final int level,
			final Plugin plugin, final String messageTemplate,
			final Object... args) {
		final String message = String.format(messageTemplate, args);
		log(e, level, message, plugin);
	}
	
	public static void log(final Throwable e, final int level,
			final String message, final Plugin plugin) {

		Throwable effectiveE = e;
		Plugin effectivePlugin = plugin;
		String effectiveMessage = message;
		IStatus status = null;

		if (effectiveE instanceof InvocationTargetException) {
			effectiveE = ((InvocationTargetException) effectiveE).getTargetException();
		}
		if (effectivePlugin == null) {
			effectivePlugin = Activator.getDefault();
		}

		if (effectiveE instanceof CoreException) {
			MultiStatus mstatus = new MultiStatus(plugin.getBundle().getSymbolicName(), level,
					new IStatus[] { ((CoreException) effectiveE).getStatus() }, message, effectiveE);
			status = mstatus;
		} else {
			if (effectiveMessage == null && effectiveE != null) {
				effectiveMessage = effectiveE.getMessage();
			}
			if (effectiveMessage == null && effectiveE != null) {
				effectiveMessage = effectiveE.toString();
			}
			if (effectiveMessage == null) {
				effectiveMessage = ""; //$NON-NLS-1$
			}
			try {
				effectiveMessage = effectiveMessage + " (" //$NON-NLS-1$
						+ effectivePlugin.getBundle().getSymbolicName() + "_" //$NON-NLS-1$
						+ effectivePlugin.getBundle().getVersion() + ")"; //$NON-NLS-1$
			} catch (NullPointerException e2) {
				effectiveMessage += " (activator class = " //$NON-NLS-1$
						+ effectivePlugin.getClass().getName() + ")"; //$NON-NLS-1$
			}
			if ((effectiveE == null) && (level > IStatus.INFO)) {
				// record a stacktrace
				effectiveE = new LogStackTrace();
			}
			status = new Status(level, effectivePlugin.getBundle().getSymbolicName(),
					effectiveMessage, effectiveE);
		}
		effectivePlugin.getLog().log(status);
	}

	// private static String getPosition() {
	// try {
	// // get the stack element corresponding to the caller of the log
	// // method
	// StackTraceElement element = new Exception().getStackTrace()[2];
	//			return " \n[" + element.getClassName() + "#" + element.getMethodName() + " : " //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	//					+ element.getLineNumber() + "]"; //$NON-NLS-1$
	// } catch (Throwable e) {
	//			return ""; //$NON-NLS-1$
	// }
	// }
}
