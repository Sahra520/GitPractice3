package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String name=input.nextLine();

        System.out.println("GPA: ");
        double num=input.nextDouble();

        input.nextLine();

        System.out.println("Enter school name: ");
        String school=input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("GPA:"+num);
        System.out.println("school name = " + school);

        input.close();
    }
}
/*
1. Ask the user to enter age
2. Ask the user to enter full name
 */