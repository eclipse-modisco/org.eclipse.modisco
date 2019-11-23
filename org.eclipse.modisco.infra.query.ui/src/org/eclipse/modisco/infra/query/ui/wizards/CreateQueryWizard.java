/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.QueryFactory;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.ui.Activator;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class CreateQueryWizard extends Wizard {

	/**
	 * the query set in which the query will be created unless the user selects
	 * another one (can be <code>null</code>)
	 */
	private final ModelQuerySet modelQuerySet;
	/**
	 * the scope that will be given to the new query unless the user selects
	 * another one (can be <code>null</code>)
	 */
	private final EClass eClass;
	private CreateQueryWizardPage createQueryWizardPage;
	private NewQueryClassWizardPage newQueryClassWizardPage;
	private ModelQuery modelQuery;
	private final Resource resourceToEdit;
	private final EditingDomain editingDomain;

	/**
	 * @param modelQuerySet
	 *            the query set in which the query will be created unless the
	 *            user selects another one (can be <code>null</code>)
	 * @param eClass
	 *            the scope that will be given to the new query unless the user
	 *            selects another one (can be <code>null</code>)
	 * @param resourceToEdit
	 *            if not <code>null</code>, add the query to this resource
	 *            instead of modifying the modelQuerySet's file
	 * @param editingDomain
	 *            the editing domain used to edit the resource
	 */
	public CreateQueryWizard(final ModelQuerySet modelQuerySet, final EClass eClass,
			final Resource resourceToEdit, final EditingDomain editingDomain) {
		this.modelQuerySet = modelQuerySet;
		this.eClass = eClass;
		this.resourceToEdit = resourceToEdit;
		this.editingDomain = editingDomain;
		setHelpAvailable(false);
	}

	@Override
	public void addPages() {
		this.createQueryWizardPage = new CreateQueryWizardPage(this.modelQuerySet, this.eClass);
		this.newQueryClassWizardPage = new NewQueryClassWizardPage(null);
		addPage(this.createQueryWizardPage);
		addPage(this.newQueryClassWizardPage);
	}

	@Override
	public IWizardPage getNextPage(final IWizardPage page) {
		if (page == this.createQueryWizardPage) {
			createQuery();
			ModelQuerySet querySet = this.createQueryWizardPage.getQuerySet();
			if (querySet != null) {
				this.newQueryClassWizardPage.init(querySet, this.modelQuery);
			}
			return this.newQueryClassWizardPage;
		}
		return null;
	}

	private void createQuery() {
		// TODO: create query using extension point's "IQueryFactory"
		this.modelQuery = QueryFactory.eINSTANCE.createJavaModelQuery();
		this.modelQuery.setName(this.createQueryWizardPage.getQueryName());
		this.modelQuery.setDescription(this.createQueryWizardPage.getQueryDescription());
		this.modelQuery.getScope().addAll(this.createQueryWizardPage.getScope());
		this.modelQuery.setReturnType(this.createQueryWizardPage.getReturnType());
		this.modelQuery.setLowerBound(0);
		if (this.createQueryWizardPage.isReturnTypeMultiValued()) {
			this.modelQuery.setUpperBound(-1);
		} else {
			this.modelQuery.setUpperBound(1);
		}
	}

	@Override
	public boolean performFinish() {
		try {
			createQuery();
			this.newQueryClassWizardPage.apply(this.modelQuery);

			ModelQuerySet catalogQuerySet = this.createQueryWizardPage.getQuerySet();
			String querySetName = catalogQuerySet.getName();

			if (this.resourceToEdit != null) {
				ModelQuerySet querySet = (ModelQuerySet) this.resourceToEdit.getContents().get(0);
				// querySet.getQueries().add(this.modelQuery);
				CompoundCommand compoundCommand = new CompoundCommand();
				Command cmd = AddCommand.create(this.editingDomain, querySet,
						QueryPackage.Literals.MODEL_QUERY_SET__QUERIES, this.modelQuery);
				compoundCommand.append(cmd);
				configureQuerySet(querySet, compoundCommand);
				this.editingDomain.getCommandStack().execute(compoundCommand);
			} else {
				URI uri = ModelQuerySetCatalog.getSingleton().getURI(querySetName);
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.createResource(uri);
				resource.load(Collections.emptyMap());
				ModelQuerySet querySet = (ModelQuerySet) resource.getContents().get(0);
				querySet.getQueries().add(this.modelQuery);
				configureQuerySet(querySet);
				resource.save(Collections.emptyMap());
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
			return false;
		}
		return true;
	}

	private void configureQuerySet(final ModelQuerySet querySet) {
		EPackage returnTypePackage = this.modelQuery.getReturnType().getEPackage();
		querySet.getAssociatedMetamodels().add(returnTypePackage);
		EList<EClass> scope = this.modelQuery.getScope();
		for (EClass scopeElement : scope) {
			querySet.getAssociatedMetamodels().add(scopeElement.getEPackage());
		}
	}

	private void configureQuerySet(final ModelQuerySet querySet,
			final CompoundCommand compoundCommand) {
		Collection<EObject> packagesToAdd = new ArrayList<EObject>();
		EPackage returnTypePackage = this.modelQuery.getReturnType().getEPackage();
		if (!querySet.getAssociatedMetamodels().contains(returnTypePackage)) {
			packagesToAdd.add(returnTypePackage);
		}

		EList<EClass> scope = this.modelQuery.getScope();
		for (EClass scopeElement : scope) {
			EPackage scopePackage = scopeElement.getEPackage();
			if (!querySet.getAssociatedMetamodels().contains(scopePackage)
					&& !packagesToAdd.contains(scopePackage)) {
				packagesToAdd.add(scopePackage);
			}
		}

		if (!packagesToAdd.isEmpty()) {
			Command cmd = AddCommand.create(this.editingDomain, querySet,
					QueryPackage.Literals.MODEL_QUERY_SET__ASSOCIATED_METAMODELS, packagesToAdd);
			if (cmd.canExecute()) {
				compoundCommand.append(cmd);
			} else {
				MoDiscoLogger.logWarning(
						"Couldn't automatically add EPackages to QuerySet: " + packagesToAdd, //$NON-NLS-1$
						Activator.getDefault());
			}
		}
	}

	public ModelQuery getCreatedModelQuery() {
		return this.modelQuery;
	}
}
