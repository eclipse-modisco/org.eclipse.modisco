/*******************************************************************************
 * Copyright (c) 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Thomas Cicognani (Mia-Software) - Bug 500437 - IQuestionDialogFactory not synchronized
 *******************************************************************************/
package org.eclipse.emf.facet.util.ui.internal.sync.generated;

import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedQuestionDialog extends SynchronizedObject<org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog> implements org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog {

	public SynchronizedQuestionDialog(final org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog object, final Display display) {
		super(object, display);
	}
	public final void addCloseListener(final java.lang.Runnable parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedQuestionDialog.this.getSynchronizedObject().addCloseListener(parm0);
			}
		});
	}
	
	public final java.lang.Boolean getResult() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.lang.Boolean>() {
			@Override
			public java.lang.Boolean safeRun() {
				return SynchronizedQuestionDialog.this.getSynchronizedObject().getResult();
			}
		});
	}
	
	public final org.eclipse.swt.widgets.Shell getShell() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.swt.widgets.Shell>() {
			@Override
			public org.eclipse.swt.widgets.Shell safeRun() {
				return SynchronizedQuestionDialog.this.getSynchronizedObject().getShell();
			}
		});
	}
	
	public final void open() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedQuestionDialog.this.getSynchronizedObject().open();
			}
		});
	}
	
	public final void pressNo() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedQuestionDialog.this.getSynchronizedObject().pressNo();
			}
		});
	}
	
	public final void pressYes() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedQuestionDialog.this.getSynchronizedObject().pressYes();
			}
		});
	}
	
}
