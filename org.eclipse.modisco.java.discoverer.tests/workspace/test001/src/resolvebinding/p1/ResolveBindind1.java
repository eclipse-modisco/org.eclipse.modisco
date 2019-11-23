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
package resolvebinding.p1;


public class ResolveBindind1 {
	
	public static void main(String[] args) {
//		new ResolveBindind2().new SubResolveBinding2();
		new ResolveBindind1().new SubResolveBinding1();
	}
	
	public void m1(ResolveBindind1 rb2) {
		
	}
	
	public class SubResolveBinding1{
		
	}
}
