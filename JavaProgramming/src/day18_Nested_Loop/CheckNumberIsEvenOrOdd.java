package day18_Nested_Loop;

import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    while (true) {
        System.out.println("Please enter a number:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

        System.out.println("Would you like to enter another number?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){//if the answer is invalid(not yes nor no)
            System.err.println("Please re-enter, would you like to enter another number?");
            answer = scan.next().toLowerCase();
        }
        if (answer.equals("no")){
            break;
        }
    }
    scan.close();
    }
}
/*
write a program that asks user to enter a number,
and check if the number is odd or even.
  if it's odd, print "Odd Number"
  if it's even, print "Even Number"

  Ask the user "Would you like to enter another number"
  if user enters "yes", repeat the previous steps
  if user enters "no", print nothing.

  If user enters invalid answer, repeat the previous steps.
 */