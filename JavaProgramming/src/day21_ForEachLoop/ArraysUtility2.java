package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {
        /*copyOf(array, newLength):copies the element of the array,
        starting from first element to given number, returns new array
         */


        String[] students={"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Daniel", "Aaron"};
        String[] earlyBirds= Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));//[Elif, Sinem, Gunay]

        System.out.println("******************");

        int[]numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4, 5]

        System.out.println("---------------------------");

        /*copyOfRange(array,beginningIndex,EndingIndex)::copies
        the element of the array,starting from beginningIndex till endingIndex
        (ending index excluded), returns new array
         */

        char[] ch1 = {'A','B', 'C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,8);
        System.out.println(Arrays.toString(ch2));

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //index:        0   1  2  3  4  5  6  7  8  9
        int[] result =Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));

    }
}
//copyOf(array, newLength)