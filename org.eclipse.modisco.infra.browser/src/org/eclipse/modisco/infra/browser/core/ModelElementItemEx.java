/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.core;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.queries.SelectedQueriesManager;
import org.eclipse.modisco.infra.browser.queries.SelectedQuery;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.browser.util.EditingSupportUtil;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;

public class ModelElementItemEx extends ModelElementItem implements IEditingDomainItemProvider {

	private final BrowserConfiguration browserConfiguration;

	public ModelElementItemEx(final EObject eObject, final ITreeElement treeParent,
			final BrowserConfiguration browserConfiguration) {
		super(eObject, treeParent, browserConfiguration.getAppearanceConfiguration());
		this.browserConfiguration = browserConfiguration;
	}

	private void addSelectedQueries(final List<Object> children) {
		SelectedQueriesManager selectedQueriesManager = this.browserConfiguration
				.getSelectedQueriesManager();
		List<SelectedQuery> selectedQueries = selectedQueriesManager
				.getSelectedQueriesFor(getEObject());
		if (selectedQueries != null && selectedQueries.size() > 0) {
			for (SelectedQuery selectedQuery : selectedQueries) {
				if (selectedQuery.getModelQuery() != null) {
					children.add(new QueryItem(getEObject(), this, selectedQuery,
							this.browserConfiguration));
				} else {
					MoDiscoLogger.logError(Messages.ModelElementItem_nullQuerySelected,
							MoDiscoBrowserPlugin.getPlugin());
				}
			}
		}
	}

	@Override
	protected void addVirtualElements(final List<Object> children) {
		// queries selected on the element
		addSelectedQueries(children);
	}

	public Collection<?> getChildren(final Object object) {
		throw new UnsupportedOperationException();
	}

	public Object getParent(final Object object) {
		return getTreeParent();
	}

	public Collection<?> getNewChildDescriptors(final Object object,
			final EditingDomain editingDomain, final Object sibling) {
		// do not create siblings from links (confusing for the user)
		if (sibling instanceof LinkItem) {
			return Collections.emptyList();
		}

		Resource eResource = getEObject().eResource();
		if (eResource != null && eResource.getURI().isPlatformResource()) {
			if (sibling != null) {
				if (getEObject().eContainer() != null) {
					return EditingSupportUtil.getNewChildDescriptors(getEObject().eContainer()
							.eClass().getEAllReferences(),
							this.browserConfiguration.getResourceSet());
				}
				return Collections.EMPTY_LIST;
			}

			Collection<?> descriptors = EditingSupportUtil.getNewChildDescriptors(getEObject()
					.eClass().getEAllReferences(), this.browserConfiguration.getResourceSet());
			return descriptors;
		}

		return null;
	}

	public Command createCommand(final Object object, final EditingDomain editingDomain,
			final Class<? extends Command> commandClass, final CommandParameter commandParameter) {

		if (commandClass == DragAndDropCommand.class) {
			DragAndDropCommand.Detail detail = (DragAndDropCommand.Detail) commandParameter
					.getFeature();

			return new DragAndDropOnModelElementCommand(editingDomain, this, detail.location,
					detail.operations, detail.operation, commandParameter.getCollection());
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return ModelElementItemEx.class.getSimpleName() + "{" + getElementID() + "}(" + getText() //$NON-NLS-1$ //$NON-NLS-2$
				+ ")" + System.identityHashCode(this); //$NON-NLS-1$
	}
}
