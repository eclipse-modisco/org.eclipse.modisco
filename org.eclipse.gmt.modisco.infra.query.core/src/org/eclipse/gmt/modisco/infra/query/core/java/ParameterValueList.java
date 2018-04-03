/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bertrand Daru (Mia-Software) - initial API and implementation
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.infra.query.core.java;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.gmt.modisco.infra.query.ModelQueryParameter;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryParameterValue;
import org.eclipse.gmt.modisco.infra.query.runtime.RuntimeFactory;

/**
 * List of query parameters, with two method for name direct value / param access.
 *
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ParameterValueList extends ArrayList<ModelQueryParameterValue> {

	/** SERIAL ID */
	private static final long serialVersionUID = 1L;

	public ParameterValueList(final ModelQueryParameterValue... values) {
		this.addAll(Arrays.asList(values));
	}

	/**
	 * Return the value of the parameter with specidied name.
	 * @param name the name.
	 * @return the value, or null if parameter is unknown.
	 */
	public Object getValueByParameterName(final String name) {
		ModelQueryParameterValue param = getParameterValueByName(name);
		if (param == null) {
			return null;
		}
		return param.getValue();
	}

	/**
	 * Return the parameter with specified name.
	 *
	 * @param name
	 *            the name.
	 * @return the parameter, or null if parameter is unknown.
	 */
	public ModelQueryParameterValue getParameterValueByName(final String name) {
		for (ModelQueryParameterValue param : this) {
			if (param.getParameter().getName().equals(name)) {
				return param;
			}
		}
		return null;
	}

	public static ModelQueryParameterValue createParameterValue(final Object value,
			final ModelQueryParameter parameter) {
		ModelQueryParameterValue paramValue = RuntimeFactory.eINSTANCE
				.createModelQueryParameterValue();
		paramValue.setParameter(parameter);
		paramValue.setValue(value);
		return paramValue;
	}

	/**
	 * Return the parameter with specified a parameter object.
	 *
	 * @param parameter
	 *            the parameter object.
	 * @return the parameter, or null if parameter is unknown.
	 */
	public ModelQueryParameterValue getParameterValue(final ModelQueryParameter parameter) {
		for (ModelQueryParameterValue paramValue : this) {
			if (paramValue.getParameter() == parameter) {
				return paramValue;
			}
		}
		return null;
	}

	public Object getValue(final ModelQueryParameter parameter) {
		return getParameterValue(parameter).getValue();
	}

}
