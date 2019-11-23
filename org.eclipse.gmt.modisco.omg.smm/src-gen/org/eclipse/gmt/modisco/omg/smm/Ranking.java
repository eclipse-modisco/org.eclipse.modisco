/**
 * *******************************************************************************
 * Copyright (c) 2008 Castor Technologies Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alain Picard (Castor Technologies Inc) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Ranking#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getRanking()
 * @model
 * @generated
 */
public interface Ranking extends Measure {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.RankingInterval}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.RankingInterval#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getRanking_Interval()
	 * @see org.eclipse.gmt.modisco.omg.smm.RankingInterval#getRank
	 * @model opposite="rank" containment="true" required="true"
	 * @generated
	 */
	EList<RankingInterval> getInterval();

} // Ranking
