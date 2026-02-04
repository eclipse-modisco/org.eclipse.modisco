USEFUL INFORMATION TO USE AND RUN THIS SAMPLE JAVA REFACTORING WORKFLOW
----------------------------------------------------------------------------------------

MoDisco, ATL & Acceleo have to be previously installed. This can be done via a dedicated 
wizard named "Install Modeling Components", as available from the workbench icon bar.
Note that the org.eclipse.modisco.java.generation project also has to be checkout or
imported into your workspace from:
	- https://dev.eclipse.org/svnroot/modeling/org.eclipse.mdt.modisco/plugins/trunk/
	(use the "anonymous" repository login, no password required)

To directly test the proposed sample refactoring workflow, you then just have to checkout 
or import in your workspace the following source project:
	- org.eclipse.persistence.example.jpa.20.employee.annotations
	- location: http://dev.eclipse.org/svnroot/rt/org.eclipse.persistence/trunk/examples
	(use the "anonymous" repository login, no password required)

To play with the workflow and its different refactoring transformations, you can:
	1) Modify the sources of the JPA project indicated above:
		- Comment some getter/setter methods;
		- Add some new "deprecated" methods;
		- Etc.
	2) Use a different JPA project as input of the workflow
		- some launch configurations have to be updated accordingly
	3) Modify the proposed transformations, add new ones, etc.
