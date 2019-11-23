/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *******************************************************************************/
package proxyField.p1;

import proxyField.p2.PFClass2;

public class PFClass1 {
	public String s1, s2;
	
	public static void main(String[] args) {
		new PFClass2().b1 = "hello";
		new PFClass2().b2 = "hello";
	}
	
}
