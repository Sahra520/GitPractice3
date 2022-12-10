package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3NextLine {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name= scan.nextLine();

        System.out.println("Enter your programming language");
        String programming= scan.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName= scan.nextLine();

        System.out.println("Enter your age: ");
        int age= scan.nextInt();

        scan.nextLine();//capture the Enter key that user pressed for nexInt()

        System.out.println("Which programming languages do you know?");
        String programmingLanguage=scan.nextLine();

        System.out.println("Full name: " + name);
        System.out.println("age = " + age);
        System.out.println("School name = " + schoolName);
        System.out.println("Programming language: " + programming);
        System.out.println("Which programming languages do you know?: "+programmingLanguage);

        scan.close();

    }
}
