/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *
 */
package org.eclipse.modisco.eclipseplugin.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.eclipseplugin.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipsepluginFactoryImpl extends EFactoryImpl implements EclipsepluginFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EclipsepluginFactory init() {
		try {
			EclipsepluginFactory theEclipsepluginFactory = (EclipsepluginFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/eclipseplugin");
			if (theEclipsepluginFactory != null) {
				return theEclipsepluginFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EclipsepluginFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipsepluginFactoryImpl() {
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
			case EclipsepluginPackage.ECLIPSE_PLUGIN: return createEclipsePlugin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipsePlugin createEclipsePlugin() {
		EclipsePluginImpl eclipsePlugin = new EclipsePluginImpl();
		return eclipsePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipsepluginPackage getEclipsepluginPackage() {
		return (EclipsepluginPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EclipsepluginPackage getPackage() {
		return EclipsepluginPackage.eINSTANCE;
	}

} //EclipsepluginFactoryImpl
