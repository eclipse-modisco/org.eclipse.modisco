/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.builder;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;


/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class EcoreBuilder extends MoDiscoCatalogBuilder {

	public static final String FILE_EXTENSION = "ecore"; //$NON-NLS-1$

	@Override
	protected AbstractMoDiscoCatalog getCatalog() {
		return EcoreCatalog.getSingleton();
	}

	@Override
	protected String getElementType() {
		return null;
	}

	@Override
	protected String getRegistrationExtensionPoint() {
		return null;
	}

	@Override
	protected String getMarkerType() {
		return null;
	}

	@Override
	protected String getFileExtension() {
		return EcoreBuilder.FILE_EXTENSION;
	}

	@Override
	protected Plugin getActivator() {
		return CommonModiscoActivator.getDefault();
	}

}
