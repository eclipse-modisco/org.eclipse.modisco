/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.core.exception;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ExecutionEnvironmentException extends ModelQueryException {

	private static final long serialVersionUID = -1902759878640028259L;
	private final String requiredExecEnv;
	private final String availableExecEnv;

	public ExecutionEnvironmentException(final String requiredExecEnv, final String availableExecEnv) {
		super(ExecutionEnvironmentException.class.getName());
		this.requiredExecEnv = requiredExecEnv;
		this.availableExecEnv = availableExecEnv;
	}

	public String getRequiredExecEnv() {
		return this.requiredExecEnv;
	}

	public String getAvailableExecEnv() {
		return this.availableExecEnv;
	}

	@Override
	public String getMessage() {
		return "The required execution environment " + this.requiredExecEnv + " is not available. The available execution environments are: " //$NON-NLS-1$ //$NON-NLS-2$
				+ this.availableExecEnv;
	}
}
