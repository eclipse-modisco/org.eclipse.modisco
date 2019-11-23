/*******************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Fabien Giquel (Mia-Software)
 *     Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.tests;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstancesAdapterFactory;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("nls")
public class Bug336903Test {

	private MetaclassInstances metaclassInstances;
	private Resource resource;

	@Before
	public void setUp() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		this.resource = resourceSet
				.createResource(URI
						.createURI("platform:/plugin/org.eclipse.modisco.infra.common.core.tests/resources/bug336903.uml"));

		this.resource.load(null);

		this.metaclassInstances = (MetaclassInstances) MetaclassInstancesAdapterFactory
				.getInstance().adapt(this.resource, MetaclassInstances.class);
	}

	@Test
	public void test336903() {
		Collection<EObject> instances = this.metaclassInstances.getInstances(
				UMLPackage.Literals.TEMPLATE_SIGNATURE, true);
		Assert.assertTrue(instances.size() == 1);

		Model model = (Model) this.resource.getContents().get(0);
		TemplateSignature newTS = UMLFactory.eINSTANCE.createTemplateSignature();
		model.setOwnedTemplateSignature(newTS);

		EClass someClass = EcoreFactory.eINSTANCE.createEClass();
		someClass.setName("MyClass");

		instances = this.metaclassInstances.getInstances(UMLPackage.Literals.TEMPLATE_SIGNATURE,
				true);
		Assert.assertTrue(instances.size() == 1);
	}
}
