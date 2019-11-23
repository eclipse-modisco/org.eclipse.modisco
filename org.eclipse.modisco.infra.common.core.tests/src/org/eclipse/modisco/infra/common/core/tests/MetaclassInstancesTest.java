/*******************************************************************************
 * Copyright (c) 2010, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *     Grégoire Dupé (Mia-Software) - Bug 471096 - MetaclassInstance features have to be moved to an EMF dedicated plug-in
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.tests;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstances;
import org.eclipse.modisco.util.emf.core.internal.allinstances.MetaclassInstancesAdapterFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("nls")
public class MetaclassInstancesTest {

	private MetaclassInstances metaclassInstances;
	private Resource resource;

	@Before
	public void setUp() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		this.resource = resourceSet
				.createResource(URI
						.createURI("http://org.eclipse.modisco.infra.common.core.internal.tests/test.ecore"));

		this.metaclassInstances = (MetaclassInstances) MetaclassInstancesAdapterFactory
				.getInstance().adapt(this.resource, MetaclassInstances.class);
	}

	@Test
	public void testNonExisting() {
		Assert.assertNotNull(this.metaclassInstances);
		Collection<EObject> instances = this.metaclassInstances.getInstances(
				EcorePackage.Literals.EENUM, true);
		Assert.assertTrue(instances.isEmpty());
	}

	@Test
	public void testCreateClass() {
		EClass someClass = EcoreFactory.eINSTANCE.createEClass();
		someClass.setName("MyClass");

		Collection<EObject> instances = this.metaclassInstances.getInstances(
				EcorePackage.Literals.ECLASS, true);
		Assert.assertTrue(instances.isEmpty());

		this.resource.getContents().add(someClass);
		assertContainsMyClass();
	}

	@Test
	public void testCreateAttribute() {
		EClass someClass = EcoreFactory.eINSTANCE.createEClass();
		this.resource.getContents().add(someClass);

		EAttribute companyName = EcoreFactory.eINSTANCE.createEAttribute();
		companyName.setName("myAttribute");
		someClass.getEStructuralFeatures().add(companyName);

		Collection<EObject> instances = this.metaclassInstances.getInstances(
				EcorePackage.Literals.EATTRIBUTE, false);
		Assert.assertTrue(instances.size() == 1);
		EObject eObject = instances.iterator().next();
		Assert.assertTrue(eObject instanceof EAttribute);
		EAttribute eAttribute = (EAttribute) eObject;
		Assert.assertTrue(eAttribute.getName().equals("myAttribute"));
	}

	@Test
	public void testWithPackageAndClasses() {
		EPackage aPackage = EcoreFactory.eINSTANCE.createEPackage();
		this.resource.getContents().add(aPackage);

		aPackage.setName("aPackage");
		aPackage.setNsPrefix("aPackage");
		aPackage.setNsURI("http:///aPackage");

		EClass class1 = EcoreFactory.eINSTANCE.createEClass();
		EClass class2 = EcoreFactory.eINSTANCE.createEClass();
		EClass class3 = EcoreFactory.eINSTANCE.createEClass();

		aPackage.getEClassifiers().add(class1);
		aPackage.getEClassifiers().add(class2);
		aPackage.getEClassifiers().add(class3);

		assertionsForPackageAndClasses();
		this.metaclassInstances.clearCache();
		assertionsForPackageAndClasses();
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testWithPackageAndClasses2() {
		EPackage aPackage = EcoreFactory.eINSTANCE.createEPackage();
		aPackage.setName("aPackage");
		aPackage.setNsPrefix("aPackage");
		aPackage.setNsURI("http:///aPackage");

		EClass class1 = EcoreFactory.eINSTANCE.createEClass();
		EClass class2 = EcoreFactory.eINSTANCE.createEClass();
		EClass class3 = EcoreFactory.eINSTANCE.createEClass();

		EReference ePackageEClassifiers = EcorePackage.eINSTANCE.getEPackage_EClassifiers();
		EList<EClassifier> classifiers = (EList<EClassifier>) aPackage.eGet(ePackageEClassifiers);
		classifiers.add(class1);
		aPackage.getEClassifiers().add(class2);
		classifiers.add(class3);

		this.resource.getContents().add(aPackage);

		assertionsForPackageAndClasses();
		this.metaclassInstances.clearCache();
		assertionsForPackageAndClasses();
	}

	private void assertionsForPackageAndClasses() {
		Collection<EObject> instances = this.metaclassInstances.getInstances(
				EcorePackage.Literals.EPACKAGE, false);
		Assert.assertTrue(instances.size() == 1);
		instances = this.metaclassInstances.getInstances(EcorePackage.Literals.EPACKAGE, true);
		Assert.assertTrue(instances.size() == 1);

		final int nExpectedInstances = 3;
		instances = this.metaclassInstances.getInstances(EcorePackage.Literals.ECLASS, true);
		Assert.assertTrue(instances.size() == nExpectedInstances);
		instances = this.metaclassInstances.getInstances(EcorePackage.Literals.ECLASS, false);
		Assert.assertTrue(instances.size() == nExpectedInstances);
	}

	@Test
	public void testRemoveClassAtRoot() {
		EClass someClass = EcoreFactory.eINSTANCE.createEClass();
		someClass.setName("MyClass");
		this.resource.getContents().add(someClass);
		assertContainsMyClass();
		this.resource.getContents().remove(someClass);
		assertNoClass();
	}

	@Test
	public void testRemoveClassUnderPackage() {
		EPackage aPackage = EcoreFactory.eINSTANCE.createEPackage();
		this.resource.getContents().add(aPackage);
		EClass myClass = EcoreFactory.eINSTANCE.createEClass();
		myClass.setName("MyClass");
		aPackage.getEClassifiers().add(myClass);
		assertContainsMyClass();
		EcoreUtil.remove(myClass);
		assertNoClass();
		aPackage.getEClassifiers().add(myClass);
		assertContainsMyClass();
		aPackage.getEClassifiers().remove(myClass);
		assertNoClass();
	}

	private void assertNoClass() {
		Collection<EObject> instances = this.metaclassInstances.getInstances(
				EcorePackage.Literals.ECLASS, false);
		Assert.assertTrue(instances.size() == 0);
	}

	private void assertContainsMyClass() {
		Collection<EObject> instances = this.metaclassInstances.getInstances(
				EcorePackage.Literals.ECLASS, false);
		Assert.assertTrue(instances.size() == 1);
		EObject eObject = instances.iterator().next();
		Assert.assertTrue(eObject instanceof EClass);
		EClass eClass = (EClass) eObject;
		Assert.assertTrue(eClass.getName().equals("MyClass"));
	}

	@Test
	public void testSubInstances() {
		EPackage aPackage = EcoreFactory.eINSTANCE.createEPackage();
		this.resource.getContents().add(aPackage);

		EClass myClass = EcoreFactory.eINSTANCE.createEClass();
		myClass.setName("MyClass");
		aPackage.getEClassifiers().add(myClass);

		EDataType myDataType = EcoreFactory.eINSTANCE.createEDataType();
		myDataType.setName("MyDataType");
		aPackage.getEClassifiers().add(myDataType);

		Collection<EObject> instances = this.metaclassInstances.getInstances(
				EcorePackage.Literals.ECLASSIFIER, false);
		Assert.assertTrue(instances.size() == 0);

		instances = this.metaclassInstances.getInstances(EcorePackage.Literals.ECLASSIFIER, true);
		Assert.assertTrue(instances.size() == 2);

		Iterator<EObject> iterator = instances.iterator();
		EObject eObject = iterator.next();
		Assert.assertTrue(eObject instanceof EClass);
		EClass eClass = (EClass) eObject;
		Assert.assertTrue(eClass.getName().equals("MyClass"));

		eObject = iterator.next();
		Assert.assertTrue(eObject instanceof EDataType);
		EDataType eDataType = (EDataType) eObject;
		Assert.assertTrue(eDataType.getName().equals("MyDataType"));
	}
}
