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
package unresolved;

public class Unresolved extends unrPkg1.Bob {
	
	public Bobette main(BobMan boby) {
		Bob b = new SuperBob();
		
		Bobette b2 = b.getBobette(); 
		
		if(b > b2){
			throw new BobException();
		}
		return null;
	}
	
}
