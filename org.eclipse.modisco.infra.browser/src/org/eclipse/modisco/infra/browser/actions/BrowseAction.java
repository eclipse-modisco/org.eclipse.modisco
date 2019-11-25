/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;

public class BrowseAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public BrowseAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.EcoreActionBarContributor_actionBrowse);
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public void run() {
		final EcoreBrowser browser = this.browserActionBarContributor.getBrowser();
		if (browser != null) {
			browser.browse();
		}
	}
}
