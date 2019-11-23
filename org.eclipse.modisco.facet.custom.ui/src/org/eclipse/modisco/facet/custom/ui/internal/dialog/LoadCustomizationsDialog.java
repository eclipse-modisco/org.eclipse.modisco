/*******************************************************************************
 * Copyright (c) 2009, 2015 Mia-Software, CEA-LIST, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Vincent Lorenzo (CEA-LIST) - Bug 341328 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *     Grégoire Dupé (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *     Grégoire Dupé (Mia-Software) - Bug 373078 - API Cleaning
 *     Thomas Cicognani (Soft-Maint) - Bug 441422 - LoadCustomizationsDialog UI bugs
 *     Grégoire Dupé (Mia-Software) - Bug 472747 - The customization loading dialog is not easily readable
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal.dialog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.custom.ui.internal.Messages;
import org.eclipse.modisco.facet.custom.ui.internal.exported.dialog.ILoadCustomizationsDialog;
import org.eclipse.modisco.facet.custom.ui.internal.exported.exception.IllegalParameterException;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallbackWithPreCommit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
import org.eclipse.ui.dialogs.PatternFilter;

public class LoadCustomizationsDialog<D> extends Dialog implements
		ILoadCustomizationsDialog<D> {

	private static final int TREE_WIDTH = 300;
	private static final int TREE_HEIGHT = 250;
	private static final int NUM_COLUMNS = 4;
	private final List<Customization> availableCustoms;
	private final LabelProvider labelProvider;
	private final IContentProvider contentProvider = new ITreeContentProvider() {
		private final Comparator<Customization> comparator = new Comparator<Customization>() {
			public int compare(final Customization custom1, final Customization custom2) {
				String name1 = custom1.getName();
				String name2 = custom2.getName();
				if (name1 == null) {
					name1 = ""; //$NON-NLS-1$
				}
				if (name2 == null) {
					name2 = ""; //$NON-NLS-1$
				}
				return name1.compareTo(name2);
			}
		};
		
		public Object[] getElements(final Object inputElement) {
			@SuppressWarnings("unchecked")
			final List<Customization> customizations = (List<Customization>) inputElement;
			Collections.sort(customizations, this.comparator);
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
			return new Object[]{};
		}

		public Object getParent(final Object element) {
			return null;
		}

		public boolean hasChildren(final Object element) {
			return false;
		}
	};
	private final EList<Customization> selectedCustoms;
	private TreeViewer availableCustomTV;
	private TreeViewer selectedCustomTV;
	private Button addButton;
	private Button removeButton;
	private Button addAllButton;
	private Button removeAllButton;
	private Button upButton;
	private Button downButton;
	private Button loadRequiredFacetsCheckbox;
	private boolean loadRequiredFacetsSelected = false;
	private final IDialogCallbackWithPreCommit<List<Customization>, Boolean, D> callback;
	private final List<Customization> lockedCustoms;
	private final String lockMsg;

	public LoadCustomizationsDialog(final Shell parent,
			final List<Customization> availableCustoms, 
			final List<Customization> selectedCustoms,
			final List<Customization> lockedCustoms,
			final IDialogCallbackWithPreCommit<List<Customization>, Boolean, D> callback,
			final String lockMsg) {
		super(parent);
		this.labelProvider = new ColorLabelProvider(this);
		this.callback = callback;
		this.selectedCustoms = new BasicEList<Customization>();
		this.availableCustoms = new ArrayList<Customization>(availableCustoms);
		this.lockedCustoms = lockedCustoms;
		this.lockMsg = lockMsg;
		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
		// initial selection
		for (final Customization iniSelectedCustom : selectedCustoms) {
			final URI selectedCustomURI = EcoreUtil
					.getURI(iniSelectedCustom);
			final ListIterator<Customization> availableCustIter = this.availableCustoms
					.listIterator();
			while (availableCustIter.hasNext()) {
				final Customization availableCustom = availableCustIter
						.next();
				final URI availableCustURI = EcoreUtil
						.getURI(availableCustom);
				if (availableCustURI
						.equals(selectedCustomURI)) {
					availableCustIter.remove();
					LoadCustomizationsDialog.this.selectedCustoms
							.add(iniSelectedCustom);
				}
			}
		}
		for (Customization lockedCustom : this.lockedCustoms) {
			if (!this.selectedCustoms.contains(lockedCustom)) {
				this.selectedCustoms.add(lockedCustom);
			}
		}
	}

	@Override
	protected void configureShell(final Shell shell) {
		super.configureShell(shell);
		shell.setText(Messages.LoadCustomizationsDialog_title_LoadCustomizations);
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite contents = (Composite) super.createDialogArea(parent);

		final GridLayout contentsGLayout = (GridLayout) contents.getLayout();
		contentsGLayout.numColumns = LoadCustomizationsDialog.NUM_COLUMNS;

		final GridData contentsGridData = (GridData) contents.getLayoutData();
		contentsGridData.horizontalAlignment = SWT.FILL;
		contentsGridData.verticalAlignment = SWT.FILL;

		createLeftPane(contents);
		createMiddleButtonsPane(contents);
		createRightPane(contents);
		createRightButtonsPane(contents);
		createLoadRequiredFacetsCheckbox(contents);

		this.availableCustomTV.addDoubleClickListener(new IDoubleClickListener() {
			
			public void doubleClick(final DoubleClickEvent event) {
				loadSelectedCustoms();
			}
		});

		this.selectedCustomTV.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(final DoubleClickEvent event) {
				unloadSelectedCustoms();
			}
		});

		this.upButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				upButtonClicked();
			}
		});

		this.downButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				downButtonClicked();
			}
		});

		this.addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				loadSelectedCustoms();
			}
		});

		this.addAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				addAllButtonClicked();
			}
		});

		this.removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				unloadSelectedCustoms();
			}
		});

		this.removeAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				removeAllButtonClicked();
			}
		});

		return contents;
	}

	public final void upButtonClicked() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.selectedCustomTV
				.getSelection();
		int minIndex = 0;
		for (Object selectedObject : selection.toList()) {
			if (selectedObject instanceof Customization) {
				final Customization customization = (Customization) selectedObject;
				final int index = this.selectedCustoms
						.indexOf(customization);
				this.selectedCustoms.move(
						Math.max(index - 1, minIndex++), customization);
			}
		}
		LoadCustomizationsDialog.this.selectedCustomTV.refresh();
	}

	public final void downButtonClicked() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.selectedCustomTV
				.getSelection();
		final ArrayList<Object> selectedObjects = new ArrayList<Object>();
		for (final Object selectedObject : selection.toArray()) {
			selectedObjects.add(selectedObject);
		}

		// prevent the last two elements from swapping
		boolean canMove = !selectedObjects
				.contains(LoadCustomizationsDialog.this.selectedCustoms
						.get(LoadCustomizationsDialog.this.selectedCustoms.size() - 1));
		for (int i = LoadCustomizationsDialog.this.selectedCustoms.size() - 2; i >= 0; i--) {
			final Customization selectedCustom = LoadCustomizationsDialog.this.selectedCustoms
					.get(i);
			if (selectedObjects.contains(selectedCustom)) {
				if (canMove) {
					LoadCustomizationsDialog.this.selectedCustoms.move(i + 1,
							selectedCustom);
				}
			} else {
				canMove = true;
			}

		}

		LoadCustomizationsDialog.this.selectedCustomTV.refresh();
	}

	public final void loadSelectedCustoms() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.availableCustomTV
				.getSelection();
		for (Object object : selection.toList()) {
			if (object instanceof Customization) {
				final Customization custom = (Customization) object;
				if (!this.selectedCustoms.contains(custom)) {
					this.selectedCustoms.add(custom);
					this.availableCustoms.remove(custom);
				}
			}
		}
		refresh();
		this.selectedCustomTV.setSelection(selection);
	}

	public final void addAllButtonClicked() {
		final ListIterator<Customization> listIterator = this.availableCustoms
				.listIterator();
		while (listIterator.hasNext()) {
			final Customization element = listIterator.next();
			this.selectedCustoms.add(element);
			listIterator.remove();
		}
		refresh();
	}

	public final void unloadSelectedCustoms() {
		final IStructuredSelection selection = (IStructuredSelection) LoadCustomizationsDialog.this.selectedCustomTV
				.getSelection();
		final List<Customization> toBeRemoved = new ArrayList<Customization>();
		boolean lockedCustomFound = false;
		for (Object object : selection.toList()) {
			if (this.lockedCustoms.contains(object)) {
				lockedCustomFound = true;
			} else if (object instanceof Customization) {
				final Customization element = (Customization) object;
				toBeRemoved.add(element);
			}
		}
		if (lockedCustomFound) {
			final MessageDialog dialog = new MessageDialog(
					null,
					Messages.LoadCustomizationsDialog_LoadCustomizationWarning,
					null,
					Messages.LoadCustomizationsDialog_Can_not_be_unload + this.lockMsg,
					MessageDialog.WARNING, new String[] { Messages.LoadCustomizationsDialog_OK }, 1);
			dialog.open();
		}
		removeFromSelection(toBeRemoved);
		refresh();	
	}

	protected void removeFromSelection(final List<Customization> toBeRemoved) {
		this.availableCustoms.addAll(toBeRemoved);
		this.selectedCustoms.removeAll(toBeRemoved);
		if (LoadCustomizationsDialog.this.selectedCustoms.size() > 0) {
			LoadCustomizationsDialog.this.selectedCustomTV
					.setSelection(new StructuredSelection(
							LoadCustomizationsDialog.this.selectedCustoms.get(0)));
		}
	}

	public final void removeAllButtonClicked() {
		removeFromSelection(this.selectedCustoms);
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
		choiceLabel.setText(Messages.LoadCustomizationsDialog_AvailiableCustom);

		final GridData choiceLabelGD = new GridData();
		choiceLabelGD.verticalAlignment = SWT.FILL;
		choiceLabelGD.horizontalAlignment = SWT.FILL;
		choiceLabel.setLayoutData(choiceLabelGD);

		final Text patternText = createFilterText(choiceComposite);

		final Tree availableCustomsT = new Tree(choiceComposite, SWT.MULTI | SWT.BORDER);
		final GridData availableCustsGD = new GridData();
		availableCustsGD.widthHint = LoadCustomizationsDialog.TREE_WIDTH;
		availableCustsGD.heightHint = LoadCustomizationsDialog.TREE_HEIGHT;
		availableCustsGD.horizontalAlignment = SWT.FILL;
		availableCustsGD.verticalAlignment = SWT.FILL;
		availableCustsGD.grabExcessHorizontalSpace = true;
		availableCustsGD.grabExcessVerticalSpace = true;
		availableCustomsT.setLayoutData(availableCustsGD);

		this.availableCustomTV = new TreeViewer(availableCustomsT);
		this.availableCustomTV.setContentProvider(this.contentProvider);
		this.availableCustomTV.setLabelProvider(this.labelProvider);
		final PatternFilter filter = new PatternFilter();
		this.availableCustomTV.addFilter(filter);

		this.availableCustomTV.setInput(this.availableCustoms);

		patternText.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent event) {
				filter.setPattern(patternText.getText());
				LoadCustomizationsDialog.this.availableCustomTV.refresh();
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

		this.addButton = new Button(buttonsComposite, SWT.PUSH);
		this.addButton.setText(Messages.LoadCustomizationsDialog_Add);
		this.addButton.setToolTipText(Messages.LoadCustomizationsDialog_Add2);
		final GridData addButtonGridData = new GridData();
		addButtonGridData.verticalAlignment = SWT.FILL;
		addButtonGridData.horizontalAlignment = SWT.FILL;
		this.addButton.setLayoutData(addButtonGridData);

		this.removeButton = new Button(buttonsComposite, SWT.PUSH);
		this.removeButton.setText(Messages.LoadCustomizationsDialog_Remove);
		this.removeButton.setToolTipText(Messages.LoadCustomizationsDialog_Remove2);
		final GridData removeButtonGridData = new GridData();
		removeButtonGridData.verticalAlignment = SWT.FILL;
		removeButtonGridData.horizontalAlignment = SWT.FILL;
		this.removeButton.setLayoutData(removeButtonGridData);

		spacer(buttonsComposite);

		this.addAllButton = new Button(buttonsComposite, SWT.PUSH);
		this.addAllButton.setText(Messages.LoadCustomizationsDialog_AddAll);
		this.addAllButton.setToolTipText(Messages.LoadCustomizationsDialog_AddAll2);

		this.removeAllButton = new Button(buttonsComposite, SWT.PUSH);
		this.removeAllButton.setText(Messages.LoadCustomizationsDialog_RemoveAll);
		this.removeAllButton.setToolTipText(Messages.LoadCustomizationsDialog_RemoveAll2);
	}

	private static void spacer(final Composite parent) {
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

		this.upButton = new Button(buttonsComposite, SWT.PUSH);
		this.upButton.setText(Messages.LoadCustomizationsDialog_Up);
		final GridData upButtonGridData = new GridData();
		upButtonGridData.verticalAlignment = SWT.FILL;
		upButtonGridData.horizontalAlignment = SWT.FILL;
		this.upButton.setLayoutData(upButtonGridData);

		this.downButton = new Button(buttonsComposite, SWT.PUSH);
		this.downButton.setText(Messages.LoadCustomizationsDialog_Down);
		final GridData downButtonGridData = new GridData();
		downButtonGridData.verticalAlignment = SWT.FILL;
		downButtonGridData.horizontalAlignment = SWT.FILL;
		this.downButton.setLayoutData(downButtonGridData);
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
		featureLabel.setText(Messages.LoadCustomizationsDialog_LoadedCustomizations);
		final GridData featureLabelGridData = new GridData();
		featureLabelGridData.horizontalSpan = 2;
		featureLabelGridData.horizontalAlignment = SWT.FILL;
		featureLabelGridData.verticalAlignment = SWT.FILL;
		featureLabel.setLayoutData(featureLabelGridData);

		final Tree loadedCustomizationsTree = new Tree(featureComposite, SWT.MULTI | SWT.BORDER);
		final GridData loadedCustomizationsGridData = new GridData();
		loadedCustomizationsGridData.widthHint = LoadCustomizationsDialog.TREE_WIDTH;
		loadedCustomizationsGridData.heightHint = LoadCustomizationsDialog.TREE_HEIGHT;
		loadedCustomizationsGridData.verticalAlignment = SWT.FILL;
		loadedCustomizationsGridData.horizontalAlignment = SWT.FILL;
		loadedCustomizationsGridData.grabExcessHorizontalSpace = true;
		loadedCustomizationsGridData.grabExcessVerticalSpace = true;
		loadedCustomizationsTree.setLayoutData(loadedCustomizationsGridData);

		this.selectedCustomTV = new TreeViewer(loadedCustomizationsTree);
		this.selectedCustomTV.setContentProvider(this.contentProvider);
		this.selectedCustomTV.setLabelProvider(this.labelProvider);
		this.selectedCustomTV.setInput(this.selectedCustoms);
	}

	private void createLoadRequiredFacetsCheckbox(final Composite contents) {
		spacer(contents);
		spacer(contents);
		this.loadRequiredFacetsCheckbox = new Button(contents, SWT.CHECK);
		this.loadRequiredFacetsCheckbox
				.setText(Messages.LoadCustomizationsDialog_loadReferencedFacetsCheckbox);
		this.loadRequiredFacetsCheckbox.setSelection(true);
		this.loadRequiredFacetsCheckbox
				.setLayoutData(new GridData(SWT.END, SWT.FILL, false, false));

	}

	private static Text createFilterText(final Composite contents) {
		final Text patternText = new Text(contents, SWT.BORDER | SWT.SEARCH);
		patternText.setMessage(Messages.LoadCustomizationsDialog_type_filter_test);
		patternText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		return patternText;
	}

	@Override
	protected void okPressed() {
		pressOk();
	}

	public void commit(final Boolean result) {
		this.callback.committed(this.selectedCustoms, result);
		super.okPressed();
	}

	public boolean isLoadRequiredFacetsSelected() {
		return this.loadRequiredFacetsSelected;
	}

	public List<Customization> getSelectedCustomizations() {
		return this.selectedCustoms;
	}

	private void refresh() {
		LoadCustomizationsDialog.this.availableCustomTV.refresh();
		LoadCustomizationsDialog.this.selectedCustomTV.refresh();
	}

	public void asyncOpen() {
		Display display;
		if (this.getShell() == null) {
			display = Display.getDefault();
		} else {
			display = this.getShell().getDisplay();
		}
		display.asyncExec(new Runnable() {
			public void run() {
				LoadCustomizationsDialog.this.open();
			}
		});
	}

	public D pressOk() {
		this.loadRequiredFacetsSelected = this.loadRequiredFacetsCheckbox
				.getSelection();
		final D preCommitDialog = this.callback
				.openPrecommitDialog(this.selectedCustoms,
						new IDialogCallback<Boolean>() {
							public void committed(final Boolean result) {
								if (result.booleanValue()) {
									LoadCustomizationsDialog.this
											.commit(result);
								}
							}
						});
		if (preCommitDialog == null) {
			this.callback.committed(this.selectedCustoms, Boolean.TRUE);
			super.okPressed();
		}
		return preCommitDialog;
	}

	public void selectAvailableCustom(final Customization customization) {
		final ISelection selection = new StructuredSelection(customization);
		this.availableCustomTV.setSelection(selection);
	}

	public void selectSelectedCustom(final Customization customization) {
		final ISelection selection = new StructuredSelection(customization);
		this.selectedCustomTV.setSelection(selection);
		
	}

	public List<Customization> getLockedCustoms() {
		return this.lockedCustoms;
	}

	public void addCustomization(final Customization customization)
			throws IllegalParameterException {
		// TODO Auto-generated method stub
	}

	public void addCustomizations(final List<Customization> customizations)
			throws IllegalParameterException {
		// TODO Auto-generated method stub
	}

	public void removeCustomization(final Customization customization)
			throws IllegalParameterException {
		// TODO Auto-generated method stub
	}

	public void removeCustomizations(final List<Customization> customizations)
			throws IllegalParameterException {
		// TODO Auto-generated method stub
	}

	public void cancel() {
		// TODO Auto-generated method stub
	}

	public void validate() {
		// TODO Auto-generated method stub
	}

	public List<Customization> getAvailableCustomizations() {
		// TODO Auto-generated method stub
		return null;
	}

	public void pushUp(final Customization customization)
			throws IllegalParameterException {
		// TODO Auto-generated method stub
	}

	public void pushDown(final Customization customization)
			throws IllegalParameterException {
		// TODO Auto-generated method stub
	}
}
