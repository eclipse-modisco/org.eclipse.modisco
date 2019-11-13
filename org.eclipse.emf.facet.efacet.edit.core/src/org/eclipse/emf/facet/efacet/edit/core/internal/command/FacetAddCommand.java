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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.edit.core.FacetCommandException;
import org.eclipse.emf.facet.efacet.edit.core.internal.Messages;

/**
 * The add command logically acts upon an owner object that has a
 * collection-based feature to which other objects can be added.
 *
 */
public class FacetAddCommand extends AbstractFacetCommand {

	private static final String LABEL = Messages.FacetAddCommand_Label;
	private static final String DESCRIPTION = Messages.FacetAddCommand_Description;

	private final Object newValue;
	private final List<Object> oldValues;
	private List<Object> newValues;

	public FacetAddCommand(final EObject owner,
			final EStructuralFeature feature, final Object newValue,
			final EditingDomain domain, final IFacetManager facetManager)
			throws FacetCommandException {
		super(owner, feature, domain, facetManager, LABEL, DESCRIPTION);
		this.newValue = newValue;
		this.oldValues = getCurrentValues();
	}

	@Override
	public boolean doCanExecute() {
		return super.doCanExecute() && getFeature().isMany();
	}

	@Override
	public void doExecute() {
		this.newValues = new ArrayList<Object>(this.oldValues);
		this.newValues.add(this.newValue);
		set(this.newValues);
	}

	@Override
	public void doUndo() {
		set(this.oldValues);
	}

	@Override
	public void doRedo() {
		set(this.newValues);
	}

}
