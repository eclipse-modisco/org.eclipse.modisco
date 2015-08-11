/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Archive;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.java.internal.util.JavaUtil;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.gmt.modisco.omg.kdm.source.BinaryFile;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceFile;
import org.eclipse.gmt.modisco.omg.kdm.source.util.KDMSourceUtils;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.java.composition.discoverer.listeners.JavaCompositionSourceVisitListener;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaJar2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationFactory;
import org.eclipse.modisco.kdm.source.extension.discovery.AbstractComposedKDMSourceDiscoverer;
import org.eclipse.modisco.kdm.source.extension.discovery.SourceVisitListener;

/**
 *
 * This Class provides a way of weaving a MoDisco Java Model with a MoDisco KDM Source one. Both
 * models are discovered independently and then read to weave some instances like Archive,
 * Compilation Unit ...
 *
 * See Help contents or http://wiki.eclipse.org/MoDisco/Components/Java/Composition
 *
 * @deprecated use {@link DiscoverKDMSourceAndJavaModelFromProject} or
 *             {@link DiscoverKDMSourceAndJavaModelFromJavaProject},
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474718
 *
 */
@Deprecated
public class DiscoverKDMSourceAndJavaModel extends AbstractComposedKDMSourceDiscoverer {

	public static final int FLUSH_LIMIT = 10000;
	private static final String JAVA = "Java"; //$NON-NLS-1$
	private static List<DiscoveryParameter> parametersKeys = null;

	public static final DiscoveryParameter PARAMETERS_BEAN = DiscoverJavaModelFromJavaProject.PARAMETERS_BEAN;
	private static final String FRAGMENT_FOLDER_NAME = "java2kdmFragments"; //$NON-NLS-1$

	private ResourceSetImpl fResourceSet;
	private Resource javaModelResource = null;
	private Resource package2DirectoryResource = null;
	private Resource javaAppModelResource = null;

	private Map<Java2Directory, Resource> directoryToResourceFragmentMap = null;
	private Map<CompilationUnit, List<JavaNodeSourceRegion>> cuToRegionsMap = null;

	private Model javaModel = null;
	private Segment kdmModel = null;
	private JavaApplication javaApplication = null;
	private InventoryContainer container = null;
	private IProject project = null;

	private String resourceRootPath;
	private String resourceFragmentPath;
	private boolean isSilent;

	/**
	 * Return true if this discoverer can be applied on the source
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = true;
		} else if (source instanceof IProject) {
			IProject project2 = (IProject) source;
			try {
				if (project2.hasNature(JavaCore.NATURE_ID)) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverKDMSourceAndJavaModel.parametersKeys == null) {
			DiscoverKDMSourceAndJavaModel.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverKDMSourceAndJavaModel.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverKDMSourceAndJavaModel.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			DiscoverKDMSourceAndJavaModel.parametersKeys
					.add(DiscoverJavaModelFromJavaProject.PARAMETERS_BEAN);
		}
		return DiscoverKDMSourceAndJavaModel.parametersKeys;
	}

	@Override
	protected void initializeCompositeModel(final Object source,
			final Map<DiscoveryParameter, Object> parameters, final IProgressMonitor monitor) {
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

		if (source instanceof IJavaProject) {
			this.project = ((IJavaProject) source).getProject();
		} else if (source instanceof IProject) {
			this.project = (IProject) source;
		}

		if (this.project == null) {
			throw new NullPointerException(Messages.DiscoverKDMSourceAndJavaModel_5);
		}

		if (parameters != null) {
			this.isSilent = Boolean.TRUE.equals(parameters
					.get(DefaultDiscoverer.PARAMETER_SILENT_MODE));

		}

		this.resourceRootPath = "platform:/resource/" //$NON-NLS-1$
				+ this.project.getProject().getName() + "/"; //$NON-NLS-1$

		this.resourceFragmentPath = this.resourceRootPath + "/" //$NON-NLS-1$
				+ DiscoverKDMSourceAndJavaModel.FRAGMENT_FOLDER_NAME + "/"; //$NON-NLS-1$

		String pathJavaApp = this.resourceRootPath + this.project.getProject().getName()
				+ JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX;
		String pathDirectory = this.resourceFragmentPath
				+ "Package2Directory" + JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX; //$NON-NLS-1$

		// Resource creation
		this.javaAppModelResource = getResource(pathJavaApp);
		this.package2DirectoryResource = getResource(pathDirectory);

		// Put the JavaApp Model in its resource
		this.javaAppModelResource.getContents().add(this.javaApplication);

	}

	@Override
	protected void discoverOtherLeafModels(final Object source,
			final Map<DiscoveryParameter, Object> parameters, final IProgressMonitor monitor) {
		if (Activator.getDefault().isDebugging()) {
			System.out
					.println("--- Starting DiscoverKDMSourceAndJavaModel.discoverOtherLeafModels ---"); //$NON-NLS-1$
		}

		try {
			discoverJavaModel(source, parameters, monitor);
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	@Override
	protected void completeModelsBuild(final Object source,
			final Map<DiscoveryParameter, Object> parameters, final IProgressMonitor monitor) {
		if (Activator.getDefault().isDebugging()) {
			System.out
					.println("--- Starting DiscoverKDMSourceAndJavaModel.completeModelsBuild ---"); //$NON-NLS-1$
		}

		if (this.javaModelResource != null) {
			this.directoryToResourceFragmentMap = null;
			weaveModel();
			weaveCompilationUnit();
			weaveArchiveFile();
			try {
				saveAllResource(monitor);
			} catch (IOException e) {
				MoDiscoLogger.logError(e.getMessage(), Activator.getDefault());
			}

			if (this.javaAppModelResource != null) {
				// set output parameter
				if (parameters != null) {
					parameters.put(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE,
							this.javaAppModelResource);
				} else {
					MoDiscoLogger.logWarning(Messages.DiscoverKDMSourceAndJavaModel_12,
							Activator.getDefault());
				}
			} else {
				if (Activator.getDefault().isDebugging()) {
					System.out.println("--- Starting JavaAppModelResource = null ---"); //$NON-NLS-1$
				}
			}
		} else { // Cancel of java model discovery : to be improved
					// (InterruptedException cathcing)
			if (Activator.getDefault().isDebugging()) {
				System.out.println("--- Starting JavaModelResource = null ---"); //$NON-NLS-1$
			}
			this.javaApplication = null;
			this.javaAppModelResource = null;
		}

		doFinally(monitor);

	}

	@Override
	protected String getDiscoveryName() {
		return Messages.DiscoverKDMSourceAndJavaModel_6;
	}

	@Override
	protected Resource getResultModel() {
		return getJavaAppModelResource();
	}

	@Override
	protected boolean shouldOpenEditorOnResultModel() {
		return !this.isSilent;
	}

	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		throw new RuntimeException("Should not be used."); //$NON-NLS-1$
	}

	protected Resource getResource(final String path) {
		if (this.fResourceSet == null) {
			this.fResourceSet = new ResourceSetImpl();
		}

		return this.fResourceSet.createResource(URI.createURI(path));
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
	 * @param parameters
	 *            the list of optionnal parameters
	 * @param monitor
	 * @throws InterruptedException
	 */
	void discoverJavaModel(final Object source, final Map<DiscoveryParameter, Object> parameters,
			final IProgressMonitor monitor) throws InterruptedException {

		this.cuToRegionsMap = new HashMap<CompilationUnit, List<JavaNodeSourceRegion>>();
		this.javaModelResource = null;
		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_10);
		Map<DiscoveryParameter, Object> parameterForJavaDiscovery = getJavaParameters(parameters);

		DiscoverJavaModelFromJavaProject javaDiscoverer = initJavaDiscoverer();
		javaDiscoverer.addSourceVisitListener(initSourceVisitListener());
		javaDiscoverer.discoverElement(source, parameterForJavaDiscovery);

		if (parameterForJavaDiscovery.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE) != null) {
			this.javaModelResource = ((Resource) parameterForJavaDiscovery
					.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE));
		} else {
			// we should consider cancellation of the whole process
			monitor.setCanceled(true);
		}
	}

	protected Map<DiscoveryParameter, Object> getJavaParameters(
			final Map<DiscoveryParameter, Object> parameters) {
		Map<DiscoveryParameter, Object> parameterForJavaDiscovery = new HashMap<DiscoveryParameter, Object>();
		parameterForJavaDiscovery.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, new Boolean(
				this.isSilent));
		parameterForJavaDiscovery.put(DefaultDiscoverer.PARAMETER_BROWSE_RESULT, Boolean.FALSE);
		parameterForJavaDiscovery.put(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE, null);
		if (parameters != null) {
			if (parameters.containsKey(DiscoverKDMSourceAndJavaModel.PARAMETERS_BEAN)) {
				parameterForJavaDiscovery.put(DiscoverKDMSourceAndJavaModel.PARAMETERS_BEAN,
						parameters.get(DiscoverKDMSourceAndJavaModel.PARAMETERS_BEAN));
			}
		}

		return parameterForJavaDiscovery;
	}

	@SuppressWarnings("static-method") // designed to allow override
	protected DiscoverJavaModelFromJavaProject initJavaDiscoverer() {
		return new DiscoverJavaModelFromJavaProject();
	}

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
					sourceFile.setLanguage(DiscoverKDMSourceAndJavaModel.JAVA);
					java2File.setUnit(compilationUnit);

					if (this.cuToRegionsMap.get(compilationUnit) != null) {
						java2File.getChildren().addAll(getAndSortChildren(compilationUnit));
					}

					if (getMapJava2DirectoryResource().containsKey(java2Directory)) {
						getMapJava2DirectoryResource().get(java2Directory).getContents()
								.add(java2File);
					} else {
						// Create a resource to store this compilation Unit
						Resource resource = getResource(this.resourceFragmentPath
								+ "/" + JavaUtil.getQualifiedName(java2Directory.getJavaPackage()) + JavaCompositionDiscoveryConstants.JAVA_COMPOSITION_MODEL_FILE_SUFFIX); //$NON-NLS-1$
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

	/**
	 *
	 * @param pck
	 * @return
	 */
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
	 * Return the Package containing the CompilationUnit, or null
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

	protected void saveAllResource(final IProgressMonitor monitor) throws IOException {
		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_7);
		saveResource(getJavaAppModelResource(), monitor);

		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_8);
		saveResource(getPackage2DirectoryResource(), monitor);

		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_9);
		for (Resource r : getMapJava2DirectoryResource().values()) {
			saveResource(r, monitor);
		}
	}

	private static void saveResource(final Resource resource, final IProgressMonitor monitor)
			throws IOException {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_FLUSH_THRESHOLD, new Integer(
				DiscoverKDMSourceAndJavaModel.FLUSH_LIMIT));
		options.put(XMLResource.OPTION_USE_FILE_BUFFER, new Boolean(true));
		monitor.subTask(Messages.DiscoverKDMSourceAndJavaModel_4);
		try {
			resource.save(options);
		} catch (IOWrappedException e) { // TODO here is a temporary fix
											// for bugzilla 323247
			if (e.getCause() != null && (e.getCause() instanceof CoreException)) {
				MoDiscoLogger
						.logWarning(
								e,
								"XMI serialization has failed... Trying again without File Buffer. File is " + resource.getURI(), //$NON-NLS-1$
								Activator.getDefault());
				options.clear();
				resource.save(options);
				MoDiscoLogger.logWarning("XMI serialization is done for " + resource.getURI(), //$NON-NLS-1$
						Activator.getDefault());
			} else {
				throw e;
			}
		}
	}

	public Model getJavaModel() {
		if (this.javaModel == null) {
			if (getJavaModelResource() != null) {
				this.javaModel = (Model) getJavaModelResource().getContents().get(0);
			} else {
				throw new NullPointerException(Messages.DiscoverKDMSourceAndJavaModel_2);
			}
		}
		return this.javaModel;
	}

	public Segment getKdmModel() {
		if (this.kdmModel == null) {
			if (getKdmSourceModelResource() != null) {
				this.kdmModel = (Segment) getKdmSourceModelResource().getContents().get(0);
			} else {
				throw new NullPointerException(Messages.DiscoverKDMSourceAndJavaModel_3);
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

}