package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class mergeGivenTwoArray {

    public static void main(String[] args) {

        int[] arr1={1,3,33,221,7676};
        int[] arr2 = {123,3424,324,23,25};

        int[] arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
        //[1, 3, 33, 221, 7676, 123, 3424, 324, 23, 25]


        System.out.println("-----------------");


        String[] str1 = {"Java", "C#"};
        String[] str2 = {"Python", "Javascript"};

        String[] str3 = ArraysUtility.merge(str1,str2);

        System.out.println(Arrays.toString(str3));//[Java, C#, Python, Javascript]
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }
}
