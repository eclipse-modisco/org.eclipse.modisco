/*******************************************************************************
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 474418 - Edit Facet features with Properties View and Commands
 *******************************************************************************/

package org.eclipse.emf.facet.efacet.edit.core;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.edit.core.internal.command.FacetCommandFactory;

/**
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IFacetCommandFactory {

	IFacetCommandFactory DEFAULT = new FacetCommandFactory();

	/**
	 * @param feature
	 *            must be multi-valued
	 * @throws FacetCommandException
	 * @throws IllegalArgumentException
	 *             if the parameter 'feature' is not multi-valued
	 */
	Command createAddCommand(EObject owner, EStructuralFeature feature,
			Object newValue, EditingDomain domain, IFacetManager facetManager)
			throws FacetCommandException;

	/**
	 * @param feature
	 *            must be multi-valued
	 * @throws FacetCommandException
	 * @throws IllegalArgumentException
	 *             if the parameter 'feature' is not multi-valued
	 */
	Command createAddAllCommand(EObject owner, EStructuralFeature feature,
			Collection<? extends Object> newValues, EditingDomain domain,
			IFacetManager facetManager) throws FacetCommandException;

	/**
	 * @param feature
	 *            must be multi-valued
	 * @throws FacetCommandException
	 * @throws IllegalArgumentException
	 *             if the parameter 'feature' is not multi-valued
	 */
	Command createRemoveCommand(EObject owner, EStructuralFeature feature,
			Object value, EditingDomain domain, IFacetManager facetManager)
			throws FacetCommandException;

	/**
	 * @param feature
	 *            must be multi-valued
	 * @throws FacetCommandException
	 * @throws IllegalArgumentException
	 *             if the parameter 'feature' is not multi-valued
	 */
	Command createRemoveAllCommand(EObject owner, EStructuralFeature feature,
			Collection<? extends Object> values, EditingDomain domain,
			IFacetManager facetManager) throws FacetCommandException;

	Command createSetCommand(EObject owner, EStructuralFeature feature,
			Object newValue, EditingDomain domain, IFacetManager facetManager)
			throws FacetCommandException;

	Command createUnSetCommand(EObject owner, EStructuralFeature feature,
			EditingDomain domain, IFacetManager facetManager)
			throws FacetCommandException;

}
