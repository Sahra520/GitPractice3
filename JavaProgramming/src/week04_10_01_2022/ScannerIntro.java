package week04_10_01_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter one integer number");
        int intValue=scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.println("Please enter one double number");
        double doubleValue=scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

        scanner.nextLine();
        System.out.println("Give me the sentence");
        String sentence=scanner.nextLine();
        System.out.println("sentence = " + sentence);

        String sentence2= scanner.nextLine();
        System.out.println("sentence2 = " + sentence2);

        scanner.close();
    }
}
