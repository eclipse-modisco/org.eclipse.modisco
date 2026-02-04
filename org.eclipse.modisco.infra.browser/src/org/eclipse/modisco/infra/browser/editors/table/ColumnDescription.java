/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors.table;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/** A description of what to show in a column */
public class ColumnDescription {
	/** The possible column types */
	public enum Type {
		DEFAULT_LABEL, METACLASS_NAME, ATTRIBUTE, REFERENCE, ECONTAINER, CONTEXT
	}

	/** The type of this column */
	private final Type type;
	/**
	 * The attribute displayed in the column, when <code>type</code> is
	 * {@link Type#ATTRIBUTE}
	 */
	private EAttribute fAttribute = null;
	/**
	 * The reference displayed in the column, when <code>type</code> is
	 * {@link Type#REFERENCE}
	 */
	private EReference fReference = null;

	public ColumnDescription(final Type type) {
		this.type = type;
	}

	public ColumnDescription(final EAttribute attribute) {
		this.type = ColumnDescription.Type.ATTRIBUTE;
		this.fAttribute = attribute;
	}

	public ColumnDescription(final EReference reference) {
		this.fReference = reference;
		this.type = ColumnDescription.Type.REFERENCE;
	}

	public ColumnDescription(final EStructuralFeature feature) {
		if (feature instanceof EAttribute) {
			EAttribute attribute = (EAttribute) feature;
			this.fAttribute = attribute;
			this.type = ColumnDescription.Type.ATTRIBUTE;
		} else if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			this.fReference = reference;
			this.type = ColumnDescription.Type.REFERENCE;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Type getType() {
		return this.type;
	}

	public EAttribute getAttribute() {
		if (this.type != ColumnDescription.Type.ATTRIBUTE) {
			throw new IllegalStateException();
		}

		return this.fAttribute;
	}

	public EReference getReference() {
		if (this.type != ColumnDescription.Type.REFERENCE) {
			throw new IllegalStateException();
		}

		return this.fReference;
	}
}
