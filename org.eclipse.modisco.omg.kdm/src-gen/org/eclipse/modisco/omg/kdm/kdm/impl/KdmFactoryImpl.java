/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.kdm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.omg.kdm.kdm.Annotation;
import org.eclipse.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.modisco.omg.kdm.kdm.Audit;
import org.eclipse.modisco.omg.kdm.kdm.ExtensionFamily;
import org.eclipse.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.modisco.omg.kdm.kdm.Segment;
import org.eclipse.modisco.omg.kdm.kdm.Stereotype;
import org.eclipse.modisco.omg.kdm.kdm.TagDefinition;
import org.eclipse.modisco.omg.kdm.kdm.TaggedRef;
import org.eclipse.modisco.omg.kdm.kdm.TaggedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KdmFactoryImpl extends EFactoryImpl implements KdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KdmFactory init() {
		try {
			KdmFactory theKdmFactory = (KdmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/kdm"); //$NON-NLS-1$ 
			if (theKdmFactory != null) {
				return theKdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmFactoryImpl() {
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
			case KdmPackage.SEGMENT: return createSegment();
			case KdmPackage.AUDIT: return createAudit();
			case KdmPackage.STEREOTYPE: return createStereotype();
			case KdmPackage.TAG_DEFINITION: return createTagDefinition();
			case KdmPackage.EXTENSION_FAMILY: return createExtensionFamily();
			case KdmPackage.TAGGED_VALUE: return createTaggedValue();
			case KdmPackage.TAGGED_REF: return createTaggedRef();
			case KdmPackage.ATTRIBUTE: return createAttribute();
			case KdmPackage.ANNOTATION: return createAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audit createAudit() {
		AuditImpl audit = new AuditImpl();
		return audit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagDefinition createTagDefinition() {
		TagDefinitionImpl tagDefinition = new TagDefinitionImpl();
		return tagDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionFamily createExtensionFamily() {
		ExtensionFamilyImpl extensionFamily = new ExtensionFamilyImpl();
		return extensionFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValue createTaggedValue() {
		TaggedValueImpl taggedValue = new TaggedValueImpl();
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedRef createTaggedRef() {
		TaggedRefImpl taggedRef = new TaggedRefImpl();
		return taggedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmPackage getKdmPackage() {
		return (KdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KdmPackage getPackage() {
		return KdmPackage.eINSTANCE;
	}

} //KdmFactoryImpl
