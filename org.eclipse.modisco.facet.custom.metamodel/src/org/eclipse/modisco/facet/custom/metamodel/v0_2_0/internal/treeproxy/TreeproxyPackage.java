/**
 * Copyright (c) 2012,2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements() 
 *    Thomas Cicognani (Soft-Maint) - Bug 441321 - isVisible customisation doesn't work after refreshing a tree
 */
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TreeproxyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "treeproxy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/facet/custom/0.2.incubation/internal/treeproxy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "treeproxy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TreeproxyPackage eINSTANCE = org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeElementImpl <em>Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeElementImpl
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getTreeElement()
	 * @generated
	 */
	int TREE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__CHILDREN = 1;

	/**
	 * The number of structural features of the '<em>Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl <em>EObject Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEObjectTreeElement()
	 * @generated
	 */
	int EOBJECT_TREE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ELEMENT__PARENT = TREE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ELEMENT__CHILDREN = TREE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ELEMENT__EOBJECT = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ELEMENT_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EStructuralFeatureTreeElementImpl <em>EStructural Feature Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EStructuralFeatureTreeElementImpl
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEStructuralFeatureTreeElement()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_TREE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ELEMENT__PARENT = TREE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ELEMENT__CHILDREN = TREE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ELEMENT__ESTRUCTURAL_FEATURE = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EStructural Feature Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ELEMENT_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EReferenceTreeElementImpl <em>EReference Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EReferenceTreeElementImpl
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEReferenceTreeElement()
	 * @generated
	 */
	int EREFERENCE_TREE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_TREE_ELEMENT__PARENT = ESTRUCTURAL_FEATURE_TREE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_TREE_ELEMENT__CHILDREN = ESTRUCTURAL_FEATURE_TREE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_TREE_ELEMENT__ESTRUCTURAL_FEATURE = ESTRUCTURAL_FEATURE_TREE_ELEMENT__ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_TREE_ELEMENT__EREFERENCE = ESTRUCTURAL_FEATURE_TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EReference Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_TREE_ELEMENT_FEATURE_COUNT = ESTRUCTURAL_FEATURE_TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EAttributeTreeElementImpl <em>EAttribute Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EAttributeTreeElementImpl
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEAttributeTreeElement()
	 * @generated
	 */
	int EATTRIBUTE_TREE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_TREE_ELEMENT__PARENT = ESTRUCTURAL_FEATURE_TREE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_TREE_ELEMENT__CHILDREN = ESTRUCTURAL_FEATURE_TREE_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_TREE_ELEMENT__ESTRUCTURAL_FEATURE = ESTRUCTURAL_FEATURE_TREE_ELEMENT__ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_TREE_ELEMENT__EATTRIBUTE = ESTRUCTURAL_FEATURE_TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAttribute Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_TREE_ELEMENT_FEATURE_COUNT = ESTRUCTURAL_FEATURE_TREE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement <em>Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Element</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement
	 * @generated
	 */
	EClass getTreeElement();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getParent()
	 * @see #getTreeElement()
	 * @generated
	 */
	EReference getTreeElement_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getChildren()
	 * @see #getTreeElement()
	 * @generated
	 */
	EReference getTreeElement_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement <em>EObject Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Tree Element</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement
	 * @generated
	 */
	EClass getEObjectTreeElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EObject</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement#getEObject()
	 * @see #getEObjectTreeElement()
	 * @generated
	 */
	EReference getEObjectTreeElement_EObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement <em>EReference Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference Tree Element</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement
	 * @generated
	 */
	EClass getEReferenceTreeElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement#getEReference()
	 * @see #getEReferenceTreeElement()
	 * @generated
	 */
	EReference getEReferenceTreeElement_EReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement <em>EAttribute Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute Tree Element</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement
	 * @generated
	 */
	EClass getEAttributeTreeElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement#getEAttribute()
	 * @see #getEAttributeTreeElement()
	 * @generated
	 */
	EReference getEAttributeTreeElement_EAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement <em>EStructural Feature Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature Tree Element</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement
	 * @generated
	 */
	EClass getEStructuralFeatureTreeElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement#getEStructuralFeature()
	 * @see #getEStructuralFeatureTreeElement()
	 * @generated
	 */
	EReference getEStructuralFeatureTreeElement_EStructuralFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TreeproxyFactory getTreeproxyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeElementImpl <em>Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeElementImpl
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getTreeElement()
		 * @generated
		 */
		EClass TREE_ELEMENT = eINSTANCE.getTreeElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEMENT__PARENT = eINSTANCE.getTreeElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEMENT__CHILDREN = eINSTANCE.getTreeElement_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl <em>EObject Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEObjectTreeElement()
		 * @generated
		 */
		EClass EOBJECT_TREE_ELEMENT = eINSTANCE.getEObjectTreeElement();

		/**
		 * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_TREE_ELEMENT__EOBJECT = eINSTANCE.getEObjectTreeElement_EObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EReferenceTreeElementImpl <em>EReference Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EReferenceTreeElementImpl
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEReferenceTreeElement()
		 * @generated
		 */
		EClass EREFERENCE_TREE_ELEMENT = eINSTANCE.getEReferenceTreeElement();

		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE_TREE_ELEMENT__EREFERENCE = eINSTANCE.getEReferenceTreeElement_EReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EAttributeTreeElementImpl <em>EAttribute Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EAttributeTreeElementImpl
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEAttributeTreeElement()
		 * @generated
		 */
		EClass EATTRIBUTE_TREE_ELEMENT = eINSTANCE.getEAttributeTreeElement();

		/**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE_TREE_ELEMENT__EATTRIBUTE = eINSTANCE.getEAttributeTreeElement_EAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EStructuralFeatureTreeElementImpl <em>EStructural Feature Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EStructuralFeatureTreeElementImpl
		 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeproxyPackageImpl#getEStructuralFeatureTreeElement()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_TREE_ELEMENT = eINSTANCE.getEStructuralFeatureTreeElement();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_TREE_ELEMENT__ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeatureTreeElement_EStructuralFeature();

	}

} //TreeproxyPackage
