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
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedQuestionDialogFactory extends SynchronizedObject<org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialogFactory> implements org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialogFactory {

	public SynchronizedQuestionDialogFactory(final org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialogFactory object, final Display display) {
		super(object, display);
	}
	public final org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog createQuestionDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog>() {
			@Override
			public org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog safeRun() {
				return SynchronizedQuestionDialogFactory.this.getSynchronizedObject().createQuestionDialog(parm0, parm1, parm2);
			}
		});
	}
	
	public final org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog createQuestionDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2, final org.eclipse.emf.facet.util.ui.internal.exported.dialog.IDialogCallback<java.lang.Boolean> parm3) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog>() {
			@Override
			public org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog safeRun() {
				return SynchronizedQuestionDialogFactory.this.getSynchronizedObject().createQuestionDialog(parm0, parm1, parm2, parm3);
			}
		});
	}
	
}
