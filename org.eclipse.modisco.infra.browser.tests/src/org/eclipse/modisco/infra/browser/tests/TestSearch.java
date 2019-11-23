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
package org.eclipse.modisco.infra.browser.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.modisco.infra.browser.tests.utils.AbstractTest;
import org.eclipse.modisco.infra.browser.tests.utils.TestUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Ignore;
import org.junit.Test;

@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=468159
/** Tests for the search function. */
public class TestSearch extends AbstractTest {

	private static final int SEARCH_JOB_WAIT_TIME = 3000;

	private SWTBotText getSearchField() {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		SWTBotText text = bot.textWithId("EcoreBrowser.searchBox");
		return text;
	}

	@Test
	public void testSearch() throws Exception {
		TestUtils.waitUntilLoaded();
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		AbstractTest.metaclassTree.select("ClassDeclaration (406)");
		TestUtils.waitUntilRefreshed();

		final SWTBotText searchField = getSearchField();
		searchField.setText("role");
		TestUtils.sendKey(searchField.widget, SWT.CR);
		// search happens in a background job
		bot.sleep(TestSearch.SEARCH_JOB_WAIT_TIME);

		SWTBotTreeItem[] allItems = AbstractTest.tree.getAllItems();
		assertEquals("Should have found 22 search results", 22, allItems.length);
		for (SWTBotTreeItem treeItem : allItems) {
			assertTrue("All search results should contain search term",
					treeItem.getText().toLowerCase().contains("role"));
		}
	}

	@Test
	public void testSearchEmpty() throws Exception {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		AbstractTest.metaclassTree.select("ClassDeclaration (406)");
		TestUtils.waitUntilRefreshed();
		final SWTBotText searchField = getSearchField();
		searchField.setText("abc");
		TestUtils.sendKey(searchField.widget, SWT.CR);
		bot.sleep(TestSearch.SEARCH_JOB_WAIT_TIME);

		SWTBotTreeItem[] allItems = AbstractTest.tree.getAllItems();
		assertEquals("search results should be empty", 0, allItems.length);
	}

	@Test
	public void testEscapeAfterSearch() throws Exception {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		AbstractTest.metaclassTree.select("ClassDeclaration (406)");
		TestUtils.waitUntilRefreshed();
		final SWTBotText searchField = getSearchField();
		searchField.setText("abstract");
		TestUtils.sendKey(searchField.widget, SWT.CR);
		bot.sleep(TestSearch.SEARCH_JOB_WAIT_TIME);
		assertEquals(18, AbstractTest.tree.getAllItems().length);
		TestUtils.sendKey(searchField.widget, SWT.ESC);
		bot.sleep(TestSearch.SEARCH_JOB_WAIT_TIME);
		assertEquals("All items should reappear when hitting ESC after a search", 406,
				AbstractTest.tree.getAllItems().length);
	}
}