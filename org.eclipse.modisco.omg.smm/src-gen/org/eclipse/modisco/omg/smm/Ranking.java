/**
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.Ranking#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Ranking#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRanking()
 * @model
 * @generated
 */
public interface Ranking extends Measure {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RankingInterval}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RankingInterval#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRanking_Interval()
	 * @see org.eclipse.modisco.omg.smm.RankingInterval#getRank
	 * @model opposite="rank" containment="true" required="true"
	 * @generated
	 */
	EList<RankingInterval> getInterval();

	/**
	 * Returns the value of the '<em><b>Ranking To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking To</em>' reference.
	 * @see #setRankingTo(RankingMeasureRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRanking_RankingTo()
	 * @see org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	RankingMeasureRelationship getRankingTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Ranking#getRankingTo <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking To</em>' reference.
	 * @see #getRankingTo()
	 * @generated
	 */
	void setRankingTo(RankingMeasureRelationship value);

} // Ranking
