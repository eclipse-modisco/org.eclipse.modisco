/**
 * *******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.java.composition.ui.strategies;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.composition.javaapplication.queries.GetASTNodeSourceRegion;
import org.eclipse.modisco.java.composition.ui.Activator;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl;
import org.eclipse.modisco.kdm.source.extension.ui.interfaces.SourceStrategy;

public class StrategySourceJava implements SourceStrategy {

	// This strategy is only applicable on eObject from a Java Composition model
	private static final String METAMODEL_URI = JavaPackage.eINSTANCE
			.getNsURI();

	private static final String DEBUG_ID = "org.eclipse.modisco.java.composition.ui/debug/StrategySourceJava/debug"; //$NON-NLS-1$
	static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& new Boolean(Platform.getDebugOption(StrategySourceJava.DEBUG_ID))
					.booleanValue();

	public ASTNodeSourceRegion getASTNodeSourceRegion(final EObject eObject) {

		if (StrategySourceJava.DEBUG) {
			System.out.println("StrategySourceJava.getASTNodeSourceRegion()"); //$NON-NLS-1$
		}

		// In case the selected element is a compilation Unit we just want to
		// open the file
		if (eObject instanceof CompilationUnit) {

			CompilationUnit cu = (CompilationUnit) eObject;
			if (StrategySourceJava.DEBUG) {
				System.out.println("Found a Compilation Unit: " + cu); //$NON-NLS-1$
			}
			ASTNodeSourceRegion astNodeSourceRegion = new ASTNodeSourceRegionImpl() {
				// Nothing
			};
			astNodeSourceRegion.setPath(cu.getOriginalFilePath());
			astNodeSourceRegion.setStartPosition(new Integer(0));
			astNodeSourceRegion.setEndPosition(new Integer(0));

			return astNodeSourceRegion;
		}

		if (eObject instanceof ASTNode) {
			GetASTNodeSourceRegion query = new GetASTNodeSourceRegion();
			ASTNode astNode = (ASTNode) eObject;
			try {
				return query.evaluate(astNode, null);
			} catch (ModelQueryExecutionException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return null;
	}

	public boolean isApplicableTo(final Notifier target) {
		if (target instanceof EObject) {
			return ((EObject) target).eClass().getEPackage().getNsURI()
					.equalsIgnoreCase(StrategySourceJava.METAMODEL_URI);
		}
		return false;
	}
}
