---------------------------------------------------------------			
If you have any questions and/or comments about this tool, 
please use the MoDisco newsgroup:

	news://news.eclipse.org/eclipse.modeling.gmt.modisco

---------------------------------------------------------------	

---------------
Prerequisites:
---------------
1) Install Eclipse with EMF + the ATL and AM3 plugins:

	--> To install ATL, follow the instructions of the "installation of ADT from source" Eclipse Wiki page 
		which is available from http://wiki.eclipse.org/index.php/ATL/How_Install_ATL_From_CVS/
	
	--> To install AM3, simply follow the same process (except that the repository path is "/cvsroot/technology"). 
		You just have to select the "org.eclipse.gmt/AM3" folder and to checkout the following plugins: 
			* org.eclipse.am3.core
    		* org.eclipse.am3.tools.tge
    		* org.eclipse.am3.ui
    		* org.eclipse.gmt.am3.dsls.km3
    		* org.eclipse.gmt.am3.tools.ant
    		
2) Import the "org.eclipse.gmt.modisco.usecase.birtsampledb" project into your development workspace:

	--> Right-click anywhere on the "Navigator" view and choose "Import...", the "Import" 
		wizard is now opened.
	
	--> Select "General/Existing Projects into Workspace" and click on "Next" button.
	
	--> Click on "Select archive file" and "Browse..." to open the 
		"org.eclipse.gmt.modisco.usecase.birtsampledb-incubation.zip" archive file.
		
	--> Check that the "org.eclipse.gmt.modisco.usecase.birtsampledb" project is selected and
		click on the "Finish" button.
		
	--> The "org.eclipse.gmt.modisco.usecase.birtsampledb" project is now opened into your
		development workspace. 
	

-----------------------------------------
This project contains different folders:
-----------------------------------------

	--> "Input":			The given RelationalDBContent input model has been produced, from the "Classic Models" 
							BIRT sample database, by using the "Relational Database Information" discovery 
							tool provided within the MoDisco tool box.
								* The "Classic Models" BIRT Sample database:
									http://www.eclipse.org/birt/phoenix/db/
								* The "Relational Database Information" discovery plugin:
									http://www.eclipse.org/gmt/modisco/toolBox/RelationalDBInformation/
									(currently not provided anymore due to Eclipse IP reasons)		
							
	--> "Metamodels":		The metamodels, used within this use case, expressed in two different formats 
							(in the KM3 language and in the Ecore XMI format).
							
	--> "Output":			The ClassicModels generated output model (you can delete this file for 
							regenerating it).
							
	--> "Transformation":	The ATL transformation developed in order to implement the mapping from the 
							generic RelationalDBContent metamodel to the specific ClassicModels metamodel.

The ANT script (i.e. the build.xml file with its build.xml.launch configuration file), which 
allows executing the transformation, is stored in the root of the project.


--------------------------------------------------------------
The use case is performed by executing the following actions:
--------------------------------------------------------------

The execution of the use case requires the "ATL" perspective and the "AM3 Resource Navigator" view 
to be opened. The "AM3 Resource Navigator" view must be used instead of the standard "Navigator" view.

	1) 	Right-click on the "build.xml" file and "Run As" -> "Ant Build"
		
		Note that the execution of the transformation takes quite a long time (approximately 1mn and 
		a half) since the input model represents a large amount of tuples and thus many cross references 
		between the output model elements have to be created. The performances may be considerably increase
		by using the new optimized EMF VM. 
	
	2) 	Right-click on the "Metamodels/ClassicModels.ecore" file and "Register metamodel".
		
	3)	Now, you can open the "Output/BIRTSampleDB-classicModels.ecore" generated model.
		
