/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.uicore.internal.model;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * A virtual attribute used to display the URI of an {@link EObject}
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class URIAttribute implements ITreeElement {

	/**
	 * The model element that appears as the element of the attribute in the tree
	 */
	private final EObject element;
	/** The element tree item */
	private final ITreeElement treeParent;
	/** The configuration of the way elements are displayed */
	private final AppearanceConfiguration appearanceConfiguration;

	/**
	 * @param element
	 *            the model element that appears as the parent of the attribute in the tree
	 * @param treeParent
	 *            the element tree element
	 * @param browserConfiguration
	 *            the configuration of the browser in which the model is displayed
	 */
	public URIAttribute(final EObject element, final ITreeElement treeParent,
			final AppearanceConfiguration appearanceConfiguration) {
		this.element = element;
		this.treeParent = treeParent;
		this.appearanceConfiguration = appearanceConfiguration;
	}

	public String getText() {
		URI uri = EcoreUtil.getURI(this.element);
		String uriStr;
		if (uri != null) {
			uriStr = uri.toString();
		} else {
			uriStr = "null"; //$NON-NLS-1$
		}
		return "/URI = " + uriStr; //$NON-NLS-1$
	}

	public Image getImage() {
		return ImageProvider.getInstance().getAttributeIcon();
	}

	public Object getParent() {
		return this.element;
	}

	public ITreeElement getTreeParent() {
		return this.treeParent;
	}

	public List<ModelElementItem> getChildren() {
		return Collections.emptyList();
	}

	public boolean hasChildren() {
		return false;
	}

	public Font getFont() {
		return this.appearanceConfiguration.getCustomItalicFont();
	}

	public Color getForeground() {
		return null;
	}

	public Color getBackground() {
		return null;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof URIAttribute) {
			final URIAttribute other = (URIAttribute) obj;
			return this.element.equals(other.element);
		}
		return false;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public int hashCode() {
		return this.element.hashCode();
	}

	@Override
	public String toString() {
		return URIAttribute.class.getSimpleName() + "(" + getText() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}