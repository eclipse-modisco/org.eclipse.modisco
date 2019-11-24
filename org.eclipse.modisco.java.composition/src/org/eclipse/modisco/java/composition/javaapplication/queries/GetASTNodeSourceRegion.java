/**
 *  Copyright (c) 2010, 2019 Mia-Software and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication.queries;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;

public class GetASTNodeSourceRegion implements IJavaModelQuery<ASTNode, JavaNodeSourceRegion> {

	public JavaNodeSourceRegion evaluate(ASTNode astNode, ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		JavaNodeSourceRegion result = null;
		CompilationUnit cu = astNode.getOriginalCompilationUnit();
		if (cu != null) {
			// bug 332323: in default package, the package reference is null for the compilation
			// unit
			// but not for the type declaration
			Package targetPackage = cu.getPackage();
			if (targetPackage == null) {
				// find target package from the ast node ...
				AbstractTypeDeclaration typeDeclaration = GetASTNodeSourceRegion.findTypeDeclaration(astNode);
				if (typeDeclaration != null) {
					targetPackage = typeDeclaration.getPackage();
				}
			}
			ResourceSet rSet = cu.eResource().getResourceSet();

			if (rSet != null) {
				Java2Directory java2Directory = null;
				List<Resource> resources = rSet.getResources();
				for (Resource resource : resources) {
					for (EObject rootObject : resource.getContents()) {
						if (rootObject instanceof Java2Directory) {
							Java2Directory currentJava2Directory = (Java2Directory) rootObject;
							if (currentJava2Directory.getJavaPackage() == targetPackage) {
								java2Directory = currentJava2Directory;
								break;
							}
						}
					}
				}
				Java2File java2File = null;
				if (java2Directory != null) {
					for (Java2File java2File2 : java2Directory.getJava2FileChildren()) {
						if (java2File2.getJavaUnit() == cu) {
							java2File = java2File2;
							break;
						}
					}
				}
				if (java2File != null) {
					for (ASTNodeSourceRegion astNodeSR : java2File.getChildren()) {
						if (astNodeSR.getNode() == astNode) {
							result = (JavaNodeSourceRegion) astNodeSR;
							break;
						}
					}
				}

			}
		}
		return result;
	}

	/**
	 * method to find a parent type declaration that has the same package as this ast node.
	 * 
	 * @param astNode
	 * @return
	 */
	private static AbstractTypeDeclaration findTypeDeclaration(ASTNode astNode) {
		AbstractTypeDeclaration result = null;
		if (astNode != null) {
			if (astNode instanceof AbstractTypeDeclaration) {
				result = (AbstractTypeDeclaration) astNode;
			} else {
				/*
				 * we don't have to check the compilation unit as it has been done earlier in call
				 * sequence if this method has to be used from a different context, a check will
				 * have to be done here
				 */
				CompilationUnit cu = astNode.getOriginalCompilationUnit();
				if (cu.getTypes().size() > 0) {
					// get the first type
					result = cu.getTypes().get(0);
				}
			}
		}
		return result;
	}

}
