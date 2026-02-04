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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Destination Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The message-destination-linkType is used to link a message
 * 	destination reference or message-driven bean to a message
 * 	destination.
 * 
 * 	The Assembler sets the value to reflect the flow of messages
 * 	between producers and consumers in the application.
 * 
 * 	The value must be the message-destination-name of a message
 * 	destination in the same Deployment File or in another
 * 	Deployment File in the same Java EE application unit.
 * 
 * 	Alternatively, the value may be composed of a path name
 * 	specifying a Deployment File containing the referenced
 * 	message destination with the message-destination-name of the
 * 	destination appended and separated from the path name by
 * 	"#". The path name is relative to the Deployment File
 * 	containing Deployment Component that is referencing the
 * 	message destination.  This allows multiple message
 * 	destinations with the same name to be uniquely identified.
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationLinkType()
 * @model extendedMetaData="name='message-destination-linkType' kind='simple'"
 * @generated
 */
public interface MessageDestinationLinkType extends org.eclipse.modisco.jee.ejbjar.EjbJar30.String {
} // MessageDestinationLinkType
