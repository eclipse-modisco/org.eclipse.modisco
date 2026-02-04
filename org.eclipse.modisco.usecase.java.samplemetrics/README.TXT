USEFUL INFORMATION TO USE AND RUN THIS SAMPLE JAVA METRICS COMPUTATION/VISUALIZATION WORKFLOW
----------------------------------------------------------------------------------------------

MoDisco, ATL have to be previously installed. This can be done via a dedicated 
wizard named "Install Modeling Components", as available from the workbench icon bar.
The org.eclipse.m2m.atl.projectors.xml plugin also has to be installed, sources available from:
	- https://dev.eclipse.org/svnroot/modeling/org.eclipse.mdt.modisco/incubation/trunk/am3/plugins/trunk/
	(use the "anonymous" repository login, no password required)
Note that the org.eclipse.modisco.tool.metricsvisualizationbuilder project also has 
to be checkout or imported into your workspace from:
	- https://dev.eclipse.org/svnroot/modeling/org.eclipse.mdt.modisco/plugins/trunk/
	(use the "anonymous" repository login, no password required)

To directly test the proposed sample metrics computation/visualization workflow, you then 
just have to checkout or import in your workspace the following source project:
	- org.eclipse.persistence.example.jpa.20.employee.annotations
	- location: http://dev.eclipse.org/svnroot/rt/org.eclipse.persistence/trunk/examples
	(use the "anonymous" repository login, no password required)

To play with the workflow and its different metrics computation transformations, you can:
	1) Modify the sources of the metrics transformations
	2) Use a different Java project as input of the workflow
		- some launch configurations have to be updated accordingly
