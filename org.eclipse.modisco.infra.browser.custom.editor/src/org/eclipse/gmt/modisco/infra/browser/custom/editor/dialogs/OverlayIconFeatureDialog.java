/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.editor.dialogs;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.infra.browser.custom.editor.Activator;
import org.eclipse.gmt.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.gmt.modisco.infra.browser.custom.util.OverlayIconInfo;
import org.eclipse.gmt.modisco.infra.browser.custom.util.OverlayIconPosition;
import org.eclipse.gmt.modisco.infra.browser.custom.util.UicustomUtil;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * A dialog to set the value of a customized icon feature with a resource
 * selection dialog, and a combo box to specify in which corner the overlay
 * should appear.
 */
public class OverlayIconFeatureDialog extends IconFeatureDialog {

	public OverlayIconFeatureDialog(final Shell parentShell, final boolean withCondition,
			final boolean withDefault, final List<String> availableQuerySets,
			final List<Class<?>> expectedReturnTypes, final EClass customizedMetaclass) {
		super(parentShell, withCondition, withDefault, availableQuerySets, expectedReturnTypes,
				customizedMetaclass);
	}

	private Text text;
	private Combo combo;

	@Override
	protected void createValueEditor(final Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.text = new Text(composite, SWT.BORDER);
		this.text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		final Button button = new Button(composite, SWT.PUSH);
		button.setText(Messages.CustomizationEditor_btnOpenElementSelectionDialogText);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				IFile selectedFile = OverlayIconFeatureDialog.super.openIconSelectionDialog(
						getShell(), getText().getText());
				if (selectedFile != null) {
					getText().setText(selectedFile.getFullPath().toString());
				}
			}
		});
		this.combo = new Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);
		for (OverlayIconPosition overlayIconPosition : OverlayIconPosition.values()) {
			this.combo.add(overlayIconPosition.name());
		}

		if (getInitialStaticValue() != null) {
			try {
				OverlayIconInfo overlayIcon = UicustomUtil
						.decodeOverlayIcon(getInitialStaticValue());
				this.text.setText(overlayIcon.getPath());
				this.combo.setText(overlayIcon.getIconPosition().name());
			} catch (Exception e) {
				MoDiscoLogger.logError(e, "Error decoding overlay icon", Activator //$NON-NLS-1$
						.getDefault());
			}
		}
		if (this.combo.getSelectionIndex() == -1) {
			this.combo.select(0);
		}
	}

	@Override
	protected void okPressed() {
		OverlayIconPosition iconPosition = OverlayIconPosition.valueOf(this.combo.getText());
		setStaticValue(UicustomUtil.encodeOverlayIcon(this.text.getText(), iconPosition));
		super.okPressed();
	}

	@Override
	public Text getText() {
		return this.text;
	}

}
