/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.browser.util.EditingSupportUtil;

public class LinkItemEx extends LinkItem implements IEditingDomainItemProvider {

	private final BrowserConfiguration browserConfiguration;

	public LinkItemEx(final EObject parent, final ITreeElement treeParent,
			final EReference reference, final BrowserConfiguration browserConfiguration) {
		super(parent, treeParent, reference, browserConfiguration.getAppearanceConfiguration());
		this.browserConfiguration = browserConfiguration;
	}

	public Collection<?> getChildren(final Object object) {
		throw new UnsupportedOperationException();
	}

	public Object getParent(final Object object) {
		return this.getParent();
	}

	public Collection<?> getNewChildDescriptors(final Object object,
			final EditingDomain editingDomain, final Object sibling) {

		if (!getReference().isContainment()) {
			return Collections.emptyList();
		}

		// do not create siblings from links (confusing for the user)
		// if (sibling instanceof LinkItem) {
		// return Collections.emptyList();
		// }

		EObject eObject = null;
		if (sibling instanceof ModelElementItem) {
			ModelElementItem modelElementItem = (ModelElementItem) sibling;
			eObject = modelElementItem.getEObject();
		} else if (sibling == null) {
			eObject = this.getParent();
		}

		if (eObject != null) {
			Resource eResource = eObject.eResource();
			if (eResource != null && eResource.getURI().isPlatformResource()) {
				List<CommandParameter> parameters = new ArrayList<CommandParameter>();
				EditingSupportUtil.createCommandParameters(parameters, getReference(),
						this.browserConfiguration.getResourceSet());
				return parameters;
			}
		}
		return null;
	}

	public Command createCommand(final Object object, final EditingDomain editingDomain,
			final Class<? extends Command> commandClass, final CommandParameter commandParameter) {

		if (commandClass == DragAndDropCommand.class) {
			DragAndDropCommand.Detail detail = (DragAndDropCommand.Detail) commandParameter
					.getFeature();

			return new DragAndDropOnLinkCommand(editingDomain, this, detail.location,
					detail.operations, detail.operation, commandParameter.getCollection());
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return LinkItemEx.class.getSimpleName() + "(" + getText() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}
