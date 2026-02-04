/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.wizards;

import java.util.Arrays;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.swt.widgets.TableItem;

/** Handles the modification of values in the parameters table */
public class ParameterCellModifier implements ICellModifier {

	private final NewDiscovererMainWizardPage newDiscovererMainWizardPage;

	public ParameterCellModifier(final NewDiscovererMainWizardPage newDiscovererMainWizardPage) {
		this.newDiscovererMainWizardPage = newDiscovererMainWizardPage;
	}

	public boolean canModify(final Object element, final String property) {
		if (AbstractModelDiscovererParameters.isInheritedParameter(element)) {
			return false;
		}
		// out param => "required" is disabled
		if (property == NewDiscovererMainWizardPage.REQUIRED_COLUMN_PROPERTY) {
			if (element instanceof DiscoveryParameterLine) {
				DiscoveryParameterLine parameter = (DiscoveryParameterLine) element;
				if (parameter.getDirection() == DirectionKind.OUT) {
					return false;
				}
			}
		}
		return true;
	}

	public Object getValue(final Object element, final String property) {
		if (!(element instanceof DiscoveryParameterLine)) {
			throw new IllegalArgumentException("element"); //$NON-NLS-1$
		}

		DiscoveryParameterLine discoveryParameterLine = (DiscoveryParameterLine) element;
		if (property == NewDiscovererMainWizardPage.NAME_COLUMN_PROPERTY) {
			return discoveryParameterLine.getName();
		}
		if (property == NewDiscovererMainWizardPage.DESCRIPTION_COLUMN_PROPERTY) {
			return discoveryParameterLine.getDescription();
		}
		if (property == NewDiscovererMainWizardPage.TYPE_COLUMN_PROPERTY) {
			return discoveryParameterLine.getType();
		}
		if (property == NewDiscovererMainWizardPage.DIRECTION_COLUMN_PROPERTY) {
			return new Integer(Arrays.asList(DirectionKind.values()).indexOf(
					discoveryParameterLine.getDirection().name()));
		}
		if (property == NewDiscovererMainWizardPage.REQUIRED_COLUMN_PROPERTY) {
			return new Boolean(discoveryParameterLine.isRequired());
		}
		if (property == NewDiscovererMainWizardPage.MULTIVALUED_COLUMN_PROPERTY) {
			return new Boolean(discoveryParameterLine.isMultivalued());
		}
		throw new IllegalArgumentException("property"); //$NON-NLS-1$
	}

	public void modify(final Object element, final String property, final Object value) {
		TableItem tableItem = (TableItem) element;
		Object data = tableItem.getData();
		if (!(data instanceof DiscoveryParameterLine)) {
			throw new IllegalArgumentException("element"); //$NON-NLS-1$
		}

		DiscoveryParameterLine discoveryParameterLine = (DiscoveryParameterLine) data;
		if (property == NewDiscovererMainWizardPage.NAME_COLUMN_PROPERTY) {
			discoveryParameterLine.setName((String) value);
		} else if (property == NewDiscovererMainWizardPage.DESCRIPTION_COLUMN_PROPERTY) {
			discoveryParameterLine.setDescription((String) value);
		} else if (property == NewDiscovererMainWizardPage.TYPE_COLUMN_PROPERTY) {
			discoveryParameterLine.setType((String) value);
		} else if (property == NewDiscovererMainWizardPage.DIRECTION_COLUMN_PROPERTY) {
			int iValue = ((Integer) value).intValue();
			if (iValue == -1) {
				discoveryParameterLine.setDirection(DirectionKind.IN);
			} else {
				discoveryParameterLine.setDirection(DirectionKind.values()[iValue]);
			}
		} else if (property == NewDiscovererMainWizardPage.REQUIRED_COLUMN_PROPERTY) {
			discoveryParameterLine.setRequired(((Boolean) value).booleanValue());
		} else if (property == NewDiscovererMainWizardPage.MULTIVALUED_COLUMN_PROPERTY) {
			discoveryParameterLine.setMultivalued(((Boolean) value).booleanValue());
		} else {
			throw new IllegalArgumentException("property"); //$NON-NLS-1$
		}
		this.newDiscovererMainWizardPage.parameterDataWasModified();
	}

}
