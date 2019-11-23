/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.action.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.action.ActionFactory;
import org.eclipse.modisco.omg.kdm.action.ActionPackage;
import org.eclipse.modisco.omg.kdm.action.ActionRelationship;
import org.eclipse.modisco.omg.kdm.action.Addresses;
import org.eclipse.modisco.omg.kdm.action.BlockUnit;
import org.eclipse.modisco.omg.kdm.action.Calls;
import org.eclipse.modisco.omg.kdm.action.CatchUnit;
import org.eclipse.modisco.omg.kdm.action.CompliesTo;
import org.eclipse.modisco.omg.kdm.action.ControlFlow;
import org.eclipse.modisco.omg.kdm.action.Creates;
import org.eclipse.modisco.omg.kdm.action.Dispatches;
import org.eclipse.modisco.omg.kdm.action.EntryFlow;
import org.eclipse.modisco.omg.kdm.action.ExceptionFlow;
import org.eclipse.modisco.omg.kdm.action.ExceptionUnit;
import org.eclipse.modisco.omg.kdm.action.ExitFlow;
import org.eclipse.modisco.omg.kdm.action.FalseFlow;
import org.eclipse.modisco.omg.kdm.action.FinallyUnit;
import org.eclipse.modisco.omg.kdm.action.Flow;
import org.eclipse.modisco.omg.kdm.action.GuardedFlow;
import org.eclipse.modisco.omg.kdm.action.Reads;
import org.eclipse.modisco.omg.kdm.action.Throws;
import org.eclipse.modisco.omg.kdm.action.TrueFlow;
import org.eclipse.modisco.omg.kdm.action.TryUnit;
import org.eclipse.modisco.omg.kdm.action.UsesType;
import org.eclipse.modisco.omg.kdm.action.Writes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionFactoryImpl extends EFactoryImpl implements ActionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionFactory init() {
		try {
			ActionFactory theActionFactory = (ActionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/action"); //$NON-NLS-1$ 
			if (theActionFactory != null) {
				return theActionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActionPackage.ACTION_ELEMENT: return createActionElement();
			case ActionPackage.BLOCK_UNIT: return createBlockUnit();
			case ActionPackage.CONTROL_FLOW: return createControlFlow();
			case ActionPackage.ENTRY_FLOW: return createEntryFlow();
			case ActionPackage.FLOW: return createFlow();
			case ActionPackage.TRUE_FLOW: return createTrueFlow();
			case ActionPackage.FALSE_FLOW: return createFalseFlow();
			case ActionPackage.GUARDED_FLOW: return createGuardedFlow();
			case ActionPackage.CALLS: return createCalls();
			case ActionPackage.DISPATCHES: return createDispatches();
			case ActionPackage.READS: return createReads();
			case ActionPackage.WRITES: return createWrites();
			case ActionPackage.ADDRESSES: return createAddresses();
			case ActionPackage.CREATES: return createCreates();
			case ActionPackage.EXCEPTION_UNIT: return createExceptionUnit();
			case ActionPackage.TRY_UNIT: return createTryUnit();
			case ActionPackage.CATCH_UNIT: return createCatchUnit();
			case ActionPackage.FINALLY_UNIT: return createFinallyUnit();
			case ActionPackage.EXIT_FLOW: return createExitFlow();
			case ActionPackage.EXCEPTION_FLOW: return createExceptionFlow();
			case ActionPackage.THROWS: return createThrows();
			case ActionPackage.COMPLIES_TO: return createCompliesTo();
			case ActionPackage.USES_TYPE: return createUsesType();
			case ActionPackage.ACTION_RELATIONSHIP: return createActionRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionElement createActionElement() {
		ActionElementImpl actionElement = new ActionElementImpl();
		return actionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calls createCalls() {
		CallsImpl calls = new CallsImpl();
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creates createCreates() {
		CreatesImpl creates = new CreatesImpl();
		return creates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reads createReads() {
		ReadsImpl reads = new ReadsImpl();
		return reads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writes createWrites() {
		WritesImpl writes = new WritesImpl();
		return writes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompliesTo createCompliesTo() {
		CompliesToImpl compliesTo = new CompliesToImpl();
		return compliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFlow createTrueFlow() {
		TrueFlowImpl trueFlow = new TrueFlowImpl();
		return trueFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FalseFlow createFalseFlow() {
		FalseFlowImpl falseFlow = new FalseFlowImpl();
		return falseFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedFlow createGuardedFlow() {
		GuardedFlowImpl guardedFlow = new GuardedFlowImpl();
		return guardedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesType createUsesType() {
		UsesTypeImpl usesType = new UsesTypeImpl();
		return usesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addresses createAddresses() {
		AddressesImpl addresses = new AddressesImpl();
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationship createActionRelationship() {
		ActionRelationshipImpl actionRelationship = new ActionRelationshipImpl();
		return actionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throws createThrows() {
		ThrowsImpl throws_ = new ThrowsImpl();
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatches createDispatches() {
		DispatchesImpl dispatches = new DispatchesImpl();
		return dispatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryFlow createEntryFlow() {
		EntryFlowImpl entryFlow = new EntryFlowImpl();
		return entryFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockUnit createBlockUnit() {
		BlockUnitImpl blockUnit = new BlockUnitImpl();
		return blockUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionUnit createExceptionUnit() {
		ExceptionUnitImpl exceptionUnit = new ExceptionUnitImpl();
		return exceptionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryUnit createTryUnit() {
		TryUnitImpl tryUnit = new TryUnitImpl();
		return tryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyUnit createFinallyUnit() {
		FinallyUnitImpl finallyUnit = new FinallyUnitImpl();
		return finallyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchUnit createCatchUnit() {
		CatchUnitImpl catchUnit = new CatchUnitImpl();
		return catchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitFlow createExitFlow() {
		ExitFlowImpl exitFlow = new ExitFlowImpl();
		return exitFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionFlow createExceptionFlow() {
		ExceptionFlowImpl exceptionFlow = new ExceptionFlowImpl();
		return exceptionFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPackage getActionPackage() {
		return (ActionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionPackage getPackage() {
		return ActionPackage.eINSTANCE;
	}

} //ActionFactoryImpl
