/*******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *******************************************************************************/
package parameterizedtype;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParameterizedType2<T1 extends Thread & List, T2 extends List<? extends Boolean>>
		extends ArrayList {
	private Map<String, ? super String> aMap = null;

	public <T3> void MaMethodeParametree(T2 aT, List<? extends T1> aP) {
		System.out.println(aT.toString());
	}

	public void MaMethodeParametree2(List<?> aP) {
	}

}
