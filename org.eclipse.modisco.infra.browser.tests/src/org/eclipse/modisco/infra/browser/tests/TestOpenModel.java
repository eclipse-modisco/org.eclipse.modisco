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

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.modisco.facet.util.tests.swtbot.internal.ContextMenuUtils;
import org.eclipse.modisco.facet.util.tests.swtbot.internal.exported.SWTBotUtils;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.tests.project.WorkspaceSetup;
import org.eclipse.modisco.infra.browser.tests.utils.TestUtils;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.IEditorPart;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=468159
@RunWith(Parameterized.class)
public class TestOpenModel {

	private static SWTWorkbenchBot fBot = new SWTWorkbenchBot();

	/** parameterized model filename */
	private final String modelFilename;

	@BeforeClass
	public static void before() throws IOException {
		WorkspaceSetup.importTestProject(TestOpenModel.fBot);
	}

	@Parameters
	public static Collection<Object[]> modelFilenames() {
		return Arrays.asList(new Object[][] {
				{ "org.eclipse.modisco.infra.browser.javaxmi" },
				{ "Company.uml" }, { "java.ecore" } });
	}

	/** Constructor for the parameterized test */
	public TestOpenModel(final String modelFilename) throws Exception {
		this.modelFilename = modelFilename;
	}

	/** Check that the model was opened in our MoDisco browser */
	public void checkEditorOpened() {
		// IEditorPart editor =
		// bot.editor("MiaCommon.j2se5").getEditorReference().getEditor(false);
		SWTBotUtils.captureScreenShot(this.modelFilename);
		IEditorPart editor = TestOpenModel.fBot
				.editorByTitle(this.modelFilename).getReference()
				.getEditor(false);
		assertTrue("editor is not an EcoreBrowser",
				editor instanceof EcoreBrowser);
	}

	/**
	 * Test opening the model through Eclipse Project Explorer, by clicking on
	 * "Open With > Other..." and then selecting "MoDisco Model Editor".
	 */
	@Test
	public void testOpenModelThroughPackageExplorerOpenWith() throws Exception {
		SWTBotTree packageExplorerTree = TestUtils.getProjectExplorerTree();
		packageExplorerTree.expandNode("testProject").getNode(this.modelFilename).select();

//		// see SWTBot bug 261360
//		UIThreadRunnable.syncExec(new VoidResult() {
//			public void run() {
//				setMenu(modelFileItem.contextMenu("Open With").menu("Other..."));
//			}
//		});
//		getMenu().click();

		ContextMenuUtils.clickContextMenu(packageExplorerTree.widget, "Open With", "Other...");

		SWTBotTable table = TestOpenModel.fBot.table();
		table.select("MoDisco Model Browser");
		TestOpenModel.fBot.button("OK").click();

		checkEditorOpened();
	}

	/** Test opening the model through the "Open Resource" Eclipse dialog */
	@Test
	public void testOpenModelWithOpenResourceDialog() throws Exception {
		TestOpenModel.fBot.menu("Navigate").menu("Open Resource...").click();
		TestOpenModel.fBot.text().setText(this.modelFilename);
		TestOpenModel.fBot.button("Open").click();
		checkEditorOpened();
	}

	/** Test opening the model through Eclipse Project Explorer */
	@Test
	public void testOpenModelThroughPackageExplorer() throws Exception {
		SWTBotTree packageExplorerTree = TestUtils.getProjectExplorerTree();
		final SWTBotTreeItem modelFileItem = packageExplorerTree
				.expandNode("testProject").getNode(this.modelFilename).select();
		// SWTBotTreeItem modelFileItem =
		// packageExplorerTree.expandNode("models").expandNode("j2se5")
		// .getNode(modelFilename);
		modelFileItem.doubleClick();
		checkEditorOpened();
	}

	private SWTBotMenu menu;

	// /**
	// * Test opening the model through Eclipse Project Explorer, by clicking
	// * "MoDisco Modelplex Knowledge Discovery > Open With Model Editor" in the
	// context menu
	// */
	// @Test
	// public void testOpenModelThroughPackageExplorerMoDiscoMenu() throws
	// Exception {
	// SWTBotTree packageExplorerTree = TestUtils.getPackageExplorerTree();
	// final SWTBotTreeItem modelFileItem =
	// packageExplorerTree.expandNode("models").expandNode(
	// "j2se5").getNode(modelFilename).select();
	//
	// // see SWTBot bug 261360
	// UIThreadRunnable.syncExec(new VoidResult() {
	// public void run() {
	// menu =
	// modelFileItem.contextMenu("MoDisco Modelplex Knowledge Discovery").menu(
	// "Open With Model Editor");
	// }
	// });
	// menu.click();
	//
	// // SWTBotMenu contextMenu =
	// //
	// packageExplorerTree.contextMenu("MoDisco Modelplex Knowledge Discovery");
	// // contextMenu.click();
	// // contextMenu.menu("Open With Model Editor").click();
	// checkEditorOpened();
	// }

	@Test
	public void testOpenModelThroughDiscoButtonInToolbar() throws Exception {
		TestUtils.enableOpenEPackageModelsWithMoDiscoBrowser();

		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		SWTBotToolbarButton toolbarButton = TestUtils
				.getToolbarButton("Open a model from the EMF EPackage registry");
		toolbarButton.click();

		bot.sleep(1000);
		int before = TestOpenModel.fBot.table().rowCount();
		TestOpenModel.fBot.text().setText("*Ecore");
		bot.sleep(1000);
		assertTrue("Filtering failed",
				TestOpenModel.fBot.table().rowCount() < before);

		SWTBotTable table = TestOpenModel.fBot.table();
		table.select("http://www.eclipse.org/emf/2002/Ecore");
		TestOpenModel.fBot.button("OK").click();

		IEditorPart editor = TestOpenModel.fBot.editorByTitle("ecore")
				.getReference().getEditor(false);
		assertTrue("editor is not an EcoreBrowser",
				editor instanceof EcoreBrowser);
	}

	/** Close the editor after each test */
	@After
	public void closeEditors() {
		TestUtils.closeAllEditors();
	}

	@BeforeClass
	public static void closeEditorsBeforeTesting() {
		// keyboardLayoutWarning();
		TestUtils.closeAllEditors();
	}

	// private static void keyboardLayoutWarning() {
	// if (!SWTBotPreferences.KEYBOARD_LAYOUT.equals("EN_US")) {
	// SWTBotPreferences.KEYBOARD_LAYOUT = "EN_US";
	// Display.getDefault().syncExec(new Runnable() {
	// public void run() {
	// MessageDialog
	// .openInformation(
	// null,
	// "Please set keyboard layout",
	// "Please set your system keyboard layout to EN_US now\n"
	// + "(you can quick-switch with Alt+Shift on Windows)");
	// }
	// });
	// }
	// }

	@AfterClass
	public static void dontCloseEclipse() {
		// bot.sleep(10000000);
	}

	protected SWTBotMenu getMenu() {
		return this.menu;
	}

	protected void setMenu(final SWTBotMenu menu) {
		this.menu = menu;
	}
}