/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/** This is the central singleton for the MoDisco model browser plugin. */
public final class MoDiscoBrowserPlugin extends EMFPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.modisco.infra.browser"; //$NON-NLS-1$

	/** Keep track of the singleton. */
	// public static final MoDiscoBrowserPlugin INSTANCE = new
	// MoDiscoBrowserPlugin();

	/** Keep track of the singleton. */
	private static Implementation plugin;

	/** Create the instance. */
	public MoDiscoBrowserPlugin() {
		super(new ResourceLocator[] {});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 *
	 * @return the singleton instance.
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return MoDiscoBrowserPlugin.plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 *
	 * @return the singleton instance.
	 */
	public static Implementation getPlugin() {
		return MoDiscoBrowserPlugin.plugin;
	}

	/** The actual implementation of the Eclipse <b>Plugin</b>. */
	public static class Implementation extends EclipseUIPlugin {
		/** Creates an instance. */
		public Implementation() {
			super();

			// Remember the static instance.
			MoDiscoBrowserPlugin.plugin = this;
		}
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 *
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(final String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(MoDiscoBrowserPlugin.PLUGIN_ID, path);
	}

	public static void logException(final Throwable e) {
		MoDiscoBrowserPlugin.plugin.getLog().log(
				new Status(IStatus.ERROR, MoDiscoBrowserPlugin.PLUGIN_ID, IStatus.OK, e
						.getLocalizedMessage(), e));
	}

	public static void logException(final String msg, final Throwable e) {
		MoDiscoBrowserPlugin.plugin.getLog().log(
				new Status(IStatus.ERROR, MoDiscoBrowserPlugin.PLUGIN_ID, IStatus.OK, msg, e));
	}

	public static void logError(final String msg) {
		MoDiscoBrowserPlugin.plugin.getLog().log(
				new Status(IStatus.ERROR, MoDiscoBrowserPlugin.PLUGIN_ID, msg + getPosition()));
	}

	private static String getPosition() {
		StackTraceElement element = new Exception().getStackTrace()[2];
		return " \n[" + element.getClassName() + "#" + element.getMethodName() + " : " //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ element.getLineNumber() + "]"; //$NON-NLS-1$
	}

	public static void logWarning(final String msg) {
		MoDiscoBrowserPlugin.plugin.getLog().log(
				new Status(IStatus.WARNING, MoDiscoBrowserPlugin.PLUGIN_ID, msg + getPosition()));
	}

	public static void logInfo(final String msg) {
		MoDiscoBrowserPlugin.plugin.getLog().log(
				new Status(IStatus.INFO, MoDiscoBrowserPlugin.PLUGIN_ID, msg + getPosition()));
	}

	public static void logInfo(final String msg, final Throwable e) {
		MoDiscoBrowserPlugin.plugin.getLog().log(
				new Status(IStatus.INFO, MoDiscoBrowserPlugin.PLUGIN_ID, IStatus.OK, msg, e));
	}

}
