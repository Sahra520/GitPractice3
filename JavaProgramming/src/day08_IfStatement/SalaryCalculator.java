package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {

        int  hourlyRate = 50,
             weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;
     //--------------------------------------------
     int salaryBeforeTax = hourlyRate * weeklyHours * 52;
     //^salary is equal to one week's salary * 52;
     double stateTax = salaryBeforeTax * stateTaxRate / 100;
     double federalTax = salaryBeforeTax * federalTaxRate / 100;
     double totalTax = stateTax + federalTax;
     double salaryAfterTax = salaryBeforeTax - totalTax;
     //-------------------------------------------------------
        System.out.println("Gross pay is: $" +salaryBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income = $" + salaryAfterTax);


    }
}
/*
create a class called SalaryCalculator.java
    1. declare the following variables:
     hourlyRate, weeklyHours,stateTaxRate,federalTaxRate
    2. use the given info on above variables to calculate the followings:
      1.salaryBeforeTax
      2.stateTax
      3.federalTax
      4.totalTax
      5salaryAfterTax

 Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52;
    3. use print statement to print each of the above
       Ex:
          hourlyRate = 50$
          weeklyHours = 45$
          State Tax is = 6 (given as percentage,you need to convert to decimal)
          federalTax = 26 (given as percentage,you need to convert to decimal)

     output:
          Gross pay is = $117000
          Total tax is = $30420
          State tax is = $7020
          Total tax is = $37440
          Net income is = $79560

 */