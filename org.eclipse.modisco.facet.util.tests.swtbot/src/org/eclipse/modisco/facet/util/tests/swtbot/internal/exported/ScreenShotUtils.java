/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.modisco.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *   Gregoire Dupe (Mia-Software) - Bug 368006 - [Unit Test Failure][0.2/3.8] org.eclipse.modisco.facet.widgets.table.tests.internal.v0_2.swtbot.TableEditabilityTest.testSingleLineStringEditability
 *   Gregoire Dupe (Mia-Software) - Bug 368030 - [Unit Test Failure] org.eclipse.modisco.facet.widgets.table.tests.internal.v0_1.swtbot.NatTableUITests.testAddQueryColumn
 *******************************************************************************/
package org.eclipse.modisco.facet.util.tests.swtbot.internal.exported;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.tests.swtbot.internal.Activator;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

public final class ScreenShotUtils {

	private static final String SCREENSHOTS_DIR = "screenshots"; //$NON-NLS-1$
	private static final String SCREENSHOTS_FORMAT = ".png"; //$NON-NLS-1$

	private ScreenShotUtils() {
		// Must not be used.
	}

	public static void capture() {
		final String fileName = getPrefix() + getMethodName(2)
				+ ScreenShotUtils.SCREENSHOTS_FORMAT;
		final File pictureFile = new File(getLocation(), fileName);
		new SWTWorkbenchBot().captureScreenshot(pictureFile.toString());
	}

	public static void capture(final String imageName) {
		final String fileName = getPrefix() + getMethodName(2)
				+ cleanName(imageName) + ScreenShotUtils.SCREENSHOTS_FORMAT;
		final File pictureFile = new File(getLocation(), fileName);
		new SWTWorkbenchBot().captureScreenshot(pictureFile.toString());
	}
	
	public static void capture(final String imageName, final int offset) {
		final String fileName = getPrefix() + getMethodName(2 + offset)
				+ cleanName(imageName) + ScreenShotUtils.SCREENSHOTS_FORMAT;
		final File pictureFile = new File(getLocation(), fileName);
		new SWTWorkbenchBot().captureScreenshot(pictureFile.toString());
	}

	private static String getPrefix() {
		try {
			Thread.sleep(1);
		} catch (final InterruptedException e) {
			Logger.logWarning(e, Activator.getDefault());
		}
		return Long.toString(System.currentTimeMillis()) + '_';
	}

	private static String cleanName(final String imageName) {
		return imageName.replaceAll("[\\/\\\\\\?\\%\\*\\:\\|\\\"\\<\\>\\.]", //$NON-NLS-1$
				"_"); //$NON-NLS-1$
	}

	private static String getMethodName(final int offset) {
		final StackTraceElement[] stackTrace = Thread.currentThread()
				.getStackTrace();
		final StackTraceElement caller = stackTrace[1 + offset];
		return caller.getClassName() + '.' + caller.getMethodName() + '_';
	}

	private static File getLocation() {
		final File workspaceDir = ResourcesPlugin.getWorkspace().getRoot()
				.getLocation().toFile();
		return new File(workspaceDir, ScreenShotUtils.SCREENSHOTS_DIR);
	}

}
