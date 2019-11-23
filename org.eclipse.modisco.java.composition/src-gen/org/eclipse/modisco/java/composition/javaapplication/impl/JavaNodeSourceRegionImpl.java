/**
 *  Copyright (c) 2010, 2019 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *          Fabien Giquel (Mia-Software) - initial API and implementation
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage;
import org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Node Source Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaNodeSourceRegionImpl#getJavaNode <em>Java Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaNodeSourceRegionImpl extends ASTNodeSourceRegionImpl implements JavaNodeSourceRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaNodeSourceRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaapplicationPackage.Literals.JAVA_NODE_SOURCE_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode getJavaNode() {
		ASTNode javaNode = basicGetJavaNode();
		return javaNode != null && javaNode.eIsProxy() ? (ASTNode)eResolveProxy((InternalEObject)javaNode) : javaNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ASTNode basicGetJavaNode() {
		return (ASTNode) this.getNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaapplicationPackage.JAVA_NODE_SOURCE_REGION__JAVA_NODE:
				if (resolve) return getJavaNode();
				return basicGetJavaNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaapplicationPackage.JAVA_NODE_SOURCE_REGION__JAVA_NODE:
				return basicGetJavaNode() != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaNodeSourceRegionImpl
