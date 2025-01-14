/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.views.queryExecution.internal;

import org.eclipse.emf.ecore.EObject;

/**
 * An interface that supports editing the query context
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface EditableContext {
	void add(EObject eObject);

	void remove(EObject eObject);

	void clear();

	/** must be called after editing to refresh the viewers */
	void done();
}
