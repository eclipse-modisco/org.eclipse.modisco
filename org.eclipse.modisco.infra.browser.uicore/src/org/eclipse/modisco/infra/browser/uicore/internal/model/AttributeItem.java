/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.uicore.internal.model;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ColorProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.internal.utils.StringUtils;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetAttribute;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * An item for displaying attributes ({@link EAttribute}) of a model element as elements in the tree.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class AttributeItem implements ITreeElement, IAdaptable {

	/** The attribute */
	private final EAttribute attribute;
	/** The model element that has this attribute */
	private final EObject parent;
	/** The parent tree item */
	private final ITreeElement treeParent;
	/** The configuration of the way elements are displayed */
	private final AppearanceConfiguration appearanceConfiguration;

	private int cachedCount = -1;
	private Object cachedValue = null;

	/**
	 * Instantiate a new {@link AttributeItem}.
	 *
	 * @param parent
	 *            the model element that has this attribute
	 * @param treeParent
	 *            the parent tree item
	 * @param attribute
	 *            the attribute
	 * @param browserConfiguration
	 *            the configuration of the browser in which the model is
	 *            displayed
	 */
	public AttributeItem(final EObject parent, final ITreeElement treeParent,
			final EAttribute attribute, final AppearanceConfiguration appearanceConfiguration) {
		this.parent = parent;
		this.attribute = attribute;
		this.treeParent = treeParent;
		this.appearanceConfiguration = appearanceConfiguration;
	}

	public EAttribute getAttribute() {
		return this.attribute;
	}

	/** @return the number of elements referenced by this attribute */
	public int getCount() {
		if (this.cachedCount == -1) {
			final Object value = localGet();
			if (this.attribute.isMany()) {
				this.cachedCount = ((List<?>) value).size();
			} else {
				if (value != null) {
					this.cachedCount = 1;
				} else {
					this.cachedCount = 0;
				}

			}
		}
		return this.cachedCount;
	}

	/**
	 * @return the value of the attribute's feature (works for facets attributes
	 *         too)
	 */
	private Object localGet() {
		if (this.cachedValue != null) {
			return this.cachedValue;
		}
		if (this.attribute instanceof FacetAttribute) {
			try {
				this.cachedValue = this.appearanceConfiguration.getFacetContext().get(this.parent,
						this.attribute);
			} catch (final Exception e) {
				Logger.logError(e, Activator.getDefault());
				this.cachedValue = null;
			}
		} else {
			this.cachedValue = this.parent.eGet(this.attribute);
		}
		return this.cachedValue;
	}

	public String getText() {
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final String customizedLabel = customizationEngine.getAttributeLabel(facetOrParentClass(),
				this.attribute.getName(), this.parent);

		final String staticText = getStaticText(this.attribute,
				this.appearanceConfiguration.isShowMultiplicity(), customizedLabel);

		String strCount;
		if (this.attribute.isMany()) {
			strCount = " (" + getCount() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			strCount = ""; //$NON-NLS-1$
		}

		String strValue = getValueText();
		strValue = StringUtils.truncateBeforeNewline(strValue);

		return staticText + strCount + " = " + strValue; //$NON-NLS-1$
	}

	public String getValueText() {
		String strValue;
		if (!this.attribute.isMany()) {
			final Object value = localGet();
			if (value != null) {
				strValue = value.toString();
			} else {
				strValue = ""; //$NON-NLS-1$
			}
		} else {
			strValue = ""; //$NON-NLS-1$
		}
		return strValue;
	}

	/**
	 * Get a text describing the given attribute
	 *
	 * @param attribute
	 *            the attribute to describe
	 * @param showMultiplicity
	 *            whether to show the attribute multiplicity
	 * @param customizedName
	 *            if not <code>null</code>, specifies a customized name for the
	 *            attribute
	 * @return a text describing the attribute
	 */
	public static String getStaticText(final EAttribute attribute, final boolean showMultiplicity,
			final String customizedName) {
		String multiplicity = ""; //$NON-NLS-1$

		if (showMultiplicity) {
			final String multLow;
			if (attribute.isRequired()) {
				multLow = "1"; //$NON-NLS-1$
			} else {
				multLow = "0"; //$NON-NLS-1$
			}
			final String multHigh;
			if (attribute.isMany()) {
				multHigh = "*"; //$NON-NLS-1$
			} else {
				multHigh = "1"; //$NON-NLS-1$
			}
			multiplicity = " [" + multLow + ".." + multHigh + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}

		final String prefix;
		if (attribute.isDerived()) {
			prefix = "/"; //$NON-NLS-1$
		} else {
			prefix = ""; //$NON-NLS-1$
		}

		final String attributeName;
		if (customizedName != null) {
			attributeName = customizedName;
		} else {
			attributeName = attribute.getName();
		}
		return prefix + attributeName + multiplicity;
	}

	public Image getImage() {
		// Customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Image customizedIcon = customizationEngine.getAttributeIcon(facetOrParentClass(),
				this.attribute.getName(), this.parent);
		if (customizedIcon != null) {
			return customizedIcon;
		}

		if (this.attribute instanceof FacetAttribute) {
			return ImageProvider.getInstance().getFacetAttributeIcon();
		}
		return ImageProvider.getInstance().getAttributeIcon();
	}

	public EObject getParent() {
		return this.parent;
	}

	public ITreeElement getTreeParent() {
		return this.treeParent;
	}

	public boolean hasChildren() {
		return this.attribute.isMany() && getCount() > 0;
	}

	public List<?> getChildren() {
		if (this.attribute.isMany()) {
			@SuppressWarnings("unchecked")
			final List<Object> children = (List<Object>) this.parent.eGet(this.attribute);
			return Collections.unmodifiableList(children);
		}
		return Collections.EMPTY_LIST;
	}

	public Color getForeground() {
		// apply potential color customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Color color = customizationEngine.getAttributeColor(facetOrParentClass(),
				this.attribute.getName(), this.parent);
		if (color != null) {
			return color;
		}

		/* Show the attribute in gray if it is empty */
		if (getCount() == 0) {
			return ColorProvider.getInstance().getGray();
		}
		return null;
	}

	public Color getBackground() {
		// apply potential color customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Color color = customizationEngine.getAttributeBackgroundColor(facetOrParentClass(),
				this.attribute.getName(), this.parent);
		return color;
	}

	public Font getFont() {
		// apply potential font customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Font customizedFont = customizationEngine.getCustomizedAttributeFont(
				facetOrParentClass(), this.attribute.getName(),
				this.appearanceConfiguration.getCustomFont(), this.parent);
		return customizedFont;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof AttributeItem) {
			final AttributeItem other = (AttributeItem) obj;
			return this.attribute.equals(other.attribute) && this.parent.equals(other.parent);
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
		return this.attribute.hashCode() * hashPrime1 + this.parent.hashCode() + hashPrime2;
	}

	/**
	 * If the attribute is defined in a facet, then return this facet.
	 * Otherwise, return the parent eClass of the attribute.
	 */
	public EClass facetOrParentClass() {
		if (this.attribute instanceof FacetAttribute) {
			Facet facet = (Facet) this.attribute.eContainer();
			return facet;
		}
		return this.parent.eClass();
	}

	// /**
	// * Return property descriptors so that the attribute appears in the
	// Properties view when it is
	// * selected.
	// */
	// @Override
	// public List<IItemPropertyDescriptor> getPropertyDescriptors(Object
	// object) {
	// if (this.itemPropertyDescriptors == null) {
	// this.itemPropertyDescriptors = new ArrayList<IItemPropertyDescriptor>();
	//
	// // get the property descriptors from the parent
	// ModelElementItem parentItemProvider = (ModelElementItem)
	// this.adapterFactory
	// .adapt(this.parent, IItemPropertySource.class);
	//
	// List<IItemPropertyDescriptor> parentDescriptors = parentItemProvider
	// .getPropertyDescriptors(this.parent);
	//
	// for (IItemPropertyDescriptor descriptor : parentDescriptors) {
	// // if the parent's descriptor matches the link's reference, then add it
	// if (descriptor.getFeature(this.parent) == this.attribute) {
	// this.itemPropertyDescriptors.add(new ItemPropertyDescriptorDecorator(
	// this.parent, descriptor) {
	// @Override
	// public String getCategory(Object thisObject) {
	// // no category (show at root)
	// return null;
	// }
	//
	// @Override
	// public String getId(Object thisObject) {
	// return AttributeItemProvider.this.attribute.getName()
	// + getDisplayName(thisObject);
	// }
	//
	// });
	// }
	// }
	// }
	// return this.itemPropertyDescriptors;
	// }

	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class adapter) {
		if (adapter == EAttribute.class) {
			return this.attribute;
		}
		return null;
	}

	@Override
	public String toString() {
		return AttributeItem.class.getSimpleName() + "(" + getText() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}