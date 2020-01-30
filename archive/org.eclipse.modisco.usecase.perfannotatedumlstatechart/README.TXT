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
	
	--> To install AM3, follow the instructions of the "installation of AM3 from source" Eclipse Wiki page 
		which is available from http://wiki.eclipse.org/AM3/How_Install_AM3_From_CVS
    		
2) Install the Eclipse/MDT UML2 plugins from http://www.eclipse.org/modeling/mdt/?project=uml2
		
3) Import the "org.eclipse.modisco.usecase.perfannotatedumlstatechart" project into your development workspace:

	--> Right-click anywhere on the "Navigator" view and choose "Import...", the "Import" 
		wizard is now opened.
	
	--> Select "General/Existing Projects into Workspace" and click on "Next" button.
	
	--> Click on "Select archive file" and "Browse..." to open the 
		"org.eclipse.modisco.usecase.perfannotatedumlstatechart-incubation.zip" archive file.
		
	--> Check that the "org.eclipse.modisco.usecase.perfannotatedumlstatechart" project is selected and
		click on the "Finish" button.
		
	--> The "org.eclipse.modisco.usecase.perfannotatedumlstatechart" project is now opened into your
		development workspace.
	

-----------------------------------------
This project contains different folders:
-----------------------------------------

	--> "Inputs":			The input files are a Microsoft Excel file saved in XML format 
							(which is directly readable with Excel 2003 or latest versions), 
							a UML2 state chart model and a UML2 profile model. In addition to this, we 
							also provide the UMLDI file associated to the state chart model (produced
							with TOPCASED) and a screenshot of the diagram. 
							
	--> "Metamodels":		The metamodels, used within this use case, expressed in two different formats 
							(the KM3 language and the Ecore XMI format).
							
	--> "Outputs":			The final annotated UML2 state chart output model, as well as some generated 
							intermediate models, is stored there (note that you can delete these 
							files for regenerating them).
														
	--> "Transformations":	The ATL transformations developed in order to implement the different steps 
							of the use case.

The ANT scripts (i.e. the build-XXX.xml files with their build-XXX.xml.launch configuration files), which 
allow executing the chain of transformations, are stored in the root of the project.


--------------------------------------------------------------
The use case is performed by executing the following actions:
--------------------------------------------------------------

The execution of the use case requires the "ATL" perspective and the "AM3 Resource Navigator" view 
to be opened. The "AM3 Resource Navigator" view may be used instead of the standard "Navigator" view.

	1) 	Right-click on the "build-1-TraceDiscovery.xml" file and "Run As" -> "Ant Build"
		(Note that you can change the input Excel file by modifying the value of the "path" parameter
		of the "am3.loadModel" task's first call. However, the file must keep the same formatting for its
		contained data)
	
	2) 	Right-click on the "build-2-MetricsFromTraces.xml" file and "Run As" -> "Ant Build"
		 
	3) 	Right-click on the "build-3-PerformanceAnnotatedUMLStateChart.xml" file and "Run As" -> "Ant Build"
		
