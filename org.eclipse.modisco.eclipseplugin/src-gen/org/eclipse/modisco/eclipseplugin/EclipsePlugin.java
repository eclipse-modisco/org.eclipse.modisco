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
package org.eclipse.modisco.eclipseplugin;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.modisco.omg.kdm.source.Project;
import org.eclipse.modisco.xml.Root;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getJavaModel <em>Java Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getInventoryProject <em>Inventory Project</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getClassPathRoot <em>Class Path Root</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBuildProperties <em>Build Properties</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginProperties <em>Plugin Properties</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundleProperties <em>Bundle Properties</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getSrcDirectory <em>Src Directory</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginXml <em>Plugin Xml</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin()
 * @model
 * @generated
 */
public interface EclipsePlugin extends EObject {
	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' reference.
	 * @see #setBundle(Bundle)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_Bundle()
	 * @model
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundle <em>Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	/**
	 * Returns the value of the '<em><b>Java Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Model</em>' reference.
	 * @see #setJavaModel(Model)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_JavaModel()
	 * @model
	 * @generated
	 */
	Model getJavaModel();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getJavaModel <em>Java Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Model</em>' reference.
	 * @see #getJavaModel()
	 * @generated
	 */
	void setJavaModel(Model value);

	/**
	 * Returns the value of the '<em><b>Inventory Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Project</em>' reference.
	 * @see #setInventoryProject(Project)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_InventoryProject()
	 * @model
	 * @generated
	 */
	Project getInventoryProject();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getInventoryProject <em>Inventory Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Project</em>' reference.
	 * @see #getInventoryProject()
	 * @generated
	 */
	void setInventoryProject(Project value);

	/**
	 * Returns the value of the '<em><b>Class Path Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Path Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Path Root</em>' reference.
	 * @see #setClassPathRoot(Root)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_ClassPathRoot()
	 * @model
	 * @generated
	 */
	Root getClassPathRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getClassPathRoot <em>Class Path Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Path Root</em>' reference.
	 * @see #getClassPathRoot()
	 * @generated
	 */
	void setClassPathRoot(Root value);

	/**
	 * Returns the value of the '<em><b>Build Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Properties</em>' reference.
	 * @see #setBuildProperties(CompilationUnit)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_BuildProperties()
	 * @model
	 * @generated
	 */
	CompilationUnit getBuildProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBuildProperties <em>Build Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Properties</em>' reference.
	 * @see #getBuildProperties()
	 * @generated
	 */
	void setBuildProperties(CompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Plugin Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Properties</em>' reference.
	 * @see #setPluginProperties(CompilationUnit)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_PluginProperties()
	 * @model
	 * @generated
	 */
	CompilationUnit getPluginProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginProperties <em>Plugin Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Properties</em>' reference.
	 * @see #getPluginProperties()
	 * @generated
	 */
	void setPluginProperties(CompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Bundle Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Properties</em>' reference.
	 * @see #setBundleProperties(CompilationUnit)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_BundleProperties()
	 * @model
	 * @generated
	 */
	CompilationUnit getBundleProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundleProperties <em>Bundle Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Properties</em>' reference.
	 * @see #getBundleProperties()
	 * @generated
	 */
	void setBundleProperties(CompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Directory</em>' attribute.
	 * @see #setOutputDirectory(String)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_OutputDirectory()
	 * @model
	 * @generated
	 */
	String getOutputDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getOutputDirectory <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Directory</em>' attribute.
	 * @see #getOutputDirectory()
	 * @generated
	 */
	void setOutputDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Src Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Directory</em>' attribute.
	 * @see #setSrcDirectory(String)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_SrcDirectory()
	 * @model
	 * @generated
	 */
	String getSrcDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getSrcDirectory <em>Src Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Directory</em>' attribute.
	 * @see #getSrcDirectory()
	 * @generated
	 */
	void setSrcDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Xml</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Xml</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Xml</em>' reference.
	 * @see #setPluginXml(Root)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_PluginXml()
	 * @model
	 * @generated
	 */
	Root getPluginXml();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginXml <em>Plugin Xml</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Xml</em>' reference.
	 * @see #getPluginXml()
	 * @generated
	 */
	void setPluginXml(Root value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Root)
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#getEclipsePlugin_Project()
	 * @model
	 * @generated
	 */
	Root getProject();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Root value);

} // EclipsePlugin
