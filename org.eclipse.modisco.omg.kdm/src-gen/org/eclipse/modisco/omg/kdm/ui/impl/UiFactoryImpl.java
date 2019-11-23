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
package org.eclipse.modisco.omg.kdm.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.omg.kdm.ui.Displays;
import org.eclipse.modisco.omg.kdm.ui.DisplaysImage;
import org.eclipse.modisco.omg.kdm.ui.ManagesUI;
import org.eclipse.modisco.omg.kdm.ui.ReadsUI;
import org.eclipse.modisco.omg.kdm.ui.Report;
import org.eclipse.modisco.omg.kdm.ui.Screen;
import org.eclipse.modisco.omg.kdm.ui.UIAction;
import org.eclipse.modisco.omg.kdm.ui.UIDisplay;
import org.eclipse.modisco.omg.kdm.ui.UIElement;
import org.eclipse.modisco.omg.kdm.ui.UIEvent;
import org.eclipse.modisco.omg.kdm.ui.UIField;
import org.eclipse.modisco.omg.kdm.ui.UIFlow;
import org.eclipse.modisco.omg.kdm.ui.UILayout;
import org.eclipse.modisco.omg.kdm.ui.UIModel;
import org.eclipse.modisco.omg.kdm.ui.UIRelationship;
import org.eclipse.modisco.omg.kdm.ui.UIResource;
import org.eclipse.modisco.omg.kdm.ui.UiFactory;
import org.eclipse.modisco.omg.kdm.ui.UiPackage;
import org.eclipse.modisco.omg.kdm.ui.WritesUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiFactoryImpl extends EFactoryImpl implements UiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiFactory init() {
		try {
			UiFactory theUiFactory = (UiFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/ui"); //$NON-NLS-1$ 
			if (theUiFactory != null) {
				return theUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactoryImpl() {
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
			case UiPackage.UI_RESOURCE: return createUIResource();
			case UiPackage.UI_DISPLAY: return createUIDisplay();
			case UiPackage.SCREEN: return createScreen();
			case UiPackage.REPORT: return createReport();
			case UiPackage.UI_MODEL: return createUIModel();
			case UiPackage.UI_LAYOUT: return createUILayout();
			case UiPackage.UI_FIELD: return createUIField();
			case UiPackage.DISPLAYS_IMAGE: return createDisplaysImage();
			case UiPackage.DISPLAYS: return createDisplays();
			case UiPackage.UI_FLOW: return createUIFlow();
			case UiPackage.UI_ELEMENT: return createUIElement();
			case UiPackage.UI_RELATIONSHIP: return createUIRelationship();
			case UiPackage.UI_ACTION: return createUIAction();
			case UiPackage.UI_EVENT: return createUIEvent();
			case UiPackage.READS_UI: return createReadsUI();
			case UiPackage.WRITES_UI: return createWritesUI();
			case UiPackage.MANAGES_UI: return createManagesUI();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIResource createUIResource() {
		UIResourceImpl uiResource = new UIResourceImpl();
		return uiResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDisplay createUIDisplay() {
		UIDisplayImpl uiDisplay = new UIDisplayImpl();
		return uiDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen createScreen() {
		ScreenImpl screen = new ScreenImpl();
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIModel createUIModel() {
		UIModelImpl uiModel = new UIModelImpl();
		return uiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UILayout createUILayout() {
		UILayoutImpl uiLayout = new UILayoutImpl();
		return uiLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIField createUIField() {
		UIFieldImpl uiField = new UIFieldImpl();
		return uiField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplaysImage createDisplaysImage() {
		DisplaysImageImpl displaysImage = new DisplaysImageImpl();
		return displaysImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Displays createDisplays() {
		DisplaysImpl displays = new DisplaysImpl();
		return displays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIFlow createUIFlow() {
		UIFlowImpl uiFlow = new UIFlowImpl();
		return uiFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement createUIElement() {
		UIElementImpl uiElement = new UIElementImpl();
		return uiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIRelationship createUIRelationship() {
		UIRelationshipImpl uiRelationship = new UIRelationshipImpl();
		return uiRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAction createUIAction() {
		UIActionImpl uiAction = new UIActionImpl();
		return uiAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIEvent createUIEvent() {
		UIEventImpl uiEvent = new UIEventImpl();
		return uiEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadsUI createReadsUI() {
		ReadsUIImpl readsUI = new ReadsUIImpl();
		return readsUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritesUI createWritesUI() {
		WritesUIImpl writesUI = new WritesUIImpl();
		return writesUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagesUI createManagesUI() {
		ManagesUIImpl managesUI = new ManagesUIImpl();
		return managesUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPackage getUiPackage() {
		return (UiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiPackage getPackage() {
		return UiPackage.eINSTANCE;
	}

} //UiFactoryImpl
