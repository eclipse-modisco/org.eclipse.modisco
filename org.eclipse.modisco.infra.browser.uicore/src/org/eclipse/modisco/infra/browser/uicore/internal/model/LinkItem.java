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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ColorProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetReference;
import org.eclipse.modisco.infra.facet.FacetStructuralFeature;
import org.eclipse.modisco.infra.facet.Shortcut;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * A link (representing an {@link EReference}) between two model elements in the tree.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class LinkItem implements ITreeElement, IAdaptable {

	/** The reference corresponding to the link */
	private final EReference reference;
	/** The model element that owns the link */
	private final EObject parent;
	/** The parent tree element */
	private final ITreeElement treeParent;
	/** The configuration of the browser in which the model is displayed */
	private final AppearanceConfiguration appearanceConfiguration;

	private int cachedChildrenModCount = -1;
	private List<?> cachedChildren = null;
	private int cachedChildrenElementsModCount = -1;
	private List<Object> cachedChildrenElements = null;

	/**
	 * Instantiate a new LinkItem.
	 *
	 * @param parent
	 *            the model element that owns the link
	 * @param reference
	 *            the reference corresponding to the link
	 * @param browserConfiguration
	 *            the configuration of the browser in which the model is displayed
	 */
	public LinkItem(final EObject parent, final ITreeElement treeParent,
			final EReference reference, final AppearanceConfiguration appearanceConfiguration) {
		this.reference = reference;
		this.parent = parent;
		this.treeParent = treeParent;
		this.appearanceConfiguration = appearanceConfiguration;
	}

	/**
	 * @return the reference corresponding to the link
	 */
	public EReference getReference() {
		return this.reference;
	}

	/** @return the number of elements referenced by this link */
	public int getCount() {
		return getChildrenElements().size();
	}

	public String getText() {
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final String customizedLabel = customizationEngine.getReferenceLabel(facetOrParentClass(),
				this.reference.getName(), this.parent);

		final String staticText = getStaticText(this.reference,
				this.appearanceConfiguration.isShowMultiplicity(),
				this.appearanceConfiguration.isShowOppositeLinks(), customizedLabel);
		String result = staticText + " (" + getCount() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		if (this.appearanceConfiguration.isShowTypeOfLinks()) {
			result = result + " [" + getReference().getEReferenceType().getName() + "]"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		return result;
	}

	/**
	 * Get a text describing the given reference
	 *
	 * @param reference
	 *            the reference to describe
	 * @param showMultiplicity
	 *            whether to add the feature multiplicity
	 * @param showOpposite
	 *            whether to add the opposite feature
	 * @param customizedName
	 *            if not <code>null</code>, specifies a customized name for the reference
	 * @return a text describing the feature
	 */
	public static String getStaticText(final EReference reference, final boolean showMultiplicity,
			final boolean showOpposite, final String customizedName) {

		String multiplicity = ""; //$NON-NLS-1$

		if (showMultiplicity) {
			multiplicity = getMultiplicity(reference);
		}

		String opposite = ""; //$NON-NLS-1$

		if (showOpposite) {
			final EReference oppositeRef = reference.getEOpposite();
			if (oppositeRef != null) {
				String oppositeMultiplicity = ""; //$NON-NLS-1$
				if (showMultiplicity) {
					oppositeMultiplicity = getMultiplicity(oppositeRef);
				}

				opposite = " <-> " + oppositeRef.getName() + oppositeMultiplicity; //$NON-NLS-1$
			}
		}

		final String prefix;
		if (reference.isDerived()) {
			prefix = "/"; //$NON-NLS-1$
		} else {
			prefix = ""; //$NON-NLS-1$
		}
		final String referenceName;
		if (customizedName != null) {
			referenceName = customizedName;
		} else {
			referenceName = reference.getName();
		}
		return prefix + referenceName + multiplicity + opposite;
	}

	public static String getMultiplicity(final EReference reference) {
		final String multLow;
		if (reference.isRequired()) {
			multLow = "1"; //$NON-NLS-1$
		} else {
			multLow = "0"; //$NON-NLS-1$
		}
		final String multHigh;
		if (reference.isMany()) {
			multHigh = "*"; //$NON-NLS-1$
		} else {
			multHigh = "1"; //$NON-NLS-1$
		}
		return " [" + multLow + ".." + multHigh + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	public Image getImage() {
		// Customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Image customizedIcon = customizationEngine.getReferenceIcon(facetOrParentClass(),
				this.reference.getName(), this.parent);
		if (customizedIcon != null) {
			return customizedIcon;
		}

		return getImageFor(this.reference);
	}

	public static Image getImageFor(final EReference reference) {
		if (reference instanceof FacetReference || reference instanceof Shortcut) {
			return ImageProvider.getInstance().getFacetLinkIcon();
		}

		final EReference opposite = reference.getEOpposite();

		if (reference.isContainment()) {
			if (opposite == null) {
				return ImageProvider.getInstance().getUnidirectionalAggregIcon();
			}
			return ImageProvider.getInstance().getAggregIcon();
		}

		if (opposite != null && opposite.isContainment()) {
			return ImageProvider.getInstance().getInvAggregIcon();
		}

		if (opposite == null) {
			return ImageProvider.getInstance().getUnidirectionalLinkIcon();
		}
		return ImageProvider.getInstance().getLinkIcon();
	}

	public EObject getParent() {
		return this.parent;
	}

	public ITreeElement getTreeParent() {
		return this.treeParent;
	}

	public synchronized List<?> getChildren() {
		if (this.cachedChildren == null
				|| this.cachedChildrenModCount != this.appearanceConfiguration.getModCount()) {
			final List<Object> childrenList = getChildrenElements();
			if (childrenList.isEmpty()) {
				this.cachedChildren = Collections.emptyList();
			} else {
				final boolean ordered = this.reference.isMany() && this.reference.isOrdered();
				// partition the elements if there are too many elements under
				// this link
				this.cachedChildren = BigListItem.splitElements(this, this.parent, childrenList,
						this.appearanceConfiguration, ordered);
			}
			this.cachedChildrenModCount = this.appearanceConfiguration.getModCount();
		}
		return this.cachedChildren;
	}

	public boolean hasChildren() {
		return getChildrenElements().size() > 0;
	}

	/** Return the list of children, without any partitioning */
	public synchronized List<Object> getChildrenElements() {
		if (this.cachedChildrenElements == null
				|| this.cachedChildrenElementsModCount != this.appearanceConfiguration
						.getModCount()) {
			final CustomizationEngine customizationEngine = this.appearanceConfiguration
					.getCustomizationEngine();
			if (this.reference.isMany()) {
				final List<?> childrenList = (List<?>) localEGet();
				if (childrenList != null) {
					this.cachedChildrenElements = customizationEngine.filterVisible(childrenList);
				} else {
					this.cachedChildrenElements = Collections.emptyList();
				}
			} else {
				Object element = localEGet();
				if (element instanceof EObject) {
					EObject eObject = (EObject) element;
					if (!customizationEngine.isTypeVisible(eObject.eClass(), eObject)) {
						element = null;
					}
				}
				if (element == null) {
					this.cachedChildrenElements = Collections.emptyList();
				} else {
					this.cachedChildrenElements = Collections.singletonList(element);
				}
			}
			this.cachedChildrenElementsModCount = this.appearanceConfiguration.getModCount();
		}
		return this.cachedChildrenElements;
	}

	private Object localEGet() {
		Object result;
		if (this.reference instanceof FacetStructuralFeature || this.reference instanceof Shortcut) {
			try {
				result = this.appearanceConfiguration.getFacetContext().get(this.parent,
						this.reference);
			} catch (final Exception e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				result = null;
			}
		} else {
			try {
				Resource resource = this.parent.eResource();
				if (resource != null) {
					synchronized (this.parent.eResource()) {
						result = this.parent.eGet(this.reference);
					}
				} else {
					result = this.parent.eGet(this.reference);
				}
			} catch (Exception e) {
				MoDiscoLogger.logError(e, "Error getting value of feature '" //$NON-NLS-1$
						+ ((ENamedElement) this.reference.eContainer()).getName() + "::" //$NON-NLS-1$
						+ this.reference.getName() + "' on instance of '" //$NON-NLS-1$
						+ this.parent.eClass().getName() + "'", Activator.getDefault()); //$NON-NLS-1$
				result = null;
			}

		}
		return result;
	}

	public Color getForeground() {
		// apply potential color customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Color color = customizationEngine.getReferenceColor(facetOrParentClass(),
				this.reference.getName(), this.parent);
		if (color != null) {
			return color;
		}

		if (getCount() == 0) {
			return ColorProvider.getInstance().getGray();
		}
		return null;
	}

	public Color getBackground() {
		// apply potential color customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Color color = customizationEngine.getReferenceBackgroundColor(facetOrParentClass(),
				this.reference.getName(), this.parent);
		if (color != null) {
			return color;
		}
		return null;
	}

	public Font getFont() {
		// apply potential font customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Font customizedFont = customizationEngine.getCustomizedReferenceFont(
				facetOrParentClass(), this.reference.getName(),
				this.appearanceConfiguration.getCustomFont(), this.parent);
		if (customizedFont != null) {
			return customizedFont;
		}
		return null;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof LinkItem) {
			final LinkItem other = (LinkItem) obj;
			return this.reference.equals(other.reference) && this.parent.equals(other.parent);
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
		return this.reference.hashCode() * hashPrime1 + this.parent.hashCode() + hashPrime2;
	}

	/**
	 * If the attribute is defined in a facet, then return this facet. Otherwise, return the parent
	 * eClass of the attribute.
	 */
	public EClass facetOrParentClass() {
		if (this.reference instanceof FacetReference || this.reference instanceof Shortcut) {
			Facet facet = (Facet) this.reference.eContainer();
			return facet;
		}
		return this.parent.eClass();
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class adapter) {
		if (adapter == EReference.class) {
			return this.reference;
		}
		return null;
	}

	@Override
	public String toString() {
		return LinkItem.class.getSimpleName() + "(" + getText() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}