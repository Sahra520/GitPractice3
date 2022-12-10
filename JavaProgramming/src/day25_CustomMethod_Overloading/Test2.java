package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {


        int[] arr1 = {1,2,5,4,3};
        ArraysUtility.printEachElement(arr1);


        System.out.println("--------");


        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEachElement(arr2);


        System.out.println("-----------------");


        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(arr3);


        System.out.println("-----------");


        String[] arr4 = {"Java", "Python", "Selenium", "C#"};
        ArraysUtility.printEachElement(arr4);


        System.out.println("----------------");


        int[] n1 = {1,2,3,6,5,4};
        int max1 = ArraysUtility.max(n1);
        System.out.println("maximum number = " + max1);


        System.out.println("--------------");


        double[] n2 = {23.4, 54.3, 5.6, 32.3};
        double max2 = ArraysUtility.max(n2);
        System.out.println("maximum number = " + max2);

        System.out.println("------------------");


        int[] a1 = {1,2,3,4,5,6,7};
        boolean r1 =ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);


    }
}
