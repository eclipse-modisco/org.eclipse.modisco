#!/bin/sh
# Copyright (c) 2016 Mia-Software.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
#    Grégoire Dupé - initial implementation

<<<<<<< HEAD   (a3639a Bug 507622 - [New Browser] The copy handler hides handlers o)
RT_VERSION=Mars_maintenance
=======
RT_VERSION=Luna_maintenance
>>>>>>> BRANCH (96a465 The new version of the releng dosen't support the use of var)

echo $DISPLAY
echo $PATH

rm -rf org.eclipse.simrel.build
git clone --branch $RT_VERSION http://git.eclipse.org/gitroot/simrel/org.eclipse.simrel.build.git org.eclipse.simrel.build

rm -rf org.eclipse.emf.facet.releng
git clone --branch master http://git.eclipse.org/gitroot/facet/org.eclipse.emf.facet.releng.git org.eclipse.emf.facet.releng

rm -rf org.eclipse.emf.facet.main
git clone --branch master http://git.eclipse.org/gitroot/facet/org.eclipse.emf.facet.main.git org.eclipse.emf.facet.main
rm -rf org.eclipse.emf.facet.archi.tech.rules
ln -s org.eclipse.emf.facet.main/org.eclipse.emf.facet.archi.tech.rules

rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.archi.tech.targetplatform/org.eclipse.modisco.archi.tech.targetplatform-indigo.target

# UI tests needs a window manager
metacity --replace --sm-disable &
