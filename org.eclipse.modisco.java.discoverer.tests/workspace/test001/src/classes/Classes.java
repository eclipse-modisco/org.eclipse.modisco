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
package classes;

import comments.Classes.Base;

public class Classes {
	public static class Base {
		protected float field;
		Base(float field) {
			this.field = field;
		}
		void f() { return; }
	}
	public class Derived extends Base {
		protected double derivedField;
		Derived(double derivedField) {
			this();
		}
		Derived() {
			super((float)0.0);
			this.derivedField = derivedField + super.field;
		}
		void f() {
			super.f();
		//	enum MyEnum { XX } -- JDT ignores this
		//	MyEnum myEnum = MyEnum.XX;
			class MyClass {}
		}
	}
}

