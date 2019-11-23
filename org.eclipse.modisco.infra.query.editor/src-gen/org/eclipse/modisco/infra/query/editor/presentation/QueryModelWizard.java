/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.editor.presentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.modisco.infra.common.core.internal.utils.BuildPropertiesUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.PluginUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.QueryFactory;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.editor.Messages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays
			.asList(QueryEditorPlugin.INSTANCE
					.getString("_UI_QueryEditorFilenameExtensions").split("\\s*,\\s*"))); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * A formatted list of supported file extensions, suitable for display. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = QueryEditorPlugin.INSTANCE.getString(
			"_UI_QueryEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	/**
	 * This caches an instance of the model package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected QueryPackage queryPackage = QueryPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected QueryFactory queryFactory = this.queryPackage.getQueryFactory();

	/**
	 * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected QueryModelWizardNewFileCreationPage newFileCreationPage;

	// /**
	// * This is the initial object creation page.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected QueryModelWizardInitialObjectCreationPage
	// initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default
	 * container. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected List<String> initialObjectNames;

	private boolean openEditor = true;

	/**
	 * This just records the information. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(QueryEditorPlugin.INSTANCE.getString("_UI_Wizard_label")); //$NON-NLS-1$
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(QueryEditorPlugin.INSTANCE.getImage("full/wizban/NewQuery"))); //$NON-NLS-1$
	}

	public void setOpenEditor(final boolean openEditor) {
		this.openEditor = openEditor;

	}

	// /**
	// * Returns the names of the types that can be created as the root object.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected Collection<String> getInitialObjectNames() {
	// if (initialObjectNames == null) {
	// initialObjectNames = new ArrayList<String>();
	// for (EClassifier eClassifier : queryPackage.getEClassifiers()) {
	// if (eClassifier instanceof EClass) {
	// EClass eClass = (EClass)eClassifier;
	// if (!eClass.isAbstract()) {
	// initialObjectNames.add(eClass.getName());
	// }
	// }
	// }
	// Collections.sort(initialObjectNames,
	// CommonPlugin.INSTANCE.getComparator());
	// }
	// return initialObjectNames;
	// }

	/**
	 * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected EObject createInitialModel() {
		ModelQuerySet rootObject = this.queryFactory.createModelQuerySet();
		String modelQuerySetName = getModelFile().getName().replaceAll(".querySet$", ""); //$NON-NLS-1$ //$NON-NLS-2$
		rootObject.setName(modelQuerySetName);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(final IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath()
								.toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}

						// Save the contents of the resource to the file system.
						//
						resource.save(null);

						try {
							BuildPropertiesUtils.addToBuild(modelFile);
						} catch (Exception e) {
							MoDiscoLogger
									.logError(
											e,
											"Error adding file " + modelFile.getFullPath() //$NON-NLS-1$
													+ " to the build.properties", QueryEditorPlugin.getPlugin()); //$NON-NLS-1$
						}
						PluginUtils.register(modelFile,
								ModelQuerySetCatalog.REGISTRATION_EXTENSION_POINT_ID,
								"modelqueryset"); //$NON-NLS-1$
					} catch (Exception exception) {
						QueryEditorPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = this.workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart).selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			if (this.openEditor) {
				try {
					page.openEditor(
							new FileEditorInput(modelFile),
							this.workbench.getEditorRegistry()
									.getDefaultEditor(modelFile.getFullPath().toString()).getId());
				} catch (PartInitException exception) {
					MessageDialog.openError(workbenchWindow.getShell(),
							QueryEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), //$NON-NLS-1$
							exception.getMessage());
					return false;
				}
			}

			return true;
		} catch (Exception exception) {
			QueryEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public class QueryModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public QueryModelWizardNewFileCreationPage(final String pageId,
				final IStructuredSelection selection) {
			super(pageId, selection);
		}

		@Override
		public void createControl(final Composite parent) {
			super.createControl(parent);
			// so that the warning can appear initially
			validatePage();
		}

		/**
		 * The framework calls this to see if the file is correct. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated NOT
		 */
		@Override
		protected boolean validatePage() {
			boolean valid;
			try {
				valid = super.validatePage();
			} catch (NullPointerException e) {
				// FIXME hackaround bug 305961
				valid = false;
			}

			if (valid) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !QueryModelWizard.FILE_EXTENSIONS.contains(extension)) {
					String key = QueryModelWizard.FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" //$NON-NLS-1$
							: "_WARN_FilenameExtension"; //$NON-NLS-1$
					setErrorMessage(QueryEditorPlugin.INSTANCE.getString(key,
							new Object[] { QueryModelWizard.FORMATTED_FILE_EXTENSIONS }));
					valid = false;
				}
			}
			if (valid) {
				IPath containerFullPath = getContainerFullPath();
				if (!ProjectUtils.isInMoDiscoProject(containerFullPath)) {
					setMessage(
							Messages.QueryModelWizard_queryInNonMoDiscoProject,
							IMessageProvider.WARNING);
				}
			}

			return valid;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot()
					.getFile(getContainerFullPath().append(getFileName()));
		}
	}

	// /**
	// * This is the page where the type of object to create is selected.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// public class QueryModelWizardInitialObjectCreationPage extends WizardPage
	// {
	// // /**
	// // * <!-- begin-user-doc -->
	// // * <!-- end-user-doc -->
	// // * @generated
	// // */
	// // protected Combo initialObjectField;
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected Combo initialObjectField;
	//
	// /**
	// * @generated
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// */
	// protected List<String> encodings;
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected Combo encodingField;
	//
	// /**
	// * Pass in the selection.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// public QueryModelWizardInitialObjectCreationPage(String pageId) {
	// super(pageId);
	// }
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// */
	// public void createControl(Composite parent) {
	// Composite composite = new Composite(parent, SWT.NONE); {
	// GridLayout layout = new GridLayout();
	// layout.numColumns = 1;
	// layout.verticalSpacing = 12;
	// composite.setLayout(layout);
	//
	// GridData data = new GridData();
	// data.verticalAlignment = GridData.FILL;
	// data.grabExcessVerticalSpace = true;
	// data.horizontalAlignment = GridData.FILL;
	// composite.setLayoutData(data);
	// }
	//
	// // Label containerLabel = new Label(composite, SWT.LEFT);
	// // {
	// //
	// containerLabel.setText(QueryEditorPlugin.INSTANCE.getString("_UI_ModelObject"));
	// //
	// // GridData data = new GridData();
	// // data.horizontalAlignment = GridData.FILL;
	// // containerLabel.setLayoutData(data);
	// // }
	//
	// // initialObjectField = new Combo(composite, SWT.BORDER);
	// // {
	// // GridData data = new GridData();
	// // data.horizontalAlignment = GridData.FILL;
	// // data.grabExcessHorizontalSpace = true;
	// // initialObjectField.setLayoutData(data);
	// // }
	// //
	// // for (String objectName : getInitialObjectNames()) {
	// // initialObjectField.add(getLabel(objectName));
	// // }
	// //
	// // if (initialObjectField.getItemCount() == 1) {
	// // initialObjectField.select(0);
	// // }
	// // initialObjectField.addModifyListener(validator);
	//
	// Label encodingLabel = new Label(composite, SWT.LEFT);
	// {
	//				encodingLabel.setText(QueryEditorPlugin.INSTANCE.getString("_UI_XMLEncoding")); //$NON-NLS-1$
	//
	// GridData data = new GridData();
	// data.horizontalAlignment = GridData.FILL;
	// encodingLabel.setLayoutData(data);
	// }
	// encodingField = new Combo(composite, SWT.BORDER);
	// {
	// GridData data = new GridData();
	// data.horizontalAlignment = GridData.FILL;
	// data.grabExcessHorizontalSpace = true;
	// encodingField.setLayoutData(data);
	// }
	//
	// for (String encoding : getEncodings()) {
	// encodingField.add(encoding);
	// }
	//
	// encodingField.select(0);
	// encodingField.addModifyListener(validator);
	//
	// setPageComplete(validatePage());
	// setControl(composite);
	// }
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected ModifyListener validator =
	// new ModifyListener() {
	// public void modifyText(ModifyEvent e) {
	// setPageComplete(validatePage());
	// }
	// };
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// */
	// protected boolean validatePage() {
	// // return getInitialObjectName() != null &&
	// getEncodings().contains(encodingField.getText());
	// return getEncodings().contains(this.encodingField.getText());
	// }
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// */
	// @Override
	// public void setVisible(boolean visible) {
	// super.setVisible(visible);
	// if (visible) {
	// // if (initialObjectField.getItemCount() == 1) {
	// // initialObjectField.clearSelection();
	// // encodingField.setFocus();
	// // }
	// // else {
	// // encodingField.clearSelection();
	// // initialObjectField.setFocus();
	// // }
	// this.encodingField.setFocus();
	// }
	// }
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// */
	// public String getInitialObjectName() {
	// // String label = initialObjectField.getText();
	// //
	// // for (String name : getInitialObjectNames()) {
	// // if (getLabel(name).equals(label)) {
	// // return name;
	// // }
	// // }
	// return null;
	// }
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// public String getEncoding() {
	// return encodingField.getText();
	// }
	//
	// /**
	// * Returns the label for the specified type name.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected String getLabel(String typeName) {
	// try {
	// return QueryEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
	// }
	// catch(MissingResourceException mre) {
	// QueryEditorPlugin.INSTANCE.log(mre);
	// }
	// return typeName;
	// }
	//
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected Collection<String> getEncodings() {
	// if (encodings == null) {
	// encodings = new ArrayList<String>();
	// for (StringTokenizer stringTokenizer = new
	// StringTokenizer(QueryEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices"));
	// stringTokenizer.hasMoreTokens(); ) {
	// encodings.add(stringTokenizer.nextToken());
	// }
	// }
	// return encodings;
	// }
	// }

	/**
	 * The framework calls this to create the contents of the wizard. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		this.newFileCreationPage = new QueryModelWizardNewFileCreationPage("Whatever", //$NON-NLS-1$
				this.selection);
		this.newFileCreationPage.setTitle(QueryEditorPlugin.INSTANCE
				.getString("_UI_QueryModelWizard_label")); //$NON-NLS-1$
		this.newFileCreationPage.setDescription(QueryEditorPlugin.INSTANCE
				.getString("_UI_QueryModelWizard_description")); //$NON-NLS-1$
		this.newFileCreationPage.setFileName(QueryEditorPlugin.INSTANCE
				.getString("_UI_QueryEditorFilenameDefaultBase") //$NON-NLS-1$
				+ "." //$NON-NLS-1$
				+ QueryModelWizard.FILE_EXTENSIONS.get(0));
		addPage(this.newFileCreationPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		//
		if (this.selection != null && !this.selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = this.selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					this.newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = QueryEditorPlugin.INSTANCE
							.getString("_UI_QueryEditorFilenameDefaultBase"); //$NON-NLS-1$
					String defaultModelFilenameExtension = QueryModelWizard.FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." //$NON-NLS-1$
							+ defaultModelFilenameExtension;
					for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." //$NON-NLS-1$
								+ defaultModelFilenameExtension;
					}
					this.newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		// initialObjectCreationPage = new
		// QueryModelWizardInitialObjectCreationPage("Whatever2");
		// initialObjectCreationPage.setTitle(QueryEditorPlugin.INSTANCE.getString("_UI_QueryModelWizard_label"));
		// initialObjectCreationPage.setDescription(QueryEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		// addPage(initialObjectCreationPage);
	}

	/**
	 * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFile getModelFile() {
		return this.newFileCreationPage.getModelFile();
	}

}
