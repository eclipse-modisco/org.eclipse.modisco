/**
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.facet.tests.emf;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.gmt.modisco.infra.facet.FacetFactory;
import org.eclipse.gmt.modisco.infra.facet.FacetReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacetReferenceTest extends TestCase {

	/**
	 * The fixture for this Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FacetReferenceTest.class);
	}

	/**
	 * Constructs a new Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FacetReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetReference getFixture() {
		return this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FacetFactory.eINSTANCE.createFacetReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FacetReferenceTest
