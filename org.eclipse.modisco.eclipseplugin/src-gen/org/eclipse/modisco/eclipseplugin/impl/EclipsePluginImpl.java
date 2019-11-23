/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *
 */
package org.eclipse.modisco.eclipseplugin.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.eclipseplugin.EclipsePlugin;
import org.eclipse.modisco.eclipseplugin.EclipsepluginPackage;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.modisco.omg.kdm.source.Project;
import org.eclipse.modisco.xml.Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getJavaModel <em>Java Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getInventoryProject <em>Inventory Project</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getClassPathRoot <em>Class Path Root</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getBuildProperties <em>Build Properties</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getPluginProperties <em>Plugin Properties</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getBundleProperties <em>Bundle Properties</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getSrcDirectory <em>Src Directory</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getPluginXml <em>Plugin Xml</em>}</li>
 *   <li>{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EclipsePluginImpl extends EObjectImpl implements EclipsePlugin {
	/**
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundle;

	/**
	 * The cached value of the '{@link #getJavaModel() <em>Java Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaModel()
	 * @generated
	 * @ordered
	 */
	protected Model javaModel;

	/**
	 * The cached value of the '{@link #getInventoryProject() <em>Inventory Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryProject()
	 * @generated
	 * @ordered
	 */
	protected Project inventoryProject;

	/**
	 * The cached value of the '{@link #getClassPathRoot() <em>Class Path Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPathRoot()
	 * @generated
	 * @ordered
	 */
	protected Root classPathRoot;

	/**
	 * The cached value of the '{@link #getBuildProperties() <em>Build Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildProperties()
	 * @generated
	 * @ordered
	 */
	protected CompilationUnit buildProperties;

	/**
	 * The cached value of the '{@link #getPluginProperties() <em>Plugin Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginProperties()
	 * @generated
	 * @ordered
	 */
	protected CompilationUnit pluginProperties;

	/**
	 * The cached value of the '{@link #getBundleProperties() <em>Bundle Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleProperties()
	 * @generated
	 * @ordered
	 */
	protected CompilationUnit bundleProperties;

	/**
	 * The default value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDirectory()
	 * @generated
	 * @ordered
	 */
	protected String outputDirectory = OUTPUT_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcDirectory() <em>Src Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcDirectory() <em>Src Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcDirectory()
	 * @generated
	 * @ordered
	 */
	protected String srcDirectory = SRC_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPluginXml() <em>Plugin Xml</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginXml()
	 * @generated
	 * @ordered
	 */
	protected Root pluginXml;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Root project;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipsePluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsepluginPackage.Literals.ECLIPSE_PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getBundle() {
		if (bundle != null && bundle.eIsProxy()) {
			InternalEObject oldBundle = (InternalEObject)bundle;
			bundle = (Bundle)eResolveProxy(oldBundle);
			if (bundle != oldBundle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE, oldBundle, bundle));
			}
		}
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle basicGetBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(Bundle newBundle) {
		Bundle oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE, oldBundle, bundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getJavaModel() {
		if (javaModel != null && javaModel.eIsProxy()) {
			InternalEObject oldJavaModel = (InternalEObject)javaModel;
			javaModel = (Model)eResolveProxy(oldJavaModel);
			if (javaModel != oldJavaModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__JAVA_MODEL, oldJavaModel, javaModel));
			}
		}
		return javaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetJavaModel() {
		return javaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaModel(Model newJavaModel) {
		Model oldJavaModel = javaModel;
		javaModel = newJavaModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__JAVA_MODEL, oldJavaModel, javaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getInventoryProject() {
		if (inventoryProject != null && inventoryProject.eIsProxy()) {
			InternalEObject oldInventoryProject = (InternalEObject)inventoryProject;
			inventoryProject = (Project)eResolveProxy(oldInventoryProject);
			if (inventoryProject != oldInventoryProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__INVENTORY_PROJECT, oldInventoryProject, inventoryProject));
			}
		}
		return inventoryProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetInventoryProject() {
		return inventoryProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryProject(Project newInventoryProject) {
		Project oldInventoryProject = inventoryProject;
		inventoryProject = newInventoryProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__INVENTORY_PROJECT, oldInventoryProject, inventoryProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root getClassPathRoot() {
		if (classPathRoot != null && classPathRoot.eIsProxy()) {
			InternalEObject oldClassPathRoot = (InternalEObject)classPathRoot;
			classPathRoot = (Root)eResolveProxy(oldClassPathRoot);
			if (classPathRoot != oldClassPathRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__CLASS_PATH_ROOT, oldClassPathRoot, classPathRoot));
			}
		}
		return classPathRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root basicGetClassPathRoot() {
		return classPathRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPathRoot(Root newClassPathRoot) {
		Root oldClassPathRoot = classPathRoot;
		classPathRoot = newClassPathRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__CLASS_PATH_ROOT, oldClassPathRoot, classPathRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getBuildProperties() {
		if (buildProperties != null && buildProperties.eIsProxy()) {
			InternalEObject oldBuildProperties = (InternalEObject)buildProperties;
			buildProperties = (CompilationUnit)eResolveProxy(oldBuildProperties);
			if (buildProperties != oldBuildProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__BUILD_PROPERTIES, oldBuildProperties, buildProperties));
			}
		}
		return buildProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit basicGetBuildProperties() {
		return buildProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildProperties(CompilationUnit newBuildProperties) {
		CompilationUnit oldBuildProperties = buildProperties;
		buildProperties = newBuildProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__BUILD_PROPERTIES, oldBuildProperties, buildProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getPluginProperties() {
		if (pluginProperties != null && pluginProperties.eIsProxy()) {
			InternalEObject oldPluginProperties = (InternalEObject)pluginProperties;
			pluginProperties = (CompilationUnit)eResolveProxy(oldPluginProperties);
			if (pluginProperties != oldPluginProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_PROPERTIES, oldPluginProperties, pluginProperties));
			}
		}
		return pluginProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit basicGetPluginProperties() {
		return pluginProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginProperties(CompilationUnit newPluginProperties) {
		CompilationUnit oldPluginProperties = pluginProperties;
		pluginProperties = newPluginProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_PROPERTIES, oldPluginProperties, pluginProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getBundleProperties() {
		if (bundleProperties != null && bundleProperties.eIsProxy()) {
			InternalEObject oldBundleProperties = (InternalEObject)bundleProperties;
			bundleProperties = (CompilationUnit)eResolveProxy(oldBundleProperties);
			if (bundleProperties != oldBundleProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE_PROPERTIES, oldBundleProperties, bundleProperties));
			}
		}
		return bundleProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit basicGetBundleProperties() {
		return bundleProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleProperties(CompilationUnit newBundleProperties) {
		CompilationUnit oldBundleProperties = bundleProperties;
		bundleProperties = newBundleProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE_PROPERTIES, oldBundleProperties, bundleProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputDirectory() {
		return outputDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDirectory(String newOutputDirectory) {
		String oldOutputDirectory = outputDirectory;
		outputDirectory = newOutputDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__OUTPUT_DIRECTORY, oldOutputDirectory, outputDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcDirectory() {
		return srcDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcDirectory(String newSrcDirectory) {
		String oldSrcDirectory = srcDirectory;
		srcDirectory = newSrcDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__SRC_DIRECTORY, oldSrcDirectory, srcDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root getPluginXml() {
		if (pluginXml != null && pluginXml.eIsProxy()) {
			InternalEObject oldPluginXml = (InternalEObject)pluginXml;
			pluginXml = (Root)eResolveProxy(oldPluginXml);
			if (pluginXml != oldPluginXml) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_XML, oldPluginXml, pluginXml));
			}
		}
		return pluginXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root basicGetPluginXml() {
		return pluginXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginXml(Root newPluginXml) {
		Root oldPluginXml = pluginXml;
		pluginXml = newPluginXml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_XML, oldPluginXml, pluginXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Root)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsepluginPackage.ECLIPSE_PLUGIN__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Root newProject) {
		Root oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsepluginPackage.ECLIPSE_PLUGIN__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE:
				if (resolve) return getBundle();
				return basicGetBundle();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__JAVA_MODEL:
				if (resolve) return getJavaModel();
				return basicGetJavaModel();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__INVENTORY_PROJECT:
				if (resolve) return getInventoryProject();
				return basicGetInventoryProject();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__CLASS_PATH_ROOT:
				if (resolve) return getClassPathRoot();
				return basicGetClassPathRoot();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUILD_PROPERTIES:
				if (resolve) return getBuildProperties();
				return basicGetBuildProperties();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_PROPERTIES:
				if (resolve) return getPluginProperties();
				return basicGetPluginProperties();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE_PROPERTIES:
				if (resolve) return getBundleProperties();
				return basicGetBundleProperties();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__OUTPUT_DIRECTORY:
				return getOutputDirectory();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__SRC_DIRECTORY:
				return getSrcDirectory();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__NAME:
				return getName();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_XML:
				if (resolve) return getPluginXml();
				return basicGetPluginXml();
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__JAVA_MODEL:
				setJavaModel((Model)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__INVENTORY_PROJECT:
				setInventoryProject((Project)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__CLASS_PATH_ROOT:
				setClassPathRoot((Root)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUILD_PROPERTIES:
				setBuildProperties((CompilationUnit)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_PROPERTIES:
				setPluginProperties((CompilationUnit)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE_PROPERTIES:
				setBundleProperties((CompilationUnit)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__OUTPUT_DIRECTORY:
				setOutputDirectory((String)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__SRC_DIRECTORY:
				setSrcDirectory((String)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__NAME:
				setName((String)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_XML:
				setPluginXml((Root)newValue);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PROJECT:
				setProject((Root)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE:
				setBundle((Bundle)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__JAVA_MODEL:
				setJavaModel((Model)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__INVENTORY_PROJECT:
				setInventoryProject((Project)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__CLASS_PATH_ROOT:
				setClassPathRoot((Root)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUILD_PROPERTIES:
				setBuildProperties((CompilationUnit)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_PROPERTIES:
				setPluginProperties((CompilationUnit)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE_PROPERTIES:
				setBundleProperties((CompilationUnit)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__OUTPUT_DIRECTORY:
				setOutputDirectory(OUTPUT_DIRECTORY_EDEFAULT);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__SRC_DIRECTORY:
				setSrcDirectory(SRC_DIRECTORY_EDEFAULT);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_XML:
				setPluginXml((Root)null);
				return;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PROJECT:
				setProject((Root)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE:
				return bundle != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__JAVA_MODEL:
				return javaModel != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__INVENTORY_PROJECT:
				return inventoryProject != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__CLASS_PATH_ROOT:
				return classPathRoot != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUILD_PROPERTIES:
				return buildProperties != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_PROPERTIES:
				return pluginProperties != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__BUNDLE_PROPERTIES:
				return bundleProperties != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__OUTPUT_DIRECTORY:
				return OUTPUT_DIRECTORY_EDEFAULT == null ? outputDirectory != null : !OUTPUT_DIRECTORY_EDEFAULT.equals(outputDirectory);
			case EclipsepluginPackage.ECLIPSE_PLUGIN__SRC_DIRECTORY:
				return SRC_DIRECTORY_EDEFAULT == null ? srcDirectory != null : !SRC_DIRECTORY_EDEFAULT.equals(srcDirectory);
			case EclipsepluginPackage.ECLIPSE_PLUGIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PLUGIN_XML:
				return pluginXml != null;
			case EclipsepluginPackage.ECLIPSE_PLUGIN__PROJECT:
				return project != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outputDirectory: ");
		result.append(outputDirectory);
		result.append(", srcDirectory: ");
		result.append(srcDirectory);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EclipsePluginImpl
