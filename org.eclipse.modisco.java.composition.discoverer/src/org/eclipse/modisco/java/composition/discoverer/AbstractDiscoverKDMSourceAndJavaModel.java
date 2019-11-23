/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Archive;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.composition.discoverer.listeners.JavaCompositionSourceVisitListener;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaJar2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationFactory;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.java.internal.util.JavaUtil;
import org.eclipse.modisco.kdm.source.discoverer.IKDMDiscoveryConstants;
import org.eclipse.modisco.kdm.source.extension.discovery.AbstractComposedKDMSourceDiscoverer2;
import org.eclipse.modisco.kdm.source.extension.discovery.SourceVisitListener;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.modisco.omg.kdm.kdm.Segment;
import org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.modisco.omg.kdm.source.BinaryFile;
import org.eclipse.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.modisco.omg.kdm.source.SourceFile;
import org.eclipse.modisco.omg.kdm.source.util.KDMSourceUtils;

/**
 *
 * This Class provides a way of weaving a MoDisco Java model with a MoDisco KDM Source model. Both
 * models are discovered independently and then read to weave some instances like Archive,
 * Compilation Unit ...
 *
 * See Help contents or http://wiki.eclipse.org/MoDisco/Components/Java/Composition
 *
 */
public abstract class AbstractDiscoverKDMSourceAndJavaModel<T> extends
		AbstractComposedKDMSourceDiscoverer2<T> {

	private static final String JAVA = "Java"; //$NON-NLS-1$

	private Resource javaModelResource = null;
	private Resource package2DirectoryResource = null;
	private Resource javaAppModelResource = null;

	private Map<Java2Directory, Resource> directoryToResourceFragmentMap = null;
	private Map<CompilationUnit, List<JavaNodeSourceRegion>> cuToRegionsMap = null;

	private Model javaModel = null;
	private Segment kdmModel = null;
	private JavaApplication javaApplication = null;
	private InventoryContainer container = null;
	private IProject fProject = null;

	// ----------------------- parameters for the Java discoverer -----------------------
	private ElementsToAnalyze fElementsToAnalyze;

	@Parameter(name = "ELEMENTS_TO_ANALYZE", description = "The Java projects or packages that will be analyzed.")
	public void setElementsToAnalyze(final ElementsToAnalyze elementsToAnalyze) {
		this.fElementsToAnalyze = elementsToAnalyze;
	}

	protected ElementsToAnalyze getElementsToAnalyze() {
		return this.fElementsToAnalyze;
	}

	private boolean fLogJavaAnalysisWarnings = false;

	@Parameter(name = "LOG_JAVA_ANALYSIS_WARNINGS", description = "Whether to log warnings from java analysis.")
	public void setLogJavaAnalysisWarnings(final boolean logJavaAnalysisWarnings) {
		this.fLogJavaAnalysisWarnings = logJavaAnalysisWarnings;
	}

	protected boolean isLogJavaAnalysisWarnings() {
		return this.fLogJavaAnalysisWarnings;
	}

	private boolean fDeepAnalysis = true;

	@Parameter(name = "DEEP_ANALYSIS", description = "If true, analyze method bodies. If false, only analyze fields and method signatures.")
	public void setDeepAnalysis(final boolean deepAnalysis) {
		this.fDeepAnalysis = deepAnalysis;
	}

	protected boolean isDeepAnalysis() {
		return this.fDeepAnalysis;
	}

	private boolean fIncrementalMode;

	@Parameter(name = "INCREMENTAL_MODE", description = "Optimize memory use by analyzing incrementally (more time expensive).")
	public void setIncrementalMode(final boolean incrementalMode) {
		this.fIncrementalMode = incrementalMode;
	}

	protected boolean isIncrementalMode() {
		return this.fIncrementalMode;
	}

	private String includedElementsRegEx;

	@Parameter(name = "INCLUDED_ELEMENTS_REGEX", description = "A regular expression on qualified names for elements (types & packages) to be included during analysis")
	public void setIncludedElementsRegEx(final String includedElementsRegEx) {
		this.includedElementsRegEx = includedElementsRegEx;
	}

	protected String getIncludedElementsRegEx() {
		return this.includedElementsRegEx;
	}

	private String excludedElementsRegEx;

	@Parameter(name = "EXCLUDED_ELEMENTS_REGEX", description = "A regular expression on qualified names for elements (types & packages) to be excluded during analysis")
	public void setExcludedElementsRegEx(final String excludedElementsRegEx) {
		this.excludedElementsRegEx = excludedElementsRegEx;
	}

	protected String getExcludedElementsRegEx() {
		return this.excludedElementsRegEx;
	}

	// ---------------------- end of parameters for the Java discoverer ----------------------

	@Override
	protected boolean isSerializeKDMResource() {
		return isTargetSerializationChosen();
	}

	@Override
	protected URI getKDMResourceTargetURI() {
		return deriveTargetURI(null, null, IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX);
	}

	@Override
	protected void initializeCompositeModel(final T source, final IProgressMonitor monitor) {
		if (Activator.getDefault().isDebugging()) {
			System.out
					.println("--- Starting DiscoverKDMSourceAndJavaModel.initializeCompositeModel ---"); //$NON-NLS-1$
		}
		this.javaApplication = JavaapplicationFactory.eINSTANCE.createJavaApplication();
		setKdmSourceModelResource(null);
		this.javaModel = null;
		this.kdmModel = null;
		this.cuToRegionsMap = null;
		this.container = null;

		this.fProject = getProject(source);

		String projectName = this.fProject.getProject().getName();
		setDefaultTargetURI(URI
				.createPlatformResourceURI(
						projectName
								+ "/" + projectName + JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX, true)); //$NON-NLS-1$

		// Resource creation
		this.javaAppModelResource = getResourceSet().createResource(
				deriveTargetURI(null, null,
						JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX));
		this.package2DirectoryResource = getResourceSet()
				.createResource(
						deriveTargetURI(
								"java2kdmFragments", "Package2Directory", JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX)); //$NON-NLS-1$ //$NON-NLS-2$

		// Put the JavaApp Model in its resource
		this.javaAppModelResource.getContents().add(this.javaApplication);
	}

	protected abstract IProject getProject(T source);

	@Override
	protected void discoverOtherLeafModels(final T source, final IProgressMonitor monitor) {
		if (Activator.getDefault().isDebugging()) {
			System.out
					.println("--- Starting DiscoverKDMSourceAndJavaModel.discoverOtherLeafModels ---"); //$NON-NLS-1$
		}

		try {
			discoverJavaModel(source, monitor);
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	@Override
	protected void finishBuildingModel(final T source, final IProgressMonitor monitor) {
		if (Activator.getDefault().isDebugging()) {
			System.out
					.println("--- Starting DiscoverKDMSourceAndJavaModel.completeModelsBuild ---"); //$NON-NLS-1$
		}

		if (this.javaModelResource != null) {
			this.directoryToResourceFragmentMap = null;
			weaveModel();
			weaveCompilationUnit();
			weaveArchiveFile();
			if (isTargetSerializationChosen()) {
				try {
					saveAllResources(monitor);
				} catch (IOException e) {
					MoDiscoLogger.logError(e.getMessage(), Activator.getDefault());
				}
			}

			if (this.javaAppModelResource != null) {
				// set output parameter
				setTargetModel(this.javaAppModelResource);
			} else {
				if (Activator.getDefault().isDebugging()) {
					System.out.println("--- Starting JavaAppModelResource = null ---"); //$NON-NLS-1$
				}
			}
		} else { // Cancellation of java model discovery : to be improved
					// (catching InterruptedException)
			if (Activator.getDefault().isDebugging()) {
				System.out.println("--- Starting JavaModelResource = null ---"); //$NON-NLS-1$
			}
			this.javaApplication = null;
			this.javaAppModelResource = null;
		}

		doFinally(monitor);
	}

	protected void doFinally(final IProgressMonitor monitor) {
		monitor.done();
		// Release some memory
		setKdmSourceModelResource(null);
		this.javaModel = null;
		this.kdmModel = null;
		this.cuToRegionsMap = null;
		this.container = null;
	}

	/**
	 * Discovers a Java Model then a KDM Source one
	 *
	 * @param source
	 *            the project to be discovered
	 * @param monitor
	 * @throws InterruptedException
	 */
	void discoverJavaModel(final T source, final IProgressMonitor monitor)
			throws InterruptedException {

		this.cuToRegionsMap = new HashMap<CompilationUnit, List<JavaNodeSourceRegion>>();
		this.javaModelResource = null;
		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_10);

		AbstractDiscoverJavaModelFromProject<T> javaDiscoverer = initJavaDiscoverer();
		javaDiscoverer.setDeepAnalysis(isDeepAnalysis());
		javaDiscoverer.setElementsToAnalyze(getElementsToAnalyze());
		javaDiscoverer.setIncludedElementsRegEx(getIncludedElementsRegEx());
		javaDiscoverer.setExcludedElementsRegEx(getExcludedElementsRegEx());
		javaDiscoverer.setIncrementalMode(isIncrementalMode());
		javaDiscoverer.setLogJavaAnalysisWarnings(isLogJavaAnalysisWarnings());
		javaDiscoverer.setSerializeTarget(isTargetSerializationChosen());
		javaDiscoverer.setTargetURI(deriveTargetURI(null, null,
				JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX));
		javaDiscoverer.addSourceVisitListener(initSourceVisitListener());
		try {
			javaDiscoverer.discoverElement(source, monitor);
			this.javaModelResource = javaDiscoverer.getTargetModel();
		} catch (Exception e) {
			MoDiscoLogger.logError(e, "error discovering Java model", Activator.getDefault()); //$NON-NLS-1$
		}
		if (this.javaModelResource != null) {
			getResourceSet().getResources().add(this.javaModelResource);
			if (this.javaModelResource.getURI() == null
					|| this.javaModelResource.getURI().toString().trim().length() == 0) {
				this.javaModelResource.setURI(javaDiscoverer.getDefaultTargetURI());
			}
		} else {
			// we should consider cancellation of the whole process
			monitor.setCanceled(true);
		}
	}

	/**
	 * Derive a URI for a Resource from the main URI (if any) specified by the user, or the default
	 * URI.
	 *
	 * @param directory
	 *            a sub-directory name, or <code>null</code> if the Resource must be saved at the
	 *            same level as the main one
	 * @param filename
	 *            the base file name, or <code>null</code> if it must be derived from the main
	 *            Resource URI
	 * @param suffix
	 *            a suffix
	 * @return the derived URI
	 */
	private URI deriveTargetURI(final String directory, final String filename, final String suffix) {
		String baseName = filename;
		URI mainURI = getTargetURI();
		if (mainURI == null || mainURI.toString().trim().length() == 0) {
			mainURI = getDefaultTargetURI();
		}
		String lastSegment = mainURI.lastSegment();
		if (baseName == null) {
			if (lastSegment
					.endsWith(JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX)) {
				baseName = lastSegment
						.substring(
								0,
								lastSegment.length()
										- JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX
												.length());
			} else if (lastSegment.endsWith(".xmi")) { //$NON-NLS-1$
				baseName = lastSegment.substring(0, lastSegment.length() - ".xmi".length()); //$NON-NLS-1$
			} else {
				baseName = lastSegment;
			}
		}
		mainURI = mainURI.trimSegments(1);
		if (directory != null) {
			mainURI = mainURI.appendSegment(directory);
		}
		return mainURI.appendSegment(baseName + suffix);
	}

	protected abstract AbstractDiscoverJavaModelFromProject<T> initJavaDiscoverer();

	protected SourceVisitListener initSourceVisitListener() {
		return new JavaCompositionSourceVisitListener(this.cuToRegionsMap);
	}

	/**
	 * Weaves a Java Model with it corresponding KDM one
	 */
	void weaveModel() {
		this.javaApplication.setJavaModel(getJavaModel());
		this.javaApplication.setDeploymentModel((InventoryModel) getKdmModel().getModel().get(0));
	}

	/**
	 * Return the KDM Project to be explored during weaving
	 *
	 * @return
	 */
	private InventoryContainer getKDMProjectForWeaving() {
		try {
			if (this.container == null) {
				InventoryModel invent = null;
				for (KDMModel kdmModelTmp : getKdmModel().getModel()) {
					if (kdmModelTmp instanceof InventoryModel) {
						invent = (InventoryModel) kdmModelTmp;
						break;
					}
				}

				if (invent != null) {
					for (AbstractInventoryElement absInvenElt : invent.getInventoryElement()) {
						if (absInvenElt instanceof InventoryContainer) {
							this.container = (InventoryContainer) absInvenElt;
							break;
						}
					}
				}
			}
		} catch (NullPointerException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return this.container;
	}

	/**
	 * Weaves Java Archive elements with their corresponding KDM Source Binary Files
	 */
	void weaveArchiveFile() {

		List<BinaryFile> listBinaryFiles = new ArrayList<BinaryFile>();

		listBinaryFiles.addAll(KDMSourceUtils.getBinaryFilesFromInventoryModel(
				getKDMProjectForWeaving(), null, true));

		for (Archive archive : getJavaModel().getArchives()) {
			for (BinaryFile binaryFile : listBinaryFiles) {
				if (binaryFile.getPath().equalsIgnoreCase(archive.getOriginalFilePath())) {
					JavaJar2File javaJar2File = JavaapplicationFactory.eINSTANCE
							.createJavaJar2File();
					javaJar2File.setJavaArchive(archive);
					javaJar2File.setFile(binaryFile);
					this.javaApplication.getJar2FileChildren().add(javaJar2File);
				}
			}
		}
	}

	/**
	 * Weaves Java CompilationUnit elements with their corresponding KDM Source SourceFiles
	 */
	void weaveCompilationUnit() {

		// List all compilation unit in the model
		List<CompilationUnit> compilationUnitList = new ArrayList<CompilationUnit>();
		// bug 332068: we have to filter all compilation units named "package-info.java"
		for (CompilationUnit cu : getJavaModel().getCompilationUnits()) {
			if (!cu.getName().equals("package-info.java")) { //$NON-NLS-1$
				compilationUnitList.add(cu);
			} // else it is only javadoc or annotations for parent package
		}

		// List all Source File in the model
		List<String> filteredFileName = new ArrayList<String>();
		filteredFileName.add("bin"); //$NON-NLS-1$
		List<SourceFile> sourceFileList = new ArrayList<SourceFile>();

		sourceFileList.addAll(KDMSourceUtils.getSourceFileFromInventoryModel(
				getKDMProjectForWeaving(), filteredFileName, true));

		// Weave compilationUnits with their corresponding sourceFile matching
		// their path
		for (CompilationUnit compilationUnit : compilationUnitList) {

			Package pck = getPackageFromCU(compilationUnit);

			Java2Directory java2Directory = getJava2DirectoryFromPackage(pck);

			// If the java2Directory was not previously created, we create it
			if (java2Directory == null) {
				java2Directory = manageJava2DirectoryCreation(compilationUnit, pck);
			}

			for (SourceFile sourceFile : sourceFileList) {

				if (new File(sourceFile.getPath()).equals(new File(compilationUnit
						.getOriginalFilePath()))) {

					// We now have both the source file an the corresponding
					// compilation Unit
					// Creation of the weaving object :
					Java2File java2File = JavaapplicationFactory.eINSTANCE.createJava2File();
					java2File.setFile(sourceFile);
					sourceFile.setLanguage(AbstractDiscoverKDMSourceAndJavaModel.JAVA);
					java2File.setUnit(compilationUnit);

					if (this.cuToRegionsMap.get(compilationUnit) != null) {
						java2File.getChildren().addAll(getAndSortChildren(compilationUnit));
					}

					if (getMapJava2DirectoryResource().containsKey(java2Directory)) {
						getMapJava2DirectoryResource().get(java2Directory).getContents()
								.add(java2File);
					} else {

						// Create a resource to store this compilation Unit
						String qualifiedName = JavaUtil.getQualifiedName(java2Directory
								.getJavaPackage());
						Resource resource = getResourceSet()
								.createResource(
										deriveTargetURI(
												"java2kdmFragments", qualifiedName, JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX)); //$NON-NLS-1$
						resource.getContents().add(java2File);
						getMapJava2DirectoryResource().put(java2Directory, resource);
					}

					java2Directory.getJava2FileChildren().add(java2File);

					// Breaking the loop, CompilationUnit and SourceFile
					// relation is 1-1
					break;
				}
			}
		}
	}

	private List<JavaNodeSourceRegion> getAndSortChildren(final CompilationUnit compilationUnit) {
		List<JavaNodeSourceRegion> toBeSortedJavaNodeList = this.cuToRegionsMap
				.get(compilationUnit);
		Comparator<JavaNodeSourceRegion> c = new Comparator<JavaNodeSourceRegion>() {
			public int compare(final JavaNodeSourceRegion o1, final JavaNodeSourceRegion o2) {
				return o1.getStartPosition().compareTo(o2.getStartPosition());
			}
		};
		Collections.sort(toBeSortedJavaNodeList, c);
		return toBeSortedJavaNodeList;
	}

	private Java2Directory getJava2DirectoryFromPackage(final Package pck) {
		Java2Directory java2Directory = null;
		if (pck != null) {
			// Look in the resource for an existing java2Directory
			for (EObject object : this.package2DirectoryResource.getContents()) {
				if (((Java2Directory) object).getJavaPackage().equals(pck)) {
					java2Directory = (Java2Directory) object;
					break;
				}
			}
		} else {
			MoDiscoLogger.logWarning("No Package Found", Activator.getDefault()); //$NON-NLS-1$
		}
		return java2Directory;
	}

	/**
	 * Return a the Package containing the CompilationUnit, or null
	 *
	 * @param compilationUnit
	 *            the CompilationUnit to look into
	 * @return Package
	 */
	private static Package getPackageFromCU(final CompilationUnit compilationUnit) {
		// Check if the Java2Directory with the corresponding package
		// already exist
		Package pck = null;
		// Find the parent package
		for (AbstractTypeDeclaration atd : compilationUnit.getTypes()) {
			pck = atd.getPackage();
			if (pck != null) {
				return pck;
			}
		}
		return pck;
	}

	/**
	 * Create a Java2Directory instance and populate it with its CompilationUnit and Package
	 * instance Add it directly to the current JavaApplication
	 *
	 * @param compilationUnit
	 * @param pck
	 * @return
	 */
	private Java2Directory manageJava2DirectoryCreation(final CompilationUnit compilationUnit,
			final Package pck) {
		Java2Directory java2Directory = JavaapplicationFactory.eINSTANCE.createJava2Directory();
		java2Directory.setJavaPackage(pck);

		String directoryPath = compilationUnit.getOriginalFilePath().substring(0,
				compilationUnit.getOriginalFilePath().lastIndexOf(File.separator));

		java2Directory.getDirectory().add(
				KDMSourceUtils.getDirectoryByPath(directoryPath, getKDMProjectForWeaving()));

		// Add this java2Directory to the Resource of Java2Directory
		this.package2DirectoryResource.getContents().add(java2Directory);

		// Add the java2Directory to the JavaApplication Model
		this.javaApplication.getJava2DirectoryChildren().add(java2Directory);
		return java2Directory;
	}

	protected void saveAllResources(final IProgressMonitor monitor) throws IOException {
		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_7);
		saveResource(getJavaAppModelResource());

		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_8);
		saveResource(getPackage2DirectoryResource());

		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_9);
		for (Resource resource : getMapJava2DirectoryResource().values()) {
			saveResource(resource);
		}
	}

	public Model getJavaModel() {
		if (this.javaModel == null) {
			if (getJavaModelResource() != null) {
				this.javaModel = (Model) getJavaModelResource().getContents().get(0);
			} else {
				throw new IllegalStateException("java model resource should not be null"); //$NON-NLS-1$
			}
		}
		return this.javaModel;
	}

	public Segment getKdmModel() {
		if (this.kdmModel == null) {
			if (getKdmSourceModelResource() != null) {
				this.kdmModel = (Segment) getKdmSourceModelResource().getContents().get(0);
			} else {
				throw new IllegalStateException("kdm model resource should not be null"); //$NON-NLS-1$
			}
		}
		return this.kdmModel;
	}

	private Map<Java2Directory, Resource> getMapJava2DirectoryResource() {
		if (this.directoryToResourceFragmentMap == null) {
			this.directoryToResourceFragmentMap = new HashMap<Java2Directory, Resource>();
		}
		return this.directoryToResourceFragmentMap;
	}

	@Override
	public Resource getKdmSourceModelResource() {
		return super.getKdmSourceModelResource();
	}

	public Resource getPackage2DirectoryResource() {
		return this.package2DirectoryResource;
	}

	public Resource getJavaAppModelResource() {
		return this.javaAppModelResource;
	}

	public Map<CompilationUnit, List<JavaNodeSourceRegion>> getCuToRegionsMap() {
		return this.cuToRegionsMap;
	}

	public Resource getJavaModelResource() {
		return this.javaModelResource;
	}

	@Override
	protected void saveTargetModel() throws IOException {
		// already done in saveAllResources
	}

}