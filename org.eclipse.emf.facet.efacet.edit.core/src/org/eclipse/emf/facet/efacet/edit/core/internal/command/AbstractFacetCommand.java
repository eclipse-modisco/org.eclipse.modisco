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

package org.eclipse.emf.facet.efacet.edit.core.internal.command;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.edit.core.FacetCommandException;
import org.eclipse.emf.facet.efacet.edit.core.internal.Activator;
import org.eclipse.emf.facet.efacet.edit.core.internal.FacetCommandRuntimeException;
import org.eclipse.emf.facet.util.core.Logger;

public abstract class AbstractFacetCommand extends AbstractOverrideableCommand {

	private final EObject owner;
	private final EStructuralFeature feature;

	private final IFacetManager facetManager;

	public AbstractFacetCommand(final EObject owner,
			final EStructuralFeature feature, final EditingDomain domain,
			final IFacetManager facetManager, final String label,
			final String description) {
		super(domain, label, description);
		this.owner = owner;
		this.feature = feature;
		this.facetManager = facetManager;
	}

	/**
	 * check if facet structurual feature exist in owner
	 */
	@Override
	public boolean doCanExecute() {
		boolean result = false;
		try {
			final Set<EStructuralFeature> features = FacetUtils
					.getETypedElements(this.owner, EStructuralFeature.class,
							this.facetManager);
			result = features.contains(this.feature);
		} catch (final FacetManagerException e) {
			final String msg = String.format(
"					When evaluation doCanExecute on %s.%s, the facetManager called return error.", //$NON-NLS-1$
					this.owner, this.feature);
			Logger.logError(e, msg, Activator.getDefault()); 
		}
		return result;
	}

	protected Object getCurrentValue() throws FacetCommandException {
		Object result = null;
		if (doCanExecute()) {
			try {
				if (!this.feature.isMany()) {
					result = this.facetManager.getOrInvoke(this.owner,
							this.feature, Object.class);
				}
			} catch (final FacetManagerException e) {
				throw new FacetCommandException(
						"When getCurrentValue method invoked, the facetManager called return error", e); //$NON-NLS-1$
			}
		}
		return result;
	}

	protected List<Object> getCurrentValues() throws FacetCommandException {
		List<Object> result = null;
		if (doCanExecute()) {
			try {
				if (this.feature.isMany()) {
					result = this.facetManager.getOrInvokeMultiValued(
							this.owner, this.feature, Object.class);
				}
			} catch (final FacetManagerException e) {
				throw new FacetCommandException(
						"When getCurrentValues method invoked, the facetManager return error", e); //$NON-NLS-1$
			}
		}
		return result;
	}

	protected void set(final Object value) {
		try {
			this.facetManager.set(this.owner, this.feature, value, this.domain);
		} catch (final FacetManagerException e) {
			final String msg = String.format(
					"Can set value %s in the facet, the facetManager return error", //$NON-NLS-1$
					value.toString());
			Logger.logError(e, msg, Activator.getDefault());
			throw new FacetCommandRuntimeException(msg, e);
		}
	}

	protected EStructuralFeature getFeature() {
		return this.feature;
	}

}
