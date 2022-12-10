package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 10, 15, 30, 40, 45, 30 };
        arr1 = replaceAll(arr1,30,300);

        System.out.println(Arrays.toString(arr1));
        //[10, 20, 300, 10, 15, 300, 40, 45, 300]

        arr1=replaceAll(arr1,300,500);
        System.out.println(Arrays.toString(arr1));
         //[10, 20, 500, 10, 15, 500, 40, 45, 500]



    }
//replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array,int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }



    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array,double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }




    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array,char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }




    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array,String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
    }

}

   /*
         ReplaceAll
  2.1  1.1 Create a method named replace that passes three parameters: integer array,
integer oldElement, integer newElement. The method replaces all the element of the array
that matching with the given old element with the given new element, and returns the new array.
         Ex:
         arr = {10, 20, 30, 10, 15, 30, 40, 45, 30}
         replaceAll(arr, 30, 300)===>{10, 20, 300, 10, 15, 300, 40, 45, 300}
  2.2 Create the same functions for double arrays, char arrays and String arrays.
     */