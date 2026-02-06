/**
 * Copyright (c) 2026 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package loops;

public class Loops {
	public Object doFor() {
		for (int i = 0; i < 10; i++) {
			char[] chars = {'x', 'y'};
			for (char ch : chars) {
				assert chars[0] != 0;
				break;
			}
		}
		return this;
	}
	public void doLoop() {
		int i = 0;
		do {
			if (i == 5) continue;
			if (i == 50 ? true : false) {
				break;
			}
			else {}
			if (i == 500) 
				break;
			else ;
		} while (++i < 100);
		while (i < 10) {
			;
		}
		while (true) {
			assert this instanceof Object;
		}
	}
	public void doLabels() {
		int i = 0;
		restart: 
		do {
			if (i == 5) break restart;
			if (i == 50) {
				break restart;
			}
			if ((i == 500) || (1 == 40))
				break;
		} while (++i < 100);
	//	new double[] {1.0};
	//	new String("xyzzy");
	}
	public int doSwitch() {
		synchronized (this) {
			for (long l : new long[] {1,2,3,4}) {
				switch ((int)l) {
					case 1: return 5;
					case 3:
					default:
				}
			}
		}
		return 0;
	}
	public int doArrays() {
		Class<?>[] c1a = new Class[] { long.class };
		Class<?>[] c1b = new Class[1];
		Class<?>[][] c12a = new Class[][] { { long.class , int.class} };
		Class<?>[][] c12b = new Class[1][2];
		Class<?>[][] c12c = new Class[1][];
		return 0;
	}
}

