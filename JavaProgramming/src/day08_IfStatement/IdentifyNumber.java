package day08_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {
      int number = -100;

      boolean positive=number>0;
      boolean negative=number<0;
      boolean zero=number==0;
        System.out.println(number +" is zero = " + zero);
        System.out.println(number+" is negative = " + negative);
        System.out.println(number+" is positive = " + positive);

    }
}
  /*
             Warm task:
        1. Create a class called IdentifyNumber,and write a program that can
        identify if the given number is positive, or negative, or zero.
        Ex:
        number = 200;
        output:
        200 is positive number:true
        200 is positive number:false
        200 is positive number:false
         */