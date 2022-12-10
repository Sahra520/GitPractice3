package day12_Scanner;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=scan.nextInt();

        System.out.println("Enter you gender:");
        String gender=scan.next();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();

        System.out.println("Enter your phone number:");
        long phone=scan.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode=scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name:");
        String schoolName=scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName= scan.nextLine();

        System.out.println("Enter your state name:");
        String state= scan.next();

        System.out.println("Enter your building number:");
        int buildingNumber= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName= scan.nextLine();
        scan.close();

        System.out.println("Full name = " + fullName);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Phone number = " + phone);
        System.out.println("Address: \n\t"+buildingNumber+" "
       +streetName+"\n\t"+cityName+", "+ state+" "+zipCode
        +"\n\t"+schoolName);
    }
}
/*
Create a class called MyInfo.
Write a program that can ask the user to:
1.  Enter your age (int)
2.  Enter your gender(String-one word only-- next()--nextLine())
3.  Enter your full name(String-multiple words--nextLIne())
4.  Enter your phone number(long)  --nextLong();
5.  Enter your zip code(int) nextInt() + nextLine()
6.  Enter your school name (String-can be multiple words----nextLine())
7.  Enter your city name(String-can be multiple words---nextLine())
8.  Enter your state name(String-one word only--next())
9.  Enter your building number (int)----nextInt  ---NextLine();
10. Enter your street name(more than one word--nextLine()
MAKE SURE CAN ENTER ALL THE INPUT

Display all the inputs that user entered in following order
in separate lines:
1. Full name
2. age
3. gender
4. phone number
5. address:
          BuildingNumber,Street
          city,state,zipcode
6. school name
 */