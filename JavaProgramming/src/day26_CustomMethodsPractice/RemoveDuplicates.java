package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,2,2,2,23,5,3,4,3,3,4,6,4,4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));//[1, 2, 23, 5, 3, 4, 6]


        System.out.println("---------------------");


        String[] str = {"Java", "Java", "Python", "C#", "C++", "C#", "Automation"};

        str = removeDuplicates(str);

        System.out.println(Arrays.toString(str));
        //[Java, Python, C#, C++, Automation]


        System.out.println("-------------------------");

/*
        int[] arr2 = {1,2,3,12,1,23,1,2,3,4,32,1,2,};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println(Arrays.toString(arr2));
        //[1, 2, 3, 12, 23, 4, 32]
*/
    }



    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
         int [] result = {};//{1,2,3}
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)) {
               result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double [] result = {};//{1,2,3}
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char [] result = {};//{1,2,3}
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String [] result = {};//{1,2,3}
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}
