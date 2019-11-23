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
package org.eclipse.modisco.infra.browser.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;

public class DecreaseFontSizeAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public DecreaseFontSizeAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.EcoreActionBarContributor_decreaseFontSize, IAction.AS_PUSH_BUTTON);
		setImageDescriptor(ImageProvider.getInstance().getDecreaseFontSizeIcon());
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public void run() {
		final EcoreBrowser browser = this.browserActionBarContributor.getBrowser();
		if (browser != null) {
			browser.setFontSizeDelta(browser.getFontSizeDelta() - 1);
		}
	}
}
