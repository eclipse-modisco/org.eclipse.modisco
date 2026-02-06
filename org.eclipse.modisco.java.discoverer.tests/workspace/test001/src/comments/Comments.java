/** 
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
package comments;


/**
 * This class doesn't subclass {@link java.lang.String}
 * @author me
 * @see java.lang.String#toString()
 */
public class Comments {
	
	/**
	 * javadoc on field
	 * @see Comments#s
	 */
	public String s;
	
	/**
	 * javadoc on method
	 * {@link #method(int p)}
	 * @see #method(int p)#p pass me
	 */
	public void method(int p){
		//in method
	}
	
}
/*
 * after class
 */