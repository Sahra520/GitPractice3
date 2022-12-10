package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] array3 = {7,8,9};

        int[][]arr2D = { {1,2,3}, {4,5,6}, {7,8,9} };

        //3 dimensional array contains 2 dimensional arrays
        //                       0        1        2                 0           1           2
        int[][][] arr3D = { { {1,2,3}, {4,5,6}, {7,8,9} },     { {10,20,30}, {40,50,60}, {70,80,90} } };
        //                                0                                1
        //[index num of 2DArray] [Index num of 1DArray] [Index number of elements]
        System.out.println(Arrays.deepToString(arr3D));

        //[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]
        //                 0                                       1

        System.out.println(Arrays.deepToString(arr3D[1]));
        //[[10, 20, 30], [40, 50, 60], [70, 80, 90]]

        System.out.println(Arrays.toString(arr3D[1][1]));
        //[40, 50, 60]

        System.out.println(arr3D[0][2][2]);//9

        for(int[][] each2D:arr3D){
            for (int[] each1D:arr2D){
                for (int element:each1D){
                }
            }
        }

        System.out.println("-----------***-----------");

        int[][][][] arr4D={ { { {1,2,3}, {4,5,6}, {7,8,9} },     { {10,20,30}, {40,50,60}, {70,80,90} } } };
        //         index of 4DArray                           0

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int element : each1D) {
                        System.out.print(element+" ");
                        
                    }
                    
                }
                
            }
            
        }
    }
}
