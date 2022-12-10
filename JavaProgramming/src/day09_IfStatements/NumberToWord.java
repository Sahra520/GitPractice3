package day09_IfStatements;

public class NumberToWord {

    public static void main(String[] args) {
        int number=10;
        String num="";
        if(number==1){
            num = "one";
        } else if (number==2) {
            num = "two";
        } else if (number==3) {
            num = "three";
        } else if (number==4) {
            num = "four";
        } else if (number==5) {
            num = "five";
        } else if (number==6) {
            num = "six";
        } else if (number==7) {
            num = "seven";
        } else if (number==8) {
            num = "eight";
        } else if (number==9) {
            num = "nine";
        } else{
            num = "Invalid number";
        }
        System.out.println(num);

    }
}
/*
1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */