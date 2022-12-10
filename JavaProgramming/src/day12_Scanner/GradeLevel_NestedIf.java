package day12_Scanner;

public class GradeLevel_NestedIf {
    public static void main(String[] args) {
byte gradeLevel=1;
boolean elementaryGrade=gradeLevel>=1 && gradeLevel<=5;
boolean middleSchool=gradeLevel>=6 && gradeLevel<=8;
boolean highSchool=gradeLevel>=9 && gradeLevel<=12;
boolean college=gradeLevel>=13 && gradeLevel<=16;
boolean gradSchool=gradeLevel>=17 && gradeLevel<=18;


    }
}
/*
Create a class called GradeLevel. Given a number(byte) grade level determine
and print which school type someone is in.
Grade level and types are:
1-5  : Elementary school
6-8  : Middle school
9-12 : High school
13-16: College
17-18: Grad School

For any other grade: Invalid grade level given

Note:
Solution 1: Use switch statement
Solution 2: Ise if & switch both

 */
