package day11_SwitchStatement;

public class SalaryAfterTaxBased {

    public static void main(String[] args) {
double salary=100_000;
boolean isMarried=true;
double taxRate=0;

if (salary>=130_000){ //false: salary<130.000
    taxRate=0.35;
} else if (salary>=100_000) { //false salary<100.000
    taxRate=0.30;
} else if (salary>=80_000) { //false: salary<80.000
    taxRate=0.25;
}else {
    taxRate=0.20;
}

if (isMarried){ //if the person is married
    taxRate-=0.05; //subtracting 5% from the original tax rate
}
double salaryAfterTax=salary-(salary*taxRate);
        System.out.println("Salary after tax= "+ salaryAfterTax);
    }
}
/*
Write a program that can calculate the salary after
tax based on the following requirements.
The tax rates are:
35% for salary of 130_000 or more
30% for salary of 100_000 to 130_000 (excluded)
25% for salary of 80_000 to 100_000 (excluded)
20% for salary of 80_000 or more
in addition, if the person is married, he/she will pay 5% less tax
 */