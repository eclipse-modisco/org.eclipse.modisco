/**
 * Copyright (c) 2015, 2019 Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 *    Thomas Cicognani (Soft-Maint) - Bug 472041 - [New Browser] Add a customization counting instances by EClass in the same Resource
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.sync.generated;

import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedEcoreExplorerWidget extends SynchronizedObject<org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget> implements org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget {

	public SynchronizedEcoreExplorerWidget(final org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget object, final Display display) {
		super(object, display);
	}
	public final java.lang.Object getAdapter(
			@SuppressWarnings("rawtypes") // @SuppressWarnings("rawtypes"): tci> Because of the implementation
			final java.lang.Class parm0) {
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

	public final java.util.Set<org.eclipse.emf.ecore.EObject> getInstancesOfFromCurrentResourceSets(final org.eclipse.emf.ecore.EClass parm0) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.util.Set<org.eclipse.emf.ecore.EObject>>() {
			@Override
			public java.util.Set<org.eclipse.emf.ecore.EObject> safeRun() {
				return SynchronizedEcoreExplorerWidget.this.getSynchronizedObject().getInstancesOfFromCurrentResourceSets(parm0);
			}
		});
	}

	public final java.util.Set<org.eclipse.emf.ecore.EObject> getInstancesOfFromCurrentResources(final org.eclipse.emf.ecore.EClass parm0) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.util.Set<org.eclipse.emf.ecore.EObject>>() {
			@Override
			public java.util.Set<org.eclipse.emf.ecore.EObject> safeRun() {
				return SynchronizedEcoreExplorerWidget.this.getSynchronizedObject().getInstancesOfFromCurrentResources(parm0);
			}
		});
	}

}
