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
package org.eclipse.modisco.jee.ejbjar.EjbJar31;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Bean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The session-beanType declares an session bean. The
 *         declaration consists of:
 *         
 *         - an optional description
 *         - an optional display name
 *         - an optional icon element that contains a small and a large 
 *         icon file name
 *         - a name assigned to the enterprise bean
 *         in the deployment description
 *         - an optional mapped-name element that can be used to provide
 *         vendor-specific deployment information such as the physical
 *         jndi-name of the session bean's remote home/business interface. 
 *         This element is not required to be supported by all 
 *         implementations. Any use of this element is non-portable.
 *         - the names of all the remote or local business interfaces, 
 *         if any
 *         - the names of the session bean's remote home and
 *         remote interfaces, if any
 *         - the names of the session bean's local home and
 *         local interfaces, if any
 *         - an optional declaration that this bean exposes a
 *         no-interface view
 *         - the name of the session bean's web service endpoint
 *         interface, if any
 *         - the session bean's implementation class
 *         - the session bean's state management type
 *         - an optional declaration of a stateful session bean's timeout value
 *         - an optional declaration of the session bean's timeout method for
 *         handling programmatically created timers
 *         - an optional declaration of timers to be automatically created at
 *         deployment time
 *         - an optional declaration that a Singleton bean has eager
 *         initialization
 *         - an optional declaration of a Singleton/Stateful bean's concurrency 
 *         management type
 *         - an optional declaration of the method locking metadata
 *         for a Singleton with container managed concurrency
 *         - an optional declaration of the other Singleton beans in the
 *         application that must be initialized before this bean
 *         - an optional declaration of the session bean's asynchronous 
 *         methods
 *         - the optional session bean's transaction management type. 
 *         If it is not present, it is defaulted to Container.
 *         - an optional declaration of a stateful session bean's 
 *         afterBegin, beforeCompletion, and/or afterCompletion methods
 *         - an optional list of the session bean class and/or
 *         superclass around-invoke methods.
 *         - an optional list of the session bean class and/or
 *         superclass around-timeout methods.
 *         - an optional declaration of the bean's 
 *         environment entries
 *         - an optional declaration of the bean's EJB references
 *         - an optional declaration of the bean's local 
 *         EJB references
 *         - an optional declaration of the bean's web 
 *         service references
 *         - an optional declaration of the security role 
 *         references
 *         - an optional declaration of the security identity 
 *         to be used for the execution of the bean's methods
 *         - an optional declaration of the bean's resource 
 *         manager connection factory references
 *         - an optional declaration of the bean's resource 
 *         environment references.
 *         - an optional declaration of the bean's message 
 *         destination references
 *         
 *         The elements that are optional are "optional" in the sense
 *         that they are omitted when if lists represented by them are
 *         empty.
 *         
 *         The service-endpoint element may only be specified if the
 *         bean is a stateless session bean.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getBusinessLocal <em>Business Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getBusinessRemote <em>Business Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getLocalBean <em>Local Bean</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getServiceEndpoint <em>Service Endpoint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getStatefulTimeout <em>Stateful Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getTimeoutMethod <em>Timeout Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getTimer <em>Timer</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getInitOnStartup <em>Init On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getConcurrencyManagementType <em>Concurrency Management Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getConcurrentMethod <em>Concurrent Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getRemoveMethod <em>Remove Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getAsyncMethod <em>Async Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getAfterBeginMethod <em>After Begin Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getBeforeCompletionMethod <em>Before Completion Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getAfterCompletionMethod <em>After Completion Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getAroundInvoke <em>Around Invoke</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getAroundTimeout <em>Around Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getPersistenceContextRef <em>Persistence Context Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getPostActivate <em>Post Activate</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getPrePassivate <em>Pre Passivate</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType()
 * @model extendedMetaData="name='session-beanType' kind='elementOnly'"
 * @generated
 */
public interface SessionBeanType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Name</em>' containment reference.
	 * @see #setEjbName(EjbNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_EjbName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbNameType getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(EjbNameType value);

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Name</em>' containment reference.
	 * @see #setMappedName(XsdStringType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_MappedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapped-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getMappedName <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' containment reference.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(HomeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_Home()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='home' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	HomeType getHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(HomeType value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' containment reference.
	 * @see #setRemote(RemoteType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_Remote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remote' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	RemoteType getRemote();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getRemote <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' containment reference.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(RemoteType value);

	/**
	 * Returns the value of the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Home</em>' containment reference.
	 * @see #setLocalHome(LocalHomeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_LocalHome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local-home' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	LocalHomeType getLocalHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getLocalHome <em>Local Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Home</em>' containment reference.
	 * @see #getLocalHome()
	 * @generated
	 */
	void setLocalHome(LocalHomeType value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference.
	 * @see #setLocal(LocalType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_Local()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	LocalType getLocal();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getLocal <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' containment reference.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(LocalType value);

	/**
	 * Returns the value of the '<em><b>Business Local</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Local</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Local</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_BusinessLocal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='business-local' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<FullyQualifiedClassType> getBusinessLocal();

	/**
	 * Returns the value of the '<em><b>Business Remote</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Remote</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Remote</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_BusinessRemote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='business-remote' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<FullyQualifiedClassType> getBusinessRemote();

	/**
	 * Returns the value of the '<em><b>Local Bean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The local-bean element declares that this
	 *             session bean exposes a no-interface Local client view.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Bean</em>' containment reference.
	 * @see #setLocalBean(EmptyType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_LocalBean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local-bean' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EmptyType getLocalBean();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getLocalBean <em>Local Bean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Bean</em>' containment reference.
	 * @see #getLocalBean()
	 * @generated
	 */
	void setLocalBean(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Service Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The service-endpoint element contains the
	 *             fully-qualified name of the enterprise bean's web
	 *             service endpoint interface. The service-endpoint
	 *             element may only be specified for a stateless
	 *             session bean. The specified interface must be a
	 *             valid JAX-RPC service endpoint interface.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Endpoint</em>' containment reference.
	 * @see #setServiceEndpoint(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_ServiceEndpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-endpoint' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getServiceEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getServiceEndpoint <em>Service Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Endpoint</em>' containment reference.
	 * @see #getServiceEndpoint()
	 * @generated
	 */
	void setServiceEndpoint(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The ejb-class element specifies the fully qualified name
	 *             of the bean class for this ejb.  It is required unless
	 *             there is a component-defining annotation for the same
	 *             ejb-name.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ejb Class</em>' containment reference.
	 * @see #setEjbClass(EjbClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_EjbClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbClassType getEjbClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getEjbClass <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' containment reference.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(EjbClassType value);

	/**
	 * Returns the value of the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Type</em>' containment reference.
	 * @see #setSessionType(SessionTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_SessionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='session-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	SessionTypeType getSessionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getSessionType <em>Session Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Type</em>' containment reference.
	 * @see #getSessionType()
	 * @generated
	 */
	void setSessionType(SessionTypeType value);

	/**
	 * Returns the value of the '<em><b>Stateful Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateful Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateful Timeout</em>' containment reference.
	 * @see #setStatefulTimeout(StatefulTimeoutType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_StatefulTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stateful-timeout' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	StatefulTimeoutType getStatefulTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getStatefulTimeout <em>Stateful Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateful Timeout</em>' containment reference.
	 * @see #getStatefulTimeout()
	 * @generated
	 */
	void setStatefulTimeout(StatefulTimeoutType value);

	/**
	 * Returns the value of the '<em><b>Timeout Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The timeout-method element specifies the method that
	 *             will receive callbacks for programmatically
	 *             created timers.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Method</em>' containment reference.
	 * @see #setTimeoutMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_TimeoutMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeout-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getTimeoutMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getTimeoutMethod <em>Timeout Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Method</em>' containment reference.
	 * @see #getTimeoutMethod()
	 * @generated
	 */
	void setTimeoutMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_Timer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timer' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<TimerType> getTimer();

	/**
	 * Returns the value of the '<em><b>Init On Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The init-on-startup element specifies that a Singleton
	 *             bean has eager initialization.
	 *             This element can only be specified for singleton session
	 *             beans.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init On Startup</em>' containment reference.
	 * @see #setInitOnStartup(TrueFalseType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_InitOnStartup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init-on-startup' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getInitOnStartup();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getInitOnStartup <em>Init On Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init On Startup</em>' containment reference.
	 * @see #getInitOnStartup()
	 * @generated
	 */
	void setInitOnStartup(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Concurrency Management Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency Management Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Management Type</em>' containment reference.
	 * @see #setConcurrencyManagementType(ConcurrencyManagementTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_ConcurrencyManagementType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concurrency-management-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ConcurrencyManagementTypeType getConcurrencyManagementType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getConcurrencyManagementType <em>Concurrency Management Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Management Type</em>' containment reference.
	 * @see #getConcurrencyManagementType()
	 * @generated
	 */
	void setConcurrencyManagementType(ConcurrencyManagementTypeType value);

	/**
	 * Returns the value of the '<em><b>Concurrent Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent Method</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_ConcurrentMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concurrent-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ConcurrentMethodType> getConcurrentMethod();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(DependsOnType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_DependsOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='depends-on' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	DependsOnType getDependsOn();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(DependsOnType value);

	/**
	 * Returns the value of the '<em><b>Init Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The init-method element specifies the mappings for
	 *             EJB 2.x style create methods for an EJB 3.x bean.
	 *             This element can only be specified for stateful 
	 *             session beans. 
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Method</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_InitMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<InitMethodType> getInitMethod();

	/**
	 * Returns the value of the '<em><b>Remove Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.RemoveMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The remove-method element specifies the mappings for
	 *             EJB 2.x style remove methods for an EJB 3.x bean.
	 *             This element can only be specified for stateful 
	 *             session beans. 
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Method</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_RemoveMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remove-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<RemoveMethodType> getRemoveMethod();

	/**
	 * Returns the value of the '<em><b>Async Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.AsyncMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Method</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_AsyncMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='async-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<AsyncMethodType> getAsyncMethod();

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' containment reference.
	 * @see #setTransactionType(TransactionTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_TransactionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transaction-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getTransactionType <em>Transaction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' containment reference.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionTypeType value);

	/**
	 * Returns the value of the '<em><b>After Begin Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Begin Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Begin Method</em>' containment reference.
	 * @see #setAfterBeginMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_AfterBeginMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='after-begin-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getAfterBeginMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getAfterBeginMethod <em>After Begin Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Begin Method</em>' containment reference.
	 * @see #getAfterBeginMethod()
	 * @generated
	 */
	void setAfterBeginMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>Before Completion Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Completion Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Completion Method</em>' containment reference.
	 * @see #setBeforeCompletionMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_BeforeCompletionMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='before-completion-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getBeforeCompletionMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getBeforeCompletionMethod <em>Before Completion Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Completion Method</em>' containment reference.
	 * @see #getBeforeCompletionMethod()
	 * @generated
	 */
	void setBeforeCompletionMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>After Completion Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Completion Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Completion Method</em>' containment reference.
	 * @see #setAfterCompletionMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_AfterCompletionMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='after-completion-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getAfterCompletionMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getAfterCompletionMethod <em>After Completion Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Completion Method</em>' containment reference.
	 * @see #getAfterCompletionMethod()
	 * @generated
	 */
	void setAfterCompletionMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>Around Invoke</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Around Invoke</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Around Invoke</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_AroundInvoke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='around-invoke' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<AroundInvokeType> getAroundInvoke();

	/**
	 * Returns the value of the '<em><b>Around Timeout</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundTimeoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Around Timeout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Around Timeout</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_AroundTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='around-timeout' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<AroundTimeoutType> getAroundTimeout();

	/**
	 * Returns the value of the '<em><b>Env Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.EnvEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_EnvEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<EnvEntryType> getEnvEntry();

	/**
	 * Returns the value of the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_EjbRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<EjbRefType> getEjbRef();

	/**
	 * Returns the value of the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbLocalRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Local Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Local Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_EjbLocalRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-local-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<EjbLocalRefType> getEjbLocalRef();

	/**
	 * Returns the value of the '<em><b>Service Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ServiceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_ServiceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ServiceRefType> getServiceRef();

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_ResourceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ResourceRefType> getResourceRef();

	/**
	 * Returns the value of the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceEnvRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_ResourceEnvRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ResourceEnvRefType> getResourceEnvRef();

	/**
	 * Returns the value of the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_MessageDestinationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<MessageDestinationRefType> getMessageDestinationRef();

	/**
	 * Returns the value of the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Context Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Context Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_PersistenceContextRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-context-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PersistenceContextRefType> getPersistenceContextRef();

	/**
	 * Returns the value of the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceUnitRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_PersistenceUnitRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-unit-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PersistenceUnitRefType> getPersistenceUnitRef();

	/**
	 * Returns the value of the '<em><b>Post Construct</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Construct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Construct</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_PostConstruct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='post-construct' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<LifecycleCallbackType> getPostConstruct();

	/**
	 * Returns the value of the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Destroy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Destroy</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_PreDestroy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pre-destroy' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<LifecycleCallbackType> getPreDestroy();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.DataSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_DataSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-source' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DataSourceType> getDataSource();

	/**
	 * Returns the value of the '<em><b>Post Activate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Activate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Activate</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_PostActivate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='post-activate' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<LifecycleCallbackType> getPostActivate();

	/**
	 * Returns the value of the '<em><b>Pre Passivate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Passivate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Passivate</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_PrePassivate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pre-passivate' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<LifecycleCallbackType> getPrePassivate();

	/**
	 * Returns the value of the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityRoleRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_SecurityRoleRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<SecurityRoleRefType> getSecurityRoleRef();

	/**
	 * Returns the value of the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Identity</em>' containment reference.
	 * @see #setSecurityIdentity(SecurityIdentityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_SecurityIdentity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-identity' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	SecurityIdentityType getSecurityIdentity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getSecurityIdentity <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Identity</em>' containment reference.
	 * @see #getSecurityIdentity()
	 * @generated
	 */
	void setSecurityIdentity(SecurityIdentityType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getSessionBeanType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SessionBeanType
