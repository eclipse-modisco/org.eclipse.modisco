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

package org.eclipse.modisco.facet.efacet.edit.core.internal.command;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.edit.core.FacetCommandException;
import org.eclipse.modisco.facet.efacet.edit.core.IFacetCommandFactory;

public class FacetCommandFactory implements IFacetCommandFactory {

	public Command createAddCommand(final EObject owner,
			final EStructuralFeature feature, final Object newValue,
			final EditingDomain domain, final IFacetManager facetManager)
			throws FacetCommandException {
		if (!feature.isMany()) {
			final String msg = String.format(
					"On createAddCommand feature %s must be multi-valued !", //$NON-NLS-1$
					feature.getName());
			throw new IllegalArgumentException(msg);
		}
		return new FacetAddCommand(owner, feature, newValue, domain,
				facetManager);
	}

	public Command createAddAllCommand(final EObject owner,
			final EStructuralFeature feature,
			final Collection<? extends Object> newValues,
			final EditingDomain domain, final IFacetManager facetManager)
			throws FacetCommandException {
		if (!feature.isMany()) {
			final String msg = String.format(
					"On createAddAllCommand feature %s must be multi-valued !", //$NON-NLS-1$
					feature.getName());
			throw new IllegalArgumentException(msg);
		}
		return new FacetAddAllCommand(owner, feature, newValues, domain,
				facetManager);
	}

	public Command createRemoveCommand(final EObject owner,
			final EStructuralFeature feature, final Object value,
			final EditingDomain domain, final IFacetManager facetManager)
			throws FacetCommandException {
		if (!feature.isMany()) {
			final String msg = String.format(
					"On createRemoveCommand feature %s must be multi-valued !", //$NON-NLS-1$
					feature.getName());
			throw new IllegalArgumentException(msg);
		}
		return new FacetRemoveCommand(owner, feature, value, domain,
				facetManager);
	}

	public Command createRemoveAllCommand(final EObject owner,
			final EStructuralFeature feature,
			final Collection<? extends Object> values,
			final EditingDomain domain, final IFacetManager facetManager)
			throws FacetCommandException {
		if (!feature.isMany()) {
			final String msg = String.format(
					"On createRemoveAllCommand feature %s must be multi-valued !", //$NON-NLS-1$
					feature.getName());
			throw new IllegalArgumentException(msg);
		}
		return new FacetRemoveAllCommand(owner, feature, values, domain,
				facetManager);
	}

	public Command createSetCommand(final EObject owner,
			final EStructuralFeature feature, final Object newValue,
			final EditingDomain domain, final IFacetManager facetManager)
			throws FacetCommandException {
		return new FacetSetCommand(owner, feature, newValue, domain,
				facetManager);
	}

	public Command createUnSetCommand(final EObject owner,
			final EStructuralFeature feature, final EditingDomain domain,
			final IFacetManager facetManager) throws FacetCommandException {
		return new FacetUnSetCommand(owner, feature, domain, facetManager);
	}

}
