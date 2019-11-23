/*******************************************************************************
 * Copyright (c) 2012, 2016 INRIA, and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Guillaume Doux (INRIA) - Initial API and implementation
 *    Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
 *    Grégoire Dupé (Mia-Software) - Bug 482857 - Discoverer Benchmark Report : wrong namespaces
 *    Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 *    Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 *    Grégoire Dupé (Mia-Software) - Bug 483639 - [Benchmark] Incorrect standard derivation computation
 *    Grégoire Dupé (Mia-Software) - Bug 488020 - computeSize benchmark error message not precise enough
 *    Grégoire Dupé (Mia-Software) - Bug 489866 - [Benchmark] inverse benchmarking algorithm
 *    Grégoire Dupé (Mia-Software) - Bug 491545 - [Benchmark] Need more reporting messages
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.benchmark.core.ISizeDiscoverer;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.MathUtils;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.Messages;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IDiscovererBenchmarkDiscoverer;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IDiscovererID;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IEventNotifier;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSet;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project;
import org.eclipse.modisco.infra.discovery.catalog.CatalogFactory;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.LaunchFactory;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;
import org.eclipse.modisco.utils.core.internal.exported.SystemInfo;
import org.eclipse.osgi.util.NLS;

/**
 * Main entry point for the discoverer of benchmark
 * @author Guillaume Doux
 *
 */
public class DiscovererBenchmarkDiscoverer extends AbstractModelDiscoverer<IProjectSet>
		implements IDiscovererBenchmarkDiscoverer {

	private static final String SAVE_OPERATION = "SaveOperation"; //$NON-NLS-1$
	private static final int INTERVAL = 1000;
	private static final int MSINSEC = 1000;
	private static final String CODE_EXTENSION = "java"; //$NON-NLS-1$
	public static final String ID = "org.eclipse.modisco.infra.discovery.benchmark.core.api.benchmarkdiscoverer"; //$NON-NLS-1$
	private static final long BYTEPERMB = 1024 * 1024;

	private IDiscovererID discovererID;
	private int iterations;
	private boolean measureMemoryUse;
	private int memPollInterval;
	private boolean generateHtml;
	private URI htmlReportLoc;
	private final List<MemoryMeasurement> memMeasurements;
	private final List<Event> events;
	private final ResourceSet rSet;
	private EventAndMemoryRecorder recorder;
	private IDiscovererList discoverers;
	private String sizeDiscovererId;

	public DiscovererBenchmarkDiscoverer() {
		super();
		this.discovererID = new DiscovererID(ID);
		this.memPollInterval = 0;
		this.memMeasurements = new LinkedList<MemoryMeasurement>();
		this.events = new LinkedList<Event>();
		this.rSet = new ResourceSetImpl();
		final Registry rFactoryRegistry =
				this.rSet.getResourceFactoryRegistry();
		final Map<String, Object> extToFactoryMap =
				rFactoryRegistry.getExtensionToFactoryMap();
		extToFactoryMap.put("xmi", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		this.iterations = 1;
	}

	protected IDiscovererList getDiscoverers() {
		return this.discoverers;
	}

	/**
	 * Setter for the list of discoverers, annotated with @Parameter set by the UI
	 * @param discos: the list of discoverers
	 */
	@Parameter(name = "DISCOVERER_LIST", description = "The list of discoverers.", requiresInputValue = true)
	public void setDiscoverers(final IDiscovererList discos) {
		this.discoverers = discos;
	}

	/**
	 * Method launching the discovery process on all the discoverers X all the projects
	 * @param projects the set of projects to discover
	 * @param progressMonitor
	 * @return The benchmark model conforms to http://www.eclipse.org/modisco/infra/discovery/0.1.incubation/benchmark
	 * @throws DiscoveryException
	 */
	public Resource discoverBenchmark(final IProjectSet projects,
			final IProgressMonitor progressMonitor) throws DiscoveryException {
		this.recorder =
				new EventAndMemoryRecorder(this.measureMemoryUse,
				this.memPollInterval);
		final int nbDiscoToDo = getIterations() * projects.getProjects().size()
				* this.discoverers.getDiscoverers().size();
		progressMonitor.beginTask(
				Messages.DiscovererBenchmarkDiscoverer_BenchmarkTaskName,
				nbDiscoToDo);
		final Benchmark benchmark = benchmarkInit(projects, progressMonitor);
		for (int i = 1; i <= this.iterations; i++) {
			for (Discovery discovery : benchmark.getDiscoveries()) {
				progressMonitor.subTask(
						Messages.DiscovererBenchmarkDiscoverer_DiscoveryInitializationSubTask);
				final org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource resource = discovery.getProject();
				if (resource instanceof Project) {
					final Project projectDesc = (Project) resource;
					final IProject project = ResourcesPlugin.getWorkspace()
							.getRoot().getProject(projectDesc.getName());
					final AbstractModelDiscoverer<IProject> discoverer =
							preformIteration(progressMonitor, benchmark,
									project, discovery, i);
					postDiscoveryDiscoInit(discovery, discoverer);
				}
			}
		}
		benchmark.setJvmMaxHeapInMiB(computeMaxMemoryUsage());
		save(benchmark, progressMonitor);
		progressMonitor.worked(nbDiscoToDo);
		if (isGenerateHtmlReport()) {
			safeGenerateHtmlReport(progressMonitor, benchmark);
		}
		progressMonitor.done();
		return benchmark.eResource();
	}

	private AbstractModelDiscoverer<IProject> preformIteration(
			final IProgressMonitor progressMonitor, final Benchmark benchmark,
			final IProject project, final Discovery disco, final int iteration) {
		final String discovererId = disco.getDiscovererId();
		final String infoMsg = String.format(
				"Excuting the discoverer '%s' on '%s' (iteration=%s)", //$NON-NLS-1$
				discovererId, project.getName(), Integer.valueOf(iteration));
		Logger.logInfo(infoMsg, Activator.getDefault());
		final AbstractModelDiscoverer<IProject> discoverer = (AbstractModelDiscoverer<IProject>)
				IDiscoveryManager.INSTANCE.createDiscovererImpl(discovererId);
		final URI serializationLoc = getSerializationLoc(discoverer);
		progressMonitor.subTask(NLS.bind(
				Messages.DiscovererBenchmarkDiscoverer_ProjectDiscoveryIterationSubTask,
				String.valueOf(getIterations())));
		final String suffix = String.format("%s_%s_i%s.xmi", //$NON-NLS-1$
				discovererId, project.getName(),
				String.valueOf(iteration));
		final URI uri = serializationLoc.appendSegment(suffix);
		discoverer.setTargetURI(uri);
		boolean failure = false;
		final StringBuilder discoveryErrors = new StringBuilder();
		this.recorder.reset();
		if (IEventNotifier.class.isInstance(discoverer)) {
			((IEventNotifier) discoverer).addListener(this.recorder);
		}
		this.recorder.start();
		try {
			if (discoverer.isApplicableTo(project)) {
				final IProgressMonitor subProgressM =
						new SubProgressMonitor(progressMonitor, 0);
				discoverer.discoverElement(project, subProgressM);
			} else {
				final String message = String.format(
						"Discoverer '%s' is not applicable on project '%s'.", //$NON-NLS-1$
						discovererId, project.getName());
				Logger.logError(message, Activator.getDefault());
			}
		} catch (Exception e) {
			failure = true;
			discoveryErrors.append(e.getStackTrace().toString());
			final String message = String.format(
					"Benchmark of discoverer %s fails on project '%s'", //$NON-NLS-1$
					discovererId, project.getName());
			Logger.logError(e, message, Activator.getDefault());
		}
		this.recorder.stop();
		this.events.addAll(this.recorder.getEvents());
		this.events.addAll(this.recorder.getMemoryMeasurements());
		this.memMeasurements.addAll(this.recorder.getMemoryMeasurements());
		if (IEventNotifier.class.isInstance(discoverer)) {
			((IEventNotifier) discoverer).removeListener(this.recorder);
		}
		final DiscoveryIteration iterationDesc =
				createDiscoveryIteration(this.recorder);
		if (failure) {
			iterationDesc.setDiscoveryErrors(
					discoveryErrors.toString());
		}
		disco.getIterations().add(iterationDesc);
		save(benchmark, progressMonitor);
		progressMonitor.worked(1);
		return discoverer;
	}

	private URI getSerializationLoc(final AbstractModelDiscoverer<IProject> discoverer) {
		URI result;
		if (discoverer.getTargetURI() == null) {
			result = basicGetSerializationLoc(this);
		} else {
			result = basicGetSerializationLoc(discoverer);
		}
		return result;
	}

	private Project createProjectDescription(final IProject project,
			final Benchmark benchmark, final IProgressMonitor progressMonitor)
					throws DiscoveryException {
		progressMonitor.subTask(
				Messages.DiscovererBenchmarkDiscoverer_ProjectInitializationSubTask);
		final ISizeDiscoverer discoverer = (ISizeDiscoverer)
				IDiscoveryManager.INSTANCE.createDiscovererImpl(this.sizeDiscovererId);
		final Project projDesc = BenchmarkFactory.eINSTANCE.createProject();
		discoverer.discoverElement(project, new NullProgressMonitor());
		final double prjSize = discoverer.getSize();
		projDesc.setInputSize(prjSize);
		final String prjUnit = discoverer.getUnit();
		projDesc.setInputSizeUnit(prjUnit);
		projDesc.setName(project.getName());
		benchmark.getProjects().add(projDesc);
		return projDesc;
	}

	private void save(final Benchmark benchmark,
			final IProgressMonitor progressMonitor) {
		if (this.isTargetSerializationChosen()) {
			try {
				progressMonitor.subTask(
						Messages.DiscovererBenchmarkDiscoverer_SavingBenchmarkDataSubTask);
				saveTargetModel(benchmark);
			} catch (IOException e) {
				Logger.logError(e, "Failed to save the benchmark model.", //$NON-NLS-1$
						Activator.getDefault());
			}
		}
	}

	private static URI basicGetSerializationLoc(
			final AbstractModelDiscoverer<?> discoverer) {
		final URI targetURI = discoverer.getTargetURI();
		return targetURI.trimFileExtension();
	}

	/**
	 * Compute the size of the model in parameter (in number of model elements)
	 * @param discoverer.getTargetModel()
	 * @return the number of model elements
	 */
	private static long computeSize(final AbstractModelDiscoverer<IProject> discoverer) {
		long size = 0;
		final Resource targetModel = discoverer.getTargetModel();
		if (targetModel == null) {
			final String message = String.format(
					"Unable to compute the number of element of an unexisting model for the discoverer '%s'", //$NON-NLS-1$
					discoverer.getClass().getName());
			Logger.logWarning(message, Activator.getDefault());
		} else {
			final TreeIterator<EObject> allContents = targetModel.getAllContents();
			for (final TreeIterator<EObject> iterator = allContents;
					iterator.hasNext();) {
				iterator.next();
				size++;
			}
		}
		return size;
	}

	private void safeGenerateHtmlReport(final IProgressMonitor progressMonitor, final Benchmark benchmark) {
		try {

			generateHtmlReport(progressMonitor, benchmark);
		} catch (Exception e) {
			Logger.logError(e, "Report generation fail", Activator.getDefault()); //$NON-NLS-1$
		}
	}

	/**
	 * launch the generation of the HTML report and the charts for the benchmark model in parameter
	 * @param parentMonitor
	 * @param benchmark
	 * @throws ReportUtilsException
	 * @throws CoreException
	 */
	private void generateHtmlReport(final IProgressMonitor parentMonitor,
			final Benchmark benchmark) throws ReportUtilsException, CoreException {
		parentMonitor.subTask(
				Messages.DiscovererBenchmarkDiscoverer_GeneratingBenchmarkReportSubTask);
		final IProgressMonitor progressMonitor =
				new SubProgressMonitor(parentMonitor, 0);
		//Get the output folder
		URI targetURI = null;
		if (this.getHtmlReportLocation() == null) {
			targetURI = this.getTargetURI();
		} else {
			targetURI = this.getHtmlReportLocation();
		}
		if (targetURI == null) {
			Logger.logWarning(
					"The HTML_REPORT_LOCATION or the TARGET_URI parameter should not be null", //$NON-NLS-1$
					Activator.getDefault());
			return;
		}
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot wsRoot = workspace.getRoot();
		java.io.File file = null;
		IFile iFile = null;
		final String targetUriStr = targetURI.toString();
		if (targetURI.isPlatformResource()) {
			final String pathStr =
					targetUriStr.replaceAll("platform:/resource", ""); //$NON-NLS-1$//$NON-NLS-2$
			iFile = wsRoot.getFile(new Path(pathStr));
			iFile.getLocation().toFile();
		} else if (targetURI.isFile()) {
			file = new java.io.File(java.net.URI.create(targetUriStr));
		} else {
			final String message = String.format(
					"The following target URI '%s' is not managed. 'platform:/resource' or 'file:/' are expected.", //$NON-NLS-1$
					targetURI.toString());
			throw new IllegalArgumentException(message);
		}
		final ArrayList<Object> arguments = new ArrayList<Object>();
		//Generation of the HTML report
		ReportUtils.generateReport(benchmark, file, arguments, this.measureMemoryUse);
		if (iFile != null) {
			final IContainer location = iFile.getParent();
			location.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
		}
	}

	/**
	 * Set the launch parameters of the {@link AbstractModelDiscoverer} in parameter with the content of the {@link Discovery} element
	 * @param disco {@link Discovery}
	 * @param discoverer {@link AbstractModelDiscoverer} (AbstractModelDiscoverer<IProject>)
	 */
	private void setLaunchParameter(final Discovery disco,
			final AbstractModelDiscoverer<IProject> discoverer) {
		final LaunchConfiguration launchConfig =
				disco.getDiscovererLaunchConfiguration();
		if (launchConfig != null) {
			for (ParameterValue pv : launchConfig.getParameterValues()) {
				final DiscovererParameter parameter = pv.getParameter();
				final Object value = pv.getValue();
				if (value != null) {
					try {
						if (parameter.getSetter() == null) {
							final Method setter = findSetter(
									discoverer.getClass(), parameter.getId());
							parameter.setSetter(setter);
						}
						this.setValue(parameter, discoverer, value);
					} catch (DiscoveryException e) {
						Logger.logWarning(e, Activator.getDefault());
					}
				}
			}
		}
	}

	/**
	 * Find the setter of identifier id in the class clazz
	 * use java reflexion
	 * @param clazz
	 * @param paramId
	 * @return the setter
	 */
	private static Method findSetter(
			final Class<? extends AbstractModelDiscoverer> clazz,
			final String paramId) {
		Method result = null;
		for (Method method : clazz.getMethods()) {
			if (method.isAnnotationPresent(Parameter.class)) {
				final Parameter param = method.getAnnotation(Parameter.class);
				if (param.name().equals(paramId)
						&& method.getReturnType().equals(void.class)) {
					result = method;
				}
			}
		}
		return result;
	}

	/**
	 * method to set the values of parameters: extracted from DiscoveryManager
	 * (org.eclipse.modisco.infra.discovery.core.internal)
	 *
	 * @param parameter
	 * @param discoverer
	 * @param parameterValue
	 * @throws DiscoveryException
	 */
	private static void setValue(final DiscovererParameter parameter,
			final IDiscoverer<?> discoverer,
			final Object parameterValue) throws DiscoveryException {
		try {
			if (parameter.getField() != null
					&& Modifier.isPublic(parameter.getField().getModifiers())) {
				parameter.getField().set(discoverer, parameterValue);
			} else if (parameter.getSetter() != null
					&& Modifier.isPublic(parameter.getSetter().getModifiers())) {
				parameter.getSetter().invoke(discoverer, parameterValue);
			} else {
				final String message = String.format(
						"The discoverer '%s' does not implement public write access to the parameter '%s'", //$NON-NLS-1$
						discoverer.getClass(),
						parameter.getId());
				throw new DiscoveryException(message);
			}
		} catch (IllegalArgumentException e) {
			onInvokeException(parameter, parameterValue, e);
		} catch (IllegalAccessException e) {
			onInvokeException(parameter, parameterValue, e);
		} catch (InvocationTargetException e) {
			onInvokeException(parameter, parameterValue, e);
		}
	}

	private static void onInvokeException(final DiscovererParameter parameter,
			final Object parameterValue, final Exception exception)
					throws DiscoveryException {
		final String message = String.format(
				"Illegal parameter value for '%s' : %s", //$NON-NLS-1$
				parameter.getId(), parameterValue);
		throw new DiscoveryException(message, exception);
	}

	/**
	 * Save the benchmark model in an XMI file
	 * @param benchmark
	 * @throws IOException
	 */
	private void saveTargetModel(final Benchmark benchmark) throws IOException {
		if ((this.getTargetURI() == null) && (this.getTargetModel() == null)) {
			Logger.logWarning("The parameter TARGET_URI should not be empty", //$NON-NLS-1$
					Activator.getDefault());
			return;
		}
		Resource resource = benchmark.eResource();
		if (resource == null) {
			URI resourceUri;
			if (getTargetModel() == null) {
				resourceUri = getTargetURI();
			} else {
				resourceUri = getTargetModel().getURI();
			}
			resource = this.rSet.createResource(resourceUri);
			resource.getContents().add(benchmark);
		}
		final List<Event> eventsList = new ArrayList<Event>();
		final List<EventType> eventTypeList = new ArrayList<EventType>();
		for (Discovery discovery : benchmark.getDiscoveries()) {
			for (DiscoveryIteration iteration : discovery.getIterations()) {
				for (Event event : iteration.getEvents()) {
					eventsList.add(event);
					eventTypeList.add(event.getEventType());
				}
			}
		}
		resource.getContents().addAll(eventTypeList);
		this.setTargetModel(resource);
		this.saveTargetModel();
	}

	/**
	 * Compute the maximum amount of memory used in the discovery
	 * @return max memory used
	 */
	private long computeMaxMemoryUsage() {
		long max = 0;
		for (MemoryMeasurement measure : this.memMeasurements) {
			if (max < measure.getMemoryUsed()) {
				max = measure.getMemoryUsed();
			}
		}
		return max;
	}

	/**
	 * Initialize the benchmark model element with system information
	 * @param projects
	 * @return the model element
	 * @throws DiscoveryException
	 */
	private Benchmark benchmarkInit(final IProjectSet projects,
			final IProgressMonitor progressMonitor) throws DiscoveryException {
		progressMonitor.subTask(
				Messages.DiscovererBenchmarkDiscoverer_BenchmarkInitializationSubTask);
		final Benchmark benchmark = BenchmarkFactory.eINSTANCE.createBenchmark();
		try {
			final SystemInfo sysInfo = SystemInfo.getInstance();
			benchmark.setJvmMaxHeapInMiB(Runtime.getRuntime().maxMemory() / BYTEPERMB);
			benchmark.setProcessorName(sysInfo.getProcName());
			benchmark.setProcessorDescription(sysInfo.getProcDescription());
			benchmark.setProcessorCount(sysInfo.getnProcessors());
			benchmark.setProcessorCacheSize(sysInfo.getProcCacheSize());
			benchmark.setSystemMemory(sysInfo.getMemory());
			benchmark.setOsName(sysInfo.getOsName());
			benchmark.setOsVersion(sysInfo.getOsVersion());
			benchmark.setOsArchitecture(sysInfo.getArch());
		} catch (IOException e) {
			Logger.logError(e,
					"Could not get system information for benchmark", //$NON-NLS-1$
					Activator.getDefault());
		}
		for (IProject project : projects.sortBySize().getProjects()) {
			final Project projectDesc = createProjectDescription(project,
					benchmark, progressMonitor);
			for (Discovery discovery : this.discoverers) {
				createDiscovery(projectDesc, discovery, benchmark);
			}
		}
		return benchmark;
	}

	/**
	 * Initialize the discovery model element before launching the associated
	 * discoverer
	 *
	 * @param projectDesc
	 *            the model element for project that will be discovered
	 * @param disco
	 *            the model element to initialize
	 * @param discovery
	 *            the model element representing the information concerning the
	 *            discovery in the launch configuration
	 * @param discoverer
	 *            the real discoverer {@link AbstractModelDiscoverer}
	 * @param benchmark
	 * @param discovererId
	 *            the discoverer id
	 * @throws DiscoveryException
	 */
	private Discovery createDiscovery(final Project projectDesc,
			final Discovery discovery, final Benchmark benchmark)
			throws DiscoveryException {
		final String discovererId = discovery.getDiscovererId();
		final AbstractModelDiscoverer<IProject> discoverer =
				(AbstractModelDiscoverer<IProject>)
				IDiscoveryManager.INSTANCE.createDiscovererImpl(discovererId);
		if (discoverer == null) {
			final String message = String.format("The discoverer '%s' does not exists.", discovererId);
			throw new DiscoveryException(message);
		}
		final Discovery disco = BenchmarkFactory.eINSTANCE.createDiscovery();
		disco.setProject(projectDesc);
		disco.setName(discoverer.toString());
		disco.setDiscovererClassName(discoverer.getClass().getName());
		disco.setDiscovererId(discovererId);
		final DiscovererDescription discoDesc =
				CatalogFactory.eINSTANCE.createDiscovererDescription();
		final LaunchConfiguration discoLaunchConfig =
				discovery.getDiscovererLaunchConfiguration();
		if (discoLaunchConfig != null) {
			final LaunchConfiguration launchConfig =
					LaunchFactory.eINSTANCE.createLaunchConfiguration();
			launchConfig.setSource(projectDesc.getName());
			launchConfig.setDiscoverer(discoDesc);
			launchConfig.setOpenModelAfterDiscovery(
					discoLaunchConfig.isOpenModelAfterDiscovery());
			for (ParameterValue paramValue : discoLaunchConfig.getParameterValues()) {
				final ParameterValue newParamValue =
						LaunchFactory.eINSTANCE.createParameterValue();
				newParamValue.setValue(paramValue.getValue());
				final DiscovererParameter param =
						CatalogFactory.eINSTANCE.createDiscovererParameter();
				param.setDescription(paramValue.getParameter().getDescription());
				param.setDirection(paramValue.getParameter().getDirection());
				param.setDiscoverer(discoDesc);
				param.setField(paramValue.getParameter().getField());
				param.setGetter(paramValue.getParameter().getGetter());
				param.setId(paramValue.getParameter().getId());
				param.setInitializer(paramValue.getParameter().getInitializer());
				param.setRequiredInput(paramValue.getParameter().isRequiredInput());
				param.setSetter(paramValue.getParameter().getSetter());
				param.setType(paramValue.getParameter().getType());
				newParamValue.setParameter(param);
				launchConfig.getParameterValues().add(newParamValue);
			}
			disco.setDiscovererLaunchConfiguration(launchConfig);
		}
		if (discovery.getCopyOfDiscovererDescription() == null) {
			discoDesc.setId(disco.getDiscovererId());
			discoDesc.setSourceType(projectDesc.getClass());
			discoDesc.setImplementationType(discoverer.getClass());
		} else {
			discoDesc.setId(discovery.getCopyOfDiscovererDescription().getId());
			discoDesc.setImplementationBundle(discovery.getCopyOfDiscovererDescription().getImplementationBundle());
			discoDesc.setImplementationType(discovery.getCopyOfDiscovererDescription().getImplementationType());
			discoDesc.setSourceType(discovery.getCopyOfDiscovererDescription().getSourceType());
		}
		disco.setCopyOfDiscovererDescription(discoDesc);
		benchmark.getDiscoveries().add(disco);
		setLaunchParameter(disco, discoverer);
		return disco;
	}

	/**
	 * Finalization of the initialization of the discovery model element after the effective discovery
	 * @param disco
	 * @param discoverer
	 */
	private void postDiscoveryDiscoInit(final Discovery disco,
			final AbstractModelDiscoverer<IProject> discoverer) {
		if (this.iterations > 0) {
			final MathUtils.Resolver<DiscoveryIteration> discoTimeResolver =
					new MathUtils.Resolver<DiscoveryIteration>() {
				public double getValue(final DiscoveryIteration object) {
					return object.getDiscoveryTimeInSeconds();
				}
			};
			disco.setDiscoveryTimeAverageInSeconds(MathUtils.average(
					disco.getIterations(), discoTimeResolver));
			disco.setExecutionTimeStandardDeviation(MathUtils.standardDeviation(
					disco.getIterations(), discoTimeResolver));
			final MathUtils.Resolver<DiscoveryIteration> saveTimeResolver =
					new MathUtils.Resolver<DiscoveryIteration>() {
				public double getValue(final DiscoveryIteration object) {
					return object.getSaveTimeInSeconds();
				}
			};
			disco.setSaveTimeAverageInSeconds(MathUtils.average(
					disco.getIterations(), saveTimeResolver));
			disco.setSaveTimeStandardDeviation(MathUtils.standardDeviation(
					disco.getIterations(), saveTimeResolver));
			disco.setNumberOfModelElements(computeSize(discoverer));
			IFileStore fileStore;
			final URI targetURI = discoverer.getTargetURI();
			final String targetUriStr = targetURI.toString();
			try {
				final IWorkspace workspace = ResourcesPlugin.getWorkspace();
				final IWorkspaceRoot wsRoot = workspace.getRoot();
				final IPath wsLoc = wsRoot.getLocation();
				final String wsLocStr = wsLoc.toString();
				final String locationString = "file://" + wsLocStr + targetUriStr; //$NON-NLS-1$
				final java.net.URI uri = java.net.URI.create(locationString);
				fileStore = EFS.getStore(uri);
				disco.setXmiSizeInBytes(fileStore.fetchInfo().getLength());
			} catch (Exception e) {
				final String message = String.format(
						"Could not get output model size (%s).", targetUriStr); //$NON-NLS-1$
				Logger.logError(e, message, Activator.getDefault());
			}
		}
	}

	/**
	 * Initialize a {@link DiscoveryIteration} after the discovery using the event and memory recorder
	 * @param recoreder {@link EventAndMemoryRecorder}
	 * @return the initialized discovery iteration
	 */
	private static DiscoveryIteration createDiscoveryIteration(
			final EventAndMemoryRecorder recoreder) {
		final DiscoveryIteration discoIter =
				BenchmarkFactory.eINSTANCE.createDiscoveryIteration();
		discoIter.setDiscoveryDate(new Date());
		discoIter.setMaxUsedMemoryInBytes(recoreder.getMaxMemoryUsed());
		discoIter.getEvents().addAll(recoreder.getEvents());
		discoIter.setDiscoveryTimeInSeconds((recoreder.getStopTime() - recoreder.getStartTime()) / MSINSEC);
		for (Event event : recoreder.getEvents()) {
			if (event instanceof EndEvent
					&& event.getEventType().getName().equals(SAVE_OPERATION)) {
				final double saveTime = event.getTime()
						- ((EndEvent) event).getBeginning().getTime();
				discoIter.setSaveTimeInSeconds(saveTime / MSINSEC);
				discoIter.setDiscoveryTimeInSeconds(discoIter.getDiscoveryTimeInSeconds() - discoIter.getSaveTimeInSeconds());
			}
		}
		discoIter.getMemoryMeasurements().addAll(recoreder.getMemoryMeasurements());
		return discoIter;
	}

	/**
	 * Create the model elements for the projects and conaitned files to discover
	 * @param project the real project {@link IProject}
	 * @return the project model element {@link Project}
	 */
	private Project createBenchmarkProjectAndFiles(final IProject project) {
		final Project proj = BenchmarkFactory.eINSTANCE.createProject();
		proj.setName(project.getName());
		try {
			for (IResource res : project.members()) {
				if (res instanceof IFolder) {
					final List<File> files = createFiles((IFolder) res, new LinkedList<File>());
					proj.getFiles().addAll(files);
				} else {
					if (res instanceof IFile) {
						final File file = createFile(res);
						proj.getFiles().add(file);
					}
				}
			}
			if (proj.getFiles().isEmpty()) {
				proj.setAverageFileSizeInBytes(0);
				proj.setTotalSizeInBytes(0);
				proj.setAverageLinesPerFile(0);
				proj.setTotalLines(0);
			} else {
				long totalLineSize = 0;
				long totalByteSize = 0;
				for (File f : proj.getFiles()) {
					totalLineSize += f.getLines();
					totalByteSize += f.getSizeInBytes();
				}
				proj.setAverageFileSizeInBytes(totalByteSize / proj.getFiles().size());
				proj.setTotalSizeInBytes(totalByteSize);
				proj.setAverageLinesPerFile(totalLineSize / getNumberOfSourceCodeFiles(proj));
				proj.setTotalLines(totalLineSize);
			}
		} catch (CoreException e) {
			final String message = String.format(
					"Could not get members of the project '%s'.", //$NON-NLS-1$
					project.getName());
			Logger.logError(e,
					message, Activator.getDefault());
		}
		return proj;
	}

	/**
	 * Count the number of lines is source files.
	 * The source files are identified as having the value of the CODE_EXTENSION constant as extension
	 * @param proj the project to compute the number of lines
	 * @return the number of lines
	 */
	private static long getNumberOfSourceCodeFiles(final Project proj) {
		int number = 0;
		for (File file : proj.getFiles()) {
			//only files having CODE_EXTENSION as extension are measured
			if (file.getLines() == 0) {
				number++;
			}
		}
		return number;
	}

	/**
	 * Initialize the files model elements {@link File} contained in a folder {@link IFolder} to discover.
	 * Recursive method, should be called initially on the project to discover
	 * @param folder
	 * @param files
	 * @return the list of initialized files {@link File}
	 * @throws CoreException
	 */
	private List<File> createFiles(final IFolder folder, final List<File> files) throws CoreException {
		for (IResource res : folder.members()) {
			if (res instanceof IFolder) {
				final List<File> newFiles =
						createFiles((IFolder) res, new LinkedList<File>());
				files.addAll(newFiles);
			} else {
				if (res instanceof IFile) {
					final File file = createFile(res);
					files.add(file);
				}
			}
		}
		return files;
	}

	/**
	 * Initialize a file model element {@link File} from an eclipse resource {@link IResource}
	 * @param res the resource
	 * @return the initialized file
	 * @throws CoreException
	 */
	private static File createFile(final IResource res) throws CoreException {
		final IFileStore fileStore = EFS.getStore(res.getLocationURI());
		final File file = BenchmarkFactory.eINSTANCE.createFile();
		file.setSizeInBytes(fileStore.fetchInfo().getLength());
		file.setFilepath(res.getFullPath().toString());
		file.setLines(getLineNumber(res));
		return file;
	}

	/**
	 * Compute the number of lines in a file having as extension the value of the CODE_EXTENSION constant.
	 * @param res the file to compute the number of lines
	 * @return the number of line if source file 0 otherwise
	 */
	private static long getLineNumber(final IResource res) {
		int lines = 0;
		if (res == null) {
			Logger.logWarning(
					"Unable to compute the number of lines of an unexisting file", //$NON-NLS-1$
					Activator.getDefault());
		} else {
			if (res.getFileExtension() != null
					&& res.getFileExtension().endsWith(CODE_EXTENSION)) {
				try {
					final java.io.File file = res.getLocation().toFile();
					final BufferedReader bReader = new BufferedReader(
							new FileReader(file));
					for (lines = 0; bReader.readLine() != null; lines++);
					bReader.close();
				} catch (Exception e) {
					final String message = String.format(
							"Counting the number of lines is '%s' failed ",  //$NON-NLS-1$
							res.getName());
					Logger.logWarning(e, message, Activator.getDefault());
				}
			}
		}
		return lines;
	}

	/**
	 * @see AbstractModelDiscoverer#isApplicableTo(Object)
	 */
	public boolean isApplicableTo(final IProjectSet sources) {
		boolean result = true;
		for (IProject source : sources.getProjects()) {
			result = result && source.getProject().isAccessible();
		}
		return result;
	}

	/**
	 * Launch the discovery by calling {@link DiscovererBenchmarkDiscoverer#discoverBenchmark(IProjectSet, IProgressMonitor)}
	 * @see AbstractModelDiscoverer#discoverElement(Object, IProgressMonitor)
	 */
	@Override
	protected void basicDiscoverElement(final IProjectSet sources, final IProgressMonitor monitor)
			throws DiscoveryException {
		this.discoverBenchmark(sources, monitor);
	}

	public void setDiscovererID(final IDiscovererID discoId) {
		this.discovererID = discoId;
	}

	public void setSizeDiscovererId(final String sizeDiscovererId) {
		this.sizeDiscovererId = sizeDiscovererId;
	}

	/**
	 * Setter for the number of iterations, annotated with @Parameter set by the UI
	 * @param it number of iterations
	 */
	@Parameter(name = "NUMBER_OF_ITERATIONS", description = "The number of iterations to do.", requiresInputValue = true)
	public void setIterations(final int it) {
		this.iterations = it;
	}

	/**
	 * Setter for memory usage measure, annotated with @Parameter set by the UI
	 * @param measure true if the memory need to be measured
	 */
	@Parameter(name = "MEASURE_MEMORY_USAGE", description = "Tells if the memory usage should be measured or not.", requiresInputValue = true)
	public void setMeasureMemoryUse(final boolean measure) {
		this.measureMemoryUse = measure;
		if (this.measureMemoryUse && this.memPollInterval == 0) {
			this.memPollInterval = INTERVAL;
		}
	}

	/**
	 * Setter for the memory polling interval, annotated with @Parameter set by the UI
	 * @param memoryInterval memory polling interval in milliseconds
	 */
	@Parameter(name = "MEMORY_POLLING_INTERVAL", description = "The time interval between to memory measurement (default value is 1 sec)", requiresInputValue = false)
	public void setMemoryPollingInterval(final int memoryInterval) {
		this.memPollInterval = memoryInterval;
	}

	/**
	 * Setter for the generation of an HTML report, annotated with @Parameter set by the UI
	 * @param generate true if an HTML report is wanted
	 */
	@Parameter(name = "GENERATE_HTML_REPORT", description = "Tells if a html report should be generated.", requiresInputValue = true)
	public void setGenerateHtmlReport(final boolean generate) {
		this.generateHtml = generate;
	}

	/**
	 * Setter for the output model URI, annotated set by the UI
	 * @param the output model URI
	 */
	@Override
	public void setTargetURI(final org.eclipse.emf.common.util.URI targetURI) {
		super.setTargetURI(targetURI);
		super.setTargetModel(this.rSet.createResource(targetURI));
	}

	@Override
	@Parameter(name = "TARGET_URI")
	public org.eclipse.emf.common.util.URI getTargetURI() {
		return super.getTargetURI();
	}

	public IDiscovererID getDiscovererID() {
		return this.discovererID;
	}


	public int getIterations() {
		return this.iterations;
	}

	public boolean isMeasureMemoryUse() {
		return this.measureMemoryUse;
	}

	public int getMemoryPollingInterval() {
		return this.memPollInterval;
	}

	public boolean isGenerateHtmlReport() {
		return this.generateHtml;
	}

	/**
	 * @return the htmlReportLocation
	 */
	public URI getHtmlReportLocation() {
		return this.htmlReportLoc;
	}

	/**
	 * Allow the selection of the HTML report location
	 * @param htmlReportLoc the htmlReportLocation to set
	 */
	@Parameter(name = "HTML_REPORT_LOCATION",
			description = "Tells the location of the HTML report, should be set if GENERATE_HTML_REPORT is true",
			requiresInputValue = false)
	public void setHtmlReportLocation(final URI htmlReportUri) {
		this.htmlReportLoc = htmlReportUri;
	}

}
