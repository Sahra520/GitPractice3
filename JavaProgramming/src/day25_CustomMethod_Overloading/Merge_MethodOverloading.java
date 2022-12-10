package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Merge_MethodOverloading {
    public static void main(String[] args) {
/*
Task1:
1. create a method that can merge two integer arrays. |   merge(int[] arr1,int[] arr2)
2. create a method that can merge two double arrays.  |   merge(double[] arr1,double[] arr2)
3. create a method that can merge two char arrays.    |   merge(char[] arr1,char[] arr2)
4. create a method that can merge two String arrays.  |   merge(String[] arr1,String[] arr2)
   merge()
*/
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {12,23,45,566,36};

       int[] array=merge(arr1,arr2);
       //we don't print here because we used print inside the method overloading
      //[1, 2, 3, 4, 12, 23, 45, 566, 36]


    }

    public static int[] merge(int[] arr1,int[] arr2) {
        int[] numbers = new int[arr1.length+ arr2.length];//6
        int i = 0;
        for (int each : arr1) {//"Ahmet", "Yusup", "Tarik"
            numbers[i++]=each;
        }
        for (int each : arr2) {//"Hatice", "Fatma", "Zeynep"
            numbers[i++] = each;
        }
        System.out.println(Arrays.toString(numbers));
     return numbers;
    }



}
