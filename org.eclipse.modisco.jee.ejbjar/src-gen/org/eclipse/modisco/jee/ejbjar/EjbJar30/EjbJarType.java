/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejb Jar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The ejb-jarType defines the root element of the EJB
 * 	deployment descriptor. It contains
 * 
 * 	    - an optional description of the ejb-jar file
 * 	    - an optional display name
 * 	    - an optional icon that contains a small and a large
 * 	      icon file name
 * 	    - structural information about all included
 * 	      enterprise beans that is not specified through
 *               annotations
 *             - structural information about interceptor classes
 * 	    - a descriptor for container managed relationships,
 * 	      if any.
 * 	    - an optional application-assembly descriptor
 * 	    - an optional name of an ejb-client-jar file for the
 * 	      ejb-jar.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getInterceptors <em>Interceptors</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getAssemblyDescriptor <em>Assembly Descriptor</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEjbClientJar <em>Ejb Client Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType()
 * @model extendedMetaData="name='ejb-jarType' kind='elementOnly'"
 * @generated
 */
public interface EjbJarType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Enterprise Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise Beans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise Beans</em>' containment reference.
	 * @see #setEnterpriseBeans(EnterpriseBeansType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_EnterpriseBeans()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enterprise-beans' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EnterpriseBeansType getEnterpriseBeans();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEnterpriseBeans <em>Enterprise Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise Beans</em>' containment reference.
	 * @see #getEnterpriseBeans()
	 * @generated
	 */
	void setEnterpriseBeans(EnterpriseBeansType value);

	/**
	 * Returns the value of the '<em><b>Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptors</em>' containment reference.
	 * @see #setInterceptors(InterceptorsType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_Interceptors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptors' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	InterceptorsType getInterceptors();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getInterceptors <em>Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interceptors</em>' containment reference.
	 * @see #getInterceptors()
	 * @generated
	 */
	void setInterceptors(InterceptorsType value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference.
	 * @see #setRelationships(RelationshipsType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_Relationships()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationships' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	RelationshipsType getRelationships();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getRelationships <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationships</em>' containment reference.
	 * @see #getRelationships()
	 * @generated
	 */
	void setRelationships(RelationshipsType value);

	/**
	 * Returns the value of the '<em><b>Assembly Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    Providing an assembly-descriptor in the deployment
	 * 	    descriptor is optional for the ejb-jar file
	 * 	    producer.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Descriptor</em>' containment reference.
	 * @see #setAssemblyDescriptor(AssemblyDescriptorType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_AssemblyDescriptor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assembly-descriptor' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	AssemblyDescriptorType getAssemblyDescriptor();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getAssemblyDescriptor <em>Assembly Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Descriptor</em>' containment reference.
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	void setAssemblyDescriptor(AssemblyDescriptorType value);

	/**
	 * Returns the value of the '<em><b>Ejb Client Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    <![CDATA[
	 * 
	 * 	      The optional ejb-client-jar element specifies a JAR
	 * 	      file that contains the class files necessary for a
	 * 	      client program to access the
	 * 	      enterprise beans in the ejb-jar file.
	 * 
	 * 	      Example:
	 * 
	 * 		  <ejb-client-jar>employee_service_client.jar
	 * 		  </ejb-client-jar>
	 * 
	 * 	      ]]>
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ejb Client Jar</em>' containment reference.
	 * @see #setEjbClientJar(PathType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_EjbClientJar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-client-jar' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	PathType getEjbClientJar();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getEjbClientJar <em>Ejb Client Jar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Client Jar</em>' containment reference.
	 * @see #getEjbClientJar()
	 * @generated
	 */
	void setEjbClientJar(PathType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	  The metadata-complete attribute defines whether this
	 * 	  deployment descriptor and other related deployment
	 * 	  descriptors for this module (e.g., web service
	 * 	  descriptors) are complete, or whether the class
	 * 	  files available to this module and packaged with
	 * 	  this application should be examined for annotations
	 * 	  that specify deployment information.
	 * 
	 * 	  If metadata-complete is set to "true", the deployment
	 * 	  tool must ignore any annotations that specify deployment
	 * 	  information, which might be present in the class files
	 * 	  of the application.
	 * 
	 * 	  If metadata-complete is not specified or is set to
	 * 	  "false", the deployment tool must examine the class
	 * 	  files of the application for annotations, as
	 * 	  specified by the specifications.
	 * 
	 * 	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Complete</em>' attribute.
	 * @see #isSetMetadataComplete()
	 * @see #unsetMetadataComplete()
	 * @see #setMetadataComplete(boolean)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_MetadataComplete()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='metadata-complete'"
	 * @generated
	 */
	boolean isMetadataComplete();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#isMetadataComplete <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Complete</em>' attribute.
	 * @see #isSetMetadataComplete()
	 * @see #unsetMetadataComplete()
	 * @see #isMetadataComplete()
	 * @generated
	 */
	void setMetadataComplete(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#isMetadataComplete <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMetadataComplete()
	 * @see #isMetadataComplete()
	 * @see #setMetadataComplete(boolean)
	 * @generated
	 */
	void unsetMetadataComplete();

	/**
	 * Returns whether the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#isMetadataComplete <em>Metadata Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Metadata Complete</em>' attribute is set.
	 * @see #unsetMetadataComplete()
	 * @see #isMetadataComplete()
	 * @see #setMetadataComplete(boolean)
	 * @generated
	 */
	boolean isSetMetadataComplete();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"3.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	  The version specifies the version of the
	 * 	  EJB specification that the instance document must
	 * 	  comply with. This information enables deployment tools
	 * 	  to validate a particular EJB Deployment
	 * 	  Descriptor with respect to a specific version of the EJB
	 * 	  schema.
	 * 
	 * 	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbJarType_Version()
	 * @model default="3.0" unsettable="true" dataType="org.eclipse.modisco.jee.ejbjar.EjbJar30.DeweyVersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // EjbJarType
