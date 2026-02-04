Some explanations about EPackage uris for the webappXX ecore definitions
------------------------------------------------------------------------

The ecore definitions are generated from .dtd and .xsd (.dtd are first translated to .xsd)

Default .ecore generation from .xsd leads to something like :
"
......<EPackage...
nsURI="http://java.sun.com/xml/ns/javaee"
......
<details key="namespace" value="##targetNamespace"/>
......
<details key="namespace" value="##targetNamespace"/>
......
"

- First problem : the same namespace is used for webapp 2.5, webapp 3.0, ejbjar 3.0, ejbjar 3.1
It results in some conflict in EPackage Registry.

-> The solution is to rely on version specific namespaces usually indicated in "xsi:schemalocation" of xml files.
But it requires to maintain xml metadata to the right namespace for serialization.
so, we modify .ecore definition like this :

"
......<EPackage...
nsURI="http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
......
<details key="namespace" value="http://java.sun.com/xml/ns/javaee"/>
......
<details key="namespace" value="http://java.sun.com/xml/ns/javaee"/>
......
"

- Second problem : such nsURI are already used within WTP bundles (for the latest versions)

-> The solution is to define MoDisco specific EPackage uris

"
......<EPackage...
nsURI="http://www.eclipse.org/MoDisco/Javaee/web-app_3_0.xsd"
......
<details key="namespace" value="http://java.sun.com/xml/ns/javaee"/>
......
<details key="namespace" value="http://java.sun.com/xml/ns/javaee"/>
......
"

- Third problem : with MoDisco specific uris, xml files cannot be read anymore since neither "http://java.sun.com/xml/ns/javaee"
 nor "http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" (without WTP) are known in EPackage registry
 
-> The solution is to affect some URIHandler to each Resource created for having the subsitution :
"http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" -> "http://www.eclipse.org/MoDisco/Javaee/web-app_3_0.xsd"
