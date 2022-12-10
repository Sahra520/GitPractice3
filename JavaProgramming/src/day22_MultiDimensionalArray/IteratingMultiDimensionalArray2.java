package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {
        int[][] array2D = {{1,2,3},{4,5,6,7},{8,9, 10, 11, 12}};

        for (int i =array2D.length-1; i >= 0 ; i--) {
        //i: index number of 1D arrays starting from last index to 0
            for (int j = 0; j < array2D[i].length; j++) {
        //j: index number of elements starting from 0 to last index
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }
/*
8 9 10 11 12
4 5 6 7
1 2 3
 */
        System.out.println("---------------------------");


        for (int i = 0; i < array2D.length; i++) {// i: index of each 1D array started from 0
            //array2D.fori
            for (int j = array2D[i].length-1; j >= 0; j--) {// j: indexes of each element starting from last index 0
           //array2D[i].forr
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }
        /*
        3 2 1
        7 6 5 4
        12 11 10 9 8
         */

        System.out.println("-------------");



    }
}
/*
task1:
8 9 10 11 12
4 5 6 7
1 2 3

task2:
3 2 1
7 6 5 4
12 11 10 9 8
*/
