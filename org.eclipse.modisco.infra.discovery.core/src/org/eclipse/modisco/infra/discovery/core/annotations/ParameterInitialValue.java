/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 338702 - [Discovery] specify initial value for Parameters
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to define a getter method that returns an initial
 * value for a {@link Parameter}.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface ParameterInitialValue {
	/**
	 * @return the identifier of the discoverer {@link Parameter} for which the
	 *         associated method provides an initial value.
	 */
	String name();
}
