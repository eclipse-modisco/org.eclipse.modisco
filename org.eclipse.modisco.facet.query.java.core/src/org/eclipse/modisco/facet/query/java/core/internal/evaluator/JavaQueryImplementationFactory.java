/**
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 334615 - Java Query for EMF Facet
 *    Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 *    Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 *    Nicolas Bros (Mia-Software) - Bug 362191 - [Restructuring] Query mechanism for eFacet2
 *    Nicolas Bros (Mia-Software) - Bug 376941 - [EFacet] Facet operation arguments in Facet model
 *    Gregoire Dupe (Mia-Software) - Bug 443682 - Access to the super facet
 */
package org.eclipse.modisco.facet.query.java.core.internal.evaluator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.facet.efacet.core.IDerivedTypedElementManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.efacet.core.internal.query.QueryUtils;
import org.eclipse.modisco.facet.efacet.core.query.IQueryImplementation;
import org.eclipse.modisco.facet.efacet.core.query.IQueryImplementationFactory;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.eclipse.modisco.facet.query.java.core.IJavaQuery2;
import org.eclipse.modisco.facet.query.java.core.IJavaQuery3;
import org.eclipse.modisco.facet.query.java.core.internal.plugin.Activator;
import org.eclipse.modisco.facet.query.java.metamodel.v0_2_0.javaquery.JavaQuery;
import org.eclipse.modisco.facet.query.java.metamodel.v0_2_0.javaquery.JavaQueryPackage;
import org.eclipse.modisco.facet.util.core.Logger;
import org.osgi.framework.Bundle;

public class JavaQueryImplementationFactory implements IQueryImplementationFactory {

	public IQueryImplementation create(final Query query, final Bundle bundle, final IDerivedTypedElementManager manager) throws DerivedTypedElementException {
		if (!(query instanceof JavaQuery)) {
			throw new IllegalArgumentException("The given DerivedTypedElement does not have a JavaQuery"); //$NON-NLS-1$
		}
		JavaQuery javaQuery = (JavaQuery) query;

		if (bundle == null) {
			throw new DerivedTypedElementException("Java query implementation class '" //$NON-NLS-1$
					+ javaQuery.getClass().getName()
					+ "' should be created within a bundle."); //$NON-NLS-1$
		}
		JavaQueryImplementation javaQueryEvaluator = null;
		try {
			String className = javaQuery.getImplementationClassName();
			if (className == null || className.length() == 0) {
				throw new DerivedTypedElementException("The Java query's implementationClassName must not be empty"); //$NON-NLS-1$
			}
			Class<?> javaQueryClass = bundle.loadClass(className);
			if (!IJavaQuery2.class.isAssignableFrom(javaQueryClass)
					&& !IJavaQuery3.class.isAssignableFrom(javaQueryClass)) {
				final String message = String.format(
						"Java query implementation class '%s' does not implement %s or %s.", //$NON-NLS-1$
						className, IJavaQuery2.class.getSimpleName(),
						IJavaQuery3.class.getSimpleName());
				throw new Exception(message);
			}
			javaQueryEvaluator = createJavaQueryImpl(javaQueryClass);
			// Initially a null test was performed on bundle to determine whether
			// to check the result type. Now we need a bundle so
			// checkResultType=true
			javaQueryEvaluator.setCheckResultType(true);
		} catch (Exception e) {
			DerivedTypedElementException queryException = new DerivedTypedElementException(
					"The bundle " + bundle.getSymbolicName() + " failed to load the java query: " //$NON-NLS-1$ //$NON-NLS-2$
							+ QueryUtils.getQueryDescription(javaQuery), e);
			Logger.logError(queryException, Activator.getDefault());
			throw queryException;
		}
		return javaQueryEvaluator;
	}

	/** This method is dedicated to isolate the "Unchecked cast" warning. */
	@SuppressWarnings("unchecked")
	private static JavaQueryImplementation createJavaQueryImpl(final Class<?> javaQueryClass)
			throws InstantiationException, IllegalAccessException {
		final Object query = javaQueryClass.newInstance();
		final JavaQueryImplementation javaQueryEvaluator = new JavaQueryImplementation(query);
		return javaQueryEvaluator;
	}

	public EClass getManagedQueryType() {
		return JavaQueryPackage.eINSTANCE.getJavaQuery();
	}
}
