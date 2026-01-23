/*******************************************************************************
 * Copyright (c) 2008, 2019 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.generation.files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.java.generation.Messages;
import org.eclipse.modisco.java.generation.utils.JavaUtils;

/**
 * Entry point of the 'GenerateJava' generation module.
 *
 * @generated
 */
public class GenerateJava {
	/**
	 * The name of the module.
	 *
	 * @generated
	 */
	public static final String MODULE_FILE_NAME = "/org/eclipse/modisco/java/generation/files/GenerateJava"; //$NON-NLS-1$

	/**
	 * The name of the templates that are to be generated.
	 *
	 * @generated
	 */
	public static final String[] TEMPLATE_NAMES = { "write" }; //$NON-NLS-1$

	/**
     * The list of properties files from the launch parameters (Launch configuration).
     *
     * @generated
     */
    private List<String> propertiesFiles = new ArrayList<String>();

}
