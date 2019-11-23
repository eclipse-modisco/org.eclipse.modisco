/*******************************************************************************
 * Copyright (c) 2011 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 356368 - [Unit Test Failure] junit.framework.TestSuite.org.eclipse.modisco.infra.browser.tests.*
 *     Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.facet.util.tests.swtbot.internal;

import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.withMnemonic;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.results.WidgetResult;
import org.hamcrest.Matcher;

public final class ContextMenuUtils {

	private ContextMenuUtils() {
		// utility class : not meant to be instantiated
	}

	/** Workaround for SWTBot Bug 279351. Clicks the menu with the given path from the given control. */
	public static void clickContextMenu(final Control control,
			final String... menuPath) {

		// retrieve the menu item to click
		final MenuItem menuItem = UIThreadRunnable
				.syncExec(new WidgetResult<MenuItem>() {
					public MenuItem run() {
						return getMenuItem(control, menuPath);
					}
				});
		// display meaningful error if not found
		if (menuItem == null) {
			StringBuilder builder = new StringBuilder();
			boolean first = true;
			for (String part : menuPath) {
				if (first) {
					first = false;
				} else {
					builder.append(" > ");
				}
				builder.append("\"" + part + "\"");

			}
			throw new WidgetNotFoundException("MenuItem with path [" + builder.toString() + "] not found.");
		}

		// click the menu item
		click(menuItem);

		// hide the menu item instead of disposing it to avoid the "widget is disposed" bug
		UIThreadRunnable.syncExec(new VoidResult() {
			public void run() {
				hide(menuItem.getParent());
			}
		});
	}

	private static MenuItem getMenuItem(final Control control, final String[] menuPath) {
		Menu menu = control.getMenu();
		MenuItem menuItem = null;
		for (String part : menuPath) {
			menuItem = getSubMenu(menu, part);
			if (menuItem != null) {
				menu = menuItem.getMenu();
			} else {
				hide(menu);
				break;
			}
		}
		return menuItem;
	}

	private static MenuItem getSubMenu(final Menu menu, final String subMenuText) {
		if (menu != null) {
			@SuppressWarnings("unchecked")
			Matcher<?> matcher = allOf(instanceOf(MenuItem.class), withMnemonic(subMenuText));
			menu.notifyListeners(SWT.Show, new Event());
			for (final MenuItem menuItem : menu.getItems()) {
				if (matcher.matches(menuItem)) {
					return menuItem;
				}
			}
			menu.notifyListeners(SWT.Hide, new Event());
		}
		return null;
	}

	private static void click(final MenuItem menuItem) {
		final Event event = new Event();
		event.time = (int) System.currentTimeMillis();
		event.widget = menuItem;
		event.display = menuItem.getDisplay();
		event.type = SWT.Selection;

		UIThreadRunnable.asyncExec(menuItem.getDisplay(), new VoidResult() {
			public void run() {
				menuItem.notifyListeners(SWT.Selection, event);
			}
		});
	}

	private static void hide(final Menu menu) {
		menu.notifyListeners(SWT.Hide, new Event());
		if (menu.getParentMenu() != null) {
			hide(menu.getParentMenu());
		}
	}
}