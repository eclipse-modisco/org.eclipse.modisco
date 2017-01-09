/**
 * Copyright (c) 2014, 2017 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 358914 - [Move to EMF Facet][Browser] Switch to EMF Facet
 *    Thomas Cicognani (Soft-Maint) - Bug 442718 - Implement copy action in the new MoDisco Browser
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 *    Grégoire Dupé (Mia-Software) - Bug 442800 - API to open new MoDisco Browser
 *    Thomas Cicognani (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 *    Grégoire Dupé (Mia-Software) - Bug 507310 - [New Browser] The selection should contains unwrapped EObjects
 *    Grégoire Dupé (Mia-Software) - Bug 506466 - [New Browser] doSave has to implemented
 *    Grégoire Dupé (Mia-Software) - Bug 506318 - [New Browser] Drag and drop support
 *    Jonathan Pepin (Soft-Maint) - Bug 519213 - Enable Properties View on Editor to show informations on selected model element
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.ICustomizationManagerFactory;
import org.eclipse.emf.facet.custom.edit.ui.IEditingDomainPropertySheetPageFactory;
import org.eclipse.emf.facet.custom.ui.ICustomizationManagerProvider2;
import org.eclipse.emf.facet.custom.ui.ICustomizedContentProviderFactory;
import org.eclipse.emf.facet.custom.ui.ICustomizedContentProviderFactory.IContentListener;
import org.eclipse.emf.facet.custom.ui.IResolvingCustomizedLabelProviderFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManagerListener;
import org.eclipse.emf.facet.efacet.ui.IFacetManagerProvider2;
import org.eclipse.emf.facet.util.ui.internal.exported.dialog.IOkDialog;
import org.eclipse.emf.facet.util.ui.internal.exported.dialog.IOkDialogFactory;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.modisco.infra.browser.editor.ui.ITreeEditor;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Activator;
import org.eclipse.modisco.infra.browser.editor.ui.internal.opener.ResourceEditorInput;
import org.eclipse.modisco.infra.browser.editor.ui.internal.opener.ResourceSetEditorInput;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.properties.IPropertySheetPage;

public class TreeEditor extends EditorPart implements IEditingDomainProvider,
		IFacetManagerProvider2, ICustomizationManagerProvider2, ITreeEditor {

	private static final String EDITOR_ID = Activator.getDefault().getBundle()
			.getSymbolicName() + ".TreeEditor"; //$NON-NLS-1$
	private Resource resource;
	private ResourceSet resourceSet;
	private EditingDomain editingDomain;
	private IFacetManager facetManager;
	private ICustomizationManager customManager;
	private TreeViewer tree;
	private IFacetManagerListener facetMgrListener;
	private List<IFacetSetShortcut> facetSetShortcuts;
	private List<ICustomShortcut> customShortcuts;
	private ISelectionProvider selectionProvider;
	private IPropertySheetPage propertySheetPage;

	@Override
	public void doSave(final IProgressMonitor monitor) {
		doSave();
	}

	public IOkDialog doSave() {
		IOkDialog result = null;
		try {
			this.resource.save(Collections.EMPTY_MAP);
		} catch (final IOException e) {
			final URI uri = this.resource.getURI();
			final String message = String.format("Failed to save %s", uri); //$NON-NLS-1$
			result = IOkDialogFactory.DEFAULT.openErrorDialog(
					this.getSite().getShell(), e, message);
		}
		final BasicCommandStack commandStack =
				(BasicCommandStack) this.editingDomain.getCommandStack();
		commandStack.saveIsDone();
		firePropertyChange(IEditorPart.PROP_DIRTY);
		return result;
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		if (input instanceof FileEditorInput) {
			final FileEditorInput fileEI = (FileEditorInput) input;
			final IFile file = fileEI.getFile();
			final IPath path = file.getFullPath();
			final String pathStr = path.toString();
			final URI uri = URI.createPlatformResourceURI(pathStr, true);
			this.resourceSet = new ResourceSetImpl();
			this.resource = this.resourceSet.getResource(uri, true);
		} else if (input instanceof ResourceEditorInput) {
			final ResourceEditorInput resourceEI = (ResourceEditorInput) input;
			this.resource = resourceEI.getResource();
			this.resourceSet = this.resource.getResourceSet();
		} else if (input instanceof ResourceSetEditorInput) {
			final ResourceSetEditorInput resourceSetEI = (ResourceSetEditorInput) input;
			this.resourceSet = resourceSetEI.getResourceSet();
		} else {
			final String message = String.format(
					"The EditorInput (%s) is not compatible with the TreeEditor", //$NON-NLS-1$
					input.getClass().getName()
				);
			throw new IllegalArgumentException(message);
		}
		if (this.resourceSet == null) {
			/*
			 * "this.resourceSet" is null while opening an ecore model stored in
			 * EPackage.Registry.INSTANCE. this.resourceSet must not be null,
			 * because we need it to instantiate the facetManager.
			 */
			this.resourceSet = new ResourceSetImpl();
		}
		this.editingDomain = initEditingDomain();
		this.facetSetShortcuts = TreeEditorShortcutUtils.getFacetSetShortcuts(this.resourceSet);
		this.customShortcuts = TreeEditorShortcutUtils.getCustomShortcuts(this.resourceSet);
	}

	private final EditingDomain initEditingDomain() {
		final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final BasicCommandStack commandStack = new BasicCommandStack();
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				onCommandStackChanged();
			}
		});
		return new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, this.resourceSet);
	}

	private void createPopupMenu() {
		final MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		menuMgr.setRemoveAllWhenShown(true);
		final Menu menu = menuMgr.createContextMenu(this.tree.getControl());
		this.tree.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, this.selectionProvider);
	}

	protected final void onCommandStackChanged() {
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	@Override
	public boolean isDirty() {
		final BasicCommandStack basicCommandStack =
				(BasicCommandStack) this.editingDomain.getCommandStack();
		final boolean saveNeeded = basicCommandStack.isSaveNeeded();
		return this.isReadWriteResource() && saveNeeded;
	}

	private boolean isReadWriteResource() {
		final URI uri = this.resource.getURI();
		final String uriStr = uri.toString();
		return uriStr.matches("(platform:/resource/.*)|(file:/)"); //$NON-NLS-1$
	}

	@Override
	public boolean isSaveAsAllowed() {
		return isDirty();
	}

	@Override
	public void createPartControl(final Composite parent) {
		this.tree = new TreeViewer(parent);
		this.facetManager = IFacetManagerFactory.DEFAULT
				.getOrCreateFacetManager(this.resourceSet);
		this.customManager = ICustomizationManagerFactory.DEFAULT
				.getOrCreateICustomizationManager(this.resourceSet);
		final ILabelProvider labelProvider = IResolvingCustomizedLabelProviderFactory.DEFAULT
				.createCustomizedLabelProvider(this.customManager);
		final IContentProvider contentProvider = ICustomizedContentProviderFactory.DEFAULT
				.createCustomizedTreeContentProvider(this.customManager, new IContentListener() {
					public void onUpdate(final Object object) {
						TreeEditor.this.syncRefresh(object);
					}
				});
		this.tree.setContentProvider(contentProvider);
		this.tree.setLabelProvider(labelProvider);
		final List<EObject> contents = new ArrayList<EObject>();
		if (this.resource == null) {
			for (final Resource res : this.resourceSet.getResources()) {
				contents.addAll(res.getContents());
			}
		} else {
			contents.addAll(this.resource.getContents());
		}
		TreeEditorDragAndDropUtils.addDragAndDropSupport(this.tree,
				this.editingDomain);
		this.tree.setInput(contents);
		this.selectionProvider = new TreeEditorSelectionProvider(this.tree);
		getSite().setSelectionProvider(this.selectionProvider);
		this.facetMgrListener = new IFacetManagerListener() {
			public void facetManagerChanged() {
				TreeEditor.this.refresh();
			}
		};
		createPopupMenu();
		this.facetManager.addListener(this.facetMgrListener);
	}

	protected void syncRefresh(final Object object) {
		final Shell shell = this.getSite().getShell();
		final Display display = shell.getDisplay();
		display.asyncExec(new Runnable() {
			public void run() {
				internalRefresh(object);
			}
		});
	}

	protected void internalRefresh(final Object object) {
		this.tree.refresh(object);
	}

	protected void refresh() {
		final Object[] expanededElts = this.tree.getExpandedElements();
		this.tree.refresh();
		this.tree.setExpandedElements(expanededElts);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public static String getEditorId() {
		return EDITOR_ID;
	}

	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	public IPropertySheetPage getOrCreatePropertySheetPage() {
		if (this.propertySheetPage == null) {
			this.propertySheetPage = IEditingDomainPropertySheetPageFactory.
					DEFAULT.createPropertySheetPage(this);
		}
		return this.propertySheetPage;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		/* @SuppressWarnings("rawtypes"): gdupe> Imposed by the super class */
		Object result = null;
		if (adapter.isInstance(this)) {
			result = this;
		} else if (adapter == ISelectionProvider.class) {
			result = this.selectionProvider;
		} else if (adapter.equals(IPropertySheetPage.class)) {
			result = getOrCreatePropertySheetPage();
		} else {
			result = super.getAdapter(adapter);
		}
		return result;
	}

	public ICustomizationManager getCustomizationManager() {
		return this.customManager;
	}

	public List<ICustomShortcut> getCustomShortcuts() {
		return this.customShortcuts;
	}

	public IFacetManager getFacetManager() {
		return this.facetManager;
	}

	public List<IFacetSetShortcut> getFacetSetShortcuts() {
		return this.facetSetShortcuts;
	}

	@Override
	public void dispose() {
		this.facetManager.removeListener(this.facetMgrListener);
		super.dispose();
	}

	public ILabelProvider getViewerLabelProvider() {
		return (ILabelProvider) this.tree.getLabelProvider();
	}

}
