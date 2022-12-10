package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        //interview question

        int[] numbers = {10, 20, 30, 40, 50};
        //                0   1   2   3   4
        int[] reversed= new int[numbers.length];//expecting output:{50, 40, 30, 20, 10}
        /*to make sure that the array has enough  capacity to contain all the
        elements of first array*/
/*
                 j            i
        reversed[0] = numbers[4];
        reversed[1] = numbers[3];
        reversed[2] = numbers[2];
        reversed[3] = numbers[1];
        reversed[4] = numbers[0];
        System.out.println(Arrays.toString(reversed));
*/

        for (int i = numbers.length - 1,j=0; i >= 0; j++,i--) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));


    }
}
