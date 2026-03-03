/**
 * Copyright (c) 2026 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package types;

public class Types  {
	
	public void test() {
		try {
			getClass();
		}
		catch (UnsupportedOperationException | IllegalStateException e) {
			;
		}
	}
	
}
