/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 343811 - EMF Facet Regression : Created elements in a table are not serialized
 *   Nicolas Guyomar (Mia-Software) - Bug 342154 - EMF Facet API should be covered with Unit tests
 *   Gregoire Dupe (Mia-Software) - Bug 368030 - [Unit Test Failure] org.eclipse.emf.facet.widgets.table.tests.internal.v0_1.swtbot.NatTableUITests.testAddQueryColumn
 *   Gregoire Dupe (Mia-Software) - Bug 382109 - [Unit Test Failure] Timeout after: 5000 ms.: Timed out waiting for Shell {Resource - } to close
 *******************************************************************************/
package org.eclipse.modisco.facet.util.tests.swtbot.internal.exported;

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.widgetOfType;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.tests.swtbot.internal.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.matchers.AbstractMatcher;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.utils.SWTUtils;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarPushButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarSeparatorButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public final class SWTBotUtils {

	private static boolean enableDebugScreenshots = true;
	private static final String SCREENSHOT_DIR = "SWTBotScreenShots/"; //$NON-NLS-1$
	private static final String SCREENSHOT_FORMAT = ".png"; //$NON-NLS-1$

	private SWTBotUtils() {
		// Util class should not be instantiable
	}

	public static SWTBotToolbarButton getToolbarButton(final String tooltipPrefix, final int index, final SWTWorkbenchBot pBot) {
		Matcher<ToolItem> widgetOfTypeToolItem = widgetOfType(ToolItem.class);
		PrefixTextMatcher<ToolItem> prefixTextMatcher = new PrefixTextMatcher<ToolItem>(tooltipPrefix);
		@SuppressWarnings("unchecked")
		// The method allOf use varargs type with parameterized type, this is not supported by Java
		// cf. http://download.oracle.com/javase/tutorial/java/generics/non-reifiable-varargs-type.html
		Matcher<ToolItem> matcher = allOf(widgetOfTypeToolItem, prefixTextMatcher);
		ToolItem item = pBot.widget(matcher, index);

		if (SWTUtils.hasStyle(item, SWT.PUSH)) {
			return new SWTBotToolbarPushButton(item, matcher);
		}
		if (SWTUtils.hasStyle(item, SWT.CHECK)) {
			return new SWTBotToolbarToggleButton(item, matcher);
		}
		if (SWTUtils.hasStyle(item, SWT.RADIO)) {
			return new SWTBotToolbarRadioButton(item, matcher);
		}
		if (SWTUtils.hasStyle(item, SWT.DROP_DOWN)) {
			return new SWTBotToolbarDropDownButton(item, matcher);
		}
		if (SWTUtils.hasStyle(item, SWT.SEPARATOR)) {
			return new SWTBotToolbarSeparatorButton(item, matcher);
		}

		throw new RuntimeException("toolbar button not found: " + tooltipPrefix); //$NON-NLS-1$
	}

	public static void captureScreenShot(final String imageName) {
		ScreenShotUtils.capture(imageName, 1);
	}

	public static class PrefixTextMatcher<T> extends AbstractMatcher<T> {

		private final String prefix;

		public PrefixTextMatcher(final String prefix) {
			this.prefix = prefix;
		}

		public void describeTo(final Description description) {
			description.appendText("with a label that starts with(" + this.prefix + ")"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		@Override
		protected boolean doMatch(final Object item) {
			try {
				return SWTUtils.invokeMethod(item, "getToolTipText").toString().startsWith(this.prefix); //$NON-NLS-1$
			} catch (Exception e) {
				return false;
			}
		}
	}

	public static void waitUntilNotEmpty(final SWTBotTree tree, final int timeout) {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		bot.waitUntil(new DefaultCondition() {
			public boolean test() throws Exception {
				return tree.getAllItems().length > 0;
			}

			public String getFailureMessage() {
				return "Tree still empty after timeout";
			}
		}, timeout);
	}

	public static void waitUntilAssertListSize(final int expected, final List<?> list) {
		new SWTWorkbenchBot().waitUntil(new DefaultCondition() {

			public boolean test() throws Exception {
				return expected == list.size();
			}

			public String getFailureMessage() {
				return "List size assertion failed: expected " + expected + " elements; got " + list.size();
			}
		});
	}

	public static void executeCommand(final String commandID) {
		final IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench()
				.getService(IHandlerService.class);
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try {
					handlerService.executeCommand(commandID, null);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});
	}

	/**
	 * Clears the workbench UI : close the welcome page if present, all editors, and all shells. This method is meant to
	 * be called between tests, in order to ensure that if one test fails and leaves a dialog open, subsequent tests can
	 * still pass.
	 */
	public static void closeWelcomeAndEditorsAndShells() {
		// close Welcome page if present
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		for (SWTBotView view : bot.views()) {
			if (view.getTitle().equals("Welcome")) {
				view.close();
			}
		}
		// close all open editors
		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
						.closeAllEditors(false);
			}
		});
		// close all open views
		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IViewReference[] viewReferences = activePage.getViewReferences();
				for (IViewReference viewReference : viewReferences) {
					activePage.hideView(viewReference);
				}
			}
		});
		// close all shells except the main one
		for (SWTBotShell sbShell : bot.shells()) {
			for (IWorkbenchWindow window : PlatformUI.getWorkbench()
					.getWorkbenchWindows()) {
				if (window.getShell() != sbShell.widget) {
					sbShell.close();
				}
			}
		}
	}

	public static void deleteAllProjects() throws CoreException {
		final int sleepInterval = 100;
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		for (IProject project : workspace.getRoot().getProjects()) {
			project.close(new NullProgressMonitor());
			project.delete(true, new NullProgressMonitor());
			while (project.exists()) {
				try {
					Thread.sleep(sleepInterval);
				} catch (InterruptedException e) {
					Logger.logWarning(e, Activator.getDefault());
				}
			}
		}
	}

	private static final boolean DUMP_ENABLED = true;
	private static final int DUMP_INTERVAL = 30000;
	private static boolean dumpStarted = false;

	public static synchronized void startDebugDumpingIfEnabled() {
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			System.err.println("no dump on Windows");
			return;
		}
		if (!SWTBotUtils.DUMP_ENABLED || SWTBotUtils.dumpStarted) {
			return;
		}
		SWTBotUtils.dumpStarted = true;

		Thread thread = new Thread(new Runnable() {
			public void run() {
				try {
					int dumpCount = 0;
					while (true) {
						String filename = "stackdump_" + String.format("%03d", dumpCount) + ".txt";
						ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", "jstack $PPID 1> " + filename + " 2> " + filename);
						processBuilder.redirectErrorStream(true);
						System.out.println("TAKING STACKDUMP: " + filename);
						processBuilder.start();
						try {
							Thread.sleep(SWTBotUtils.DUMP_INTERVAL);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						dumpCount++;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		System.err.println("starting stackdump every " + SWTBotUtils.DUMP_INTERVAL + " ms");
	}
}
