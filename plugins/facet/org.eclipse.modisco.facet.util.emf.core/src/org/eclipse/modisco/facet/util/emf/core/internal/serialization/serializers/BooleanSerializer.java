/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.internal.serialization.serializers;

import org.eclipse.modisco.facet.util.emf.core.serialization.ISerializer;

public class BooleanSerializer implements ISerializer<Boolean> {

	public BooleanSerializer() {
		//
	}

	public Class<Boolean> getType() {
		return Boolean.class;
	}

	public String serialize(final Boolean value) {
		return value.toString();
	}

	public Boolean deserialize(final String serializedValue) {
		return Boolean.valueOf(serializedValue);
	}
}
