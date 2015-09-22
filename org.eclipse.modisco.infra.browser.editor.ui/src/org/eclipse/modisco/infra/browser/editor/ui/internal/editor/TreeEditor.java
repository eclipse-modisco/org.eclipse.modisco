/** 
 * Copyright (c) 2014, 2015 Mia-Software, and Soft-Maint.
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
 *    Jonathan Pepin (Soft-Maint) - Bug 476286 - Resolve selection on TreeEditor for facet object
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.ICustomizationManagerFactory;
import org.eclipse.emf.facet.custom.ui.CustomizedContentProviderUtils;
import org.eclipse.emf.facet.custom.ui.ICustomizationManagerProvider2;
import org.eclipse.emf.facet.custom.ui.ICustomizedContentProviderFactory;
import org.eclipse.emf.facet.custom.ui.IResolvingCustomizedLabelProviderFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManagerListener;
import org.eclipse.emf.facet.efacet.ui.IFacetManagerProvider2;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.modisco.infra.browser.editor.ui.ITreeEditor;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Activator;
import org.eclipse.modisco.infra.browser.editor.ui.internal.opener.ResourceEditorInput;
import org.eclipse.modisco.infra.browser.editor.ui.internal.opener.ResourceSetEditorInput;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

public class TreeEditor extends EditorPart implements IEditingDomainProvider,
		IFacetManagerProvider2, ICustomizationManagerProvider2, ITreeEditor,
		ISelectionProvider, ISelectionChangedListener {

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
	private final List<ISelectionChangedListener> selectionListnrs =
			new ArrayList<ISelectionChangedListener>();
	private ISelection selection = StructuredSelection.EMPTY;

	@Override
	public void doSave(final IProgressMonitor monitor) {
		// TODO Auto-generated method stub
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
		final AdapterFactory adapterFactory = new AdapterFactoryImpl();
		final CommandStack commandStack = new BasicCommandStack();
		this.editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, this.resourceSet);
		
		this.facetSetShortcuts = TreeEditorShortcutUtils.getFacetSetShortcuts(this.resourceSet);
		this.customShortcuts = TreeEditorShortcutUtils.getCustomShortcuts(this.resourceSet);
	}
	
	
	private void createPopupMenu() {
		final MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		menuMgr.setRemoveAllWhenShown(true);
		final Menu menu = menuMgr.createContextMenu(this.tree.getControl());
		this.tree.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, this.tree);
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
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
				.createCustomizedTreeContentProvider(this.customManager);
		this.tree.setContentProvider(contentProvider);
		this.tree.setLabelProvider(labelProvider);
		
		final List<EObject> contents = new ArrayList<EObject>();
		if (this.resource == null) {
			for (Resource res : this.resourceSet.getResources()) {
				contents.addAll(res.getContents());
			}
		} else {
			contents.addAll(this.resource.getContents());
		}
		this.tree.setInput(contents);
		this.tree.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				setSelection(event.getSelection());
			}
		});
		getSite().setSelectionProvider(this);
		this.facetMgrListener = new IFacetManagerListener() {
			public void facetManagerChanged() {
				TreeEditor.this.refresh();
			}
		};
		createPopupMenu();
		this.facetManager.addListener(this.facetMgrListener);
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
	
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		/* @SuppressWarnings("rawtypes"): gdupe> Imposed by the super class */
		Object result = null;
		if (adapter.isInstance(this)) {
			result = this;
		} else if (adapter == ISelectionProvider.class) {
			result = this.tree;
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

	public ISelection getSelection() {
		return this.selection;
	}

	public void setSelection(final ISelection selection) {
		this.selection = CustomizedContentProviderUtils.resolveSelection(selection);
		final SelectionChangedEvent event = new SelectionChangedEvent(
				this, this.selection);
		for (ISelectionChangedListener selectionListener : this.selectionListnrs) {
			selectionListener.selectionChanged(event);
		}
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.selectionListnrs.add(listener);
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.selectionListnrs.remove(listener);
	}

	public void selectionChanged(final SelectionChangedEvent event) {
		this.tree.setSelection(event.getSelection());
	}

}
