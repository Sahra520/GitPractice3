package day19_LoopPractices;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        Random random= new Random();

        int hiddenNumber= random.nextInt(10)+1;

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Enter a number:");
            int searchedNumber = scanner.nextInt();
            if (searchedNumber==hiddenNumber){
                System.out.println("You find hidden number. Congrats!");
                flag=false;
            }else {
                System.out.println("Try again");
            }
        }while (flag);
        scanner.close();
    }
}
