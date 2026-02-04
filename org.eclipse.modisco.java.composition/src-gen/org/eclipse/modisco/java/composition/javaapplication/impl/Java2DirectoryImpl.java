/**
 *  Copyright (c) 2010, 2019 Mia-Software and others.
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage;
import org.eclipse.modisco.omg.kdm.source.Directory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java2 Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl#getJava2FileChildren <em>Java2 File Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Java2DirectoryImpl extends EObjectImpl implements Java2Directory {
	/**
	 * The cached value of the '{@link #getJavaPackage() <em>Java Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaPackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.java.Package javaPackage;

	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected EList<Directory> directory;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected JavaApplication parent;

	/**
	 * The cached value of the '{@link #getJava2FileChildren() <em>Java2 File Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava2FileChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Java2File> java2FileChildren;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Java2DirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaapplicationPackage.Literals.JAVA2_DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package getJavaPackage() {
		if (javaPackage != null && javaPackage.eIsProxy()) {
			InternalEObject oldJavaPackage = (InternalEObject)javaPackage;
			javaPackage = (org.eclipse.modisco.java.Package)eResolveProxy(oldJavaPackage);
			if (javaPackage != oldJavaPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaapplicationPackage.JAVA2_DIRECTORY__JAVA_PACKAGE, oldJavaPackage, javaPackage));
			}
		}
		return javaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package basicGetJavaPackage() {
		return javaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaPackage(org.eclipse.modisco.java.Package newJavaPackage) {
		org.eclipse.modisco.java.Package oldJavaPackage = javaPackage;
		javaPackage = newJavaPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA2_DIRECTORY__JAVA_PACKAGE, oldJavaPackage, javaPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directory> getDirectory() {
		if (directory == null) {
			directory = new EObjectResolvingEList<Directory>(Directory.class, this, JavaapplicationPackage.JAVA2_DIRECTORY__DIRECTORY);
		}
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaApplication getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (JavaApplication)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaapplicationPackage.JAVA2_DIRECTORY__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaApplication basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(JavaApplication newParent, NotificationChain msgs) {
		JavaApplication oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA2_DIRECTORY__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(JavaApplication newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN, JavaApplication.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN, JavaApplication.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA2_DIRECTORY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Java2File> getJava2FileChildren() {
		if (java2FileChildren == null) {
			java2FileChildren = new EObjectWithInverseResolvingEList<Java2File>(Java2File.class, this, JavaapplicationPackage.JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN, JavaapplicationPackage.JAVA2_FILE__PARENT);
		}
		return java2FileChildren;
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
			case JavaapplicationPackage.JAVA2_DIRECTORY__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, JavaapplicationPackage.JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN, JavaApplication.class, msgs);
				return basicSetParent((JavaApplication)otherEnd, msgs);
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJava2FileChildren()).basicAdd(otherEnd, msgs);
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
			case JavaapplicationPackage.JAVA2_DIRECTORY__PARENT:
				return basicSetParent(null, msgs);
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN:
				return ((InternalEList<?>)getJava2FileChildren()).basicRemove(otherEnd, msgs);
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
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA_PACKAGE:
				if (resolve) return getJavaPackage();
				return basicGetJavaPackage();
			case JavaapplicationPackage.JAVA2_DIRECTORY__DIRECTORY:
				return getDirectory();
			case JavaapplicationPackage.JAVA2_DIRECTORY__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN:
				return getJava2FileChildren();
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
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA_PACKAGE:
				setJavaPackage((org.eclipse.modisco.java.Package)newValue);
				return;
			case JavaapplicationPackage.JAVA2_DIRECTORY__DIRECTORY:
				getDirectory().clear();
				getDirectory().addAll((Collection<? extends Directory>)newValue);
				return;
			case JavaapplicationPackage.JAVA2_DIRECTORY__PARENT:
				setParent((JavaApplication)newValue);
				return;
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN:
				getJava2FileChildren().clear();
				getJava2FileChildren().addAll((Collection<? extends Java2File>)newValue);
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
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA_PACKAGE:
				setJavaPackage((org.eclipse.modisco.java.Package)null);
				return;
			case JavaapplicationPackage.JAVA2_DIRECTORY__DIRECTORY:
				getDirectory().clear();
				return;
			case JavaapplicationPackage.JAVA2_DIRECTORY__PARENT:
				setParent((JavaApplication)null);
				return;
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN:
				getJava2FileChildren().clear();
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
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA_PACKAGE:
				return javaPackage != null;
			case JavaapplicationPackage.JAVA2_DIRECTORY__DIRECTORY:
				return directory != null && !directory.isEmpty();
			case JavaapplicationPackage.JAVA2_DIRECTORY__PARENT:
				return parent != null;
			case JavaapplicationPackage.JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN:
				return java2FileChildren != null && !java2FileChildren.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Java2DirectoryImpl
