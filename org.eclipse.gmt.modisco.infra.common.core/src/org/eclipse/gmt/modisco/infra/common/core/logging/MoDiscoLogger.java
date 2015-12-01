/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.logging;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmt.modisco.infra.common.core.internal.CommonModiscoActivator;

/**
 * Helper for logging using Eclipse API
 * 
 * @author fgiquel
 * @deprecated Replaced by org.eclipse.emf.facet.util.core.Logger,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470725
 */
@Deprecated
public final class MoDiscoLogger {

	private MoDiscoLogger() {
		// Nothing
	}

	public static void logError(final Throwable e, final Plugin plugin) {
		MoDiscoLogger.log(e, IStatus.ERROR, e.getMessage(), plugin);
	}

	public static void logError(final String message, final Plugin plugin) {
		MoDiscoLogger.log(null, IStatus.ERROR, message, plugin);
	}

	public static void logError(final Throwable e, final String message, final Plugin plugin) {
		MoDiscoLogger.log(e, IStatus.ERROR, message, plugin);
	}

	public static void logWarning(final Throwable e, final Plugin plugin) {
		MoDiscoLogger.log(e, IStatus.WARNING, e.getMessage(), plugin);
	}

	public static void logWarning(final String message, final Plugin plugin) {
		MoDiscoLogger.log(null, IStatus.WARNING, message, plugin);
	}

	public static void logWarning(final Throwable e, final String message, final Plugin plugin) {
		MoDiscoLogger.log(e, IStatus.WARNING, message, plugin);
	}

	public static void logInfo(final Throwable e, final Plugin plugin) {
		MoDiscoLogger.log(e, IStatus.INFO, e.getMessage(), plugin);
	}

	public static void logInfo(final String message, final Plugin plugin) {
		MoDiscoLogger.log(null, IStatus.INFO, message, plugin);
	}

	/**
	 * An exception that is instantiated with the sole purpose of providing a
	 * stack trace when there wouldn't be one otherwise.
	 */
	private static class LogStackTrace extends Exception {
		private static final long serialVersionUID = 309882934616507415L;
	}

	@SuppressWarnings("synthetic-access")
	public static void log(final Throwable e, final int level, final String message,
			final Plugin plugin) {
		Throwable effectiveE = e;
		Plugin effectivePlugin = plugin;
		String effectiveMessage = message;
		IStatus status = null;

		if (effectiveE instanceof InvocationTargetException) {
			effectiveE = ((InvocationTargetException) effectiveE).getTargetException();
		}
		if (effectivePlugin == null) {
			effectivePlugin = CommonModiscoActivator.getDefault();
		}

		if (effectiveE instanceof CoreException) {
			MultiStatus mstatus = new MultiStatus(plugin.getBundle().getSymbolicName(), level,
					new IStatus[] { ((CoreException) effectiveE).getStatus() }, message, effectiveE);
			status = mstatus;
		} else {
			if (effectiveMessage == null) {
				effectiveMessage = effectiveE.getMessage();
			}
			if (effectiveMessage == null) {
				effectiveMessage = effectiveE.toString();
			}
			effectiveMessage = effectiveMessage + " (" //$NON-NLS-1$
					+ effectivePlugin.getBundle().getSymbolicName() + "_" //$NON-NLS-1$
					+ effectivePlugin.getBundle().getVersion() + ")"; //$NON-NLS-1$
			if (effectiveE == null) {
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