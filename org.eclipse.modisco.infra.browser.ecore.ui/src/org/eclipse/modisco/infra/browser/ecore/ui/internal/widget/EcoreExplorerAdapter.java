/**
 * Copyright (c) 2015 Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.widget;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget;

public class EcoreExplorerAdapter implements Adapter {

	private final IEcoreExplorerWidget widget;

	public EcoreExplorerAdapter(final IEcoreExplorerWidget widget) {
		this.widget = widget;
	}

	public void notifyChanged(final Notification notification) {
		// DO NOTHING
	}

	public Notifier getTarget() {
		return null;
	}

	public void setTarget(final Notifier newTarget) {
		// DO NOTHING
	}

	public boolean isAdapterForType(final Object type) {
		return false;
	}

	public IEcoreExplorerWidget getWidget() {
		return this.widget;
	}

}
