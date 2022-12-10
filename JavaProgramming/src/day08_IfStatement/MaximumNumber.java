package day08_IfStatement;

public class MaximumNumber {
    public static void main(String[] args) {

        /*
        Write a program that can print the maximum number between two numbers,
        if both are equal then print Equal
             Ex:
              n1 = 100, n2 = 200;
            Output:
               200 is maximum number
         */
        int n1 = 300, n2 = 200;
        boolean maximumNumber1 = n1>n2;
        boolean maximumNumber2 = n2>n1;
        if(maximumNumber1){
            System.out.println(n1 + " is maximum number");
        }
        if(maximumNumber2){
            System.out.println(n2 + " is maximum number");
        }
    }
}
