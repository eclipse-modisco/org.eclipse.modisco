/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *******************************************************************************/
package annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
@MyAnnotation(numero = 2, valeur = "ok")
public class MyAnnotatedClass2 {
	@Deprecated
	int j;

	public @interface MonInnerAnnotation {
		String value() default "ok";

		String maV = "";
	}

	@Deprecated
	@MonInnerAnnotation("ok")
	@MyAnnotation(numero = 2, valeur = "ok")
	public void MaMethode(java.io.File aFile) {
		@SuppressWarnings("unused")
		String v;
	}

}
