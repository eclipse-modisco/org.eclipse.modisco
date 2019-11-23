/*******************************************************************************
 * Copyright (c) 2017, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 516254 - CatalogManager must not return workspace entries from closed project
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.internal.catalog.v2;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog;

public final class EmfCommandUtils {

	private EmfCommandUtils() {
		// Must not be used
	}

	public static void executeRemove(final EList<EObject> eObjects,
			final List<EObject> toBeRemoved, final Resource resource) {
		final TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(resource);
		if (editingDomain == null) {
			eObjects.removeAll(toBeRemoved);
		} else {
			final Command command = new RemoveCommand(editingDomain, eObjects,
					toBeRemoved);
			editingDomain.getCommandStack().execute(command);
		}
	}

	public static void executeAdd(final Resource resource,
			final InstallAndWokspaceCatalog catalog) {
		final TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(resource);
		final EList<EObject> contents = resource.getContents();
		if (editingDomain == null) {
			contents.add(catalog);
		} else {
			final Command command = new AddCommand(editingDomain, contents,
					catalog);
			editingDomain.getCommandStack().execute(command);
		}
	}

}
