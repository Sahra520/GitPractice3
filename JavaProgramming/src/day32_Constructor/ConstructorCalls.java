package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();//calling first constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str) {
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println(obj1);
        // Default Constructor


        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println(obj2);
        // Default Constructor
        // Constructor with int argument


        ConstructorCalls obj3 = new ConstructorCalls("Java");
        System.out.println(obj3);
        // Default Constructor
        // Constructor with int argument
        // Constructor with String argument
    }


}
