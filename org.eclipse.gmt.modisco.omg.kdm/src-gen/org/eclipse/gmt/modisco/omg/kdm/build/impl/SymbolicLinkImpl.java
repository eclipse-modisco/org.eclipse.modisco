/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.build.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.omg.kdm.build.AbstractBuildRelationship;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.gmt.modisco.omg.kdm.build.SymbolicLink;
import org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbolic Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.build.impl.SymbolicLinkImpl#getBuildRelation <em>Build Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolicLinkImpl extends KDMEntityImpl implements SymbolicLink {
	/**
	 * The cached value of the '{@link #getBuildRelation() <em>Build Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractBuildRelationship> buildRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.SYMBOLIC_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractBuildRelationship> getBuildRelation() {
		if (buildRelation == null) {
			buildRelation = new EObjectContainmentEList<AbstractBuildRelationship>(AbstractBuildRelationship.class, this, BuildPackage.SYMBOLIC_LINK__BUILD_RELATION);
		}
		return buildRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildPackage.SYMBOLIC_LINK__BUILD_RELATION:
				return ((InternalEList<?>)getBuildRelation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildPackage.SYMBOLIC_LINK__BUILD_RELATION:
				return getBuildRelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuildPackage.SYMBOLIC_LINK__BUILD_RELATION:
				getBuildRelation().clear();
				getBuildRelation().addAll((Collection<? extends AbstractBuildRelationship>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuildPackage.SYMBOLIC_LINK__BUILD_RELATION:
				getBuildRelation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuildPackage.SYMBOLIC_LINK__BUILD_RELATION:
				return buildRelation != null && !buildRelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SymbolicLinkImpl
