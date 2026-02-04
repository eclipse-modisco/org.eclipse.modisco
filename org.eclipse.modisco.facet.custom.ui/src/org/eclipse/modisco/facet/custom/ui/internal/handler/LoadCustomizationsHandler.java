/**
 *  Copyright (c) 2014, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 441051 - Reusable customization and facet loading dialogs
 *  	Gregoire Dupe (Mia-Software) - Bug 443682 - Access to the super facet
 */
package org.eclipse.modisco.facet.custom.ui.internal.handler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.modisco.facet.custom.core.ICustomizationCatalogManager;
import org.eclipse.modisco.facet.custom.core.ICustomizationCatalogManagerFactory;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.core.ICustomizationManagerProvider;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.custom.ui.internal.exported.dialog.ILoadCustomizationsDialog;
import org.eclipse.modisco.facet.custom.ui.internal.exported.dialog.ILoadCustomizationsDialogFactory;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallbackWithPreCommit;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IQuestionDialog;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class LoadCustomizationsHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			final ICustomizationManagerProvider customMgrProvider = (ICustomizationManagerProvider) activePart
					.getAdapter(ICustomizationManagerProvider.class);
			if (customMgrProvider != null) {
				final ICustomizationManager manager = customMgrProvider
						.getCustomizationManager();
				final Set<Customization> availableCustoms = new HashSet<Customization>();
				final ICustomizationCatalogManager catalog = ICustomizationCatalogManagerFactory.DEFAULT
						.getOrCreateCustomizationCatalogManager(manager.getResourceSet());
				availableCustoms.addAll(catalog.getRegisteredCustomizations());
				availableCustoms.addAll(manager.getManagedCustomizations());
				final IDialogCallbackWithPreCommit<List<Customization>, Boolean, IQuestionDialog> callback = new DialogCallbackWithPreCommit(manager);
				final List<Customization> availableCustomsL = new ArrayList<Customization>(
						availableCustoms);
				final ILoadCustomizationsDialog<IQuestionDialog> dialog = ILoadCustomizationsDialogFactory.DEFAULT
						.createLoadCustomizationDialog(null,
								availableCustomsL,
								manager.getManagedCustomizations(),
								new ArrayList<Customization>(),
								callback,
								""); //$NON-NLS-1$
				dialog.asyncOpen();
			}
		}
		return null;
	}
	
	private class DialogCallbackWithPreCommit implements IDialogCallbackWithPreCommit<List<Customization>, Boolean, IQuestionDialog> {

		private final ICustomizationManager manager;

		public DialogCallbackWithPreCommit(final ICustomizationManager manager) {
			this.manager = manager;
		}
		
		public void committed(final List<Customization> result,
				final Boolean precommitResult) {
			if (precommitResult.booleanValue()) {
				this.manager.getManagedCustomizations().clear();
				final IFacetManager facetManager = this.manager.getFacetManager();
				facetManager.getManagedFacetSets().addAll(0, result);
			}
		}

		public IQuestionDialog openPrecommitDialog(
				final List<Customization> result,
				final IDialogCallback<Boolean> precommitCallback) {
			return null;
		}
	}
}
