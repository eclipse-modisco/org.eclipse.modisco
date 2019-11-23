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
package org.eclipse.modisco.infra.browser.tests.utils;

import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.editors.MetaclassViewer;
import org.eclipse.modisco.infra.browser.tests.project.WorkspaceSetup;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/** Abstract test class: factorize test scaffolding */
public abstract class AbstractTest {

	protected static final String MODEL_FILENAME = "org.eclipse.modisco.infra.browser.javaxmi";

	/** The main tree (instances) */
	protected static SWTBotTree tree;
	/** The metaclass tree */
	protected static SWTBotTree metaclassTree;

	protected static EcoreBrowser ecoreEditor;

	@BeforeClass
	public static void init() throws Exception {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		TestUtils.closeAllEditors();
		WorkspaceSetup.importTestProject(bot);

		TestUtils.openModel(AbstractTest.MODEL_FILENAME);

		bot.menu("Navigate").menu("Open Resource...").click();
		bot.text().setText(AbstractTest.MODEL_FILENAME);
		bot.button("Open").click();

		SWTBotEditor editor = bot.editorByTitle(AbstractTest.MODEL_FILENAME);
		AbstractTest.ecoreEditor = (EcoreBrowser) editor.getReference().getEditor(false);

		TestUtils.resetToolbarButtons(editor);
		Tree treeWidget = (Tree) AbstractTest.ecoreEditor.getViewer().getControl();

		MetaclassViewer metaclassViewer = AbstractTest.ecoreEditor.getMetaclassViewer();
		Tree metaclassTreeWidget = (Tree) metaclassViewer.getViewer()
				.getControl();

		AbstractTest.tree = new SWTBotTree(treeWidget);
		AbstractTest.metaclassTree = new SWTBotTree(metaclassTreeWidget);
	}

	@AfterClass
	public static void dontCloseEclipse() {
		// bot.sleep(10000000);
	}
}