See https://bugs.eclipse.org/bugs/show_bug.cgi?id=553058

The Acceleo builder does not run reliably in the host Eclipse or the Maven build, consequently the
auto-generated /bin/org/eclipse/modisco/java/generation/files/GenerateJava.emtl
cannot be relied upon.  A known good copy is maintained and used from this folder.