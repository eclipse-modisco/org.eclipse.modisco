/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class is the MoDisco root preference page that is contributed to the
 * Preferences dialog. By sub-classing {@link FieldEditorPreferencePage}, we can
 * use the field support built into JFace that allows us to create a page that
 * is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences, that are stored in the preference
 * store that belongs to the main plug-in class. That way, preferences can be
 * accessed directly via the preference store.
 */

public class MoDiscoRootPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public MoDiscoRootPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
		setPreferenceStore(MoDiscoCommonUIPlugin.getDefault().getPreferenceStore());
		// setDescription("MoDisco preferences");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		// addField(new
		// BooleanFieldEditor(PreferenceConstants.P_DISABLE_DEFAULT_URIHANDLER,
		// Messages.MoDiscoRootPreferencePage_disableDefaultURIHandler,
		// getFieldEditorParent()));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(final IWorkbench workbench) {
		// Nothing to do
	}

}