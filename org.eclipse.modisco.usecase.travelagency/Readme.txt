TRAVEL AGENCY v1.2.01
------------------------------

This is the TravelAgency scenario created in the context of the MOMOCS European research project. A screencast showing the complete process
is available at: http://www.momocs.org under "Tool presentations"-> "TravelAgency Demo".

The TBMS (To Be Modernized System) is modeled in the \InitialModel\TravelAgencyV1.2.01.ofp file through the MOMOCS Editor Analysis Tool 
and it represents a CRM application that needs modernization due to company's business growth. 
A correspondent EMF resource (TravelAgencyV1.2.01.xsm) is available in the same directory. 

In this scenario, the need for modernization is represented by the number of increasing connections deriving from an increasing number of clients.

The current MySQL DB is not able to satisfy all requests: the metric defined on MySQL ComponentType in TravelAgency_MySQL.xsm
can't satisfy a TravelAgency constraint defined for "maximum number of connections". 
Constraint checking is performed through the MOMOCS Editor Analysis Tool.

A component replacement is thus required: the new component, compatible with current constraints, is retrieved from the MOMOCS KnowledgeBase Repository Tool 
(\fromKBR\Oracle.xsm) and it is imported into the current model (please see TravelAgency_MySQL_Oracle.xsm).
A ComponentType replacement pattern is then executed by using the MOMOCS Transformation Tool (based on the Eclipse M2M ATL Component)
which allows the replacement of the MySQL ComponentType with the Oracle ComponentType having a metric satisfying the 
"maximum number of connections" constraint.
The pattern is selected among a set of documented transformations defined on the MOMOCS Xirup metamodel and performing common modernization cases.

The output model (\FinalModel\TravelAgency_Oracle.xsm) is then imported into the MOMOCS Editor Analysis Tool (\FinalModel\TravelAgencyFinal.ofp and \FinalModel\TravelAgency.xsm) 
for constraint verification and model visualization.     