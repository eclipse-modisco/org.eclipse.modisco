/**
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.facet.tests.emf;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.gmt.modisco.infra.facet.FacetFactory;
import org.eclipse.gmt.modisco.infra.facet.Shortcut;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shortcut</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShortcutTest extends TestCase {

	/**
	 * The fixture for this Shortcut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shortcut fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShortcutTest.class);
	}

	/**
	 * Constructs a new Shortcut test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shortcut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Shortcut fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shortcut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shortcut getFixture() {
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
		setFixture(FacetFactory.eINSTANCE.createShortcut());
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

} //ShortcutTest
