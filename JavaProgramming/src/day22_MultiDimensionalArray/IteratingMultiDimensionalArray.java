package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

 //index of the elements:   0 1 3   0 1 2 3   0 1  2   3   4
        int[][] array2D = {{1,2,3},{4,5,6,7},{8,9, 10, 11, 12}};
        //          index:    0         1             2

        for (int i = 0; i < array2D.length; i++) {
            // i: index numbers of single dimensional arrays

            //System.out.println(Arrays.toString(array2D[i]));

            for (int j = 0; j <array2D[i].length ; j++) {
                // j: index number of elements

                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }


    }
}
/*
1 2 3
4 5 6 7
8 9 10 11 12

 */