/**
 *  Copyright (c) 2010 Mia-Software.
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

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.omg.kdm.source.SourceFile;

public class IsJavaSourceFile implements
IJavaModelQuery<SourceFile, Boolean>{

	public Boolean evaluate(SourceFile context,
			ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		
		return new Boolean(context.getName().endsWith(".java"));
	}

}
