/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.actions;

import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;

public class RefreshViewerAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public RefreshViewerAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.RefreshViewerAction_refreshViewer);
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public void run() {
		final EcoreBrowser browser = this.browserActionBarContributor.getBrowser();
		if (browser != null) {
			BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
				public void run() {
					browser.clearInstancesCache();
					browser.refreshDelayed(true);
				}
			});
		}
	}
}
