package day08_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 75;
        int b = 83;
        int c =91;
        boolean res1=a<b && a>c;
        boolean res2=b>a && b<c;
        boolean res3=c<a && c>b;
        if(res1){
            System.out.println(a + " is median number");
        }
        if(res2){
            System.out.println(b + " is median numnber");
        }
        if(res3){
            System.out.println(c + " is median number");
        }
    }
}
/*
Create a class called MedianNumber, write a program that can
find the median number between three different given integers.
Ex:
a=10; b=15; c=20;
output:
15 is the median number
 */