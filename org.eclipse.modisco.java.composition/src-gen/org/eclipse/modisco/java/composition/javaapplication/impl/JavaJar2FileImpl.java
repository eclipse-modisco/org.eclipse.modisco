/**
 *  Copyright (c) 2010 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *          Fabien Giquel (Mia-Software) - initial API and implementation
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.java.Archive;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaJar2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage;
import org.eclipse.modisco.omg.kdm.source.BinaryFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Jar2 File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaJar2FileImpl#getJavaArchive <em>Java Archive</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaJar2FileImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaJar2FileImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaJar2FileImpl extends EObjectImpl implements JavaJar2File {
	/**
	 * The cached value of the '{@link #getJavaArchive() <em>Java Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaArchive()
	 * @generated
	 * @ordered
	 */
	protected Archive javaArchive;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected BinaryFile file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaJar2FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaapplicationPackage.Literals.JAVA_JAR2_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive getJavaArchive() {
		if (javaArchive != null && javaArchive.eIsProxy()) {
			InternalEObject oldJavaArchive = (InternalEObject)javaArchive;
			javaArchive = (Archive)eResolveProxy(oldJavaArchive);
			if (javaArchive != oldJavaArchive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaapplicationPackage.JAVA_JAR2_FILE__JAVA_ARCHIVE, oldJavaArchive, javaArchive));
			}
		}
		return javaArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive basicGetJavaArchive() {
		return javaArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaArchive(Archive newJavaArchive) {
		Archive oldJavaArchive = javaArchive;
		javaArchive = newJavaArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA_JAR2_FILE__JAVA_ARCHIVE, oldJavaArchive, javaArchive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFile getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject)file;
			file = (BinaryFile)eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaapplicationPackage.JAVA_JAR2_FILE__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFile basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(BinaryFile newFile) {
		BinaryFile oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA_JAR2_FILE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaApplication getParent() {
		if (eContainerFeatureID() != JavaapplicationPackage.JAVA_JAR2_FILE__PARENT) return null;
		return (JavaApplication)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(JavaApplication newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, JavaapplicationPackage.JAVA_JAR2_FILE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(JavaApplication newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != JavaapplicationPackage.JAVA_JAR2_FILE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN, JavaApplication.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaapplicationPackage.JAVA_JAR2_FILE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaapplicationPackage.JAVA_JAR2_FILE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((JavaApplication)otherEnd, msgs);
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
			case JavaapplicationPackage.JAVA_JAR2_FILE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JavaapplicationPackage.JAVA_JAR2_FILE__PARENT:
				return eInternalContainer().eInverseRemove(this, JavaapplicationPackage.JAVA_APPLICATION__JAR2_FILE_CHILDREN, JavaApplication.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaapplicationPackage.JAVA_JAR2_FILE__JAVA_ARCHIVE:
				if (resolve) return getJavaArchive();
				return basicGetJavaArchive();
			case JavaapplicationPackage.JAVA_JAR2_FILE__FILE:
				if (resolve) return getFile();
				return basicGetFile();
			case JavaapplicationPackage.JAVA_JAR2_FILE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaapplicationPackage.JAVA_JAR2_FILE__JAVA_ARCHIVE:
				setJavaArchive((Archive)newValue);
				return;
			case JavaapplicationPackage.JAVA_JAR2_FILE__FILE:
				setFile((BinaryFile)newValue);
				return;
			case JavaapplicationPackage.JAVA_JAR2_FILE__PARENT:
				setParent((JavaApplication)newValue);
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
			case JavaapplicationPackage.JAVA_JAR2_FILE__JAVA_ARCHIVE:
				setJavaArchive((Archive)null);
				return;
			case JavaapplicationPackage.JAVA_JAR2_FILE__FILE:
				setFile((BinaryFile)null);
				return;
			case JavaapplicationPackage.JAVA_JAR2_FILE__PARENT:
				setParent((JavaApplication)null);
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
			case JavaapplicationPackage.JAVA_JAR2_FILE__JAVA_ARCHIVE:
				return javaArchive != null;
			case JavaapplicationPackage.JAVA_JAR2_FILE__FILE:
				return file != null;
			case JavaapplicationPackage.JAVA_JAR2_FILE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaJar2FileImpl
