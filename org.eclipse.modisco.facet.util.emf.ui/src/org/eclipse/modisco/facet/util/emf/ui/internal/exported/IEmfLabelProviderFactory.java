/**
 * Copyright (c) 2013, 2019 Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 406578 - Generic Label Provider for EMF objects
 */
package org.eclipse.modisco.facet.util.emf.ui.internal.exported;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.modisco.facet.util.emf.ui.internal.EmfLabelProviderFactory;

/**
 * @since 0.4
 */
public interface IEmfLabelProviderFactory {

	IEmfLabelProviderFactory DEFAULT = new EmfLabelProviderFactory();

	ILabelProvider createLabelProvider();
}
