/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Direction;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameter;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterMapValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringListValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowFactoryImpl;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.WorkParameterEntryValueImpl;

/**
 * @deprecated no Driver needed anymore, replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public abstract class AbstractDriverCore implements Driver {

	public abstract List<WorkParameter> getParameters(ILaunchConfiguration configuration);

	public abstract String getTypeLaunchConfig();

	/**
	 * Allows to create one work parameter
	 * 
	 * @param name
	 *            The name of parameter
	 * @param direction
	 *            The direction of parameter
	 * @param description
	 *            The description of parameter
	 * @param required
	 *            True if parameter is required otherwise false
	 * @param type
	 *            The type of parameter
	 * @return A work parameter
	 */
	public WorkParameter createOneWorkParameter(final String name, final Direction direction,
			final String description, final Boolean required, final Class<?> type) {
		WorkParameter param = ModiscoworkflowFactory.eINSTANCE.createWorkParameter();
		param.setName(name);
		param.setDirection(direction);
		param.setDescription(description);
		param.setRequired(required.booleanValue());
		param.setType(type.getName());
		return param;
	}

	/**
	 * Allows to create a WorkParameterStringValue
	 * 
	 * @param value
	 *            The value of WorkParameterStringValue
	 * @return A new instance of WorkParameterStringValue
	 */
	public WorkParameterStringValue createStringValue(final String value) {
		WorkParameterStringValue valueString = ModiscoworkflowFactory.eINSTANCE
				.createWorkParameterStringValue();
		valueString.setValue(value);
		return valueString;
	}

	/**
	 * Allows to create a WorkParameterStringListValue
	 * 
	 * @param values
	 *            The futures values of list
	 * @return A new instance of WorkParameterStringListValue
	 */
	public WorkParameterStringListValue createStringListValue(final List<String> values) {
		WorkParameterStringListValue valueStringList = ModiscoworkflowFactory.eINSTANCE
				.createWorkParameterStringListValue();
		if (values != null) {
			valueStringList.getValue().addAll(values);
		}
		return valueStringList;
	}

	/**
	 * Allows to create a WorkParameterMapValue
	 * 
	 * @param map
	 *            The futures values of WorkParameterMapValue
	 * @return A new instance of WorkParameterMapValue
	 */
	public WorkParameterMapValue createMapValue(final Map<String, String> map) {
		WorkParameterMapValue mapValue = ModiscoworkflowFactory.eINSTANCE
				.createWorkParameterMapValue();
		if (map != null) {
			mapValue.getEntryList().addAll(convert(map));
		}
		return mapValue;
	}

	/**
	 * Allows to convert a map<String,String> to List<WorkParameterEntryValueImpl>
	 * 
	 * @param map
	 *            The map source
	 * @return A new list of WorkParameterEntryValueImpl
	 */
	private List<WorkParameterEntryValueImpl> convert(final Map<String, String> map) {
		List<WorkParameterEntryValueImpl> listEntry = new ArrayList<WorkParameterEntryValueImpl>();
		for (Entry<String, String> entry : map.entrySet()) {
			WorkParameterEntryValueImpl entryParameter = (WorkParameterEntryValueImpl) ((ModiscoworkflowFactoryImpl) ModiscoworkflowFactory.eINSTANCE)
					.createWorkParameterEntryValue();
			entryParameter.setKey(entry.getKey());
			entryParameter.setValue(createStringValue(entry.getValue()));
			listEntry.add(entryParameter);
		}

		return listEntry;
	}

	/**
	 * Allows to create a WorkParameterBooleanValue
	 * 
	 * @param value
	 *            The future value
	 * @return A new instance of WorkParameterBooleanValue
	 */
	public WorkParameterBooleanValue createBooleanValue(final boolean value) {
		WorkParameterBooleanValue booleanValue = ModiscoworkflowFactory.eINSTANCE
				.createWorkParameterBooleanValue();
		booleanValue.setValue(value);
		return booleanValue;
	}

	/**
	 * Allows to create a WorkParameterStringListValue
	 * 
	 * @param values
	 *            The futures values of WorkParameterStringListValue
	 * @return A new instance of WorkParameterStringListValue
	 */
	public WorkParameterStringListValue createValueStringList(final List<String> values) {
		WorkParameterStringListValue valueStringList = ModiscoworkflowFactory.eINSTANCE
				.createWorkParameterStringListValue();
		if (values != null) {
			valueStringList.getValue().addAll(values);
		}
		return valueStringList;
	}

	/**
	 * Allows to create a WorkParameterIntegerValue
	 * 
	 * @param value
	 *            The future value
	 * @return A new instance of WorkParameterIntegerValue
	 */
	public WorkParameterIntegerValue createIntegerValue(final int value) {
		WorkParameterIntegerValue valueInteger = ModiscoworkflowFactory.eINSTANCE
				.createWorkParameterIntegerValue();
		valueInteger.setValue(value);
		return valueInteger;
	}

}
