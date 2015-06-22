/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Romain DERVAUX (Mia-Software) - initial API and implementation
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.actions.ui;

import java.io.File;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.actions.DiscoveryParametersBean;
import org.eclipse.gmt.modisco.java.io.library.LibraryReaderOptions;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;

/**
 * The page of the Java Wizard.
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class JavaWizardFirstPage extends WizardPage {

	private static final int COLUMN_USE_SOURCE_WIDTH = 120;

	private static final int COLUMN_DEPENDENCY_SHORTNAME_WIDTH = 400;

	private static final int COLUMN_DEPENDENCY_LONGNAME_WIDTH = 200;

	private Button btnMemberAnalyseJavaFiles;

	private Button btnFullAnalyseJavaFiles;

	/**
	 * the tree to selected the dependencies to discover
	 */
	private CheckboxTreeViewer dependenciesTree;

	/**
	 * The selected java project
	 */
	private IJavaProject javaProject;

	/**
	 * The button which allows to discover attached sources of a library instead
	 * of the java model created by the jdt.
	 */
	private Button btnUseSource;

	/**
	 * The button for incremental mode
	 */
	private Button btnIncrementalMode;

	/**
	 * the label which shows the number of selected projects/libraries.
	 */
	private Label textNumberElementsSelected;

	private Collection<Object> discoverableElements;

	private DiscoveryParametersBean discoveryParameters;

	/**
	 * the entry fields where the user indicate the types and packages to
	 * exclude/include during analysis
	 */
	private Text elementsToExcludeFilter;

	private Text elementsToIncludeFilter;
	
	private Button btnAnalyzeAllFilter;
	
	private Button btnExcludeFilter;

	private Button btnIncludeFilter;

	public static final String PATH_WIZARD_IMAGE = "icons/ModelWizardBanner.png"; //$NON-NLS-1$

	public JavaWizardFirstPage(final IJavaProject javaProject, final String pageName,
			final Collection<Object> discoverableElements,
			final DiscoveryParametersBean discoveryParameters) {
		super(pageName);
		setTitle(pageName);
		setDescription(Messages.JavaWizardFirstPage_settingsLabel);
		setImageDescriptor(JavaActivator.getImageDescriptor(JavaWizardFirstPage.PATH_WIZARD_IMAGE));
		setJavaProject(javaProject);
		setDiscoverableElements(discoverableElements);
		setDiscoveryParameters(discoveryParameters);
	}

	/**
	 * The tree content provider for the Dependencies Tree.
	 */
	class MyTreeContentProvider implements ITreeContentProvider {

		public Object[] getChildren(final Object element) {
			Set<IPackageFragmentRoot> libraries = new LinkedHashSet<IPackageFragmentRoot>();
			if (element instanceof IJavaProject) {
				for (Object tmp : getDiscoverableElements()) {
					if (tmp instanceof IPackageFragmentRoot) {
						IPackageFragmentRoot lib = (IPackageFragmentRoot) tmp;
						if (lib.getJavaProject().equals(element)) {
							libraries.add(lib);
						}
					}
				}
			}
			return libraries.toArray();
		}

		public Object getParent(final Object element) {
			if (element instanceof IPackageFragmentRoot) {
				return ((IPackageFragmentRoot) element).getJavaProject();
			}
			return null;
		}

		public boolean hasChildren(final Object element) {
			if (element instanceof IJavaProject) {
				return true;
			}
			return false;
		}

		public Object[] getElements(final Object inputElement) {
			Set<IJavaProject> projects = new LinkedHashSet<IJavaProject>();
			projects.add(getJavaProject());
			for (Object element : getDiscoverableElements()) {
				if (element instanceof IJavaProject) {
					projects.add((IJavaProject) element);
				}
			}
			return projects.toArray();
		}

		public void dispose() {
			// Nothing
		}

		public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			// Nothing
		}
	}

	public void createControl(final Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout formLayout = new GridLayout();
		composite.setLayout(formLayout);

		createDependenciesPanel(composite);

		createIncrementalPanel(composite);

		createJavaAnalysisLevelPanel(composite);

		createJavaFilterPanel(composite);

		// refreshDependenciesPanel();
		refreshInformationLabel();
		// refreshAnalysisLevelPanel();
		validatePage();

		setControl(composite);
	}

	private void createDependenciesPanel(final Composite composite) {
		// //////////////////////////////
		// the Dependencies Panel
		// //////////////////////////////
		Group dependencies = new Group(composite, SWT.NONE);
		dependencies.setText(Messages.JavaWizardFirstPage_dependencies);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		dependencies.setLayout(layout);

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		dependencies.setLayoutData(gridData);

		Label l = new Label(dependencies, SWT.NONE);
		l.setText(Messages.JavaWizardFirstPage_selectProjects);
		gridData = new GridData();
		gridData.horizontalSpan = 2;
		l.setLayoutData(gridData);

		// //////////////////
		// Dependencies Tree
		// /////////////////
		setDependenciesTree(new CheckboxTreeViewer(dependencies, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION));

		getDependenciesTree().addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(final CheckStateChangedEvent event) {

				Object element = event.getElement();

				if (JavaWizardFirstPage.this.getDiscoveryParameters().getElementsToDiscover()
						.contains(element)) {
					JavaWizardFirstPage.this.getDiscoveryParameters().removeElementToDiscover(
							element);
				} else {
					JavaWizardFirstPage.this.getDiscoveryParameters().addElementToDiscover(element);
				}

				JavaWizardFirstPage.this.getDependenciesTree().update(event.getElement(), null);
				refreshBtnUseSources();
				refreshInformationLabel();
				validatePage();
			}
		});
		getDependenciesTree().getTree().setLinesVisible(false);
		getDependenciesTree().getTree().setHeaderVisible(true);

		TreeViewerColumn column1 = new TreeViewerColumn(getDependenciesTree(), SWT.NONE);
		column1.getColumn().setWidth(JavaWizardFirstPage.COLUMN_DEPENDENCY_SHORTNAME_WIDTH);
		column1.getColumn().setText(Messages.JavaWizardFirstPage_name);
		column1.setLabelProvider(new JDTDelegateCellLabelProvider(true));

		TreeViewerColumn column2 = new TreeViewerColumn(getDependenciesTree(), SWT.NONE);
		column2.getColumn().setWidth(JavaWizardFirstPage.COLUMN_USE_SOURCE_WIDTH);
		column2.getColumn().setText(Messages.JavaWizardFirstPage_useSources);
		column2.getColumn().setAlignment(SWT.CENTER);
		column2.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(final ViewerCell cell) {

				if (cell.getElement() instanceof IPackageFragmentRoot
						&& JavaWizardFirstPage.this.getDiscoveryParameters()
								.getElementsToDiscover().contains(cell.getElement())) {

					Map<String, Object> options = JavaWizardFirstPage.this.getDiscoveryParameters()
							.getDiscoveryOptions(cell.getElement());
					boolean useSources = Boolean.TRUE.equals(options
							.get(LibraryReaderOptions.USE_SOURCES.toString()));
					if (useSources) {
						cell.setText(Messages.JavaWizardFirstPage_useSourceOn);
						return;
					}
				}
				cell.setText(""); //$NON-NLS-1$
			}
		});

		TreeViewerColumn column3 = new TreeViewerColumn(getDependenciesTree(), SWT.NONE);
		column3.getColumn().setWidth(JavaWizardFirstPage.COLUMN_DEPENDENCY_LONGNAME_WIDTH);
		column3.getColumn().setText(Messages.JavaWizardFirstPage_Path);
		column3.setLabelProvider(new JDTDelegateCellLabelProvider(false));

		getDependenciesTree().addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent e) {
				refreshBtnUseSources();
			}
		});

		gridData = new GridData();
		gridData.grabExcessVerticalSpace = true;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.horizontalSpan = 2;
		getDependenciesTree().getTree().setLayoutData(gridData);

		configureButtonSource(dependencies);

		gridData = new GridData();
		gridData.horizontalSpan = 2;
		this.btnUseSource.setLayoutData(gridData);

		getDependenciesTree().setContentProvider(new MyTreeContentProvider());
		getDependenciesTree().setInput(new Object());
		// check the elements which are already known to be discovered
		for (TreeItem treeitem : getDependenciesTree().getTree().getItems()) {
			recursiveCheckItem(treeitem);
		}

		// /////////////
		Composite cLabels = new Composite(dependencies, SWT.NONE);
		gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		cLabels.setLayoutData(gridData);

		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = false;
		cLabels.setLayout(rowLayout);

		// //
		Label imageInformationNumberElementsSelected = new Label(cLabels, SWT.NONE);
		imageInformationNumberElementsSelected.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(org.eclipse.ui.ISharedImages.IMG_OBJS_INFO_TSK));

		this.textNumberElementsSelected = new Label(cLabels, SWT.NONE);
	}

	private void configureButtonSource(final Group dependencies) {
		// ////
		this.btnUseSource = new Button(dependencies, SWT.CHECK);
		this.btnUseSource.setText(Messages.JavaWizardFirstPage_useSources);
		this.btnUseSource.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (JavaWizardFirstPage.this.getDependenciesTree().getTree().getSelection().length == 1) {
					Object elt = JavaWizardFirstPage.this.getDependenciesTree().getTree()
							.getSelection()[0].getData();
					if (elt != null && elt instanceof IPackageFragmentRoot) {

						Map<String, Object> options = JavaWizardFirstPage.this
								.getDiscoveryParameters().getDiscoveryOptions(elt);
						boolean useSource = Boolean.TRUE.equals(options
								.get(LibraryReaderOptions.USE_SOURCES.toString()));

						options.put(LibraryReaderOptions.USE_SOURCES.toString(), new Boolean(
								!useSource));

						JavaWizardFirstPage.this.getDependenciesTree().update(elt, null);
					}
				}
				refreshBtnUseSources();
			}
		});
		this.btnUseSource.setSelection(false);
		this.btnUseSource.setEnabled(false);
	}

	private void createIncrementalPanel(final Composite composite) {
		GridLayout layout;
		GridData gridData;
		// //////////////////////////////
		// the Incremental mode
		// //////////////////////////////
		Group mode = new Group(composite, SWT.NONE);
		mode.setText(Messages.JavaWizardFirstPage_mode);
		layout = new GridLayout();
		layout.numColumns = 2;
		mode.setLayout(layout);

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		mode.setLayoutData(gridData);

		// //// Incremental mode
		setBtnIncrementalMode(new Button(mode, SWT.CHECK));
		getBtnIncrementalMode().setText(Messages.JavaWizardFirstPage_useIncremental);
		getBtnIncrementalMode().setSelection(getDiscoveryParameters().isIncrementalMode());
		getBtnIncrementalMode().setEnabled(true);

		gridData = new GridData();
		gridData.horizontalSpan = 2;
		getBtnIncrementalMode().setLayoutData(gridData);

		getBtnIncrementalMode().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				JavaWizardFirstPage.this.getDiscoveryParameters().setIncrementalMode(
						JavaWizardFirstPage.this.getBtnIncrementalMode().getSelection());
			}

		});
	}

	private void createJavaAnalysisLevelPanel(final Composite composite) {
		GridData gridData;
		// //////////////////////////////
		// the Java Analysis Level panel
		// //////////////////////////////
		Group analysisLevel = new Group(composite, SWT.NONE);
		analysisLevel.setText(Messages.JavaWizardFirstPage_analysisLevel);

		GridLayout myLayout = new GridLayout();
		myLayout.numColumns = 1;
		analysisLevel.setLayout(myLayout);

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		analysisLevel.setLayoutData(gridData);

		SelectionListener listener = new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				JavaWizardFirstPage.this.getDiscoveryParameters().setFullJavaLevel(
						JavaWizardFirstPage.this.getBtnFullAnalyseJavaFiles().getSelection());
			}
		};

		setBtnFullAnalyseJavaFiles(new Button(analysisLevel, SWT.RADIO));
		getBtnFullAnalyseJavaFiles().setText(Messages.JavaWizardFirstPage_fullAnalysis);
		getBtnFullAnalyseJavaFiles().setLayoutData(new GridData());
		getBtnFullAnalyseJavaFiles().setSelection(
				JavaWizardFirstPage.this.getDiscoveryParameters().isFullJavaLevel());
		getBtnFullAnalyseJavaFiles().addSelectionListener(listener);

		this.btnMemberAnalyseJavaFiles = new Button(analysisLevel, SWT.RADIO);
		this.btnMemberAnalyseJavaFiles.setText(Messages.JavaWizardFirstPage_limitedAnalysis);
		this.btnMemberAnalyseJavaFiles.setLayoutData(new GridData());
		this.btnMemberAnalyseJavaFiles.addSelectionListener(listener);
		this.btnMemberAnalyseJavaFiles.setSelection(!JavaWizardFirstPage.this
				.getDiscoveryParameters().isFullJavaLevel());
	}

	private void recursiveCheckItem(final TreeItem treeitem) {
		if (getDiscoveryParameters().getElementsToDiscover().contains(treeitem.getData())) {
			treeitem.setChecked(true);
			// expanded the libraries of the selected java project
			if (treeitem.getData() == getJavaProject()) {
				treeitem.setExpanded(true);
			}
			getDependenciesTree().refresh(treeitem.getData());
		}
		for (TreeItem child : treeitem.getItems()) {
			recursiveCheckItem(child);
		}
	}

	private void createJavaFilterPanel(final Composite composite) {
		GridData gridData;
		// //////////////////////////////
		// the Java Filter panel
		// //////////////////////////////
		Group filter = new Group(composite, SWT.NONE);
		filter.setText(Messages.JavaWizardFirstPage_filter);

		GridLayout myLayout = new GridLayout();
		myLayout.numColumns = 1;
		filter.setLayout(myLayout);

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		filter.setLayoutData(gridData);

		ModifyListener fieldListener = new ModifyListener() {
			public void modifyText(final ModifyEvent arg0) {
				validatePage();
			}
		};

		// the entry field to type the regex for packages and types to exclude
		// from analysis
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;

		SelectionAdapter buttonListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				JavaWizardFirstPage.this.getElementsToExcludeFilter().setEnabled(
						JavaWizardFirstPage.this.isButtonExcludeFilterSelected());
				JavaWizardFirstPage.this.getElementsToIncludeFilter().setEnabled(
						JavaWizardFirstPage.this.isButtonIncludeFilterSelected());
				//validate the page
				validatePage();
			}
		};
		
		//Analyze All radio button
		this.btnAnalyzeAllFilter = new Button(filter, SWT.RADIO);
		this.btnAnalyzeAllFilter.setText(Messages.JavaWizardFirstPage_analyseAllElements0);
		this.btnAnalyzeAllFilter.setLayoutData(new GridData());
		this.btnAnalyzeAllFilter.addSelectionListener(buttonListener);
		
		//Excluded elements radio button
		this.btnExcludeFilter = new Button(filter, SWT.RADIO);
		this.btnExcludeFilter.setText(Messages.JavaWizardFirstPage_excludedElements);
		this.btnExcludeFilter.setLayoutData(new GridData());
		this.btnExcludeFilter.addSelectionListener(buttonListener);
		
		//Excluded elements text field
		this.elementsToExcludeFilter = new Text(filter, SWT.SINGLE | SWT.BORDER);
		this.elementsToExcludeFilter.setLayoutData(gridData);
		this.elementsToExcludeFilter.addModifyListener(fieldListener);
		
		//Included elements radio button
		this.btnIncludeFilter = new Button(filter, SWT.RADIO);
		this.btnIncludeFilter
				.setText(Messages.JavaWizardFirstPage_JavaWizardFirstPage_includedElements);
		this.btnIncludeFilter.setLayoutData(new GridData());
		this.btnIncludeFilter.addSelectionListener(buttonListener);
		
		//Included elements text field
		this.elementsToIncludeFilter = new Text(filter, SWT.SINGLE | SWT.BORDER);
		this.elementsToIncludeFilter.setLayoutData(gridData);
		this.elementsToIncludeFilter.addModifyListener(fieldListener);

		
		if (getDiscoveryParameters().getExcludedElementsRegEx() != null) {
			this.btnExcludeFilter.setSelection(true);
			this.btnIncludeFilter.setSelection(false);
			this.btnAnalyzeAllFilter.setSelection(false);
			getElementsToExcludeFilter().setEnabled(true);
			getElementsToExcludeFilter().setText(
					getDiscoveryParameters().getExcludedElementsRegEx());
			getElementsToIncludeFilter().setEnabled(false);
		} else if (getDiscoveryParameters().getIncludedElementsRegEx() != null) {
			this.btnExcludeFilter.setSelection(false);
			this.btnIncludeFilter.setSelection(true);
			this.btnAnalyzeAllFilter.setSelection(false);
			getElementsToIncludeFilter().setEnabled(true);
			getElementsToIncludeFilter().setText(
					getDiscoveryParameters().getIncludedElementsRegEx());
			getElementsToExcludeFilter().setEnabled(false);
		} else {
			this.btnAnalyzeAllFilter.setSelection(true);
			this.btnExcludeFilter.setSelection(false);
			this.btnIncludeFilter.setSelection(false);
			getElementsToIncludeFilter().setEnabled(false);
			getElementsToExcludeFilter().setEnabled(false);
		}
	}

	protected boolean isButtonExcludeFilterSelected() {
		return this.btnExcludeFilter.getSelection();
	}
	
	protected boolean isButtonIncludeFilterSelected() {
		return this.btnIncludeFilter.getSelection();
	}


	/**
	 * change the state of the "use attached sources"
	 */
	void refreshBtnUseSources() {
		IStructuredSelection selection = (IStructuredSelection) getDependenciesTree()
				.getSelection();
		Object element = selection.getFirstElement();
		if (element instanceof IPackageFragmentRoot) {

			IPackageFragmentRoot lib = (IPackageFragmentRoot) element;

			if (getDiscoveryParameters().getElementsToDiscover().contains(lib)) {

				Map<String, Object> options = getDiscoveryParameters().getDiscoveryOptions(lib);
				boolean useSources = Boolean.TRUE.equals(options
						.get(LibraryReaderOptions.USE_SOURCES.toString()));

				if (useSources) {
					this.btnUseSource.setEnabled(true);
					this.btnUseSource.setSelection(true);
					return;
				}

				boolean hasSourceAttached = false;
				try {
					hasSourceAttached = (lib.getSourceAttachmentPath() != null);
				} catch (JavaModelException e) {
					// nothing
					assert (true); // dummy code for "EmptyBlock"
				}

				this.btnUseSource.setSelection(false);
				this.btnUseSource.setEnabled(hasSourceAttached);
				return;

			}
		}
		this.btnUseSource.setEnabled(false);
		this.btnUseSource.setSelection(false);
	}

	/**
	 * validate the page
	 */
	void validatePage() {
		// check that the selected java project is checked in the tree
		for (TreeItem treeitem : getDependenciesTree().getTree().getItems()) {
			if (treeitem.getData() == getJavaProject() && !treeitem.getChecked()) {
				setErrorMessage(Messages.JavaWizardFirstPage_firstProjectSelection);
				setPageComplete(false);
				return;
			}
		}

		// check the filter elements
		if (isButtonExcludeFilterSelected()) {
			//Excluded elements
			String text = getElementsToExcludeFilter().getText().trim();
			if (text.length() > 0) {
				//save the entered regexp it in the bean
				getDiscoveryParameters().setExcludedElementsRegEx(text);
				getDiscoveryParameters().setIncludedElementsRegEx(null);
			} else {
				//error ! the button is selected but no text in the text field
				setErrorMessage(Messages.JavaWizardFirstPage_regExpExcludedElementsNecessary0);
				setPageComplete(false);
				return;
			}
			
		} else if (isButtonIncludeFilterSelected()) {
			//Included elements
			String text = getElementsToIncludeFilter().getText().trim();
			if (text.length() > 0) {
				//save the entered regexp it in the bean
				getDiscoveryParameters().setIncludedElementsRegEx(text);
				getDiscoveryParameters().setExcludedElementsRegEx(null);
			} else {
				//error ! the button is selected but no text in the text field
				setErrorMessage(Messages.JavaWizardFirstPage_regExpIncludedElementsNecessary0); 
				setPageComplete(false);
				return;
			}
		} else {
			getDiscoveryParameters().setIncludedElementsRegEx(null);
			getDiscoveryParameters().setExcludedElementsRegEx(null);
		}

		// no problems encountered
		setErrorMessage(null);
		setMessage(null);
		setPageComplete(true);
	}

	/**
	 * Refresh the label on the number of elements checked
	 */
	void refreshInformationLabel() {

		int nbProjectsSelected = 0;
		int nbLibrariesSelected = 0;

		// we count the checked elements in the tree
		// if the user wants to discover dependencies
		for (Object element : getDependenciesTree().getCheckedElements()) {
			if (element instanceof IJavaProject) {
				nbProjectsSelected++;
			} else if (element instanceof IPackageFragmentRoot) {
				nbLibrariesSelected++;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(nbProjectsSelected);
		if (nbProjectsSelected > 1) {
			sb.append(Messages.JavaWizardFirstPage_projects);
		} else {
			sb.append(Messages.JavaWizardFirstPage_project);
		}

		sb.append(Messages.JavaWizardFirstPage_and);
		sb.append(nbLibrariesSelected);
		if (nbLibrariesSelected > 1) {
			sb.append(Messages.JavaWizardFirstPage_libraries);
		} else {
			sb.append(Messages.JavaWizardFirstPage_library);
		}
		sb.append(Messages.JavaWizardFirstPage_selected);

		this.textNumberElementsSelected.setText(sb.toString());
		this.textNumberElementsSelected.pack(true);
	}

	public void setDiscoverableElements(final Collection<Object> discoverableElements) {
		this.discoverableElements = discoverableElements;
	}

	public Collection<Object> getDiscoverableElements() {
		return this.discoverableElements;
	}

	public void setJavaProject(final IJavaProject javaProject) {
		this.javaProject = javaProject;
	}

	public IJavaProject getJavaProject() {
		return this.javaProject;
	}

	public void setDiscoveryParameters(final DiscoveryParametersBean discoveryParameters) {
		this.discoveryParameters = discoveryParameters;
	}

	public DiscoveryParametersBean getDiscoveryParameters() {
		return this.discoveryParameters;
	}

	public void setDependenciesTree(final CheckboxTreeViewer dependenciesTree) {
		this.dependenciesTree = dependenciesTree;
	}

	public CheckboxTreeViewer getDependenciesTree() {
		return this.dependenciesTree;
	}

	public void setBtnIncrementalMode(final Button btnIncrementalMode) {
		this.btnIncrementalMode = btnIncrementalMode;
	}

	public Button getBtnIncrementalMode() {
		return this.btnIncrementalMode;
	}

	public void setBtnFullAnalyseJavaFiles(final Button btnFullAnalyseJavaFiles) {
		this.btnFullAnalyseJavaFiles = btnFullAnalyseJavaFiles;
	}

	public Button getBtnFullAnalyseJavaFiles() {
		return this.btnFullAnalyseJavaFiles;
	}

	public Text getElementsToExcludeFilter() {
		return this.elementsToExcludeFilter;
	}

	public Text getElementsToIncludeFilter() {
		return this.elementsToIncludeFilter;
	}

	/**
	 * A column label provider which extends the jdt label provider.
	 */
	class JDTDelegateCellLabelProvider extends ColumnLabelProvider {

		private final JavaElementLabelProvider delegate = new JavaElementLabelProvider();
		private boolean displayShortName = true;

		public JDTDelegateCellLabelProvider(final boolean displayShortName) {
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
		public boolean isLabelProperty(final Object element, final String property) {
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
}
