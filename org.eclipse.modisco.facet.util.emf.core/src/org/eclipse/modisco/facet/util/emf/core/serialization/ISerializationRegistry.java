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
package org.eclipse.modisco.facet.util.emf.core.serialization;

import java.util.List;

import org.eclipse.modisco.facet.util.emf.core.internal.serialization.SerializationRegistry;

/**
 * The registry of {@link ISerializer}s per type. 
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ISerializationRegistry {
	public static ISerializationRegistry INSTANCE = new SerializationRegistry();

	/** Get all the serializers . */
	List<ISerializer<?>> getSerializers();

	/**
	 * @return the serializer for the given type, or <code>null</code> if none has been registered.
	 *         Also returns serializers for super-types of <code>type</code>.
	 */
	ISerializer<?> getSerializerFor(Class<?> type);

	/**
	 * @return the serializer for the given type qualified name, or <code>null</code> if none has
	 *         been registered. Does not return serializers for super-types of <code>type</code>.
	 */
	ISerializer<?> getSerializerFor(String type);
}
