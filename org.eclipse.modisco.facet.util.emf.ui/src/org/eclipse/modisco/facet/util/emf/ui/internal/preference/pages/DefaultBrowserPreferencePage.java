/**********************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *    Nicolas Guyomar (Mia-Software) - Bug 333652 Extension point offering the possibility to declare an EPackage browser
 *    Nicolas Bros (Mia-Software) - Bug 335218 - Extension point for registering EObject, EPackage, model editor
 ***********************************************************************************/
package org.eclipse.modisco.facet.util.emf.ui.internal.preference.pages;

import java.util.List;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.modisco.facet.util.emf.core.IBrowserRegistry;
import org.eclipse.modisco.facet.util.emf.core.IEObjectBrowserOpener;
import org.eclipse.modisco.facet.util.emf.core.IEPackageBrowserOpener;
import org.eclipse.modisco.facet.util.emf.core.IResourceBrowserOpener;
import org.eclipse.modisco.facet.util.emf.core.internal.preferences.PreferenceConstants;
import org.eclipse.modisco.facet.util.emf.ui.internal.Messages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * This class implements a preference page that allows the user to choose which EPackage Browser
 * they want to use.
 */
public class DefaultBrowserPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public DefaultBrowserPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
		ScopedPreferenceStore scopedPreferenceStore = new ScopedPreferenceStore(
				new InstanceScope(),
				org.eclipse.modisco.facet.util.emf.core.internal.Activator.PLUGIN_ID);
		setPreferenceStore(scopedPreferenceStore);
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common GUI blocks needed to
	 * manipulate various types of preferences. Each field editor knows how to save and restore
	 * itself.
	 */
	@Override
	public void createFieldEditors() {
		createResourceOpenerField();
		createEObjectOpenerField();
		createEPackageOpenerField();
	}

	private void createEPackageOpenerField() {
		List<IEPackageBrowserOpener> openers = IBrowserRegistry.INSTANCE
				.getAllRegisteredEPackageBrowsers();
		int size = openers.size();
		String[][] entryNamesAndValues = new String[size][2];
		for (int i = 0; i < size; i++) {
			IEPackageBrowserOpener opener = openers.get(i);
			entryNamesAndValues[i][0] = opener.getBrowserName();
			entryNamesAndValues[i][1] = opener.getClass().getName();
		}
		addField(new ComboFieldEditor(PreferenceConstants.P_DEFAULT_EPACKAGE_VIEWER,
				Messages.EmfFacetRootPreferencePage_default_epackage_browser, entryNamesAndValues,
				getFieldEditorParent()));
	}

	private void createEObjectOpenerField() {
		List<IEObjectBrowserOpener> openers = IBrowserRegistry.INSTANCE
				.getAllRegisteredEObjectBrowsers();
		int size = openers.size();
		String[][] entryNamesAndValues = new String[size][2];
		for (int i = 0; i < size; i++) {
			IEObjectBrowserOpener opener = openers.get(i);
			entryNamesAndValues[i][0] = opener.getBrowserName();
			entryNamesAndValues[i][1] = opener.getClass().getName();
		}
		addField(new ComboFieldEditor(PreferenceConstants.P_DEFAULT_EOBJECT_VIEWER,
				Messages.EPackageBrowserPreferencePage_defaultEObjectViewer, entryNamesAndValues,
				getFieldEditorParent()));
	}

	private void createResourceOpenerField() {
		List<IResourceBrowserOpener> openers = IBrowserRegistry.INSTANCE
				.getAllRegisteredResourceBrowsers();
		int size = openers.size();
		String[][] entryNamesAndValues = new String[size][2];
		for (int i = 0; i < size; i++) {
			IResourceBrowserOpener opener = openers.get(i);
			entryNamesAndValues[i][0] = opener.getBrowserName();
			entryNamesAndValues[i][1] = opener.getClass().getName();
		}
		addField(new ComboFieldEditor(PreferenceConstants.P_DEFAULT_RESOURCE_VIEWER,
				Messages.EPackageBrowserPreferencePage_defaultResourceViewer, entryNamesAndValues,
				getFieldEditorParent()));
	}

	public void init(final IWorkbench workbench) {
		// Nothing to do
	}

}