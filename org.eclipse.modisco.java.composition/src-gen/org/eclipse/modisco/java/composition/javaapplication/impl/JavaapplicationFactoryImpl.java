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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.java.composition.javaapplication.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaapplicationFactoryImpl extends EFactoryImpl implements JavaapplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaapplicationFactory init() {
		try {
			JavaapplicationFactory theJavaapplicationFactory = (JavaapplicationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Java/Composition/0.1.incubation/javaApplication"); //$NON-NLS-1$ 
			if (theJavaapplicationFactory != null) {
				return theJavaapplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaapplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaapplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaapplicationPackage.JAVA_NODE_SOURCE_REGION: return createJavaNodeSourceRegion();
			case JavaapplicationPackage.JAVA2_FILE: return createJava2File();
			case JavaapplicationPackage.JAVA_APPLICATION: return createJavaApplication();
			case JavaapplicationPackage.JAVA2_DIRECTORY: return createJava2Directory();
			case JavaapplicationPackage.JAVA_JAR2_FILE: return createJavaJar2File();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaNodeSourceRegion createJavaNodeSourceRegion() {
		JavaNodeSourceRegionImpl javaNodeSourceRegion = new JavaNodeSourceRegionImpl();
		return javaNodeSourceRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2File createJava2File() {
		Java2FileImpl java2File = new Java2FileImpl();
		return java2File;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaApplication createJavaApplication() {
		JavaApplicationImpl javaApplication = new JavaApplicationImpl();
		return javaApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2Directory createJava2Directory() {
		Java2DirectoryImpl java2Directory = new Java2DirectoryImpl();
		return java2Directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaJar2File createJavaJar2File() {
		JavaJar2FileImpl javaJar2File = new JavaJar2FileImpl();
		return javaJar2File;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaapplicationPackage getJavaapplicationPackage() {
		return (JavaapplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaapplicationPackage getPackage() {
		return JavaapplicationPackage.eINSTANCE;
	}

} //JavaapplicationFactoryImpl
