/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.converter;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class MethodCallsJavaBridge {

	/**
	 * From provided resource, which should contains a CallsModel element, we will retrieve CallNode
	 * element which has been linked with provided java operation.
	 * 
	 * @param resource
	 * @param targetOperation
	 * @return
	 */
	public CallNode getCallNode(Resource resource, AbstractMethodDeclaration targetOperation) {
		CallNode result = null;
		// get root element
		CallsModel callsModel = (CallsModel) resource.getContents().get(0);
		for (CallNode callNode : callsModel.getCallNodes()) {
			if (targetOperation.equals(callNode.getJavaMethod())) {
				result = callNode;
				break;
			}
		}
		return result;
	}
}
