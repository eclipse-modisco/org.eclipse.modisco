/**
 * Copyright (c) 2015, 2019 Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.widget;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.core.ICustomizationManagerFactory;
import org.eclipse.modisco.facet.custom.ui.ICustomizedContentProviderFactory;
import org.eclipse.modisco.facet.custom.ui.IResolvingCustomizedLabelProviderFactory;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerListener;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;

public class EcoreMetaExplorerComposite extends Composite implements ISelectionProvider {

	private final TreeViewer tree;
	private final IFacetManager facetManager;
	private final ICustomizationManager customizationMgr;

	private final IFacetManagerListener facetMgrListener = new IFacetManagerListener() {
		public void facetManagerChanged() {
			EcoreMetaExplorerComposite.this.facetManagerChanged();
		}
	};

	public EcoreMetaExplorerComposite(final Composite parent, final MenuManager menuManager) {
		super(parent, SWT.NONE);

		setLayout(new GridLayout(1, true));

		final Label label = new Label(this, SWT.NONE);
		label.setText(Messages.EcoreMetaExplorerComposite_Metas);

		this.tree = new TreeViewer(this);
		this.tree.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		this.facetManager = IFacetManagerFactory.DEFAULT
				.getOrCreateDefaultFacetManager(new ResourceSetImpl());
		this.customizationMgr = ICustomizationManagerFactory.DEFAULT
				.createICustomizationManager(this.facetManager);
		final ILabelProvider labelProvider = IResolvingCustomizedLabelProviderFactory.DEFAULT
				.createCustomizedLabelProvider(this.customizationMgr);
		final IContentProvider contentProvider = ICustomizedContentProviderFactory.DEFAULT
				.createCustomizedTreeContentProvider(this.customizationMgr);
		this.tree.setContentProvider(contentProvider);
		this.tree.setLabelProvider(labelProvider);
		this.tree.setInput(Collections.EMPTY_LIST);
		final Menu createContextMenu = menuManager.createContextMenu(this.tree
				.getControl());
		this.tree.getControl().setMenu(createContextMenu);
		/* Drag and drop is not used currently
		final int operations = DND.DROP_COPY | DND.DROP_MOVE;
		final Transfer[] transferTypes = new Transfer[] { LocalTransfer
				.getInstance() };
		*/
		this.facetManager.addListener(this.facetMgrListener);
	}

	protected void facetManagerChanged() {
		final Object[] expanededElts = this.tree.getExpandedElements();
		this.tree.refresh();
		this.tree.setExpandedElements(expanededElts);
	}

	public void changeInput(final Collection<EPackage> ePackages) {
		if (this.tree != null && !this.tree.getTree().isDisposed()
				&& !ePackages.equals(this.tree.getInput())) {
			this.tree.setInput(ePackages);
			this.tree.refresh();
		}
	}

	public ICustomizationManager getCustomizationManager() {
		return this.customizationMgr;
	}

	public IFacetManager getFacetManager() {
		return this.facetManager;
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tree.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return this.tree.getSelection();
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tree.removeSelectionChangedListener(listener);
	}

	public void setSelection(final ISelection selection) {
		this.tree.setSelection(selection);
	}

	@Override
	public void dispose() {
		this.facetManager.addListener(this.facetMgrListener);
		super.dispose();
	}
}
