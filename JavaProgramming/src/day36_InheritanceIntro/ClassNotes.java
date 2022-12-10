package day36_InheritanceIntro;

public class ClassNotes {
    /*

Encapsulation: hiding the fileds by giving private access modifiers

			  use getter/setter to read/write the private data


			  Getter (Read Only): public instance method
			  					  Return type is not void
			  					  Return type must match with private instance variable' data type
			  					  Does not pass any parameter
			  					  Returns the private instance variables value

			  Setter (Write Only): public instance method
			  					   Return type is void
			  					   Passes a parameter
			  					   Parameter' data type must match with private instance variable' data type
			  					   reassigns the private instance variable to given argument





use the data:
	1. read
	2. write



Inheritance Topic:
		Is A relation
		extends keyword
		super keyword & constructor
		Types of Inheritance
		Is A relation vs Has A relation
		Method Overriding



Today:
	Is A relation
	extends keyword

Tomorrow:
		super keyword & constructor
		Types of Inheritance


Next Thursday:
	Is A relation vs Has A relation
	Method Overriding


Next Friday:
	implement both Inheritance and Encapsulation





Task:

	Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()


	Dog extends Animal:
			bark()

	Cat extends Animal:
			scratch()

	Tiger extends Animal:
			roar()

	Fish extends Animal:
			swim()

	...



import vs extends:
		import: borrowing
		extends: owning


	inherit ->pass it through
	import -> let using





lunch task:

	Employee:
		name, gender, age, jobTitle, id, salary, companyName
		setInfo(), work(), toString()


	Tester

	Developer

	Driver

	Teacher




     */
}
