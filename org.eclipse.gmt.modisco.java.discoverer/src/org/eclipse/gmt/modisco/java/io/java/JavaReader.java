/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *    Romain Dervaux (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.java.io.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.java.IModelReader;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.io.java.binding.BindingManager;
import org.eclipse.gmt.modisco.java.io.library.LibraryReader;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.modisco.kdm.source.extension.discovery.AbstractRegionDiscoverer;

/**
 * A {@code JavaReader} reads the contents of .java files and build the
 * corresponding Java model.
 * <p>
 * As source, a {@code JavaReader} accepts {@link IJavaProject Java projects},
 * single .java {@link ICompilationUnit files}, and .class {@link IClassFile
 * files} with source attached.
 * </p>
 * <p>
 * It uses JDT model contruction. It is dedicated to J2SE5 (JDK 5 ~ JLS 3).
 * </p>
 * Using a more recent JLS release may require a new Mia metamodel definition,
 * since some new meta-objects may be required.
 * <p>
 * This reader does not work outside of an eclipse workspace context :
 * javaProject should reference a java project of an alive Eclipse Workspace !
 * (cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=87852)
 * </p>
 * 
 * @see LibraryReader
 * @see ASTParser
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class JavaReader implements IModelReader {

	private static final int FILE_BUFFER_SIZE = 100;
	private final boolean isINCREMENTALDISCOVERING;
	private final boolean isFullLevelAnalysis;
	private final JavaFactory factory;
	private Model resultModel;
	private BindingManager globalBindings;
	private Map<String, Object> options;
	private final Collection<String> excludedElements;
	private final String excludedElementsRegEx;
	private final String includedElementsRegEx;
	private AbstractRegionDiscoverer ard;
	private final boolean logJavaAnalysisWarnings;

	/**
	 * Constructs a {@code JavaReader} with no options and no incremental
	 * discovering.
	 * 
	 * @param factory
	 *            the EMF factory
	 */
	public JavaReader(final JavaFactory factory) {
		this(factory, new HashMap<String, Object>(), false, true);
	}

	/**
	 * Constructs a {@code JavaReader} with no options. Incremental discovering
	 * is determined by {@code isIncrementalDiscovering}.
	 * 
	 * @param factory
	 *            the EMF factory
	 * @param isIncrementalDiscovering
	 *            if discovering is incremental
	 */
	public JavaReader(final JavaFactory factory, final boolean isIncrementalDiscovering) {
		this(factory, new HashMap<String, Object>(), isIncrementalDiscovering, true);
	}

	/**
	 * Constructs a {@code JavaReader}.
	 * 
	 * @param factory
	 *            the EMF factory
	 * @param options
	 *            the options for this reader
	 * @param isIncrementalDiscovering
	 *            if discovering is incremental
	 * @param isFullLevelAnalysis
	 *            if analysis level is full or limited (class skeleton)
	 */
	public JavaReader(final JavaFactory factory, final Map<String, Object> options,
			final boolean isIncrementalDiscovering, final boolean isFullLevelAnalysis) {
		this(factory, options, isIncrementalDiscovering, isFullLevelAnalysis,
				new ArrayList<String>());
	}

	/**
	 * Constructs a {@code JavaReader}.
	 * 
	 * @param factory
	 *            the EMF factory
	 * @param options
	 *            the options for this reader
	 * @param isIncrementalDiscovering
	 *            if discovering is incremental
	 * @param isFullLevelAnalysis
	 *            if analysis level is full or limited (class skeleton)
	 * @param excludedElements
	 *            the elements (types & packages) to exclude during analysis
	 */
	public JavaReader(final JavaFactory factory, final Map<String, Object> options,
			final boolean isIncrementalDiscovering, final boolean isFullLevelAnalysis,
			final Collection<String> excludedElements) {
		this(factory, options, isIncrementalDiscovering, isFullLevelAnalysis, excludedElements,
				null, null);
	}

	/**
	 * Constructs a {@code JavaReader}.
	 * 
	 * @param factory
	 *            the EMF factory
	 * @param options
	 *            the options for this reader
	 * @param isIncrementalDiscovering
	 *            if discovering is incremental
	 * @param isFullLevelAnalysis
	 *            if analysis level is full or limited (class skeleton)
	 * @param excludedElements
	 *            the elements (types & packages) to exclude during analysis
	 * @param excludedElementsRegEx
	 *            a regex for qualifed name of elements (types & packages) to
	 *            exclude during analysis
	 * @param includedElementsRegEx
	 *            a regex for qualifed name of elements (types & packages) to
	 *            include during analysis
	 */
	public JavaReader(final JavaFactory factory, final Map<String, Object> options,
			final boolean isIncrementalDiscovering, final boolean isFullLevelAnalysis,
			final Collection<String> excludedElements, final String excludedElementsRegEx,
			final String includedElementsRegEx) {
		this(factory, options, isIncrementalDiscovering, isFullLevelAnalysis, excludedElements,
				excludedElementsRegEx, includedElementsRegEx, null);
	}

	/**
	 * Constructs a {@code JavaReader}.
	 * 
	 * @param factory
	 *            the EMF factory
	 * @param options
	 *            the options for this reader
	 * @param isIncrementalDiscovering
	 *            if discovering is incremental
	 * @param isFullLevelAnalysis
	 *            if analysis level is full or limited (class skeleton)
	 * @param excludedElements
	 *            the elements (types & packages) to exclude during analysis
	 * @param excludedElementsRegEx
	 *            a regex for qualifed name of elements (types & packages) to
	 *            exclude during analysis
	 * @param includedElementsRegEx
	 *            a regex for qualifed name of elements (types & packages) to
	 *            include during analysis
	 * @param abstractRegionDiscoverer
	 *            a abstractRegionDiscoverer to be notified of the compilation
	 *            unit visits
	 */
	public JavaReader(final JavaFactory factory, final Map<String, Object> options,
			final boolean isIncrementalDiscovering, final boolean isFullLevelAnalysis,
			final Collection<String> excludedElements, final String excludedElementsRegEx,
			final String includedElementsRegEx,
			final AbstractRegionDiscoverer abstractRegionDiscoverer) {
		this(factory, options, isIncrementalDiscovering, isFullLevelAnalysis, excludedElements,
				excludedElementsRegEx, includedElementsRegEx, abstractRegionDiscoverer, false);
	}

	/**
	 * Constructs a {@code JavaReader}.
	 * 
	 * @param factory
	 *            the EMF factory
	 * @param options
	 *            the options for this reader
	 * @param isIncrementalDiscovering
	 *            if discovering is incremental
	 * @param isFullLevelAnalysis
	 *            if analysis level is full or limited (class skeleton)
	 * @param excludedElements
	 *            the elements (types & packages) to exclude during analysis
	 * @param excludedElementsRegEx
	 *            a regex for qualifed name of elements (types & packages) to
	 *            exclude during analysis
	 * @param includedElementsRegEx
	 *            a regex for qualifed name of elements (types & packages) to
	 *            include during analysis
	 * @param abstractRegionDiscoverer
	 *            a abstractRegionDiscoverer to be notified of the compilation
	 *            unit visits
	 * @param logJavaAnalysisWarnings
	 *            a parameter key for indicating to log warnings from java
	 *            analysis.
	 * 
	 */
	public JavaReader(final JavaFactory factory, final Map<String, Object> options,
			final boolean isIncrementalDiscovering, final boolean isFullLevelAnalysis,
			final Collection<String> excludedElements, final String excludedElementsRegEx,
			final String includedElementsRegEx,
			final AbstractRegionDiscoverer abstractRegionDiscoverer,
			final boolean logJavaAnalysisWarnings) {
		this.factory = factory;
		this.isINCREMENTALDISCOVERING = isIncrementalDiscovering;
		this.isFullLevelAnalysis = isFullLevelAnalysis;
		this.includedElementsRegEx = includedElementsRegEx;
		this.excludedElementsRegEx = excludedElementsRegEx;
		this.excludedElements = excludedElements;
		this.ard = abstractRegionDiscoverer;
		setOptions(options);
		this.logJavaAnalysisWarnings = logJavaAnalysisWarnings;
	}

	public void readModel(final Object source, final Model resultModel1,
			final IProgressMonitor monitor) {
		readModel(source, resultModel1, getBindingManager(), monitor);
	}

	public void readModel(final Object source, final Model resultModel1,
			final BindingManager bindingManager, final IProgressMonitor monitor) {

		if (source == null) {
			return;
		}

		setResultModel(resultModel1);
		setGlobalBindings(bindingManager);
		if (this.isINCREMENTALDISCOVERING) {
			getGlobalBindings().enableIncrementalDiscovering(getResultModel());
		} else {
			getGlobalBindings().disableIncrementalDiscovering();
		}
		JDTVisitorUtils.initializePrimitiveTypes(this.factory, resultModel1, getGlobalBindings());

		try {
			if (source instanceof IJavaProject) {
				IJavaProject javaProject = (IJavaProject) source;

				if (resultModel1.getName() == null || resultModel1.getName().length() == 0) {
					resultModel1.setName(javaProject.getElementName());
				}
				IPackageFragment[] packageFolder = javaProject.getPackageFragments();
				// loop on CompilationUnit-s
				for (IPackageFragment parent : packageFolder) {
					// test if package has compilations units and has not been
					// excluded
					if (parent.getCompilationUnits().length > 0 && !ignorePackage(parent)) {
						// report some feedback
						monitor.subTask(Messages.JavaReader_discoveringTask
								+ parent.getElementName());
						// parse package
						parsePackage(javaProject, resultModel1, parent, monitor);
					}
					if (monitor.isCanceled()) {
						return;
					}
				}
			} else if (source instanceof ITypeRoot) {
				parseTypeRoot((ITypeRoot) source);

			} else {
				throw new IllegalArgumentException(
						"Java reader can not handle source object : " + source.toString()); //$NON-NLS-1$
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, JavaActivator.getDefault());
		}
	}

	/**
	 * Indicate if a element is excluded from analyse (user filter choice)
	 * 
	 * @param qualifiedName
	 *            the qualified name of the element
	 * @return
	 */
	protected boolean isElementExcluded(final String qualifiedName) {
		for (String exc : this.excludedElements) {
			if (qualifiedName.toLowerCase().startsWith(exc.toLowerCase())) {
				return true;
			}
		}
		if (this.excludedElementsRegEx != null && this.excludedElementsRegEx.length() > 0) {
			return qualifiedName.matches(this.excludedElementsRegEx);
		}
		return false;
	}

	/**
	 * Indicate if a qualified name is included in analyse (user filter choice)
	 * 
	 * @param qualifiedName
	 *            the qualified name of the element
	 * @return
	 */
	protected boolean isElementIncluded(final String qualifiedName) {
		if (this.includedElementsRegEx != null && this.includedElementsRegEx.length() > 0) {
			return qualifiedName.matches(this.includedElementsRegEx);
		}
		return true; // no reg ex inclusion : all elements are included
	}

	/**
	 * Computes if a package does not contains any types to be analyzed
	 * (according to user filter choice)
	 * 
	 * @param aPackage
	 * @return
	 * @throws JavaModelException
	 */
	protected boolean ignorePackage(final IPackageFragment aPackage) throws JavaModelException {
		if (isElementExcluded(aPackage.getElementName())) {
			return true;
		}
		if (isElementIncluded(aPackage.getElementName())) {
			return false;
		}

		// Package is not explicitely included but may be one of its owned types
		// has to be analysed
		boolean noSubElementToAnalyse = true;
		for (ICompilationUnit cu : aPackage.getCompilationUnits()) {
			for (IType t : cu.getTypes()) {
				String qualifedName = t.getFullyQualifiedName();
				if (!isElementExcluded(qualifedName) && isElementIncluded(qualifedName)) {
					noSubElementToAnalyse = false;
				}
			}
		}

		// no need of recursion : aPackage does not own sub packages

		return noSubElementToAnalyse;
	}

	protected void parseTypeRoot(final ITypeRoot source) {

		org.eclipse.jdt.core.dom.CompilationUnit parsedCompilationUnit = parseCompilationUnit(source);
		String fileContent = null;
		String filePath = null;
		try {
			if (source instanceof ICompilationUnit) {
				IFile theIFile = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(parsedCompilationUnit.getJavaElement().getPath());
				// getContent(IFile) is faster than ICompilationUnit.getSource()
				fileContent = getContent(theIFile).toString();
				IProject project = source.getJavaProject().getProject();
				filePath = getRelativePath(project, parsedCompilationUnit);
			} else {
				// IJavaElement.CLASS_FILE
				fileContent = LibraryReader.getFileContent((IClassFile) source);
				filePath = LibraryReader.getPath((IClassFile) source);
			}
			visitCompilationUnit(getResultModel(), parsedCompilationUnit, filePath, fileContent);

		} catch (Exception e) {
			MoDiscoLogger.logError(e, JavaActivator.getDefault());
		}
	}

	protected void parsePackage(final IJavaProject javaProject, final Model resultModel1,
			final IPackageFragment parent, final IProgressMonitor monitor)
			throws JavaModelException {
		boolean analyseAllPackage = !isElementExcluded(parent.getElementName())
				&& isElementIncluded(parent.getElementName());

		ICompilationUnit[] children = parent.getCompilationUnits();
		for (ICompilationUnit cu : children) {
			// iterate on each type of each cu and check if one is excluded
			boolean isExcluded = false;
			for (IType t : cu.getTypes()) {
				if (isElementExcluded(t.getFullyQualifiedName())
						|| !(analyseAllPackage || isElementIncluded(t.getFullyQualifiedName()))) {
					isExcluded = true;
					break;
				}
			}
			if (!isExcluded) {
				parseTypeRoot(cu);
			}
			if (monitor.isCanceled()) {
				return;
			}
		}
		if (this.isINCREMENTALDISCOVERING) {
			reset();
		}
	}

	protected void visitCompilationUnit(final Model resultModel1,
			final org.eclipse.jdt.core.dom.CompilationUnit parsedCompilationUnit,
			final String filePath, final String fileContent) {

		JDTVisitor jdtVisitor = new JDTVisitor(this.factory, resultModel1, getGlobalBindings(),
				filePath, fileContent, getGlobalBindings().isIncrementalDiscovering(),
				this.isFullLevelAnalysis, this.logJavaAnalysisWarnings);
		parsedCompilationUnit.accept(jdtVisitor);

		if (this.ard != null) {
			for (ASTNode key : jdtVisitor.getBijectiveMap().getKeys()) {
				int startPosition = key.getStartPosition();
				int endPosition = startPosition + key.getLength();
				int startLine = parsedCompilationUnit.getLineNumber(startPosition);
				int endLine = parsedCompilationUnit.getLineNumber(endPosition);
				this.ard.notifyRegionSourceVisit(filePath, startPosition, endPosition, startLine,
						endLine, jdtVisitor.getBijectiveMap().getValue(key));
			}
		}
	}

	protected org.eclipse.jdt.core.dom.CompilationUnit parseCompilationUnit(final ITypeRoot source) {
		// Code parsing : here is indicated the version of jdk (~JLS) to
		// consider, see Class comments
		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setResolveBindings(true);
		parser.setSource(source);
		org.eclipse.jdt.core.dom.CompilationUnit parsedCompilationUnit = (CompilationUnit) parser
				.createAST(null);
		return parsedCompilationUnit;
	}

	protected void resolveMethodRedefinition(final Model resultModel1) {
		MethodRedefinitionManager.resolveMethodRedefinitions(resultModel1, this.factory);
	}

	protected void finalResolveBindings(final Model resultModel1) {
		getGlobalBindings().resolveBindings(resultModel1);
	}

	public static String getRelativePath(final IProject aProject,
			final org.eclipse.jdt.core.dom.CompilationUnit parsedCompilationUnit) {
		IPath projectpath = aProject.getFullPath();
		IPath filepath = parsedCompilationUnit.getJavaElement().getPath();
		// we want path relative to project directory
		if (projectpath.isPrefixOf(filepath)) {
			filepath = filepath.removeFirstSegments(projectpath.segmentCount());
		}
		String filePathString = filepath.toOSString();
		if (!filePathString.startsWith(java.io.File.separator)) {
			filePathString = java.io.File.separator + filePathString;
		}
		return filePathString;
	}

	public static StringBuilder getContent(final IFile anIFile) throws CoreException, IOException {
		InputStream is = anIFile.getContents();
		StringBuilder cuText = new StringBuilder();
		Reader r = new InputStreamReader(is);
		char[] chars = new char[JavaReader.FILE_BUFFER_SIZE];
		int read;
		while ((read = r.read(chars)) != -1) {
			if (read == JavaReader.FILE_BUFFER_SIZE) {
				cuText.append(chars);
			} else {
				cuText.append(chars, 0, read);
			}
		}
		is.close();
		return cuText;
	}

	protected void reset() {
		getGlobalBindings().resolveBindings(getResultModel());
		setGlobalBindings(getBindingManager());
	}

	protected BindingManager getBindingManager() {
		BindingManager bindingManager = new BindingManager(this.factory);
		if (this.isINCREMENTALDISCOVERING) {
			bindingManager.enableIncrementalDiscovering(getResultModel());
		}
		return bindingManager;
	}

	public void terminate(final IProgressMonitor monitor) {
		monitor.subTask(Messages.JavaReader_bindingsTask);
		finalResolveBindings(getResultModel());

		monitor.subTask(Messages.JavaReader_redefinitionsTask);
		resolveMethodRedefinition(getResultModel());
	}

	public void setResultModel(final Model resultModel) {
		this.resultModel = resultModel;
	}

	public Model getResultModel() {
		return this.resultModel;
	}

	public void setGlobalBindings(final BindingManager globalBindings) {
		this.globalBindings = globalBindings;
	}

	public BindingManager getGlobalBindings() {
		return this.globalBindings;
	}

	public void setOptions(final Map<String, Object> options) {
		this.options = options;
	}

	public Map<String, Object> getOptions() {
		return this.options;
	}

	public void setAbstractRegionDiscoverer(final AbstractRegionDiscoverer abstractRegionDiscoverer) {
		this.ard = abstractRegionDiscoverer;
	}

}
