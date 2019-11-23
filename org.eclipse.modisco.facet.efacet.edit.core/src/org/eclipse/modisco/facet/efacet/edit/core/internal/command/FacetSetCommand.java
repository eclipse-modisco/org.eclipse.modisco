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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.edit.core.FacetCommandException;
import org.eclipse.modisco.facet.efacet.edit.core.internal.Messages;

/**
 * The set command logically acts upon an owner object to set a particular
 * feature to a specified value.
 */
public class FacetSetCommand extends AbstractFacetCommand {

	private static final String LABEL = Messages.FacetSetCommand_Label;
	private static final String DESCRIPTION = Messages.FacetSetCommand_Description;

	private final Object newValue;
	private final Object oldValue;

	public FacetSetCommand(final EObject owner,
			final EStructuralFeature feature, final Object newValue,
			final EditingDomain domain, final IFacetManager facetManager)
			throws FacetCommandException {
		super(owner, feature, domain, facetManager, LABEL, DESCRIPTION);
		this.newValue = newValue;
		this.oldValue = getCurrentValue();
	}

	@Override
	public void doExecute() {
		set(this.newValue);
	}

	@Override
	public void doUndo() {
		set(this.oldValue);
	}

	@Override
	public void doRedo() {
		set(this.newValue);
	}

}
