package day11_SwitchStatement;

public class ConvertNumberToWord {

    public static void main(String[] args) {
         /*
         Write a program that can convert numbers 0~9 to words.
            NOTE: MUST use ternary
          */
        int num=2;
        String number="";
        if(num>=0 && num <=9){
            if(num==0){
                System.out.println("Zero");
            } else if (num==1) {
                System.out.println("One");
            } else if (num==2) {
                System.out.println("Two");
            } else if (num==3) {
                System.out.println("Three");
            } else if (num==4) {
                System.out.println("Four");
            } else if (num==5) {
                System.out.println("Five");
            } else if (num==6) {
                System.out.println("Six");
            } else if (num==7) {
                System.out.println("Seven");
            } else if (num==8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
        }else {
            System.out.println("Invalid number");
        }


        System.out.println("____________________________________________");

       int num1=2;
        String number1=(num1>=0 && num1 <=9)? (num1==0)?"Zero" :(num1==1)?"One"
        :(num1==2)?"Two" :(num1==3)?"Three" :(num1==4)?"Four" :(num1==5)?"Five"
        :(num1==6)?"Six" :(num1==7)?"Seven" :(num1==8)?"Eight" : "Nine"
        : "Invalid Number";
        System.out.println(number1);
    }
}
