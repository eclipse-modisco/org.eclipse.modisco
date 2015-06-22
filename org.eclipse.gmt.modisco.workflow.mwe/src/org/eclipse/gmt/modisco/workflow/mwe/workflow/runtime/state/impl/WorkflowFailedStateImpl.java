/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Nicolas Payneau (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StatePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowFailedState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Failed State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowFailedStateImpl extends WorkflowDoneStateImpl implements WorkflowFailedState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowFailedStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatePackage.Literals.WORKFLOW_FAILED_STATE;
	}

} //WorkflowFailedStateImpl
