/** 
 * Copyright (c) 2015 Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.widget;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidgetFactory;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.sync.generated.SynchronizedEcoreExplorerWidget;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class EcoreExplorerWidgetFactory implements IEcoreExplorerWidgetFactory {

	public IEcoreExplorerWidget createWidget(final Composite parent) {
		final EcoreExplorerWidget widget = new EcoreExplorerWidget(parent);
		return new SynchronizedEcoreExplorerWidget(widget, Display.getDefault());
	}

	public IEcoreExplorerWidget createWidget(final Composite parent,
			final MenuManager menuManager) {
		final EcoreExplorerWidget widget = new EcoreExplorerWidget(parent,
				menuManager);
		return new SynchronizedEcoreExplorerWidget(widget, Display.getDefault());
	}

}
