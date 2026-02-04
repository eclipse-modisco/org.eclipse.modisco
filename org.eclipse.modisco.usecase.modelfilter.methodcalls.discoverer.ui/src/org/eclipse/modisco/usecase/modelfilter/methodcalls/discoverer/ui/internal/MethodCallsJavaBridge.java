/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.discoverer.internal.core.JavaJdtBridge;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel;

public final class MethodCallsJavaBridge {

	private MethodCallsJavaBridge() {
		//
	}

	/**
	 * From provided resource, which should contain a CallsModel element,
	 * retrieve the CallNode element linked with the provided java operation.
	 */
	public static CallNode getCallNode(final Resource resource,
			final AbstractMethodDeclaration targetOperation) {
		// get root element
		CallsModel callsModel = (CallsModel) resource.getContents().get(0);
		return getCallNode(callsModel, targetOperation);
	}

	/**
	 * From the CallsModel element, retrieve the CallNode element linked with
	 * the provided java operation.
	 */
	public static CallNode getCallNode(final CallsModel callsModel,
			final AbstractMethodDeclaration targetOperation) {
		for (CallNode callNode : callsModel.getCallNodes()) {
			if (targetOperation.equals(callNode.getJavaMethod())) {
				return callNode;
			}
		}
		return null;
	}

	public static CallNode getCallNode(final Resource model,
			final IMethod method) {
		CallsModel callsModel = ((CallsModel) model.getContents().get(0));
		return getCallNode(callsModel, method);
	}

	public static CallNode getCallNode(final CallsModel callsModel,
			final IMethod method) {
		Resource javaResource = callsModel.getCallNodes().get(0).getJavaMethod().eResource();
		JavaJdtBridge bridge = new JavaJdtBridge();
		AbstractMethodDeclaration targetOperation = bridge.getJavaOperation(
				javaResource, method);
		if (targetOperation == null) {
			return null;
		}
		return getCallNode(callsModel, targetOperation);
	}
}
