package Presentations;

public class NestedIfTernaries {

    public static void main(String[] args) {

        int score =100;
        String result = "";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
            result = "Grade-A. Excellent";
        } else if (score >= 80) {
                result = "Grade-B. Great job";
            } else if (score >= 70) {
                result = "Grade-C. Good";
            } else if (score >= 60) {
                result = "Grade-D. Passed";
            }else{
                result = "Grade F. Failed";
            }
        } else {
            result = "Invalid score";
    }
    System.out.println(result);

        System.out.println("--------------------");

        String result1 = "";

        result1= (score >= 0 && score <= 100)?(score >= 90)?result = "Grade-A. Excellent" : (score >= 80)?"Grade-B. Great job" :
                (score >= 70)? "Grade-C. Good" : (score >= 60)? "Grade-D. Passed" : "Grade F. Failed" : "Invalid score";
    }
}
/*
3. Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
otherwise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */