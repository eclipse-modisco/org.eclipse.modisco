/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Customizable Features</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getCustomizableFeatures()
 * @model
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
@SuppressWarnings("all")
public enum CustomizableFeatures implements Enumerator {
	/**
	 * The '<em><b>Visible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	VISIBLE(0, "visible", "visible"),

	/**
	 * The '<em><b>Label</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(1, "label", "label"),

	/**
	 * The '<em><b>Font Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FONT_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	FONT_NAME(2, "fontName", "fontName"),

	/**
	 * The '<em><b>Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR(3, "color", "color"),

	/**
	 * The '<em><b>Background Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_COLOR(4, "backgroundColor", "backgroundColor"), /**
	 * The '<em><b>Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_VALUE
	 * @generated
	 * @ordered
	 */
	ICON(5, "icon", "icon"),

	/**
	 * The '<em><b>Bold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD(6, "bold", "bold"),

	/**
	 * The '<em><b>Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIC(7, "italic", "italic"),

	/**
	 * The '<em><b>Underlined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINED(8, "underlined", "underlined"),

	/**
	 * The '<em><b>Struckthrough</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCKTHROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCKTHROUGH(9, "struckthrough", "struckthrough"), /**
	 * The '<em><b>Hide Metaclass Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDE_METACLASS_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	HIDE_METACLASS_NAME(10, "hideMetaclassName", "hideMetaclassName"), /**
	 * The '<em><b>Facet Main Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACET_MAIN_ICON_VALUE
	 * @generated
	 * @ordered
	 */
	FACET_MAIN_ICON(11, "facetMainIcon", "facetMainIcon"), /**
	 * The '<em><b>Facet Overlay Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACET_OVERLAY_ICON_VALUE
	 * @generated
	 * @ordered
	 */
	FACET_OVERLAY_ICON(12, "facetOverlayIcon", "facetOverlayIcon"), /**
	 * The '<em><b>Metaclass Visible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METACLASS_VISIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	METACLASS_VISIBLE(13, "metaclassVisible", "metaclassVisible"), /**
	 * The '<em><b>Collapse Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLAPSE_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	COLLAPSE_LINK(14, "collapseLink", "collapseLink"), /**
	 * The '<em><b>Metaclass Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METACLASS_ICON_VALUE
	 * @generated
	 * @ordered
	 */
	METACLASS_ICON(15, "metaclassIcon", "metaclassIcon"), /**
	 * The '<em><b>Instance Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_ICON_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE_ICON(16, "instanceIcon", "instanceIcon"), /**
	 * The '<em><b>Sticker Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STICKER_ICON_VALUE
	 * @generated
	 * @ordered
	 */
	STICKER_ICON(17, "stickerIcon", "stickerIcon");

	/**
	 * The '<em><b>Visible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIBLE
	 * @model name="visible"
	 * @generated
	 * @ordered
	 */
	public static final int VISIBLE_VALUE = 0;

	/**
	 * The '<em><b>Label</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Label</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model name="label"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 1;

	/**
	 * The '<em><b>Font Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Font Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FONT_NAME
	 * @model name="fontName"
	 * @generated
	 * @ordered
	 */
	public static final int FONT_NAME_VALUE = 2;

	/**
	 * The '<em><b>Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR
	 * @model name="color"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_VALUE = 3;

	/**
	 * The '<em><b>Background Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Background Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_COLOR
	 * @model name="backgroundColor"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_COLOR_VALUE = 4;

	/**
	 * The '<em><b>Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Icon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON
	 * @model name="icon"
	 * @generated
	 * @ordered
	 */
	public static final int ICON_VALUE = 5;

	/**
	 * The '<em><b>Bold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bold</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOLD
	 * @model name="bold"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_VALUE = 6;

	/**
	 * The '<em><b>Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Italic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITALIC
	 * @model name="italic"
	 * @generated
	 * @ordered
	 */
	public static final int ITALIC_VALUE = 7;

	/**
	 * The '<em><b>Underlined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Underlined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINED
	 * @model name="underlined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINED_VALUE = 8;

	/**
	 * The '<em><b>Struckthrough</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Struckthrough</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCKTHROUGH
	 * @model name="struckthrough"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCKTHROUGH_VALUE = 9;

	/**
	 * The '<em><b>Hide Metaclass Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hide Metaclass Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDE_METACLASS_NAME
	 * @model name="hideMetaclassName"
	 * @generated
	 * @ordered
	 */
	public static final int HIDE_METACLASS_NAME_VALUE = 10;

	/**
	 * The '<em><b>Facet Main Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Facet Main Icon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACET_MAIN_ICON
	 * @model name="facetMainIcon"
	 * @generated
	 * @ordered
	 */
	public static final int FACET_MAIN_ICON_VALUE = 11;

	/**
	 * The '<em><b>Facet Overlay Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Facet Overlay Icon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACET_OVERLAY_ICON
	 * @model name="facetOverlayIcon"
	 * @generated
	 * @ordered
	 */
	public static final int FACET_OVERLAY_ICON_VALUE = 12;

	/**
	 * The '<em><b>Metaclass Visible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metaclass Visible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METACLASS_VISIBLE
	 * @model name="metaclassVisible"
	 * @generated
	 * @ordered
	 */
	public static final int METACLASS_VISIBLE_VALUE = 13;

	/**
	 * The '<em><b>Collapse Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collapse Link</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLAPSE_LINK
	 * @model name="collapseLink"
	 * @generated
	 * @ordered
	 */
	public static final int COLLAPSE_LINK_VALUE = 14;

	/**
	 * The '<em><b>Metaclass Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metaclass Icon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METACLASS_ICON
	 * @model name="metaclassIcon"
	 * @generated
	 * @ordered
	 */
	public static final int METACLASS_ICON_VALUE = 15;

	/**
	 * The '<em><b>Instance Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instance Icon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_ICON
	 * @model name="instanceIcon"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_ICON_VALUE = 16;

	/**
	 * The '<em><b>Sticker Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sticker Icon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STICKER_ICON
	 * @model name="stickerIcon"
	 * @generated
	 * @ordered
	 */
	public static final int STICKER_ICON_VALUE = 17;

	/**
	 * An array of all the '<em><b>Customizable Features</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CustomizableFeatures[] VALUES_ARRAY =
		new CustomizableFeatures[] {
			VISIBLE,
			LABEL,
			FONT_NAME,
			COLOR,
			BACKGROUND_COLOR,
			ICON,
			BOLD,
			ITALIC,
			UNDERLINED,
			STRUCKTHROUGH,
			HIDE_METACLASS_NAME,
			FACET_MAIN_ICON,
			FACET_OVERLAY_ICON,
			METACLASS_VISIBLE,
			COLLAPSE_LINK,
			METACLASS_ICON,
			INSTANCE_ICON,
			STICKER_ICON,
		};

	/**
	 * A public read-only list of all the '<em><b>Customizable Features</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CustomizableFeatures> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Customizable Features</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomizableFeatures get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomizableFeatures result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Customizable Features</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomizableFeatures getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomizableFeatures result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Customizable Features</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomizableFeatures get(int value) {
		switch (value) {
			case VISIBLE_VALUE: return VISIBLE;
			case LABEL_VALUE: return LABEL;
			case FONT_NAME_VALUE: return FONT_NAME;
			case COLOR_VALUE: return COLOR;
			case BACKGROUND_COLOR_VALUE: return BACKGROUND_COLOR;
			case ICON_VALUE: return ICON;
			case BOLD_VALUE: return BOLD;
			case ITALIC_VALUE: return ITALIC;
			case UNDERLINED_VALUE: return UNDERLINED;
			case STRUCKTHROUGH_VALUE: return STRUCKTHROUGH;
			case HIDE_METACLASS_NAME_VALUE: return HIDE_METACLASS_NAME;
			case FACET_MAIN_ICON_VALUE: return FACET_MAIN_ICON;
			case FACET_OVERLAY_ICON_VALUE: return FACET_OVERLAY_ICON;
			case METACLASS_VISIBLE_VALUE: return METACLASS_VISIBLE;
			case COLLAPSE_LINK_VALUE: return COLLAPSE_LINK;
			case METACLASS_ICON_VALUE: return METACLASS_ICON;
			case INSTANCE_ICON_VALUE: return INSTANCE_ICON;
			case STICKER_ICON_VALUE: return STICKER_ICON;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CustomizableFeatures(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CustomizableFeatures
