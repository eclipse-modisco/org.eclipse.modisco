/*******************************************************************************
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *		Fabien Giquel (Mia-Software) - Bug 351590 - [Java] ClassCastException while discovering Apache math commons
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.tests;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.Statement;
import org.eclipse.modisco.java.VariableDeclarationStatement;
import org.eclipse.modisco.java.discoverer.tests.utils.AbstractDiscoverTest;
import org.eclipse.modisco.java.internal.util.JavaUtil;
import org.junit.Assert;
import org.junit.Test;

public class Bug351590ClassCastWithAnnotationMemberTest extends AbstractDiscoverTest {

	@Override
	protected String getTargetProjectName() {
		return Activator.PLUGIN_ID + "_bug351590"; //$NON-NLS-1$
	}

	@Override
	protected String getSourcesReferencePath() {
		return "/workspace/bug351590/"; //$NON-NLS-1$
	}

	@Test
	// Bugzilla 351590 : metamodel evolution needed, a MethodInvocation cannot reference one AnnotationTypeMemberDeclaration
	// Temporary workaround for not getting Status error : affect unresolvedMethod with name matching the AnnotationTypeMemberDeclaration
	public void testMethodInvocationToAnnotationMember() {
		MethodDeclaration aMethod = (MethodDeclaration) JavaUtil
				.getNamedElementByQualifiedName(getModel(),
						"(default package).MyClass.m()"); //$NON-NLS-1$
		Assert.assertNotNull(aMethod);

		// look for "String f1 = anAnnot.arg1();"
		Statement statement = aMethod.getBody().getStatements().get(1);
		Assert.assertNotNull(statement);
		Assert.assertTrue(statement instanceof VariableDeclarationStatement);

		Expression initializer = ((VariableDeclarationStatement) statement).getFragments().get(0).getInitializer();
		Assert.assertNotNull(initializer);
		Assert.assertTrue(initializer instanceof MethodInvocation);

		// Here, the fix has create some unresolvedMethod with a name indicating the true AnnotationTypeMemberDeclaration
		AbstractMethodDeclaration method = ((MethodInvocation) initializer).getMethod();
		Assert.assertNotNull(method);
		Assert.assertTrue(method.getName().contains("arg1"));
	}

}
