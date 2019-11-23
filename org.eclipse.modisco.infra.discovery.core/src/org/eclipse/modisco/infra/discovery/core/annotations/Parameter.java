/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.modisco.infra.discovery.core.IDiscoverer;

/**
 *
 * The Parameter annotation describes some informations needed to characterize
 * inputs and outputs for discoverers ({@link IDiscoverer})
 *
 * The developer is free to annotate directly a Java field or a getter/setter
 * method, or both field and getter/setter with a same id.
 *
 * An input data is supposed to be valued before a discovery is launched : At
 * least a setter method (preferred) or a public field (discouraged) must be
 * proposed.
 *
 * An output data is supposed to be accessed after a discovery treatment : At
 * least a setter method (preferred) or a public field (discouraged) must be
 * proposed.
 *
 * A data both input and output of the discovery must respond to both previous
 * conditions.
 *
 * Using the annotation will throw compilation errors in the following cases :
 * <ul>
 * <li>
 * annotating a non public field
 * <li>
 * annotating a static field/method
 * <li>
 * annotating a non getter/setter method (e.g. a method which has a java
 * parameter or returns void)
 * <li>
 * annotating with the same id some field, getter, setter related to different
 * Java types
 * <li>
 * annotating more than one field with the same id
 * <li>
 * annotating more than one getter with the same id
 * <li>
 * annotating more than one setter with the same id
 * <li>
 * giving some "required" value on a getter (a getter describes an output data)
 *
 * </ul>
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
public @interface Parameter {
	/**
	 *
	 * @return the identifier of the discoverer parameter
	 */
	String name();

	/**
	 *
	 * @return the optional description of the discoverer parameter
	 */
	String description() default "";

	/**
	 *
	 * @return <code>true</code> if a value for this discoverer parameter is
	 *         mandatory to launch the discovery.
	 */
	boolean requiresInputValue() default false;
}
