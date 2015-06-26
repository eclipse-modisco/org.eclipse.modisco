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
package org.eclipse.modisco.infra.browser.ecore.ui.internal.sync.generated;

import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedEcoreExplorerWidget extends SynchronizedObject<org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget> implements org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget {

	public SynchronizedEcoreExplorerWidget(final org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget object, final Display display) {
		super(object, display);
	}
	public final java.lang.Object getAdapter(@SuppressWarnings("rawtypes") final java.lang.Class parm0) {
		// @SuppressWarnings("rawtypes") Raw Type because of implementation
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.lang.Object>() {
			@Override
			public java.lang.Object safeRun() {
				return SynchronizedEcoreExplorerWidget.this.getSynchronizedObject().getAdapter(parm0);
			}
		});
	}
	
	public final void changeInput(final java.util.Collection<org.eclipse.emf.ecore.EObject> parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedEcoreExplorerWidget.this.getSynchronizedObject().changeInput(parm0);
			}
		});
	}
	
	public final org.eclipse.emf.facet.custom.core.ICustomizationManager getCustomizationManager() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.emf.facet.custom.core.ICustomizationManager>() {
			@Override
			public org.eclipse.emf.facet.custom.core.ICustomizationManager safeRun() {
				return SynchronizedEcoreExplorerWidget.this.getSynchronizedObject().getCustomizationManager();
			}
		});
	}
	
	public final org.eclipse.emf.facet.efacet.core.IFacetManager getFacetManager() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.emf.facet.efacet.core.IFacetManager>() {
			@Override
			public org.eclipse.emf.facet.efacet.core.IFacetManager safeRun() {
				return SynchronizedEcoreExplorerWidget.this.getSynchronizedObject().getFacetManager();
			}
		});
	}
	
}
