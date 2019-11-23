/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *     Nicolas Guyomar (Mia-software) - Bug 333651 Remove of the MoDisco EPackage view and of the metamodel browsing button
 *     Nicolas Bros (Mia-Software) - Bug 359261 - Junit failure : org.eclipse.modisco.infra.browser.tests.TestURIDialog
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.eclipse.gmt.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.tests.project.WorkspaceSetup;
import org.eclipse.modisco.infra.browser.tests.utils.TestUtils;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=468159
public class TestURIDialog {

	protected static SWTWorkbenchBot bot = new SWTWorkbenchBot();

	@BeforeClass
	public static void init() throws IOException {
		WorkspaceSetup.importTestProject(TestURIDialog.bot);
	}

	@Test
	public void testFiltering() throws Exception {
		SWTBotToolbarButton toolbarButton = TestUtils
				.getToolbarButton("Open a model from the EMF EPackage registry");
		toolbarButton.click();

		TestURIDialog.bot.sleep(1000);
		int before = TestURIDialog.bot.table().rowCount();
		TestURIDialog.bot.text().setText("*Ecore");
		TestURIDialog.bot.sleep(1000);
		assertTrue("Filtering failed",
				TestURIDialog.bot.table().rowCount() < before);
		TestURIDialog.bot.button("Cancel").click();
	}

	@Test
	public void testOpenModelThroughDiscoButtonInToolbar() throws Exception {

		TestUtils.enableOpenEPackageModelsWithMoDiscoBrowser();

		SWTBotToolbarButton toolbarButton = TestUtils
				.getToolbarButton("Open a model from the EMF EPackage registry");
		toolbarButton.click();

		SWTBotTable table = TestURIDialog.bot.table();
		TestURIDialog.bot.text().setText("ecore");
		TestURIDialog.bot.sleep(1000);
		table.select("http://www.eclipse.org/emf/2002/Ecore");
		TestURIDialog.bot.button("OK").click();

		SWTBotEditor editor = TestURIDialog.bot.editorByTitle("ecore");
		assertTrue("editor is not an EcoreBrowser", editor.getReference()
				.getEditor(false) instanceof EcoreBrowser);
	}

	@Test
	public void testOpenModelThroughEPackageRegistryView() {
		TestUtils.enableOpenEPackageModelsWithMoDiscoBrowser();

		TestUtils.closeAllEditors();
		TestURIDialog.bot.menu("Window").menu("Show View").menu("Other...").click();
		SWTBotShell shell = TestURIDialog.bot.shell("Show View");
		shell.activate();
		TestURIDialog.bot.tree().setFocus();
		TestURIDialog.bot.tree().expandNode("MoDisco Facet").select("EPackage Registry");
		TestURIDialog.bot.button("OK").click();

		final SWTBotView view = TestURIDialog.bot.viewByTitle("EPackage Registry");
		view.setFocus();

		// Wait for the tree to initialize
		TestURIDialog.bot.waitUntil(new DefaultCondition() {
			public boolean test() throws Exception {
				return view.bot().tree().rowCount() > 1;
			}

			public String getFailureMessage() {
				return "EPackage Registry did not initialize";
			}
		}, 30000);
		SWTBotTree tree = view.bot().tree();
		boolean found = false;
		for (int i = 0; i < tree.rowCount(); i++) {
			if (tree.cell(i, "nsUri").equalsIgnoreCase(
					"http://www.eclipse.org/emf/2002/Ecore")) {
				tree.select(i);
				tree.getAllItems()[i].doubleClick();
				found = true;
				break;
			}
		}
		if (!found) {
			fail("Ecore metamodel not found in EPackage Registry view");
		}
		SWTBotEditor editor = TestURIDialog.bot.editorByTitle("ecore");
		assertTrue("editor is not an EcoreBrowser", editor.getReference()
				.getEditor(false) instanceof EcoreBrowser);

	}
}
