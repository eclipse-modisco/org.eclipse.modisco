/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow.mwe.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.WorkflowModelEvents;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Direction;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Work;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameter;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.WorkflowImpl;
import org.eclipse.gmt.modisco.workflow.mwe.Activator;
import org.eclipse.gmt.modisco.workflow.mwe.Constants;
import org.eclipse.gmt.modisco.workflow.mwe.Messages;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentMinimalist;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowFactory;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationFactory;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimeFactory;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimeFactoryImpl;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowParameterMapImpl;

/**
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowModelImpl extends WorkflowImpl implements WorkflowModel {
	
	private final WorkflowModelNotifier notifier = new WorkflowModelNotifier();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModelEventsSubscribe#subscribe(
	 * org.eclipse.debug.ui.workflow.WorkflowModelEvents)
	 */
	public void subscribe(final WorkflowModelEvents listener) {
		this.notifier.subscribe(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowModelEventsSubscribe#unsubscribe
	 * (org.eclipse.debug.ui.workflow.WorkflowModelEvents)
	 */
	public void unsubscribe(final WorkflowModelEvents listener) {
		this.notifier.unsubscribe(listener);
	}
	
	private org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow workflow;
	private ResourceSet resSet;
	private Resource resource;
	private IPath currentPath;

	public WorkflowModelImpl() {
		// Obtain a new resource set
		this.resSet = new ResourceSetImpl();
	}


	public void save(final ILaunchConfigurationWorkingCopy configuration,
			final boolean onlyLaunch) {
		// Now save the content.
		if (configuration != null) {
			configuration.setAttribute(
					Constants.resourcePath,
					this.currentPath.toString());
			List<Element> moDiscoList = this.getAllElements();
			configuration.setAttribute(
					Constants.moDiscoWorkNumber,
					moDiscoList.size());
			configuration.setAttribute(
					Constants.moDiscoListSerialize,
					listOrchestration(moDiscoList));
		}
		if (!onlyLaunch) {
			try {
				this.resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
	}

	private List<String> listOrchestration(final List<Element> moDiscoWorkList) {
		List<String> tmpList = new ArrayList<String>();
		for (Element modisco : moDiscoWorkList) {
			tmpList.add(modisco.getName()
					+ ";" + modisco.getIndex() + ";" + modisco.getType()); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return tmpList;
	}

	/**
	 * Allows to list the engines containing a component given
	 * 
	 * @param component
	 *            Found component
	 * @param engines
	 *            Initial engines list
	 * @return Engine list containing the component
	 */
	private List<WorkflowEngine> engineListContainingComponent(
			final WorkflowComponent component,
			final List<WorkflowEngine> engines) {
		List<WorkflowEngine> enginesFind = new ArrayList<WorkflowEngine>();
		for (WorkflowEngine engine : engines) {
			if (!(engine instanceof WorkflowEngineProxy)) {
				if (engine.getWorkflow().equals(component)) {
					enginesFind.add(engine);
				}
				List<WorkflowEngine> enginesFind2 = engineListContainingComponent(
						component, engine.getEngines());
				if (enginesFind2.size() > 0) {
					enginesFind.addAll(enginesFind2);
				}
			}
		}
		return enginesFind;
	}


	public void moveResource(final String path) {
		if (!path.equals(this.currentPath)) {
			String newName = new File(path).getName();
			renameWorkflow(newName.substring(0, newName.lastIndexOf("."))); //$NON-NLS-1$
			URI uri = URI.createFileURI(path);
			this.resource.setURI(uri);
			save(null, false);
			File f = this.currentPath.toFile();
			if (f.exists()) {
				f.delete();
			}
			this.currentPath = new Path(path);
		}
	}

	public void removeResource(final String resourcePath) {
		if (resourcePath.equals(this.currentPath)) {
			try {
				this.resource.delete(Collections.EMPTY_MAP);
			} catch (IOException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
	}

	/**
	 * Allows to create a WorkflowParameter
	 * 
	 * @param configurationName
	 *            Parameter name
	 * @param description
	 *            Description of parameter
	 * @param required
	 *            If the parameter is required
	 * @param configurationType
	 *            Parameter type
	 * @return Parameter created
	 */
	private WorkflowParameter createWorkflowParameter(final String configurationName,
			final Direction direction, final String configurationType,
			final boolean required, final String description) {
		WorkflowParameter param = WorkflowFactory.eINSTANCE
				.createWorkflowParameter();
		param.setName(configurationName);
		switch (direction.getValue()) {
		case 0:
			param.setDirection(org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction.IN);
			break;
		case 1:
			param.setDirection(org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction.OUT);
			break;
		case 2:
			param.setDirection(org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction.INOUT);
			break;

		default:
			break;
		}
		param.setType(configurationType);
		param.setRequired(required);
		param.setDescription(description);
		param.setValueStrategy(WorkflowFactory.eINSTANCE
				.createWorkflowParameterValueStrategy());
		return param;
	}

	/**
	 * Allows to find a context in a engine list from a component.
	 * 
	 * @param component
	 *            The component for which we look for the context
	 * @param engines
	 *            The engine list
	 * @return Return found context or null
	 */
	private WorkflowContext findContextInEngineList(
			final WorkflowComponent component,
			final List<WorkflowEngine> engines) {
		WorkflowContext context = null;
		for (WorkflowEngine engine : engines) {
			if (engine instanceof WorkflowEngineProxy) {
				engine = ((WorkflowEngineProxy) engine).getTargetEngine();
			}
			if (engine.getWorkflow().equals(component)) {
				context = engine.getContext();
				break;
			}
			if (engine.getEngines() != null) {
				context = findContextInEngineList(component, engine
						.getEngines());
				if (context != null) {
					break;
				}
			}
		}
		return context;
	}

	/**
	 * Allows to copy a file
	 * 
	 * @param pathFile1
	 *            Source file
	 * @param pathFile2
	 *            Destination file
	 */
	private void copyFile(final String pathFile1, final String pathFile2) {
		FileChannel in = null;
		FileChannel out = null;
		try {
			in = new FileInputStream(pathFile1).getChannel();
			out = new FileOutputStream(pathFile2).getChannel();
			in.transferTo(0, in.size(), out);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
		}
	}

	/**
	 * Allows to know if the user create or duplicate a launch configuration of
	 * MoDiscoWorkflow
	 * 
	 * @param configuration
	 *            Launch configuration of MoDiscoWorkflow
	 * @param path
	 *            Path of resource ".workflow"
	 */
	private void caseOfDuplication(final ILaunchConfiguration configuration, final IPath path) {
		try {
			String configurationResourcePath = configuration.getAttribute(
					Constants.resourcePath, (String) null);
			/*
			 * Case of duplication launcher There is duplication if the path of
			 * the new configuration is not equal to the path of the
			 * configuration old and it is not null. Path is null when user
			 * create a new configuration of MoDiscoWorkflow
			 */
			if (configurationResourcePath != null) {
			//		&& !configurationResourcePath.equals(path)) {
				IPath configurationPath = new Path(configurationResourcePath);
				if (!configurationPath.equals(path)) {
				File f1 = configurationPath.toFile();
				File f2 = path.toFile();
				if (f1.exists() && !f2.exists()) {
					copyFile(f1.getAbsolutePath(), f2.getAbsolutePath());
				}
				}
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	/**
	 * Allows to create an element from a WorkflowComponent
	 * 
	 * @param component
	 *            The workflowComponent
	 * @return a new MoDiscoWork
	 */
	private Element createElementFromComponent(final WorkflowEngine engine,
			final int indexSelected, final boolean engineDeletedParameter) {
		boolean engineDeleted = engineDeletedParameter;
		Element modisco = null;
		WorkflowComponent component = engine.getWorkflow();
		if (!engineDeleted) {
			if (component instanceof WorkflowComponentProxy) {
				component = ((WorkflowComponentProxy) component)
						.getTargetComponent();
			}
			if (component instanceof WorkflowCompositeComponent) {
				modisco = ModiscoworkflowFactory.eINSTANCE.createWorkflow();
				int ind = 0;
				for (WorkflowEngine eng : engine.getEngines()) {
					boolean engineDel = false;
					if (eng instanceof WorkflowEngineProxy) {
						WorkflowEngine targetEngine = ((WorkflowEngineProxy) eng)
								.getTargetEngine();
						if (targetEngine.getWorkflow() == null) {
							engineDeleted = true;
						} else {
							eng = targetEngine;
						}
					}
					((Workflow) modisco).getElements().add(
							createElementFromComponent(eng, ind, engineDel));
					ind++;
				}
			} else if (component instanceof WorkflowUnitOfWork) {
				modisco = ModiscoworkflowFactory.eINSTANCE.createWork();
				((Work) modisco).getParameters().addAll(
						createWorkParametersFromComponent(engine));
			} else if (component instanceof WorkflowComponentMinimalist) {
				modisco = ModiscoworkflowFactory.eINSTANCE.createWorkflow();
			} else {
				throw new RuntimeException("Unexpected component type"); //$NON-NLS-1$
			}
		} else {
			modisco = ModiscoworkflowFactory.eINSTANCE.createWork();
		}
		modisco.setIndex(indexSelected);
		modisco.setName(component.getName());
		modisco.setType(component.getType());
		return modisco;
	}

	/**
	 * ALlows to create a MoDiscoWorkParameter list from a WorkflowComponent
	 * 
	 * @param engine
	 *            Engine containing the WorkflowComponent
	 * @return A MoDiscoWorkParameter list
	 */
	private Collection<? extends WorkParameter> createWorkParametersFromComponent(
			final WorkflowEngine engine) {
		List<WorkParameter> modiscoWorkParameterList = new ArrayList<WorkParameter>();
		List<WorkflowParameter> parameters = new ArrayList<WorkflowParameter>();
		WorkflowComponent component = engine.getWorkflow();
		Copier copier = new Copier();
		if (component instanceof WorkflowCompositeComponent) {
			parameters = ((WorkflowCompositeComponent) component)
					.getParameters();
		} else {
			if (component instanceof WorkflowUnitOfWork) {
				parameters = ((WorkflowUnitOfWork) component).getParameters();
			}
		}
		for (WorkflowParameter parameter : parameters) {
			WorkParameter modiscoWorkParameter = ModiscoworkflowFactory.eINSTANCE
					.createWorkParameter();
			modiscoWorkParameter.setDescription(parameter.getDescription());
			switch (parameter.getDirection().getValue()) {
			case 0:
				modiscoWorkParameter.setDirection(Direction.IN);
				break;
			case 1:
				modiscoWorkParameter.setDirection(Direction.OUT);
				break;
			case 2:
				modiscoWorkParameter.setDirection(Direction.INOUT);
				break;

			default:
				break;
			}
			modiscoWorkParameter.setName(parameter.getName());
			modiscoWorkParameter.setRequired(parameter.isRequired());
			modiscoWorkParameter.setType(parameter.getType());
			modiscoWorkParameter.setValue((WorkParameterValue) copier
					.copy(engine.getContext().getParameters().get(parameter)));
			modiscoWorkParameterList.add(modiscoWorkParameter);
		}
		return modiscoWorkParameterList;
	}

	/**
	 * Allows to find a component in a engine list from an element.
	 * 
	 * @param elmt
	 *            Looked element
	 * @param engines
	 *            Engine list
	 * @return Return found element or null
	 */
	private WorkflowComponent findElementInEngineList(final Element elmt,
			final List<WorkflowEngine> engines) {
		WorkflowComponent componentFind = null;
		for (WorkflowEngine engine : engines) {
			if (engine instanceof WorkflowEngineProxy) {
				engine = ((WorkflowEngineProxy) engine).getTargetEngine();
			}
			if (engine.getWorkflow().getName().equals(elmt.getName())) {
				componentFind = engine.getWorkflow();
				break;
			}
			componentFind = findElementInEngineList(elmt, engine.getEngines());
			if (componentFind != null) {
				break;
			}
		}
		return componentFind;
	}

	/**
	 * Allows to create a WorkflowComponent from element
	 * 
	 * @param modiscoElement
	 *            Source element to create a WorkflowComponent
	 * @param engineParent
	 *            Engine parent containing the future engine
	 * @param tmpEngineAdd
	 *            Engines work-in-process
	 * @return Return created workflow component
	 */
	private WorkflowComponent createWorkflowComponentFromElement(
			final Element modiscoElement, final WorkflowEngine engineParent,
			final List<WorkflowEngine> tmpEngineAdd) {
		WorkflowComponent component = null;
		WorkflowContext context = RuntimeFactory.eINSTANCE
				.createWorkflowContext();
		Copier copier = new Copier();
		component = WorkflowFactory.eINSTANCE.createWorkflowUnitOfWork();
		// Create all parameters and entryMap
		List<WorkParameter> paramList = ((Work) modiscoElement).getParameters();
		if (paramList != null) {
			for (WorkParameter parameter : paramList) {
				WorkflowParameter param = createWorkflowParameter(parameter
						.getName(), parameter.getDirection(), parameter
						.getType(), parameter.isRequired(),
						"DESC_" + parameter.getDescription()); //$NON-NLS-1$
				if (component instanceof WorkflowCompositeComponent) {
					((WorkflowCompositeComponent) component).getParameters()
							.add(param);
				} else {
					((WorkflowUnitOfWork) component).getParameters().add(param);
				}
				WorkflowParameterMapImpl entry = (WorkflowParameterMapImpl) ((RuntimeFactoryImpl) RuntimeFactory.eINSTANCE)
						.createWorkflowParameterMap();
				entry.setKey(param);
				EObject copy = copier.copy(parameter.getValue());
				copier.copyReferences();
				entry.setValue(copy);
				context.getParameters().add(entry);
			}
		}
		component.setName(modiscoElement.getName());
		component.setDescription("DESC_" + modiscoElement.getName()); //$NON-NLS-1$
		component.setType(modiscoElement.getType());
		component
				.setComponentOrchestrationStrategy(OrchestrationFactory.eINSTANCE
						.createWorkflowComponentOrchestrationStrategy());
		engineParent.setContext(context);
		engineParent.setWorkflow(component);
		return component;
	}

	/**
	 * Allows to find the good instance of LaunchConfiguration corresponding at
	 * name
	 * 
	 * @param configName
	 *            Name of LaunchConfiguration
	 * @return An instance of launchConfiguration corresponding at name
	 */
	private ILaunchConfiguration getLaunchConfigurationFromName(
			final String configurationName) {
		ILaunchConfiguration configurationFind = null;
		try {
			for (ILaunchConfiguration config : DebugPlugin.getDefault()
					.getLaunchManager().getLaunchConfigurations()) {
				if (config.getName().equals(configurationName)) {
					configurationFind = config;
					break;
				}
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return configurationFind;
	}

	/**
	 * Allows to load another model
	 * 
	 * @param modiscoElement
	 *            Workflow element
	 * @return The workflow mwe loaded
	 */
	private org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow loadResource(
			final ILaunchConfiguration configuration) {
		String resourcePath = null;
		try {
			resourcePath = configuration.getAttribute(
					Constants.resourcePath, (String) null);
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("workflow", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		URI uri = URI.createFileURI(resourcePath);
		Resource res = this.resSet.getResource(uri, true);
		org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow workflowLoad = (org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow) res
				.getContents().get(0);
		return workflowLoad;
	}

	public void synchronization(final List<Element> elementsProvided) {
		synchronizationAllComponents(elementsProvided, this.workflow.getEngines()
				.get(0).getEngines());
	}

	/**
	 * Allows to synchronize all elements in workflow
	 * 
	 * @param elementsProvided
	 *            All elements in workflow process
	 * @param engines
	 *            All engines in workflow process
	 */
	private void synchronizationAllComponents(final List<Element> elementsProvided,
			final List<WorkflowEngine> engines) {
		// Update parameters of all components of Workflow
		for (Element elmt : elementsProvided) {
			if (elmt instanceof Work) {
				WorkflowEngine engine = engines.get(elmt.getIndex());
				// Create a temporary map
				Map<String, WorkParameterValue> parameterMap = new HashMap<String, WorkParameterValue>();
				for (WorkParameter parameter : ((Work) elmt).getParameters()) {
					parameterMap.put(parameter.getName(), parameter.getValue());
				}
				EMap<WorkflowParameter, EObject> mapParameterValue = engine
						.getContext().getParameters();
				if (mapParameterValue != null) {
					for (Entry<WorkflowParameter, EObject> entry : mapParameterValue
							.entrySet()) {
						WorkParameterValue newValue = parameterMap.get(entry
								.getKey().getName());
						entry.setValue(newValue);
					}
				}
			} else {
				if (engines.get(elmt.getIndex()) instanceof WorkflowEngineProxy) {
					WorkflowEngineProxy engineProxy = (WorkflowEngineProxy) engines
							.get(elmt.getIndex());
					synchronizationAllComponents(((Workflow) elmt)
							.getElements(), engineProxy.getTargetEngine()
							.getEngines());
				} else {
					// To ComponentMinimalist case
					if (engines.get(elmt.getIndex()).getEngines().size() > 0) {
						synchronizationAllComponents(((Workflow) elmt)
								.getElements(), engines.get(elmt.getIndex())
								.getEngines());
					}
				}
			}
		}
	}

	/**
	 * Allows to rename the Composite component root
	 * 
	 * @param newName
	 *            The new name of Composite component root
	 */
	private void renameWorkflow(final String newName) {
		this.workflow.getComponents().get(0).setName(newName);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow#getElements()
	 */
	@Override
	public EList<Element> getElements() {
		boolean engineDeleted = false;
		EList<Element> listComponent = new BasicEList<Element>();
		int indexSelected = 0;
		for (WorkflowEngine engine : this.workflow.getEngines().get(0)
				.getEngines()) {
			if (engine instanceof WorkflowEngineProxy) {
				WorkflowEngine targetEngine = ((WorkflowEngineProxy) engine)
						.getTargetEngine();
				if (targetEngine.getWorkflow() == null) {
					engineDeleted = true;
				} else {
					engine = targetEngine;
				}
			}
			Element modisco = createElementFromComponent(engine, indexSelected,
					engineDeleted);
			listComponent.add(modisco);
			indexSelected++;
		}
		return listComponent;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#getElement(int)
	 */
	public Element getElement(final int indexSelected) {
		boolean engineDeleted = false;
		WorkflowEngine engine = this.workflow.getEngines().get(0).getEngines()
				.get(indexSelected);
		if (engine instanceof WorkflowEngineProxy) {
			WorkflowEngine targetEngine = ((WorkflowEngineProxy) engine)
					.getTargetEngine();
			if (targetEngine.getWorkflow() == null) {
				engineDeleted = true;
			} else {
				engine = targetEngine;
			}
		}
		Element modisco = createElementFromComponent(engine, indexSelected,
				engineDeleted);
		return modisco;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#getAllElements()
	 */
	public List<Element> getAllElements() {
		return this.getElements();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#addElement(org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element)
	 */
	public void addElement(final Element element) {
		WorkflowComponent component = null;
		WorkflowContext context = null;
		if (element instanceof Workflow) {
			ILaunchConfiguration configurationComposite = getLaunchConfigurationFromName(element
					.getName());
			try {
				String id = configurationComposite.getAttribute(
						Constants.idWorkflow,
						(String) null);
				if (id.equals(Constants.idMinimaliste)) {
					component = WorkflowFactory.eINSTANCE
							.createWorkflowComponentMinimalist();
					component.setName(element.getName());
					component.setType(element.getType());
					WorkflowEngine engine = RuntimeFactory.eINSTANCE
							.createWorkflowEngine();
					engine.setWorkflow(component);
					engine.setContext(RuntimeFactory.eINSTANCE
							.createWorkflowContext());
					this.workflow.getEngines().get(0).getEngines().add(engine);
				} else {
					org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow workflowLoaded = loadResource(configurationComposite);
					component = WorkflowFactory.eINSTANCE
							.createWorkflowComponentProxy();
					WorkflowComponent componentLoaded = workflowLoaded
							.getComponents().get(0);
					component.setDescription(componentLoaded.getDescription());
					component.setName(componentLoaded.getName());
					component.setType(componentLoaded.getType());
					((WorkflowComponentProxy) component)
							.setTargetComponent(componentLoaded);
					WorkflowEngineProxy engineProxy = RuntimeFactory.eINSTANCE
							.createWorkflowEngineProxy();
					engineProxy.setTargetEngine(workflowLoaded.getEngines()
							.get(0));
					engineProxy.setWorkflow(component);
					this.workflow.getEngines().get(0).getEngines().add(
							engineProxy);
				}
				((WorkflowCompositeComponent) this.workflow.getComponents()
						.get(0)).getComponents().add(component);
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		} else {
			WorkflowEngine engine = RuntimeFactory.eINSTANCE
					.createWorkflowEngine();
			component = findElementInEngineList(element, this.workflow
					.getEngines());
			if (component == null) {
				List<WorkflowEngine> tmpEngineAdd = new ArrayList<WorkflowEngine>();
				component = createWorkflowComponentFromElement(element,
						engine, tmpEngineAdd);
				((WorkflowCompositeComponent) this.workflow.getComponents()
						.get(0)).getComponents().add(component);
				((WorkflowCompositeComponent) this.workflow.getComponents()
						.get(0)).getComponents().add(component);
			} else {
				// Find context and copy it
				WorkflowContext contextFind = findContextInEngineList(
						component, this.workflow.getEngines());
				Copier copier = new Copier();
				context = (WorkflowContext) copier.copy(contextFind);
				copier.copyReferences();
				engine.setContext(context);
				engine.setWorkflow(component);
			}
			this.workflow.getEngines().get(0).getEngines().add(engine);
		}
		this.resource.getContents().add(this.workflow);
		this.notifier.notifyElementAdded(element);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#setElement(int, org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element)
	 */
	public void setElement(final int index, final Element element) {
		// Update component
		WorkflowComponent component = findElementInEngineList(element,
				this.workflow.getEngines());
		component.setName(element.getName());
		component.setDescription("DESC_" + element.getName()); //$NON-NLS-1$
		component.setType(element.getType());
		if (component instanceof WorkflowUnitOfWork) {
			// Retrieve all engine
			List<WorkflowEngine> engines = engineListContainingComponent(
					component, this.workflow.getEngines());
			// Update all paramter of work
			Copier copier = new Copier();
			Map<String, WorkParameterValue> mapParamModisco = new HashMap<String, WorkParameterValue>();
			for (WorkParameter parameter : ((Work) element).getParameters()) {
				mapParamModisco.put(parameter.getName(), parameter.getValue());
			}
			for (WorkflowEngine engine : engines) {
				for (Entry<WorkflowParameter, EObject> entry : engine
						.getContext().getParameters().entrySet()) {
					entry.setValue(copier.copy(mapParamModisco.get(entry
							.getKey().getName())));
					copier.copyReferences();
				}
			}
		}
		this.resource.getContents().add(this.workflow);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#upElement(int)
	 */
	public void upElement(final int indexSelected) {
		this.workflow.getEngines().get(0).getEngines().move(indexSelected - 1,
				indexSelected);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#downElement(int)
	 */
	public void downElement(final int indexSelected) {
		this.workflow.getEngines().get(0).getEngines().move(indexSelected + 1,
				indexSelected);
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#removeElement(int)
	 */
	public void removeElement(final int indexSelected) {
		List<WorkflowEngine> engines = new ArrayList<WorkflowEngine>();
		WorkflowEngine engineRemoved = this.workflow.getEngines().get(0)
				.getEngines().get(indexSelected);
		WorkflowComponent component = null;
		if (engineRemoved instanceof WorkflowEngineProxy) {
			component = ((WorkflowEngineProxy) engineRemoved).getTargetEngine()
					.getWorkflow();
		} else {
			component = engineRemoved.getWorkflow();
		}
		for (WorkflowEngine engine : this.workflow.getEngines().get(0)
				.getEngines()) {
			if (engine instanceof WorkflowEngineProxy) {
				engine = ((WorkflowEngineProxy) engine).getTargetEngine();
			}
			if (engine.getWorkflow() != null) {
				if (engine.getWorkflow().equals(component)) {
					engines.add(engine);
				}
			}
		}
		this.workflow.getEngines().get(0).getEngines().remove(indexSelected);
		if (engines.size() == 1) {
			// Removed engine and component
			if (engineRemoved instanceof WorkflowEngineProxy) {
				((WorkflowCompositeComponent) this.workflow.getComponents()
						.get(0)).getComponents().remove(
						engineRemoved.getWorkflow());
			} else {
				((WorkflowCompositeComponent) this.workflow.getComponents()
						.get(0)).getComponents().remove(component);
			}
		}
		this.resource.getContents().add(this.workflow);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#initialization(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public void initialization(final ILaunchConfiguration configuration) {
		IPath resourcePath = null;
		if (!configuration.isLocal()) {
			resourcePath = configuration.getFile().getLocation()
					.removeLastSegments(1).append(configuration.getName())
					.addFileExtension(Constants.workflowExtension);
		} else {
			resourcePath = Activator.getDefault().getStateLocation().append(
					configuration.getName()).addFileExtension(
					Constants.workflowExtension);
		}
		this.caseOfDuplication(configuration, resourcePath);
		// Initialize models
		WorkflowPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(Constants.workflowExtension, new XMIResourceFactoryImpl()); //$NON-NLS-1$
		URI uri = null;
		if (resourcePath.isAbsolute()) {
			uri = URI.createFileURI(resourcePath.toString());
		} else {
			uri = URI.createPlatformResourceURI(resourcePath.toString(), true);
		}
		File f = resourcePath.toFile();
		if (f.exists()) {
			this.resource = this.resSet.getResource(uri, true);
			this.workflow = (org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow) this.resource
					.getContents().get(0);
		} else {
			this.workflow = WorkflowFactory.eINSTANCE.createWorkflow();
			this.resource = this.resSet.createResource(uri);
			this.resource.getContents().add(this.workflow);
			WorkflowCompositeComponent componentRoot = WorkflowFactory.eINSTANCE
					.createWorkflowCompositeComponent();
			componentRoot.setName(configuration.getName());
			componentRoot.setDescription(Messages.WorkflowModelImpl_4);
			try {
				componentRoot.setType(configuration.getType().getIdentifier());
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
			componentRoot.setStateResolutionStrategy(RuntimeFactory.eINSTANCE
					.createWorkflowStateResolutionStrategy());
			componentRoot
					.setCompositeOrchestrationStrategy(OrchestrationFactory.eINSTANCE
							.createWorkflowSerialOrchestrationStrategy());
			this.workflow.getComponents().add(componentRoot);
			WorkflowEngine engineRoot = RuntimeFactory.eINSTANCE
					.createWorkflowEngine();
			engineRoot.setWorkflow(componentRoot);
			engineRoot.setContext(RuntimeFactory.eINSTANCE
					.createWorkflowContext());
			this.workflow.getEngines().add(engineRoot);
		}
		this.currentPath = resourcePath;
		save(null, false);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#save(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void save(final ILaunchConfigurationWorkingCopy configuration) {
		// Now save the content.
		if (configuration != null) {
			configuration.setAttribute(
					Constants.resourcePath,
					this.currentPath.toString());
			List<Element> moDiscoList = this.getAllElements();
			configuration.setAttribute(
					Constants.moDiscoWorkNumber,
					moDiscoList.size());
			configuration.setAttribute(
					Constants.moDiscoListSerialize,
					listOrchestration(moDiscoList));
		}
		try {
			this.resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmt.modisco.workflow.WorkflowModel#exportWorkflow(org.eclipse.emf.common.util.URI)
	 */
	public void exportWorkflow(final URI outputUri) {
		this.resource.setURI(outputUri);
		try {
			this.resource.save(null);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

}
