package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your hourly rate: ");
        double hourlyRate= scan.nextDouble();

        System.out.println("Enter here how many hours you work in a week: ");
        double weeklyWorkHours= scan.nextDouble();

        System.out.println("Enter state tax: %");
        double stateTax= scan.nextDouble();

        System.out.println("Enter federal tax: %");
        double federalTax=scan.nextDouble();

        double salary=hourlyRate*weeklyWorkHours*4;
        double totalTax=(salary*stateTax)+(salary*federalTax);
        double netIncome=salary-totalTax;

        System.out.println("Net income: " + netIncome);

        scan.close();
    }
}
/*
Ask the user to enter his or her hourlyRate
Ask the user how many hours he/she works in a week
Ask the user to enter state tax (in percentage)
Ask the user to enter federal tax(in percentage)
Calculate the:
       salary
       stateTax
       federalTax
       totalTax
       netIncome
 */