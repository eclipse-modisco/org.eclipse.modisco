/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.util;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public final class DialogUtils {

	private DialogUtils() {
		// not instantiable
	}

	public static void openErrorDialog(final Shell shell, final Throwable e, final String title) {
		StackTraceElement[] stackTrace = e.getStackTrace();
		final String stack;
		if (stackTrace.length > 0) {
			stack = "\n" + stackTrace[0].toString(); //$NON-NLS-1$
		} else {
			stack = ""; //$NON-NLS-1$
		}
		final String message;
		if (e.getMessage() != null) {
			message = " : " + e.getMessage(); //$NON-NLS-1$
		} else {
			message = ""; //$NON-NLS-1$
		}
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(shell, title, e.getClass().getSimpleName() + message
						+ stack);
			}
		});
	}

}
