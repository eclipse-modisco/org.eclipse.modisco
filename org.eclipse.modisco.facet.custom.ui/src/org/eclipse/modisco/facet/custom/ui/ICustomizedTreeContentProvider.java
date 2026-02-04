/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;

/**
 * An {@link ITreeContentProvider} which is implemented and customizable using the EMF Facet customization mechanisms.
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 0.2
 */
public interface ICustomizedTreeContentProvider extends ITreeContentProvider {
	/**
	 * This method returns the customization manager used by the content provider. Updates to the list of loaded
	 * customizations have to be done using the {@link ICustomizationManager} returned by this method.
	 * 
	 * @return the customization manager used by this content provider.
	 */
	ICustomizationManager getCustomizationManager();
}
