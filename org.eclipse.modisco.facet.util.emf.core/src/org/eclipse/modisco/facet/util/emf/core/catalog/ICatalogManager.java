/*******************************************************************************
 * Copyright (c) 2015, 2016 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *    Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.catalog;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

/**
 * @since 1.1
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ICatalogManager {

	<T> List<T> getEntries(final Class<T> expectedClass);
	<T> List<T> getWsEntries(final Class<T> expectedClass);
	<T> List<T> getInstalledEntries(final Class<T> expectedClass);
	boolean addWsEntry(EObject entry);
	void removeWsEntry(EObject entry);
	void removeAllWsEntries(IProject project);
	
}
