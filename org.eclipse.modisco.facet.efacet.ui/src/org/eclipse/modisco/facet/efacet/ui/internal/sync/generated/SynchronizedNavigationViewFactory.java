/**
 * Copyright (c) 2015 Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Grégoire Dupé (Mia-Software) - Bug 480654 - IllegalStateException in NavigationView.addEObjects (611)
 */

package org.eclipse.modisco.facet.efacet.ui.internal.sync.generated;

import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedNavigationViewFactory extends SynchronizedObject<org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationViewFactory> implements org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationViewFactory {

	public SynchronizedNavigationViewFactory(final org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationViewFactory object, final Display display) {
		super(object, display);
	}
	public final org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationView openNavigationView(final org.eclipse.emf.edit.domain.EditingDomain parm0) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationView>() {
			@Override
			public org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationView safeRun() {
				return SynchronizedNavigationViewFactory.this.getSynchronizedObject().openNavigationView(parm0);
			}
		});
	}
	
}
