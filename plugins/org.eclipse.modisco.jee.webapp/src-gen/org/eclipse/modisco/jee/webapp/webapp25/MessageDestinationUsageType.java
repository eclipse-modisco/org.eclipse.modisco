/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Destination Usage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The message-destination-usageType specifies the use of the
 * 	message destination indicated by the reference.  The value
 * 	indicates whether messages are consumed from the message
 * 	destination, produced for the destination, or both.  The
 * 	Assembler makes use of this information in linking producers
 * 	of a destination with its consumers.
 * 
 * 	The value of the message-destination-usage element must be
 * 	one of the following:
 * 	    Consumes
 * 	    Produces
 * 	    ConsumesProduces
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getMessageDestinationUsageType()
 * @model extendedMetaData="name='message-destination-usageType' kind='simple'"
 * @generated
 */
public interface MessageDestinationUsageType extends org.eclipse.modisco.jee.webapp.webapp25.String {
} // MessageDestinationUsageType
