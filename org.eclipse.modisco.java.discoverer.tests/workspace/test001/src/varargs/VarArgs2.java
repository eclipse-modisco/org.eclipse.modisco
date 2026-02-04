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
package varargs;

import java.text.MessageFormat;
import java.util.Date;

public class VarArgs2 {

	public static void main(String[] args) {
		String result = MessageFormat.format(
			    "At {1,time} on {1,date}, there was {2} on planet "
			    + "{0,number,integer}.",
			    7, new Date(), "a disturbance in the Force");

	}
	
	public void m1(Object... objects) {
		int i = objects.length;
	}
}
