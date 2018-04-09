/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.java.composition.discoverer.listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationFactory;
import org.eclipse.modisco.kdm.source.extension.discovery.SourceVisitListener;

public class JavaCompositionSourceVisitListener implements SourceVisitListener {

	private Map<CompilationUnit, List<JavaNodeSourceRegion>> compilationUnitMap;

	public JavaCompositionSourceVisitListener(
			final Map<CompilationUnit, List<JavaNodeSourceRegion>> compilationUnitMap) {
		this.compilationUnitMap = compilationUnitMap;
	}

	/**
	 *
	 * Each time this method is notified, it creates a JavaNodeSourceRegion with
	 * the parameters and stores it in the HasMap for further utilization
	 *
	 * @param filePath
	 *            The path of the parent compilation unit
	 * @param startPosition
	 *            Start Position of the source code region
	 * @param endPosition
	 *            EndPosition of the source code region
	 * @param startLine
	 *            Start line of the source code region
	 * @param endLine
	 *            End line of the source code region
	 * @param targetNode
	 *            The Java Node to be documented
	 */
	public void sourceRegionVisited(final String filePath,
			final int startPosition, final int endPosition,
			final int startLine, final int endLine, final EObject targetNode) {
		CompilationUnit parent = getCuParent(targetNode);

		JavaNodeSourceRegion javaSrcRegion = JavaapplicationFactory.eINSTANCE
				.createJavaNodeSourceRegion();
		javaSrcRegion.setStartPosition(new Integer(startPosition));
		javaSrcRegion.setEndPosition(new Integer(endPosition));
		javaSrcRegion.setStartLine(new Integer(startLine));
		javaSrcRegion.setEndLine(new Integer(endLine));
		javaSrcRegion.setNode(targetNode);

		if (parent != null) {
			if (this.compilationUnitMap.get(parent) == null) {
				List<JavaNodeSourceRegion> list = new ArrayList<JavaNodeSourceRegion>();
				list.add(javaSrcRegion);
				this.compilationUnitMap.put(parent, list);
			} else {
				this.compilationUnitMap.get(parent).add(javaSrcRegion);
			}
		}
	}

	/**
	 * This method recursively compute the Node in parameter to find its Java
	 * Compilation Unit parent.
	 *
	 * @param targetNode
	 *            The Node to find its parent
	 * @return the parent Compilation Unit Node, or null if no parent
	 */
	protected CompilationUnit getCuParent(final EObject targetNode) {
		CompilationUnit cu = null;
		if (targetNode instanceof ASTNode) {
			cu = ((ASTNode) targetNode).getOriginalCompilationUnit();
			if (cu == null) {
				if (targetNode.eContainer() != null) {
					cu = getCuParent(targetNode.eContainer());
				}
			}
		}
		return cu;
	}

	protected Map<CompilationUnit, List<JavaNodeSourceRegion>> getCompilationUnitMap() {
		return this.compilationUnitMap;
	}

}
