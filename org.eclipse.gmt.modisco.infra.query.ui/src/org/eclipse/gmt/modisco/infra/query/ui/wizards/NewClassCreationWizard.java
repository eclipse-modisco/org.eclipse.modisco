/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software)
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.query.JavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.ui.Activator;
import org.eclipse.gmt.modisco.infra.query.ui.exceptions.ClassAlreadyExistsException;
import org.eclipse.gmt.modisco.infra.query.ui.exceptions.ResourceURIExpectedException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.wizard.Wizard;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class NewClassCreationWizard extends Wizard {

	private final JavaModelQuery query;
	private NewQueryClassWizardPage mainPage;
	private final EditingDomain editingDomain;

	public NewClassCreationWizard(final JavaModelQuery query, final EditingDomain editingDomain)
			throws ClassAlreadyExistsException, ResourceURIExpectedException, JavaModelException {
		this.query = query;
		this.editingDomain = editingDomain;

		// check that the resource is from a platform URI
		Resource resource = query.eResource();
		URI uri = resource.getURI();
		if (!uri.isPlatformResource()) {
			throw new ResourceURIExpectedException();
		}
		// check that the class doesn't already exist
		String projectName = uri.segment(1);
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject project = ws.getRoot().getProject(projectName);
		IJavaProject javaProject = JavaCore.create(project);
		String implementationClassName = this.query.getImplementationClassName();
		if (implementationClassName != null
				&& javaProject.findType(implementationClassName) != null) {
			throw new ClassAlreadyExistsException();
		}
	}

	@Override
	public void addPages() {
		this.mainPage = new NewQueryClassWizardPage(this.editingDomain);
		addPage(this.mainPage);
		this.mainPage.init(this.query.getModelQuerySet(), this.query);
	}

	@Override
	public boolean performFinish() {
		try {
			this.mainPage.apply(this.query);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
			return false;
		}
		return true;
	}
}
