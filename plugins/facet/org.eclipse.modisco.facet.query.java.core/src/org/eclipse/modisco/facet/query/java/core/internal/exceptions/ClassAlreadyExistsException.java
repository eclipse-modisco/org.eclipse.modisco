/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - Bug 349569 - Need new exceptions for java query class creation
 *******************************************************************************/
package org.eclipse.modisco.facet.query.java.core.internal.exceptions;

/**
 * This exception is raised whenever the class being created already exists.
 * @since 0.2
 */
public class ClassAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -7352916272441579074L;

}