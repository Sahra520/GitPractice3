package day09_IfStatements;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int n=100;
        boolean positive = n>0;
        boolean negative = n<0;


        if(positive) {
            System.out.println(n+" is positive");
        } else if (negative) {
            System.out.println(n+" is negative");
        }else {
            System.out.println(n+ " is zero");
        }


    }
}
