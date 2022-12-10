package day21_ForEachLoop;

import java.util.Arrays;
public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {213, 56789, 678, 67, 567};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);//sorts the array in ascending order
        //System.out.println(numbers);//hashcode

        System.out.println(Arrays.toString(numbers));
        //"{213, 56789, 678, 67, 567,}" because of toString method

        System.out.println(numbers[0]);// element-213

        System.out.println("------------------");

        /*Arrays utility class:
        toString(): converts the array object(single dimensional) to string,
        returns string.
        sort(): sorts the array in ascending order
                ascending order: 0~10 smallest to largest/ -10~10/ a~z
         */

        int[] scores = {95, 100, 55, 65, 85, 78};
        System.out.println(Arrays.toString(scores));//[95, 100, 55, 65, 85, 78]
        Arrays.sort(scores);//[55, 65, 78, 85, 95, 100]
        System.out.println(Arrays.toString(scores));//[55, 65, 78, 85, 95, 100]

        System.out.println("Min Score: " + scores[0]);
        System.out.println("Min Score: " + scores[scores.length-1]);

        System.out.println("--------------------");

        String[] names = {"Ahmet", "Yusup", " Zeyneb", "Zuhal", "Anna", "Maria", "Hatice"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    //[ Zeyneb=621, Ahmet=495, Anna, Hatice, Maria, Yusup=550, Zuhal]

        String[] words = {"Anna", "ANNA", "Ahmet", "AHMET"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //equal(array1, array2)=will compare those characters index by index

        System.out.println("------------");

        int[] arr1 = {3,2,1};
        int[] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);//false

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);//true

        System.out.println("----------------");

        //"acb" , "bac"  anagram words: which contains same letters, like listen-silent;heart-earth
        char[] ch1= {'a', 'c', 'b'};
        char[] ch2= {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);//anagram = true

        System.out.println(" -------------- ");

        //copyOf(array, newLength)
    }
}
