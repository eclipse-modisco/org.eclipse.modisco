/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *    Romain DERVAUX (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;

/**
 * This Java bean stores some entries of advanced Java discovering.
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class DiscoveryParametersBean {

	public DiscoveryParametersBean() {
		this.isIncrementalMode = false;
		this.isFullJavaLevel = true;
		this.excludedElements = new ArrayList<String>();
	}

	/**
	 * The artifacts to analyse. Key may be a {@link IJavaProject} or a
	 * {@link IPackageFragment} Values are options map for discoverer
	 */
	private Map<Object, Map<String, Object>> elementsAndOptions;

	/**
	 * Indicates to use or not the incremental mode.
	 */
	private boolean isIncrementalMode;

	/**
	 * Indicates the java analysis level
	 */
	private boolean isFullJavaLevel;

	/**
	 * a list of qualified names for elements (types & packages) to be excluded
	 * during analysis ex : org.eclipse.*, java.io.File
	 * 
	 * @deprecated use some regular expressions with excludedElementsRegEx
	 */
	@Deprecated
	private List<String> excludedElements;

	/**
	 * A regular expression on qualified names for elements (types & packages)
	 * to be included during analysis
	 */
	private String includedElementsRegEx;

	/**
	 * 
	 * @return A regular expression on qualified names for elements (types &
	 *         packages) to be included during analysis
	 */
	public String getIncludedElementsRegEx() {
		return this.includedElementsRegEx;
	}

	/**
	 * Sets a regular expression on qualified names for elements (types &
	 * packages) to be included during analysis
	 * 
	 * @param includedElementsRegEx
	 */
	public void setIncludedElementsRegEx(final String includedElementsRegEx) {
		this.includedElementsRegEx = includedElementsRegEx;
	}

	/**
	 * 
	 * @return A regular expression on qualified names for elements (types &
	 *         packages) to be excluded during analysis
	 */
	public String getExcludedElementsRegEx() {
		return this.excludedElementsRegEx;
	}

	/**
	 * Sets a regular expression on qualified names for elements (types &
	 * packages) to be excluded during analysis
	 * 
	 * @param excludedElementsRegEx
	 */
	public void setExcludedElementsRegEx(final String excludedElementsRegEx) {
		this.excludedElementsRegEx = excludedElementsRegEx;
	}

	/**
	 * A regular expression on qualified names for elements (types & packages)
	 * to be excluded during analysis
	 */
	private String excludedElementsRegEx;

	/**
	 * @return a list of qualified names which represents the elements (types &
	 *         packages) to exclude during analysis
	 * @deprecated use some regular expressions with excludedElementsRegEx
	 *             property
	 */
	@Deprecated
	public List<String> getExcludedElements() {
		return this.excludedElements;
	}

	/**
	 * Set the list of elements (types & packages) to exclude during analysis
	 * 
	 * @param excludedElements
	 *            a list of qualified names
	 * @deprecated use some regular expressions with excludedElementsRegEx
	 *             property
	 */
	@Deprecated
	public void setExcludedElements(final List<String> excludedElements) {
		this.excludedElements = excludedElements;
	}

	/**
	 * @return artefacts to be analysed. Resulting Set does not support
	 *         removal/adding.
	 */
	public Set<Object> getElementsToDiscover() {
		return Collections.unmodifiableSet(getElementsAndOptions().keySet());
	}

	/**
	 * @param element
	 * @return options for analysing the given artefact.
	 */
	public Map<String, Object> getDiscoveryOptions(final Object element) {
		return getElementsAndOptions().get(element);
	}

	/**
	 * Adds an artefact to analyse.
	 * 
	 * @param element
	 *            a {@link IJavaProject} or a {@link IPackageFragment}
	 */
	public void addElementToDiscover(final Object element) {
		if (!getElementsAndOptions().containsKey(element)) {
			getElementsAndOptions().put(element, new HashMap<String, Object>());
		}
	}

	/**
	 * Removes an artefact to analyse.
	 * 
	 * @param element
	 */
	public void removeElementToDiscover(final Object element) {
		getElementsAndOptions().remove(element);
	}

	/**
	 * Clear the artefacts map to analyse.
	 */
	public void cleanElementsToDiscover() {
		if (this.elementsAndOptions != null) {
			this.elementsAndOptions.clear();
		}
	}

	/**
	 * @return if incremental is selected.
	 */
	public boolean isIncrementalMode() {
		return this.isIncrementalMode;
	}

	/**
	 * Sets the incremental mode.
	 * 
	 * @param useIncrementalMode
	 */
	public void setIncrementalMode(final boolean useIncrementalMode) {
		this.isIncrementalMode = useIncrementalMode;
	}

	/**
	 * 
	 * @return if java full analysis level is selected
	 */
	public boolean isFullJavaLevel() {
		return this.isFullJavaLevel;
	}

	/**
	 * Sets the Java full analysis level
	 * 
	 * @param useFullJavaLevel
	 */
	public void setFullJavaLevel(final boolean useFullJavaLevel) {
		this.isFullJavaLevel = useFullJavaLevel;
	}

	private Map<Object, Map<String, Object>> getElementsAndOptions() {
		if (this.elementsAndOptions == null) {
			this.elementsAndOptions = new HashMap<Object, Map<String, Object>>();
		}
		return this.elementsAndOptions;
	}

}