package day34_GarbageCollection_AccessModifiers;

public class classNotes_AccessModifiers {
    /*

  Access modifiers : define the accessibility





 There are 4 access modifiers available in Java:

public > protected > default > private

   * public: ALWAYS reachable

   * protected; when we talk about non-primitive inherit, then we will came back and learn

   * default(no modifier): ONLY reachable within the same package

   * private: ONLY reachable within the same class


 A top level java class can have two access modifiers: public and default
 (if we want to use access modifier in "class" we have to use just 2)_|^

 Variables, Constructors and methods can have all four access modifiers

1. Conditions for Private Constructor
A private constructor does not allow a class to be subclassed.
A private constructor does not allow to create an object outside the class.
If all the constant methods are there in our class we can use a private constructor.
If all the methods are static then we can use a private constructor.
If we try to extend a class which is having private constructor compile time error will occur.
2. Typical Usage
- The singleton pattern
- Delegating constructors
- Uninstantiable classes
- The builder pattern
As far as I understand, it is possible and used for some reason, but I think the usage of a private constructor is out of our scope. For further reading:
https://www.baeldung.com/java-private-constructors
https://www.tutorialspoint.com/can-we-declare-a-constructor-as-private-in-java#:~:text=Yes%2C%20we%20can%20declare%20a,in%20the%20Singleton%20Design%20Pattern
https://stackoverflow.com/questions/2816123/can-a-constructor-in-java-be-private













     */















}
