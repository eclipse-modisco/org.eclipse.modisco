/*******************************************************************************
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *		Fabien Giquel (Mia-Software) - Bug 351590 - [Java] ClassCastException while discovering Apache math commons
 *******************************************************************************/
package mypkg;

public @interface MyAnnotation {

	public class myClass {
		public void m() {
			MyAnnotation anAnnot = null;
			String f1 = anAnnot.arg1();
		}
	}

	String arg1();

}
