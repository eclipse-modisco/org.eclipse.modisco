/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 	Nicolas Guyomar (Mia-Software) - Bug 349546 - EMF Facet facetSet editor
 *  Gregoire Dupe (Mia-Software) - Bug 361617 - Deprecation of APIs for the old Facet metamodels
 */
package org.eclipse.modisco.facet.efacet.ui.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * This interface has to be implemented by {@link Query} factory UI Class. It is used to complete a
 * generic {@link Query} creation wizard with specific widget.
 * 
 * TODO: This interface has to be renamed to IQueryCreationPagePart before the release of 0.2
 * 
 * @since 0.2
 */
//TODO: This interface has to be renamed to IQueryCreationPagePart before the release of 0.2
public interface IQueryCreationPagePart2 {

	/**
	 * Set the {@link Query}'s {@link FacetSet}.
	 * 
	 * @param facetSet
	 *            the given {@link FacetSet}
	 */
	public void setFacetSet(FacetSet facetSet);

	/**
	 * Set the {@link Query}'s upperBound.
	 * 
	 * @param upperBound
	 *            the upperBound.
	 */
	public void setUpperBound(int upperBound);

	/**
	 * Set the {@link Query}'s lowerBound.
	 * 
	 * @param lowerBound
	 *            the lowerBound.
	 */
	public void setLowerBound(int lowerBound);

	/**
	 * Set the {@link Query}'s {@link Query#isOrdered() <em>attribute</em>} attribute.
	 * 
	 * @param ordered
	 *            whether
	 */
	public void setOrdered(final boolean ordered);

	/**
	 * Set the {@link Query}'s {@link Query#isUnique() <em>unique</em>} attribute.
	 * 
	 * @param unique
	 *            Whether the query is unique or not.
	 */
	public void setUnique(final boolean unique);

	/**
	 * Set the {@link Query}'s type.
	 * 
	 * @param queryType
	 *            the {@link Query}'s type.
	 */
	public void setQueryType(EClassifier queryType);

	/**
	 * Set the {@link Query}'s name.
	 * 
	 * @param name
	 *            the query's name.
	 */
	public void setQueryName(String name);

	/**
	 * Set the {@link Query}'s {@link Query#isCanBeCached() <em>Can Be Cached</em>}.
	 * 
	 * @param canBeCached
	 *            whether the query result can be cached.
	 */
	public void setCanBeCached(boolean canBeCached);

	/**
	 * Set the {@link Query}'s {@link Query#isHasSideEffect() <em>Has Side Effect</em>}.
	 * 
	 * @param hasSideEffect
	 *            whether the query has side effect, such as modifying a model when applied on it.
	 */
	public void setHasSideEffect(boolean hasSideEffect);

	/**
	 * Set the {@link Query}'s '{@link Query#getScope <em>Scope</em>}'.
	 * 
	 * @param type
	 *            the {@link Query}'s '{@link Query#getScope <em>Scope</em>}'.
	 */
	public void setQueryScope(EClass scope);

	/**
	 * This method is dedicated to create a {@link Query} with every attribute set by the others
	 * methods of {@link IQueryCreationPagePart2}.
	 * 
	 * @return the newly created {@link Query}
	 */
	public Query performFinish();

	/**
	 * This method is called by the {@link org.eclipse.modisco.facet.efacet.ui.internal.wizards.pages.CreateQueryWizardPage}.
	 * 
	 * @param parent
	 *            the Wizard's composite to be completed with specific widget for this {@link Query} creation.
	 */
	public void completeComposite(Composite parent);

	/**
	 * Returns <code>true</code> if the composite is complete.
	 * 
	 * @return <code>true</code> if the composite is complete.
	 */
	public boolean isCompositeComplete();

	/**
	 * Returns the error messages generated by the part, or null if none.
	 * 
	 * @return the error messages generated by the part, or null if none.
	 */
	public String getErrorMessage();

	/**
	 * Add a {@link ModifyListener} on the part.
	 * 
	 * @param listener
	 *            a {@link ModifyListener}
	 */
	public void addModifyListener(ModifyListener listener);

	/**
	 * Remove an existing {@link ModifyListener} from the part's listener.
	 * 
	 * @param listener
	 *            an existing {@link ModifyListener} listener.
	 */
	public void removeModifyListener(ModifyListener listener);

	/**
	 * Notify the registered listener that something has been modified in the part. It should only
	 * be used as a way to update the buttons' state of the containing wizard dialog.
	 * 
	 * @param modifiedComposite
	 *            the composite on which the modification occured.
	 */
	public void notifyCompositeListeners(Composite modifiedComposite);

}
