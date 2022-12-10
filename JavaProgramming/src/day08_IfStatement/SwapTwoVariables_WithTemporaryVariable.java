package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        //----------------------------------
        int c=b; //c=15;
        b=a;//b=10
        a=c;
        //----------------------------------
        System.out.println("a = " + a);//15
        System.out.println("b = " + b);//10
        System.out.println("c = " + c);//15


        System.out.println("----------------------------------------");

        int year = 2000;
        boolean isLeapYear = year % 4 == 0;
        System.out.println(year + " is leap year = " + isLeapYear);

    }
}
