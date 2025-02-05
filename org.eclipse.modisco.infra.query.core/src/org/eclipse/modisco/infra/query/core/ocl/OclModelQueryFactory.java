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
package org.eclipse.modisco.infra.query.core.ocl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.OCLModelQuery;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.IModelQueryFactory;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.osgi.framework.Bundle;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class OclModelQueryFactory implements IModelQueryFactory {

	public AbstractModelQuery create(final ModelQuery modelQuery, final Bundle bundle)
			throws ModelQueryException {
		if (!(modelQuery instanceof OCLModelQuery)) {
			ModelQueryException e = new ModelQueryException("Wrong kind of modelQuery: " //$NON-NLS-1$
					+ modelQuery.getClass().getSimpleName() + "found, " //$NON-NLS-1$
					+ OCLModelQuery.class.getSimpleName() + "expected."); //$NON-NLS-1$
			throw e;
		}
		return new OCLModelQueryAdapter((OCLModelQuery) modelQuery);
	}

	public EClass getManagedModelQueryType() {
		return QueryPackage.eINSTANCE.getOCLModelQuery();
	}

}
