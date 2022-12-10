package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class uniqueElements {

    public static void main(String[] args) {
        int[] array = {32,4,435,34, 443, 34, 34,5,5,21,2,12};

        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));
        //[32, 4, 435, 443, 21, 2, 12]


        System.out.println("------------------");


        double[] array2 = {1.5, 2.5, 3.5, 1.5, 4.5, 2.5};
        double[] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));//[3.5, 4.5]




    }
    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {};//new int[0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                //if the frequency is one, the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {};//new int[0]
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                //if the frequency is one, the element is unique
            result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



   public static char[] uniqueElements(char[] array){
        char[] result = {};//new char[0]
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                //if the frequency is one, the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


 
    public static String[] uniqueElements(String[] array){
        String[] result = {};//new String[0]
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                //if the frequency is one, the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }





}
