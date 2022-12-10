package week05_08_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {

        //we will create  basic clculator which has + - / *
        //with the Switch case
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number: ");
        double number1= scanner.nextDouble();

        System.out.println("Please enter second number: ");
        double number2= scanner.nextDouble();

        System.out.println("Please enter your operator");
        char operator=scanner.next().charAt(0);
        //we don't  know nextChar method,
        // so we need to use our String method which is charAt(0)
        double result=0;
        switch (operator){
            case '+':
                result=number1+number2;
                break;
            case '-':
                result=number1-number2;
                break;
            case '/':
                result=number1/number1;
                break;
            case '*':
                result=number1*number2;
                break;
            default:
                System.out.println("operator is wrong");
        }
        System.out.println(result);
    }
}
