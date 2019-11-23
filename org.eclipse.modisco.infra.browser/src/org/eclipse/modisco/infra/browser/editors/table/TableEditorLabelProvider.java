/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors.table;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.core.ModelElementItemEx;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.common.core.internal.utils.StringUtils;
import org.eclipse.modisco.infra.facet.FacetAttribute;
import org.eclipse.modisco.infra.facet.FacetReference;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.swt.graphics.Image;

public class TableEditorLabelProvider extends LabelProvider implements ITableLabelProvider {

	private final BrowserConfiguration browserConfiguration;
	private final List<ColumnDescription> columns;

	public TableEditorLabelProvider(final List<ColumnDescription> columns,
			final BrowserConfiguration browserConfiguration) {
		this.columns = columns;
		this.browserConfiguration = browserConfiguration;
	}

	public String getTextFor(final Object element) {
		if (element == null) {
			return "null"; //$NON-NLS-1$
		}
		if (element instanceof EObject) {
			final EObject eObject = (EObject) element;
			return new ModelElementItemEx(eObject, null, this.browserConfiguration).getText();
		}
		// primitive DataType
		return element.toString();
	}

	public Image getImageFor(final Object element) {
		if (element == null) {
			return null;
		}

		if (element instanceof EObject) {
			final EObject eObject = (EObject) element;
			return new ModelElementItemEx(eObject, null, this.browserConfiguration).getImage();
		}

		return null;
	}

	public Image getColumnImage(final Object element, final int columnIndex) {
		if (columnIndex < this.columns.size()) {
			final ColumnDescription columnDescription = this.columns.get(columnIndex);
			TableElement tableElement = (TableElement) element;

			switch (columnDescription.getType()) {
			case DEFAULT_LABEL:
				return getImageFor(tableElement.getElement());
			case REFERENCE:
				final EReference reference = columnDescription.getReference();
				final EObject eObject = (EObject) tableElement.getElement();

				final Object refValue;
				if (reference instanceof FacetReference) {
					try {
						FacetContext facetContext = this.browserConfiguration
								.getAppearanceConfiguration().getFacetContext();
						if (facetContext.getReferences(eObject).contains(reference)) {
							refValue = facetContext.get(eObject, reference);
						} else {
							return null;
						}
					} catch (Exception e) {
						MoDiscoBrowserPlugin.logException(e);
						return null;
					}
				} else {
					if (!eObject.eClass().getEAllReferences().contains(reference)) {
						return null;
					}
					refValue = eObject.eGet(reference);
				}

				if (reference.isMany()) {
					@SuppressWarnings("unchecked")
					final EList<EObject> list = (EList<EObject>) refValue;

					// when only 1 element, then display its icon directly
					if (list.size() == 1) {
						return getImageFor(list.get(0));
					}
					return null;
				}
				if (refValue != null) {
					return getImageFor(refValue);
				}
				break;
			case ECONTAINER:
				return getImageFor(((EObject) tableElement.getElement()).eContainer());
			case CONTEXT:
				return getContextColumnImage(tableElement);
			default:
				return null;
			}
		}

		return null;
	}

	public String getColumnText(final Object element, final int columnIndex) {
		if (columnIndex >= this.columns.size()) {
			return Messages.TableEditorLabelProvider_indexOutOfBounds;
		}
		TableElement tableElement = (TableElement) element;

		final ColumnDescription columnDescription = this.columns.get(columnIndex);
		switch (columnDescription.getType()) {
		case DEFAULT_LABEL:
			return getTextFor(tableElement.getElement());
		case METACLASS_NAME:
			return getMetaclassColumnText(tableElement.getElement());
		case CONTEXT:
			return getContextColumnText(tableElement);
		case ATTRIBUTE:
			return getAttributeColumnText(tableElement.getElement(), columnDescription);
		case REFERENCE:
			return getReferenceColumnText(tableElement.getElement(), columnDescription);
		case ECONTAINER:
			return getTextFor(((EObject) tableElement.getElement()).eContainer());
		default:
			return Messages.TableEditorLabelProvider_unexpectedColumnType;
		}
	}

	private String getMetaclassColumnText(final Object element) {
		if (element == null) {
			return ""; //$NON-NLS-1$
		}
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			final EClass eClass = eObject.eClass();
			if (eClass == null) {
				return Messages.TableEditorLabelProvider_none;
			}
			return eClass.getName();
		}
		// primitive DataType
		return element.getClass().getSimpleName();
	}

	private String getContextColumnText(final TableElement tableElement) {
		if (tableElement instanceof TableElementWithContext) {
			TableElementWithContext tableElementWithContext = (TableElementWithContext) tableElement;
			EObject context = tableElementWithContext.getContext();
			return getTextFor(context);
		}
		return Messages.TableEditorLabelProvider_nullContext;
	}

	private Image getContextColumnImage(final TableElement tableElement) {
		if (tableElement instanceof TableElementWithContext) {
			TableElementWithContext tableElementWithContext = (TableElementWithContext) tableElement;
			EObject context = tableElementWithContext.getContext();
			return getImageFor(context);
		}
		return null;
	}

	private String getAttributeColumnText(final Object element,
			final ColumnDescription columnDescription) {
		final EObject eObject = (EObject) element;
		final EAttribute attribute = columnDescription.getAttribute();

		final Object attrValue;
		if (attribute instanceof FacetAttribute) {
			try {
				FacetContext facetContext = this.browserConfiguration.getAppearanceConfiguration()
						.getFacetContext();
				if (facetContext.getAttributes(eObject).contains(attribute)) {
					attrValue = facetContext.get(eObject, attribute);
				} else {
					return Messages.TableEditorLabelProvider_NA;
				}
			} catch (Exception e) {
				MoDiscoBrowserPlugin.logException(e);
				return Messages.TableEditorLabelProvider_error;
			}
		} else {
			if (!eObject.eClass().getEAllAttributes().contains(attribute)) {
				return Messages.TableEditorLabelProvider_NA;
			}
			attrValue = eObject.eGet(attribute);
		}

		if (attrValue == null) {
			return "null"; //$NON-NLS-1$
		}
		return StringUtils.truncateBeforeNewline(getTextFor(attrValue));
	}

	private String getReferenceColumnText(final Object element,
			final ColumnDescription columnDescription) {
		final EObject eObject = (EObject) element;
		final EReference reference = columnDescription.getReference();
		final Object refValue;

		if (reference instanceof FacetReference) {
			try {
				FacetContext facetContext = this.browserConfiguration.getAppearanceConfiguration()
						.getFacetContext();
				if (facetContext.getReferences(eObject).contains(reference)) {
					refValue = facetContext.get(eObject, reference);
				} else {
					return Messages.TableEditorLabelProvider_NA;
				}
			} catch (Exception e) {
				MoDiscoBrowserPlugin.logException(e);
				return Messages.TableEditorLabelProvider_error;
			}
		} else {
			if (!eObject.eClass().getEAllReferences().contains(reference)) {
				return Messages.TableEditorLabelProvider_NA;
			}
			refValue = eObject.eGet(reference);
		}

		if (refValue == null) {
			return "null"; //$NON-NLS-1$
		} else if (reference.isMany()) {
			@SuppressWarnings("unchecked")
			final EList<EObject> list = (EList<EObject>) refValue;

			// when only 1 element, then display it directly
			if (list.size() == 1) {
				return getTextFor(list.get(0));
			}

			return "(" + list.size() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			return getTextFor(refValue);
		}
	}
}
