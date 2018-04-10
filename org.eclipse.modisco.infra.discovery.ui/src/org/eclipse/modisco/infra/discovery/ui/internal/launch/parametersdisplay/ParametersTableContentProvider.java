/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 */

package org.eclipse.modisco.infra.discovery.ui.internal.launch.parametersdisplay;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.data.DiscovererParameterDisplay;

public class ParametersTableContentProvider implements IStructuredContentProvider {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// Empty
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
	 * .viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// Empty
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 * .lang.Object)
	 */
	public Object[] getElements(final Object inputElement) {
		DiscovererParameterDisplay[] result = null;
		if (inputElement instanceof DiscovererParameterDisplay) {
			result = new DiscovererParameterDisplay[] { (DiscovererParameterDisplay) inputElement };
		} else if (inputElement instanceof DiscovererParameterDisplay[]) {
			result = (DiscovererParameterDisplay[]) inputElement;
		}
		return result;
	}

}
