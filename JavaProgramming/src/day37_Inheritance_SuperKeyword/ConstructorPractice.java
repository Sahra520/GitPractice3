package day37_Inheritance_SuperKeyword;


//default class

class A{

    public A(int a){//when the parent class has not default() constructor,
        // child class must have to give super keyword explicitly
        System.out.println("A");
    }

}

class B extends A{


    public B(){//when the parent class has not default() constructor,
        // child class must have to give super keyword explicitly
        super(9);
        System.out.println("B");
    }
}




public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();
    }

}
