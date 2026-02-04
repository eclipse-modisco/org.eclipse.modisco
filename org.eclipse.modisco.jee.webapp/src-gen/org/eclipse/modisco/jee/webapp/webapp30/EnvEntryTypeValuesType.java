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
package org.eclipse.modisco.jee.webapp.webapp30;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Entry Type Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <![CDATA[[
 *         This type contains the fully-qualified Java type of the
 *         environment entry value that is expected by the
 *         application's code.
 *         
 *         The following are the legal values of env-entry-type-valuesType:
 *         
 *         java.lang.Boolean
 *         java.lang.Byte
 *         java.lang.Character
 *         java.lang.String
 *         java.lang.Short
 *         java.lang.Integer
 *         java.lang.Long
 *         java.lang.Float
 *         java.lang.Double
 *         		  java.lang.Class
 *         		  any enumeration type (i.e. a subclass of java.lang.Enum)
 *         
 *         Examples:
 *         
 *         <env-entry-type>java.lang.Boolean</env-entry-type>
 *         <env-entry-type>java.lang.Class</env-entry-type>
 *         <env-entry-type>com.example.Color</env-entry-type>
 *         
 *         ]]>
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEnvEntryTypeValuesType()
 * @model extendedMetaData="name='env-entry-type-valuesType' kind='simple'"
 * @generated
 */
public interface EnvEntryTypeValuesType extends FullyQualifiedClassType {
} // EnvEntryTypeValuesType
