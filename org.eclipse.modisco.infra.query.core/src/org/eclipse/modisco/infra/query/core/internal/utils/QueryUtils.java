/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.core.internal.utils;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public final class QueryUtils {
	private QueryUtils() {
		// not instantiable
	}

	public static String objectType(final String type) {
		if ("byte".equals(type)) { //$NON-NLS-1$
			return "Byte"; //$NON-NLS-1$
		}
		if ("short".equals(type)) { //$NON-NLS-1$
			return "Short"; //$NON-NLS-1$
		}
		if ("int".equals(type)) { //$NON-NLS-1$
			return "Integer"; //$NON-NLS-1$
		}
		if ("long".equals(type)) { //$NON-NLS-1$
			return "Long"; //$NON-NLS-1$
		}
		if ("float".equals(type)) { //$NON-NLS-1$
			return "Float"; //$NON-NLS-1$
		}
		if ("double".equals(type)) { //$NON-NLS-1$
			return "Double"; //$NON-NLS-1$
		}
		if ("boolean".equals(type)) { //$NON-NLS-1$
			return "Boolean"; //$NON-NLS-1$
		}
		if ("char".equals(type)) { //$NON-NLS-1$
			return "Character"; //$NON-NLS-1$
		}
		return type;
	}

	public static String qualifiedObjectType(final String type) {
		if ("byte".equals(type)) { //$NON-NLS-1$
			return "java.lang.Byte"; //$NON-NLS-1$
		}
		if ("short".equals(type)) { //$NON-NLS-1$
			return "java.lang.Short"; //$NON-NLS-1$
		}
		if ("int".equals(type)) { //$NON-NLS-1$
			return "java.lang.Integer"; //$NON-NLS-1$
		}
		if ("long".equals(type)) { //$NON-NLS-1$
			return "java.lang.Long"; //$NON-NLS-1$
		}
		if ("float".equals(type)) { //$NON-NLS-1$
			return "java.lang.Float"; //$NON-NLS-1$
		}
		if ("double".equals(type)) { //$NON-NLS-1$
			return "java.lang.Double"; //$NON-NLS-1$
		}
		if ("boolean".equals(type)) { //$NON-NLS-1$
			return "java.lang.Boolean"; //$NON-NLS-1$
		}
		if ("char".equals(type)) { //$NON-NLS-1$
			return "java.lang.Character"; //$NON-NLS-1$
		}
		return type;
	}
}
