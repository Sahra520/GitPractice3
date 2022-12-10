package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[][] array2D = {{1,2,3},{4,5,6,7},{8,9, 10, 11, 12}};
        //          index:    0         1             2
      /*  for (int[] each1DArray:array2D) {
            System.out.println(Arrays.toString(each1DArray));

        }
           //
             [1, 2, 3]
             [4, 5, 6, 7]
             [8, 9, 10, 11, 12]
             */

        for (int[] each1DArray:array2D) {
            for (int eachElement : each1DArray) {
                System.out.print(eachElement+" ");//1,2,3...12
            }
            System.out.println();
        }
/*

             [1, 2, 3]
             [4, 5, 6, 7]
             [8, 9, 10, 11, 12]
             */
        System.out.println("--------------------------------");


    }
}
/*
task3:
        12 11 10 9 8
        7 6 5 4
        3 2 1
        */