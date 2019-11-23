/*******************************************************************************
 * Copyright (c) 2015, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 474418 - Edit Facet features with Properties View and Commands
 *******************************************************************************/

package org.eclipse.modisco.facet.efacet.edit.core.internal.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.edit.core.FacetCommandException;
import org.eclipse.modisco.facet.efacet.edit.core.internal.Messages;

/**
 * The unset command logically acts upon an owner object to unset a particular
 * feature.
 */
public class FacetUnSetCommand extends AbstractFacetCommand {

	private static final String LABEL = Messages.FacetUnSetCommand_Label;
	private static final String DESCRIPTION = Messages.FacetUnSetCommand_Description;

	private List<Object> oldValues;
	private Object oldValue;

	public FacetUnSetCommand(final EObject owner,
			final EStructuralFeature feature, final EditingDomain domain,
			final IFacetManager facetManager) throws FacetCommandException {
		super(owner, feature, domain, facetManager, LABEL, DESCRIPTION);
		if (getFeature().isMany()) {
			this.oldValues = new ArrayList<Object>(getCurrentValues());
		} else {
			this.oldValue = getCurrentValue();
		}
	}

	@Override
	public void doExecute() {
		set(null);
	}

	@Override
	public void doUndo() {
		if (getFeature().isMany()) {
			set(this.oldValues);
		} else {
			set(this.oldValue);
		}
	}

	@Override
	public void doRedo() {
		set(null);
	}

}
