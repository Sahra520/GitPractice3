package day07_Operators;

public class PreIncrement_Decrement {
    public static void main(String[] args) {
        /**
         * Increment/decrement operators are placed before the operand
         * Increases/decreases the value by 1 in the memory

         */
        int a=25;
        ++a;//pre increment : increases the value by 1 right away
        System.out.println(a);
        int b = 30;
        --b;//pre decrement : decreases the value by 1 right away
        System.out.println(b);

        System.out.println("******************************");

        int c = 100;
        System.out.println(c++);/*post increment;
        first passes the current value, then increases the value*/
        System.out.println(c); //101

        System.out.println("*********************");

        int d=200;
        System.out.println(--d);
        //pre decrement: decreases the value by 1 right away

        int i = 300;
        System.out.println(i--);//300
        System.out.println(i);//299
        /*post decrement:first passes the curren value,
        then decreases the value 1
         */

     //post increment / decrement
        /**
         * increment/decrement operators are placed after the operand
         * old value of variable will be used first before increases/decreases
         the value by 1 in the memory
         */

        System.out.println("*********************");
        int z=45;
        System.out.println(++z);//46
        System.out.println(z++);//46, but in memory 47
        System.out.println(z);//47
        System.out.println("");
        int q=30;
        System.out.println(--q); //29
        System.out.println(q--); //29, but in memory 28
        System.out.println(q); //28


    }
}
