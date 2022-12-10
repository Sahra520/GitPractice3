package java03_09_24_22;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);//5
        System.out.println(++a);//6
        System.out.println(--a);//5
        
        int x = 10;
        int number = x++ +100;
        System.out.println("number = " + number);//110 but in memory 111
        
        int number2 = ++x + 100;
        System.out.println("number2 = " + number2);//112 because x was in memory 11



    }
}
