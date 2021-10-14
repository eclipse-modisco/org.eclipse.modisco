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
package org.eclipse.modisco.facet.efacet.ui.internal.exported.dialog;

import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.facet.efacet.ui.internal.dialogs.UriDialogFactory;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IUriWidget;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialog;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * A factory to create {@link IETypedElementSelectionDialog}s
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 1.0
 */
public interface IUriDialogFactory {

	/** This is the default instance of this interface. */
	IUriDialogFactory DEFAULT = new UriDialogFactory();

	IDialog<IUriWidget> openUriDialog(URI uri,
			IDialogCallback<URI> callback, Shell parentShell, Display display);
}
