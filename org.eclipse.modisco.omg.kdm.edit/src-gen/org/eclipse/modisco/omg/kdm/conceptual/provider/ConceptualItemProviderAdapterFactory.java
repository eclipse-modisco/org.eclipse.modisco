/**
 * Copyright (c) 2009, 2019 Hatha Systems, and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 */
package org.eclipse.modisco.omg.kdm.conceptual.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.modisco.omg.kdm.conceptual.util.ConceptualAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptualItemProviderAdapterFactory extends ConceptualAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualModelItemProvider conceptualModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualModelAdapter() {
		if (conceptualModelItemProvider == null) {
			conceptualModelItemProvider = new ConceptualModelItemProvider(this);
		}

		return conceptualModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.TermUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermUnitItemProvider termUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.TermUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTermUnitAdapter() {
		if (termUnitItemProvider == null) {
			termUnitItemProvider = new TermUnitItemProvider(this);
		}

		return termUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualContainerItemProvider conceptualContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualContainerAdapter() {
		if (conceptualContainerItemProvider == null) {
			conceptualContainerItemProvider = new ConceptualContainerItemProvider(this);
		}

		return conceptualContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.FactUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactUnitItemProvider factUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.FactUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFactUnitAdapter() {
		if (factUnitItemProvider == null) {
			factUnitItemProvider = new FactUnitItemProvider(this);
		}

		return factUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualRelationshipItemProvider conceptualRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualRelationshipAdapter() {
		if (conceptualRelationshipItemProvider == null) {
			conceptualRelationshipItemProvider = new ConceptualRelationshipItemProvider(this);
		}

		return conceptualRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.BehaviorUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorUnitItemProvider behaviorUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.BehaviorUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorUnitAdapter() {
		if (behaviorUnitItemProvider == null) {
			behaviorUnitItemProvider = new BehaviorUnitItemProvider(this);
		}

		return behaviorUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.RuleUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleUnitItemProvider ruleUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.RuleUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleUnitAdapter() {
		if (ruleUnitItemProvider == null) {
			ruleUnitItemProvider = new RuleUnitItemProvider(this);
		}

		return ruleUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.ScenarioUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioUnitItemProvider scenarioUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.ScenarioUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenarioUnitAdapter() {
		if (scenarioUnitItemProvider == null) {
			scenarioUnitItemProvider = new ScenarioUnitItemProvider(this);
		}

		return scenarioUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualFlowItemProvider conceptualFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualFlowAdapter() {
		if (conceptualFlowItemProvider == null) {
			conceptualFlowItemProvider = new ConceptualFlowItemProvider(this);
		}

		return conceptualFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualElementItemProvider conceptualElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualElementAdapter() {
		if (conceptualElementItemProvider == null) {
			conceptualElementItemProvider = new ConceptualElementItemProvider(this);
		}

		return conceptualElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualRoleItemProvider conceptualRoleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptualRoleAdapter() {
		if (conceptualRoleItemProvider == null) {
			conceptualRoleItemProvider = new ConceptualRoleItemProvider(this);
		}

		return conceptualRoleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (conceptualModelItemProvider != null) conceptualModelItemProvider.dispose();
		if (termUnitItemProvider != null) termUnitItemProvider.dispose();
		if (conceptualContainerItemProvider != null) conceptualContainerItemProvider.dispose();
		if (factUnitItemProvider != null) factUnitItemProvider.dispose();
		if (conceptualRelationshipItemProvider != null) conceptualRelationshipItemProvider.dispose();
		if (behaviorUnitItemProvider != null) behaviorUnitItemProvider.dispose();
		if (ruleUnitItemProvider != null) ruleUnitItemProvider.dispose();
		if (scenarioUnitItemProvider != null) scenarioUnitItemProvider.dispose();
		if (conceptualFlowItemProvider != null) conceptualFlowItemProvider.dispose();
		if (conceptualElementItemProvider != null) conceptualElementItemProvider.dispose();
		if (conceptualRoleItemProvider != null) conceptualRoleItemProvider.dispose();
	}

}
