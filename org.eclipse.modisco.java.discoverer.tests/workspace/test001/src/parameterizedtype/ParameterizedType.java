/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *******************************************************************************/
package parameterizedtype;

import javax.lang.model.type.ArrayType;


public class ParameterizedType<P extends String> {
	public <X extends String> P first(X x) {
		{
			return null;
		}
	}
	
	public <X extends Integer> P first(X x) {
		{
			return null;
		}
	}
	
	public <X extends Integer & ArrayType, Y extends String> P second(X x) {
		{
			return null;
		}
	}
}

