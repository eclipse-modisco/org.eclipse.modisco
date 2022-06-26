/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.tests.utils;

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.widgetOfType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.facet.util.tests.swtbot.internal.ContextMenuUtils;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.editors.LeftPane;
import org.eclipse.modisco.infra.browser.editors.TreeToolBar;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.ChildrenControlFinder;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.matchers.AbstractMatcher;
import org.eclipse.swtbot.swt.finder.matchers.WidgetOfType;
import org.eclipse.swtbot.swt.finder.results.ListResult;
import org.eclipse.swtbot.swt.finder.results.Result;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.utils.SWTUtils;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCombo;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarPushButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarSeparatorButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.PlatformUI;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class TestUtils {

	private static SWTWorkbenchBot fBot = new SWTWorkbenchBot();
	/**
	 * As of 2022-06 and/or the pruning of CVS-defined Orbit contributions, the Jenkins build fails because
	 * org.slf4j.Logger is indirectly referenced from some .class file, so let's provide a direct reference
	 * and ensure that the conventional plumbing resolves it. See Bug 580266.
	 */
	@SuppressWarnings("unused")
	private static org.slf4j.Logger necessarySLF4Jreference = null;
	
	/**
	 * log4j is never instantiated but is mentioned in a strange Eclipse-RegisterBuddy so it seems
	 * prudent to have a direct reference for org.apache.log4j too.
	 */
	@SuppressWarnings("unused")
	private static org.apache.log4j.Logger necessaryLOG4Jreference = null;

	public static SWTBotTree getProjectExplorerTree() {
		TestUtils.fBot.menu("Window").menu("Show View").menu("Project Explorer").click();
		SWTBotView view = TestUtils.fBot.viewByTitle("Project Explorer");
		view.setFocus();
		final List<Tree> controls = new ChildrenControlFinder(TestUtils.fBot
				.getFocusedWidget()).findControls(WidgetOfType
				.widgetOfType(Tree.class));
		assert (controls.size() == 1);
		Tree tree = controls.get(0);
		return new SWTBotTree(tree);
	}

	// shouldn't be needed it SWTBotEclipseEditor worked with non-text editors
	// public static IEditorReference getEditorNamed(String name) {
	// Matcher matcher =
	// WidgetMatcherFactory.allOf(instanceOf(IEditorReference.class),
	// withPartName(name));
	// WaitForEditor waitForEditor = waitForEditor(matcher);
	// bot.waitUntilWidgetAppears(waitForEditor);
	// return waitForEditor.get(0);
	// }

	public static void closeAllEditors() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage().closeAllEditors(false);
			}
		});
	}

	// @SuppressWarnings("unchecked")
	// public static SWTBotToolbarButton getToolbarButton(EcoreBrowser editor,
	// String text, int index)
	// throws Exception {
	// Field field = editor.getClass().getDeclaredField("parentComposite");
	// field.setAccessible(true);
	// Composite composite = (Composite) field.get(editor);
	// List<ToolItem> controls = (List<ToolItem>)
	// bot.getFinder().findControls(composite,
	// WidgetMatcherFactory.allOf(widgetOfType(ToolItem.class),
	// withTooltip(text)), true);
	// if (controls.size() > 0)
	// return new SWTBotToolbarPushButton(controls.get(index));
	// else
	// return null;
	// }
	//
	// public static SWTBotToolbarButton getToolbarButton(EcoreBrowser editor,
	// String text)
	// throws Exception {
	// return getToolbarButton(editor, text, 0);
	// }

	public static Object getField(final Object obj, final String fieldName) {
		try {
			Field field = obj.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(obj);
		} catch (Exception e) {
			throw new RuntimeException("field " + fieldName + " not found on "
					+ obj.getClass().getSimpleName());
		}
		// Composite composite = (Composite) ;
	}

	public static void resetToolbarButtons(final SWTBotEditor editor)
			throws Exception {
		// metaclass pane
		setToolbarButtonState(editor, "Show Empty Metaclasses", false);
		setToolbarButtonState(editor, "Display Instances of Subclasses", false);
		setToolbarButtonState(editor, "Show Derivation Tree", false);

		// SWTBotToolbarPushButton viewMenu = (SWTBotToolbarPushButton)
		// getToolbarButton("View Menu");
		// viewMenu.contextMenu("");

		final Menu menu = openMetaclassViewMenu(editor);
		setViewMenuButtonState(menu, "Sort by Count", false);
		setViewMenuButtonState(menu, "Show Full Qualified Names", false);
		setViewMenuButtonState(menu, "Group by Package", false);
		setViewMenuButtonState(menu, "Sort by Name", true);

		closeMenu(menu);

		// instances pane
		setToolbarButtonState(editor, "Sort Instances", false);
		setToolbarButtonState(editor, "Show Empty Links", true);
		setToolbarButtonState(editor, "Show Derived Links", true);

		Menu menu2 = openInstancesViewMenu(editor);
		setViewMenuButtonState(menu2, "Sort Links", false);
		setViewMenuButtonState(menu2, "Show Full Qualified Names", false);
		setViewMenuButtonState(menu2, "Show Multiplicity", false);
		setViewMenuButtonState(menu2, "Show Opposite Links", false);
		setViewMenuButtonState(menu2, "Show Container", true);
		setViewMenuButtonState(menu2, "Show Attributes", true);
		setViewMenuButtonState(menu2, "Show Empty Attributes", true);

		closeMenu(menu2);
	}

	public static void closeMenu(final Menu menu) {
		UIThreadRunnable.syncExec(TestUtils.fBot.getDisplay(), new VoidResult() {
			public void run() {
				menu.setVisible(false);
			}
		});
	}

	public static Menu openMetaclassViewMenu(final SWTBotEditor editor) {
		class Result {
			Menu menu;
		}
		final Result result = new Result();
		UIThreadRunnable.syncExec(TestUtils.fBot.getDisplay(), new VoidResult() {
			public void run() {
				EcoreBrowser browser = (EcoreBrowser) editor.getReference()
						.getEditor(false);
				LeftPane leftPane = (LeftPane) getField(browser, "leftPane");
				result.menu = leftPane.getToolbar().openViewMenu();
			}
		});
		return result.menu;
	}

	private static Menu openInstancesViewMenu(final SWTBotEditor editor) {
		class Result {
			Menu menu;
		}
		final Result result = new Result();
		UIThreadRunnable.syncExec(TestUtils.fBot.getDisplay(), new VoidResult() {
			public void run() {
				EcoreBrowser browser = (EcoreBrowser) editor.getReference()
						.getEditor(false);
				TreeToolBar toolBar = (TreeToolBar) getField(browser,
						"instancesToolBar");
				result.menu = toolBar.openViewMenu();
			}
		});
		return result.menu;
	}

	public static void setToolbarButtonState(final SWTBotEditor editor,
			final String tooltip, final boolean enabled) throws Exception {
		setToolbarButtonState(editor, tooltip, enabled, 0);
	}

	private static void setToolbarButtonState(final SWTBotEditor editor,
			final String tooltip, final boolean enabled, final int index) {
		SWTBotToolbarToggleButton toolbarToggleButton = (SWTBotToolbarToggleButton) toolbarButtonWithPrefix(
				editor, tooltip, index);
		// TODO: check that button is on editor
		if (toolbarToggleButton.isChecked() != enabled) {
			toolbarToggleButton.toggle();
		}
	}

	public static void setViewMenuButtonState(final Menu menu,
			final String text, final boolean enabled) {

		class MenuResult {
			MenuItem item;
			boolean changed;
		}

		MenuResult menuResult = UIThreadRunnable.syncExec(new Result<MenuResult>() {
			public MenuResult run() {
				MenuResult result = new MenuResult();
				MenuItem[] items = menu.getItems();
				for (MenuItem menuItem : items) {
					if (text.equals(menuItem.getText())) {
						result.item = menuItem;
						if (menuItem.getSelection() != enabled) {
							result.changed = true;
						}
						return result;
					}
				}
				throw new RuntimeException("menu item not found: " + text);
			}
		});

		// if state changed, send the event
		if (menuResult.changed) {
			new SWTBotMenu(menuResult.item).click();
		}
	}

	public static List<SWTBotTreeItem> getChildren(final SWTBotTreeItem item) {
		return UIThreadRunnable.syncExec(new ListResult<SWTBotTreeItem>() {
			public List<SWTBotTreeItem> run() {
				TreeItem[] items = item.widget.getItems();
				ArrayList<SWTBotTreeItem> result = new ArrayList<SWTBotTreeItem>(
						items.length);
				for (TreeItem anItem : items) {
					result.add(new SWTBotTreeItem(anItem));
				}
				return result;
			}
		});
	}

	public static void collapse(final SWTBotTreeItem item) {
		UIThreadRunnable.asyncExec(new VoidResult() {
			public void run() {
				item.widget.setExpanded(false);
			}
		});
	}

	public static void sendKey(final Widget widget, final int key) {
		UIThreadRunnable.asyncExec(TestUtils.fBot.getDisplay(), new VoidResult() {
			public void run() {
				Event keyEvent = new Event();
				keyEvent.stateMask = 0;
				keyEvent.character = 0;
				keyEvent.keyCode = key;
				widget.notifyListeners(SWT.KeyDown, keyEvent);
				widget.notifyListeners(SWT.KeyUp, keyEvent);
			}
		});

		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				// do nothing, just wait for sync.
			}
		});
	}

	public static SWTBotToolbarButton getToolbarButton(final String tooltipPrefix) {
		return getToolbarButton(tooltipPrefix, 0);
	}

	@SuppressWarnings("unchecked")
	public static SWTBotToolbarButton getToolbarButton(final String tooltipPrefix,
			final int index) {
		// getEclipseWindow().activate();
		Matcher<Item> matcher = allOf(widgetOfType(ToolItem.class),
				new PrefixTextMatcher(tooltipPrefix));
		ToolItem item = (ToolItem) TestUtils.fBot.widget(matcher, index);

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

		throw new RuntimeException("toolbar button not found: " + tooltipPrefix);
	}

	@SuppressWarnings("unchecked")
	public static SWTBotToolbarButton getMenuItem(final String text, final int index) {
		// getEclipseWindow().activate();
		final List<Shell> shellsList = new ArrayList<Shell>();
		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				Shell[] shells = Display.getDefault().getShells();
				for (Shell shell : shells) {
					shellsList.add(shell);
				}
			}
		});

		Matcher<MenuItem> matcher = allOf(widgetOfType(MenuItem.class)/*
																	 * ,
																	 * withText
																	 * (text)
																	 */);
		List<? extends MenuItem> widgets = TestUtils.fBot.widgets(matcher);
		for (MenuItem menuItem : widgets) {
			String text2 = menuItem.getText();
			System.out.println(text2);
		}

		MenuItem item = TestUtils.fBot.widget(matcher, index);

		String text2 = item.getText();
		System.out.println(text2);

		// if (SWTUtils.hasStyle(item, SWT.PUSH))
		// return new SWTBotToolbarPushButton(item, matcher);
		// if (SWTUtils.hasStyle(item, SWT.CHECK))
		// return new SWTBotToolbarToggleButton(item, matcher);
		// if (SWTUtils.hasStyle(item, SWT.RADIO))
		// return new SWTBotToolbarRadioButton(item, matcher);
		// if (SWTUtils.hasStyle(item, SWT.DROP_DOWN))
		// return new SWTBotToolbarDropDownButton(item, matcher);
		// if (SWTUtils.hasStyle(item, SWT.SEPARATOR))
		// return new SWTBotToolbarSeparatorButton(item, matcher);

		throw new RuntimeException("menu item not found: " + text);
	}

	public static SWTBotShell getEclipseWindow() {
		SWTBotShell[] shells = TestUtils.fBot.shells();
		for (SWTBotShell swtBotShell : shells) {
			if (swtBotShell.getText().contains("- Eclipse SDK")) {
				return swtBotShell;
			}
		}
		throw new RuntimeException("Eclipse window not found");
	}

	/**
	 * Gets the toolbar button matching the given tooltip prefix.
	 *
	 * @param editor
	 *            the editor from which to get the button
	 * @param tooltipPrefix
	 *            The tooltip to use to find the button to return.
	 * @return The toolbar button.
	 * @throws WidgetNotFoundException
	 *             Thrown if the widget was not found matching the given tooltip
	 *             prefix.
	 */
	public static SWTBotToolbarButton toolbarButtonWithPrefix(
			final SWTBotEditor editor, final String tooltipPrefix, final int index)
			throws WidgetNotFoundException {
		SWTBotToolbarButton toolbarButton = getToolbarButton(tooltipPrefix,
				index);

		return toolbarButton;
		// List<SWTBotToolbarButton> buttons = editor.getToolbarButtons();

		// int i = 0;
		// for (SWTBotToolbarButton button : buttons) {
		// if (button.getToolTipText().startsWith(tooltipPrefix)) {
		// if (i == index) {
		// return button;
		// }
		// i++;
		// }
		// }
		//
		// throw new WidgetNotFoundException("Unable to find toolitem #" + index
		// + " with the given tooltip prefix '" + tooltipPrefix + "'");
	}

	public static class PrefixTextMatcher extends AbstractMatcher<Item> {

		private final String prefix;

		public PrefixTextMatcher(final String prefix) {
			this.prefix = prefix;
		}

		public void describeTo(final Description description) {
			description.appendText("with a label that starts with(" + this.prefix
					+ ")");
		}

		@Override
		protected boolean doMatch(final Object item) {
			try {
				return ((String) SWTUtils.invokeMethod(item, "getToolTipText"))
						.startsWith(this.prefix);
			} catch (Exception e) {
				return false;
			}
		}
	}

	/**
	 * Opens a model under the testProject using
	 * "Open With > Other... > MoDisco Model Browser" from the project explorer.
	 */
	public static void openModel(final String modelFilename) {
		SWTBotTree packageExplorerTree = TestUtils.getProjectExplorerTree();
		packageExplorerTree.expandNode("testProject").getNode(modelFilename).select();

//		// see SWTBot bug 261360
//		UIThreadRunnable.syncExec(new Result<SWTBotMenu>() {
//			public SWTBotMenu run() {
//				return modelFileItem.contextMenu("Open With").menu("Other...");
//			}
//		}).click();

		ContextMenuUtils.clickContextMenu(packageExplorerTree.widget, "Open With", "Other...");

		SWTBotTable table = TestUtils.fBot.table();
		table.select("MoDisco Model Browser");
		TestUtils.fBot.button("OK").click();
	}

	public static void enableOpenEPackageModelsWithMoDiscoBrowser() {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		// Set the preferred model editor to EcoreBrowser
		bot.menu("Window").menu("Preferences").click();
		SWTBotShell shell = bot.shell("Preferences");
		shell.activate();
		bot.tree().getTreeItem("MoDisco Facet").expand().getNode("Default Browser").select();

		SWTBotCombo combo = bot
				.comboBoxWithLabel("Default EPackage Model Viewer");

		for (int i = 0; i < combo.itemCount(); i++) {
			if (combo.items()[i].equalsIgnoreCase("MoDisco Model Browser")) {
				combo.setSelection(i);
				break;
			}
		}

		bot.button("OK").click();
	}

	private static final int BROWSER_REFRESH_TIMEOUT = 20000;

	public static void waitUntilRefreshed() {
		waitUntilRefreshed(TestUtils.BROWSER_REFRESH_TIMEOUT);
	}

	public static void waitUntilRefreshed(final long timeout) {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		bot.waitUntil(new DefaultCondition() {

			public boolean test() throws Exception {
				return !getEcoreBrowser().isRefreshing();
			}

			public String getFailureMessage() {
				return "Browser did not finish refreshing after " + timeout + " ms";
			}
		}, timeout);
	}

	private static EcoreBrowser getEcoreBrowser() {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		return (EcoreBrowser) bot.activeEditor().getReference().getEditor(false);
	}

	public static void waitUntilLoaded() throws InterruptedException {

		final Object signal = new Object();
		final boolean[] loaded = new boolean[1];
		getEcoreBrowser().doWhenLoaded(new Runnable() {
			public void run() {
				loaded[0] = true;
				synchronized (signal) {
					signal.notify();
				}
			}
		});
		while (!loaded[0]) {
			synchronized (signal) {
				signal.wait();
			}
		}
	}
}
