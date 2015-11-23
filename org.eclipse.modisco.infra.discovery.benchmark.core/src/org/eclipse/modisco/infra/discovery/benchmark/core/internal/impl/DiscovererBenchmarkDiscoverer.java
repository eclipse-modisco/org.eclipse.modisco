/*******************************************************************************
 * Copyright (c) 2012, 2015 INRIA, and Mia-Software.
 * 
 * All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Guillaume Doux (INRIA) - Initial API and implementation
 *    Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
<<<<<<< HEAD   (b284dc Bug 482715 - NumberFormatException in SystemInfo.computeInfo)
=======
 *    Grégoire Dupé (Mia-Software) - Bug 482857 - Discoverer Benchmark Report : wrong namespaces
>>>>>>> BRANCH (65f5da Bug 482857 - Discoverer Benchmark Report : wrong namespaces)
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IDiscovererBenchmarkDiscoverer;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IDiscovererID;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IEventNotifier;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSet;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.HtmlReport;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.internal.BenchmarkChartGeneration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage;
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

/**
 * Main entry point for the discoverer of benchmark
 * @author Guillaume Doux
 *
 */
public class DiscovererBenchmarkDiscoverer extends AbstractModelDiscoverer<IProjectSet>
implements IDiscovererBenchmarkDiscoverer {

	/**
	 * Private integer constants
	 */
	private static final int ZERO = 0;
	
	private static final int TWO = 2;
	
	private static final int SIX = 6;

	private static final int EIGHT = 8;

	private static final int TEN = 10;

	
	private static final String SAVE_OPERATION = "SaveOperation";

	private static final int INTERVAL = 1000;

	private static final int MSINSEC = 1000;

	private static final String CODE_EXTENSION = "java";

	public static final String ID = "org.eclipse.modisco.infra.discovery.benchmark.core.api.benchmarkdiscoverer";

	private static final long BYTEPERMB = 1024 * 1024;

	private IDiscovererID discovererID;
	private int iterations;
	private boolean measureMemoryUse;
	private int memoryPollingInterval;
	private boolean generateHtmlReport;
	private URI htmlReportLocation;

	private EventAndMemoryRecorder recorder;
	private List<MemoryMeasurement> memoryMeasurements;
	private List<Event> events;

	private ResourceSet rSet;


	public DiscovererBenchmarkDiscoverer() {
		super();
		this.discovererID = new DiscovererID(ID);
		this.memoryPollingInterval = 0;
		this.memoryMeasurements = new LinkedList<MemoryMeasurement>();
		this.events = new LinkedList<Event>();
		this.rSet = new ResourceSetImpl();
		this.rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", 
				new XMIResourceFactoryImpl());
		this.iterations = 1;
	}

	/**
	 * Parameter for getting the dicoverers
	 */
	private IDiscovererList discoverers;


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
	public Resource discoverBenchmark(final IProjectSet projects, final IProgressMonitor progressMonitor) throws DiscoveryException {
		progressMonitor.beginTask("Benchmark Discovery", TEN);
		progressMonitor.subTask("Benchmark initialization");
		Benchmark benchmark;
		benchmark = benchmarkInit();
		progressMonitor.worked(TWO);
		this.recorder =  new EventAndMemoryRecorder(this.measureMemoryUse, this.memoryPollingInterval);

		for (IProject project : projects.sortBySize().getProjects()) {
			progressMonitor.subTask("project initialization");
			Project proj = createBenchmarkProjectAndFiles(project);
			benchmark.getProjects().add(proj);

			for (Discovery discoTemp : this.discoverers) {
				progressMonitor.subTask("Discovery initialization");
				Discovery disco = BenchmarkFactory.eINSTANCE.createDiscovery();
				String discovererId = discoTemp.getDiscovererId();
				AbstractModelDiscoverer<IProject> discoverer = (AbstractModelDiscoverer<IProject>) IDiscoveryManager.INSTANCE.createDiscovererImpl(discovererId);
				benchmark.getDiscoveries().add(disco);
				preDiscoveryDiscoInit(proj, disco, discoTemp, (AbstractModelDiscoverer<IProject>) discoverer, discovererId);
				setLaunchParameter(disco, discoverer);
				String serializationLocation;
				if (discoverer.getTargetURI() != null) {
					serializationLocation = discoverer.getTargetURI().trimFileExtension().toString();
				} else {
					serializationLocation = this.getTargetURI().trimFileExtension().toString();
				}
				for (int i = 1; i <= this.iterations;  i++) {
					URI resultSerializationLocation =  URI.createURI(serializationLocation);
					discoverer.setTargetURI(resultSerializationLocation.appendSegment(disco.getDiscovererId() + "_" + proj.getName() + "_iteration_" + String.valueOf(i) + ".xmi"));
					boolean failure = false;
					StringBuilder discoveryErrors = new StringBuilder();
					this.recorder.reset();
					if (IEventNotifier.class.isInstance(discoverer)) {
						((IEventNotifier) discoverer).addListener(this.recorder);
					}
					progressMonitor.subTask("Project discovery: iteration " + String.valueOf(getIterations()));
					this.recorder.start();
					try {
						if (discoverer.isApplicableTo(project)) {
							IProgressMonitor subProgressMonitor = new SubProgressMonitor(progressMonitor, EIGHT);
							discoverer.discoverElement(project, subProgressMonitor);
						} else {
							final String message = String.format(
									"Discoverer '%s' is not applicable on project '%s'", //$NON-NLS-1$
									discovererId,
									project.getName()
									);
							MoDiscoLogger.logWarning(
									message, Activator.getDefault());
						}
					} catch (Exception e) {
						failure = true;
						discoveryErrors.append(e.getStackTrace().toString());
						final String message = String.format(
								"Benchmark of discoverer '%s' fails on project '%s'", //$NON-NLS-1$
								discovererId,
								project.getName()
								);
						MoDiscoLogger.logError(e,
								message, Activator.getDefault());
					}
					this.recorder.stop();
					this.events.addAll(this.recorder.getEvents());
					this.events.addAll(this.recorder.getMemoryMeasurements());
					this.memoryMeasurements.addAll(this.recorder.getMemoryMeasurements());
					if (IEventNotifier.class.isInstance(discoverer)) {
						((IEventNotifier) discoverer).removeListener(this.recorder);
					}
					DiscoveryIteration discoveryIteration = createDiscoveryIteration(this.recorder);
					if (failure) {
						discoveryIteration.setDiscoveryErrors(discoveryErrors.toString());
					}
					disco.getIterations().add(discoveryIteration);
				}
				postDiscoveryDiscoInit(disco, discoverer);
				if (this.isTargetSerializationChosen()) {
					try {
						saveTargetModel(benchmark);
					} catch (IOException e) {
						MoDiscoLogger.logError(e,
								"Intermediate model save fail", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault()); //$NON-NLS-1$
					}
				}
			}
		}
		benchmark.setJvmMaxHeapInMiB(computeMaxMemoryUsage());
		try {
			if (this.isTargetSerializationChosen()) {
				progressMonitor.subTask("Save benchmark model");
				saveTargetModel(benchmark);
				progressMonitor.worked(getIterations() * projects.getProjects().size() * this.discoverers.getDiscoverers().size()); //1*iteration*discoveries*projects for disco init on 20*iteration*discoveries*projects
			}
			if (isGenerateHtmlReport()) {
				progressMonitor.subTask("Generate benchmark report");
				IProgressMonitor subProgressM = new SubProgressMonitor(progressMonitor, SIX);
				generateHtmlReport(subProgressM, benchmark);
				progressMonitor.worked(2 * getIterations() * projects.getProjects().size() * this.discoverers.getDiscoverers().size()); //2*iteration*discoveries*projects for disco init on 20*iteration*discoveries*projects
			}
		} catch (IOException e) {
			MoDiscoLogger.logError(e,
					"Report generation fail", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault()); //$NON-NLS-1$
		} catch (CoreException e) {
			MoDiscoLogger.logError(e,
					"Report generation fail", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault()); //$NON-NLS-1$
		} catch (Exception e) {
			MoDiscoLogger.logError(e,
					"Report generation fail", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault()); //$NON-NLS-1$
		}


		progressMonitor.done();
		return benchmark.eResource();
	}

	/**
	 * Compute the size of the model in parameter (in number of model elements)
	 * @param targetModel
	 * @return the number of model elements
	 */
	private long computeSize(final Resource targetModel) {
		long size = 0;
		if (targetModel != null) {
			for (TreeIterator<EObject> iterator = targetModel.getAllContents(); iterator.hasNext();) {
				iterator.next();
				size++;
			}
		} else {
			MoDiscoLogger.logWarning("Unable to compute the number of element of an unexisting model: "+targetModel.getURI().toString(), Activator.getDefault());
		}
		return size;
	}

	/**
	 * launch the generation of the HTML report and the charts for the benchmark model in parameter
	 * @param progressMonitor
	 * @param benchmark
	 * @throws Exception
	 */
	private void generateHtmlReport(final IProgressMonitor progressMonitor,
			final Benchmark benchmark) throws Exception {
		//Get the output folder
		URI targetURI = null;
		if (this.getHtmlReportLocation() != null) {
			targetURI = this.getHtmlReportLocation();
		} else {
			targetURI = this.getTargetURI();
		}
		if (targetURI == null) {
			MoDiscoLogger.logWarning(
					"The HTML_REPORT_LOCATION or the TARGET_URI parameter should not be null", //$NON-NLS-1$
					Activator.getDefault());
			return;
		}
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot wsRoot = workspace.getRoot();
		java.io.File file = null;
		IFile iFile = null;
		String targetUriStr = targetURI.toString();
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
		try {
			HtmlReport report = new HtmlReport(benchmark, file, arguments);
			report.doGenerate(null);
		} catch (Exception e) {
			MoDiscoLogger.logWarning(e,
					"Acceleo exception", //$NON-NLS-1$
					Activator.getDefault());
		}
		//Generation of the charts
		final BenchmarkChartGeneration chartGenerator = 
				new BenchmarkChartGeneration(file, this.measureMemoryUse);
		chartGenerator.generateAll(benchmark);

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
		if (disco.getDiscovererLaunchConfiguration() != null) {
			for (ParameterValue pv : disco.getDiscovererLaunchConfiguration().getParameterValues()) {
				DiscovererParameter parameter = pv.getParameter();
				Object value = pv.getValue();
				if (value != null) {
					try {
						if (parameter.getSetter() == null) {
							parameter.setSetter(findSetter(discoverer.getClass(), parameter.getId()));
						}
						this.setValue(parameter, discoverer, value);
					} catch (DiscoveryException e) {
						MoDiscoLogger.logWarning(e, e.getMessage(), Activator.getDefault());
					}

				}
			}
		}
	}

	/**
	 * Find the setter of identifier id in the class clazz
	 * use java reflexion
	 * @param clazz
	 * @param id
	 * @return the setter
	 */
	private Method findSetter(final Class<? extends AbstractModelDiscoverer> clazz,
			final String id) {
		for (Method method : clazz.getMethods()) {
			if (method.isAnnotationPresent(Parameter.class)) {
				Parameter p = method.getAnnotation(Parameter.class);
				if (p.name().equals(id)) {
					if (method.getReturnType().equals(void.class)) {
						return method;
					}
				}
			}
		}
		return null;
	}


	/**
	 * method to set the values of parameters: extracted from DiscoveryManager (org.eclipse.modisco.infra.discovery.core.internal)
	 * @param parameter
	 * @param discoverer
	 * @param parameterValue
	 * @throws DiscoveryException
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.modisco.infra.discovery.core.catalog.IDiscoveryManager#setValue
	 * (org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter,
	 * org.eclipse.modisco.infra.discovery.core.IDiscoverer, java.lang.Object)
	 */
	private void setValue(final DiscovererParameter parameter, final IDiscoverer<?> discoverer,
			final Object parameterValue) throws DiscoveryException {
		try {
			if (parameter.getField() != null
					&& Modifier.isPublic(parameter.getField().getModifiers())) {
				parameter.getField().set(discoverer, parameterValue);
			} else if (parameter.getSetter() != null
					&& Modifier.isPublic(parameter.getSetter().getModifiers())) {
				parameter.getSetter().invoke(discoverer, parameterValue);
			} else {
				throw new DiscoveryException(discoverer.getClass()
						+ " discoverer does not implement public write access to the parameter " //$NON-NLS-1$
						+ parameter.getId());
			}
		} catch (IllegalArgumentException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId() + " : " + parameterValue, e); //$NON-NLS-1$
		} catch (IllegalAccessException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId() + " : " + parameterValue, e); //$NON-NLS-1$
		} catch (InvocationTargetException e) {
			throw new DiscoveryException("Illegal parameter value for " //$NON-NLS-1$
					+ parameter.getId() + " : " + parameterValue, e); //$NON-NLS-1$
		}

	}

	/**
	 * Save the benchmark model in an XMI file
	 * @param benchmark
	 * @throws IOException
	 */
	private void saveTargetModel(final Benchmark benchmark) throws IOException {
		if ((this.getTargetURI() == null) && (this.getTargetModel() == null)) {
			MoDiscoLogger.logWarning("The parameter TARGET_URI should not be empty", Activator.getDefault());
			return;
		}		
		if (benchmark.eResource() == null) {

			Resource res = null;
			if (getTargetModel() == null) {
				res = this.rSet.createResource(getTargetURI());
			} else {
				res = this.rSet.createResource(getTargetModel().getURI());
			}
			res.getContents().add(benchmark);
			List<Event> eventsList = new ArrayList<Event>();
			List<EventType> eventTypeList = new ArrayList<EventType>();
			for (Discovery d : benchmark.getDiscoveries()) {
				for (DiscoveryIteration i : d.getIterations()) {
					for (Event event : i.getEvents()) {
						eventsList.add(event);
						eventTypeList.add(event.getEventType());
					}
				}
			}
//			res.getContents().addAll(eventsList);
			res.getContents().addAll(eventTypeList);
			this.setTargetModel(res);
		}

		this.saveTargetModel();
	}

	/**
	 * Compute the maximum amount of memory used in the discovery
	 * @return max memory used
	 */
	private long computeMaxMemoryUsage() {
		long max = 0;
		for (MemoryMeasurement measure : this.memoryMeasurements) {
			if (max < measure.getMemoryUsed()) {
				max = measure.getMemoryUsed();
			}
		}
		return max;
	}

	/**
	 * Initialize the benchmark model element with system information
	 * @return the model element
	 */
	private Benchmark benchmarkInit() {

		Benchmark benchmark = BenchmarkFactory.eINSTANCE.createBenchmark();
		try {
			SystemInfo sysInfo = SystemInfo.getInstance();
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
			MoDiscoLogger.logError(e,
					"Could not get system information for benchmark", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault()); //$NON-NLS-1$
		}
		return benchmark;
	}

	/**
	 * Initialize the discovery model element before launchin the associated discoverer
	 * @param proj the model element for project that will be discovered
	 * @param disco the model element to initialize
	 * @param discoT the model element representing the information concerning the discovery in the launch configuration
	 * @param discoverer the real discoverer {@link AbstractModelDiscoverer}
	 * @param discovererId the discoverer id
	 */
	private void preDiscoveryDiscoInit(final Project proj, final Discovery disco, final Discovery discoT, final AbstractModelDiscoverer<IProject> discoverer, final String discovererId) {
		disco.setProject(proj);
		disco.setName(discoverer.toString());
		disco.setDiscovererClassName(discoverer.getClass().getName());
		disco.setDiscovererId(discovererId);
		DiscovererDescription dd = CatalogFactory.eINSTANCE.createDiscovererDescription();		
		if (discoT.getDiscovererLaunchConfiguration() != null) {
			LaunchConfiguration lc = LaunchFactory.eINSTANCE.createLaunchConfiguration();
			lc.setSource(proj.getName());
			lc.setDiscoverer(dd);
			lc.setOpenModelAfterDiscovery(discoT.getDiscovererLaunchConfiguration().isOpenModelAfterDiscovery());
			for (ParameterValue pv : discoT.getDiscovererLaunchConfiguration().getParameterValues()) {
				ParameterValue newPv = LaunchFactory.eINSTANCE.createParameterValue();
				newPv.setValue(pv.getValue());

				DiscovererParameter param = CatalogFactory.eINSTANCE.createDiscovererParameter();
				param.setDescription(pv.getParameter().getDescription());
				param.setDirection(pv.getParameter().getDirection());
				param.setDiscoverer(dd);
				param.setField(pv.getParameter().getField());
				param.setGetter(pv.getParameter().getGetter());
				param.setId(pv.getParameter().getId());
				param.setInitializer(pv.getParameter().getInitializer());
				param.setRequiredInput(pv.getParameter().isRequiredInput());
				param.setSetter(pv.getParameter().getSetter());
				param.setType(pv.getParameter().getType());

				newPv.setParameter(param);
				lc.getParameterValues().add(newPv);
			}
			disco.setDiscovererLaunchConfiguration(lc);
		}
		if (discoT.getCopyOfDiscovererDescription() == null) {
			dd.setId(disco.getDiscovererId());
			dd.setSourceType(proj.getClass());
			dd.setImplementationType(discoverer.getClass());
		} else {
			dd.setId(discoT.getCopyOfDiscovererDescription().getId());
			dd.setImplementationBundle(discoT.getCopyOfDiscovererDescription().getImplementationBundle());
			dd.setImplementationType(discoT.getCopyOfDiscovererDescription().getImplementationType());
			dd.setSourceType(discoT.getCopyOfDiscovererDescription().getSourceType());
		}
		disco.setCopyOfDiscovererDescription(dd);
	}

	/**
	 * Finalization of the initialization of the discovery model element after the effective discovery
	 * @param disco
	 * @param discoverer
	 */
	private void postDiscoveryDiscoInit(final Discovery disco, final AbstractModelDiscoverer<IProject> discoverer) {
		double totalDiscoveryTime = 0;
		double totalSaveTime = 0;
		if (this.iterations > 0) {
			double maxDisco = 0;
			double maxSave = 0;
			double minDisco = disco.getIterations().get(0).getDiscoveryTimeInSeconds();
			double minSave = disco.getIterations().get(0).getSaveTimeInSeconds();
			for (DiscoveryIteration iter : disco.getIterations()) {
				totalSaveTime += iter.getSaveTimeInSeconds();
				totalDiscoveryTime += iter.getDiscoveryTimeInSeconds();
				if (iter.getDiscoveryTimeInSeconds() > maxDisco) {
					maxDisco = iter.getDiscoveryTimeInSeconds();
				}
				if (iter.getSaveTimeInSeconds() > maxSave) {
					maxSave = iter.getSaveTimeInSeconds();
				}
				if (iter.getDiscoveryTimeInSeconds() < minDisco) {
					minDisco = iter.getDiscoveryTimeInSeconds();
				}
				if (iter.getSaveTimeInSeconds() < minSave) {
					minSave = iter.getSaveTimeInSeconds();
				}
			}
			disco.setDiscoveryTimeAverageInSeconds(totalDiscoveryTime / this.iterations);
			disco.setSaveTimeAverageInSeconds(totalSaveTime / this.iterations);
			disco.setExecutionTimeStandardDeviation(maxDisco - minDisco);
			disco.setSaveTimeStandardDeviation(maxSave - minSave);

			disco.setNumberOfModelElements(computeSize(discoverer.getTargetModel()));

			IFileStore fileStore;
			try {
				URI targetURI = discoverer.getTargetURI();
				String locationString = "file://" + ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + targetURI.toString();
				java.net.URI uri = java.net.URI.create(locationString);
				fileStore = EFS.getStore(uri);
				disco.setXmiSizeInBytes(fileStore.fetchInfo().getLength());
			} catch (Exception e) {
				MoDiscoLogger.logError(e,
						"Could not get output model size.", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault()); //$NON-NLS-1$
			}

		}
	}

	/**
	 * Initialize a {@link DiscoveryIteration} after the discovery using the event and memory recorder
	 * @param rec {@link EventAndMemoryRecorder}
	 * @return the initialized discovery iteration
	 */
	private DiscoveryIteration createDiscoveryIteration(final EventAndMemoryRecorder rec) {
		DiscoveryIteration discoIter = BenchmarkFactory.eINSTANCE.createDiscoveryIteration();
		discoIter.setDiscoveryDate(new Date());
		discoIter.setMaxUsedMemoryInBytes(rec.getMaxMemoryUsed());
		discoIter.getEvents().addAll(rec.getEvents());
		discoIter.setDiscoveryTimeInSeconds((rec.getStopTime() - rec.getStartTime()) / MSINSEC);
		for (Event event : rec.getEvents()) {
			if (event instanceof EndEvent) {
				if (event.getEventType().getName().equals(SAVE_OPERATION)) {
					double saveTime = event.getTime() - ((EndEvent) event).getBeginning().getTime();
					discoIter.setSaveTimeInSeconds(saveTime / MSINSEC);
					discoIter.setDiscoveryTimeInSeconds(discoIter.getDiscoveryTimeInSeconds() - discoIter.getSaveTimeInSeconds());
				}
			}
		}
		discoIter.getMemoryMeasurements().addAll(rec.getMemoryMeasurements());			
		return discoIter;
	}

	/**
	 * Create the model elements for the projects and conaitned files to discover
	 * @param project the real project {@link IProject}
	 * @return the project model element {@link Project}
	 */
	private Project createBenchmarkProjectAndFiles(final IProject project) {
		Project proj = BenchmarkFactory.eINSTANCE.createProject();
		proj.setName(project.getName());
		try {
			for (IResource res : project.members()) {
				if (res instanceof IFolder) {
					proj.getFiles().addAll(createFiles((IFolder) res, new LinkedList<File>()));
				} else {
					if (res instanceof IFile) {
						File f = createFile(res);
						proj.getFiles().add(f);
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
			MoDiscoLogger.logError(e,
					"Could not get members of project", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault()); //$NON-NLS-1$
		}
		return proj;
	}

	/**
	 * Count the number of lines is source files.
	 * The source files are identified as having the value of the CODE_EXTENSION constant as extension
	 * @param proj the project to compute the number of lines
	 * @return the number of lines
	 */
	private long getNumberOfSourceCodeFiles(final Project proj) {
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
				files.addAll(createFiles((IFolder) res, new LinkedList<File>()));
			} else {
				if (res instanceof IFile) {
					File f = createFile(res);
					files.add(f);
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
	private File createFile(final IResource res) throws CoreException {
		IFileStore fileStore = EFS.getStore(res.getLocationURI());
		File f = BenchmarkFactory.eINSTANCE.createFile();
		f.setSizeInBytes(fileStore.fetchInfo().getLength());
		f.setFilepath(res.getFullPath().toString());
		f.setLines(getLineNumber(res));
		return f;
	}

	/**
	 * Compute the number of lines in a file having as extension the value of the CODE_EXTENSION constant.
	 * @param res the file to compute the number of lines
	 * @return the number of line if source file 0 otherwise
	 */
	private long getLineNumber(final IResource res) {
		int lines = 0;
		if (res == null) {
			MoDiscoLogger.logWarning("Unable to compute the number of lines of an unexisting file", Activator.getDefault());
		} else {
			if (res.getFileExtension() != null) {
				if (res.getFileExtension().endsWith(CODE_EXTENSION)) {
					try {
						java.io.File f = new java.io.File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + res.getFullPath().toString());
						BufferedReader br = new BufferedReader(new FileReader(f));
						for (lines = 0; br.readLine() != null; lines++);
						br.close();
					} catch (IOException e) {
						MoDiscoLogger.logWarning(e, "unable to count the number of lines of " + res.getName(), Activator.getDefault()); 
					} catch (NullPointerException e) {
						MoDiscoLogger.logWarning(e, "unable to count the number of lines of " + res.getName(), Activator.getDefault());
					}
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

	public EventAndMemoryRecorder getRecorder() {
		return this.recorder;
	}


	public void setRecorders(final EventAndMemoryRecorder rec) {
		this.recorder = rec;
	}

	public void setDiscovererID(final IDiscovererID discoId) {
		this.discovererID = discoId;
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
		if (this.measureMemoryUse) { //putting a default value in case of bad initialization
			if (this.memoryPollingInterval == ZERO) {
				this.memoryPollingInterval = INTERVAL;
			}
		}
	}

	/**
	 * Setter for the memory polling interval, annotated with @Parameter set by the UI
	 * @param memoryInterval memory polling interval in milliseconds
	 */
	@Parameter(name = "MEMORY_POLLING_INTERVAL", description = "The time interval between to memory measurement (default value is 1 sec)", requiresInputValue = false)
	public void setMemoryPollingInterval(final int memoryInterval) {
		this.memoryPollingInterval = memoryInterval;
	}

	/**
	 * Setter for the generation of an HTML report, annotated with @Parameter set by the UI
	 * @param generate true if an HTML report is wanted
	 */
	@Parameter(name = "GENERATE_HTML_REPORT", description = "Tells if a html report should be generated.", requiresInputValue = true)
	public void setGenerateHtmlReport(final boolean generate) {
		this.generateHtmlReport = generate;
	}

	/**
	 * Setter for the output model URI, annotated set by the UI
	 * @param the output model URI
	 */
	public void setTargetURI(final org.eclipse.emf.common.util.URI targetURI) {
		super.setTargetURI(targetURI);
		super.setTargetModel(this.rSet.createResource(targetURI));
	}

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
		return this.memoryPollingInterval;
	}

	public boolean isGenerateHtmlReport() {
		return this.generateHtmlReport;
	}

	/**
	 * @return the htmlReportLocation
	 */
	public URI getHtmlReportLocation() {
		return this.htmlReportLocation;
	}

	/**
	 * Allow the selection of the HTML report location
	 * @param htmlReportLocation the htmlReportLocation to set
	 */
	@Parameter(name = "HTML_REPORT_LOCATION", description = "Tells the location of the HTML report, should be set if GENERATE_HTML_REPORT is true", requiresInputValue = false)
	public void setHtmlReportLocation(final URI htmlReportLocationParam) {
		this.htmlReportLocation = htmlReportLocationParam;
	}

}
