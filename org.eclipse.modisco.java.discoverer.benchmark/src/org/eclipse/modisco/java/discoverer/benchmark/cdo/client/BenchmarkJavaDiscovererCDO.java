/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.benchmark.cdo.client;

import java.util.Map;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.modisco.java.discoverer.benchmark.Messages;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.JavaReaderEMFStat;
import org.eclipse.modisco.java.discoverer.cdo.JavaDiscovererCDO;
import org.eclipse.modisco.java.emf.JavaFactory;

public class BenchmarkJavaDiscovererCDO extends DiscoverJavaModelFromJavaProjectEMFStat {

	private final String cacheType = JavaDiscovererCDO.LRU_CACHE;
	private Object serverDescription = Messages.serverDescription;
	private int port = JavaDiscovererCDO.DEFAULT_PORT_VALUE;

	// @SuppressWarnings("unused")
	// private static Map<CDOView, ITCPConnector> connectors = new
	// HashMap<CDOView, ITCPConnector>();

	@Override
	protected void endAnalyzeJavaProject(final Model model) {
		JavaDiscovererCDO.close(model.eResource(), true);
	}

	@Override
	protected Resource createTargetModel() {
		String resourceName = "" + System.currentTimeMillis(); //$NON-NLS-1$
		IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				Messages.JavaDiscovererCDO_10 + resourceName);
		Activator.getDefault().getLog().log(status);
		EPackage ePackage = getEFactory().getEPackage();
		if (ePackage == null) {
			throw new RuntimeException("ePackage is null. this.getEFactory()=" + getEFactory()); //$NON-NLS-1$
		}
		CDOResource result = JavaDiscovererCDO.getOrCreateCDOResource(resourceName, ePackage,
				this.cacheType, this.port);
		result.getContents().add(getEFactory().createModel());
		dbInit(result);
		setTargetModel(result);
		return result;
	}

	@Override
	protected Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.STORAGE_KIND, "CDO"); //$NON-NLS-1$
		properties.put(JavaDiscovererCDO.CDO_VERSION, Platform
				.getBundle("org.eclipse.emf.cdo").getVersion().toString()); //$NON-NLS-1$
		if (JavaDiscovererCDO.LRU_CACHE.equals(this.cacheType)) {
			properties.put(JavaDiscovererCDO.CDO_CACHE_TYPE, JavaDiscovererCDO.LRU_CACHE);
			properties.put(JavaDiscovererCDO.CURRENT_LRU_CAPACITY, new Integer(
					JavaDiscovererCDO.DEFAULT_LRU_CAPACITY).toString());
			properties.put(JavaDiscovererCDO.REVISED_LRU_CAPACITY, new Integer(
					JavaDiscovererCDO.DEFAULT_LRU_CAPACITY).toString());
		} else if (JavaDiscovererCDO.DEFAULT_CACHE.equals(this.cacheType)) {
			properties.put(JavaDiscovererCDO.CDO_CACHE_TYPE, JavaDiscovererCDO.DEFAULT_CACHE);
		} else if (JavaDiscovererCDO.MEM_CACHE.equals(this.cacheType)) {
			properties.put(JavaDiscovererCDO.CDO_CACHE_TYPE, JavaDiscovererCDO.MEM_CACHE);
		} else {
			properties.put(JavaDiscovererCDO.CDO_CACHE_TYPE, "Wrong revision cache type"); //$NON-NLS-1$
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Wrong revision cache type", new Exception()); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
		properties.put(JavaDiscovererCDO.CDO_SERVER_DESCRIPTION, this.serverDescription);
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.ALGO_VARIANT,
				Messages.JavaDiscovererCDO_18);
		return properties;
	}

	@Override
	public JavaFactory getEFactory() {
		org.eclipse.modisco.java.cdo.impl.JavaPackageImpl.init();
		return org.eclipse.modisco.java.cdo.meta.JavaFactory.eINSTANCE;
	}

	private void dbInit(final CDOResource resource) {
		if (getStatistics() != null) {
			getStatistics().beginInit();
		}
		CDOView cdoView = resource.cdoView();
		if (cdoView instanceof CDOTransaction) {
			CDOTransaction cdoTransaction = (CDOTransaction) cdoView;
			try {
				cdoTransaction.commit();
			} catch (CommitException e) {
				throw new RuntimeException(e);
			}
		}
		if (getStatistics() != null) {
			getStatistics().endInit();
		}
	}

	@Override
	protected JavaReaderEMFStat getJavaReader(final Map<String, Object> elementOptions) {
		JavaReaderEMFStat javaReader = new JavaReaderEMFStat(getEFactory(), true) {
			@Override
			protected void reset() {
				if (getStatistics() != null) {
					getStatistics().tabValueReport("Begin reset"); //$NON-NLS-1$
				}
				getGlobalBindings().resolveBindings(getResultModel());
				if (getStatistics() != null) {
					getStatistics().tabValueReport("globalBindings resolved"); //$NON-NLS-1$
				}
				if (getStatistics() != null) {
					getStatistics().beginSave();
				}
				if (getResultModel() instanceof CDOObject) {
					CDOObject cdoObject = (CDOObject) getResultModel();
					CDOView cdoView = cdoObject.cdoView();
					if (cdoView instanceof CDOTransaction) {
						CDOTransaction cdoTransaction = (CDOTransaction) cdoView;
						try {
							cdoTransaction.commit();
						} catch (CommitException e) {
							throw new RuntimeException(e);
						}
					}
				}
				setGlobalBindings(getBindingManager());
				if (getStatistics() != null) {
					getStatistics().endSave();
				}
				if (getStatistics() != null) {
					getStatistics().tabValueReport("End reset"); //$NON-NLS-1$
				}
			}
		};
		javaReader.setStatistics(getStatistics());
		return javaReader;
	}

	public void setServerDescription(final String serverDescription) {
		this.serverDescription = serverDescription;
	}

	public void setPort(final int port) {
		this.port = port;
	}

	public int getPort() {
		return this.port;
	}

}
