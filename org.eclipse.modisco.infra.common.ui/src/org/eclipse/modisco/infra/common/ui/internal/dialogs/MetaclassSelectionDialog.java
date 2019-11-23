/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.dialogs;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.Messages;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.modisco.infra.common.ui.internal.controls.FilteredElementSelectionControl;
import org.eclipse.modisco.infra.common.ui.internal.controls.MetamodelSelectionControl;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public class MetaclassSelectionDialog extends Dialog {

	private static final int METAMODEL_GROUP_WIDTH = 400;
	private static final int METAMODEL_GROUP_HEIGHT = 400;
	private static final int METACLASS_GROUP_WIDTH = 400;
	private static final int METACLASS_GROUP_HEIGHT = 500;
	private static final String SETTINGS_FILENAME = "dialogSettings.txt"; //$NON-NLS-1$
	private static final String LAST_SELECTION_SETTINGS_SECTION = "LastSelection"; //$NON-NLS-1$
	private static final String METAMODEL_SETTING = "metamodel"; //$NON-NLS-1$
	private static final String CLASSIFIERS_SETTING = "classifiers"; //$NON-NLS-1$
	// private String initialMetamodel;

	private MetamodelSelectionControl metamodelSelectionControl;
	private FilteredElementSelectionControl metaclassSelectionControl;
	private final List<EClassifier> selectedMetaclasses = new ArrayList<EClassifier>();
	private final boolean multiSelection;
	private final boolean restrictToEClass;
	private String selectedMetamodel;
	private List<EClassifier> initiallySelectedClassifiers;

	/**
	 * @param parentShell
	 *            the parent shell
	 * @param multiSelection
	 *            whether multiple metaclasses can be selected
	 * @param restrictToEClass
	 *            whether only {@link EClass}es can be selected, instead of the
	 *            more general {@link EClassifier}.
	 */
	public MetaclassSelectionDialog(final Shell parentShell, final boolean multiSelection,
			final boolean restrictToEClass) {
		super(parentShell);
		this.multiSelection = multiSelection;
		this.restrictToEClass = restrictToEClass;
	}

	@Override
	public boolean close() {
		saveSettings();
		return super.close();
	}

	private void saveSettings() {
		try {
			IPath path = MoDiscoCommonUIPlugin.getDefault().getStateLocation();
			String filename = path.append(MetaclassSelectionDialog.SETTINGS_FILENAME).toOSString();
			DialogSettings settings = new DialogSettings(
					MetaclassSelectionDialog.LAST_SELECTION_SETTINGS_SECTION);
			settings.put(MetaclassSelectionDialog.METAMODEL_SETTING, this.selectedMetamodel);
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < this.selectedMetaclasses.size(); i++) {
				EClassifier eClassifier = this.selectedMetaclasses.get(i);
				builder.append(eClassifier.getName());
				if (i != this.selectedMetaclasses.size() - 1) {
					builder.append("|"); //$NON-NLS-1$
				}
			}
			settings.put(MetaclassSelectionDialog.CLASSIFIERS_SETTING, builder.toString());
			settings.save(filename);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, MoDiscoCommonUIPlugin.getDefault());
		}
	}

	private void loadSettings() {
		try {
			IPath path = MoDiscoCommonUIPlugin.getDefault().getStateLocation();
			String filename = path.append(MetaclassSelectionDialog.SETTINGS_FILENAME).toOSString();
			if (!new File(filename).isFile()) {
				return;
			}
			DialogSettings settings = new DialogSettings(
					MetaclassSelectionDialog.LAST_SELECTION_SETTINGS_SECTION);
			settings.load(filename);
			String metamodel = settings.get(MetaclassSelectionDialog.METAMODEL_SETTING);
			if (metamodel != null) {
				this.metamodelSelectionControl.getFilteredList().setSelection(
						new Object[] { metamodel });
				String classifiersStr = settings.get(MetaclassSelectionDialog.CLASSIFIERS_SETTING);
				if (classifiersStr != null) {
					String[] classifiers = classifiersStr.split("\\|"); //$NON-NLS-1$
					EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(metamodel);
					if (ePackage != null) {
						EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
						this.initiallySelectedClassifiers = new ArrayList<EClassifier>();
						for (String classifier : classifiers) {
							for (EClassifier eClassifier : eClassifiers) {
								if (classifier.equals(eClassifier.getName())) {
									this.initiallySelectedClassifiers.add(eClassifier);
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, MoDiscoCommonUIPlugin.getDefault());
		}
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		return MoDiscoCommonUIPlugin.getDefault().getDialogSettings();
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		contents.setLayout(new GridLayout(2, true));

		final Composite leftPane = new Composite(contents, SWT.NONE);
		leftPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		leftPane.setLayout(new GridLayout());
		createMetamodelPane(leftPane);

		final Composite rightPane = new Composite(contents, SWT.NONE);
		rightPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		rightPane.setLayout(new GridLayout());
		createMetaclassPane(rightPane);

		loadSettings();

		return contents;
	}

	private void createMetamodelPane(final Composite contents) {
		final Group metamodelGroup = new Group(contents, SWT.NONE);
		metamodelGroup.setLayout(new GridLayout());
		metamodelGroup.setText(Messages.MetaclassSelectionDialog_metamodel);
		final GridData metamodelGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		metamodelGroupData.widthHint = MetaclassSelectionDialog.METAMODEL_GROUP_WIDTH;
		metamodelGroupData.heightHint = MetaclassSelectionDialog.METAMODEL_GROUP_HEIGHT;
		metamodelGroup.setLayoutData(metamodelGroupData);

		this.metamodelSelectionControl = new MetamodelSelectionControl(metamodelGroup);
		this.metamodelSelectionControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// if (this.initialMetamodel != null) {
		// this.metamodelSelectionControl.getFilteredList().setSelection(
		// new String[] { this.initialMetamodel });
		// }

		this.metamodelSelectionControl.getFilteredList().addSelectionListener(
				new SelectionAdapter() {
					@Override
					public void widgetSelected(final SelectionEvent e) {
						metamodelChanged();
					}
				});
	}

	private void metamodelChanged() {
		Object[] selection = this.metamodelSelectionControl.getFilteredList().getSelection();
		// single selection
		if (selection.length == 1) {
			String metamodelURI = (String) selection[0];
			this.selectedMetamodel = metamodelURI;
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(metamodelURI);
			if (ePackage != null) {
				List<EClassifier> eClasses = new ArrayList<EClassifier>();
				EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
				for (EClassifier eClassifier : eClassifiers) {
					if (!this.restrictToEClass || eClassifier instanceof EClass) {
						eClasses.add(eClassifier);
					}
				}
				this.metaclassSelectionControl.setElements(eClasses.toArray());

				// since a background job populates the metamodel list,
				// restoring the metaclass selection must be done
				// once the metamodel is really selected
				if (this.initiallySelectedClassifiers != null) {
					this.metaclassSelectionControl.getFilteredList().setSelection(
							this.initiallySelectedClassifiers.toArray());
					this.initiallySelectedClassifiers = null;
				}
			} else {
				this.metaclassSelectionControl.setElements(new Object[0]);
			}
		} else {
			this.metaclassSelectionControl.setElements(new Object[0]);
		}
	}

	private void createMetaclassPane(final Composite contents) {
		final Group metaclassGroup = new Group(contents, SWT.NONE);
		metaclassGroup.setLayout(new GridLayout());
		metaclassGroup.setText(Messages.MetaclassSelectionDialog_metaclass);
		final GridData metaclassGroupData = new GridData(SWT.FILL, SWT.FILL, true, true);
		metaclassGroupData.widthHint = MetaclassSelectionDialog.METACLASS_GROUP_WIDTH;
		metaclassGroupData.heightHint = MetaclassSelectionDialog.METACLASS_GROUP_HEIGHT;
		metaclassGroup.setLayoutData(metaclassGroupData);

		this.metaclassSelectionControl = new FilteredElementSelectionControl(metaclassGroup, false,
				this.multiSelection);
		this.metaclassSelectionControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		this.metaclassSelectionControl.getFilteredList().setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(final Object element) {
				return ImageUtils.getImage(element);
			}

			@Override
			public String getText(final Object element) {
				EClassifier eClassifier = (EClassifier) element;
				return eClassifier.getName();
			}
		});

		this.metaclassSelectionControl.getFilteredList().addSelectionListener(
				new SelectionAdapter() {
					@Override
					public void widgetSelected(final SelectionEvent e) {
						metaclassChanged();
					}

					@Override
					public void widgetDefaultSelected(final SelectionEvent e) {
						okPressed();
					}
				});

	}

	private void metaclassChanged() {
		final Button okButton = getButton(IDialogConstants.OK_ID);
		Object[] selection = this.metaclassSelectionControl.getFilteredList().getSelection();
		this.selectedMetaclasses.clear();
		if (selection.length > 0) {
			for (Object selected : selection) {
				EClassifier eClassifier = (EClassifier) selected;
				this.selectedMetaclasses.add(eClassifier);
			}
			if (okButton != null) {
				okButton.setEnabled(true);
			}
		} else {
			if (okButton != null) {
				okButton.setEnabled(false);
			}
		}
	}

	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);
		if (this.multiSelection) {
			if (this.restrictToEClass) {
				newShell.setText(Messages.MetaclassSelectionDialog_selectMetaclasses);
			} else {
				newShell.setText(Messages.MetaclassSelectionDialog_selectClassifiers);
			}
		} else {
			if (this.restrictToEClass) {
				newShell.setText(Messages.MetaclassSelectionDialog_selectMetaclass);
			} else {
				newShell.setText(Messages.MetaclassSelectionDialog_selectClassifier);
			}
		}
		// newShell.setImage(ImageProvider.getInstance().getMoDiscoIcon());
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// public void setInitialMetamodel(final String metamodel) {
	// this.initialMetamodel = metamodel;
	// }

	public List<EClassifier> getSelectedClassifiers() {
		return Collections.unmodifiableList(this.selectedMetaclasses);
	}

	public List<EClass> getSelectedMetaclasses() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		for (EClassifier eClassifier : this.selectedMetaclasses) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				list.add(eClass);
			}
		}
		return Collections.unmodifiableList(list);
	}
}
