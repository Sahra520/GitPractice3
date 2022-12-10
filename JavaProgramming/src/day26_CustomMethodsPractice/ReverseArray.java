package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));//[5, 4, 3, 2, 1]

    }
//reverses the given array, returns a new array
    public static int[] reverse(int[] array){
        //                   ( 1, 2, 3, 4, 5 )
        int[] result = new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }




    //reverses the given array, returns a new array
    public static double[] reverse(double[] array) {
        //                   ( 1, 2, 3, 4, 5 )
        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }



    //reverses the given array, returns a new array
    public static char[] reverse(char[] array) {
        //                   ( 1, 2, 3, 4, 5 )
        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }



    //reverses the given array, returns a new array
    public static String[] reverse(String[] array) {
        //                   ( 1, 2, 3, 4, 5 )
        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


}
