package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int min=2147483647;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number : ");
            int num = scan.nextInt();

            if (num<min){//if the user entered number greater than current number
                min=num;
            }

        }
        System.out.println("The minimum number: " + min);

        scan.close();
    }
}
/*
Write a program that asks the user to enter a number for 5 times,
return the minimum number
 */