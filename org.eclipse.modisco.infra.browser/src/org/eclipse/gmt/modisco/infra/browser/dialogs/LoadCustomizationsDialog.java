/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.dialogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.PatternFilter;

public class LoadCustomizationsDialog extends Dialog {

	private static final int CUSTOMIZATIONS_TREE_WIDTH = 200;
	private static final int CUSTOMIZATIONS_TREE_HEIGHT = 250;
	private static final int NUM_COLUMNS = 4;
	private final List<MetamodelView> fAvailableCustomizations;
	private final LabelProvider fLabelProvider;
	private final IContentProvider fContentProvider;
	private final EList<MetamodelView> fSelectedCustomizations;
	private TreeViewer fAvailableCustomizationsTreeViewer;
	private TreeViewer fSelectedCustomizationsTreeViewer;
	private Button fAddButton;
	private Button fRemoveButton;
	private Button fAddAllButton;
	private Button fRemoveAllButton;
	private Button fUpButton;
	private Button fDownButton;
	private Button fLoadRequiredFacetsCheckbox;
	private final List<MetamodelView> fInitiallySelectedCustomizations;
	private boolean fLoadRequiredFacetsSelected = false;

	public LoadCustomizationsDialog(final Shell parent,
			final List<MetamodelView> initiallySelectedCustomizations,
			final Collection<EPackage> ePackages) {
		super(parent);
		this.fInitiallySelectedCustomizations = initiallySelectedCustomizations;
		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);

		this.fSelectedCustomizations = new BasicEList<MetamodelView>();

		this.fLabelProvider = new LabelProvider() {
			@Override
			public String getText(final Object element) {
				final MetamodelView metamodelView = (MetamodelView) element;
				return metamodelView.getName();
			}

			@Override
			public Image getImage(final Object element) {
				return ImageProvider.getInstance().getUiCustomIcon();
			}
		};

		this.fAvailableCustomizations = Collections
				.synchronizedList(new ArrayList<MetamodelView>());

		/*
		 * Background loading, so that the dialog opens instantly even if the
		 * customizations take a while to load.
		 */
		AbstractMoDiscoCatalog.whenBuilt(new Runnable() {
			public void run() {
				LoadCustomizationsDialog.this.fAvailableCustomizations.clear();
				LoadCustomizationsDialog.this.fAvailableCustomizations.addAll(CustomizationsCatalog.filterForMetamodel(
						CustomizationsCatalog.getInstance().getAllCustomizations(), ePackages));

				// initial selection
				for (final MetamodelView initiallySelectedCustomization : LoadCustomizationsDialog.this.fInitiallySelectedCustomizations) {
					final URI initiallySelectedCustomizationURI = EcoreUtil
							.getURI(initiallySelectedCustomization);
					final ListIterator<MetamodelView> availableCustomizationsIterator = LoadCustomizationsDialog.this.fAvailableCustomizations
							.listIterator();
					while (availableCustomizationsIterator.hasNext()) {
						final MetamodelView availableCustomization = availableCustomizationsIterator
								.next();
						final URI availableCustomizationURI = EcoreUtil
								.getURI(availableCustomization);
						if (availableCustomizationURI.equals(initiallySelectedCustomizationURI)) {
							availableCustomizationsIterator.remove();
							LoadCustomizationsDialog.this.fSelectedCustomizations
									.add(initiallySelectedCustomization);
						}

					}
				}

				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (!LoadCustomizationsDialog.this.fAvailableCustomizationsTreeViewer
								.getControl().isDisposed()) {
							LoadCustomizationsDialog.this.fAvailableCustomizationsTreeViewer
									.refresh();
							LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer
									.refresh();
						}
					}
				});
			}
		});

		this.fContentProvider = new ITreeContentProvider() {

			public Object[] getElements(final Object inputElement) {
				@SuppressWarnings("unchecked")
				final List<MetamodelView> customizations = (List<MetamodelView>) inputElement;
				return customizations.toArray();
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// nothing
			}

			public void dispose() {
				// nothing
			}

			public Object[] getChildren(final Object parentElement) {
				return null;
			}

			public Object getParent(final Object element) {
				return null;
			}

			public boolean hasChildren(final Object element) {
				return false;
			}
		};
	}

	@Override
	protected void configureShell(final Shell shell) {
		super.configureShell(shell);
		shell.setText(Messages.LoadCustomizationsDialog_title_LoadCustomizations);
		// shell.setImage(labelProvider.getImage(object));
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite contents = (Composite) super.createDialogArea(parent);

		final GridLayout contentsGridLayout = (GridLayout) contents.getLayout();
		contentsGridLayout.numColumns = LoadCustomizationsDialog.NUM_COLUMNS;

		final GridData contentsGridData = (GridData) contents.getLayoutData();
		contentsGridData.horizontalAlignment = SWT.FILL;
		contentsGridData.verticalAlignment = SWT.FILL;

		createLeftPane(contents);
		createMiddleButtonsPane(contents);
		createRightPane(contents);
		createRightButtonsPane(contents);
		createLoadRequiredFacetsCheckbox(contents);

		this.fAvailableCustomizationsTreeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(final DoubleClickEvent event) {
				if (LoadCustomizationsDialog.this.fAddButton.isEnabled()) {
					LoadCustomizationsDialog.this.fAddButton.notifyListeners(SWT.Selection, null);
				}
			}
		});

		this.fSelectedCustomizationsTreeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(final DoubleClickEvent event) {
				if (LoadCustomizationsDialog.this.fRemoveButton.isEnabled()) {
					LoadCustomizationsDialog.this.fRemoveButton
							.notifyListeners(SWT.Selection, null);
				}
			}
		});

		this.fUpButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				upButtonClicked();
			}
		});

		this.fDownButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				downButtonClicked();
			}
		});

		this.fAddButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				addButtonClicked();
			}
		});

		this.fAddAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				addAllButtonClicked();
			}
		});

		this.fRemoveButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				removeButtonClicked();
			}
		});

		this.fRemoveAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				removeAllButtonClicked();
			}
		});

		return contents;
	}

	@SuppressWarnings("unchecked")
	private void upButtonClicked() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer
				.getSelection();

		int minIndex = 0;
		for (final Iterator<MetamodelView> it = selection.iterator(); it.hasNext();) {
			final MetamodelView element = it.next();
			final int index = LoadCustomizationsDialog.this.fSelectedCustomizations
					.indexOf(element);
			LoadCustomizationsDialog.this.fSelectedCustomizations.move(
					Math.max(index - 1, minIndex++), element);
		}
		LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer.refresh();
	}

	private void downButtonClicked() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer
				.getSelection();
		final ArrayList<Object> selectedObjects = new ArrayList<Object>();
		for (final Object selectedObject : selection.toArray()) {
			selectedObjects.add(selectedObject);
		}

		// prevent the last two elements from swapping
		boolean canMove = !selectedObjects
				.contains(LoadCustomizationsDialog.this.fSelectedCustomizations
						.get(LoadCustomizationsDialog.this.fSelectedCustomizations.size() - 1));
		for (int i = LoadCustomizationsDialog.this.fSelectedCustomizations.size() - 2; i >= 0; i--) {
			final MetamodelView selectedCustomization = LoadCustomizationsDialog.this.fSelectedCustomizations
					.get(i);
			if (selectedObjects.contains(selectedCustomization)) {
				if (canMove) {
					LoadCustomizationsDialog.this.fSelectedCustomizations.move(i + 1,
							selectedCustomization);
				}
			} else {
				canMove = true;
			}

		}

		LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer.refresh();
	}

	@SuppressWarnings("unchecked")
	private void addButtonClicked() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.fAvailableCustomizationsTreeViewer
				.getSelection();
		for (final Iterator<MetamodelView> it = selection.iterator(); it.hasNext();) {
			final MetamodelView element = it.next();
			if (!LoadCustomizationsDialog.this.fSelectedCustomizations.contains(element)) {
				LoadCustomizationsDialog.this.fSelectedCustomizations.add(element);
				LoadCustomizationsDialog.this.fAvailableCustomizations.remove(element);
			}
		}
		refresh();
		LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer.setSelection(selection);
	}

	private void addAllButtonClicked() {
		ListIterator<MetamodelView> listIterator = LoadCustomizationsDialog.this.fAvailableCustomizations
				.listIterator();
		while (listIterator.hasNext()) {
			final MetamodelView element = listIterator.next();
			LoadCustomizationsDialog.this.fSelectedCustomizations.add(element);
			listIterator.remove();
		}
		refresh();
	}

	@SuppressWarnings("unchecked")
	private void removeButtonClicked() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer
				.getSelection();
		for (final Iterator<MetamodelView> i = selection.iterator(); i.hasNext();) {
			final MetamodelView element = i.next();
			LoadCustomizationsDialog.this.fSelectedCustomizations.remove(element);
			LoadCustomizationsDialog.this.fAvailableCustomizations.add(element);
		}

		if (LoadCustomizationsDialog.this.fSelectedCustomizations.size() > 0) {
			LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer
					.setSelection(new StructuredSelection(
							LoadCustomizationsDialog.this.fSelectedCustomizations.get(0)));
		}
		refresh();
	}

	private void removeAllButtonClicked() {
		ListIterator<MetamodelView> listIterator = LoadCustomizationsDialog.this.fSelectedCustomizations
				.listIterator();
		while (listIterator.hasNext()) {
			final MetamodelView element = listIterator.next();
			LoadCustomizationsDialog.this.fAvailableCustomizations.add(element);
			listIterator.remove();
		}
		refresh();
	}

	private void createLeftPane(final Composite contents) {
		final Composite choiceComposite = new Composite(contents, SWT.NONE);
		final GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.horizontalAlignment = SWT.END;
		choiceComposite.setLayoutData(data);

		final GridLayout layout = new GridLayout();
		data.horizontalAlignment = SWT.FILL;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.numColumns = 1;
		choiceComposite.setLayout(layout);

		final Label choiceLabel = new Label(choiceComposite, SWT.NONE);
		choiceLabel.setText(Messages.LoadFacetsDialog_AvailableCustomizationsLabel);

		final GridData choiceLabelGridData = new GridData();
		choiceLabelGridData.verticalAlignment = SWT.FILL;
		choiceLabelGridData.horizontalAlignment = SWT.FILL;
		choiceLabel.setLayoutData(choiceLabelGridData);

		final Text patternText = createFilterText(choiceComposite);

		final Tree availableCustomizationsTree = new Tree(choiceComposite, SWT.MULTI | SWT.BORDER);
		final GridData availableCustomizationsGridData = new GridData();
		availableCustomizationsGridData.widthHint = LoadCustomizationsDialog.CUSTOMIZATIONS_TREE_WIDTH;
		availableCustomizationsGridData.heightHint = LoadCustomizationsDialog.CUSTOMIZATIONS_TREE_HEIGHT;
		availableCustomizationsGridData.horizontalAlignment = SWT.FILL;
		availableCustomizationsGridData.verticalAlignment = SWT.FILL;
		availableCustomizationsGridData.grabExcessHorizontalSpace = true;
		availableCustomizationsGridData.grabExcessVerticalSpace = true;
		availableCustomizationsTree.setLayoutData(availableCustomizationsGridData);

		this.fAvailableCustomizationsTreeViewer = new TreeViewer(availableCustomizationsTree);
		this.fAvailableCustomizationsTreeViewer.setContentProvider(this.fContentProvider);
		this.fAvailableCustomizationsTreeViewer.setLabelProvider(this.fLabelProvider);
		final PatternFilter filter = new PatternFilter();
		this.fAvailableCustomizationsTreeViewer.addFilter(filter);

		this.fAvailableCustomizationsTreeViewer.setInput(this.fAvailableCustomizations);

		final TreeItem treeItem = new TreeItem(availableCustomizationsTree, SWT.NONE);
		treeItem.setText(Messages.LoadCustomizationsDialog_Loading);

		patternText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				filter.setPattern(patternText.getText());
				LoadCustomizationsDialog.this.fAvailableCustomizationsTreeViewer.refresh();
			}
		});
	}

	private void createMiddleButtonsPane(final Composite contents) {
		final Composite buttonsComposite = new Composite(contents, SWT.NONE);
		final GridData buttonsCompositeGridData = new GridData();
		buttonsCompositeGridData.verticalAlignment = SWT.CENTER;
		buttonsCompositeGridData.horizontalAlignment = SWT.FILL;
		buttonsComposite.setLayoutData(buttonsCompositeGridData);
		buttonsComposite.setLayout(new GridLayout());

		// new Label(buttonsComposite, SWT.NONE);

		this.fAddButton = new Button(buttonsComposite, SWT.PUSH);
		this.fAddButton.setText(Messages.LoadCustomizationsDialog_Add);
		this.fAddButton.setToolTipText(Messages.LoadFacetsDialog_AddTooltip);
		final GridData addButtonGridData = new GridData();
		addButtonGridData.verticalAlignment = SWT.FILL;
		addButtonGridData.horizontalAlignment = SWT.FILL;
		this.fAddButton.setLayoutData(addButtonGridData);

		this.fRemoveButton = new Button(buttonsComposite, SWT.PUSH);
		this.fRemoveButton.setText(Messages.LoadCustomizationsDialog_Remove);
		this.fRemoveButton.setToolTipText(Messages.LoadFacetsDialog_RemoveTooltip);
		final GridData removeButtonGridData = new GridData();
		removeButtonGridData.verticalAlignment = SWT.FILL;
		removeButtonGridData.horizontalAlignment = SWT.FILL;
		this.fRemoveButton.setLayoutData(removeButtonGridData);

		spacer(buttonsComposite);

		this.fAddAllButton = new Button(buttonsComposite, SWT.PUSH);
		this.fAddAllButton.setText(Messages.LoadCustomizationsDialog_AddAll);
		this.fAddAllButton.setToolTipText(Messages.LoadFacetsDialog_AddAllTooltip);

		this.fRemoveAllButton = new Button(buttonsComposite, SWT.PUSH);
		this.fRemoveAllButton.setText(Messages.LoadCustomizationsDialog_RemoveAll);
		this.fRemoveAllButton.setToolTipText(Messages.LoadFacetsDialog_RemoveAllTooltip);
	}

	private void spacer(final Composite parent) {
		@SuppressWarnings("unused")
		Label label = new Label(parent, SWT.NONE);
	}

	private void createRightButtonsPane(final Composite contents) {
		final Composite buttonsComposite = new Composite(contents, SWT.NONE);
		final GridData buttonsCompositeGridData = new GridData();
		buttonsCompositeGridData.verticalAlignment = SWT.FILL;
		buttonsCompositeGridData.horizontalAlignment = SWT.FILL;
		buttonsComposite.setLayoutData(buttonsCompositeGridData);
		buttonsComposite.setLayout(new GridLayout());

		// spacer
		spacer(buttonsComposite);

		this.fUpButton = new Button(buttonsComposite, SWT.PUSH);
		this.fUpButton.setText(Messages.LoadFacetsDialog_UpLabel);
		final GridData upButtonGridData = new GridData();
		upButtonGridData.verticalAlignment = SWT.FILL;
		upButtonGridData.horizontalAlignment = SWT.FILL;
		this.fUpButton.setLayoutData(upButtonGridData);

		this.fDownButton = new Button(buttonsComposite, SWT.PUSH);
		this.fDownButton.setText(Messages.LoadFacetsDialog_DownLabel);
		final GridData downButtonGridData = new GridData();
		downButtonGridData.verticalAlignment = SWT.FILL;
		downButtonGridData.horizontalAlignment = SWT.FILL;
		this.fDownButton.setLayoutData(downButtonGridData);
	}

	private void createRightPane(final Composite contents) {
		final Composite featureComposite = new Composite(contents, SWT.NONE);
		final GridData featureCompositeData = new GridData(SWT.FILL, SWT.FILL, true, true);
		featureCompositeData.horizontalAlignment = SWT.END;
		featureComposite.setLayoutData(featureCompositeData);

		final GridLayout featureCompositeLayout = new GridLayout();
		featureCompositeData.horizontalAlignment = SWT.FILL;
		featureCompositeLayout.marginHeight = 0;
		featureCompositeLayout.marginWidth = 0;
		featureCompositeLayout.numColumns = 1;
		featureComposite.setLayout(featureCompositeLayout);

		final Label featureLabel = new Label(featureComposite, SWT.NONE);
		featureLabel.setText(Messages.LoadFacetsDialog_LoadedCustomizations);
		final GridData featureLabelGridData = new GridData();
		featureLabelGridData.horizontalSpan = 2;
		featureLabelGridData.horizontalAlignment = SWT.FILL;
		featureLabelGridData.verticalAlignment = SWT.FILL;
		featureLabel.setLayoutData(featureLabelGridData);

		final Tree loadedCustomizationsTree = new Tree(featureComposite, SWT.MULTI | SWT.BORDER);
		final GridData loadedCustomizationsGridData = new GridData();
		loadedCustomizationsGridData.widthHint = LoadCustomizationsDialog.CUSTOMIZATIONS_TREE_WIDTH;
		loadedCustomizationsGridData.heightHint = LoadCustomizationsDialog.CUSTOMIZATIONS_TREE_HEIGHT;
		loadedCustomizationsGridData.verticalAlignment = SWT.FILL;
		loadedCustomizationsGridData.horizontalAlignment = SWT.FILL;
		loadedCustomizationsGridData.grabExcessHorizontalSpace = true;
		loadedCustomizationsGridData.grabExcessVerticalSpace = true;
		loadedCustomizationsTree.setLayoutData(loadedCustomizationsGridData);

		this.fSelectedCustomizationsTreeViewer = new TreeViewer(loadedCustomizationsTree);
		this.fSelectedCustomizationsTreeViewer.setContentProvider(this.fContentProvider);
		this.fSelectedCustomizationsTreeViewer.setLabelProvider(this.fLabelProvider);
		this.fSelectedCustomizationsTreeViewer.setInput(this.fSelectedCustomizations);
	}

	private void createLoadRequiredFacetsCheckbox(final Composite contents) {
		spacer(contents);
		spacer(contents);
		this.fLoadRequiredFacetsCheckbox = new Button(contents, SWT.CHECK);
		this.fLoadRequiredFacetsCheckbox
				.setText(Messages.LoadCustomizationsDialog_loadReferencedFacetsCheckbox);
		this.fLoadRequiredFacetsCheckbox.setSelection(true);
		this.fLoadRequiredFacetsCheckbox
				.setLayoutData(new GridData(SWT.END, SWT.FILL, false, false));

	}

	private Text createFilterText(final Composite contents) {
		Text patternText = new Text(contents, SWT.BORDER | SWT.SEARCH);
		patternText.setMessage(Messages.LoadFacetsDialog_FilterTextMessage);
		patternText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		return patternText;
	}

	@Override
	protected void okPressed() {
		this.fLoadRequiredFacetsSelected = this.fLoadRequiredFacetsCheckbox.getSelection();
		super.okPressed();
	}

	public boolean isLoadRequiredFacetsSelected() {
		return this.fLoadRequiredFacetsSelected;
	}

	// @Override
	// public boolean close() {
	// fContentProvider.dispose();
	// return super.close();
	// }

	public List<MetamodelView> getSelectedCustomizations() {
		return this.fSelectedCustomizations;
	}

	private void refresh() {
		LoadCustomizationsDialog.this.fAvailableCustomizationsTreeViewer.refresh();
		LoadCustomizationsDialog.this.fSelectedCustomizationsTreeViewer.refresh();
	}
}
