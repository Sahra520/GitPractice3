package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        arr=addInteger(arr,5);

       //System.out.println(arr);//[I@4c203ea1
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]


        System.out.println("------***------");


    double[] arr2 = {1.3, 2.5, 45.78, 89.45};
    arr2=addDouble(arr2,5.55);
        System.out.println(Arrays.toString(arr2));//[1.3, 2.5, 45.78, 89.45, 5.55]


        System.out.println("------***------");


        String[] names={"Tatiana", "Aleksandra", "Lydia", "Marcus"};//"Sam"

        names = addString(names,"Sam");
        System.out.println(Arrays.toString(names));// [Tatiana, Aleksandra, Lydia, Marcus, Sam]


        System.out.println("------***------");


        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addChar(chars,'E');
        System.out.println(Arrays.toString(chars));//[A, B, C, D, E]

        chars = addChar(chars,'N');
        System.out.println(Arrays.toString(chars));//[A, B, C, D, E, N]

        chars = addChar(chars,'M');
        System.out.println(Arrays.toString(chars));//[A, B, C, D, E, N,M]
    }

/*
1.  create a return method called addInteger that can add an Integer after the last index of an integer array
{1,2,3,4},5 if we want to add 5 number to array we have to create
new array==> {1,2,3,4,5}
*/
    public static int[] addInteger(int[] array, int element){
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
    public static double[] addDouble(double[] array, double element){
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

    public static String[] addString(String[] array, String element){
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
public static char[] addChar(char[] array, char element){
    char[] result = new char[array.length+1];
    int i = 0;
    for (char each : array) {
        result[i++]=each;
    }
    result[i] = element;
    return result;
}


}
