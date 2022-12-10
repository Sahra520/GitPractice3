package day18_Nested_Loop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 30;//a=30-7 = 23-7 = 16-7 = 9-7 = 2
        int b = 7;
        int count=0;//count=1+1 = 2+1 = 3+1 = 4

        while(a>=b){
            a-=b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);//4 2



    }
}
/*  Interview question
Write a program that can divide two positive numbers without using
/(division) and *(multiplication) and %(remainder) operators.
20/6==3
a=20
b=6

a-=b;//a=14
a-=b;//a=8
a-=b;//a=2

x=100
y=8
while(a>=b){
    a-=b;
    count++;
 }
 */



