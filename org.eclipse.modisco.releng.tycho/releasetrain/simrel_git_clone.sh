#!/bin/sh
# Copyright (c) 2015 Mia-Software.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
#    Grégoire Dupé - initial implementation

function usage {
	echo "Usage: $0 target_dir"
}

if [ -z $1 ] ; then
	usage
fi 

git clone --branch Mars_maintenance http://git.eclipse.org/gitroot/simrel/org.eclipse.simrel.build.git $1