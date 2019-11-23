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
package innerclass;

import innerclass.InnerClass.InnerClass2;
import innerclass.InnerClass.InnerClass2.InnerClass3;

public class InnerClassB {
	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		InnerClass2 ic2 = ic.new InnerClass2();
		InnerClass.InnerClass2 ic22 = ic.new InnerClass2();
		innerclass.InnerClass.InnerClass2 ic222 = ic.new InnerClass2();
		InnerClass2.InnerClass3 ic3 = ic2.new InnerClass3();
	}
}

