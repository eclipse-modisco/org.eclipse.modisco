/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.editor.editors;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventObject;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.infra.browser.custom.AttributeView;
import org.eclipse.modisco.infra.browser.custom.CustomView;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.ReferenceView;
import org.eclipse.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.modisco.infra.browser.custom.TypeView;
import org.eclipse.modisco.infra.browser.custom.editor.Activator;
import org.eclipse.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.BooleanFeatureDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.ColorFeatureDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.CustomizationPropertiesDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.EditFeatureValueDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.FontFeatureDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.IconFeatureDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.OverlayIconFeatureDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.TextFeatureDialog;
import org.eclipse.modisco.infra.browser.custom.editor.dialogs.EditFeatureValueDialog.ValueType;
import org.eclipse.modisco.infra.browser.custom.editor.editors.MetaclassViewer.Attribute;
import org.eclipse.modisco.infra.browser.custom.editor.editors.MetaclassViewer.Reference;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomFactory;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage;
import org.eclipse.modisco.infra.browser.dialogs.ErrorsDialog;
import org.eclipse.modisco.infra.browser.uicore.internal.util.EMFUtil;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.controls.FormStyleSashForm;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;

/**
 * An editor to edit a customization model (uiCustom file). It presents a list of customizable
 * {@link EClass}es, {@link EAttribute}s and {@link EReference}s in the left pane, a list of
 * customizable features in the center pane, and buttons to edit the customizations in the right
 * pane.
 */
public class CustomizationEditor extends EditorPart implements IGotoMarker {

	private static final int VERTICAL_SPACE_BETWEEN_BUTTON_GROUPS = 30;
	private static final int VERTICAL_SPACE_BEFORE_FIRST_BUTTON = 10;
	private static final int TOP_PANE_MARGIN_HEIGHT = 4;
	private static final int TOP_PANE_MARGIN_WIDTH = 5;
	public static final String ID = "org.eclipse.modisco.infra.browser.custom.editor"; //$NON-NLS-1$
	private static final int MAIN_FORM_MARGIN_WIDTH = 4;
	private static final int MAIN_FORM_MARGIN_HEIGHT = 6;
	private static final int LEFT_PANE_SASH_WEIGHT = 30;
	private static final int RIGHT_PANE_SASH_WEIGHT = 70;

	private MetamodelView fMetamodelView;
	private MetaclassViewer metaclassViewer;
	private MetaclassViewConfiguration metaclassViewConfiguration;
	private CustomizationViewer customizationViewer;
	private Button btnEditFeatureValue;
	private Button btnResetDefaults;
	private Button btnAdd;
	private Button btnEdit;
	private Button btnRemove;
	private Button btnUp;
	private Button btnDown;
	private Button cbAppliesToSubinstances;
	/** Whether the customization model was modified */
	private boolean dirty;
	private Label headerLabel;
	private FormToolkit toolkit;
	private boolean readOnly;

	/** The underlying resource has been deleted from the workspace */
	private boolean resourceDeleted = false;

	/**
	 * The underlying resource has been changed in the workspace, from outside this editor
	 */
	private boolean resourceChanged = false;

	/** This listens for workspace changes. */
	private final WorkspaceChangeListener resourceChangeListener;

	/** EMF errors on the resource */
	private Diagnostic fDiagnostic = null;
	/** Button that appears to open the dialog listing errors */
	private Button errorsButton;
	/** The metamodel that is being customized */
	private Resource fMetamodel;
	private Form fForm;
	private final AdapterFactoryEditingDomain editingDomain;

	public CustomizationEditor() {
		// make sure the facets are initialized
		FacetSetCatalog.getSingleton();

		// initialize the editing domain
		final BasicCommandStack commandStack = new BasicCommandStack();
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		this.editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);

		// refresh when changed, and update dirty state
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				setDirty(commandStack.isSaveNeeded());
				CustomizationEditor.this.refresh();
				CustomizationEditor.this.updateSubinstancesChangedCheckbox();
				CustomizationEditor.this.refreshHeader();
			}
		});

		this.resourceChangeListener = new WorkspaceChangeListener(this);
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		if (!(input instanceof IFileEditorInput || input instanceof URIEditorInput)) {
			throw new PartInitException("Invalid Input: Must be IFileEditorInput or URIEditorInput"); //$NON-NLS-1$
		}
		// URIEditorInput => read-only
		this.readOnly = (input instanceof URIEditorInput);

		setSite(site);
		setInput(input);

		site.getPage().addPartListener(this.partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this.resourceChangeListener,
				IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public void createPartControl(final Composite parent) {
		java.net.URI locationURI;
		String fileName = ""; //$NON-NLS-1$
		final IEditorInput editorInput = getEditorInput();
		if (editorInput instanceof IFileEditorInput) {
			final IFileEditorInput fileEditorInput = (IFileEditorInput) editorInput;
			try {
				if (fileEditorInput.getFile().exists()) {
					locationURI = new java.net.URI(URI.createPlatformResourceURI(
							fileEditorInput.getFile().getFullPath().toString(), true).toString());
				} else {
					locationURI = fileEditorInput.getFile().getLocationURI();
				}
			} catch (URISyntaxException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				locationURI = fileEditorInput.getFile().getLocationURI();
			}
			fileName = fileEditorInput.getFile().getName();
		} else if (editorInput instanceof URIEditorInput) {
			final URIEditorInput uriEditorInput = (URIEditorInput) editorInput;
			try {
				locationURI = new java.net.URI(uriEditorInput.getURI().toString());
			} catch (final URISyntaxException e) {
				throw new IllegalArgumentException(e);
			}
			fileName = new Path(locationURI.getPath()).lastSegment();
		} else {
			throw new IllegalStateException("wrong kind of input: " //$NON-NLS-1$
					+ editorInput.getClass().getName());
		}

		loadResource(locationURI);
		setPartName(fileName);

		this.metaclassViewConfiguration = new MetaclassViewConfiguration();
		// load user settings
		this.metaclassViewConfiguration.load();

		// register close listener to save user settings when editor is closed
		getSite().getPage().addPartListener(new SaveSettingsOnCloseListener());

		createContents(parent);

		this.metaclassViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				final ITreeSelection selection = (ITreeSelection) CustomizationEditor.this.metaclassViewer
						.getSelection();
				CustomizationEditor.this.metaclassSelectionChanged(selection.getFirstElement());
				CustomizationEditor.this.customizationViewer.getViewer().getControl()
						.setRedraw(false);
				CustomizationEditor.this.customizationViewer.getViewer().expandAll();
				CustomizationEditor.this.customizationViewer.getViewer().getControl()
						.setRedraw(true);
			}
		});

		this.customizationViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				CustomizationEditor.this.customizationSelectionChanged(getSelectedElement());
			}
		});

		// shortcuts to avoid having to use the buttons
		this.customizationViewer.getViewer().addOpenListener(new IOpenListener() {
			public void open(final OpenEvent event) {
				final Object selectedElement = getSelectedElement();
				if (selectedElement instanceof CustomViewFeature) {
					btnEditFeatureValueClicked();
				} else if (selectedElement instanceof FeatureValueCase) {
					btnEditClicked();
				}
			}
		});

		this.customizationViewer.getViewer().getControl().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					final Object selectedElement = getSelectedElement();
					if (selectedElement instanceof FeatureValueCase) {
						btnRemoveClicked();
					}
				}
			}
		});

		final String metamodelURI = this.fMetamodelView.getMetamodelURI();
		this.fMetamodel = initMetamodel(metamodelURI);
	}

	private Resource initMetamodel(final String metamodelURI) {
		final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(metamodelURI);
		if (ePackage != null) {
			final Resource resource = ePackage.eResource();
			if (resource != null) {
				this.metaclassViewer.setInput(resource);
				return resource;
			}
		}
		MoDiscoLogger.logError(
				NLS.bind(Messages.CustomizationEditor_cannotFindMetamodel, metamodelURI),
				Activator.getDefault());
		return null;
	}

	private void createContents(final Composite parent) {
		this.toolkit = new FormToolkit(parent.getDisplay());
		this.fForm = this.toolkit.createForm(parent);
		this.toolkit.decorateFormHeading(this.fForm);

		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = CustomizationEditor.MAIN_FORM_MARGIN_WIDTH;
		fillLayout.marginHeight = CustomizationEditor.MAIN_FORM_MARGIN_HEIGHT;
		this.fForm.getBody().setLayout(fillLayout);
		this.fForm.setHeadClient(createTopPane(this.fForm.getHead()));
		createBottomPane(this.fForm.getBody());
		buttonsEnablementForSelection(null);
	}

	/** The white header */
	private Composite createTopPane(final Composite parent) {
		final Composite topPane = new Composite(parent, SWT.NONE);
		final GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		topPane.setLayoutData(gridData);

		final GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.marginWidth = CustomizationEditor.TOP_PANE_MARGIN_WIDTH;
		gridLayout.marginHeight = CustomizationEditor.TOP_PANE_MARGIN_HEIGHT;
		topPane.setLayout(gridLayout);
		this.headerLabel = new Label(topPane, SWT.NONE);
		this.headerLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		refreshHeader();

		this.errorsButton = new Button(topPane, SWT.PUSH);
		this.errorsButton.setToolTipText(Messages.CustomizationEditor_btnTooltipViewErrors);
		this.errorsButton.setImage(ImageProvider.getInstance().getErrorIcon());
		this.errorsButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ErrorsDialog errorsDialog = new ErrorsDialog(getSite().getShell(),
						CustomizationEditor.this.fDiagnostic);
				errorsDialog.open();
			}
		});
		// only appears when there are errors
		if (this.fDiagnostic == null) {
			this.errorsButton.setVisible(false);
		}

		final Button propertiesButton = new Button(topPane, SWT.PUSH);
		propertiesButton.setText(Messages.CustomizationEditor_btnProperties);
		propertiesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				propertiesClicked();
			}
		});

		// Color backgroundColor =
		// Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
		// topPane.setBackground(backgroundColor);
		// headerLabel.setBackground(backgroundColor);
		// propertiesButton.setBackground(backgroundColor);

		return topPane;
	}

	private void refreshHeader() {
		final String readOnlyText;
		if (this.readOnly) {
			readOnlyText = Messages.CustomizationEditor_readonly;
		} else {
			readOnlyText = ""; //$NON-NLS-1$
		}
		this.headerLabel.setText(readOnlyText
				+ NLS.bind(Messages.CustomizationEditor_customViewFor, getMetamodelName(),
						this.fMetamodelView.getMetamodelURI()));
	}

	private class ChangeMetamodelCommand extends AbstractOverrideableCommand {

		private final String newMetamodelURI;
		private String oldMetamodelURI;

		protected ChangeMetamodelCommand(final EditingDomain domain, final String newMetamodelURI) {
			super(domain);
			this.newMetamodelURI = newMetamodelURI;
		}

		@Override
		protected boolean prepare() {
			this.oldMetamodelURI = CustomizationEditor.this.fMetamodel.getURI().toString();
			return true;
		}

		@Override
		public void doExecute() {
			final Resource newMetamodel = initMetamodel(this.newMetamodelURI);
			CustomizationEditor.this.fMetamodel = newMetamodel;
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					promptToCleanCustomization(newMetamodel);
				}
			});
		}

		@Override
		public void doUndo() {
			final Resource oldMetamodel = initMetamodel(this.oldMetamodelURI);
			CustomizationEditor.this.fMetamodel = oldMetamodel;
		}

		@Override
		public void doRedo() {
			final Resource newMetamodel = initMetamodel(this.newMetamodelURI);
			CustomizationEditor.this.fMetamodel = newMetamodel;
		}
	}

	protected void propertiesClicked() {
		final CustomizationPropertiesDialog dialog = new CustomizationPropertiesDialog(getSite()
				.getShell(), this.readOnly);
		dialog.setInitialMetamodel(this.fMetamodelView.getMetamodelURI());
		final EList<String> importedQuerySets = this.fMetamodelView.getAvailableQuerySets();
		dialog.setInitialQuerySets(importedQuerySets);
		dialog.setInitialImportAllQuerySets(this.fMetamodelView.isAllQuerySetsAvailable());
		if (dialog.open() == Window.OK && !this.readOnly) {
			CompoundCommand compoundCommand = new CompoundCommand();

			final boolean changeMetamodel = !dialog.getMetamodel().equals(
					this.fMetamodelView.getMetamodelURI());
			if (changeMetamodel) {
				// this.fMetamodelView.setMetamodelURI(dialog.getMetamodel());
				Command setCommand = SetCommand.create(this.editingDomain, this.fMetamodelView,
						UicustomPackage.eINSTANCE.getMetamodelView_MetamodelURI(),
						dialog.getMetamodel());
				compoundCommand.append(setCommand);
				ChangeMetamodelCommand changeMetamodelCommand = new ChangeMetamodelCommand(
						this.editingDomain, dialog.getMetamodel());
				compoundCommand.append(changeMetamodelCommand);
			}

			// this.fMetamodelView.setAllQuerySetsAvailable(dialog.isAllQuerySetsAvailable());
			Command setCommand = SetCommand.create(this.editingDomain, this.fMetamodelView,
					UicustomPackage.eINSTANCE.getMetamodelView_AllQuerySetsAvailable(),
					Boolean.valueOf(dialog.isAllQuerySetsAvailable()));
			compoundCommand.append(setCommand);

			// save imported query sets
			List<String> selectedQuerySets = Arrays.asList(dialog.getSelectedQuerySets());
			final EList<String> imports = this.fMetamodelView.getAvailableQuerySets();
			// imports.clear();
			for (String anImport : imports) {
				if (!selectedQuerySets.contains(anImport)) {
					Command removeCommand = RemoveCommand.create(this.editingDomain,
							this.fMetamodelView,
							UicustomPackage.eINSTANCE.getMetamodelView_AvailableQuerySets(),
							anImport);
					compoundCommand.append(removeCommand);
				}
			}

			for (final String selectedQuerySet : selectedQuerySets) {
				if (!imports.contains(selectedQuerySet)) {
					// imports.add(selectedQuerySet);
					Command addCommand = AddCommand.create(this.editingDomain, this.fMetamodelView,
							UicustomPackage.eINSTANCE.getMetamodelView_AvailableQuerySets(),
							selectedQuerySet);
					compoundCommand.append(addCommand);
				}
			}

			compoundCommand.setLabel(Messages.CustomizationEditor_changeProperties);
			this.editingDomain.getCommandStack().execute(compoundCommand);
		}
	}

	/**
	 * Opens a message box to ask the user whether to keep customizations for the old metamodels, or
	 * clean the customizations.
	 *
	 * @param newMetamodel
	 */
	private void promptToCleanCustomization(final Resource newMetamodel) {
		String message = Messages.CustomizationEditor_youChangedMetamodel
				+ Messages.CustomizationEditor_promptCleanCustomizations;
		if (MessageDialog.openQuestion(getSite().getShell(),
				Messages.CustomizationEditor_Title_cleanCustomization, message)) {
			final EList<TypeView> typeViews = this.fMetamodelView.getTypes();
			final List<EClass> metaclasses = EMFUtil.getMetaclasses(newMetamodel);

			CompoundCommand compoundCommand = new CompoundCommand();

			// remove all type views that don't have a corresponding metaclass
			for (TypeView typeView : typeViews) {
				final String metaclassName = typeView.getMetaclassName();
				final EClass eClass = EMFUtil.findMetaclassWithName(metaclassName, metaclasses);
				if (eClass == null) {
					Command removeCommand = RemoveCommand.create(this.editingDomain,
							this.fMetamodelView,
							UicustomPackage.eINSTANCE.getMetamodelView_Types(), typeView);
					compoundCommand.append(removeCommand);
				} else {
					// remove attribute views that don't have a corresponding
					// attribute in the metaclass
					final EList<AttributeView> attributeViews = typeView.getAttributes();
					for (AttributeView attributeView : attributeViews) {
						if (EMFUtil.findElementWithName(attributeView.getAttributeName(),
								eClass.getEAllAttributes()) == null) {
							Command removeCommand = RemoveCommand.create(this.editingDomain,
									typeView, UicustomPackage.eINSTANCE.getTypeView_Attributes(),
									attributeView);
							compoundCommand.append(removeCommand);
						}
					}

					// remove reference views that don't have a corresponding
					// reference in the metaclass
					final EList<ReferenceView> referenceViews = typeView.getReferences();
					for (ReferenceView referenceView : referenceViews) {
						if (EMFUtil.findElementWithName(referenceView.getReferenceName(),
								eClass.getEAllReferences()) == null) {
							Command removeCommand = RemoveCommand.create(this.editingDomain,
									typeView, UicustomPackage.eINSTANCE.getTypeView_References(),
									referenceView);
							compoundCommand.append(removeCommand);
						}
					}
				}
			}
			compoundCommand.setLabel(Messages.CustomizationEditor_removeIrrelevantCustomizations);
			this.editingDomain.getCommandStack().execute(compoundCommand);
		}
	}

	private String getMetamodelName() {
		final String nsURI = this.fMetamodelView.getMetamodelURI();
		String metamodelName = EMFUtil.getMetamodelName(nsURI);
		if (metamodelName == null) {
			return Messages.CustomizationEditor_unknown;
		}
		return metamodelName;
	}

	private Composite createBottomPane(final Composite parent) {
		final SashForm sashForm = new FormStyleSashForm(parent, SWT.HORIZONTAL, this.toolkit) {
			@Override
			protected void createContents() {
				createLeftPane(this);
				createRightPane(this);
			}
		};

		sashForm.setWeights(new int[] { CustomizationEditor.LEFT_PANE_SASH_WEIGHT,
				CustomizationEditor.RIGHT_PANE_SASH_WEIGHT });
		// sashForm.setSashWidth(5);

		return sashForm;
	}

	private Composite createLeftPane(final Composite parent) {
		final Section section = this.toolkit.createSection(parent, ExpandableComposite.TITLE_BAR
				| ExpandableComposite.EXPANDED);
		section.setText(Messages.CustomizationEditor_sectionName_types);

		final Composite leftPaneComposite = this.toolkit.createComposite(section);
		section.setClient(leftPaneComposite);

		final GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		leftPaneComposite.setLayout(gridLayout);

		final MetaclassViewToolBar toolBar = createToolBar(section);
		section.setTextClient(toolBar.getParentComposite());
		this.metaclassViewer = new MetaclassViewer(leftPaneComposite,
				this.metaclassViewConfiguration, this.fMetamodelView);
		toolBar.setMetaclassViewer(this.metaclassViewer);

		final GridData metaclassViewerGridData = new GridData();
		metaclassViewerGridData.grabExcessHorizontalSpace = true;
		metaclassViewerGridData.grabExcessVerticalSpace = true;
		metaclassViewerGridData.horizontalAlignment = SWT.FILL;
		metaclassViewerGridData.verticalAlignment = SWT.FILL;
		this.metaclassViewer.getViewer().getControl().setLayoutData(metaclassViewerGridData);

		return leftPaneComposite;
	}

	/** Right pane : treeviewer + fixed buttons pane */
	private Composite createRightPane(final Composite parent) {
		final Section section = this.toolkit.createSection(parent, ExpandableComposite.TITLE_BAR
				| ExpandableComposite.EXPANDED);
		section.setText(Messages.CustomizationEditor_sectionName_customizations);

		final Composite rightPaneComposite = this.toolkit.createComposite(section, SWT.NONE);
		section.setClient(rightPaneComposite);

		final GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		rightPaneComposite.setLayout(gridLayout);

		// tree + bottom options
		final Composite middle = new Composite(rightPaneComposite, SWT.NONE);
		final GridLayout middleLayout = new GridLayout();
		middleLayout.marginHeight = 0;
		middleLayout.marginWidth = 0;
		middle.setLayout(middleLayout);
		middle.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.customizationViewer = new CustomizationViewer(middle);
		this.customizationViewer.getViewer().getControl()
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		final Composite optionsPane = this.toolkit.createComposite(middle);
		optionsPane.setLayout(new GridLayout());
		optionsPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		this.cbAppliesToSubinstances = this.toolkit.createButton(optionsPane,
				Messages.CustomizationEditor_appliesToSubInstances, SWT.CHECK);
		this.cbAppliesToSubinstances.setEnabled(false);
		this.cbAppliesToSubinstances.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				appliesToSubinstancesChanged(CustomizationEditor.this.cbAppliesToSubinstances
						.getSelection());
			}
		});

		if (this.readOnly) {
			this.cbAppliesToSubinstances.setEnabled(false);
		}

		final GridData customizationViewerGridData = new GridData();
		customizationViewerGridData.grabExcessHorizontalSpace = true;
		customizationViewerGridData.grabExcessVerticalSpace = true;
		customizationViewerGridData.horizontalAlignment = SWT.FILL;
		customizationViewerGridData.verticalAlignment = SWT.FILL;
		this.customizationViewer.getViewer().getControl()
				.setLayoutData(customizationViewerGridData);

		if (!this.readOnly) {
			createButtonsPane(rightPaneComposite);
		}

		// pushes the checkbox to the bottom
		// Composite spring = new Composite(buttonsPaneComposite, SWT.NONE);
		// GridData springData = new GridData(SWT.NONE, SWT.FILL, false, true);
		// springData.heightHint = 1;
		// spring.setLayoutData(springData);

		return rightPaneComposite;
	}

	private Composite createButtonsPane(final Composite parent) {
		final Composite buttonsPaneComposite = new Composite(parent, SWT.NONE);
		final GridData buttonsPaneGridData = new GridData();
		buttonsPaneGridData.grabExcessHorizontalSpace = false;
		buttonsPaneGridData.grabExcessVerticalSpace = true;
		buttonsPaneGridData.horizontalAlignment = SWT.FILL;
		buttonsPaneGridData.verticalAlignment = SWT.FILL;
		buttonsPaneComposite.setLayoutData(buttonsPaneGridData);

		buttonsPaneComposite.setLayout(new GridLayout());

		final Composite spacer1 = new Composite(buttonsPaneComposite, SWT.NONE);
		final GridData spacer1GridData = new GridData();
		spacer1GridData.heightHint = CustomizationEditor.VERTICAL_SPACE_BEFORE_FIRST_BUTTON;
		spacer1.setLayoutData(spacer1GridData);

		this.btnEditFeatureValue = new Button(buttonsPaneComposite, SWT.PUSH);
		this.btnEditFeatureValue.setText(Messages.CustomizationEditor_editFeatureValue);
		this.btnEditFeatureValue.setLayoutData(buttonsGridData());
		this.btnEditFeatureValue.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				btnEditFeatureValueClicked();
			}
		});

		this.btnResetDefaults = new Button(buttonsPaneComposite, SWT.PUSH);
		this.btnResetDefaults.setText(Messages.CustomizationEditor_resetDefaults);
		this.btnResetDefaults.setLayoutData(buttonsGridData());
		this.btnResetDefaults.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				btnResetDefaultsClicked();
			}
		});

		final Composite spacer2 = new Composite(buttonsPaneComposite, SWT.NONE);
		final GridData spacer2GridData = new GridData();
		spacer2GridData.heightHint = CustomizationEditor.VERTICAL_SPACE_BETWEEN_BUTTON_GROUPS;
		spacer2.setLayoutData(spacer2GridData);

		final Label lblConditions = new Label(buttonsPaneComposite, SWT.NONE);
		lblConditions.setText(Messages.CustomizationEditor_conditions);

		this.btnAdd = new Button(buttonsPaneComposite, SWT.PUSH);
		this.btnAdd.setText(Messages.CustomizationEditor_add);
		this.btnAdd.setLayoutData(buttonsGridData());
		this.btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				btnAddClicked();
			}
		});

		this.btnEdit = new Button(buttonsPaneComposite, SWT.PUSH);
		this.btnEdit.setText(Messages.CustomizationEditor_edit);
		this.btnEdit.setLayoutData(buttonsGridData());
		this.btnEdit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				btnEditClicked();
			}
		});

		this.btnRemove = new Button(buttonsPaneComposite, SWT.PUSH);
		this.btnRemove.setText(Messages.CustomizationEditor_remove);
		this.btnRemove.setLayoutData(buttonsGridData());
		this.btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				btnRemoveClicked();
			}
		});

		this.btnUp = new Button(buttonsPaneComposite, SWT.PUSH);
		this.btnUp.setText(Messages.CustomizationEditor_up);
		this.btnUp.setLayoutData(buttonsGridData());
		this.btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				btnUpClicked();
			}
		});

		this.btnDown = new Button(buttonsPaneComposite, SWT.PUSH);
		this.btnDown.setText(Messages.CustomizationEditor_down);
		this.btnDown.setLayoutData(buttonsGridData());
		this.btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				btnDownClicked();
			}
		});

		return buttonsPaneComposite;
	}

	private Object buttonsGridData() {
		final GridData buttonsGridData = new GridData();
		buttonsGridData.grabExcessHorizontalSpace = true;
		buttonsGridData.grabExcessVerticalSpace = false;
		buttonsGridData.horizontalAlignment = SWT.FILL;
		buttonsGridData.verticalAlignment = SWT.FILL;
		return buttonsGridData;
	}

	private MetaclassViewToolBar createToolBar(final Composite parent) {
		final Composite toolBarComposite = new Composite(parent, SWT.NONE);
		final GridData toolBarGridData = new GridData();
		toolBarGridData.grabExcessHorizontalSpace = true;
		toolBarGridData.horizontalAlignment = SWT.FILL;
		toolBarComposite.setLayoutData(toolBarGridData);

		return new MetaclassViewToolBar(toolBarComposite, this.metaclassViewConfiguration);
	}

	private void loadResource(final java.net.URI locationURI) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		addResourceErrorsHandler(resourceSet);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("uiCustom", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		final URI uri = URI.createURI(locationURI.toString());
		final Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
		} catch (final IOException e) {
			Activator.logException("Error loading resource " + locationURI, e); //$NON-NLS-1$
			MessageDialog.openError(getSite().getShell(), Messages.CustomizationEditor_error,
					Messages.CustomizationEditor_errorLoadingResource);
			throw new IllegalStateException("Model couldn't be loaded", e); //$NON-NLS-1$
		}
		this.fMetamodelView = (MetamodelView) resource.getContents().get(0);
		convertToNewFormat(this.fMetamodelView);
	}

	private void convertToNewFormat(final MetamodelView metamodelView) {
		try {
			boolean changed = false;
			for (TypeView typeView : metamodelView.getTypes()) {
				for (CustomViewFeature customViewFeature : typeView.getCustomizedFeatures()) {
					if (customViewFeature.getCustomizedFeature() == CustomizableFeatures.FACET_MAIN_ICON) {
						changed = true;
						customViewFeature.setCustomizedFeature(CustomizableFeatures.INSTANCE_ICON);
					}

				}
				EList<AttributeView> attributes = typeView.getAttributes();
				for (AttributeView attributeView : attributes) {
					EList<CustomViewFeature> customizedFeatures = attributeView
							.getCustomizedFeatures();
					for (CustomViewFeature customAttributeFeature : customizedFeatures) {
						if (customAttributeFeature.getCustomizedFeature() == CustomizableFeatures.ICON) {
							changed = true;
							customAttributeFeature
									.setCustomizedFeature(CustomizableFeatures.INSTANCE_ICON);
						}
					}

				}
				EList<ReferenceView> references = typeView.getReferences();
				for (ReferenceView referenceView : references) {
					EList<CustomViewFeature> customizedFeatures = referenceView
							.getCustomizedFeatures();
					for (CustomViewFeature customReferenceFeature : customizedFeatures) {
						if (customReferenceFeature.getCustomizedFeature() == CustomizableFeatures.ICON) {
							changed = true;
							customReferenceFeature
									.setCustomizedFeature(CustomizableFeatures.INSTANCE_ICON);
						}
					}
				}
			}
			if (changed) {
				setDirty(true);
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						MessageDialog.openInformation(getSite().getShell(),
								Messages.CustomizationEditor_customizationConverted,
								Messages.CustomizationEditor_customizationConvertedLong);
					}
				});
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e,
					"Error converting customization to new format", Activator.getDefault()); //$NON-NLS-1$
		}
	}

	private void addResourceErrorsHandler(final ResourceSet resourceSet) {
		resourceSet.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(final Notification notification) {
				if (notification.getNotifier() instanceof Resource) {
					switch (notification.getFeatureID(Resource.class)) {
					case Resource.RESOURCE__IS_LOADED:
					case Resource.RESOURCE__ERRORS:
					case Resource.RESOURCE__WARNINGS:
						final Resource resource = (Resource) notification.getNotifier();

						if (!resource.getErrors().isEmpty()) {
							BasicDiagnostic basicDiagnostic = new BasicDiagnostic(
									org.eclipse.emf.common.util.Diagnostic.ERROR,
									Activator.PLUGIN_ID, 0, NLS.bind(
											Messages.CustomizationEditor_problemsInFile,
											resource.getURI()), new Object[] { resource });
							basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));

							CustomizationEditor.this.fDiagnostic = basicDiagnostic;
							if (CustomizationEditor.this.errorsButton != null) {
								CustomizationEditor.this.errorsButton.setVisible(true);
							}
						}
						break;
					default:
						// do nothing
					}
				} else {
					super.notifyChanged(notification);
				}
			}

			@Override
			protected void setTarget(final Resource target) {
				basicSetTarget(target);
			}

			@Override
			protected void unsetTarget(final Resource targetResource) {
				basicUnsetTarget(targetResource);
			}
		});
	}

	private void metaclassSelectionChanged(final Object selectedElement) {
		this.cbAppliesToSubinstances.setEnabled(false);
		this.cbAppliesToSubinstances.setSelection(false);
		if (selectedElement == null) {
			this.customizationViewer.setInput(null);
			return;
		}

		CustomView customView = null;
		if (selectedElement instanceof EClass) {
			final EClass eClass = (EClass) selectedElement;
			customView = findOrCreateTypeView(eClass);
			if (!this.readOnly) {
				this.cbAppliesToSubinstances.setEnabled(true);
			}
			this.cbAppliesToSubinstances.setSelection(((TypeView) customView)
					.isAppliesToSubInstances());
		} else if (selectedElement instanceof Attribute) {
			final Attribute attribute = (Attribute) selectedElement;
			customView = findOrCreateAttributeView(attribute.getEClass(), attribute.getEAttribute());
		} else if (selectedElement instanceof Reference) {
			final Reference reference = (Reference) selectedElement;
			customView = findOrCreateReferenceView(reference.getEClass(), reference.getEReference());
		} else {
			throw new IllegalStateException("Unexpected element type: " //$NON-NLS-1$
					+ selectedElement.getClass().getSimpleName());
		}

		// for each possible feature, add an empty feature if it is not yet
		// present (for editing)
		final EList<CustomViewFeature> customizedFeatures = customView.getCustomizedFeatures();
		for (final CustomizableFeatures feature : CustomizableFeatures.values()) {
			if (appliesTo(feature, selectedElement)) {

				boolean present = false;
				for (final CustomViewFeature customViewFeature : customizedFeatures) {
					if (customViewFeature.getCustomizedFeature().equals(feature)) {
						present = true;
						break;
					}
				}
				if (!present) {
					final CustomViewFeature newCustomViewFeature = UicustomFactory.eINSTANCE
							.createCustomViewFeature();
					newCustomViewFeature.setCustomizedFeature(feature);
					customizedFeatures.add(newCustomViewFeature);
				}
			}
		}

		this.customizationViewer.setInput(customView);
	}

	private boolean appliesTo(final CustomizableFeatures feature, final Object selectedElement) {

		// deprecated and automatically converted (see convertToNewFormat)
		if (feature == CustomizableFeatures.FACET_MAIN_ICON) {
			return false;
		}

		// deprecated and automatically converted (see convertToNewFormat)
		if (feature == CustomizableFeatures.ICON
				&& (selectedElement instanceof Attribute || selectedElement instanceof Reference)) {
			return false;
		}

		// XXX only the icons can be customized for facets (for now)
		if (selectedElement instanceof Facet) {
			switch (feature) {
			case ICON:
			case FACET_OVERLAY_ICON:
			case METACLASS_VISIBLE:
			case STICKER_ICON:
			case METACLASS_ICON:
				return true;
			default:
				return false;
			}
		}

		switch (feature) {
		case HIDE_METACLASS_NAME:
		case METACLASS_VISIBLE:
			return selectedElement instanceof EClass;
		case FACET_MAIN_ICON:
		case FACET_OVERLAY_ICON:
		case STICKER_ICON:
			return true;
		case COLLAPSE_LINK:
			return selectedElement instanceof Reference;
		default:
			return true;
		}
	}

	private TypeView findOrCreateTypeView(final EClass eClass) {
		final String className = ModelUtils.getMetaclassQualifiedName(eClass);
		if (className == null) {
			return null;
		}
		final EList<TypeView> types = this.fMetamodelView.getTypes();
		for (final TypeView typeView : types) {
			if (className.equals(typeView.getMetaclassName())) {
				return typeView;
			}
		}
		final TypeView typeView = UicustomFactory.eINSTANCE.createTypeView();
		typeView.setMetaclassName(className);
		this.fMetamodelView.getTypes().add(typeView);
		return typeView;
	}

	private AttributeView findOrCreateAttributeView(final EClass eClass, final EAttribute attribute) {
		final TypeView typeView = findOrCreateTypeView(eClass);

		final String attributeName = attribute.getName();
		final EList<AttributeView> attributeViews = typeView.getAttributes();
		for (final AttributeView attributeView : attributeViews) {
			if (attributeName.equals(attributeView.getAttributeName())) {
				return attributeView;
			}
		}
		final AttributeView attributeView = UicustomFactory.eINSTANCE.createAttributeView();
		attributeView.setAttributeName(attributeName);
		typeView.getAttributes().add(attributeView);
		return attributeView;
	}

	private ReferenceView findOrCreateReferenceView(final EClass eClass, final EReference reference) {
		final TypeView typeView = findOrCreateTypeView(eClass);

		final String referenceName = reference.getName();
		final EList<ReferenceView> referenceViews = typeView.getReferences();
		for (final ReferenceView referenceView : referenceViews) {
			if (referenceName.equals(referenceView.getReferenceName())) {
				return referenceView;
			}
		}
		final ReferenceView referenceView = UicustomFactory.eINSTANCE.createReferenceView();
		referenceView.setReferenceName(referenceName);
		typeView.getReferences().add(referenceView);
		return referenceView;
	}

	protected void customizationSelectionChanged(final Object selectedElement) {
		buttonsEnablementForSelection(selectedElement);
	}

	private void buttonsEnablementForSelection(final Object selectedElement) {
		if (this.readOnly) {
			return;
		}

		if (selectedElement == null) {
			this.btnEditFeatureValue.setEnabled(false);
			this.btnAdd.setEnabled(false);
			this.btnEdit.setEnabled(false);
			this.btnUp.setEnabled(false);
			this.btnDown.setEnabled(false);
			this.btnRemove.setEnabled(false);
		} else if (selectedElement instanceof CustomViewFeature) {
			this.btnEditFeatureValue.setEnabled(true);
			this.btnAdd.setEnabled(true);
			this.btnEdit.setEnabled(false);
			this.btnUp.setEnabled(false);
			this.btnDown.setEnabled(false);
			this.btnRemove.setEnabled(false);
		} else if (selectedElement instanceof FeatureValueCase) {
			final FeatureValueCase featureValueCase = (FeatureValueCase) selectedElement;
			this.btnEditFeatureValue.setEnabled(false);
			this.btnAdd.setEnabled(false);
			this.btnEdit.setEnabled(true);
			this.btnUp.setEnabled(!isFirst(featureValueCase));
			this.btnDown.setEnabled(!isLast(featureValueCase));
			this.btnRemove.setEnabled(true);
		}
	}

	private boolean isFirst(final FeatureValueCase featureValueCase) {
		final EList<FeatureValueCase> valueCases = featureValueCase.getFeature().getValueCases();
		if (valueCases.size() > 0 && valueCases.get(0).equals(featureValueCase)) {
			return true;
		}
		return false;
	}

	private boolean isLast(final FeatureValueCase featureValueCase) {
		final EList<FeatureValueCase> valueCases = featureValueCase.getFeature().getValueCases();
		if (valueCases.size() > 0 && valueCases.get(valueCases.size() - 1).equals(featureValueCase)) {
			return true;
		}
		return false;
	}

	private Object getSelectedElement() {
		final ITreeSelection selection = (ITreeSelection) this.customizationViewer.getSelection();
		return selection.getFirstElement();
	}

	private void btnEditFeatureValueClicked() {
		if (this.readOnly) {
			return;
		}
		final Object selectedElement = getSelectedElement();
		if (selectedElement instanceof CustomViewFeature) {
			final CustomViewFeature customViewFeature = (CustomViewFeature) selectedElement;
			final CustomizableFeatures customizedFeature = customViewFeature.getCustomizedFeature();

			// find the type (to handle scope)
			EClass customizedMetaclass = findCustomizedMetaclass(customViewFeature);

			final EditFeatureValueDialog editFeatureValueDialog = createDialogFor(
					customizedFeature, false, true, customizedMetaclass);

			if (editFeatureValueDialog == null) {
				return;
			}

			// initialize the dialog with current values
			final FeatureValue defaultValue = customViewFeature.getDefaultValue();
			if (defaultValue instanceof StaticFeatureValue) {
				editFeatureValueDialog.setSelectedValueType(ValueType.STATIC);
				final StaticFeatureValue staticFeatureValue = (StaticFeatureValue) defaultValue;
				editFeatureValueDialog.setInitialStaticValue(staticFeatureValue.getValue());
			} else if (defaultValue instanceof DerivedFeatureValue) {
				editFeatureValueDialog.setSelectedValueType(ValueType.DERIVED);
				final DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue) defaultValue;
				final ModelQuery valueCalculator = derivedFeatureValue.getValueCalculator();
				if (EMFUtil.tryResolve(valueCalculator)) {
					editFeatureValueDialog.setSelectedQuery(valueCalculator.getModelQuerySet()
							.getName(), valueCalculator.getName());
				}
			} else {
				editFeatureValueDialog.setSelectedValueType(ValueType.DEFAULT);
			}

			editFeatureValueDialog.open();
			if (editFeatureValueDialog.getReturnCode() == Window.OK) {
				final ValueType selectedValueType = editFeatureValueDialog.getSelectedValueType();
				if (selectedValueType == ValueType.STATIC) {
					final String staticValue = editFeatureValueDialog.getStaticValue();
					if (staticValue != null) {
						final StaticFeatureValue value = UicustomFactory.eINSTANCE
								.createStaticFeatureValue();
						value.setValue(staticValue);

						// customViewFeature.setDefaultValue(value);
						Command command = SetCommand.create(this.editingDomain, customViewFeature,
								UicustomPackage.eINSTANCE.getCustomViewFeature_DefaultValue(),
								value);
						this.editingDomain.getCommandStack().execute(command);
					}
				} else if (selectedValueType == ValueType.DEFAULT) {
					// customViewFeature.setDefaultValue(null);
					Command command = SetCommand.create(this.editingDomain, customViewFeature,
							UicustomPackage.eINSTANCE.getCustomViewFeature_DefaultValue(), null);
					this.editingDomain.getCommandStack().execute(command);
				} else if (selectedValueType == ValueType.DERIVED) {

					final String selectedQuerySetName = editFeatureValueDialog
							.getSelectedQuerySetName();
					final String selectedQueryName = editFeatureValueDialog.getSelectedQueryName();

					final ModelQuery modelQuery = findModelQuery(selectedQuerySetName,
							selectedQueryName);
					if (modelQuery != null) {
						final DerivedFeatureValue value = UicustomFactory.eINSTANCE
								.createDerivedFeatureValue();
						value.setValueCalculator(modelQuery);
						// customViewFeature.setDefaultValue(value);
						Command command = SetCommand.create(this.editingDomain, customViewFeature,
								UicustomPackage.eINSTANCE.getCustomViewFeature_DefaultValue(),
								value);
						this.editingDomain.getCommandStack().execute(command);
					}
				}
			}
		}

		refresh();
	}

	private void btnResetDefaultsClicked() {
		final IStructuredSelection selection = (IStructuredSelection) this.metaclassViewer
				.getSelection();
		final Object selectedElement = selection.getFirstElement();
		if (selectedElement instanceof EClass) {
			final EClass eClass = (EClass) selectedElement;
			final TypeView typeView = findOrCreateTypeView(eClass);
			// final String message = NLS.bind(
			// Messages.CustomizationEditor_customizationsWillBeDeleted,
			// eClass.getName());
			// if (MessageDialog.openConfirm(getSite().getShell(),
			// Messages.CustomizationEditor_resetDefaults, message)) {
			resetDefaults(typeView);
		} else if (selectedElement instanceof Attribute) {
			Attribute attribute = (Attribute) selectedElement;
			final CustomView customView = findOrCreateAttributeView(attribute.getEClass(),
					attribute.getEAttribute());
			resetDefaults(customView);
		} else if (selectedElement instanceof Reference) {
			Reference reference = (Reference) selectedElement;
			final CustomView customView = findOrCreateReferenceView(reference.getEClass(),
					reference.getEReference());
			resetDefaults(customView);
		}
	}

	private void resetDefaults(final CustomView customView) {
		EList<CustomViewFeature> customizedFeatures = customView.getCustomizedFeatures();

		CompoundCommand compoundCommand = new CompoundCommand();

		for (CustomViewFeature customViewFeature : customizedFeatures) {
			// customViewFeature.getValueCases().clear();
			if (!customViewFeature.getValueCases().isEmpty()) {
				Command removeCommand = RemoveCommand.create(this.editingDomain, customViewFeature,
						UicustomPackage.eINSTANCE.getCustomViewFeature_ValueCases(),
						customViewFeature.getValueCases());
				compoundCommand.append(removeCommand);
			}

			// customViewFeature.setDefaultValue(null);
			Command setCommand = SetCommand.create(this.editingDomain, customViewFeature,
					UicustomPackage.eINSTANCE.getCustomViewFeature_DefaultValue(), null);
			compoundCommand.append(setCommand);
		}

		compoundCommand.setLabel(Messages.CustomizationEditor_resetDefaults);
		this.editingDomain.getCommandStack().execute(compoundCommand);
	}

	private ModelQuery findModelQuery(final String querySetName, final String queryName) {
		final ModelQuerySet modelQuerySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet(
				querySetName);
		if (modelQuerySet != null) {
			final EList<ModelQuery> queries = modelQuerySet.getQueries();
			ModelQuery query = null;
			for (final ModelQuery modelQuery : queries) {
				if (modelQuery.getName().equals(queryName)) {
					query = modelQuery;
					break;
				}
			}
			if (query == null) {
				MessageDialog
						.openError(getSite().getShell(),
								Messages.CustomizationEditor_nonExistingQuery, NLS.bind(
										Messages.CustomizationEditor_missingQuery, queryName,
										querySetName));
				return null;
			}
			return query;
		}
		MessageDialog.openError(getSite().getShell(),
				Messages.CustomizationEditor_nonExistingQuerySet,
				NLS.bind(Messages.CustomizationEditor_missingQuerySet, querySetName));
		return null;
	}

	private EditFeatureValueDialog createDialogFor(final CustomizableFeatures customizedFeature,
			final boolean withCondition, final boolean withDefault, final EClass customizedMetaclass) {
		switch (customizedFeature) {
		case BOLD:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_bold, withCondition,
					withDefault, customizedMetaclass);
		case ITALIC:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_italic, withCondition,
					withDefault, customizedMetaclass);
		case STRUCKTHROUGH:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_strikethrough,
					withCondition, withDefault, customizedMetaclass);
		case UNDERLINED:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_underlined,
					withCondition, withDefault, customizedMetaclass);
		case VISIBLE:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_visible, withCondition,
					withDefault, customizedMetaclass);
		case METACLASS_VISIBLE:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_metaclassVisible,
					withCondition, withDefault, customizedMetaclass);
		case LABEL:
			return createTextFeatureDialog(Messages.CustomizationEditor_text, withCondition,
					withDefault, customizedMetaclass);
		case COLOR:
		case BACKGROUND_COLOR:
			return createColorFeatureDialog(withCondition, withDefault, customizedMetaclass);
		case ICON:
		case FACET_MAIN_ICON:
		case INSTANCE_ICON:
		case METACLASS_ICON:
		case STICKER_ICON:
			return createIconFeatureDialog(withCondition, withDefault, customizedMetaclass);
		case FACET_OVERLAY_ICON:
			return createOverlayIconFeatureDialog(withCondition, withDefault, customizedMetaclass);
		case FONT_NAME:
			return createFontFeatureDialog(withCondition, withDefault, customizedMetaclass);
		case HIDE_METACLASS_NAME:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_hideMetaclassName,
					withCondition, withDefault, customizedMetaclass);
		case COLLAPSE_LINK:
			return createBooleanFeatureDialog(Messages.CustomizationEditor_collapseLink,
					withCondition, withDefault, customizedMetaclass);
		default:
			Activator.logError("Unhandled CustomizableFeature : " //$NON-NLS-1$
					+ customizedFeature.getName());
			return null;
		}
	}

	private List<String> getAvailableQuerySets() {
		if (this.fMetamodelView.isAllQuerySetsAvailable()) {
			return null;
		}
		return this.fMetamodelView.getAvailableQuerySets();
	}

	private List<Class<?>> returnTypes(final Class<?>... types) {
		List<Class<?>> returnTypes = new ArrayList<Class<?>>();
		for (Class<?> clazz : types) {
			returnTypes.add(clazz);
		}
		return returnTypes;
	}

	private EditFeatureValueDialog createBooleanFeatureDialog(final String text,
			final boolean withCondition, final boolean withDefault, final EClass customizedMetaclass) {

		return new BooleanFeatureDialog(getSite().getShell(), withCondition, withDefault,
				getAvailableQuerySets(), returnTypes(Boolean.class, boolean.class),
				customizedMetaclass, text);
	}

	private EditFeatureValueDialog createTextFeatureDialog(final String labelText,
			final boolean withCondition, final boolean withDefault, final EClass customizedMetaclass) {
		return new TextFeatureDialog(getSite().getShell(), withCondition, withDefault,
				getAvailableQuerySets(), returnTypes(String.class), customizedMetaclass, labelText);
	}

	private EditFeatureValueDialog createColorFeatureDialog(final boolean withCondition,
			final boolean withDefault, final EClass customizedMetaclass) {
		return new ColorFeatureDialog(getSite().getShell(), withCondition, withDefault,
				getAvailableQuerySets(), returnTypes(String.class), customizedMetaclass);
	}

	private EditFeatureValueDialog createIconFeatureDialog(final boolean withCondition,
			final boolean withDefault, final EClass customizedMetaclass) {
		return new IconFeatureDialog(getSite().getShell(), withCondition, withDefault,
				getAvailableQuerySets(), returnTypes(String.class), customizedMetaclass);
	}

	private EditFeatureValueDialog createOverlayIconFeatureDialog(final boolean withCondition,
			final boolean withDefault, final EClass customizedMetaclass) {
		return new OverlayIconFeatureDialog(getSite().getShell(), withCondition, withDefault,
				getAvailableQuerySets(), returnTypes(String.class), customizedMetaclass);
	}

	private EditFeatureValueDialog createFontFeatureDialog(final boolean withCondition,
			final boolean withDefault, final EClass customizedMetaclass) {
		return new FontFeatureDialog(getSite().getShell(), withCondition, withDefault,
				getAvailableQuerySets(), returnTypes(String.class), customizedMetaclass);
	}

	private void btnAddClicked() {
		if (this.readOnly) {
			return;
		}
		final Object selectedElement = getSelectedElement();
		if (selectedElement instanceof CustomViewFeature) {
			final CustomViewFeature customViewFeature = (CustomViewFeature) selectedElement;
			final CustomizableFeatures customizedFeature = customViewFeature.getCustomizedFeature();

			// find the type (to handle scope)
			EClass customizedMetaclass = findCustomizedMetaclass(customViewFeature);

			final EditFeatureValueDialog editFeatureValueDialog = createDialogFor(
					customizedFeature, true, false, customizedMetaclass);

			FeatureValueCase newValueCase = null;
			if (editFeatureValueDialog != null) {
				editFeatureValueDialog.open();
				if (editFeatureValueDialog.getReturnCode() == Window.OK) {
					final ValueType selectedValueType = editFeatureValueDialog
							.getSelectedValueType();
					if (selectedValueType == ValueType.STATIC) {
						final String staticValue = editFeatureValueDialog.getStaticValue();
						if (staticValue != null) {
							final ModelQuery conditionQuery = findModelQuery(
									editFeatureValueDialog.getSelectedConditionQuerySetName(),
									editFeatureValueDialog.getSelectedConditionQueryName());
							if (conditionQuery != null) {
								final StaticFeatureValue value = UicustomFactory.eINSTANCE
										.createStaticFeatureValue();
								value.setValue(staticValue);

								newValueCase = UicustomFactory.eINSTANCE.createFeatureValueCase();
								newValueCase.setValue(value);

								newValueCase.setCondition(conditionQuery);

								// customViewFeature.getValueCases().add(newValueCase);
								Command command = AddCommand
										.create(this.editingDomain, customViewFeature,
												UicustomPackage.eINSTANCE
														.getCustomViewFeature_ValueCases(),
												newValueCase);
								this.editingDomain.getCommandStack().execute(command);
							}
						}
					} else if (selectedValueType == ValueType.DERIVED) {

						final ModelQuery conditionQuery = findModelQuery(
								editFeatureValueDialog.getSelectedConditionQuerySetName(),
								editFeatureValueDialog.getSelectedConditionQueryName());

						final ModelQuery query = findModelQuery(
								editFeatureValueDialog.getSelectedQuerySetName(),
								editFeatureValueDialog.getSelectedQueryName());

						if (conditionQuery != null && query != null) {
							final DerivedFeatureValue value = UicustomFactory.eINSTANCE
									.createDerivedFeatureValue();
							value.setValueCalculator(query);

							newValueCase = UicustomFactory.eINSTANCE.createFeatureValueCase();
							newValueCase.setValue(value);
							newValueCase.setCondition(conditionQuery);

							// customViewFeature.getValueCases().add(newValueCase);
							Command command = AddCommand.create(this.editingDomain,
									customViewFeature,
									UicustomPackage.eINSTANCE.getCustomViewFeature_ValueCases(),
									newValueCase);
							this.editingDomain.getCommandStack().execute(command);
						}

					}
				}
			}
			refresh();
			if (newValueCase != null) {
				this.customizationViewer.getViewer().setSelection(
						new StructuredSelection(newValueCase), true);
			}
		}
	}

	private EClass findCustomizedMetaclass(final CustomViewFeature customViewFeature) {
		CustomView customView = customViewFeature.getCustomView();
		List<EClass> metaclasses = EMFUtil.getMetaclasses(this.fMetamodel);

		if (customView instanceof TypeView) {
			TypeView typeView = (TypeView) customView;
			return EMFUtil.findMetaclassWithName(typeView.getMetaclassName(), metaclasses);
		} else if (customView instanceof AttributeView) {
			AttributeView attributeView = (AttributeView) customView;
			return EMFUtil.findMetaclassWithName(attributeView.getType().getMetaclassName(),
					metaclasses);
		} else if (customView instanceof ReferenceView) {
			ReferenceView referenceView = (ReferenceView) customView;
			return EMFUtil.findMetaclassWithName(referenceView.getType().getMetaclassName(),
					metaclasses);
		} else {
			throw new IllegalStateException("Unknown CustomView type: " //$NON-NLS-1$
					+ customView.getClass().getSimpleName());
		}

	}

	private void btnEditClicked() {
		if (this.readOnly) {
			return;
		}
		final Object selectedElement = getSelectedElement();
		if (selectedElement instanceof FeatureValueCase) {
			final FeatureValueCase featureValueCase = (FeatureValueCase) selectedElement;
			final CustomViewFeature customViewFeature = featureValueCase.getFeature();
			final CustomizableFeatures customizedFeature = customViewFeature.getCustomizedFeature();

			// find the type (to handle scope)
			final EClass customizedMetaclass = findCustomizedMetaclass(customViewFeature);

			final EditFeatureValueDialog editFeatureValueDialog = createDialogFor(
					customizedFeature, true, false, customizedMetaclass);

			final FeatureValue featureValue = featureValueCase.getValue();
			if (featureValue instanceof StaticFeatureValue) {
				final StaticFeatureValue staticFeatureValue = (StaticFeatureValue) featureValue;
				editFeatureValueDialog.setSelectedValueType(ValueType.STATIC);
				editFeatureValueDialog.setInitialStaticValue(staticFeatureValue.getValue());
			} else if (featureValue instanceof DerivedFeatureValue) {
				final DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue) featureValue;
				editFeatureValueDialog.setSelectedValueType(ValueType.DERIVED);
				final ModelQuery valueCalculator = derivedFeatureValue.getValueCalculator();
				if (EMFUtil.tryResolve(valueCalculator)) {
					editFeatureValueDialog.setSelectedQuery(valueCalculator.getModelQuerySet()
							.getName(), valueCalculator.getName());
				}
			}

			final ModelQuery condition = featureValueCase.getCondition();
			if (condition != null && EMFUtil.tryResolve(condition)) {
				editFeatureValueDialog.setSelectedConditionQuery(condition.getModelQuerySet()
						.getName(), condition.getName());
			}

			if (editFeatureValueDialog != null) {
				editFeatureValueDialog.open();
				if (editFeatureValueDialog.getReturnCode() == Window.OK) {
					final ValueType selectedValueType = editFeatureValueDialog
							.getSelectedValueType();
					if (selectedValueType == ValueType.STATIC) {
						final String staticValue = editFeatureValueDialog.getStaticValue();
						if (staticValue != null) {
							final StaticFeatureValue value = UicustomFactory.eINSTANCE
									.createStaticFeatureValue();
							value.setValue(staticValue);

							// featureValueCase.setValue(value);
							Command command = SetCommand.create(this.editingDomain,
									featureValueCase,
									UicustomPackage.eINSTANCE.getFeatureValueCase_Value(), value);
							this.editingDomain.getCommandStack().execute(command);
						}
					} else if (selectedValueType == ValueType.DERIVED) {
						final DerivedFeatureValue value = UicustomFactory.eINSTANCE
								.createDerivedFeatureValue();

						final ModelQuery query = findModelQuery(
								editFeatureValueDialog.getSelectedQuerySetName(),
								editFeatureValueDialog.getSelectedQueryName());

						final ModelQuery conditionQuery = findModelQuery(
								editFeatureValueDialog.getSelectedConditionQuerySetName(),
								editFeatureValueDialog.getSelectedConditionQueryName());

						if (query != null && conditionQuery != null) {
							value.setValueCalculator(query);
							featureValueCase.setCondition(conditionQuery);
							// featureValueCase.setValue(value);
							Command command = SetCommand.create(this.editingDomain,
									featureValueCase,
									UicustomPackage.eINSTANCE.getFeatureValueCase_Value(), value);
							this.editingDomain.getCommandStack().execute(command);
						}
					}
				}
			}
		}

		refresh();
	}

	private void btnRemoveClicked() {
		if (this.readOnly) {
			return;
		}
		final Object selectedElement = getSelectedElement();
		if (selectedElement instanceof FeatureValueCase) {
			final FeatureValueCase featureValueCase = (FeatureValueCase) selectedElement;
			// final EList<FeatureValueCase> list =
			// featureValueCase.getFeature().getValueCases();
			// list.remove(featureValueCase);
			Command command = RemoveCommand.create(this.editingDomain,
					featureValueCase.getFeature(),
					UicustomPackage.eINSTANCE.getCustomViewFeature_ValueCases(), featureValueCase);
			this.editingDomain.getCommandStack().execute(command);
		}
	}

	private void btnUpClicked() {
		if (this.readOnly) {
			return;
		}
		final Object selectedElement = getSelectedElement();
		if (selectedElement instanceof FeatureValueCase) {
			final FeatureValueCase featureValueCase = (FeatureValueCase) selectedElement;
			final EList<FeatureValueCase> list = featureValueCase.getFeature().getValueCases();
			// swap the element with the one before
			final int index = list.indexOf(featureValueCase);
			if (index - 1 >= 0) {
				// list.move(index - 1, index);
				Command command = MoveCommand.create(this.editingDomain,
						featureValueCase.getFeature(),
						UicustomPackage.eINSTANCE.getCustomViewFeature_ValueCases(),
						list.get(index), index - 1);
				this.editingDomain.getCommandStack().execute(command);
			}
			refresh();
		}
	}

	private void btnDownClicked() {
		if (this.readOnly) {
			return;
		}
		final Object selectedElement = getSelectedElement();
		if (selectedElement instanceof FeatureValueCase) {
			final FeatureValueCase featureValueCase = (FeatureValueCase) selectedElement;
			final EList<FeatureValueCase> list = featureValueCase.getFeature().getValueCases();
			// swap the element with the one after
			final int index = list.indexOf(featureValueCase);
			if (index + 1 < list.size()) {
				// list.move(index + 1, index);
				Command command = MoveCommand.create(this.editingDomain,
						featureValueCase.getFeature(),
						UicustomPackage.eINSTANCE.getCustomViewFeature_ValueCases(),
						list.get(index), index + 1);
				this.editingDomain.getCommandStack().execute(command);
			}
			refresh();
		}
	}

	private void appliesToSubinstancesChanged(final boolean newValue) {
		final IStructuredSelection selection = (IStructuredSelection) this.metaclassViewer
				.getSelection();
		final Object selectedElement = selection.getFirstElement();
		if (selectedElement instanceof EClass) {
			final EClass eClass = (EClass) selectedElement;
			final TypeView typeView = findOrCreateTypeView(eClass);

			// typeView.setAppliesToSubInstances(newValue);
			Command command = SetCommand.create(this.editingDomain, typeView,
					UicustomPackage.eINSTANCE.getTypeView_AppliesToSubInstances(),
					Boolean.valueOf(newValue));
			this.editingDomain.getCommandStack().execute(command);
		}
	}

	private void updateSubinstancesChangedCheckbox() {
		final IStructuredSelection selection = (IStructuredSelection) this.metaclassViewer
				.getSelection();
		final Object selectedElement = selection.getFirstElement();
		if (selectedElement instanceof EClass) {
			final EClass eClass = (EClass) selectedElement;
			final TypeView typeView = findOrCreateTypeView(eClass);
			this.cbAppliesToSubinstances.setSelection(typeView.isAppliesToSubInstances());
		}
	}

	private void refresh() {
		this.customizationViewer.refresh();
		this.metaclassViewer.refresh();
		buttonsEnablementForSelection(getSelectedElement());
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
		if (this.readOnly) {
			return;
		}

		final IFileEditorInput fileEditorInput = (IFileEditorInput) getEditorInput();
		final String fileURI = fileEditorInput.getFile().getFullPath().toString();

		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("uiCustom", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		final Resource resource = resourceSet.createResource(URI.createPlatformResourceURI(fileURI,
				true));

		// save a clean copy of the model, in which useless elements are removed
		final MetamodelView metamodelViewCopy = EcoreUtil.copy(this.fMetamodelView);
		resource.getContents().add(cleanModel(metamodelViewCopy));

		try {
			this.resourceChangeListener.setEditorSaved(true);
			resource.save(null);
			((BasicCommandStack) this.editingDomain.getCommandStack()).saveIsDone();
			setDirty(false);
		} catch (final Exception e) {
			Activator.logException(e);
		}
	}

	/** Clean the customization model by removing unnecessary model elements */
	private MetamodelView cleanModel(final MetamodelView metamodelView) {
		final ListIterator<TypeView> typesIterator = metamodelView.getTypes().listIterator();
		while (typesIterator.hasNext()) {
			final TypeView typeView = typesIterator.next();

			boolean containsInformation = true;

			if (!clean(typeView)) {
				containsInformation = false;
			}

			final ListIterator<AttributeView> attributesIterator = typeView.getAttributes()
					.listIterator();
			while (attributesIterator.hasNext()) {
				final AttributeView attributeView = attributesIterator.next();
				if (clean(attributeView)) {
					containsInformation = true;
				} else {
					attributesIterator.remove();
				}
			}

			final ListIterator<ReferenceView> referencesIterator = typeView.getReferences()
					.listIterator();
			while (referencesIterator.hasNext()) {
				final ReferenceView referenceView = referencesIterator.next();
				if (clean(referenceView)) {
					containsInformation = true;
				} else {
					referencesIterator.remove();
				}
			}

			if (!containsInformation) {
				typesIterator.remove();
			}
		}
		return metamodelView;
	}

	/**
	 * Clean the custom view
	 *
	 * @return whether the custom view contains information and thus must be kept
	 */
	private boolean clean(final CustomView customView) {
		final EList<CustomViewFeature> customizedFeatures = customView.getCustomizedFeatures();

		final ListIterator<CustomViewFeature> featuresIterator = customizedFeatures.listIterator();
		while (featuresIterator.hasNext()) {
			final CustomViewFeature customViewFeature = featuresIterator.next();
			if (customViewFeature.getDefaultValue() == null
					&& customViewFeature.getValueCases().size() == 0) {
				featuresIterator.remove();
			}
		}

		return customizedFeatures.size() > 0;
	}

	@Override
	public void doSaveAs() {
		// nothing
	}

	@Override
	public boolean isDirty() {
		return this.dirty && !this.readOnly;
	}

	private void setDirty(final boolean dirty) {
		this.dirty = dirty;
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void setFocus() {
		// nothing
	}

	/** A listener to save user settings when the editor is closed */
	private class SaveSettingsOnCloseListener implements IPartListener {
		public void partClosed(final IWorkbenchPart part) {
			if (part == CustomizationEditor.this) {
				CustomizationEditor.this.metaclassViewConfiguration.save();
				getSite().getPage().removePartListener(this);
			}
		}

		public void partOpened(final IWorkbenchPart part) {
			// nothing
		}

		public void partDeactivated(final IWorkbenchPart part) {
			// nothing
		}

		public void partBroughtToTop(final IWorkbenchPart part) {
			// nothing
		}

		public void partActivated(final IWorkbenchPart part) {
			// nothing
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this.resourceChangeListener);
		getSite().getPage().removePartListener(this.partListener);
		this.toolkit.dispose();
	}

	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	public void gotoMarker(final IMarker marker) {
		try {
			if (marker.getType().equals(EValidator.MARKER)
					|| marker.getType().equals(AbstractMoDiscoCatalog.BROKEN_REF_MARKER)) {
				String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = this.fMetamodelView.eResource().getEObject(uri.fragment());
					if (eObject != null) {
						if (eObject instanceof FeatureValue) {
							FeatureValue featureValue = (FeatureValue) eObject;
							CustomViewFeature feature = featureValue.getFeature();
							if (feature != null) {
								CustomView customView = feature.getCustomView();
								this.metaclassViewer.select(customView);
								this.customizationViewer.getViewer().setSelection(
										new StructuredSelection(feature), true);
							}
							FeatureValueCase valueCase = featureValue.getCase();
							if (valueCase != null) {
								CustomView customView = valueCase.getFeature().getCustomView();
								this.metaclassViewer.select(customView);
								this.customizationViewer.getViewer().setSelection(
										new StructuredSelection(valueCase), true);
							}
						}
					}
				}
			}
		} catch (CoreException exception) {
			MoDiscoLogger.logError(exception, Activator.getDefault());
		}

	}

	private final IPartListener partListener = new IPartListener() {
		public void partActivated(final IWorkbenchPart p) {
			if (p == CustomizationEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(final IWorkbenchPart p) {
			// Ignore.
		}

		public void partClosed(final IWorkbenchPart p) {
			// Ignore.
		}

		public void partDeactivated(final IWorkbenchPart p) {
			// Ignore.
		}

		public void partOpened(final IWorkbenchPart p) {
			// Ignore.
		}
	};

	public MetamodelView getMetamodelView() {
		return this.fMetamodelView;
	}

	public void setResourceDeleted(final boolean value) {
		this.resourceDeleted = value;
	}

	public void setResourceChanged(final boolean value) {
		this.resourceChanged = value;
	}

	/**
	 * Handles activation of the editor or it's associated views.
	 */
	protected void handleActivate() {
		if (this.resourceDeleted) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(this, false);
			} else {
				this.resourceDeleted = false;
				this.resourceChanged = false;
				setDirty(true);
			}
		} else if (this.resourceChanged) {
			this.resourceChanged = false;
			handleChangedResources();
		}
	}

	/** Shows a dialog that asks if conflicting changes should be discarded. */
	protected boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(),
				Messages.CustomizationEditor_fileConflict,
				Messages.CustomizationEditor_conflictingUnsavedChanges);
	}

	/** Handles what to do with changed resources on activation. */
	protected void handleChangedResources() {
		try {
			if (!isDirty() || handleDirtyConflict()) {
				this.editingDomain.getCommandStack().flush();
				ISelection selection = this.metaclassViewer.getSelection();
				loadResource(new java.net.URI(this.fMetamodelView.eResource().getURI().toString()));
				final Resource metamodel = initMetamodel(this.fMetamodelView.getMetamodelURI());
				this.fMetamodel = metamodel;
				this.metaclassViewer.setMetamodelView(this.fMetamodelView);
				this.metaclassViewer.getViewer().setSelection(selection, true);
				refresh();
				refreshHeader();
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

}
