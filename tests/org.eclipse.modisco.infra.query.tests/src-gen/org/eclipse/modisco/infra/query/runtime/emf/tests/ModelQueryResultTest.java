/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.runtime.emf.tests;

import org.eclipse.modisco.infra.query.runtime.ModelQueryResult;
import org.eclipse.modisco.infra.query.runtime.RuntimeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Query Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelQueryResultTest extends TestCase {

	/**
	 * The fixture for this Model Query Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQueryResult fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelQueryResultTest.class);
	}

	/**
	 * Constructs a new Model Query Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQueryResultTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Query Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelQueryResult fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Query Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQueryResult getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createModelQueryResult());
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

} //ModelQueryResultTest
