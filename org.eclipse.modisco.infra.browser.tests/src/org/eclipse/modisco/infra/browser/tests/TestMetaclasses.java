/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.modisco.facet.util.tests.swtbot.internal.exported.SWTBotUtils;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.editors.MetaclassViewer;
import org.eclipse.modisco.infra.browser.preferences.PreferenceConstants;
import org.eclipse.modisco.infra.browser.tests.project.WorkspaceSetup;
import org.eclipse.modisco.infra.browser.tests.utils.TestUtils;
import org.eclipse.modisco.infra.browser.uicore.internal.model.BigListItem;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.utils.TableCollection;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests about metaclasses and the metaclass pane.
 */
@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=359257
@SuppressWarnings("restriction")
@RunWith(Parameterized.class)
public class TestMetaclasses {

	private static SWTWorkbenchBot fBot = new SWTWorkbenchBot();

	/** parameterized model filename */
	private final String modelFilename;

	/** The main tree (instances) */
	private static SWTBotTree fTree;
	/** The metaclass tree */
	private static SWTBotTree metaclassTree;

	static {
		// System.setProperty("org.eclipse.swtbot.search.timeout", "1000");
		// System.setProperty("org.eclipse.swtbot.playback.delay", "200");
	}

	@BeforeClass
	public static void init0() throws IOException {
		SWTBotPreferences.TIMEOUT = 20000;
		WorkspaceSetup.importTestProject(TestMetaclasses.fBot);
		setInfiniteReferencedResourcesLoadingDepth();
	}

	@Parameters
	public static Collection<Object[]> modelFilenames() {
		return Arrays.asList(new Object[][] { { "Company.uml" },
				{ "java.ecore" } });
	}

	/** Constructor for the parameterized test */
	public TestMetaclasses(final String modelFilename) throws Exception {
		this.modelFilename = modelFilename;
	}

	private final boolean initialized = false;

	public void init() throws Exception {
		if (this.initialized) {
			return;
		}

		TestUtils.closeAllEditors();
		TestUtils.openModel(this.modelFilename);

		// bot.menu("Navigate").menu("Open Resource...").click();
		// bot.text().setText(modelFilename);
		//
		// final SWTBotTable table = bot.table();
		// // see SWTBot bug 261360
		// SWTBotMenu menu = UIThreadRunnable.syncExec(new Result<SWTBotMenu>()
		// {
		// public SWTBotMenu run() {
		// return table.contextMenu("Open With").click().menu(
		// "MoDisco Model Browser").click();
		// }
		// });
		// menu.click();

		// bot.table().contextMenu("Open With").menu("MoDisco Model Browser")
		// .click();
		// bot.button(1).click();
		// bot.menu("MoDisco Model Browser").click();

		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		EcoreBrowser ecoreEditor = (EcoreBrowser) editor.getReference()
				.getEditor(false);
		TestUtils.resetToolbarButtons(editor);
		Tree treeWidget = (Tree) ecoreEditor.getViewer().getControl();

		MetaclassViewer metaclassViewer = ecoreEditor.getMetaclassViewer();
		Tree metaclassTreeWidget = (Tree) metaclassViewer.getViewer()
				.getControl();

		TestMetaclasses.fTree = new SWTBotTree(treeWidget);
		TestMetaclasses.metaclassTree = new SWTBotTree(metaclassTreeWidget);

		TestUtils.waitUntilLoaded();
	}

	/**
	 * Check that the "Model" metaclass is selected right after the model was
	 * opened
	 */
	@Test
	public void testModelMetaclassSelectedAfterOpen() throws Exception {
		// before each model parameter (for the parameterized test)
		init();
		TestUtils.waitUntilRefreshed();

		SWTBotUtils.captureScreenShot("1");
		TableCollection selection = TestMetaclasses.metaclassTree.selection();
		assertEquals("Only one initial metaclass should be selected", 1, selection
				.rowCount());
		String name = selection.get(0).get(0);
		SWTBotUtils.captureScreenShot("2");
		assertTrue("Model metaclass should be selected (was: " + name + ")", name
				.matches("Model \\(\\d+\\)")
				|| name.matches("EPackage \\(\\d+\\)"));
	}

	/**
	 * Check that the number in parentheses after the metaclass name really
	 * corresponds to the number of instances
	 */
	@Test
	public void checkMetaclassCount() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");
		SWTBotTreeItem[] allMetaclassTreeItems = TestMetaclasses.metaclassTree.getAllItems();
		for (SWTBotTreeItem metaclassTreeItem : allMetaclassTreeItems) {
			String text = metaclassTreeItem.getText();
			// find the number in parentheses
			int instanceCount = Integer.parseInt(text.substring(text
					.indexOf('(') + 1, text.indexOf(')')));

			metaclassTreeItem.select();
			TestUtils.waitUntilRefreshed();
			waitUntilLoaded(TestMetaclasses.fTree);
			// check in the case when items are displayed directly (not
			// partitioned)
			if (instanceCount <= BigListItem.SPLIT_THRESHOLD) {
				SWTBotTreeItem[] allItems = TestMetaclasses.fTree.getAllItems();
				assertEquals("Wrong instance count for metaclass '" + text + "'",
						instanceCount, allItems.length);
			}
			// items are partitioned : expand and count
			else {
				SWTBotTreeItem[] allItems = TestMetaclasses.fTree.getAllItems();

				int count = 0;
				for (int i = 0; i < allItems.length; i++) {
					final SWTBotTreeItem rangeItem = allItems[i];
					// only really test a few items (too time consuming
					// otherwise)
					if (i == 0 || i % 13 == 0 || i == allItems.length - 1) {
						rangeItem.expand();
						TestUtils.waitUntilRefreshed();
						List<SWTBotTreeItem> children = TestUtils
								.getChildren(rangeItem);
						count += children.size();
						TestUtils.collapse(rangeItem);
						TestUtils.waitUntilRefreshed();
					} else {
						count += BigListItem.SPLIT_THRESHOLD;
					}
				}
				assertEquals("Wrong instance count for metaclass '" + text + "'",
						instanceCount, count);
			}
		}
	}

	private void waitUntilLoaded(final SWTBotTree tree) {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		bot.waitUntil(new DefaultCondition() {
			public boolean test() throws Exception {
				SWTBotTreeItem[] allItems = tree.getAllItems();
				for (SWTBotTreeItem treeItem : allItems) {
					if ("loading...".equals(treeItem.getText())) {
						return false;
					}
				}
				return true;
			}

			public String getFailureMessage() {
				return "Browser elements did not load";
			}
		}, 10000);
	}

	@Test
	public void checkMetaclassCountWithEmptyMetaclasses() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");
		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		TestUtils.resetToolbarButtons(editor);
		TestUtils.setToolbarButtonState(editor, "Show Empty Metaclasses", true);
		TestUtils.waitUntilRefreshed();
		SWTBotUtils.captureScreenShot("2");
		checkMetaclassCount();
	}

	@Test
	public void checkMetaclassCountWithInstancesOfSubclasses() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");
		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		TestUtils.resetToolbarButtons(editor);
		TestUtils.setToolbarButtonState(editor,
				"Display Instances of Subclasses", true);
		TestUtils.waitUntilRefreshed();
		SWTBotUtils.captureScreenShot("2");
		checkMetaclassCount();
	}

	/**
	 * Check that metaclasses are really sorted by name when "sort by name" is
	 * activated.
	 */
	@Test
	public void checkSortByName() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");

		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		TestUtils.resetToolbarButtons(editor);

		final Menu menu = TestUtils.openMetaclassViewMenu(editor);
		TestUtils.setViewMenuButtonState(menu, "Sort by Name", true);
		TestUtils.closeMenu(menu);
		TestUtils.waitUntilRefreshed();
		SWTBotUtils.captureScreenShot("2");

		SWTBotTreeItem[] allMetaclassTreeItems = TestMetaclasses.metaclassTree.getAllItems();
		String previousText = "";
		String text = "";
		Pattern metaclassNamePattern = Pattern.compile("(.*?) \\(\\d+\\)");
		for (SWTBotTreeItem metaclassTreeItem : allMetaclassTreeItems) {
			Matcher matcher = metaclassNamePattern.matcher(metaclassTreeItem.getText());
			if (matcher.matches()) {
				text = matcher.group(1);
			} else {
				fail("couldn't match: " + metaclassTreeItem.getText());
			}
			assertTrue("Metaclass names are not sorted '" + previousText
					+ "', '" + text + "'", previousText
					.compareToIgnoreCase(text) <= 0);
			previousText = text;
		}
	}

	/**
	 * Check that metaclasses are really sorted by count when "sort by count" is
	 * activated.
	 */
	@Test
	public void checkSortByCount() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");

		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		TestUtils.resetToolbarButtons(editor);
		final Menu menu = TestUtils.openMetaclassViewMenu(editor);
		TestUtils.setViewMenuButtonState(menu, "Sort by Count", true);
		TestUtils.closeMenu(menu);
		TestUtils.waitUntilRefreshed();
		SWTBotUtils.captureScreenShot("2");

		SWTBotTreeItem[] allMetaclassTreeItems = TestMetaclasses.metaclassTree.getAllItems();
		int previousCount = 0;
		int count;
		for (SWTBotTreeItem metaclassTreeItem : allMetaclassTreeItems) {
			String text = metaclassTreeItem.getText();
			count = Integer.parseInt(text.substring(text.indexOf('(') + 1, text
					.indexOf(')')));

			assertTrue("Metaclass names are not sorted by count: '"
					+ previousCount + "', followed by '" + count + "'",
					previousCount <= count);
			previousCount = count;
		}
	}

	/**
	 * Check that the metaclass name contains a "." when
	 * "Show Full Qualified Names" is activated.
	 */
	@Test
	public void checkShowFullQualifiedNames() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");

		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		TestUtils.resetToolbarButtons(editor);
		final Menu menu = TestUtils.openMetaclassViewMenu(editor);
		TestUtils.setViewMenuButtonState(menu, "Show Full Qualified Names",
				true);
		TestUtils.closeMenu(menu);
		TestUtils.waitUntilRefreshed();
		SWTBotUtils.captureScreenShot("2");

		SWTBotTreeItem[] allMetaclassTreeItems = TestMetaclasses.metaclassTree.getAllItems();
		for (SWTBotTreeItem metaclassTreeItem : allMetaclassTreeItems) {
			String text = metaclassTreeItem.getText();
			assertTrue("Metaclass name is not fully qualified: '" + text + "'",
					text.contains("."));
		}
	}

	/**
	 * Check that empty metaclasses are shown when "Show Empty Metaclasses" is
	 * selected
	 */
	@Test
	public void checkShowEmptyMetaclassesTrue() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");

		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		TestUtils.resetToolbarButtons(editor);
		TestUtils.setToolbarButtonState(editor, "Show Empty Metaclasses", true);
		TestUtils.waitUntilRefreshed();
		SWTBotUtils.captureScreenShot("2");

		SWTBotTreeItem[] allMetaclassTreeItems = TestMetaclasses.metaclassTree.getAllItems();
		for (SWTBotTreeItem metaclassTreeItem : allMetaclassTreeItems) {
			String text = metaclassTreeItem.getText();
			// find the number in parentheses
			int instanceCount = Integer.parseInt(text.substring(text
					.indexOf('(') + 1, text.indexOf(')')));

			// OK
			if (instanceCount == 0) {
				return;
			}
		}
		assertTrue("No empty metaclasses are shown", false);
	}

	/**
	 * Check that no empty metaclasses are shown when "Show Empty Metaclasses"
	 * is deselected
	 */
	@Test
	public void checkShowEmptyMetaclassesFalse() throws Exception {
		init();
		SWTBotUtils.captureScreenShot("1");

		SWTBotEditor editor = TestMetaclasses.fBot.editorByTitle(this.modelFilename);
		TestUtils.resetToolbarButtons(editor);
		TestUtils
				.setToolbarButtonState(editor, "Show Empty Metaclasses", false);
		TestUtils.waitUntilRefreshed();
		SWTBotUtils.captureScreenShot("2");

		SWTBotTreeItem[] allMetaclassTreeItems = TestMetaclasses.metaclassTree.getAllItems();
		for (SWTBotTreeItem metaclassTreeItem : allMetaclassTreeItems) {
			String text = metaclassTreeItem.getText();
			// find the number in parentheses
			int instanceCount = Integer.parseInt(text.substring(text
					.indexOf('(') + 1, text.indexOf(')')));

			// OK
			if (instanceCount == 0) {
				assertTrue("Empty metaclasses are shown: " + text, false);
			}
		}

	}

	private static void setInfiniteReferencedResourcesLoadingDepth() {
		MoDiscoBrowserPlugin
				.getPlugin()
				.getPreferenceStore()
				.setValue(
						PreferenceConstants.P_BROWSER_LOADING_DEPTH, -1);
	}

	@AfterClass
	public static void dontCloseEclipse() {
		// bot.sleep(10000000);
	}
}