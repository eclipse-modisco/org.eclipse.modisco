/** 
 * Copyright (c) Soft-Maint.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Thomas Cicognani (Soft-Maint) - Bug 430545 - OKDialog may throws InvalidThreadAccess
 */

package org.eclipse.modisco.facet.util.ui.internal.sync.generated;

import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedOkDialogFactory extends SynchronizedObject<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialogFactory> implements org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialogFactory {

	public SynchronizedOkDialogFactory(final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialogFactory object, final Display display) {
		super(object, display);
	}
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openDialog(final org.eclipse.swt.widgets.Shell parm0, final int parm1, final java.lang.String parm2, final java.lang.String parm3, final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback<java.lang.Void> parm4) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openDialog(parm0, parm1, parm2, parm3, parm4);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openDialog(final org.eclipse.swt.widgets.Shell parm0, final int parm1, final java.lang.String parm2, final java.lang.String parm3) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openDialog(parm0, parm1, parm2, parm3);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openErrorDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2, final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback<java.lang.Void> parm3) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openErrorDialog(parm0, parm1, parm2, parm3);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openErrorDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openErrorDialog(parm0, parm1, parm2);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openErrorDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.Exception parm1, final java.lang.String parm2) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openErrorDialog(parm0, parm1, parm2);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openInformationDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2, final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback<java.lang.Void> parm3) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openInformationDialog(parm0, parm1, parm2, parm3);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openInformationDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openInformationDialog(parm0, parm1, parm2);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openWarningDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2, final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback<java.lang.Void> parm3) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openWarningDialog(parm0, parm1, parm2, parm3);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog openWarningDialog(final org.eclipse.swt.widgets.Shell parm0, final java.lang.String parm1, final java.lang.String parm2) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedOkDialogFactory.this.getSynchronizedObject().openWarningDialog(parm0, parm1, parm2);
			}
		});
	}
	
}
