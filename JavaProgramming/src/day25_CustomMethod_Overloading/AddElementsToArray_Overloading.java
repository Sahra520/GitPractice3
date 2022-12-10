package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};//7
        numbers=addElement(numbers,7);


        char[] chars = {'A', 'B', 'C', 'D'};//'E'
        chars=addElement(chars,'E');


        String[] names = {"Ahmet", "Marcus", "Sam", "Birol"};//"Lydia"
        names=addElement(names,"Lydia");

        System.out.println("names = " + Arrays.toString(names));//names = [Ahmet, Marcus, Sam, Birol, Lydia]
        System.out.println("chars = " + Arrays.toString(chars));//chars = [A, B, C, D, E]
        System.out.println("numbers = " + Arrays.toString(numbers));//numbers = [1, 2, 3, 4, 5, 6, 7]











    }


  /*
  1.  create a return method called addInteger that can add an Integer after the last index of an integer array
    {1,2,3,4},5 if we want to add 5 number to array we have to create
new array==> {1,2,3,4,5}
*/
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }




    /*
    2.  create a return method called addDouble that can add a Double after the last index of a double array
    */
    public static double[] addElement(double[] array, double element){
        double[] doubles = new double[array.length + 1];
        int i = 0;
        for (double each:array){
            doubles[i++]=each;
        }
        doubles[i]=element;//element need to be assigned to the last index
        //doubles[doubles.length-1]=element; // same the previous line
        return doubles;
    }




/*
3.  create a return method called addString that can add a String after the last index of a String array
*/

    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];
        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }




    /*
   4.  create a return method called addChar that can add a char after the last index of a char array
    */
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i = 0;
        for (char each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }



}
