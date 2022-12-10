package day12_Scanner;

public class GradeLevel_IfAndSwitchStatement {
    public static void main(String[] args) {
byte number=0;
String result="";
if(number>=1 && number<=18){
    switch (number) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            result = "Elementary school";
            break;
        case 6:
        case 7:
        case 8:
            result = "Middle school";
            break;
        case 9:
        case 10:
        case 11:
        case 12:
            result = "High school";
            break;
        case 13:
        case 14:
        case 15:
        case 16:
            result = "College";
            break;
        default:
            result = "Grad school";
            break;
    }

     }else{
        result="Invalid grade level given";
    }
        System.out.println(result);

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