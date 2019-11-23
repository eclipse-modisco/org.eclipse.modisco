/*******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *******************************************************************************/
package test002;

import test002.Class2.Class3;

public class Class1 {
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		Class3 c3 = c2.new Class3();
	}
	
	public class Class4 {
		
	}
}
