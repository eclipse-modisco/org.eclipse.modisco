/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.jxpath.query;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.IModelQueryFactory;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.infra.query.jxpath.JXPathModelQuery;
import org.eclipse.modisco.infra.query.jxpath.JxpathPackage;
import org.osgi.framework.Bundle;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class JXPathModelQueryFactory implements IModelQueryFactory {

	public AbstractModelQuery create(final ModelQuery modelQuery,
			final Bundle bundle)
			throws ModelQueryException {
		if (!(modelQuery instanceof JXPathModelQuery)) {
			ModelQueryException e = new ModelQueryException(
					"Wrong kind of model query."); //$NON-NLS-1$
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e
					.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			throw e;
		}
		JXPathModelQuery jxPathModelQuery = (JXPathModelQuery) modelQuery;
		return new JXPathModelQueryAdapter(jxPathModelQuery);

	}

	public EClass getManagedModelQueryType() {
		return JxpathPackage.eINSTANCE.getJXPathModelQuery();
	}

}
