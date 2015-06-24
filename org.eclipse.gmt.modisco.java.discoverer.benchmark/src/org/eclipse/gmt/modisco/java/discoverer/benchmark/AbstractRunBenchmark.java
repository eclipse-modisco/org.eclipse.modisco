/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.cdo.derby.DerbyCDOServer;
import org.eclipse.gmt.modisco.infra.common.cdo.server.Server;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.client.BenchmarkJavaDiscovererCDO;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.client.nousage.JavaDiscovererCDONoUsages;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.cdo.server.DerbyCDOServerNoAudits;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererClassicalEMF;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFMinimalEObject;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFNoUsages;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.Statistics;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;

import com.ibm.icu.text.SimpleDateFormat;

/**
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public abstract class AbstractRunBenchmark implements Discoverer {

	private static final int INITIAL_PORT = 2036;

	private int port = AbstractRunBenchmark.INITIAL_PORT;
	protected static final String LAUNCHTYPE = "org.eclipse.pde.ui.RuntimeWorkbench"; //$NON-NLS-1$
	private IProject statProject;

	public MultiProjectBenchmark createReport(final Object source) throws CoreException, IOException {
		initStatProject((IJavaProject) source);

		// CDO+Derby, No audits, With usages
		serverAndDisco(source, DerbyCDOServerNoAudits.class, BenchmarkJavaDiscovererCDO.class);
		// CDO+Derby, No audits, Without usages
		serverAndDisco(source, DerbyCDOServerNoAudits.class, JavaDiscovererCDONoUsages.class);
		// CDO+Derby, with audits, With usages
		serverAndDisco(source, DerbyCDOServer.class, BenchmarkJavaDiscovererCDO.class);
		// XMI, incremental
		disco(source, JavaDiscovererIncrementalEMF.class);
		// XMI, Without usages
		disco(source, JavaDiscovererEMFNoUsages.class);
		// XMI, MinimalEObject
		disco(source, JavaDiscovererEMFMinimalEObject.class);
		// Reference discoverer
		disco(source, JavaDiscovererClassicalEMF.class);
		// // CDO+MySQL, No audits, With usages
		// serverAndDisco(source, MySQLCDOServer.class,
		// BenchmarkJavaDiscovererCDO.class);
		Statistics.copyLog(this.statProject.getLocation().toFile());
		Report aReport = new Report(this.statProject);
		MultiProjectBenchmark benchmarkModel = aReport.generate();
		return benchmarkModel;
	}

	public IProject getStatProject() {
		return this.statProject;
	}

	public int getPort() {
		return this.port;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = true;
		}

		return result;
	}

	public Resource discoverElement(final Object source, final URI target) {
		this.discoverElement(source, new HashMap<DiscoveryParameter, Object>());
		return null;
	}

	protected void disco(final Object source,
			final Class<? extends DiscoverJavaModelFromJavaProjectEMFStat> discovererClass) {
		DiscoverJavaModelFromJavaProjectEMFStat discoverer;
		try {
			discoverer = discovererClass.newInstance();
			discoverer.setStatProject(this.statProject);
			HashMap<DiscoveryParameter, Object> map = new HashMap<DiscoveryParameter, Object>();
			map.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, true);
			discoverer.discoverElement(source, map);
		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}

	}

	protected void serverAndDisco(final Object source, final Class<? extends Server> serverClass,
			final Class<? extends BenchmarkJavaDiscovererCDO> discovererClass) {
		try {
			IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
					"Starting server: " + serverClass.getSimpleName()); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
			this.port++;
			Server server = serverClass.newInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
			server.start("db" + formatter.format(System.currentTimeMillis()), this.port); //$NON-NLS-1$
			// ILaunch iLaunch = launch(serverClass.getSimpleName(), port);
			// Thread.sleep(AbstractCDOServer.SLEEP_TIME_AFTER_LAUNCHE);
			synchronized (server) {
				long before = System.currentTimeMillis();
				while (!server.isStarted()) {
					server.wait(100);
				}
				System.out
						.println("server took " + (System.currentTimeMillis() - before) + " ms to start"); //$NON-NLS-1$ //$NON-NLS-2$
			}
			IStatus status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Starting discovery"); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status2);
			BenchmarkJavaDiscovererCDO discoverer = discovererClass.newInstance();
			discoverer.setStatProject(this.statProject);
			discoverer.setPort(this.port);
			discoverer.setServerDescription(server.getDescription());
			discoverer.discoverElement(source, URI.createURI("")); //$NON-NLS-1$
			IStatus status3 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Stopping server"); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status3);
			// iLaunch.terminate();
			server.stop();
		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		try {
			createReport(source);
		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public List<DiscoveryParameter> getDiscovererParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void initStatProject(final IJavaProject sourceProject) {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
		this.statProject = ws.getRoot().getProject(
				"statistics_" + formatter.format(System.currentTimeMillis())); //$NON-NLS-1$
		try {
			this.statProject.create(new NullProgressMonitor());
			this.statProject.open(new NullProgressMonitor());
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			this.statProject = null;
		}
	}

	public ILaunch launch(final String application) throws Exception {
		String name = ""; //$NON-NLS-1$
		ILaunchConfigurationType type = DebugPlugin.getDefault().getLaunchManager()
				.getLaunchConfigurationType(AbstractRunBenchmark.LAUNCHTYPE);
		ILaunchConfiguration launchConfiguration = null;
		launchConfiguration = type.newInstance(null, name);
		launchConfiguration = launchConfiguration.getWorkingCopy().getParent().doSave();
		ILaunchConfigurationWorkingCopy copy = launchConfiguration.getWorkingCopy();
		initAttribute(copy, Activator.PLUGIN_ID + "." + application); //$NON-NLS-1$
		launchConfiguration = copy.doSave();
		ILaunch iLaunch = launchConfiguration.launch(ILaunchManager.RUN_MODE,
				new NullProgressMonitor());
		return iLaunch;
	}

	protected void initAttribute(final ILaunchConfigurationWorkingCopy copy,
			final String application) {
		copy.setAttribute("append.args", true); //$NON-NLS-1$
		copy.setAttribute("application", application); //$NON-NLS-1$
		copy.setAttribute("askclear", true); //$NON-NLS-1$
		copy.setAttribute("automaticAdd", true); //$NON-NLS-1$
		copy.setAttribute("automaticValidate", false); //$NON-NLS-1$
		copy.setAttribute("bootstrap", ""); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("checked", "[NONE]"); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("clearConfig", false); //$NON-NLS-1$
		copy.setAttribute("clearws", false); //$NON-NLS-1$
		copy.setAttribute("clearwslog", false); //$NON-NLS-1$
		copy.setAttribute("configLocation", //$NON-NLS-1$
				"${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/New_configuration"); //$NON-NLS-1$

		copy.setAttribute("includeOptional", true); //$NON-NLS-1$
		copy.setAttribute("location", //$NON-NLS-1$
				"${workspace_loc}/../runtime-New_configuration"); //$NON-NLS-1$
		copy.setAttribute("org.eclipse.jdt.launching.PROGRAM_ARGUMENTS", //$NON-NLS-1$
				"-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog -port " //$NON-NLS-1$
						+ this.port);
		copy.setAttribute("org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER", //$NON-NLS-1$
				"org.eclipse.pde.ui.workbenchClasspathProvider"); //$NON-NLS-1$
		copy.setAttribute("org.eclipse.jdt.launching.VM_ARGUMENTS", //$NON-NLS-1$
				"-Xms40m -Xmx512m"); //$NON-NLS-1$
		copy.setAttribute("pde.version", "3.3"); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("product", "org.eclipse.platform.ide"); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("show_selected_only", false); //$NON-NLS-1$
		copy.setAttribute("templateConfig", //$NON-NLS-1$
				"${target_home}\\configuration\\config.ini"); //$NON-NLS-1$
		copy.setAttribute("tracing", false); //$NON-NLS-1$
		copy.setAttribute("useDefaultConfig", true); //$NON-NLS-1$
		copy.setAttribute("useDefaultConfigArea", true); //$NON-NLS-1$
		copy.setAttribute("useProduct", false); //$NON-NLS-1$
		copy.setAttribute("usefeatures", false); //$NON-NLS-1$
		copy.setAttribute("default", true); // true if getting ws plugins //$NON-NLS-1$
		// copy.setAttribute("default", false); // true if getting ws plugins
		// copy
		// .setAttribute(
		// "selected_target_plugins",
		// "org.eclipse.update.core@default:default,org.eclipse.xtend.typesystem.xsd.source@default:default,org.eclipse.ui.views.log@default:default,org.eclipse.gmf.runtime.draw2d.ui@default:default,org.eclipse.jdt.core.manipulation@default:default,org.eclipse.wst.common.modulecore@default:default,org.eclipse.net4j.db.derby@default:default,org.eclipse.net4j.jvm@default:default,org.eclipse.acceleo.ide.ui@default:default,org.eclipse.gmf.runtime.common.core@default:default,org.eclipse.persistence.core@default:default,org.eclipse.emf.compare.source@default:default,org.eclipse.equinox.security.ui@default:default,org.eclipse.uml2.diagram.profile@default:default,org.eclipse.emf.doc@default:default,org.eclipse.gmf@default:default,org.eclipse.emf.validation.ocl@default:default,org.eclipse.gmt.modisco.java.cdo@default:default,org.sat4j.core@default:default,org.eclipse.m2m.atl@default:default,org.eclipse.equinox.p2.garbagecollector@default:default,org.eclipse.gmf.runtime.notation@default:default,org.eclipse.wst.common.uriresolver@default:default,com.google.collect@default:default,org.eclipse.zest.core@default:default,org.eclipse.xtext@default:default,org.eclipse.search@default:default,org.eclipse.equinox.frameworkadmin@default:default,org.eclipse.wst.common.emfworkbench.integration@default:default,org.eclipse.ui.views.properties.tabbed@default:default,org.eclipse.xtend.typesystem.uml2.ui@default:default,org.eclipse.gmf.runtime.emf.clipboard.core@default:default,org.eclipse.wst.sse.ui.infopop@default:default,org.eclipse.xsd.cheatsheets@default:default,org.eclipse.emf.validation.ui.ide@default:default,org.eclipse.gmt.modisco.java@default:default,org.eclipse.xsd.edit@default:default,org.eclipse.gef@default:default,org.eclipse.emf.cdo.tests.model4interfaces@default:default,org.eclipse.persistence.antlr@default:default,org.eclipse.equinox.simpleconfigurator@1:true,org.eclipse.pde.api.tools@default:default,org.eclipse.xsd.ecore.converter@default:default,org.eclipse.emf.teneo.eclipse@default:default,org.eclipse.gmf.doc@default:default,org.eclipse.xtext.runtime.source@default:default,org.eclipse.equinox.p2.exemplarysetup@default:default,org.eclipse.gmf.templates.legacy@default:default,org.eclipse.ecf.filetransfer@default:default,org.eclipse.emf.ecoretools@default:default,org.eclipse.xtend.typesystem.xsd@default:default,org.eclipse.m2m.qvt.oml.ecore.imperativeocl@default:default,org.eclipse.net4j.http@default:default,org.apache.xml.resolver@default:default,org.eclipse.m2m.atl.core@default:default,net.sourceforge.lpg.lpgjavaruntime@default:default,org.tigris.subversion.clientadapter.javahl.win32@default:false,org.eclipse.jet.core@default:default,org.eclipse.mylyn.tasks.core@default:default,org.eclipse.ant.core@default:default,org.apache.xml.serializer@default:default,org.apache.commons.el@default:default,org.eclipse.wst.common.infopop@default:default,org.eclipse.emf.converter@default:default,org.eclipse.ui.externaltools@default:default,org.eclipse.mylyn.context.ui@default:default,org.eclipse.gmf.bridge.trace@default:default,org.eclipse.gmt.modisco.java.editor@default:default,org.eclipse.emf.databinding@default:default,org.eclipse.osgi.services@default:default,org.eclipse.equinox.preferences@default:default,org.eclipse.pde.ds.core@default:default,org.eclipse.emf.workspace.ui@default:default,javax.xml.stream@default:default,org.eclipse.emf.codegen.ecore.ui@default:default,org.eclipse.gmf.examples@default:default,org.eclipse.xtend.typesystem.emf.ui@default:default,org.eclipse.m2m.qvt.oml.trace.edit@default:default,org.eclipse.core.runtime@default:true,org.eclipse.update.core.win32@default:false,org.eclipse.m2m.qvt.oml.editor.ui@default:default,org.eclipse.jsch.core@default:default,org.eclipse.emf.teneo.ui.capabilities@default:default,org.eclipse.emf.ecore.edit@default:default,org.eclipse.emf.transaction.doc@default:default,org.eclipse.mylyn.wikitext.twiki.core@default:default,org.eclipse.ecf.provider.filetransfer.httpclient@default:default,org.eclipse.uml2.diagram.common@default:default,org.eclipse.emf.ecoretools.properties@default:default,org.apache.batik.dom@default:default,org.eclipse.net4j@default:default,org.eclipse.emf.transaction.examples@default:default,org.eclipse.emf.mwe.examples.source@default:default,org.eclipse.uml2.doc@default:default,org.eclipse.mylyn.pde.ui@default:default,org.eclipse.gmf.graphdef.codegen.ui@default:default,org.eclipse.gmf.runtime.notation.edit@default:default,org.eclipse.gmf.runtime.diagram.ui.printing@default:default,org.eclipse.equinox.p2.metadata.repository@default:default,org.objectweb.asm@default:default,org.eclipse.emf.importer.rose@default:default,org.eclipse.xtext.reference.ui@default:default,org.eclipse.ocl.uml@default:default,org.eclipse.emf.workspace@default:default,org.eclipse.m2m.atl.core.ant@default:default,org.eclipse.xtext.example.ecoredsl@default:default,org.eclipse.wst.xsd.ui@default:default,org.eclipse.emf.cdo.ui.capabilities@default:default,org.apache.batik.transcoder@default:default,org.eclipse.mylyn.ide.ui@default:default,org.eclipse.xpand.source@default:default,org.eclipse.ocl@default:default,org.apache.batik.css@default:default,org.eclipse.emf.mapping.xsd2ecore.editor@default:default,org.eclipse.core.filesystem.win32.x86@default:false,org.eclipse.mylyn.discovery.core@default:default,org.eclipse.wst.xmleditor.doc.user@default:default,org.eclipse.gmt.modisco.common.editor@default:default,org.eclipse.jface.databinding@default:default,org.eclipse.emf.teneo.hibernate@default:default,org.eclipse.mylyn.wikitext.mediawiki.ui@default:default,org.eclipse.emf.teneo.annotations@default:default,org.eclipse.gmf.map.edit@default:default,org.eclipse.emf.compare.diff.edit@default:default,org.eclipse.emf.cdo.tests.model1.edit@default:default,org.eclipse.emf.mwe.doc@default:default,org.eclipse.gmf.runtime.common.ui.printing@default:default,org.eclipse.emf.cdo.migrator@default:default,org.eclipse.emf.compare.doc@default:default,org.eclipse.team.cvs.ui@default:default,org.eclipse.xtext.xtend@default:default,org.apache.batik.ext.awt@default:default,org.eclipse.equinox.p2.extensionlocation@default:default,org.eclipse.gmt.modisco.java.nousages@default:default,org.eclipse.emf.validation@default:default,org.eclipse.emf.ecore.change.edit@default:default,com.miasoftware.modisco.cdo.ecorechecking@default:default,org.eclipse.jet.ui@default:default,org.eclipse.platform.doc.user@default:default,org.eclipse.equinox.registry@default:default,org.eclipse.uml2.diagram.statemachine@default:default,org.eclipse.emf.ocl@default:default,org.eclipse.update.ui@default:default,org.eclipse.team.ui@default:default,org.eclipse.net4j.jms.api@default:default,org.eclipse.emf.ecoretools.tabbedproperties@default:default,org.eclipse.emf.ecoretools.doc@default:default,org.eclipse.uml2.uml.resources@default:default,org.eclipse.m2m.qvt.oml@default:default,org.eclipse.emf.ant@default:default,org.eclipse.emf.validation.ui@default:default,org.eclipse.mylyn.tasks.ui@default:default,org.eclipse.mylyn.tasks.bugs@default:default,org.eclipse.wst.common.project.facet.core@default:default,org.eclipse.epp.usagedata.ui@default:default,org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide@default:default,org.eclipse.uml2.uml.editor@default:default,org.eclipse.pde.build@default:default,org.eclipse.emf.cdo.tests.mango.edit@default:default,com.jcraft.jsch@default:default,org.eclipse.core.databinding.property@default:default,org.eclipse.emf.teneo.eclipselink.common@default:default,org.eclipse.gmf.runtime.draw2d.ui.render.awt@default:default,org.eclipse.mylyn.wikitext.ui@default:default,org.eclipse.jdt.junit.runtime@default:default,org.eclipse.xtext.ui.common@default:default,org.eclipse.xtext.example.ecoredsl.ui@default:default,org.eclipse.wst.validation.ui@default:default,org.eclipse.wst.xml.core@default:default,org.eclipse.m2m.qvt.oml.emf.util.ui@default:default,org.eclipse.net4j.db.mysql@default:default,org.eclipse.emf.cdo.tests.model4@default:default,org.apache.commons.cli@default:default,org.eclipse.emf.mwe.ui@default:default,org.eclipse.ecf.provider.filetransfer.httpclient.ssl@default:false,org.eclipse.equinox.p2.jarprocessor@default:default,org.eclipse.equinox.common@2:true,org.eclipse.m2m.atl.core.emf@default:default,org.eclipse.persistence.jpa@default:default,org.eclipse.gmf.runtime.diagram.ui.resources.editor@default:default,org.tigris.subversion.subclipse.ui@default:default,org.junit@default:default,org.eclipse.pde.junit.runtime@default:default,org.eclipse.equinox.p2.updatesite@default:default,org.eclipse.core.databinding.beans@default:default,org.eclipse.gmf.runtime.common.ui.action.ide@default:default,org.eclipse.equinox.app@default:default,org.eclipse.equinox.p2.console@default:default,org.eclipse.emf.generic.editor@default:default,org.eclipse.equinox.http.registry@default:default,org.eclipse.net4j.buddies.server@default:default,org.eclipse.emf.mapping@default:default,org.eclipse.emf.databinding.edit@default:default,org.eclipse.mylyn.wikitext.confluence.ui@default:default,org.eclipse.equinox.frameworkadmin.equinox@default:default,org.eclipse.mylyn.monitor.core@default:default,org.eclipse.ui.intro@default:default,org.eclipse.xtend.check.ui@default:default,org.eclipse.equinox.p2.touchpoint.natives@default:default,org.w3c.dom.smil@default:default,org.eclipse.xtext.generator@default:default,org.eclipse.ltk.ui.refactoring@default:default,org.eclipse.emf.cdo.ui.defs@default:default,org.eclipse.uml2.diagram@default:default,org.eclipse.m2m.atl.dsls@default:default,org.eclipse.net4j.examples@default:default,org.eclipse.xpand.ui.source@default:default,org.eclipse.equinox.p2.directorywatcher@default:default,org.eclipse.equinox.jsp.jasper@default:default,org.eclipse.net4j.ui@default:default,org.eclipse.gmf.runtime.diagram.core@default:default,org.eclipse.persistence.asm@default:default,org.eclipse.m2m.atl.adt.ui@default:default,org.eclipse.emf.edit.ui@default:default,org.eclipse.emf.mapping.xsd2ecore@default:default,org.eclipse.core.expressions@default:default,org.eclipse.xtext.example.fowlerdsl.ui@default:default,org.eclipse.emf.cdo@default:default,org.eclipse.xpand@default:default,org.eclipse.m2m.atl.examples@default:default,javax.mail@default:default,org.eclipse.emf.query.ocl@default:default,org.eclipse.equinox.p2.metadata.generator@default:default,org.eclipse.xtend.shared.ui@default:default,org.eclipse.gmf.runtime.emf.ui.properties@default:default,org.eclipse.mylyn.discovery.ui@default:default,org.eclipse.emf.teneo.eclipselink.common.ui@default:default,org.eclipse.pde.runtime@default:default,org.eclipse.xtend.typesystem.emf@default:default,org.apache.commons.httpclient@default:default,fr.miasoftware.modisco.cdo.launcher.mysql@default:default,org.eclipse.net4j.defs@default:default,org.eclipse.ui.ide.application@default:default,org.eclipse.uml2.examples.uml.ui@default:default,org.eclipse.ui.navigator@default:default,org.eclipse.net4j.buddies.chat@default:default,org.eclipse.ui.cheatsheets@default:default,org.eclipse.mylyn.commons.core@default:default,org.eclipse.equinox.p2.repository@default:default,org.eclipse.wst.sse.ui@default:default,org.eclipse.equinox.ds@1:true,org.eclipse.wst.sse.doc.user@default:default,org.eclipse.emf.validation.examples@default:default,org.eclipse.jet.doc@default:default,org.eclipse.xtend.source@default:default,org.eclipse.equinox.p2.publisher@default:default,org.eclipse.equinox.p2.director@default:default,org.eclipse.uml2.diagram.examples.clazz@default:default,org.eclipse.net4j.db@default:default,org.eclipse.emf.query.examples@default:default,org.eclipse.jet.uml2@default:false,org.eclipse.emf.cheatsheets@default:default,org.eclipse.core.jobs@default:default,org.eclipse.wst.xml.ui@default:default,javax.activation@default:default,org.eclipse.mylyn.bugzilla.ide@default:default,org.eclipse.m2m.qvt.oml.common.ui@default:default,org.eclipse.gmf.runtime.diagram.ui.providers@default:default,org.eclipse.emf.compare@default:default,org.eclipse.acceleo.examples@default:default,org.eclipse.jdt.core@default:default,org.eclipse.mylyn.wikitext.help.ui@default:default,org.eclipse.emf.common@default:default,org.eclipse.uml2.diagram.codegen.edit@default:default,org.eclipse.pde.ua.ui@default:default,org.sat4j.pb@default:default,org.eclipse.gmf.map@default:default,org.eclipse.emf.mapping.ecore@default:default,org.eclipse.emf.index.ui@default:default,org.eclipse.net4j.jms.admin@default:default,org.eclipse.swt@default:default,org.eclipse.team.cvs.ssh2@default:default,org.eclipse.pde.api.tools.ui@default:default,org.eclipse.core.resources.compatibility@default:false,org.eclipse.m2m.atl.engine.vm@default:default,org.eclipse.xsd.mapping.editor@default:default,org.eclipse.net4j.buddies.chat.ui@default:default,org.eclipse.core.contenttype@default:default,org.apache.commons.codec@default:default,org.eclipse.emf.ecore@default:default,org.eclipse.net4j.buddies.ui@default:default,org.eclipse.pde.core@default:default,org.eclipse.emf.cdo.ui@default:default,org.eclipse.gmf.runtime.notation.providers@default:default,org.eclipse.wst.xsd.core@default:default,org.eclipse.emf.ecoretools.source@default:default,org.eclipse.gmf.graphdef.edit@default:default,org.eclipse.emf.ocl.examples@default:default,org.eclipse.uml2.codegen.ecore@default:default,org.eclipse.equinox.p2.artifact.repository@default:default,org.eclipse.gmf.bridge.ui@default:default,org.eclipse.xsd.example.installer@default:default,org.eclipse.emf.mwe.core@default:default,org.eclipse.gmf.graphdef.codegen@default:default,org.eclipse.mylyn.commons.net@default:default,org.eclipse.emf.transaction.ui@default:default,org.eclipse.persistence.oracle@default:false,org.eclipse.uml2.diagram.codegen@default:default,org.eclipse.ecf.provider.filetransfer@default:default,org.eclipse.jdt@default:default,org.eclipse.uml2.examples@default:default,org.tigris.subversion.subclipse.doc@default:default,org.apache.batik.bridge@default:default,org.eclipse.help.ui@default:default,org.eclipse.equinox.simpleconfigurator.manipulator@default:default,org.eclipse.equinox.p2.touchpoint.eclipse@default:default,org.eclipse.team.cvs.ssh@default:default,org.eclipse.xtext.bootstrap@default:default,org.eclipse.m2m.atl.drivers.uml24atl@default:default,org.eclipse.uml2.uml.ecore.exporter@default:default,org.eclipse.emf.ecore.change@default:default,org.eclipse.emf.common.ui@default:default,org.eclipse.emf.cdo.server@default:default,org.eclipse.equinox.security.win32.x86@default:false,org.eclipse.ecf@default:default,org.eclipse.emf.mwe.core.source@default:default,org.eclipse.xtend.typesystem.xsd.ui@default:default,org.eclipse.ui.forms@default:default,org.eclipse.uml2.diagram.def@default:default,org.eclipse.emf.index@default:default,org.eclipse.jdt.junit4.runtime@default:default,org.eclipse.gmt.modisco.java.edit@default:default,org.eclipse.m2m.qvt.oml.ocl@default:default,org.eclipse.gmf.xpand.editor@default:default,org.junit4@default:default,org.eclipse.cvs@default:default,org.eclipse.uml2.codegen.ecore.ui@default:default,org.eclipse.mylyn.wikitext.tracwiki.ui@default:default,org.eclipse.m2m.qvt.oml.common@default:default,org.eclipse.m2m.qvt.oml.emf.util@default:default,org.eclipse.gmf.xpand.migration@default:default,org.eclipse.net4j.doc@default:default,org.eclipse.ui.win32@default:false,org.eclipse.emf.mapping.ecore2ecore.editor@default:default,org.eclipse.uml2.common.edit@default:default,org.eclipse.mylyn.commons.ui@default:default,org.eclipse.equinox.p2.updatechecker@default:default,org.eclipse.uml2.diagram.clazz@default:default,org.eclipse.m2m.qvt.oml.ui@default:default,org.eclipse.emf.importer@default:default,org.eclipse.wst.standard.schemas@default:default,org.eclipse.mylyn.ide.ant@default:default,org.apache.ant@default:default,org.apache.batik.parser@default:default,javax.servlet.jsp@default:default,org.eclipse.gmf.runtime.emf.type.ui@default:default,org.eclipse.mylyn.help.ui@default:default,org.eclipse.core.net.win32.x86@default:false,org.eclipse.xsd.editor@default:default,org.eclipse.jface@default:default,org.eclipse.gmf.codegen.ui@default:default,org.eclipse.core.runtime.compatibility.auth@default:default,org.eclipse.wst.validation@default:default,org.mortbay.jetty.server@default:default,org.eclipse.ui.navigator.resources@default:default,org.eclipse.equinox.jsp.jasper.registry@default:default,org.eclipse.m2m.atl.source@default:default,org.eclipse.gmf.runtime.common.ui.printing.win32@default:false,org.eclipse.swt.win32.win32.x86@default:false,org.eclipse.emf.mapping.ecore2ecore@default:default,org.eclipse.emf.compare.diff@default:default,org.apache.batik.xml@default:default,org.eclipse.mylyn.java.ui@default:default,org.eclipse.platform.doc.isv@default:default,org.eclipse.m2m.atl.adt@default:default,org.eclipse.wst.common.ui@default:default,org.eclipse.emf.example.installer@default:default,org.eclipse.ant.ui@default:default,org.apache.batik.util.gui@default:default,org.eclipse.gmf.runtime.emf.core@default:default,org.eclipse.uml2.diagram.examples.activity@default:default,org.eclipse.net4j.jms.server.jdbc@default:default,org.eclipse.gmf.tooling@default:default,org.eclipse.m2m.qvt.oml.runtime.ui@default:default,org.eclipse.gmf.runtime.emf.ui@default:default,org.eclipse.xtext.example.domainmodel@default:default,org.eclipse.xpand.examples@default:default,org.eclipse.equinox.p2.engine@default:default,org.eclipse.xtext.logging@default:default,org.eclipse.gmt.modisco.java.discoverer.tests@default:default,org.eclipse.mylyn.monitor.ui@default:default,org.eclipse.emf.teneo.eclipselink.elistfactory@default:default,org.eclipse.emf.ecore.editor@default:default,org.eclipse.ecf.ssl@default:false,org.eclipse.equinox.p2.core@default:default,org.eclipse.gmf.runtime.emf.commands.core@default:default,org.eclipse.xsd@default:default,org.eclipse.net4j.buddies.common@default:default,org.eclipse.ecf.identity@default:default,org.eclipse.uml2.diagram.sequence.model@default:default,org.eclipse.emf.mwe.examples@default:default,org.eclipse.uml2.diagram.csd@default:default,org.eclipse.emf.ocl.doc@default:default,org.eclipse.gmf.runtime.diagram.ui.providers.ide@default:default,org.eclipse.net4j.util.defs@default:default,org.eclipse.mylyn.compatibility@default:default,org.eclipse.emf.cdo.edit@default:default,org.eclipse.help.webapp@default:default,org.eclipse.emf.mapping.ui@default:default,org.eclipse.core.databinding.observable@default:default,org.eclipse.equinox.security@default:default,org.eclipse.gmf.runtime.emf.type.core@default:default,org.eclipse.ui.views@default:default,fr.miasoftware.modisco.cdo.launcher.derby@default:default,org.eclipse.equinox.p2.ui@default:default,org.apache.derby@default:default,org.eclipse.uml2.diagram.examples.statemachine@default:default,org.eclipse.gmf.runtime.diagram.ui.render@default:default,org.eclipse.emf.compare.match@default:default,org.eclipse.pde.ds.ui@default:default,org.eclipse.pde.ua.core@default:default,org.eclipse.emf.cdo.doc@default:default,org.apache.commons.lang*2.4.0.v20081016-1030@default:default,org.eclipse.equinox.p2.director.app@default:default,org.eclipse.emf.mint.doc@default:default,org.eclipse.emf.ecoretools.filters@default:default,org.eclipse.emf.validation.doc@default:default,org.eclipse.persistence.jpa.equinox.weaving@default:false,org.eclipse.gmf.examples.ui.pde@default:default,org.eclipse.emf.teneo.orm@default:default,org.eclipse.pde.ui@default:default,org.eclipse.pde@default:default,org.eclipse.core.runtime.compatibility@default:default,org.eclipse.xtext.xtext.ui@default:default,org.eclipse.ui.workbench.compatibility@default:false,org.eclipse.platform@default:default,org.apache.lucene@default:default,org.eclipse.emf.mint@default:default,org.eclipse.emf.compare.epatch@default:default,org.eclipse.uml2.diagram.deploy@default:default,org.eclipse.xtext.log4j@default:default,org.eclipse.equinox.p2.reconciler.dropins@default:default,org.eclipse.mylyn.wikitext.mediawiki.core@default:default,org.eclipse.emf.teneo.doc@default:default,org.eclipse.emf.workspace.doc@default:default,org.eclipse.ui.ide@default:default,org.eclipse.ui.console@default:default,org.apache.commons.logging@default:default,org.antlr.runtime@default:default,javax.xml@default:default,org.eclipse.sdk@default:default,org.eclipse.ltk.core.refactoring@default:default,org.eclipse.emf.exporter@default:default,org.eclipse.gmf.ecore.editor@default:default,org.eclipse.emf.compare.ui@default:default,org.eclipse.ecf.provider.filetransfer.ssl@default:false,org.eclipse.core.filesystem@default:default,org.eclipse.draw2d.doc.isv@default:default,org.eclipse.emf.cdo.defs@default:default,com.google.guice@default:default,org.w3c.css.sac@default:default,org.eclipse.acceleo.engine@default:default,org.eclipse.update.configurator@3:true,org.eclipse.gmf.runtime.diagram.ui.actions@default:default,org.eclipse.emf.mwe.ui.simpleEditor@default:default,org.eclipse.emf.mapping.ecore2xml@default:default,org.eclipse.gmf.runtime.common.ui.services@default:default,org.tigris.subversion.clientadapter@default:default,org.eclipse.help.appserver@default:default,org.eclipse.wst.sse.core@default:default,org.eclipse.xpand.doc@default:default,org.eclipse.update.scheduler@default:default,org.eclipse.zest.layouts@default:default,org.eclipse.core.variables@default:default,org.eclipse.ui.presentations.r21@default:default,org.eclipse.wst.xsdeditor.doc.user@default:default,org.apache.xerces@default:default,org.apache.jasper@default:default,org.eclipse.wst.dtd.ui.infopop@default:default,org.eclipse.emf.index.tests@default:default,org.eclipse.ocl.doc@default:default,org.eclipse.emf.ecoretools.diagram.ui.outline@default:default,org.eclipse.core.resources@default:default,org.eclipse.emf.teneo.hibernate.mapper@default:default,org.eclipse.xtext.activities@default:default,com.ibm.icu@default:default,org.apache.commons.lang*2.3.0.v200803061910@default:default,org.tigris.subversion.subclipse.graph@default:default,org.eclipse.xtend@default:default,org.eclipse.uml2.diagram.common.notation@default:default,org.eclipse.mylyn@default:default,org.w3c.dom.svg@default:default,org.eclipse.m2m.atl.adt.editor@default:default,org.eclipse.gmf.runtime.diagram.ui@default:default,org.eclipse.jsch.ui@default:default,org.eclipse.emf.query.doc@default:default,org.eclipse.ui.intro.universal@default:default,org.eclipse.ui.browser@default:default,org.eclipse.m2m.atl.core.ui.vm@default:default,org.eclipse.emf.cdo.tests.mango@default:default,org.mortbay.jetty.util@default:default,org.eclipse.xtend.typesystem.uml2@default:default,org.eclipse.gmf.runtime.diagram.ui.dnd@default:default,org.eclipse.wst.common.frameworks.ui@default:default,org.eclipse.team.core@default:default,org.eclipse.emf.importer.ecore@default:default,javax.transaction@default:false,org.eclipse.gmf.validate@default:default,org.eclipse.gmf.sdk@default:default,org.eclipse.uml2.diagram.component@default:default,org.eclipse.ui.workbench.texteditor@default:default,org.eclipse.jface.text@default:default,org.eclipse.ui@default:default,org.eclipse.gmf.bridge@default:default,org.eclipse.emf.edit@default:default,org.eclipse.core.filebuffers@default:default,org.eclipse.pde.ui.templates@default:default,org.eclipse.wst.common.core@default:default,org.eclipse.xtext.ui.core@default:default,org.eclipse.mylyn.wikitext.tasks.ui@default:default,org.eclipse.net4j.util.ui@default:default,org.eclipse.mylyn.wikitext.twiki.ui@default:default,org.eclipse.core.runtime.compatibility.registry@default:false,com.mysql.jdbc@default:default,org.eclipse.wst.common.frameworks@default:default,org.eclipse.uml2.diagram.parser@default:default,org.eclipse.gmf.tooldef@default:default,org.eclipse.core.databinding@default:default,org.eclipse.mylyn.resources.ui@default:default,org.apache.batik.svggen@default:default,org.eclipse.equinox.p2.repository.tools@default:default,org.eclipse.ui.net@default:default,org.eclipse.xsd.ecore.importer@default:default,org.eclipse.net4j.ui.capabilities@default:default,org.eclipse.net4j.util@default:default,org.eclipse.emf.teneo@default:default,org.eclipse.xtext.ui.source@default:default,org.eclipse.mylyn.wikitext.core@default:default,org.eclipse.core.boot@default:default,org.eclipse.xpand.ui@default:default,org.eclipse.m2m.atl.engine.emfvm@default:default,org.eclipse.wst.common.emf@default:default,org.eclipse.gef.doc.isv@default:default,org.eclipse.m2m.qvt.oml.runtime@default:default,org.eclipse.help.base@default:default,org.eclipse.uml2.uml.edit@default:default,org.eclipse.mylyn.bugzilla.core@default:default,org.eclipse.m2m.qvt.oml.cst.parser@default:default,org.eclipse.m2m.atl.core.ui@default:default,org.eclipse.emf.query@default:default,org.eclipse.emf.cdo.server.db@default:default,org.eclipse.emf.mwe.ui.source@default:default,org.eclipse.emf.mwe.activities@default:default,org.eclipse.emf.teneo.eclipselink@default:default,org.eclipse.xtend.ui.source@default:default,org.eclipse.xtext.sdk.source@default:default,org.eclipse.mylyn.wikitext.confluence.core@default:default,org.eclipse.mylyn.wikitext.textile.core@default:default,org.eclipse.mylyn.context.core@default:default,org.eclipse.equinox.p2.ui.sdk.scheduler@default:default,org.eclipse.uml2tools@default:default,org.eclipse.gmf.graphdef@default:default,org.eclipse.net4j.ui.defs@default:default,org.eclipse.core.commands@default:default,org.eclipse.epp.usagedata.recording@default:default,org.eclipse.wst.validation.infopop@default:default,org.w3c.dom.events@default:default,org.eclipse.xtend.typesystem.uml2.source@default:default,org.eclipse.gmf.common@default:default,org.tigris.subversion.clientadapter.javahl@default:default,org.tigris.subversion.subclipse.core@default:default,org.eclipse.uml2.diagram.examples.profile@default:default,org.eclipse.debug.ui@default:default,org.eclipse.xtext.reference@default:default,javax.servlet@default:default,org.eclipse.wst.xml.ui.infopop@default:default,org.eclipse.jem.util@default:default,org.eclipse.acceleo.doc@default:default,org.eclipse.emf.mwe.utils@default:default,org.eclipse.emf.mint.ui@default:default,org.hamcrest.core@default:default,org.eclipse.acceleo.ui.capabilities@default:default,org.eclipse.xsd.mapping@default:default,org.eclipse.m2m.atl.doc@default:default,org.eclipse.team.cvs.core@default:default,org.eclipse.gmf.xpand@default:default,org.eclipse.equinox.concurrent@default:default,org.eclipse.net4j.http.common@default:default,org.eclipse.wst.dtd.core@default:default,org.eclipse.compare.core@default:default,org.apache.batik.dom.svg@default:default,org.eclipse.acceleo.common@default:default,org.eclipse.m2m.atl.drivers.emf4atl@default:default,org.eclipse.xpand.activities@default:default,org.eclipse.m2m.atl.engine@default:default,org.eclipse.ui.editors@default:default,org.eclipse.gmf.runtime.common.ui.services.dnd.ide@default:default,org.eclipse.emf.cdo.tests.model2@default:default,org.eclipse.emf.mapping.ecore.editor@default:default,org.eclipse.mylyn.bugzilla.ui@default:default,org.eclipse.emf.cdo.tests.model3@default:default,org.eclipse.uml2.uml@default:default,org.eclipse.epp.package.modeling@default:default,org.eclipse.wst.dtd.ui@default:default,org.eclipse.uml2.diagram.activity@default:default,org.eclipse.xtend.ui@default:default,org.eclipse.mylyn.team.cvs@default:default,org.eclipse.equinox.http.servlet@default:default,org.eclipse.uml2.diagram.sequence@default:default,org.eclipse.emf.cdo.common@default:default,org.eclipse.text@default:default,org.apache.lucene.analysis@default:default,org.eclipse.gmf.runtime.gef.ui@default:default,org.eclipse.ui.workbench@default:default,org.eclipse.m2m.qvt.oml.doc@default:default,org.eclipse.xtext.example.fowlerdsl@default:default,org.eclipse.mylyn.wikitext.textile.ui@default:default,org.eclipse.m2m.atl.adt.debug@default:default,org.eclipse.equinox.util@default:default,org.eclipse.gmf.runtime.common.ui.action@default:default,org.eclipse.gef.examples.ui.pde@default:default,org.eclipse.uml2.diagram.usecase@default:default,org.eclipse.acceleo.source@default:default,org.eclipse.gmf.runtime.diagram.ui.geoshapes@default:default,org.apache.batik.pdf@default:default,org.eclipse.persistence.jpa.equinox@default:false,org.eclipse.gmt.modisco.java.discoverer@default:default,org.eclipse.acceleo.parser@default:default,fr.miasoftware.modisco.cdo.test002@default:default,org.eclipse.epp.usagedata.gathering@default:default,org.eclipse.gmt.modisco.java.nousages.cdo@default:default,org.eclipse.uml2@default:default,org.eclipse.acceleo.model@default:default,org.eclipse.emf.transaction@default:default,org.eclipse.net4j.jms@default:default,org.eclipse.emf.codegen.ui@default:default,org.eclipse.mylyn.team.ui@default:default,org.eclipse.core.net@default:default,org.eclipse.help@default:default,org.eclipse.wst.dtdeditor.doc.user@default:default,org.eclipse.gmf.runtime.draw2d.ui.render@default:default,org.eclipse.gmf.runtime.common.ui@default:default,org.eclipse.ocl.ecore@default:default,org.eclipse.draw2d@default:default,org.eclipse.osgi.util@default:default,org.eclipse.compare@default:default,org.eclipse.gmf.codegen@default:default,org.eclipse.wst.common.snippets@default:default,org.eclipse.jet@default:default,org.eclipse.emf.importer.java@default:default,org.eclipse.xtend.util.stdlib@default:default,org.eclipse.gmt.modisco.infra.common.core.internal@default:default,org.eclipse.pde.doc.user@default:default,org.apache.batik.util@default:default,org.eclipse.gmf.runtime.common.ui.services.properties@default:default,org.eclipse.wst.common.environment@default:default,org.eclipse.gmf.tooldef.edit@default:default,org.eclipse.mylyn.wikitext.tracwiki.core@default:default,org.eclipse.compare.win32@default:default,org.eclipse.equinox.launcher@default:default,org.eclipse.xtext.examples.source@default:default,org.eclipse.emf@default:default,org.eclipse.emf.ecoretools.diagram@default:default,org.eclipse.gmf.codegen.edit@default:default,org.eclipse.uml2.common@default:default,org.eclipse.emf.teneo.hibernate.eclipse@default:default,org.eclipse.emf.cdo.examples@default:default,org.eclipse.gmf.runtime.common.ui.services.action@default:default,org.eclipse.gmf.doc.ui@default:default,org.eclipse.wst.internet.cache@default:default,org.eclipse.emf.ecore.xmi@default:default,org.eclipse.mylyn.java.tasks@default:default,org.eclipse.jet.source@default:default,org.eclipse.emf.index.source@default:default,org.eclipse.equinox.http.jetty@default:default,org.eclipse.gmf.bridge.ui.dashboard@default:default,org.eclipse.xtext.example.domainmodel.ui@default:default,org.eclipse.equinox.p2.ui.sdk@default:default,javax.persistence@default:default,org.eclipse.equinox.launcher.win32.win32.x86@default:false,org.eclipse.net4j.jms.server@default:default,org.eclipse.core.resources.win32.x86@default:false,org.eclipse.net4j.http.server@default:default,org.eclipse.gmf.runtime.diagram.ui.properties@default:default,org.eclipse.m2m.qvt.oml.samples@default:default,org.eclipse.emf.codegen.ecore@default:default,org.eclipse.gmf.runtime.common.ui.services.dnd@default:default,org.eclipse.gmf.runtime.diagram.ui.printing.render@default:default,org.eclipse.net4j.buddies@default:default,org.eclipse.emf.mapping.ecore2xml.ui@default:default,org.eclipse.osgi@-1:true,org.eclipse.gmt.modisco.infrastructure.doc@default:default,org.eclipse.xsd.doc@default:default,org.eclipse.net4j.tcp@default:default,org.eclipse.xsd.ecore.exporter@default:default,org.eclipse.m2m.qvt.oml.project@default:default,org.eclipse.emf.cdo.tests.model1@default:default,org.eclipse.emf.codegen@default:default,org.eclipse.uml2.uml.ecore.importer@default:default,org.eclipse.emf.teneo.eclipselink.ui@default:default,org.eclipse.equinox.p2.metadata@default:default,org.eclipse.gmt.modisco.infra.discoverymanager@default:default,org.eclipse.rcp@default:default,org.eclipse.xtext.util@default:default,org.eclipse.m2m.atl.common@default:default,org.eclipse.emf.cdo.tests.model2.edit@default:default,org.eclipse.debug.core@default:default,fr.miasoftware.modisco.cdo.test003@default:default,org.eclipse.gmf.xpand.qvtlibrary@default:default,org.eclipse.emf.teneo.orm.eclipse@default:default");
		// copy
		// .setAttribute(
		// "deselected_workspace_plugins",
		// "org.eclipse.jdt.doc.user,org.eclipse.jdt.debug.ui,org.eclipse.jdt.junit,org.eclipse.jdt.ui,org.eclipse.jdt.apt.core,org.eclipse.jdt.doc.isv,org.eclipse.jdt.debug,org.eclipse.jdt.compiler.apt,org.eclipse.jdt.apt.ui,org.eclipse.jdt.launching,org.eclipse.jdt.compiler.tool,org.eclipse.jdt.apt.pluggable.core,org.eclipse.gmt.modisco.java.discoverer.benchmark");
	}
}
