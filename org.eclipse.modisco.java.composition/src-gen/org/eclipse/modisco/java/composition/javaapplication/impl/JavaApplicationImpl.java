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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaJar2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage;
import org.eclipse.modisco.omg.kdm.source.InventoryModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl#getJavaModel <em>Java Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl#getDeploymentModel <em>Deployment Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl#getJava2DirectoryChildren <em>Java2 Directory Children</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl#getJar2FileChildren <em>Jar2 File Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaApplicationImpl extends EObjectImpl implements JavaApplication {
	/**
	 * The cached value of the '{@link #getJavaModel() <em>Java Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaModel()
	 * @generated
	 * @ordered
	 */
	protected Model javaModel;

	/**
	 * The cached value of the '{@link #getDeploymentModel() <em>Deployment Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentModel()
	 * @generated
	 * @ordered
	 */
	protected InventoryModel deploymentModel;

	/**
	 * The cached value of the '{@link #getJava2DirectoryChildren() <em>Java2 Directory Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava2DirectoryChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Java2Directory> java2DirectoryChildren;

	/**
	 * The cached value of the '{@link #getJar2FileChildren() <em>Jar2 File Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJar2FileChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaJar2File> jar2FileChildren;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaapplicationPackage.Literals.JAVA_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getJavaModel() {
		if (javaModel != null && javaModel.eIsProxy()) {
			InternalEObject oldJavaModel = (InternalEObject)javaModel;
			javaModel = (Model)eResolveProxy(oldJavaModel);
			if (javaModel != oldJavaModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaapplicationPackage.JAVA_APPLICATION__JAVA_MODEL, oldJavaModel, javaModel));
			}
		}
		return javaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetJavaModel() {
		return javaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaModel(Model newJavaModel) {
		Model oldJavaModel = javaModel;
		javaModel = newJavaModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA_APPLICATION__JAVA_MODEL, oldJavaModel, javaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryModel getDeploymentModel() {
		if (deploymentModel != null && deploymentModel.eIsProxy()) {
			InternalEObject oldDeploymentModel = (InternalEObject)deploymentModel;
			deploymentModel = (InventoryModel)eResolveProxy(oldDeploymentModel);
			if (deploymentModel != oldDeploymentModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaapplicationPackage.JAVA_APPLICATION__DEPLOYMENT_MODEL, oldDeploymentModel, deploymentModel));
			}
		}
		return deploymentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryModel basicGetDeploymentModel() {
		return deploymentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentModel(InventoryModel newDeploymentModel) {
		InventoryModel oldDeploymentModel = deploymentModel;
		deploymentModel = newDeploymentModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA_APPLICATION__DEPLOYMENT_MODEL, oldDeploymentModel, deploymentModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Java2Directory> getJava2DirectoryChildren() {
		if (java2DirectoryChildren == null) {
			java2DirectoryChildren = new EObjectWithInverseResolvingEList<Java2Directory>(Java2Directory.class, this, JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN, JavaapplicationPackage.JAVA2_DIRECTORY__PARENT);
		}
		return java2DirectoryChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaJar2File> getJar2FileChildren() {
		if (jar2FileChildren == null) {
			jar2FileChildren = new EObjectContainmentWithInverseEList<JavaJar2File>(JavaJar2File.class, this, JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN, JavaapplicationPackage.JAVA_JAR2_FILE__PARENT);
		}
		return jar2FileChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJava2DirectoryChildren()).basicAdd(otherEnd, msgs);
			case JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJar2FileChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN:
				return ((InternalEList<?>)getJava2DirectoryChildren()).basicRemove(otherEnd, msgs);
			case JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN:
				return ((InternalEList<?>)getJar2FileChildren()).basicRemove(otherEnd, msgs);
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
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA_MODEL:
				if (resolve) return getJavaModel();
				return basicGetJavaModel();
			case JavaapplicationPackage.JAVA_APPLICATION__DEPLOYMENT_MODEL:
				if (resolve) return getDeploymentModel();
				return basicGetDeploymentModel();
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN:
				return getJava2DirectoryChildren();
			case JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN:
				return getJar2FileChildren();
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
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA_MODEL:
				setJavaModel((Model)newValue);
				return;
			case JavaapplicationPackage.JAVA_APPLICATION__DEPLOYMENT_MODEL:
				setDeploymentModel((InventoryModel)newValue);
				return;
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN:
				getJava2DirectoryChildren().clear();
				getJava2DirectoryChildren().addAll((Collection<? extends Java2Directory>)newValue);
				return;
			case JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN:
				getJar2FileChildren().clear();
				getJar2FileChildren().addAll((Collection<? extends JavaJar2File>)newValue);
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
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA_MODEL:
				setJavaModel((Model)null);
				return;
			case JavaapplicationPackage.JAVA_APPLICATION__DEPLOYMENT_MODEL:
				setDeploymentModel((InventoryModel)null);
				return;
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN:
				getJava2DirectoryChildren().clear();
				return;
			case JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN:
				getJar2FileChildren().clear();
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
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA_MODEL:
				return javaModel != null;
			case JavaapplicationPackage.JAVA_APPLICATION__DEPLOYMENT_MODEL:
				return deploymentModel != null;
			case JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN:
				return java2DirectoryChildren != null && !java2DirectoryChildren.isEmpty();
			case JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN:
				return jar2FileChildren != null && !jar2FileChildren.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JavaApplicationImpl
