/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *******************************************************************************/
package org.eclipse.modisco.facet.util.swt.internal.exported;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IntroPart;

public final class TestUtils {

	private TestUtils() {
		// utility class
	}

	public static void closeWelcomePage() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
				if (activePart != null) {
					IntroPart adapter = (IntroPart) activePart.getAdapter(IntroPart.class);
					if (adapter != null) {
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideView((IViewPart) activePart);
					}
				}
			}
		});
	}

	public static void closeAllEditors() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeAllEditors(false);
			}
		});
	}
}
