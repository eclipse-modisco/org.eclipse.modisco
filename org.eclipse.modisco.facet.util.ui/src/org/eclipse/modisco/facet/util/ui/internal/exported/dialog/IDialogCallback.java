/*******************************************************************************
 * Copyright (c) 2012, 2019 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Initial API
 *    Nicolas Bros (Mia-Software) - Bug 372865 - FacetSet selection dialog
 *******************************************************************************/
package org.eclipse.modisco.facet.util.ui.internal.exported.dialog;

/**
 * A callback used to return a dialog's result asynchronously.
 * 
 * @param <T>
 *            the type of the result
 */
public interface IDialogCallback<T> {
	/**
	 * The user committed their selection in the dialog.
	 * 
	 * @param result
	 *            the result
	 */
	void committed(T result);
}
