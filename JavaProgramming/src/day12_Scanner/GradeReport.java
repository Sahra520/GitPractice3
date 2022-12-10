package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = scan.nextInt();

        String result = "";
            result =(score >= 0 || score >= 100)?  (score<=100 &&score >= 90)?"Excellent"
                    :(score<=90 && score>=80)?"Great"  :(score<=80 && score>=70)?"Good"
                    :(score<=70 && score>=60)?"Passed" :"Failed"  :"Invalid score";

        System.out.println(result);

        // out of range it gives wrong answer==failed


scan.close();

    }
}
/*
Grade report:
Ask the user to enter their (his or her) score
Print the grade of the student (A, B, C, D, F)
If the user enter invalid score (negative or more than 100) print "invalid score"
 */
