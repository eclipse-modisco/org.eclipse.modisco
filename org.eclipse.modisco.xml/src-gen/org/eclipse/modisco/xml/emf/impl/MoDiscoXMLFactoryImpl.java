/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.xml.emf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.xml.*;
import org.eclipse.modisco.xml.emf.MoDiscoXMLFactory;
import org.eclipse.modisco.xml.emf.MoDiscoXMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoDiscoXMLFactoryImpl extends EFactoryImpl implements MoDiscoXMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoDiscoXMLFactory init() {
		try {
			MoDiscoXMLFactory theMoDiscoXMLFactory = (MoDiscoXMLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Xml/0.1.incubation/XML");  //$NON-NLS-1$
			if (theMoDiscoXMLFactory != null) {
				return theMoDiscoXMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MoDiscoXMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoDiscoXMLFactoryImpl() {
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
			case MoDiscoXMLPackage.ATTRIBUTE: return createAttribute();
			case MoDiscoXMLPackage.TEXT: return createText();
			case MoDiscoXMLPackage.ELEMENT: return createElement();
			case MoDiscoXMLPackage.ROOT: return createRoot();
			case MoDiscoXMLPackage.NAMESPACE: return createNamespace();
			case MoDiscoXMLPackage.COMMENT: return createComment();
			case MoDiscoXMLPackage.DOCUMENT_TYPE_DECLARATION: return createDocumentTypeDeclaration();
			case MoDiscoXMLPackage.CDATA: return createCDATA();
			case MoDiscoXMLPackage.PROCESSING_INSTRUCTION: return createProcessingInstruction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");  //$NON-NLS-1$//$NON-NLS-2$
		}
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
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTypeDeclaration createDocumentTypeDeclaration() {
		DocumentTypeDeclarationImpl documentTypeDeclaration = new DocumentTypeDeclarationImpl();
		return documentTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDATA createCDATA() {
		CDATAImpl cdata = new CDATAImpl();
		return cdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingInstruction createProcessingInstruction() {
		ProcessingInstructionImpl processingInstruction = new ProcessingInstructionImpl();
		return processingInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoDiscoXMLPackage getMoDiscoXMLPackage() {
		return (MoDiscoXMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MoDiscoXMLPackage getPackage() {
		return MoDiscoXMLPackage.eINSTANCE;
	}

} //MoDiscoXMLFactoryImpl
