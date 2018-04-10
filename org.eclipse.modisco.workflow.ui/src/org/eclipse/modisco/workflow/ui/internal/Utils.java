/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.ui.internal;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;

/**
 * Tools box. It's a singleton
 *
 * @author Nicolas Payneau
 */
public final class Utils {

	private Utils() {
		// utils
	}

	/**
	 * Returns a Point indicating the top left position that the given
	 * {@link Shell} must take so that it is centered.
	 *
	 * @parameter shell shell to center
	 * @return a point
	 */
	public static Point centerShell(final Shell shell) {
		Rectangle rect = shell.getDisplay().getClientArea();
		Point size = shell.getSize();
		int x = (rect.width - size.x) / 2;
		int y = (rect.height - size.y) / 2;
		return new Point(x, y);
	}

	/**
	 * Refresh the entire workspace
	 */
	public static void refreshWorkspace() {
		try {
			ResourcesPlugin.getWorkspace().getRoot()
					.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}
}
