package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {


    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index){
                result = ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
}
/*
2. Create a class named RemoveElements:
2.1 Create a method that passes two
parameters: an integer array and an integer index. the method removes the
element at the given index of the array and returns the new array
Ex:
int[] arr =
{10,20,30,40}
removeElement(arr, 2) ==> {10, 20, 40}
2.2 Create a method that passes two
parameters: a double array and an integer index. the method removes the
element at the given index of the array and returns the new array
2.3 Create a method that passes two
parameters: a char array and an integer index. the method removes the
element at the given index of the array and returns the new array
2.4 Create a method that passes two
parameters: a String array and an integer index. the method removes the
element at the given index of the array and returns the new array
 */