/**
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.catalog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Discovery/0.1.incubation/discovery/catalog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogPackage eINSTANCE = org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl <em>Discoverer Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDiscovererDescription()
	 * @generated
	 */
	int DISCOVERER_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Parameter Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_DESCRIPTION__ID = 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_DESCRIPTION__SOURCE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Implementation Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE = 4;

	/**
	 * The number of structural features of the '<em>Discoverer Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl <em>Discoverer Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDiscovererParameter()
	 * @generated
	 */
	int DISCOVERER_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Discoverer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__DISCOVERER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__ID = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Required Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__REQUIRED_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__FIELD = 6;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__GETTER = 7;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__SETTER = 8;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER__INITIALIZER = 9;

	/**
	 * The number of structural features of the '<em>Discoverer Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_PARAMETER_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererCatalogImpl <em>Discoverer Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererCatalogImpl
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDiscovererCatalog()
	 * @generated
	 */
	int DISCOVERER_CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Installed Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_CATALOG__INSTALLED_ENTRIES = org.eclipse.modisco.facet.util.emf.catalog.CatalogPackage.CATALOG__INSTALLED_ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_CATALOG__NAME = org.eclipse.modisco.facet.util.emf.catalog.CatalogPackage.CATALOG__NAME;

	/**
	 * The feature id for the '<em><b>Installed Discoverers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_CATALOG__INSTALLED_DISCOVERERS = org.eclipse.modisco.facet.util.emf.catalog.CatalogPackage.CATALOG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discoverer Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERER_CATALOG_FEATURE_COUNT = org.eclipse.modisco.facet.util.emf.catalog.CatalogPackage.CATALOG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.catalog.DirectionKind <em>Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.catalog.DirectionKind
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDirectionKind()
	 * @generated
	 */
	int DIRECTION_KIND = 3;

	/**
	 * The meta object id for the '<em>EString To Object Map Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map.Entry
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getEStringToObjectMapEntry()
	 * @generated
	 */
	int ESTRING_TO_OBJECT_MAP_ENTRY = 4;

	/**
	 * The meta object id for the '<em>Bundle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Bundle
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 5;

	/**
	 * The meta object id for the '<em>Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Method
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 6;

	/**
	 * The meta object id for the '<em>Field</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Field
	 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription <em>Discoverer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discoverer Description</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription
	 * @generated
	 */
	EClass getDiscovererDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getParameterDefinitions <em>Parameter Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Definitions</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getParameterDefinitions()
	 * @see #getDiscovererDescription()
	 * @generated
	 */
	EReference getDiscovererDescription_ParameterDefinitions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getId()
	 * @see #getDiscovererDescription()
	 * @generated
	 */
	EAttribute getDiscovererDescription_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getSourceType()
	 * @see #getDiscovererDescription()
	 * @generated
	 */
	EAttribute getDiscovererDescription_SourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationType()
	 * @see #getDiscovererDescription()
	 * @generated
	 */
	EAttribute getDiscovererDescription_ImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationBundle <em>Implementation Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Bundle</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getImplementationBundle()
	 * @see #getDiscovererDescription()
	 * @generated
	 */
	EAttribute getDiscovererDescription_ImplementationBundle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter <em>Discoverer Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discoverer Parameter</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter
	 * @generated
	 */
	EClass getDiscovererParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDiscoverer <em>Discoverer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Discoverer</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDiscoverer()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EReference getDiscovererParameter_Discoverer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getId()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDirection()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDescription()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#isRequiredInput <em>Required Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Input</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#isRequiredInput()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_RequiredInput();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getType()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getField()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getGetter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getGetter()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Getter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getSetter()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Setter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initializer</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getInitializer()
	 * @see #getDiscovererParameter()
	 * @generated
	 */
	EAttribute getDiscovererParameter_Initializer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog <em>Discoverer Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discoverer Catalog</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog
	 * @generated
	 */
	EClass getDiscovererCatalog();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog#getInstalledDiscoverers <em>Installed Discoverers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Installed Discoverers</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog#getInstalledDiscoverers()
	 * @see #getDiscovererCatalog()
	 * @generated
	 */
	EReference getDiscovererCatalog_InstalledDiscoverers();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.infra.discovery.catalog.DirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind</em>'.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DirectionKind
	 * @generated
	 */
	EEnum getDirectionKind();

	/**
	 * Returns the meta object for data type '{@link java.util.Map.Entry <em>EString To Object Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString To Object Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model instanceClass="java.util.Map.Entry<java.lang.Object, java.lang.Object>" serializeable="false"
	 * @generated
	 */
	EDataType getEStringToObjectMapEntry();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bundle</em>'.
	 * @see org.osgi.framework.Bundle
	 * @model instanceClass="org.osgi.framework.Bundle" serializeable="false"
	 * @generated
	 */
	EDataType getBundle();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method</em>'.
	 * @see java.lang.reflect.Method
	 * @model instanceClass="java.lang.reflect.Method" serializeable="false"
	 * @generated
	 */
	EDataType getMethod();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Field</em>'.
	 * @see java.lang.reflect.Field
	 * @model instanceClass="java.lang.reflect.Field" serializeable="false"
	 * @generated
	 */
	EDataType getField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogFactory getCatalogFactory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl <em>Discoverer Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDiscovererDescription()
		 * @generated
		 */
		EClass DISCOVERER_DESCRIPTION = eINSTANCE.getDiscovererDescription();

		/**
		 * The meta object literal for the '<em><b>Parameter Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS = eINSTANCE.getDiscovererDescription_ParameterDefinitions();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_DESCRIPTION__ID = eINSTANCE.getDiscovererDescription_Id();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_DESCRIPTION__SOURCE_TYPE = eINSTANCE.getDiscovererDescription_SourceType();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE = eINSTANCE.getDiscovererDescription_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Implementation Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE = eINSTANCE.getDiscovererDescription_ImplementationBundle();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl <em>Discoverer Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererParameterImpl
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDiscovererParameter()
		 * @generated
		 */
		EClass DISCOVERER_PARAMETER = eINSTANCE.getDiscovererParameter();

		/**
		 * The meta object literal for the '<em><b>Discoverer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERER_PARAMETER__DISCOVERER = eINSTANCE.getDiscovererParameter_Discoverer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__ID = eINSTANCE.getDiscovererParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__DIRECTION = eINSTANCE.getDiscovererParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__DESCRIPTION = eINSTANCE.getDiscovererParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Required Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__REQUIRED_INPUT = eINSTANCE.getDiscovererParameter_RequiredInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__TYPE = eINSTANCE.getDiscovererParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__FIELD = eINSTANCE.getDiscovererParameter_Field();

		/**
		 * The meta object literal for the '<em><b>Getter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__GETTER = eINSTANCE.getDiscovererParameter_Getter();

		/**
		 * The meta object literal for the '<em><b>Setter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__SETTER = eINSTANCE.getDiscovererParameter_Setter();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERER_PARAMETER__INITIALIZER = eINSTANCE.getDiscovererParameter_Initializer();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererCatalogImpl <em>Discoverer Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererCatalogImpl
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDiscovererCatalog()
		 * @generated
		 */
		EClass DISCOVERER_CATALOG = eINSTANCE.getDiscovererCatalog();

		/**
		 * The meta object literal for the '<em><b>Installed Discoverers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERER_CATALOG__INSTALLED_DISCOVERERS = eINSTANCE.getDiscovererCatalog_InstalledDiscoverers();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.catalog.DirectionKind <em>Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.catalog.DirectionKind
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getDirectionKind()
		 * @generated
		 */
		EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

		/**
		 * The meta object literal for the '<em>EString To Object Map Entry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map.Entry
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getEStringToObjectMapEntry()
		 * @generated
		 */
		EDataType ESTRING_TO_OBJECT_MAP_ENTRY = eINSTANCE.getEStringToObjectMapEntry();

		/**
		 * The meta object literal for the '<em>Bundle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Bundle
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getBundle()
		 * @generated
		 */
		EDataType BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em>Method</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Method
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getMethod()
		 * @generated
		 */
		EDataType METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em>Field</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Field
		 * @see org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl#getField()
		 * @generated
		 */
		EDataType FIELD = eINSTANCE.getField();

	}

} //CatalogPackage
