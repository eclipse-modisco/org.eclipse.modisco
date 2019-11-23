/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.tests;

import org.eclipse.modisco.java.Block;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.Statement;
import org.eclipse.modisco.java.discoverer.tests.utils.AbstractDiscoverTest;
import org.eclipse.modisco.java.internal.util.JavaUtil;
import org.junit.Assert;
import org.junit.Test;

public class Bug329423CommentsTest extends AbstractDiscoverTest {

	@Override
	protected String getTargetProjectName() {
		return Activator.PLUGIN_ID + "_bug329423"; //$NON-NLS-1$
	}

	@Override
	protected String getSourcesReferencePath() {
		return "/workspace/bug329423/"; //$NON-NLS-1$
	}

	@Test
	// See Bugzilla 329423
	public void testIsolatedComments() {
		ClassDeclaration aClass = (ClassDeclaration) JavaUtil
				.getNamedElementByQualifiedName(getModel(),
						"comments.IsolatedComment"); //$NON-NLS-1$
		Assert.assertNotNull(aClass);

		MethodDeclaration methodMain = (MethodDeclaration) aClass
				.getBodyDeclarations().get(0);
		Block mainBody = methodMain.getBody();

		Assert.assertTrue(mainBody.getComments() == null
				|| mainBody.getComments().isEmpty());

		Assert.assertTrue(mainBody.getStatements().size() == 2);
		Statement secondStatement = mainBody.getStatements().get(1);

		Assert.assertFalse(secondStatement.getComments().isEmpty());
		Comment comment = secondStatement.getComments().get(0);

		Assert.assertTrue(comment.getContent().contains("a Comment")); //$NON-NLS-1$
	}

}
