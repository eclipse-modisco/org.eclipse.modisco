/**
 * Copyright (c) 2015 Soft-Maint, and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 *    Thomas Cicognani (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.widget;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.ui.ICustomizationManagerProvider2;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.ui.IFacetManagerProvider2;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.view.Utils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class EcoreExplorerWidgetComposite extends Composite implements
		ISelectionProvider, ICustomizationManagerProvider2,
		IFacetManagerProvider2 {

	interface IEClassSelectionListener {
		void onEClassSelected(Set<EClass> eClasses);
	}

	private ISelection lastSelection = null;
	private final SashForm sashForm;
	private final EcoreMetaExplorerComposite metaComposite;
	private final EcoreInstancesExplorerComposite instComposite;
	private final List<IEClassSelectionListener> listeners = new ArrayList<IEClassSelectionListener>();
	private final List<ICustomShortcut> customShortcuts;
	private final List<IFacetSetShortcut> facetSetShortcuts;

	public EcoreExplorerWidgetComposite(final Composite parent,
			final MenuManager menuManager) {
		super(parent, SWT.NONE);

		setLayout(new FillLayout());

		this.sashForm = new SashForm(this, SWT.VERTICAL);

		this.metaComposite = new EcoreMetaExplorerComposite(this.sashForm,
				menuManager);
		this.instComposite = new EcoreInstancesExplorerComposite(this.sashForm);

		this.metaComposite
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(
							final SelectionChangedEvent event) {
						final ISelection metaSelection = getMetaSelection();
						setLastSelection(metaSelection);
						updateAllInstances(metaSelection);
					}
				});

		this.instComposite
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(
							final SelectionChangedEvent event) {
						final ISelection metaSelection = getInstanceSelection();
						setLastSelection(metaSelection);
					}
				});

		addListener(SWT.Resize, new Listener() {
			public void handleEvent(final Event event) {
				updateSashOrientation();
			}
		});

		final ResourceSet customRS = getCustomizationManager().getResourceSet();
		this.customShortcuts = EcoreExplorerShortcutUtils
				.getCustomShortcuts(customRS);

		final ResourceSet facetSetRS = getFacetManager().getResourceSet();
		this.facetSetShortcuts = EcoreExplorerShortcutUtils
				.getFacetSetShortcuts(facetSetRS);
	}

	protected ISelection getMetaSelection() {
		return this.metaComposite.getSelection();
	}

	protected ISelection getInstanceSelection() {
		return this.instComposite.getSelection();
	}

	protected void setLastSelection(final ISelection selection) {
		this.lastSelection = selection;
	}

	protected final void updateAllInstances(final ISelection metaSelection) {
		final Set<EClass> allEClasses = new HashSet<EClass>();
		if (metaSelection instanceof IStructuredSelection) {
			final IStructuredSelection structSelection = (IStructuredSelection) metaSelection;
			for (Object selectedObj : structSelection.toArray()) {
				final EObject eObject = Utils.getResolvedEObject(selectedObj);
				if (eObject instanceof EClass) {
					final EClass eClass = (EClass) eObject;
					allEClasses.add(eClass);
				}
			}
		}
		notifyEClassSelected(allEClasses);
	}

	protected void updateSashOrientation() {
		final Point compositeSize = getSize();
		if (compositeSize.x > compositeSize.y) {
			this.sashForm.setOrientation(SWT.HORIZONTAL);
		} else {
			this.sashForm.setOrientation(SWT.VERTICAL);
		}
	}

	public void changeInput(final Collection<EPackage> ePackages) {
		this.instComposite.clearInput();
		this.metaComposite.changeInput(ePackages);
	}

	public ICustomizationManager getCustomizationManager() {
		return this.metaComposite.getCustomizationManager();
	}

	public IFacetManager getFacetManager() {
		return this.metaComposite.getFacetManager();
	}

	public List<IFacetSetShortcut> getFacetSetShortcuts() {
		return Collections.unmodifiableList(this.facetSetShortcuts);
	}

	public List<ICustomShortcut> getCustomShortcuts() {
		return Collections.unmodifiableList(this.customShortcuts);
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.metaComposite.addSelectionChangedListener(listener);
		this.instComposite.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return this.lastSelection;
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.metaComposite.removeSelectionChangedListener(listener);
		this.instComposite.removeSelectionChangedListener(listener);
	}

	public void setSelection(final ISelection selection) {
		this.metaComposite.setSelection(selection);
		this.instComposite.setSelection(selection);
	}

	public void addEClassSelectionListener(final IEClassSelectionListener listener) {
		this.listeners.add(listener);
	}

	private void notifyEClassSelected(final Set<EClass> eClasses) {
		for (IEClassSelectionListener listener : this.listeners) {
			listener.onEClassSelected(eClasses);
		}
	}

	public void displayInstances(final Set<EObject> eObjects) {
		this.instComposite.changeInput(eObjects);

	}

}
