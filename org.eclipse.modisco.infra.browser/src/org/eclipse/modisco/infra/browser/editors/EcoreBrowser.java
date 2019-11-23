/*******************************************************************************
 * Copyright (c) 2008, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Payneau (Mia-Software) - Enable editability
 *    Nicolas Guyomar (Mia-Software) - Code Synchronization
 *    Nicolas Guyomar (Mia_software) - Bug 333651 Remove of the MoDisco EPackage view and of the metamodel browsing button
 *    Gregoire Dupe (Mia-Software) - Bug 404263 - EditingDomainProvider does not work when using IResourceEditorInput
 *    Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *    Gregoire Dupe (Mia-Software) - Bug 472182 - Missing debug information in EcoreBrowser.handleChangedResources(2636)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.actions.LoadFacetsAction;
import org.eclipse.modisco.infra.browser.core.DragAndDropOnLinkCommand;
import org.eclipse.modisco.infra.browser.core.DragAndDropOnModelElementCommand;
import org.eclipse.modisco.infra.browser.core.InstancesForMetaclass;
import org.eclipse.modisco.infra.browser.core.InstancesForMetaclasses;
import org.eclipse.modisco.infra.browser.core.MetaclassList;
import org.eclipse.modisco.infra.browser.core.ModelElementItemEx;
import org.eclipse.modisco.infra.browser.core.QueryItem;
import org.eclipse.modisco.infra.browser.core.SearchResults;
import org.eclipse.modisco.infra.browser.core.InstancesForMetaclasses.MetaclassesChangeListener;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.modisco.infra.browser.dialogs.ErrorsDialog;
import org.eclipse.modisco.infra.browser.extensions.LoadingDepthRegistry;
import org.eclipse.modisco.infra.browser.extensions.listeners.DoubleClickListener;
import org.eclipse.modisco.infra.browser.preferences.PreferenceConstants;
import org.eclipse.modisco.infra.browser.queries.SelectedQueriesManager;
import org.eclipse.modisco.infra.browser.queries.SelectedQuery;
import org.eclipse.modisco.infra.browser.uicore.ChangeListener;
import org.eclipse.modisco.infra.browser.uicore.UnwrappingSelectionProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.CustomTreePainter;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.model.AttributeItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.BigListItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.browser.uicore.internal.util.EMFUtil;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.controls.FormStyleSashForm;
import org.eclipse.modisco.infra.common.ui.internal.controls.Tooltip;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.IResourceEditorInput;
import org.eclipse.modisco.infra.common.ui.internal.util.DialogUtils;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.modisco.infra.facet.core.adapters.instances.MetaclassInstancesAdapterFactoryWithFacet;
import org.eclipse.modisco.infra.facet.core.adapters.instances.MetaclassInstancesAdapterWithFacet;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.INavigationLocation;
import org.eclipse.ui.INavigationLocationProvider;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * MoDisco model editor: a two pane editor. The left pane shows the list of
 * metaclasses and the right pane shows the list of instances of the metaclass
 * selected in the left pane.
 * <p>
 * The following pop-up menus can be contributed to this part:
 * <ul>
 * <li>{@link EcoreBrowser#MENU_ID}
 * <li>{@link MetaclassViewer#MENU_ID}
 * </ul>
 */
public class EcoreBrowser extends EditorPart implements ISelectionProvider, IMenuListener,
		IViewerProvider, INavigationLocationProvider, MetaclassesChangeListener,
		IEditingDomainProvider, IGotoMarker {

	public static final String MENU_ID = EcoreBrowser.EDITOR_ID + ".menu"; //$NON-NLS-1$

	private static final int MAIN_FORM_MARGIN_HEIGHT = 6;
	private static final int MAIN_FORM_MARGIN_WIDTH = 4;
	private static final int RIGHT_PANE_SASH_WEIGHT = 65;
	private static final int LEFT_PANE_SASH_WEIGHT = 35;
	private static final int SASH_WIDTH = 4;
	public static final String EDITOR_ID = "org.eclipse.modisco.infra.browser.editorID"; //$NON-NLS-1$
	private static final String PROPERTY_VIEW_ID = "org.eclipse.ui.views.PropertySheet"; //$NON-NLS-1$

	private ResourceSet fResourceSet;

	private Resource model;

	/** An adapter factory that uses the registry */
	private ComposedAdapterFactory adapterFactoryWithRegistry;

	/** The property sheet page. */
	private IPropertySheetPage propertySheetPage;

	/** The tree part of the model editor. */
	private TreeViewer treeViewer;

	private BrowserContentProvider fContentProvider;
	private BrowserLabelProvider fLabelProvider;

	/** The tree component (instances pane) */
	private Tree fTree;

	/** The list of metaclasses that appears in the left pane of the editor */
	private MetaclassViewer metaclassViewer;

	/** This listens to the tree viewer's selection. */
	private ISelectionChangedListener selectionChangedListener;

	/**
	 * This keeps track of all the
	 * {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are
	 * listening to this editor.
	 */
	private final Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	/** This keeps track of the selection of the editor as a whole. */
	private ISelection editorSelection = StructuredSelection.EMPTY;

	/**
	 * Resources that have been removed since last activation.
	 */
	private final Collection<Resource> removedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been changed since last activation.
	 */
	private final Collection<Resource> changedResources = new ArrayList<Resource>();

	private final Collection<Resource> savedResources = new ArrayList<Resource>();

	/** This listens for workspace changes. */
	private final IResourceChangeListener resourceChangeListener;

	private Job openModelJob = null;

	/**
	 * Controls whether the problem indication should be updated.
	 */
	private boolean updateProblemIndication = true;

	/**
	 * Map to store the diagnostic associated with a resource.
	 */
	private final Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * The MarkerHelper is responsible for creating workspace resource markers
	 * presented in Eclipse's Problems View.
	 */
	private final MarkerHelper markerHelper = new EditUIMarkerHelper();

	/** Whether the Browser has finished loading */
	private boolean loaded = false;

	/** List of actions that must be done once the browser is loaded */
	private final List<Runnable> doWhenLoaded = new ArrayList<Runnable>();

	private Collection<EPackage> referencedEPackages = null;

	private Composite typesPaneComposite;

	private Composite instancesPaneComposite;

	private Button errorsButton;

	/**
	 * This keeps track of the editing domain that is used to track all changes
	 * to the model.
	 */
	private AdapterFactoryEditingDomain editingDomain;
	/**
	 * The configuration of this editor, which is passed to the adapters, so
	 * that they can use it to change their behavior accordingly
	 */
	private final BrowserConfiguration browserConfiguration;

	/** The composite in which the editor is displayed */
	private Composite parentComposite;

	/** The search box */
	private Text searchBox;

	/** The search job, to allow cancellation in case of a big model */
	private Job searchJob = null;

	/**
	 * The input of the tree viewer, saved before filtering by search, and
	 * restored afterwards
	 */
	private Object savedInput;

	/** A listener on changes to fonts settings */
	private IPropertyChangeListener fontChangeListener;

	/** Listens to changes in the loaded customizations, and updates the viewers */
	private ChangeListener fCustomizationEngineChangeListener = null;

	/** Listens to changes in the Facet catalog, and updates the viewers */
	private ModiscoCatalogChangeListener fFacetsChangeListener = null;

	/** Allows optimized refreshes of the viewer */
	private Job refreshJob = null;

	private FormStyleSashForm sashForm;
	// Initialize to HORIZONTAL representation
	private int styleSashForm = SWT.HORIZONTAL;
	private CustomTreePainter customTreePainter;

	private FormToolkit fFormToolkit;
	private Form form;
	private LeftPane leftPane;
	private TreeToolBar instancesToolBar;

	private BrowserSettingsPersistence settingsPersistence;

	/** Indicates the editor is being disposed */
	private boolean disposing = false;

	private BasicDiagnostic fDiagnostic;

	/**
	 * This listens for when the Properties view becomes active
	 */
	private final IPartListener partListener = new IPartListener() {
		public void partActivated(final IWorkbenchPart p) {
			if (p instanceof PropertySheet) {
				if (((PropertySheet) p).getCurrentPage() == EcoreBrowser.this
						.getPropertySheetPage()) {
					getActionBarContributor().setActiveEditor(EcoreBrowser.this);
					handleActivate();
				}
			} else if (p == EcoreBrowser.this) {
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

	/** Create the Mia Ecore model editor. */
	public EcoreBrowser() {
		super();
		this.browserConfiguration = new BrowserConfiguration(this);

		// load user settings
		this.browserConfiguration.getAppearanceConfiguration().load();

		this.resourceChangeListener = new WorkspaceChangeListener(this);
	}

	/** Set the selection into the tree viewer */
	public void setSelectionToViewer(final Collection<?> selection) {
		final Collection<?> theSelection = selection;

		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
				public void run() {
					if (EcoreBrowser.this.treeViewer != null) {
						EcoreBrowser.this.treeViewer.setSelection(new StructuredSelection(
								theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	/** @return the viewer as required by the {@link IViewerProvider} interface. */
	public Viewer getViewer() {
		return this.treeViewer;
	}

	public MetaclassViewer getMetaclassViewer() {
		return this.metaclassViewer;
	}

	/**
	 * Create a context menu for the viewer, add a listener, and register the
	 * menu for extension.
	 */
	protected void createContextMenuFor(final StructuredViewer viewer) {
		final MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		final Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(EcoreBrowser.MENU_ID, contextMenu,
				new UnwrappingSelectionProvider(viewer));
	}

	/** Load a resource based on the editor's input. */
	protected Resource createModel() {
		Resource result = null;
		Exception exception = null;
		// this.fResourceSet.setURIConverter(createURIConverter());
		this.fResourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
		final URI resourceURI = EditUIUtil.getURI(getEditorInput());
		try {
			final IEditorInput editorInput = getEditorInput();
			if (editorInput instanceof FileEditorInput) {
				// Load the resource
				ResourceSet resourceSet = this.editingDomain.getResourceSet();
				synchronized (resourceSet) {
					result = resourceSet.getResource(resourceURI, true);
				}
				this.fResourceSet = this.editingDomain.getResourceSet();
			} else if (editorInput instanceof IResourceEditorInput) {
				IResourceEditorInput resourceEditorInput = (IResourceEditorInput) editorInput;
				result = resourceEditorInput.getResource();
				// this.fResourceSet.getResources().add(result);
				ResourceSet resourceSet = result.getResourceSet();
				if (resourceSet != null) {
					this.fResourceSet = resourceSet;
				}
				setPartName(resourceEditorInput.getName());
			} else if (editorInput instanceof IStorageEditorInput) {
				IStorageEditorInput storageEditorInput = (IStorageEditorInput) editorInput;
				IStorage storage = storageEditorInput.getStorage();
				InputStream inputStream = storage.getContents();
				Resource resource = this.fResourceSet.createResource(URI.createURI(resourceURI
						.toString()));
				resource.load(inputStream, Collections.emptyMap());
				result = resource;
			} else {
				final String resolveURI = resourceURI.toString();
				final EPackage ePackage = this.fResourceSet.getPackageRegistry().getEPackage(
						resolveURI);
				if (ePackage != null) {
					result = ePackage.eResource();
					if (result != null) {
						this.fResourceSet.getResources().add(result);
						setPartName(ePackage.getName());
					}
				} else {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							MessageDialog.openWarning(getSite().getShell(),
									Messages.EcoreBrowser_cannotOpenModelFromURI, NLS.bind(
											Messages.EcoreBrowser_cannotFindEPackageWithThatURI,
											resolveURI));
						}
					});
				}
			}
			initializeEditingDomain(this.fResourceSet);
		} catch (final Exception e) {
			exception = e;
			MoDiscoBrowserPlugin.logException(e);
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					MessageDialog.openError(EcoreBrowser.this.parentComposite.getShell(),
							Messages.EcoreBrowser_errorLoadingModel, e.toString());
				}
			});
			this.fResourceSet.getResource(resourceURI, false);
		}
		this.fResourceSet.setURIConverter(BrowserUtils.createURIConverter());

		// look for errors in the Resource
		if (result != null) {
			Diagnostic diagnostic = analyzeResourceProblems(result, exception);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				this.resourceToDiagnosticMap.put(result, diagnostic);
			}
		}

		this.editingDomain.getResourceSet().eAdapters().add(this.problemIndicationAdapter);

		return result;
	}

	@Override
	protected void setPartName(final String partName) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				EcoreBrowser.super.setPartName(partName);
			}
		});
	}

	protected static final String LOADING_MESSAGE = Messages.EcoreBrowser_loadingModelPlaceholder;

	public static final String HUMAN_READABLE_NAME = Messages.EcoreBrowser_MoDisco_Model_Browser;

	/** Create the editor composite. */
	@Override
	public void createPartControl(final Composite parent) {

		this.fFormToolkit = new FormToolkit(parent.getDisplay());
		this.form = this.fFormToolkit.createForm(parent);

		this.parentComposite = parent;
		parent.setLayout(new FillLayout());

		initializeEditingDomain();

		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = EcoreBrowser.MAIN_FORM_MARGIN_WIDTH;
		fillLayout.marginHeight = EcoreBrowser.MAIN_FORM_MARGIN_HEIGHT;
		this.form.getBody().setLayout(fillLayout);

		// use an adapter factory that looks in the registry
		this.browserConfiguration.getAppearanceConfiguration().setAdapterFactory(
				this.adapterFactoryWithRegistry);

		this.browserConfiguration.setSelectedQueriesManager(new SelectedQueriesManager());
		this.sashForm = new FormStyleSashForm(this.form.getBody(), this.styleSashForm,
				this.fFormToolkit) {
			@Override
			protected void createContents() {
				createLeftPane(this);
				createTreePane(this);
			}
		};
		this.sashForm.setSashWidth(EcoreBrowser.SASH_WIDTH);

		setupInitialTreeFont();

		this.sashForm.setWeights(new int[] { EcoreBrowser.LEFT_PANE_SASH_WEIGHT,
				EcoreBrowser.RIGHT_PANE_SASH_WEIGHT });

		// keep track of the selection, to be able to restore it when using the
		// "back" button
		addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				markNavigationLocation();
			}
		});

		createContextMenuFor(this.treeViewer);
		DragAdapter.create(this.treeViewer);

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		EditingDomainViewerDropAdapter editingDomainViewerDropAdapter = new EditingDomainViewerDropAdapter(
				this.editingDomain, this.treeViewer);
		this.treeViewer.addDropSupport(dndOperations, transfers, editingDomainViewerDropAdapter);

		getMetaclassViewer().setInput(EcoreBrowser.LOADING_MESSAGE);
		this.treeViewer.setInput(EcoreBrowser.LOADING_MESSAGE);

		createAttributeItemTooltip();
	}

	private void createAttributeItemTooltip() {
		Tooltip tooltip = new Tooltip() {
			@Override
			protected String getText(final TreeItem item) {
				Object data = item.getData();
				if (data instanceof AttributeItem) {
					AttributeItem attributeItem = (AttributeItem) data;
					if (!attributeItem.getText().contains(attributeItem.getValueText())) {
						return attributeItem.getValueText();
					}
				}
				return null;
			}

			@Override
			protected void positionTooltip(final TreeItem treeItem, final Point pt,
					final Point tooltipSize) {
				Point point = EcoreBrowser.this.treeViewer.getTree().toDisplay(
						treeItem.getBounds().x, treeItem.getBounds().y);
				pt.x = point.x;
				pt.y = point.y;
			}
		};
		tooltip.installOn(this.treeViewer.getTree());
	}

	/**
	 * Load the model in the background, to avoid freezing the UI during this
	 * long-running operation.
	 * <p>
	 * <b>see</b>: Bug 325120 - [Model Browser] don't freeze UI while loading
	 * model
	 *
	 * @param monitor
	 */
	protected boolean backgroundOpenModel(final IProgressMonitor monitor) {
		try {
			checkCancelled(monitor);
			initResourceSet();
			checkCancelled(monitor);
			checkResourceSet();

			if (this.model == null) {
				return false;
			}

			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					getMetaclassViewer().setInput(
							getBrowserConfiguration().getInstancesForMetaclasses());
					/*
					 * Select the metaclass corresponding to the 'root' element
					 * (that is, the 'model' element). This in turn sets the
					 * input of the treeview.
					 */
					getMetaclassViewer().selectRootElement();
				}
			});

			loadDefaultFacetSets(this.model);

			IDialogSettings settingsForCurrentMetamodel = getSettingsPersistence()
					.loadLastSettingsForCurrentMetamodel();

			List<Facet> lastFacets = getSettingsPersistence().getLastFacets(
					settingsForCurrentMetamodel);

			LoadFacetsAction.loadFacets(lastFacets, this);
			// for (Facet facet : lastFacets) {
			// this.browserConfiguration.getAppearanceConfiguration().loadFacet(facet);
			// checkCancelled(monitor);
			// }

			checkCancelled(monitor);
			List<MetamodelView> lastCustomizations = getSettingsPersistence()
					.getLastCustomizations(settingsForCurrentMetamodel);
			if (lastCustomizations.size() > 0) {
				loadCustomizations(lastCustomizations);
			} else {
				loadDefaultCustomizations();
			}

			checkCancelled(monitor);

			// note: must be done after adding or removing facets too
			this.browserConfiguration.getInstancesForMetaclasses().buildDerivationTree();

			// add a listener to reload when Facets are modified
			reloadOnFacetChange();

			checkCancelled(monitor);
		} catch (CancellationException e) {
			// canceled : nothing more to do
			return false;
		} catch (ThreadDeath e) {
			// canceled : nothing more to do
			return false;
		}
		finishedLoading();
		return true;
	}

	private void checkResourceSet() {
		for (Resource resource : this.fResourceSet.getResources()) {
			if (resource.getURI() == null) {
				MoDiscoLogger.logError(
						"The ResourceSet opened in the browser contains a Resource with a null URI. " //$NON-NLS-1$
								+ "This can be the cause of NullPointerExceptions.", //$NON-NLS-1$
						MoDiscoBrowserPlugin.getPlugin());
			}
		}
	}

	private void finishedLoading() {
		for (Runnable runnable : this.doWhenLoaded) {
			try {
				Display.getDefault().syncExec(runnable);
			} catch (Exception e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		this.getSite().getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				firePropertyChange(PROP_INPUT);
			}
		});
	}

	private void checkCancelled(final IProgressMonitor monitor) {
		if (monitor.isCanceled() || this.treeViewer.getTree().isDisposed()) {
			throw new CancellationException();
		}
	}

	public BrowserSettingsPersistence getSettingsPersistence() {
		if (this.settingsPersistence == null) {
			this.settingsPersistence = new BrowserSettingsPersistence(getMetamodelURI(), this,
					this.browserConfiguration);
		}
		return this.settingsPersistence;
	}

	/**
	 * @return the URI of the EPackage corresponding to the EClass of the main
	 *         resource's root element
	 */
	public String getMetamodelURI() {
		if (this.model == null) {
			return ""; //$NON-NLS-1$
		}
		try {
			EList<EObject> contents = this.model.getContents();
			if (contents.size() > 0) {
				EObject eObject = contents.get(0);
				EClass eClass = eObject.eClass();
				if (eClass != null) {
					return eClass.getEPackage().getNsURI();
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * @return {@link EPackage}s of {@link EClass}es from the model's main
	 *         {@link Resource}
	 */
	public Collection<EPackage> getReferencedEPackages() {
		if (this.referencedEPackages != null) {
			return this.referencedEPackages;
		}
		Set<EPackage> ePackages = new HashSet<EPackage>();
		try {
			if (this.model != null) {
				TreeIterator<EObject> allContents = this.model.getAllContents();
				while (allContents.hasNext()) {
					EObject eObject = allContents.next();
					EClass eClass = eObject.eClass();
					if (eClass != null) {
						EPackage ePackage = eClass.getEPackage();
						if (ePackage != null) {
							ePackages.add(ePackage);
						}
					}
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
		}
		this.referencedEPackages = ePackages;
		return ePackages;
	}

	protected void initResourceSet() {
		// create an empty resource set
		this.fResourceSet = createResourceSet();

		HashSet<Resource> browsedResources = new HashSet<Resource>();
		Resource mainResource;
		this.model = createModel();
		mainResource = this.model;
		if (mainResource != null) {
			browsedResources.add(mainResource);
		}
		this.browserConfiguration.setResourceSet(this.fResourceSet);

		addReferencedResources(mainResource, browsedResources);
		this.browserConfiguration.setBrowsedResources(browsedResources);
		this.browserConfiguration.getAppearanceConfiguration().getFacetContext()
				.setResources(browsedResources);

		final InstancesForMetaclasses instancesForMetaclasses = createInstancesForMetaclasses(browsedResources);
		this.browserConfiguration.setInstancesForMetaclasses(instancesForMetaclasses);

		instancesForMetaclasses.addListener(this);

		// see Bug 322985 - resources lazy loading and dynamic type panel
		// completion
		// watch ResourceSet to be notified when a Resource is lazy-loaded
		// when that happens, add its elements to the Types panel
		this.fResourceSet.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(final Notification notification) {
				if (notification.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES) {
					int eventType = notification.getEventType();
					if (eventType == Notification.ADD) {
						Object newValue = notification.getNewValue();
						if (newValue instanceof Resource) {
							Resource resource = (Resource) newValue;
							EcoreBrowser.this.browserConfiguration.addBrowsedResource(resource);
							instancesForMetaclasses.watchResource(resource);
							EcoreBrowser.this.browserConfiguration.getAppearanceConfiguration()
									.touch();
							refreshDelayed(true);
						}
					}
					if (eventType == Notification.REMOVE) {
						Object oldValue = notification.getOldValue();
						if (oldValue instanceof Resource) {
							Resource resource = (Resource) oldValue;
							EcoreBrowser.this.browserConfiguration.removeBrowsedResource(resource);
							instancesForMetaclasses.unwatchResource(resource);
							EcoreBrowser.this.browserConfiguration.getAppearanceConfiguration()
									.touch();
							refreshDelayed(true);
						}
					}
				}
			}
		});
	}

	protected InstancesForMetaclasses createInstancesForMetaclasses(
			final Set<Resource> browsedResources) {
		return new InstancesForMetaclasses(this.browserConfiguration, browsedResources);
	}

	/**
	 * Create the resourceSet. This method can be overridden by subclasses.
	 *
	 * @return The ResourceSet.
	 */
	protected ResourceSet createResourceSet() {
		return new ResourceSetImpl();
	}

	/**
	 * Load FacetSet defined as default for the root EPackage of root elements
	 * in the given resource
	 */
	private void loadDefaultFacetSets(final Resource resource) {
		synchronized (resource) {
			for (EObject root : resource.getContents()) {
				EPackage rootEPackage = root.eClass().getEPackage();
				Set<FacetSet> defaultFacetSets = FacetSetCatalog.getSingleton()
						.getDefaultFacetSets(rootEPackage);
				if (defaultFacetSets != null) {
					Set<Facet> facetsToLoad = new HashSet<Facet>();
					for (FacetSet facetSet : defaultFacetSets) {
						if (facetSet != null) {
							facetsToLoad.addAll(facetSet.getFacets());
						}
					}
				}
			}
		}
	}

	/**
	 * If proxies are found, ask the user whether to load resources referenced
	 * by proxies found in the given resource, and up to which depth.
	 *
	 * @param resource
	 *            the resource in which to look for proxies to resolve
	 * @param allResources
	 *            the set of resources to which to add resources referenced by
	 *            proxies
	 */
	private void addReferencedResources(final Resource resource, final Set<Resource> allResources) {
		IPreferenceStore preferenceStore = MoDiscoBrowserPlugin.getPlugin().getPreferenceStore();
		// only walk through the resource contents if necessary
		int registryLoadingDepth = LoadingDepthRegistry.getInstance().getLoadingDepth(
				getMetamodelURI());
		if (preferenceStore.getInt(PreferenceConstants.P_BROWSER_LOADING_DEPTH) != 0
				|| preferenceStore.getBoolean(PreferenceConstants.P_BROWSER_ASK_LOADING_DEPTH)
				|| (registryLoadingDepth != LoadingDepthRegistry.UNDEFINED && registryLoadingDepth != 0)) {
			addReferencedResourcesInternal(resource, allResources, 1);
		}
	}

	/**
	 * Adds resources referenced by proxies found in the given resources to the
	 * set <code>allResources</code>
	 *
	 * @param resource
	 *            the resource in which to look for proxies to resolve
	 * @param allResources
	 *            the set of resources to which to add resources referenced by
	 *            proxies
	 * @param currentDepth
	 *            the current depth
	 *
	 * @see EcoreBrowser#addReferencedResources(Resource, Set)
	 */
	private void addReferencedResourcesInternal(final Resource resource,
			final Set<Resource> allResources, final int currentDepth) {

		final Set<Resource> directReferencedResources = new HashSet<Resource>();

		synchronized (resource) {
			for (EObject root : resource.getContents()) {
				Map<EObject, Collection<EStructuralFeature.Setting>> externalReferences = EcoreUtil.ExternalCrossReferencer
						.find(root);
				if (!externalReferences.isEmpty()) {
					int loadingDepth = this.browserConfiguration
							.getReferencedResourcesLoadingDepth();
					if (loadingDepth == BrowserConfiguration.NOT_YET_ASKED) {
						int registryLoadingDepth = LoadingDepthRegistry.getInstance()
								.getLoadingDepth(getMetamodelURI());
						// whether user settings override registry settings
						boolean overridden = MoDiscoBrowserPlugin
								.getPlugin()
								.getPreferenceStore()
								.getBoolean(
										PreferenceConstants.P_BROWSER_OVERRIDE_METAMODEL_SPECIFIC_SETTINGS);

						if (registryLoadingDepth == LoadingDepthRegistry.UNDEFINED || overridden) {
							final int defaultLoadingDepth = MoDiscoBrowserPlugin.getPlugin()
									.getPreferenceStore()
									.getInt(PreferenceConstants.P_BROWSER_LOADING_DEPTH);
							if (MoDiscoBrowserPlugin.getPlugin().getPreferenceStore()
									.getBoolean(PreferenceConstants.P_BROWSER_ASK_LOADING_DEPTH)) {
								// get shell on UI thread
								final Shell[] shell = new Shell[1];
								Display.getDefault().syncExec(new Runnable() {
									public void run() {
										shell[0] = getSite().getShell();
									}
								});
								loadingDepth = BrowserUtils
										.askUserForDepthToLoadReferencedResources(
												defaultLoadingDepth, shell[0]);
							} else {
								loadingDepth = defaultLoadingDepth;
								if (loadingDepth < -1) {
									loadingDepth = 0;
								}
							}
						} else {
							loadingDepth = registryLoadingDepth;
						}
						this.browserConfiguration.setReferencedResourcesLoadingDepth(loadingDepth);
					}
					if (loadingDepth != -1 && loadingDepth < currentDepth) {
						return;
					}
					for (EObject external : externalReferences.keySet()) {
						Resource externalResource;
						if (external.eIsProxy()) {
							externalResource = EcoreUtil.resolve(external, root).eResource();
						} else {
							externalResource = external.eResource();
						}
						if (externalResource != null) {
							directReferencedResources.add(externalResource);
						} else {
							MoDiscoLogger
									.logError(
											"Failed to load an external element: " + external.eClass().getName() //$NON-NLS-1$
													+ " " + EcoreUtil.getURI(external), //$NON-NLS-1$
											MoDiscoBrowserPlugin.getPlugin());
						}
					}
				}
			}
		}

		int loadingDepth = this.browserConfiguration.getReferencedResourcesLoadingDepth();

		// recurse on sub-resources
		for (Resource directlyReferencedResource : directReferencedResources) {
			if (directlyReferencedResource == null) {
				continue;
			}
			// avoid infinite recursion in the case of mutually referencing
			// resources
			if (!allResources.contains(directlyReferencedResource)) {
				allResources.add(directlyReferencedResource);
				if (loadingDepth == -1 || currentDepth + 1 <= loadingDepth) {
					addReferencedResourcesInternal(directlyReferencedResource, allResources,
							currentDepth + 1);
				}
			}
		}
	}

	/**
	 * Create the left pane, containing the metaclass viewer.
	 *
	 * @param parent
	 *            the parent composite
	 */
	protected void createLeftPane(final Composite parent) {
		final Section section = this.fFormToolkit.createSection(parent,
				ExpandableComposite.TITLE_BAR | ExpandableComposite.EXPANDED);
		section.setText(Messages.EcoreBrowser_metaclasses);
		this.typesPaneComposite = this.fFormToolkit.createComposite(section);
		section.setClient(this.typesPaneComposite);
		this.leftPane = initLeftPane(section, this.fFormToolkit);
		final Composite toolBar = this.leftPane.getToolBarComposite();
		section.setTextClient(toolBar);
		this.typesPaneComposite.setLayout(new FillLayout());
		this.metaclassViewer = this.leftPane.getMetaclassViewer();
		this.metaclassViewer
				.addSelectionChangedListener(new MetaclassListViewerSelectionChangedListener());
	}

	protected LeftPane initLeftPane(final Section section, final FormToolkit formToolkit) {
		return new LeftPane(section, (Composite) section.getClient(), this.browserConfiguration,
				formToolkit, getSite());
	}

	/**
	 * Create the tree and its viewer
	 *
	 * @param parent
	 *            the parent composite of the tree
	 */
	protected void createTreePane(final Composite parent) {

		final Section section = this.fFormToolkit.createSection(parent,
				ExpandableComposite.TITLE_BAR | ExpandableComposite.EXPANDED);
		section.setText(Messages.EcoreBrowser_instances);
		this.instancesPaneComposite = this.fFormToolkit.createComposite(section, SWT.NONE);
		section.setClient(this.instancesPaneComposite);

		final GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		this.instancesPaneComposite.setLayout(layout);

		final Composite treeToolBar = createTreeToolBar(section);
		section.setTextClient(treeToolBar);

		this.errorsButton = new Button(this.instancesPaneComposite, SWT.PUSH);
		this.errorsButton.setText(Messages.EcoreBrowser_errorsAndWarnings);
		this.errorsButton.setToolTipText(Messages.EcoreBrowser_errorsAndWarnings);
		this.errorsButton.setImage(ImageProvider.getInstance().getErrorIcon());
		this.errorsButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ErrorsDialog errorsDialog = new ErrorsDialog(getSite().getShell(),
						EcoreBrowser.this.fDiagnostic);
				errorsDialog.open();
			}
		});
		this.errorsButton.setVisible(false);

		final GridData errorsButtonGridData = new GridData();
		errorsButtonGridData.exclude = true;
		this.errorsButton.setLayoutData(errorsButtonGridData);

		createSearchPanel(this.instancesPaneComposite);

		this.fTree = this.fFormToolkit.createTree(this.instancesPaneComposite, SWT.MULTI
				| SWT.BORDER);
		final GridData treeGridData = new GridData();
		treeGridData.grabExcessHorizontalSpace = true;
		treeGridData.grabExcessVerticalSpace = true;
		treeGridData.horizontalAlignment = SWT.FILL;
		treeGridData.verticalAlignment = SWT.FILL;
		this.fTree.setLayoutData(treeGridData);

		this.fTree.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.ESC) {
					// Escape on the tree: restore view (after search)
					EcoreBrowser.this.searchBox.setText(""); //$NON-NLS-1$
					search();
				} else if (e.keyCode == SWT.CR) {
					// Enter: browse selected item
					handleEnter();
				} else if (e.keyCode == 'c' && e.stateMask == SWT.CTRL) {
					// Ctrl+C : copy element text to clipboard
					BrowserUtils.handleCopyToClipboard(getEditorSelection());
				} else if (e.keyCode == SWT.DEL) {
					handleDel();
				}
			}
		});

		this.customTreePainter = new CustomTreePainter(this.fTree,
				this.browserConfiguration.getAppearanceConfiguration());
		// create a tooltip to show facet names
		FacetTooltip.create(this.fTree, this.customTreePainter);

		this.treeViewer = new TreeViewer(this.fTree);
		// speeds up all operations on a big model
		this.treeViewer.setUseHashlookup(true);

		hookViewerToSelection(this.treeViewer);

		this.fContentProvider = new BrowserContentProvider(this);
		this.treeViewer.setContentProvider(this.fContentProvider);
		this.fLabelProvider = new BrowserLabelProvider(this);
		this.treeViewer.setLabelProvider(this.fLabelProvider);

		registerShowPropertyViewOnDblClick(this.fTree);
	}

	/**
	 * The user pressed the "Enter" key : if selected element is a model
	 * element, then browse to it. If it is an attribute, then open properties
	 * view.
	 */
	protected void handleEnter() {
		final ISelection selection = getEditorSelection();
		if (selection instanceof ITreeSelection) {
			final ITreeSelection treeSelection = (ITreeSelection) selection;
			final Object selectedElement = treeSelection.getFirstElement();
			if (selectedElement instanceof ModelElementItem) {
				browse();
			} else if (selectedElement instanceof AttributeItem
					|| selectedElement instanceof LinkItem) {
				openPropertiesView();
			} else if (selectedElement instanceof QueryItem) {
				QueryItem queryItem = (QueryItem) selectedElement;
				SelectedQuery query = queryItem.getQuery();
				query.executeQuery();
			}
		}
	}

	/** The user pressed the "Delete" key */
	protected void handleDel() {
		final ISelection selection = getEditorSelection();
		if (selection instanceof ITreeSelection) {
			final ITreeSelection treeSelection = (ITreeSelection) selection;
			Iterator<?> iterator = treeSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof QueryItem) {
					QueryItem queryItem = (QueryItem) selectedElement;
					this.browserConfiguration.getSelectedQueriesManager().remove(
							queryItem.getQuery());
				}
			}
		}
	}

	/**
	 * Set the initial font using saved user preferences, and add a listener to
	 * be notified of changes in the preferences
	 */
	private void setupInitialTreeFont() {
		setupPreferredFont();

		this.fontChangeListener = new IPropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent event) {
				if (event.getProperty().equals(JFaceResources.DIALOG_FONT)) {
					setupPreferredFont();
				}
			}
		};
		JFaceResources.getFontRegistry().addListener(this.fontChangeListener);
	}

	/** Set the user preferred font on the editor */
	private void setupPreferredFont() {
		FontDescriptor descriptor = FontDescriptor.createFrom(JFaceResources.getDialogFont());
		descriptor = descriptor.increaseHeight(this.browserConfiguration
				.getAppearanceConfiguration().getFontSizeDelta());
		final Font customFont = descriptor.createFont(Display.getDefault());
		descriptor = descriptor.setStyle(SWT.ITALIC);
		final Font customItalicFont = descriptor.createFont(Display.getDefault());
		this.browserConfiguration.getAppearanceConfiguration().setCustomFont(customFont);
		this.browserConfiguration.getAppearanceConfiguration()
				.setCustomItalicFont(customItalicFont);
		this.fTree.setFont(customFont);
		this.treeViewer.refresh();
		this.metaclassViewer.setFont(customFont);
		this.metaclassViewer.refresh();
	}

	protected Composite createTreeToolBar(final Composite parent) {
		final Composite treeToolBarComposite = new Composite(parent, SWT.WRAP);
		this.instancesToolBar = TreeToolBar.create(treeToolBarComposite, this);
		return treeToolBarComposite;
	}

	/**
	 * Register a listener to show the property view or execute a query when the
	 * tree is double-clicked
	 */
	private void registerShowPropertyViewOnDblClick(final Tree tree) {
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(final MouseEvent event) {
				boolean handled = false;
				if (event.button == 1) {
					TreeItem[] selection = tree.getSelection();
					for (TreeItem treeItem : selection) {
						Object element = treeItem.getData();
						if (element instanceof QueryItem) {
							QueryItem queryItem = (QueryItem) element;
							SelectedQuery query = queryItem.getQuery();
							query.executeQuery();
							handled = true;
						}

						// If the user has activated the code synchronization
						if (EcoreBrowser.this.browserConfiguration.getAppearanceConfiguration()
								.isSynchronizeSourceCode()) {
							EObject eObject = (EObject) Platform.getAdapterManager().getAdapter(
									element, EObject.class);

							IStatusLineManager statusLineManager = getActionBars()
									.getStatusLineManager();

							if (eObject != null) {
								// Look for an extension declaring the
								// doubleClickListener extension point
								IExtensionRegistry registry = Platform.getExtensionRegistry();
								IExtensionPoint extPointDblClick = registry
										.getExtensionPoint("org.eclipse.modisco.infra.browser.doubleClickListener"); //$NON-NLS-1$

								if (extPointDblClick != null) {
									for (IExtension ext : extPointDblClick.getExtensions()) {
										for (IConfigurationElement configElt : ext
												.getConfigurationElements()) {
											String classAttribute = configElt.getAttribute("class"); //$NON-NLS-1$
											if (classAttribute != null) {
												try {
													DoubleClickListener listener = (DoubleClickListener) configElt
															.createExecutableExtension("class"); //$NON-NLS-1$
													// Synchronize this eObject
													// with its source code
													listener.synchronizeEObject(eObject,
															statusLineManager);
												} catch (CoreException e) {
													MoDiscoLogger.logError(e,
															MoDiscoBrowserPlugin.getPlugin());
												} finally {
													handled = true;
												}
											}
										}
									}
								} else {
									if (statusLineManager != null) {
										statusLineManager
												.setErrorMessage(Messages.EcoreBrowser_noSynchronisationExtensionFound);
									} else {
										MoDiscoLogger
												.logWarning(
														Messages.EcoreBrowser_noSynchronisationExtensionFound,
														MoDiscoBrowserPlugin.getPlugin());
									}

								}
							}
						}

					}
					if (!handled) {
						openPropertiesView();
					}
				}
			}
		});
	}

	public boolean isSynchronizeSourceCode() {
		return this.browserConfiguration.getAppearanceConfiguration().isSynchronizeSourceCode();
	}

	public void setSynchronizeSourceCode(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setSynchronizeSourceCode(value);
		internalRefreshTree();
	}

	/**
	 * Create the search panel, containing a label and search field.
	 *
	 * @param parent
	 *            the parent composite, which must have a GridLayout
	 */
	protected void createSearchPanel(final Composite parent) {
		final Composite searchPanel = new Composite(parent, SWT.NONE);
		searchPanel.setLayout(new GridLayout());

		searchPanel.setLayout(new FillLayout());
		final GridData searchPanelGridData = new GridData();
		searchPanelGridData.grabExcessHorizontalSpace = true;
		searchPanelGridData.horizontalAlignment = SWT.FILL;
		searchPanel.setLayoutData(searchPanelGridData);

		// Label searchLabel = new Label(searchPanel, SWT.NONE);
		// searchLabel.setText("&Search:");

		this.searchBox = new Text(searchPanel, SWT.SEARCH);
		this.searchBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent e) {
				if (e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR) {
					// ENTER: start a search
					search();
				} else if (e.keyCode == SWT.ESC) {
					// ESCAPE: restore the view after a search
					EcoreBrowser.this.searchBox.setText(""); //$NON-NLS-1$
					search();
				}
			}
		});

		this.searchBox.setMessage(Messages.EcoreBrowser_typeFilterText);
		this.searchBox.setData("org.eclipse.swtbot.widget.key", "EcoreBrowser.searchBox"); //$NON-NLS-1$//$NON-NLS-2$
		fixClipboardCommands(this.searchBox);
	}

	/**
	 * Called when the user initiates a search. Find the list of all the
	 * instances of the selected metaclass that have a name containing the
	 * search string (entered by the user in the search box), in a case
	 * insensitive way. Set this list as input of the tree viewer.
	 * <p>
	 * Do the search in a Job that can be canceled by the user.
	 * <p>
	 * If the search box is empty, then restore the previous tree viewer input.
	 */
	protected void search() {
		final String searchText = this.searchBox.getText().toLowerCase();

		if (searchText.trim().length() == 0) {
			if (this.savedInput != null && this.savedInput != this.treeViewer.getInput()) {
				this.treeViewer.setInput(this.savedInput);
			}
			return;
		}

		final List<EClass> selectedMetaclasses = findSelectedEClasses();
		if (selectedMetaclasses.isEmpty()) {
			return;
		}

		this.searchJob = new Job(Messages.EcoreBrowser_jobName_SearchInModelEditor) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				final ResourceSet resourceSet = EcoreBrowser.this.fResourceSet;
				final EList<Resource> resources = resourceSet.getResources();
				if (resources.size() < 1) {
					return Status.OK_STATUS;
				}

				// the search results : will become the input of the tree viewer
				final SearchResults searchResults = new SearchResults(
						EcoreBrowser.this.browserConfiguration);

				InstancesForMetaclasses instancesForMetaclasses = EcoreBrowser.this.browserConfiguration
						.getInstancesForMetaclasses();
				for (EClass eClass : selectedMetaclasses) {
					ArrayList<EObject> elements = instancesForMetaclasses.getInstancesForMetaclass(
							eClass).getElements();
					for (EObject eObject : elements) {
						final ModelElementItem modelElementItem = new ModelElementItemEx(eObject,
								null, EcoreBrowser.this.browserConfiguration);
						final String objectText = modelElementItem.getName().toLowerCase();
						if (objectText.contains(searchText)) {
							searchResults.add(eObject);
						}
						// if the user canceled the search
						if (monitor.isCanceled()) {
							return Status.CANCEL_STATUS;
						}
					}
				}

				// do only the minimum amount of work in the UI thread
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						// do not try to restore selection
						EcoreBrowser.this.treeViewer.setSelection(null);
						EcoreBrowser.this.treeViewer.setInput(searchResults);
					}
				});
				return Status.OK_STATUS;
			}
		};
		this.searchJob.setUser(true);
		this.searchJob.setPriority(Job.LONG);
		this.searchJob.schedule();
	}

	/**
	 * @return the {@link EClass}es corresponding to the metaclasses selected in
	 *         the metaclass list (empty list if none)
	 */
	private List<EClass> findSelectedEClasses() {

		final ArrayList<EClass> selectedMetaclasses = new ArrayList<EClass>();

		final ISelection selection = this.metaclassViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			final Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				final Object element = iterator.next();
				if (element instanceof EClass) {
					final EClass eClass = (EClass) element;
					addMetaclassToSelection(eClass, selectedMetaclasses, this.browserConfiguration
							.getAppearanceConfiguration().isDisplayInstancesOfSubclasses());
				}
			}
		}
		return selectedMetaclasses;
	}

	/**
	 * Adds the given metaclass to the given selection.
	 *
	 * @param addSubclasses
	 *            also adds subclasses
	 */
	private void addMetaclassToSelection(final EClass eClass,
			final ArrayList<EClass> selectedMetaclasses, final boolean addSubclasses) {
		selectedMetaclasses.add(eClass);
		// add subclasses recursively
		if (addSubclasses) {
			InstancesForMetaclasses instancesForMetaclasses = this.browserConfiguration
					.getInstancesForMetaclasses();
			InstancesForMetaclass instancesForMetaclass = instancesForMetaclasses
					.getInstancesForMetaclass(eClass);
			if (instancesForMetaclass != null) {
				InstancesForMetaclass[] subclasses = instancesForMetaclass.getSubclasses();
				for (InstancesForMetaclass subclass : subclasses) {
					addMetaclassToSelection(subclass.getEClass(), selectedMetaclasses,
							addSubclasses);
				}
			} else {
				MoDiscoLogger.logError("Could not find subclasses of '" + eClass.getName() + "'", //$NON-NLS-1$ //$NON-NLS-2$
						MoDiscoBrowserPlugin.getPlugin());
			}

		}
	}

	/**
	 * Listen to selection changes in the metaclass list viewer, and update the
	 * tree viewer accordingly.
	 */
	private final class MetaclassListViewerSelectionChangedListener implements
			ISelectionChangedListener {

		/** Memorize the tree selection for each metaclass */
		private final HashMap<EClass, ITreeSelection> selections = new HashMap<EClass, ITreeSelection>();
		/** The metaclass that was selected before the selection changed */
		private EClass lastSelectedMetaclass = null;

		/**
		 * Get the selected entries corresponding to the given selection in the
		 * metaclass viewer (may be empty)
		 */
		private InstancesForMetaclass[] getEntriesForSelection(final ISelection selection) {
			final ArrayList<InstancesForMetaclass> instancesForMetaclasses = new ArrayList<InstancesForMetaclass>();

			if (selection instanceof IStructuredSelection) {
				final IStructuredSelection structuredSelection = (IStructuredSelection) selection;

				for (final Iterator<?> iterator = structuredSelection.iterator(); iterator
						.hasNext();) {
					final Object element = iterator.next();
					if (element instanceof InstancesForMetaclass) {
						final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
						instancesForMetaclasses.add(instancesForMetaclass);
					}
				}
			}

			return instancesForMetaclasses
					.toArray(new InstancesForMetaclass[instancesForMetaclasses.size()]);
		}

		/**
		 * Updates the tree viewer when the selection changes in the metaclass
		 * viewer. Keeps track of the tree selection for each metaclass, and
		 * restores it when possible.
		 */
		public void selectionChanged(final SelectionChangedEvent event) {

			// save the selection
			if (this.lastSelectedMetaclass != null) {
				this.selections.put(this.lastSelectedMetaclass,
						(ITreeSelection) EcoreBrowser.this.treeViewer.getSelection());
			}

			final ISelection metaclassSelection = event.getSelection();
			final InstancesForMetaclass[] entries = getEntriesForSelection(metaclassSelection);

			ITreeSelection savedSelection = null;
			Object input = null;
			if (entries.length > 0) {
				savedSelection = this.selections.get(entries[0].getEClass());

				final EClass[] selectedMetaclasses = new EClass[entries.length];
				int i = 0;
				for (final InstancesForMetaclass entry : entries) {
					selectedMetaclasses[i++] = entry.getEClass();
				}

				input = new MetaclassList(EcoreBrowser.this.browserConfiguration,
						selectedMetaclasses);
				this.lastSelectedMetaclass = entries[0].getEClass();
			} else {
				this.lastSelectedMetaclass = null;
			}

			try {
				// speedup and avoid flickering
				EcoreBrowser.this.treeViewer.getTree().setRedraw(false);

				if (EcoreBrowser.this.searchBox != null) {
					EcoreBrowser.this.searchBox.setText(""); //$NON-NLS-1$
				}

				// do not restore selection twice
				EcoreBrowser.this.treeViewer.setSelection(null);

				// set the list of model elements as the input of the treeview
				EcoreBrowser.this.treeViewer.setInput(input);
				EcoreBrowser.this.savedInput = input;
				EcoreBrowser.this.treeViewer.setSelection(savedSelection, true);
			} finally {
				EcoreBrowser.this.treeViewer.getTree().setRedraw(true);
			}

			markNavigationLocation();
		}
	}

	public void setShowEmptyLinks(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowEmptyLinks(value);
		internalRefreshTree();
	}

	public boolean isShowEmptyLinks() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowEmptyLinks();
	}

	public void setSortInstances(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setSortInstances(value);
		internalRefreshTree();
	}

	public boolean isSortInstances() {
		return this.browserConfiguration.getAppearanceConfiguration().isSortInstances();
	}

	public void setShowDerivedLinks(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowDerivedLinks(value);
		internalRefreshTree();
	}

	public boolean isShowDerivedLinks() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowDerivedLinks();
	}

	public void setShowFullQualifiedNames(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowFullQualifiedNames(value);
		internalRefreshTree();
		this.metaclassViewer.refresh();
	}

	public boolean isShowFullQualifiedNames() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowFullQualifiedNames();
	}

	public void setShowMultiplicity(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowMultiplicity(value);
		internalRefreshTree();
	}

	public boolean isShowMultiplicity() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowMultiplicity();
	}

	public void setShowOppositeLinks(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowOppositeLinks(value);
		internalRefreshTree();
	}

	public boolean isShowOppositeLinks() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowOppositeLinks();
	}

	public void setShowContainer(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowContainer(value);
		internalRefreshTree();
	}

	public boolean isShowContainer() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowContainer();
	}

	public void setSortLinks(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setSortLinks(value);
		internalRefreshTree();
	}

	public boolean isSortLinks() {
		return this.browserConfiguration.getAppearanceConfiguration().isSortLinks();
	}

	public void setSortLinksByType(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setSortLinksByType(value);
		internalRefreshTree();
	}

	public boolean isSortLinksByType() {
		return this.browserConfiguration.getAppearanceConfiguration().isSortLinksByType();
	}

	public void setShowAttributes(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowAttributes(value);
		internalRefreshTree();
	}

	public boolean isShowAttributes() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowAttributes();
	}

	public void setShowEmptyAttributes(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowEmptyAttributes(value);
		internalRefreshTree();
	}

	public boolean isShowEmptyAttributes() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowEmptyAttributes();
	}

	public void setFontSizeDelta(final int value) {
		this.browserConfiguration.getAppearanceConfiguration().setFontSizeDelta(value);
		setupPreferredFont();
	}

	public int getFontSizeDelta() {
		return this.browserConfiguration.getAppearanceConfiguration().getFontSizeDelta();
	}

	public void setShowOrdering(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowOrdering(value);
		internalRefreshTree();
	}

	public boolean isShowOrdering() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowOrdering();
	}

	public void setShowTypeOfLinks(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowTypeOfLinks(value);
		internalRefreshTree();
	}

	public boolean isShowTypeOfLinks() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowTypeOfLinks();
	}

	public void setShowElementIDs(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowElementIDs(value);
		internalRefreshTree();
	}

	public boolean isShowElementIDs() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowElementIDs();
	}

	public void setShowURI(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowURI(value);
		internalRefreshTree();
	}

	public boolean isShowURI() {
		return this.browserConfiguration.getAppearanceConfiguration().isShowURI();
	}

	public void showOnlyInstancesPanel() {
		this.sashForm.setSashWidth(0);
		this.sashForm.setWeights(new int[] { 0, 1 });
	}

	public void showOnlyTypesPanel() {
		this.sashForm.setSashWidth(0);
		this.sashForm.setWeights(new int[] { 1, 0 });
	}

	public void showBothPanels() {
		this.sashForm.setSashWidth(EcoreBrowser.SASH_WIDTH);
		this.sashForm.setWeights(new int[] { EcoreBrowser.LEFT_PANE_SASH_WEIGHT,
				EcoreBrowser.RIGHT_PANE_SASH_WEIGHT });
	}

	/** This is how the framework determines which interfaces we implement. */
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(final Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			// Store the propertySheetPage to be able to call dispose() on it.
			if (this.propertySheetPage == null) {
				this.propertySheetPage = getPropertySheetPage();
			}
			return getPropertySheetPage();
		}
		return super.getAdapter(key);
	}

	/** This accesses a cached version of the property sheet page. */
	public IPropertySheetPage getPropertySheetPage() {
		if (this.propertySheetPage == null) {
			this.propertySheetPage = new ExtendedPropertySheetPage(this.editingDomain) {
				@Override
				public void setSelectionToViewer(final List<?> selection) {
					EcoreBrowser.this.setSelectionToViewer(selection);
					EcoreBrowser.this.setFocus();
				}

				@Override
				public void setActionBars(final IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this, actionBars);
				}

				@Override
				public void selectionChanged(final IWorkbenchPart part, final ISelection selection0) {
					ISelection selection = EcoreBrowser.this.getEditorSelection();

					boolean selectionNotified = false;
					if (selection instanceof IStructuredSelection) {
						if (((IStructuredSelection) selection).toArray().length == 1) {
							Object objSelected = ((IStructuredSelection) selection)
									.getFirstElement();
							if (objSelected instanceof ModelElementItem) {
								ModelElementItem modelElementItem = (ModelElementItem) objSelected;
								super.selectionChanged(part, new StructuredSelection(
										modelElementItem.getEObject()));
								selectionNotified = true;
							} else if (objSelected instanceof AttributeItem) {
								super.selectionChanged(part, new StructuredSelection(
										((AttributeItem) objSelected).getAttribute()));
								selectionNotified = true;
							} else if (objSelected instanceof LinkItem) {
								super.selectionChanged(part, new StructuredSelection(
										((LinkItem) objSelected).getReference()));
								selectionNotified = true;
							}
						}
					}
					if (!selectionNotified) {
						super.selectionChanged(part, StructuredSelection.EMPTY);
					}
				}
			};
			if (this.propertySheetPage instanceof PropertySheetPage) {
				((PropertySheetPage) this.propertySheetPage)
						.setPropertySourceProvider(new AdapterFactoryContentProvider(
								this.adapterFactoryWithRegistry) {
							@Override
							protected IPropertySource createPropertySource(final Object object,
									final IItemPropertySource itemPropertySource) {
								return new PropertySource(object, itemPropertySource) {
									@Override
									protected IPropertyDescriptor createPropertyDescriptor(
											final IItemPropertyDescriptor itemPropertyDescriptor) {
										return new PropertyDescriptor(this.object,
												itemPropertyDescriptor);
									}
								};
							}
						});
			}
		}
		return this.propertySheetPage;
	}

	@Override
	public boolean isDirty() {
		if (isReadOnly()) {
			return false;
		}
		return ((BasicCommandStack) this.editingDomain.getCommandStack()).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link org.eclipse.ui.IEditorPart} : saves the
	 * model file.
	 */
	@Override
	public void doSave(final IProgressMonitor progressMonitor) {
		if (isReadOnly()) {
			return;
		}

		// Save only resources that have actually changed.
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		// Do the work within an operation because this is a long running
		// activity that modifies the workbench.
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			// This is the method that gets invoked when the operation runs.
			@Override
			public void execute(final IProgressMonitor monitor) {
				// Save the resources to the file system.
				boolean first = true;
				for (Resource resource : EcoreBrowser.this.editingDomain.getResourceSet()
						.getResources()) {
					// see Bug 311005 - UnknownServiceException when trying to
					// save a UML model
					synchronized (resource) {
						URI uri = resource.getURI();
						if ((first || !resource.getContents().isEmpty() || isPersisted(resource))
								&& !EcoreBrowser.this.editingDomain.isReadOnly(resource)
								&& uri != null && (uri.isPlatformResource() || uri.isFile())) {
							try {
								long timeStamp = resource.getTimeStamp();
								resource.save(saveOptions);
								if (resource.getTimeStamp() != timeStamp) {
									EcoreBrowser.this.savedResources.add(resource);
								}
							} catch (final Exception e) {
								MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
								DialogUtils.openErrorDialog(getSite().getShell(), e,
										Messages.EcoreBrowser_errorSavingResource);
								EcoreBrowser.this.resourceToDiagnosticMap.put(resource,
										analyzeResourceProblems(resource, e));
							}
							first = false;
						}
					}
				}
			}
		};

		this.updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			((BasicCommandStack) this.editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			// Something went wrong that shouldn't.
			MoDiscoBrowserPlugin.getPlugin().log(exception);
		}
		this.updateProblemIndication = true;
		updateProblemIndication();
	}

	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true),
						new FileEditorInput(file));
			}
		}
	}

	protected void doSaveAs(final URI uri, final IEditorInput editorInput) {
		this.editingDomain.getResourceSet().getResources().get(0).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor;
		IStatusLineManager statusLineManager = getActionBars().getStatusLineManager();
		if (statusLineManager != null) {
			progressMonitor = statusLineManager.getProgressMonitor();
		} else {
			progressMonitor = new NullProgressMonitor();
		}
		doSave(progressMonitor);
	}

	@Override
	public boolean isSaveAsAllowed() {
		return !isReadOnly();
	}

	/**
	 * This returns whether something has been persisted to the URI of the
	 * specified resource. The implementation uses the URI converter from the
	 * editor's resource set to try to open an input stream.
	 */
	protected boolean isPersisted(final Resource resource) {
		boolean result = false;
		try {
			InputStream stream = this.editingDomain.getResourceSet().getURIConverter()
					.createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {
			result = false;
		}
		return result;
	}

	/**
	 * This is called during startup to initialize the editor with its site and
	 * input.
	 */
	@Override
	public void init(final IEditorSite site, final IEditorInput editorInput) {
		// TODO: check input is of expected type
		try {
			setSite(site);
			setInputWithNotify(editorInput);
			setPartName(editorInput.getName());
			site.setSelectionProvider(this);
			site.getPage().addPartListener(this.partListener);
			ResourcesPlugin.getWorkspace().addResourceChangeListener(this.resourceChangeListener,
					IResourceChangeEvent.POST_CHANGE);
		} catch (final Exception e) {
			MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
		}
	}

	/** Focus the tree viewer when the editor is focused */
	@Override
	public void setFocus() {
		// Done in setFocus because we don't want the job to start until the
		// editor is visible. Otherwise it still hangs the UI.
		if (this.openModelJob == null) {
			this.openModelJob = new Job(Messages.EcoreBrowser_jobOpeningModelInMoDiscoBrowser) {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					boolean result = backgroundOpenModel(monitor);
					EcoreBrowser.this.loaded = result;
					if (result) {
						return Status.OK_STATUS;
					}
					return Status.CANCEL_STATUS;
				}
			};
			this.openModelJob.setPriority(Job.LONG);
			getProgressService().schedule(this.openModelJob);
		} else if (this.treeViewer != null) {
			this.treeViewer.getTree().setFocus();
		}
	}

	/** This implements {@link org.eclipse.jface.viewers.ISelectionProvider}. */
	public void addSelectionChangedListener(final ISelectionChangedListener listener) {
		this.selectionChangedListeners.add(listener);
	}

	/** This implements {@link org.eclipse.jface.viewers.ISelectionProvider}. */
	public void removeSelectionChangedListener(final ISelectionChangedListener listener) {
		this.selectionChangedListeners.remove(listener);
	}

	/**
	 * Returns the "unwrapped" selection of the editor, with Ecore elements
	 * instead of the proxies used internally
	 */
	public ISelection getSelection() {
		return BrowserUtils.unwrapSelection(this.editorSelection);
	}

	/** @return the "real" selection, with proxy objects (ModelElementItem, etc.) */
	public ISelection getEditorSelection() {
		return this.editorSelection;
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to
	 * set this editor's overall selection. Calling this result will notify the
	 * listeners.
	 */
	public void setSelection(final ISelection selection) {
		this.editorSelection = selection;

		for (final ISelectionChangedListener listener : this.selectionChangedListeners) {
			// depending on the listener type, unwrap the selection
			if (listener instanceof IBrowserSelectionChangedListener) {
				// expose the proxy objects
				listener.selectionChanged(new SelectionChangedEvent(this, selection));
			} else {
				// expose the underlying Ecore elements
				listener.selectionChanged(new SelectionChangedEvent(this, BrowserUtils
						.unwrapSelection(selection)));
			}
		}
		setStatusLineMessage(selection);
	}

	/** Connect the given viewer to the editor's selection */
	private void hookViewerToSelection(final Viewer viewer) {
		if (viewer == null) {
			return;
		}

		if (this.selectionChangedListener == null) {
			// Create the listener on demand
			this.selectionChangedListener = new ISelectionChangedListener() {
				// This just notifies those things that are affected by the
				// selection
				public void selectionChanged(final SelectionChangedEvent selectionChangedEvent) {
					setSelection(selectionChangedEvent.getSelection());
				}
			};
		}

		viewer.addSelectionChangedListener(this.selectionChangedListener);

		// Set the editor's selection based on the viewer's selection
		setSelection(viewer.getSelection());
	}

	/** Set the status line message depending on the given selection */
	public void setStatusLineMessage(final ISelection selection) {
		// TODO: maybe display more useful information?
		final IStatusLineManager statusLineManager = getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				final Collection<?> collection = ((IStructuredSelection) selection).toList();
				switch (collection.size()) {
				case 0:
					statusLineManager.setMessage(Messages.EcoreBrowser_noObjectSelected);
					break;
				case 1:
					final Object object = collection.iterator().next();
					if (object instanceof ITreeElement) {
						final ITreeElement treeElement = (ITreeElement) object;
						statusLineManager.setMessage(NLS.bind(
								Messages.EcoreBrowser_singleObjectSelected, treeElement.getText()));
					}
					break;
				default:
					statusLineManager.setMessage(NLS.bind(
							Messages.EcoreBrowser_multiObjectSelected,
							Integer.toString(collection.size())));
					break;
				}
			} else {
				statusLineManager.setMessage(""); //$NON-NLS-1$
			}
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help
	 * fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(final IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	public BrowserActionBarContributor getActionBarContributor() {
		return (BrowserActionBarContributor) getEditorSite().getActionBarContributor();
	}

	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/** Clean up */
	@Override
	public void dispose() {
		stopOpeningModel();

		this.disposing = true;
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this.resourceChangeListener);
		getSite().getPage().removePartListener(this.partListener);

		this.adapterFactoryWithRegistry.dispose();
		this.sashForm.dispose();

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		if (this.propertySheetPage != null) {
			this.propertySheetPage.dispose();
		}

		if (this.treeViewer != null && this.selectionChangedListener != null) {
			this.treeViewer.removeSelectionChangedListener(this.selectionChangedListener);
			this.selectionChangedListener = null;
		}

		// dispose fonts
		this.browserConfiguration.getAppearanceConfiguration().setCustomFont(null);
		this.browserConfiguration.getAppearanceConfiguration().setCustomItalicFont(null);

		// avoid leaking editor
		this.browserConfiguration.dispose();

		JFaceResources.getFontRegistry().removeListener(this.fontChangeListener);

		this.customTreePainter.dispose();
		// dispose the customization engine, which removes listeners too
		this.browserConfiguration.getAppearanceConfiguration().getCustomizationEngine().dispose();
		this.fCustomizationEngineChangeListener = null;

		FacetSetCatalog.getSingleton().removeChangeListener(this.fFacetsChangeListener);

		this.fFormToolkit.dispose();

		// avoid memory leak for EMF registry resources since a new
		// adapter is created each time the same resource is opened
		// in a different editor
		Set<Resource> browsedResources = this.browserConfiguration.getBrowsedResources();
		if (browsedResources != null) {
			for (Resource resource : browsedResources) {
				ListIterator<Adapter> listIterator = resource.eAdapters().listIterator();
				while (listIterator.hasNext()) {
					Adapter adapter = listIterator.next();
					if (adapter instanceof MetaclassInstancesAdapterWithFacet) {
						MetaclassInstancesAdapterWithFacet adapterWithFacet = (MetaclassInstancesAdapterWithFacet) adapter;
						if (adapterWithFacet.getFacetContext() == getBrowserConfiguration()
								.getAppearanceConfiguration().getFacetContext()) {
							listIterator.remove();
						}
					}
				}
			}
		}
		// let the FacetContext be GCed
		MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(null);

		// if (!isReadOnly()) {
		// // unload all resources
		// final EList<Resource> resources = this.fResourceSet.getResources();
		// final Job cleanupJob = new
		// Job(Messages.EcoreBrowser_jobName_UnloadResources) {
		// @Override
		// protected IStatus run(final IProgressMonitor monitor) {
		// for (final Resource resource : resources) {
		// resource.unload();
		// }
		// return Status.OK_STATUS;
		// }
		// };
		// cleanupJob.setPriority(Job.DECORATE);
		// cleanupJob.setSystem(true);
		// cleanupJob.schedule();
		// }

		super.dispose();
	}

	@SuppressWarnings("deprecation")
	private void stopOpeningModel() {
		if (this.openModelJob != null && this.openModelJob.getState() == Job.RUNNING) {
			this.openModelJob.cancel();
			Thread thread = this.openModelJob.getThread();
			if (thread != null) {
				thread.stop();
			}
		}
	}

	/** Open the selected element in the list of elements of the same metaclass */
	public void browse() {
		final ISelection selection = getEditorSelection();
		if (selection instanceof ITreeSelection) {
			final ITreeSelection treeSelection = (ITreeSelection) selection;
			final Object selectedElement = treeSelection.getFirstElement();
			if (selectedElement instanceof ModelElementItem) {
				final ModelElementItem modelElementItem = (ModelElementItem) selectedElement;
				browseTo(modelElementItem);
			}
		}
	}

	/** Open the given element in the list of elements of the same metaclass */
	public void browseTo(final ModelElementItem modelElementItem) {
		final EObject modelElement = modelElementItem.getEObject();
		browseTo(modelElement);
	}

	/** Open the given element in the list of elements of the same metaclass */
	public void browseTo(final EObject modelElement) {
		browseTo(modelElement, modelElement.eClass());
	}

	/**
	 * Open the given element in the list of elements of the given metaclass
	 * (which can be a Facet).
	 */
	public void browseTo(final EObject modelElement, final EClass eClass) {
		markNavigationLocation();
		// Select the metaclass in the metaclass list viewer
		this.metaclassViewer.selectMetaclass(eClass);

		TreePath treePath = findTreePathForElement(modelElement);
		if (treePath != null) {
			// deselect any previously selected elements
			this.treeViewer.setSelection(null);
			this.treeViewer.setSelection(new TreeSelection(treePath), true);
			if (this.treeViewer.getSelection().isEmpty()) {
				delayedBrowseTo(modelElement);
			} else {
				markNavigationLocation();
			}
		} else {
			delayedBrowseTo(modelElement);
		}
	}

	/**
	 * delayed because the browser doesn't always update synchronously
	 * (temporary "loading..." nodes)
	 */
	private void delayedBrowseTo(final EObject modelElement) {
		Listener refreshListener = new Listener() {
			public void handleEvent(final Event event) {
				removeRefreshListener(this);
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						TreePath treePath2 = findTreePathForElement(modelElement);
						EcoreBrowser.this.treeViewer.setSelection(null);
						EcoreBrowser.this.treeViewer.setSelection(new TreeSelection(treePath2),
								true);
						markNavigationLocation();
					}
				});
			}
		};
		addRefreshListener(refreshListener);
	}

	public boolean browseToByURI(final String uriFragment) {
		EObject eObject = EMFUtil.findElementByURI(uriFragment, this.fResourceSet);
		if (eObject != null) {
			browseTo(eObject);
			return true;
		}
		return false;
	}

	/**
	 * Finds the path of the given element in the tree viewer. The element is
	 * looked for at the root and under BigListItemProviders in the case the
	 * elements are split.
	 *
	 * @return the path or <code>null</code> if the element was not found
	 */
	private TreePath findTreePathForElement(final EObject eObject) {
		final Object input = this.treeViewer.getInput();
		if (input instanceof MetaclassList) {
			final MetaclassList metaclassListItemProvider = (MetaclassList) input;
			final Collection<?> elements = metaclassListItemProvider.getElements();
			for (final Object element : elements) {
				// if the elements are split
				if (element instanceof BigListItem) {
					final BigListItem bigListItemProvider = (BigListItem) element;
					final Collection<?> subElements = bigListItemProvider.getChildren();
					for (final Object subElement : subElements) {
						if (subElement instanceof ModelElementItem) {
							final ModelElementItem other = (ModelElementItem) subElement;
							if (other.getEObject().equals(eObject)) {
								return new TreePath(new Object[] { subElement });
							}
						}
					}
				}

				if (element instanceof ModelElementItem) {
					final ModelElementItem other = (ModelElementItem) element;
					if (other.getEObject().equals(eObject)) {
						return new TreePath(new Object[] { element });
					}
				}
			}
		}
		return null;
	}

	/** Implements {@link INavigationLocationProvider} */
	public INavigationLocation createEmptyNavigationLocation() {
		return new BrowserNavigationLocation(this);
	}

	/**
	 * Implements {@link INavigationLocationProvider}. Create a location that
	 * can be navigated back to, using the "back" button
	 */
	public INavigationLocation createNavigationLocation() {
		// navigation to the first element of the selection
		final EClass firstSelectedMetaclass = this.metaclassViewer.getFirstSelectedMetaclass();
		return new BrowserNavigationLocation(this, firstSelectedMetaclass,
				(ITreeSelection) this.treeViewer.getSelection());
	}

	/** Mark a location that can be navigated back to, using the "back" button */
	protected void markNavigationLocation() {
		getSite().getPage().getNavigationHistory().markLocation(this);
	}

	/**
	 * Restore a location (used for implementing history).
	 *
	 * @param eClass
	 *            the metaclass viewer's selection
	 * @param selection
	 *            the tree viewer's selection
	 */
	public void restoreLocation(final EClass eClass, final ITreeSelection selection) {
		this.metaclassViewer.selectMetaclass(eClass);
		this.treeViewer.setSelection(selection);
	}

	private final List<Listener> refreshListeners = new ArrayList<Listener>();

	public void addRefreshListener(final Listener refreshListener) {
		if (!this.refreshListeners.contains(refreshListener)) {
			this.refreshListeners.add(refreshListener);
		}
	}

	public void removeRefreshListener(final Listener refreshListener) {
		this.refreshListeners.remove(refreshListener);
	}

	public void notifyRefresh() {
		for (Listener listener : new ArrayList<Listener>(this.refreshListeners)) {
			listener.handleEvent(new Event());
		}
	}

	/**
	 * Refresh the editor
	 *
	 * @param metaclassViewerToo
	 *            whether the metaclass view must be refreshed too, or only the
	 *            tree viewer
	 */
	public void refreshDelayed(final boolean metaclassViewerToo) {
		if (this.disposing) {
			return;
		}
		if (this.refreshJob == null) {
			this.refreshJob = new Job(Messages.EcoreBrowser_refreshingModelViewers) {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							internalRefreshTree();
							if (metaclassViewerToo) {
								getMetaclassViewer().refresh();
							}
							notifyRefresh();
						}
					});
					return Status.OK_STATUS;
				}
			};
		} else {
			/*
			 * If refreshTreeDelayed is called again before the job delay
			 * passed, then cancel the job and re-schedule a new one.
			 */
			this.refreshJob.cancel();
		}
		// we don't want to keep refreshing while computing children,
		// because it slows down the computation
		if (this.fContentProvider.isComputing()) {
			final int delay = 100;
			this.refreshJob.setPriority(Job.DECORATE);
			this.refreshJob.schedule(delay);
		} else {
			this.refreshJob.setPriority(Job.INTERACTIVE);
			this.refreshJob.schedule();
		}
	}

	public void clearInstancesCache() {
		AppearanceConfiguration appearanceConfiguration = this.browserConfiguration
				.getAppearanceConfiguration();
		MetaclassInstancesAdapterFactoryWithFacet.getInstance().setFacetContext(
				appearanceConfiguration.getFacetContext());
		Set<Resource> browsedResources = this.browserConfiguration.getBrowsedResources();
		if (browsedResources != null) {
			for (Resource resource : browsedResources) {
				MetaclassInstances instances = (MetaclassInstances) MetaclassInstancesAdapterFactoryWithFacet
						.getInstance().adapt(resource, MetaclassInstances.class);
				instances.clearCache();
			}
		}
	}

	private void internalRefreshTree() {
		if (!this.treeViewer.getTree().isDisposed()) {
			try {
				this.treeViewer.getTree().setRedraw(false);
				this.treeViewer.refresh();
			} finally {
				this.treeViewer.getTree().setRedraw(true);
			}
		}
	}

	public BrowserConfiguration getBrowserConfiguration() {
		return this.browserConfiguration;
	}

	private void openPropertiesView() {
		try {
			getEditorSite().getPage().showView(EcoreBrowser.PROPERTY_VIEW_ID);
		} catch (final PartInitException e) {
			MoDiscoBrowserPlugin.logException(e);
		}
	}

	public ResourceSet getResourceSet() {
		return this.fResourceSet;
		// return getEditingDomain().getResourceSet();
	}

	public void loadCustomizations(final Collection<MetamodelView> customizationsToLoad) {
		final CustomizationEngine customizationEngine = this.browserConfiguration
				.getAppearanceConfiguration().getCustomizationEngine();

		if (this.fCustomizationEngineChangeListener == null) {
			this.fCustomizationEngineChangeListener = new ChangeListener() {
				public void changed() {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							refreshDelayed(true);
						}
					});
				}
			};
			customizationEngine.addChangeListener(this.fCustomizationEngineChangeListener);
		}

		customizationEngine.clear();
		for (final MetamodelView customizationToLoad : customizationsToLoad) {
			customizationEngine.registerCustomization(customizationToLoad);
		}
		customizationEngine.loadCustomizations();
	}

	private void loadDefaultCustomizations() {
		Collection<MetamodelView> customizations = CustomizationsCatalog.filterForMetamodel(
				CustomizationsCatalog.getInstance().getRegistryDefaultCustomizations(),
				getReferencedEPackages());
		if (customizations.size() > 0) {
			loadCustomizations(customizations);
		}
	}

	/** used by unit tests */
	protected TreeToolBar getInstancesToolBar() {
		return this.instancesToolBar;
	}

	protected void reloadOnFacetChange() {
		if (this.fFacetsChangeListener == null) {
			this.fFacetsChangeListener = new ModiscoCatalogChangeListener() {
				private void changed() {
					if (!EcoreBrowser.this.loaded) {
						return;
					}
					Job reloadFacetsJob = new Job(Messages.EcoreBrowser_ReloadingFacets) {
						@Override
						protected IStatus run(final IProgressMonitor monitor) {
							// reloading Facets by name, since the elements are
							// different after a FacetSet model reload
							List<String> facetsToReload = new ArrayList<String>();
							Collection<Facet> loadedFacets = getBrowserConfiguration()
									.getAppearanceConfiguration().getLoadedFacets();
							for (Facet facet : loadedFacets) {
								FacetSet facetSet = facet.getFacetSet();
								facetsToReload.add(facetSet.getName() + "#" + facet.getName()); //$NON-NLS-1$
							}
							getBrowserConfiguration().getAppearanceConfiguration().clearFacets();

							Collection<FacetSet> allFacetSets = FacetSetCatalog.getSingleton()
									.getAllFacetSets();

							for (FacetSet facetSet : allFacetSets) {
								EList<Facet> facets = facetSet.getFacets();
								for (Facet facet : facets) {
									for (String fullname : facetsToReload) {
										if (fullname.equals(facetSet.getName() + "#" //$NON-NLS-1$
												+ facet.getName())) {
											getBrowserConfiguration().getAppearanceConfiguration()
													.loadFacet(facet);
											break;
										}
									}
								}
							}
							// for modified facets
							getBrowserConfiguration().getInstancesForMetaclasses()
									.buildDerivationTree();
							return Status.OK_STATUS;
						}
					};
					reloadFacetsJob.setPriority(Job.DECORATE);
					reloadFacetsJob.schedule();
				}

				public void removed(final IFile file) {
					changed();
				}

				public void changed(final EObject eObject, final IFile file) {
					changed();
				}

				public void added(final EObject eObject, final IFile file) {
					changed();
				}
			};
			FacetSetCatalog.getSingleton().addChangeListener(this.fFacetsChangeListener);
		}
	}

	public void modelChanged() {
		getBrowserConfiguration().getAppearanceConfiguration().touch();
		refreshDelayed(true);
	}

	/**
	 * Handles activation of the editor or it's associated views.
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		if (this.editingDomain.getResourceToReadOnlyMap() != null) {
			this.editingDomain.getResourceToReadOnlyMap().clear();

			// Refresh any actions that may become enabled or disabled.
			setSelection(getEditorSelection());
		}

		if (!this.removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(EcoreBrowser.this, false);
			} else {
				this.removedResources.clear();
				this.changedResources.clear();
				this.savedResources.clear();
			}
		} else if (!this.changedResources.isEmpty()) {
			this.changedResources.removeAll(this.savedResources);
			handleChangedResources();
			this.changedResources.clear();
			this.savedResources.clear();
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded.
	 */
	protected boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(), Messages.UI_FileConflict_label,
				Messages.WARN_FileConflict);
	}

	/**
	 * Handles what to do with changed resources on activation.
	 */
	protected void handleChangedResources() {
		if (!this.changedResources.isEmpty() && (!isDirty() || handleDirtyConflict())) {
			if (isDirty()) {
				this.changedResources.addAll(this.editingDomain.getResourceSet().getResources());
			}
			this.editingDomain.getCommandStack().flush();

			this.updateProblemIndication = false;
			for (Resource resource : this.changedResources) {
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(Collections.EMPTY_MAP);
					} catch (IOException e) {
						final URI uri = resource.getURI();
						final String uristr = uri.toString();
						final String logMsg = String.format(
								"The MoDisco browser failed to reload the resource %s.", //$NON-NLS-1$
								uristr);
						Logger.logError(
								e, logMsg , MoDiscoBrowserPlugin.getPlugin());
						final String userMsg = String.format(
								"%s, cf. %s", //$NON-NLS-1$
								Messages.EcoreBrowser_errorLoadingResource,
								uristr);
						DialogUtils.openErrorDialog(getSite().getShell(), e,
								userMsg);
						if (!this.resourceToDiagnosticMap.containsKey(resource)) {
							this.resourceToDiagnosticMap.put(resource,
									analyzeResourceProblems(resource, e));
						}
					}
				}
			}

			if (AdapterFactoryEditingDomain.isStale(this.editorSelection)) {
				setSelection(StructuredSelection.EMPTY);
			}

			this.updateProblemIndication = true;
			updateProblemIndication();
		}
	}

	/**
	 * Updates the problems indication with the information described in the
	 * specified diagnostic.
	 */
	protected void updateProblemIndication() {
		if (this.updateProblemIndication) {
			BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK,
					MoDiscoBrowserPlugin.PLUGIN_ID, 0, null,
					new Object[] { this.editingDomain.getResourceSet() });
			int nWarnings = 0;
			int nErrors = 0;
			int nInfo = 0;

			for (Diagnostic childDiagnostic : this.resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
					if (childDiagnostic.getSeverity() == Diagnostic.WARNING) {
						nWarnings++;
					} else if (childDiagnostic.getSeverity() == Diagnostic.ERROR) {
						nErrors++;
					} else if (childDiagnostic.getSeverity() == Diagnostic.INFO) {
						nInfo++;
					}
				}
			}

			StringBuilder builder = new StringBuilder();

			if (nErrors == 1) {
				builder.append(NLS.bind(Messages.EcoreBrowser_error, nErrors));
			} else if (nErrors > 1) {
				builder.append(NLS.bind(Messages.EcoreBrowser_errors, nErrors));
			}

			if (nWarnings == 1) {
				if (builder.length() > 0) {
					builder.append(Messages.EcoreBrowser_separator);
				}
				builder.append(NLS.bind(Messages.EcoreBrowser_warning, nWarnings));
			} else if (nWarnings > 1) {
				if (builder.length() > 0) {
					builder.append(Messages.EcoreBrowser_separator);
				}
				builder.append(NLS.bind(Messages.EcoreBrowser_warnings, nWarnings));
			}

			if (nInfo == 1) {
				if (builder.length() > 0) {
					builder.append(Messages.EcoreBrowser_separator);
				}
				builder.append(NLS.bind(Messages.EcoreBrowser_info, nInfo));
			} else if (nInfo > 1) {
				if (builder.length() > 0) {
					builder.append(Messages.EcoreBrowser_separator);
				}
				builder.append(NLS.bind(Messages.EcoreBrowser_infos, nInfo));
			}

			if (!this.errorsButton.isDisposed()) {
				if (builder.length() > 0) {
					this.errorsButton.setText(builder.toString());
					this.errorsButton.setVisible(true);
				} else {
					this.errorsButton.setVisible(false);
				}

				final GridData errorsButtonGridData = new GridData();
				if (this.errorsButton.isVisible()) {
					this.errorsButton.setSize(this.errorsButton.computeSize(SWT.DEFAULT,
							SWT.DEFAULT));
					errorsButtonGridData.exclude = false;
				} else {
					errorsButtonGridData.exclude = true;
				}
				this.errorsButton.setLayoutData(errorsButtonGridData);
				this.errorsButton.getParent().layout();
			}

			this.fDiagnostic = diagnostic;

			if (this.markerHelper.hasMarkers(this.editingDomain.getResourceSet())) {
				this.markerHelper.deleteMarkers(this.editingDomain.getResourceSet());
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					try {
						this.markerHelper.createMarkers(diagnostic);
					} catch (CoreException exception) {
						MoDiscoBrowserPlugin.getPlugin().log(exception);
					}
				}
			}
		}
	}

	/**
	 * Returns a diagnostic describing the errors and warnings listed in the
	 * resource and the specified exception (if any).
	 */
	public Diagnostic analyzeResourceProblems(final Resource resource, final Exception exception) {
		if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty()) {
			Object errorData;
			if (exception == null) {
				errorData = resource;
			} else {
				errorData = exception;
			}
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR,
					MoDiscoBrowserPlugin.PLUGIN_ID, 0, NLS.bind(Messages.UI_ErrorFile_message,
							resource.getURI()), new Object[] { errorData });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		} else if (exception != null) {
			return new BasicDiagnostic(Diagnostic.ERROR, MoDiscoBrowserPlugin.PLUGIN_ID, 0,
					NLS.bind(Messages.UI_ErrorFile_message, resource.getURI()),
					new Object[] { exception });
		} else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	class BrowserAdapterFactory extends ComposedAdapterFactory implements IEditingDomainProvider {
		public BrowserAdapterFactory(final ComposedAdapterFactory.Descriptor.Registry registry) {
			super(registry);
		}

		public EditingDomain getEditingDomain() {
			return EcoreBrowser.this.getEditingDomain();
		}
	}

	/**
	 * This sets up the editing domain for the model editor
	 */
	protected void initializeEditingDomain() {
		if (this.fResourceSet == null) {
			initializeEditingDomain(new ResourceSetImpl());
		}
	}

	protected void initializeEditingDomain(final ResourceSet resourceSet) {
			// Create an adapter factory that yields item providers.
			this.adapterFactoryWithRegistry = new BrowserAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			this.adapterFactoryWithRegistry
					.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			this.adapterFactoryWithRegistry
					.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			final CommandStack commandStack = createCommandStack();
			// Create the editing domain with a special command stack.
			final BrowserEditingDomain newEditingDomain = new BrowserEditingDomain(
					this.adapterFactoryWithRegistry, commandStack, resourceSet, this);
			setEditingDomain(newEditingDomain);
	}

	private CommandStack createCommandStack() {
		// Create the command stack that will notify this editor as commands
		// are executed.
		CommandStack commandStack;
		if (isReadOnly()) {
			commandStack = new ReadOnlyCommandStack();
		} else {
			commandStack = new BasicCommandStack();
		}
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getParentComposite().getDisplay().asyncExec(new Runnable() {
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);
						// Try to select the affected objects.
						final Command mostRecentCommand = ((CommandStack) event.getSource())
								.getMostRecentCommand();
						if (mostRecentCommand != null) {
							// asyncExec is to make it happen after the
							// refresh
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									try {
										// avoid the view jumping around as
										// the selection changes
										// several times
										EcoreBrowser.this.treeViewer.getTree().setRedraw(false);
										selectAffectedElements(mostRecentCommand);
									} finally {
										EcoreBrowser.this.treeViewer.getTree().setRedraw(true);
									}
								}
							});
						}
						IPropertySheetPage page = EcoreBrowser.this.getPropertySheetPage();
						if (page != null && page.getControl() != null
								&& !page.getControl().isDisposed()) {
							if (page instanceof PropertySheetPage) {
								PropertySheetPage propertyPage = (PropertySheetPage) page;
								propertyPage.refresh();
							} else if (page instanceof TabbedPropertySheetPage) {
								TabbedPropertySheetPage tabbedPropertyPage = (TabbedPropertySheetPage) page;
								if (tabbedPropertyPage.getCurrentTab() != null) {
									tabbedPropertyPage.refresh();
								}
							}
						}
					}
				});
			}
		});
		return commandStack;
	}

	/** added for integration into Papyrus */
	protected void setEditingDomain(final AdapterFactoryEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	/** This is here for the listener to be able to call it. */
	@Override
	protected void firePropertyChange(final int action) {
		super.firePropertyChange(action);
	}

	/**
	 * Implements {@link IGotoMarker}. Select the EObject corresponding to the
	 * given marker
	 */
	public void gotoMarker(final IMarker marker) {
		try {
			if (marker.getType().equals(EValidator.MARKER)) {
				String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = this.fResourceSet.getEObject(uri, true);
					if (eObject != null) {
						browseTo(eObject);
					}
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
		}
	}

	public Composite getParentComposite() {
		return this.parentComposite;
	}

	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	public Collection<Resource> getSavedResources() {
		return this.savedResources;
	}

	public Collection<Resource> getChangedResources() {
		return this.changedResources;
	}

	public Collection<Resource> getRemovedResources() {
		return this.removedResources;
	}

	/**
	 * If <code>true</code>, prevent modification or save. For example, if the
	 * resource being viewed comes from the package registry, it must not be
	 * saved.
	 */
	public boolean isReadOnly() {
		return !(getEditorInput() instanceof FileEditorInput);
	}

	public TreeViewer getTreeViewer() {
		return this.treeViewer;
	}

	public void setStyleSashForm(final int styleSashForm) {
		this.styleSashForm = styleSashForm;
	}

	protected void selectAffectedElements(final Command command) {
		if (command instanceof DragAndDropOnLinkCommand) {
			DragAndDropOnLinkCommand dragAndDropOnLinkCommand = (DragAndDropOnLinkCommand) command;
			Command dropCommand = dragAndDropOnLinkCommand.getDropCommand();
			selectAffectedElements(dropCommand, null, dragAndDropOnLinkCommand.getLinkItem());
		} else if (command instanceof DragAndDropOnModelElementCommand) {
			DragAndDropOnModelElementCommand dragAndDropOnModelElementCommand = (DragAndDropOnModelElementCommand) command;
			Command dropCommand = dragAndDropOnModelElementCommand.getDropCommand();
			selectAffectedElements(dropCommand,
					dragAndDropOnModelElementCommand.getModelElementItem(), null);
		} else if (this.editingDomain instanceof BrowserEditingDomain) {
			BrowserEditingDomain browserEditingDomain = (BrowserEditingDomain) this.editingDomain;
			Object selectedElementForCommand = browserEditingDomain
					.getEditorSelectionForCommand(command);
			if (selectedElementForCommand instanceof ModelElementItem) {
				ModelElementItem selectedModelElementItem = (ModelElementItem) selectedElementForCommand;
				selectAffectedElements(command, selectedModelElementItem, null);
			} else if (selectedElementForCommand instanceof LinkItem) {
				LinkItem linkItem = (LinkItem) selectedElementForCommand;
				selectAffectedElements(command, (ModelElementItem) linkItem.getTreeParent(),
						linkItem);
			}
		}
	}

	private void selectAffectedElements(final Command command,
			final ModelElementItem contextModelElementItem, final LinkItem contextLinkItem) {
		if (command instanceof AddCommand) {
			AddCommand addCommand = (AddCommand) command;
			if (contextLinkItem != null) {
				boolean result = selectElements(contextLinkItem, addCommand.getCollection());
				if (!result) {
					setSelection(Collections.singletonList(contextLinkItem), true);
					this.treeViewer.expandToLevel(contextLinkItem, 1);
				}
			} else if (contextModelElementItem != null) {
				selectElements(contextModelElementItem, addCommand.getFeature(),
						addCommand.getCollection());
			} else {
				selectElements(addCommand.getOwner(), addCommand.getFeature(),
						addCommand.getCollection());
			}
		} else if (command instanceof SetCommand) {
			SetCommand setCommand = (SetCommand) command;
			if (contextModelElementItem != null) {
				boolean result = selectElements(contextModelElementItem, setCommand.getFeature(),
						Collections.singleton(setCommand.getValue()));
				if (!result) {
					ITreeElement treeParent = contextModelElementItem.getTreeParent();
					setSelection(Collections.singletonList(treeParent), true);
					this.treeViewer.expandToLevel(treeParent, 1);
				}
			} else {
				selectElements(setCommand.getOwner(), setCommand.getFeature(),
						Collections.singleton(setCommand.getValue()));
			}
		} else if (command instanceof CreateChildCommand) {
			CreateChildCommand createChildCommand = (CreateChildCommand) command;
			Command command2 = createChildCommand.getCommand();
			selectAffectedElements(command2, contextModelElementItem, contextLinkItem);
		} else if (command instanceof DeleteCommand) {
			DeleteCommand deleteCommand = (DeleteCommand) command;
			List<Command> commandList = deleteCommand.getCommandList();
			if (commandList.size() > 0) {
				selectAffectedElements(commandList.get(0), contextModelElementItem, contextLinkItem);
			}
		} else if (command instanceof RemoveCommand) {
			RemoveCommand removeCommand = (RemoveCommand) command;
			LinkItem linkItem = null;
			if (contextModelElementItem != null) {
				ITreeElement parent = contextModelElementItem.getTreeParent();
				if (parent instanceof LinkItem) {
					linkItem = (LinkItem) parent;
				} else if (parent instanceof ModelElementItem) {
					// ↑ possible with "collapse" customization
					ModelElementItem modelElementItem = (ModelElementItem) parent;
					setSelection(Collections.singletonList(modelElementItem), true);
					return;
				}
			}
			if (linkItem == null) {
				browseTo(removeCommand.getOwner());
				ModelElementItem modelElementItem = getSelectedModelElementItem();
				linkItem = getLink(modelElementItem, removeCommand.getFeature());
			}
			if (linkItem != null) {
				this.treeViewer.expandToLevel(linkItem, 1);
				setSelection(Collections.singletonList(linkItem), true);
			}
		} else if (command instanceof CompoundCommand) {
			CompoundCommand compoundCommand = (CompoundCommand) command;
			List<Command> commandList = compoundCommand.getCommandList();
			if (commandList.size() > 0) {
				selectAffectedElements(commandList.get(commandList.size() - 1),
						contextModelElementItem, contextLinkItem);
			}
		} else if (command instanceof CommandWrapper) {
			CommandWrapper commandWrapper = (CommandWrapper) command;
			selectAffectedElements(commandWrapper.getCommand(), contextModelElementItem,
					contextLinkItem);
		}

		// PasteFromClipboardCommand : deliberately not handled, to let the user
		// paste multiple times, without having to reselect the parent element
		// each time
	}

	protected void selectElements(final EObject owner, final EStructuralFeature feature,
			final Collection<?> collection) {
		// TreePath treePath = findTreePathForElement(owner);
		// Object lastSegment = treePath.getLastSegment();
		browseTo(owner);
		ModelElementItem modelElementItem = getSelectedModelElementItem();
		selectElements(modelElementItem, feature, collection);
	}

	protected boolean selectElements(final ModelElementItem modelElementItem,
			final EStructuralFeature feature, final Collection<?> collection) {
		if (modelElementItem != null) {
			LinkItem linkItem = getLink(modelElementItem, feature);
			if (linkItem != null) {
				boolean result = selectElements(linkItem, collection);
				if (!result) {
					setSelection(Collections.singletonList(linkItem), true);
					this.treeViewer.expandToLevel(linkItem, 1);
				}
				return true;
			}
		}
		return false;
	}

	protected boolean selectElements(final LinkItem linkItem, final Collection<?> collection) {
		List<ModelElementItem> elementItems = new ArrayList<ModelElementItem>();
		for (Object object : collection) {
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				ModelElementItem elementItem = getElement(linkItem, eObject);
				if (elementItem != null) {
					elementItems.add(elementItem);
				}
			}
		}
		if (!elementItems.isEmpty()) {
			setSelection(elementItems, true);
			return true;
		}
		return false;
	}

	protected void setSelection(final List<? extends ITreeElement> treeElements,
			final boolean reveal) {
		List<TreePath> treePaths = new ArrayList<TreePath>();
		for (ITreeElement treeElement : treeElements) {
			List<ITreeElement> segments = new ArrayList<ITreeElement>();
			ITreeElement current = treeElement;
			while (current != null) {
				segments.add(current);
				current = current.getTreeParent();
			}

			if (segments.size() > 0) {
				ITreeElement[] segmentsArray = new ITreeElement[segments.size()];
				for (int i = 0; i < segments.size(); i++) {
					segmentsArray[i] = segments.get(segments.size() - i - 1);
				}
				treePaths.add(new TreePath(segmentsArray));
			}
		}

		if (!treePaths.isEmpty()) {
			this.treeViewer.setSelection(
					new TreeSelection(treePaths.toArray(new TreePath[treePaths.size()])), reveal);
		}
	}

	protected LinkItem getLink(final ModelElementItem selectedModelElementItem,
			final EStructuralFeature feature) {
		ITreeContentProvider contentProvider = (ITreeContentProvider) this.treeViewer
				.getContentProvider();
		Object[] children = contentProvider.getChildren(selectedModelElementItem);
		for (Object child : children) {
			if (child instanceof LinkItem) {
				LinkItem linkItem = (LinkItem) child;
				if (linkItem.getReference() == feature) {
					return linkItem;
				}
			}
		}
		return null;
	}

	protected ModelElementItem getElement(final LinkItem linkItem, final EObject eObject) {
		ITreeContentProvider contentProvider = (ITreeContentProvider) this.treeViewer
				.getContentProvider();
		Object[] children = contentProvider.getChildren(linkItem);
		for (Object child : children) {
			if (child instanceof ModelElementItem) {
				ModelElementItem modelElementItem = (ModelElementItem) child;
				if (EcoreUtil.getURI(modelElementItem.getEObject()).equals(
						EcoreUtil.getURI(eObject))) {
					return modelElementItem;
				}
			}
		}
		return null;
	}

	protected ModelElementItem getSelectedModelElementItem() {
		ITreeSelection selection = (ITreeSelection) this.treeViewer.getSelection();
		Object firstElement = selection.getFirstElement();
		if (firstElement instanceof ModelElementItemEx) {
			ModelElementItemEx modelElementItem = (ModelElementItemEx) firstElement;
			return modelElementItem;
		}
		return null;
	}

	public void doWhenLoaded(final Runnable runnable) {
		if (this.loaded) {
			Display.getDefault().syncExec(runnable);
		} else {
			this.doWhenLoaded.add(runnable);
		}
	}

	/**
	 * Replace the default context by a dummy one when the given widget is
	 * focused. The dummy context is used to redefine the "Ctrl+X", "Ctrl+C" and
	 * "Ctrl+V" key bindings to a command which does nothing. This is useful to
	 * prevent these commands associated to the existing context from being
	 * executed when this widget is focused.
	 */
	private void fixClipboardCommands(final Control control) {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final IContextService contextService = (IContextService) workbench
				.getService(IContextService.class);

		control.addFocusListener(new FocusListener() {
			private IContextActivation contextActivation = null;

			public void focusGained(final FocusEvent event) {
				this.contextActivation = contextService
						.activateContext("org.eclipse.modisco.infra.browser.dummyContext"); //$NON-NLS-1$
			}

			public void focusLost(final FocusEvent event) {
				if (this.contextActivation != null) {
					contextService.deactivateContext(this.contextActivation);
				}
			}
		});
	}

	/**
	 * * Adapter used to update the problem indication when resources are
	 * demanded loaded.
	 */
	private final EContentAdapter problemIndicationAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged(final Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__IS_LOADED:
				case Resource.RESOURCE__ERRORS:
				case Resource.RESOURCE__WARNINGS:
					Resource resource = (Resource) notification.getNotifier();
					Diagnostic diagnostic = analyzeResourceProblems(resource, null);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						EcoreBrowser.this.resourceToDiagnosticMap.put(resource, diagnostic);
					} else {
						EcoreBrowser.this.resourceToDiagnosticMap.remove(resource);
					}

					if (EcoreBrowser.this.updateProblemIndication) {
						getSite().getShell().getDisplay().asyncExec(new Runnable() {
							public void run() {
								updateProblemIndication();
							}
						});
					}
					break;
				default:
				}
			} else {
				super.notifyChanged(notification);
			}
		}

		@Override
		protected void setTarget(final Resource theTarget) {
			basicSetTarget(theTarget);
		}

		@Override
		protected void unsetTarget(final Resource theTarget) {
			basicUnsetTarget(theTarget);
		}
	};

	/**
	 * Refreshes the selection (checked) state of actions in the Browser's
	 * toolbar.
	 */
	public void refreshToolbar() {
		this.instancesToolBar.refresh();
	}

	protected Text getSearchBox() {
		return this.searchBox;
	}

	protected void setSearchBox(final Text searchBox) {
		this.searchBox = searchBox;
	}

	public IWorkbenchSiteProgressService getProgressService() {
		IWorkbenchSiteProgressService service = null;
		Object siteService = getSite().getAdapter(IWorkbenchSiteProgressService.class);
		if (siteService != null) {
			service = (IWorkbenchSiteProgressService) siteService;
		}
		return service;
	}

	public boolean isRefreshing() {
		return this.refreshJob != null && this.refreshJob.getState() != Job.NONE;
	}
}
