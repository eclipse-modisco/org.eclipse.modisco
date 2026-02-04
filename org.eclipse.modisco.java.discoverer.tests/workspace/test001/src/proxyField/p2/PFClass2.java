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
package proxyField.p2;

import proxyField.p1.PFClass1;

public class PFClass2 {
	public String a1, a2;
	public String b1, b2;
	public String c1, c2;
	
	public static void main(String[] args) {
		new PFClass1().s1 = "hello";
		new PFClass1().s2 = "hello";
	}
}