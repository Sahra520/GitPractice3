package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {10,20,30,40};
        int[] arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 10, 20, 30, 40]
    }


    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+ arr2.length];

        int i = 0;

        for (int each : arr1) {
           result[i++]=each;
        }

        for (int each : arr2) {
           result[i++]=each;
        }
        return result;
    }
}
