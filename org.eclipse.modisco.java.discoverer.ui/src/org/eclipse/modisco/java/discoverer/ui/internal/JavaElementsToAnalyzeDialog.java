/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Nicolas Bros (Mia-Software) - Bug 342548 - [Java Discovery] Illegal parameter initializer for ELEMENTS_TO_ANALYZE
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.ui.internal;

import java.io.File;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class JavaElementsToAnalyzeDialog extends TitleAreaDialog {

	private static final int COLUMN_USE_SOURCE_WIDTH = 130;

	private static final int COLUMN_DEPENDENCY_SHORTNAME_WIDTH = 400;

	private static final int COLUMN_DEPENDENCY_LONGNAME_WIDTH = 200;

	private static final int DIALOG_WIDTH = 800;

	private static final int DIALOG_HEIGHT = 700;

	private static final String USE_SOURCES_OPTIONS = "USE_SOURCES"; //$NON-NLS-1$

	private final ElementsToAnalyze elementsToAnalyze;

	/** the tree to selected the dependencies to discover */
	private CheckboxTreeViewer dependenciesTree;

	/**
	 * the label which shows the number of selected projects/libraries.
	 */
	private Label textNumberElementsSelected;

	/**
	 * @param parentShell
	 *            the parent shell
	 * @param discoverableElements
	 *            elements that can be chosen for analysis
	 * @param initialElementsToAnalyze
	 *            the initial selection of elements to analyze with their
	 *            associated options
	 */
	protected JavaElementsToAnalyzeDialog(final Shell parentShell,
			final ElementsToAnalyze initialElementsToAnalyze) {
		super(parentShell);
		if (initialElementsToAnalyze != null) {
			this.elementsToAnalyze = AbstractDiscoverJavaModelFromProject
					.computeElementsToDiscover(initialElementsToAnalyze);
		} else {
			throw new IllegalStateException(
					"initialElementsToAnalyze is null. It should be initialized (cf @ParameterInitialValue)"); //$NON-NLS-1$
		}
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new GridLayout());

		setTitle(Messages.JavaElementsToAnalyzeDialog_title);
		setMessage(Messages.JavaElementsToAnalyzeDialog_message);

		final CheckboxTreeViewer treeViewer = new CheckboxTreeViewer(composite,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE
						| SWT.FULL_SELECTION);
		this.dependenciesTree = treeViewer;

		treeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(final CheckStateChangedEvent event) {

				Object element = event.getElement();
				if (event.getChecked()) {
					getElementsToAnalyze().addElementToDiscover(element);
				} else {
					getElementsToAnalyze().removeElementToDiscover(element);
				}

				treeViewer.update(event.getElement(), null);
				refreshInformationLabel();
			}
		});
		treeViewer.getTree().setLinesVisible(true);
		treeViewer.getTree().setHeaderVisible(true);

		TreeViewerColumn columnShortName = new TreeViewerColumn(
				getDependenciesTree(), SWT.NONE);
		columnShortName.getColumn().setWidth(
				JavaElementsToAnalyzeDialog.COLUMN_DEPENDENCY_SHORTNAME_WIDTH);
		columnShortName.getColumn().setText(
				Messages.JavaElementsToAnalyzeDialog_name);
		columnShortName.setLabelProvider(new JDTDelegateColumnLabelProvider(
				true));

		TreeViewerColumn columnUseSource = new TreeViewerColumn(
				getDependenciesTree(), SWT.NONE);
		columnUseSource.getColumn().setWidth(
				JavaElementsToAnalyzeDialog.COLUMN_USE_SOURCE_WIDTH);
		columnUseSource.getColumn().setText(
				Messages.JavaElementsToAnalyzeDialog_useSources);
		columnUseSource.getColumn().setAlignment(SWT.CENTER);
		columnUseSource.setLabelProvider(new UseSourceColumnLabelProvider());

		columnUseSource.setEditingSupport(new UseSourceEditingSupport(
				getDependenciesTree()));

		TreeViewerColumn columnLongName = new TreeViewerColumn(
				getDependenciesTree(), SWT.NONE);
		columnLongName.getColumn().setWidth(
				JavaElementsToAnalyzeDialog.COLUMN_DEPENDENCY_LONGNAME_WIDTH);
		columnLongName.getColumn().setText(
				Messages.JavaElementsToAnalyzeDialog_Path);
		columnLongName.setLabelProvider(new JDTDelegateColumnLabelProvider(
				false));

		treeViewer.getTree().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		DependenciesContentProvider contentProvider = new DependenciesContentProvider();
		getDependenciesTree().setContentProvider(contentProvider);
		DependenciesTreeInput input = new DependenciesTreeInput(
				this.elementsToAnalyze.getJavaProject());
		getDependenciesTree().setInput(input);

		// check and expand the elements which are selected
		Object[] elements = contentProvider.getElements(input);
		for (Object element : elements) {
			if (getElementsToAnalyze().getElementsToDiscover()
					.contains(element)) {
				getDependenciesTree().setChecked(element, true);
				getDependenciesTree().expandToLevel(element, 1);
			}
			Object[] children = contentProvider.getChildren(element);
			for (Object child : children) {
				if (getElementsToAnalyze().getElementsToDiscover().contains(
						child)) {
					getDependenciesTree().setChecked(child, true);
				}
			}
		}

		// "n selected" label at the bottom of the dialog
		Composite compositeLabels = new Composite(composite, SWT.NONE);
		compositeLabels.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));

		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = false;
		compositeLabels.setLayout(rowLayout);

		Label imageInformationNumberElementsSelected = new Label(
				compositeLabels, SWT.NONE);
		imageInformationNumberElementsSelected.setImage(PlatformUI
				.getWorkbench().getSharedImages()
				.getImage(org.eclipse.ui.ISharedImages.IMG_OBJS_INFO_TSK));

		this.textNumberElementsSelected = new Label(compositeLabels, SWT.NONE);
		refreshInformationLabel();

		return composite;

	}

	protected static boolean hasSourceAvailable(final Object element) {
		if (element instanceof IPackageFragmentRoot) {
			IPackageFragmentRoot lib = (IPackageFragmentRoot) element;
			try {
				return lib.getSourceAttachmentPath() != null;
			} catch (JavaModelException e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return false;
	}

	protected void refreshInformationLabel() {

		int nProjectsSelected = 0;
		int nLibrariesSelected = 0;

		// we count the checked elements in the tree
		// if the user wants to discover dependencies
		for (Object element : getDependenciesTree().getCheckedElements()) {
			if (element instanceof IJavaProject) {
				nProjectsSelected++;
			} else if (element instanceof IPackageFragmentRoot) {
				nLibrariesSelected++;
			}
		}

		StringBuilder builder = new StringBuilder();
		builder.append(nProjectsSelected);
		if (nProjectsSelected > 1) {
			builder.append(Messages.JavaElementsToAnalyzeDialog_projects);
		} else {
			builder.append(Messages.JavaElementsToAnalyzeDialog_project);
		}

		builder.append(Messages.JavaElementsToAnalyzeDialog_and);
		builder.append(nLibrariesSelected);
		if (nLibrariesSelected > 1) {
			builder.append(Messages.JavaElementsToAnalyzeDialog_libraries);
		} else {
			builder.append(Messages.JavaElementsToAnalyzeDialog_library);
		}
		builder.append(Messages.JavaElementsToAnalyzeDialog_selected);

		this.textNumberElementsSelected.setText(builder.toString());
		this.textNumberElementsSelected.pack(true);
	}

	/**
	 * because JFace doesn't like the input to be in the list of elements (leads
	 * to recursion)
	 */
	protected class DependenciesTreeInput {
		private final IJavaProject javaProject;

		public DependenciesTreeInput(final IJavaProject javaProject) {
			this.javaProject = javaProject;
		}

		public IJavaProject getJavaProject() {
			return this.javaProject;
		}
	}

	/** The tree content provider for the Dependencies Tree. */
	protected class DependenciesContentProvider implements ITreeContentProvider {

		public Object[] getElements(final Object inputElement) {
			if (inputElement instanceof DependenciesTreeInput) {
				IJavaProject javaProject = ((DependenciesTreeInput) inputElement)
						.getJavaProject();
				if (javaProject != null) {
					try {
						Set<IJavaProject> projects = AbstractDiscoverJavaModelFromProject
								.computeRequiredProjects(javaProject);
						return projects.toArray();
					} catch (JavaModelException e) {
						Logger.logError(e, Activator.getDefault());
					}
				}
			} else {
				throw new IllegalArgumentException("wrong input"); //$NON-NLS-1$
			}
			return new Object[0];
		}

		public boolean hasChildren(final Object element) {
			if (element instanceof IJavaProject) {
				return true;
			}
			return false;
		}

		public Object[] getChildren(final Object element) {
			if (element instanceof IJavaProject) {
				IJavaProject javaProject = (IJavaProject) element;
				try {
					Set<IPackageFragmentRoot> requiredLibraries = AbstractDiscoverJavaModelFromProject
							.computeRequiredLibraries(javaProject);
					return requiredLibraries.toArray();
				} catch (JavaModelException e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
			return new Object[0];
		}

		public Object getParent(final Object element) {
			if (element instanceof IPackageFragmentRoot) {
				return ((IPackageFragmentRoot) element).getJavaProject();
			}
			return null;
		}

		public void dispose() {
			// Nothing
		}

		public void inputChanged(final Viewer viewer, final Object oldInput,
				final Object newInput) {
			// Nothing
		}
	}

	protected class UseSourceColumnLabelProvider extends ColumnLabelProvider {
		@Override
		public String getText(final Object element) {
			if (element instanceof IPackageFragmentRoot
					&& getElementsToAnalyze().getElementsToDiscover().contains(
							element)) {
				IPackageFragmentRoot packageFragmentRoot = (IPackageFragmentRoot) element;
				if (!hasSourceAvailable(packageFragmentRoot)) {
					return Messages.JavaElementsToAnalyzeDialog_sourceNotAvailable;
				}
				Map<String, Object> discoveryOptions = getElementsToAnalyze()
						.getDiscoveryOptions(packageFragmentRoot);
				if (discoveryOptions != null
						&& Boolean.TRUE
								.equals(discoveryOptions
										.get(JavaElementsToAnalyzeDialog.USE_SOURCES_OPTIONS))) {
					return Messages.JavaElementsToAnalyzeDialog_useSource;
				}
				return Messages.JavaElementsToAnalyzeDialog_dontUseSource;
			}
			return ""; //$NON-NLS-1$
		}

		@Override
		public Color getForeground(final Object element) {
			if (!hasSourceAvailable(element)) {
				return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
			}
			return null;
		}
	}

	/**
	 * A column label provider which extends and delegates to the JDT label
	 * provider.
	 */
	protected class JDTDelegateColumnLabelProvider extends ColumnLabelProvider {

		private final JavaElementLabelProvider delegate = new JavaElementLabelProvider();
		private boolean displayShortName = true;

		public JDTDelegateColumnLabelProvider(final boolean displayShortName) {
			this.displayShortName = displayShortName;
		}

		@Override
		public void addListener(final ILabelProviderListener listener) {
			this.delegate.addListener(listener);
		}

		@Override
		public void dispose() {
			this.delegate.dispose();
		}

		@Override
		public boolean equals(final Object obj) {
			return this.delegate.equals(obj);
		}

		@Override
		public Image getImage(final Object element) {
			if (this.displayShortName) {
				return this.delegate.getImage(element);
			}
			return null;
		}

		@Override
		public String getText(final Object element) {
			String qualifiedName = this.delegate.getText(element);
			int lastSegmentindex = qualifiedName.lastIndexOf(File.separator);
			String text = null;

			if (this.displayShortName) {
				text = qualifiedName.substring(lastSegmentindex + 1);
			} else if (lastSegmentindex > -1) {
				text = qualifiedName.substring(0, lastSegmentindex);
			} else {
				text = ""; //$NON-NLS-1$
			}
			return text;
		}

		@Override
		public int hashCode() {
			return this.delegate.hashCode();
		}

		@Override
		public boolean isLabelProperty(final Object element,
				final String property) {
			return this.delegate.isLabelProperty(element, property);
		}

		@Override
		public void removeListener(final ILabelProviderListener listener) {
			this.delegate.removeListener(listener);
		}

		@Override
		public String toString() {
			return this.delegate.toString();
		}

	}

	/** Editing support for the "use source" column. */
	protected class UseSourceEditingSupport extends EditingSupport {

		public UseSourceEditingSupport(final ColumnViewer columnViewer) {
			super(columnViewer);
		}

		@Override
		protected CellEditor getCellEditor(final Object element) {
			return new CheckboxCellEditor();
		}

		@Override
		protected boolean canEdit(final Object element) {
			return hasSourceAvailable(element);
		}

		@Override
		protected Object getValue(final Object element) {
			Map<String, Object> discoveryOptions = getElementsToAnalyze()
					.getDiscoveryOptions(element);
			if (discoveryOptions != null) {
				Object option = discoveryOptions
						.get(JavaElementsToAnalyzeDialog.USE_SOURCES_OPTIONS);
				if (option instanceof Boolean) {
					return option;
				}
			}
			return Boolean.FALSE;
		}

		@Override
		protected void setValue(final Object element, final Object value) {
			Map<String, Object> discoveryOptions = getElementsToAnalyze()
					.getDiscoveryOptions(element);
			if (discoveryOptions != null) {
				discoveryOptions.put(
						JavaElementsToAnalyzeDialog.USE_SOURCES_OPTIONS, value);
			}
			getDependenciesTree().refresh();
		}

	}

	protected CheckboxTreeViewer getDependenciesTree() {
		return this.dependenciesTree;
	}

	public ElementsToAnalyze getElementsToAnalyze() {
		return this.elementsToAnalyze;
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		final String sectionName = JavaElementsToAnalyzeDialog.class.getName();
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings section = settings.getSection(sectionName);
		if (section == null) {
			section = settings.addNewSection(sectionName);
			section.put("DIALOG_WIDTH", JavaElementsToAnalyzeDialog.DIALOG_WIDTH); //$NON-NLS-1$
			section.put("DIALOG_HEIGHT", JavaElementsToAnalyzeDialog.DIALOG_HEIGHT); //$NON-NLS-1$
		}
		return section;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	public boolean isHelpAvailable() {
		return false;
	}
}
