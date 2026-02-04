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
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IUriWidget;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IUriWidgetFactory;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialog;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionStatusDialog;

public class UriDialog extends SelectionStatusDialog  implements IDialog<IUriWidget> {

	private IUriWidget widget;
	private final IDialogCallback<URI> callback;
	private final URI initialUri;

	public UriDialog(final URI uri, final IDialogCallback<URI> callback,
			final Shell parentShell) {
		super(parentShell);
		this.initialUri = uri;
		this.callback = callback;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite composite = (Composite) super.createDialogArea(parent);
		this.widget = IUriWidgetFactory.DEFAULT.createUriWidget(composite); 
		this.widget.setURI(this.initialUri);
		return super.createDialogArea(parent);
	}

	@Override
	protected void computeResult() {
		// Nothing to do
	}

	public void commit() {
		final URI uri = this.widget.getURI();
		this.callback.committed(uri);
		super.okPressed();
	}
	
	@Override
	protected void okPressed() {
		commit();
	}

	public void cancel() {
		cancelPressed();
	}

	public boolean isDialogValid() {
		return this.widget.getURI() != null;
	}

	public IUriWidget getWidget() {
		return this.widget;
	}

}
