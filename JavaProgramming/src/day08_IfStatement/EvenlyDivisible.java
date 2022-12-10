package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
       int number=12;

        boolean divisibleByThree= number % 3 == 0;
        boolean divisibleByTwo= number % 2 == 0;
        boolean divisibleByFive= number % 5 == 0;
        System.out.println(number+" divisible by 5 = " + divisibleByFive); //false
        System.out.println(number+" divisible by 2 = " + divisibleByTwo); //true
        System.out.println(number+" divisible by 3 = " + divisibleByThree); //true

    }
}
 /*
        Create a class called EvenlyDivisible and write a program that
        can check if a number is evenly divisible by 2,3,5
        Ex:
        number = 65;
        output:
        65 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true
        */
