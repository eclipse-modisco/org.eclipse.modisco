/**
 * Copyright (c) 2015 Mia-Software, and Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 471020 - Ecore Explorer View
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.view;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidgetFactory;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IView;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class EcoreExplorerView extends ViewPart implements
		IView<IEcoreExplorerWidget> {

	private IEcoreExplorerWidget widget;

	private final EcoreExplorerWindowListener wListener;

	private final ISelectionListener selectionListener = new ISelectionListener() {
		public void selectionChanged(final IWorkbenchPart part,
				final ISelection selection) {
			if (!part.equals(EcoreExplorerView.this)) {
				EcoreExplorerView.this.changeInput(selection);
			}
		}
	};

	public EcoreExplorerView() {
		super();
		final IWorkbenchWindow[] windows = PlatformUI.getWorkbench()
				.getWorkbenchWindows();
		this.wListener = new EcoreExplorerWindowListener(this);
		for (IWorkbenchWindow window : windows) {
			window.addPageListener(this.wListener);
			for (IWorkbenchPage page : window.getPages()) {
				page.addPartListener(this.wListener);
			}
		}
	}

	private ISelectionService getSelectionService() {
		final IWorkbenchWindow wWindow = getSite().getWorkbenchWindow();
		return wWindow.getSelectionService();
	}

	/**
	 * Change the input from a selection in the Workbench
	 */
	protected final boolean changeInput(final ISelection selection) {
		final Set<EObject> eObjects = new HashSet<EObject>();
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structSelection = (IStructuredSelection) selection;
			for (Object object : structSelection.toArray()) {
				final EObject eObject = Utils.getResolvedEObject(object);
				if (eObject != null) {
					eObjects.add(eObject);
				}
			}
		}
		changeInput(eObjects);
		return !eObjects.isEmpty();
	}

	public void changeInput(final Collection<EObject> eObjects) {
		this.widget.changeInput(eObjects);
	}

	@Override
	public void createPartControl(final Composite parent) {
		final MenuManager menuManager = new MenuManager("#PopUp"); //$NON-NLS-1$
		menuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

		this.widget = IEcoreExplorerWidgetFactory.DEFAULT.createWidget(parent,
				menuManager);

		final ISelectionProvider widgetSP = (ISelectionProvider) this.widget
				.getAdapter(ISelectionProvider.class);
		getSite().registerContextMenu(menuManager, widgetSP);
		getSite().setSelectionProvider(widgetSP);
		getSelectionService().addSelectionListener(this.selectionListener);
	}

	@Override
	public void setFocus() {
		// Nothing to do
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		/* @SuppressWarnings("rawtypes"): gdupe> Imposed by the super class */
		Object result;
		if (adapter.isInstance(this)) {
			result = this;
		} else {
			result = this.widget.getAdapter(adapter);
			if (result == null) {
				result = super.getAdapter(adapter);
			}
		}
		return result;
	}

	@Override
	public void dispose() {
		getSelectionService().removeSelectionListener(this.selectionListener);
		final IWorkbenchWindow[] windows = PlatformUI.getWorkbench()
				.getWorkbenchWindows();
		for (IWorkbenchWindow window : windows) {
			window.removePageListener(this.wListener);
			for (IWorkbenchPage page : window.getPages()) {
				page.removePartListener(this.wListener);
			}
		}
		super.dispose();
	}

	public IEcoreExplorerWidget getWidget() {
		return this.widget;
	}
}
