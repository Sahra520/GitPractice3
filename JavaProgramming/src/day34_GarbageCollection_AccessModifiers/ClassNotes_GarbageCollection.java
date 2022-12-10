package day34_GarbageCollection_AccessModifiers;

public class ClassNotes_GarbageCollection {

    /*
    Static Block: used for initializing static variables
    gets executed as soon as the class is loaded
       runs first before everything, only runs one time
if the static variables need several steps to be initialized


static import vs regular import

regular import: imports everything from the class
     import packageName.className;
     import packageName.*;//if you want import all the classes we use this type  .*

static import:  with the help of import, we are able to access classes and interfaces
which are present in any package.But using static import, we can access all the static
members (variables and methods) of a class directly without explicitly calling class name.
     import static packageName.className.staticMember;  // imports one static member from a class
     import static packageName.className.*  // imports all the static members from a class


Garbage Collection: Collection of unreferenced objects/for non-primitives
group of garbage objects

     unreferenced objects:
     1. null keyboard
         String str = "Java";
         str = null;

     2. creating a new object:
         String str = "Java";
         str = "Python";


Garbage Collector: responsible for collecting the unreferenced objects
 from java heap and destroys it( finalize())
collector is a process




Access Modifiers:



     */


















}
