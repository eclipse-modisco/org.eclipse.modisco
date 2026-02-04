/*******************************************************************************
 * Copyright (c) 2015, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 463907 - Command for load and save Facet serialization
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.dialogs;

import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.dialog.IUriDialogFactory;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IUriWidget;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialog;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class UriDialogFactory implements IUriDialogFactory {

	public IDialog<IUriWidget> openUriDialog(final URI uri,
			final IDialogCallback<URI> callback, final Shell parentShell,
			final Display display) {
		final UriDialog dialog =  new UriDialog(uri, callback, parentShell);
		display.asyncExec(new Runnable() {
			public void run() {
				dialog.open();
			}
		});
		return dialog;
	}

}
