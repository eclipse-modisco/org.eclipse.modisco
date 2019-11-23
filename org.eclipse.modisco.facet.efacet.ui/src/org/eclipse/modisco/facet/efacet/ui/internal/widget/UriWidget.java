/*******************************************************************************
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 463907 - Command for load and save Facet serialization
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.widget;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.modisco.facet.efacet.ui.internal.Activator;
import org.eclipse.modisco.facet.efacet.ui.internal.Messages;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IUriWidget;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialogFactory;
import org.eclipse.modisco.facet.util.ui.utils.UIUtils;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class UriWidget extends Composite implements IUriWidget {

	private final Text textWidget;

	public UriWidget(final Composite parent) {
		super(parent, SWT.NONE);
		final Label labelWidget = UIUtils.createLabel(parent,
				Messages.UriWidget_EmfUri);
		labelWidget.setLayoutData(GridDataFactory.swtDefaults()
				.grab(true, false).create());
		this.textWidget = UIUtils.createTextField(parent,
				"", true, null); //$NON-NLS-1$
	}

	public URI getURI() {
		URI result =  null;
		final String text = this.textWidget.getText();
		try {
			result = URI.createURI(text);
		} catch (IllegalArgumentException e) {
			final String message = NLS.bind("The URI '{0}' in malformed.", text); //$NON-NLS-1$
			IOkDialogFactory.DEFAULT.openErrorDialog(new Shell(), e, message);
			Logger.logError(e, Activator.getDefault());
		}
		return result;
	}

	public void setURI(final URI uri) {
		String uriStr = "platform:/resource/<your_project>/<your_file>.xmi"; //$NON-NLS-1$
		if (uri != null) {
			uriStr = uri.toString();
		}
		this.textWidget.setText(uriStr);
	}

}
