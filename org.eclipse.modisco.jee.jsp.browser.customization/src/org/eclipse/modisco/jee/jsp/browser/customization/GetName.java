/**
 *  Copyright (c) 2010 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.browser.customization;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.jee.jsp.JSPScript;
import org.eclipse.modisco.xml.Element;

public class GetName implements IJavaModelQuery<Element, String> {
	public String evaluate(final Element context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		String name = ""; //$NON-NLS-1$
		if (context instanceof JSPScript) {
			JSPScript jspScript = ((JSPScript) context);
			if (jspScript.getChildren() != null) {
				// Because a Script can contained several portion of code
				// We only use the first one to describe it
				if (jspScript.getChildren().get(0) != null) {
					name = jspScript.getChildren().get(0).getName();
				}
			}

		}
		return name;
	}
}
