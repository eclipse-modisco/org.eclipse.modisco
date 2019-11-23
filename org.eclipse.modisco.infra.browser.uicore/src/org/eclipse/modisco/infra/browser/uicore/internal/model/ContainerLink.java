/*******************************************************************************
 * Copyright (c) 2008, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.uicore.internal.model;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ColorProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.util.Util;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * A link to the EMF container of an element ({@link EObject#eContainer()})
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class ContainerLink implements ITreeElement {

	/** The model element that appears as the parent of the link in the tree */
	private final EObject parent;
	/** The parent tree item */
	private final ITreeElement treeParent;
	/** The container model element to display under the link */
	private final EObject container;
	/** The configuration of the way elements are displayed */
	private final AppearanceConfiguration appearanceConfiguration;

	/**
	 * @param parent
	 *            the model element that appears as the parent of the link in
	 *            the tree
	 * @param treeParent
	 *            the parent tree element
	 * @param container
	 *            the container model element to display under the link (null
	 *            means no container)
	 * @param browserConfiguration
	 *            the configuration of the browser in which the model is
	 *            displayed
	 */
	public ContainerLink(final EObject parent, final ITreeElement treeParent,
			final EObject container, final AppearanceConfiguration appearanceConfiguration) {
		this.parent = parent;
		this.treeParent = treeParent;
		this.container = container;
		this.appearanceConfiguration = appearanceConfiguration;
	}

	public String getText() {
		String oppositeLink = ""; //$NON-NLS-1$
		if (this.appearanceConfiguration.isShowOppositeLinks()) {
			final EStructuralFeature containingFeature = this.parent.eContainingFeature();
			if (containingFeature != null) {
				oppositeLink = " <-> " + containingFeature.getName(); //$NON-NLS-1$
			}
		}

		return "/eContainer" + oppositeLink; //$NON-NLS-1$
	}

	public Image getImage() {
		return ImageProvider.getInstance().getContainerIcon();
	}

	public Object getParent() {
		return this.parent;
	}

	public ITreeElement getTreeParent() {
		return this.treeParent;
	}

	private int cachedChildrenModCount = -1;
	private List<ModelElementItem> cachedChildren = null;

	public synchronized List<ModelElementItem> getChildren() {
		if (this.container == null) {
			return Collections.emptyList();
		}
		if (this.cachedChildren == null
				|| this.cachedChildrenModCount != this.appearanceConfiguration.getModCount()) {
			this.cachedChildren = Collections.singletonList(this.appearanceConfiguration
					.getItemsFactory().createModelElementItem(this.container, this,
							this.appearanceConfiguration));
			this.cachedChildrenModCount = this.appearanceConfiguration.getModCount();
		}
		return this.cachedChildren;

	}

	public boolean hasChildren() {
		return this.container != null;
	}

	public Font getFont() {
		return this.appearanceConfiguration.getCustomItalicFont();
	}

	public Color getForeground() {
		if (this.container == null) {
			return ColorProvider.getInstance().getGray();
		}
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
		if (obj instanceof ContainerLink) {
			final ContainerLink other = (ContainerLink) obj;
			return Util.safeEquals(this.container, other.container)
					&& this.parent.equals(other.parent);
		}
		return false;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public int hashCode() {
		final int hashPrime1 = 47;
		final int hashPrime2 = 13;

		final int parentHashCode = this.parent.hashCode() + hashPrime2;
		if (this.container != null) {
			return this.container.hashCode() * hashPrime1 + parentHashCode;
		}
		return parentHashCode;
	}

	@Override
	public String toString() {
		return ContainerLink.class.getSimpleName() + "(" + getText() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}