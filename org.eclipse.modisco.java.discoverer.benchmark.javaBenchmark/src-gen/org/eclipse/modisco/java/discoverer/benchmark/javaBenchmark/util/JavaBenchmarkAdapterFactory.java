/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - Bug 341752 - Extract report metamodel from the benchmark plug-in to avoid Acceleo troubles.
 *     Nicolas Bros (Mia-Software) - extracted Java benchmark
 */
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.Project;
import org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.*;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDOProjectDiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaDiscoveredProject;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage
 * @generated
 */
public class JavaBenchmarkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaBenchmarkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBenchmarkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaBenchmarkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaBenchmarkSwitch<Adapter> modelSwitch =
		new JavaBenchmarkSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCDODiscovery(AbstractCDODiscovery object) {
				return createAbstractCDODiscoveryAdapter();
			}
			@Override
			public Adapter caseAbstractJavaProject(AbstractJavaProject object) {
				return createAbstractJavaProjectAdapter();
			}
			@Override
			public Adapter caseJavaProject(JavaProject object) {
				return createJavaProjectAdapter();
			}
			@Override
			public Adapter caseJavaDiscoveredProject(JavaDiscoveredProject object) {
				return createJavaDiscoveredProjectAdapter();
			}
			@Override
			public Adapter caseCDODiscovery(CDODiscovery object) {
				return createCDODiscoveryAdapter();
			}
			@Override
			public Adapter caseCDOProjectDiscovery(CDOProjectDiscovery object) {
				return createCDOProjectDiscoveryAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseDiscoveredProject(DiscoveredProject object) {
				return createDiscoveredProjectAdapter();
			}
			@Override
			public Adapter caseDiscovery(Discovery object) {
				return createDiscoveryAdapter();
			}
			@Override
			public Adapter caseProjectDiscovery(ProjectDiscovery object) {
				return createProjectDiscoveryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery <em>Abstract CDO Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery
	 * @generated
	 */
	public Adapter createAbstractCDODiscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject <em>Abstract Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject
	 * @generated
	 */
	public Adapter createAbstractJavaProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject
	 * @generated
	 */
	public Adapter createJavaProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaDiscoveredProject <em>Java Discovered Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaDiscoveredProject
	 * @generated
	 */
	public Adapter createJavaDiscoveredProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery <em>CDO Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery
	 * @generated
	 */
	public Adapter createCDODiscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDOProjectDiscovery <em>CDO Project Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDOProjectDiscovery
	 * @generated
	 */
	public Adapter createCDOProjectDiscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery <em>Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery
	 * @generated
	 */
	public Adapter createDiscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery <em>Project Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery
	 * @generated
	 */
	public Adapter createProjectDiscoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.infra.discovery.benchmark.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject <em>Discovered Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject
	 * @generated
	 */
	public Adapter createDiscoveredProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaBenchmarkAdapterFactory
