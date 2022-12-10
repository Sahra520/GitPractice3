package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { //outer class, has public access modifier. Modifier static not allowed here


    //interview question: can class be static? yes but for that we need nested class and
    // static class must be inner class



    static class class1 { //inner class or nested class, has default modifier

    }

    public static int num = 100;//variable

    public static void method() { //method

    }


    static {  //block

    }
}


class A{//outer class
   static class B{  //inner class
       public static void method1(){
           System.out.println("hello");
       }
        }
}

class C{
    public static void main(String[] args) {
        A.B.method1();// hello
    }
}





