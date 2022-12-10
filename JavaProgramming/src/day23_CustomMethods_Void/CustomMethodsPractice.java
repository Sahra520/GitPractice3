package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5times();

 //if we want to go code fragment use press control button and click the highlighted helloWorld5times()

        System.out.println();

        helloCydeo5times();

        evenNumbers1_51();



    }


    public static void helloWorld5times() {
        //create a function that can print hello world 5 times==> Hello world 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    public static void helloCydeo5times(){
        //create a function that can print "Hello Cydeo!" 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    public static  void evenNumbers1_51(){
//create a function that can print all the even numbers from 1~100
        for (int i = 2; i <51 ; i+=2) {
            System.out.print(i+" ");
        }

}
    }




