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

import org.eclipse.modisco.infra.browser.tests.utils.AbstractTest;
import org.eclipse.modisco.infra.browser.tests.utils.TestUtils;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.junit.Test;

//@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=468159
/** Tests for the search function. */
public class TestNavigate extends AbstractTest {

	private static long TIMEOUT = 10000;

	@Test
	public void testNavigateBetweenMetaclasses() throws Exception {
		TestUtils.waitUntilLoaded();
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		AbstractTest.metaclassTree.select("ClassDeclaration (406)");
		TestUtils.waitUntilRefreshed();
		AbstractTest.metaclassTree.select("Package (133)");
		TestUtils.waitUntilRefreshed();
		TestUtils.getToolbarButton("Back to").click();
		TestUtils.waitUntilRefreshed();
		bot.waitUntil(new DefaultCondition() {
			public boolean test() throws Exception {
				return AbstractTest.metaclassTree
						.selection().get(0, 0).equals("ClassDeclaration (406)");
			}

			public String getFailureMessage() {
				return "Navigating Back should select the previously selected metaclass";
			}
		}, TestNavigate.TIMEOUT);
		TestUtils.getToolbarButton("Forward to").click();
		TestUtils.waitUntilRefreshed();
		bot.waitUntil(new DefaultCondition() {
			public boolean test() throws Exception {
				return AbstractTest.metaclassTree.selection().get(0, 0).equals("Package (133)");
			}

			public String getFailureMessage() {
				return "Navigating Forward should select the metaclass selected before navigating Back";
			}
		}, TestNavigate.TIMEOUT);
	}
}