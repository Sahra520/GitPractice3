package day30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

//  1. write a program that can swap the first and last elements of an ArrayList
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,2,3,4,5,6,7,8,9,1));

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("---------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("------------------------");


  /*    2. write a program that can move all the zeros to the last indexes of Arraylist

        not: do not create any additional arraylist

             ex: list:{1,0,2,0,3,0,4,0}
             output:{1,2,3,4,0,0,0,0}                                  */

        //solution without using second arraylist
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);//[1, 0, 2, 0, 3, 0, 4, 0]

        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);//[1, 2, 3, 4]

        int newSize = list.size();

        int totalNumberOfZeros = size-newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);//totalNumberOfZeros = 4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("------------------------------------");

        //solution with using second arraylist

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer>result = new ArrayList<>();
        for (Integer each : list2) {
            if (each!=0){
                result.add(each);
            }
        }
        System.out.println(result);//[1, 2, 3, 4]

        for (Integer each : list2) {
            if (each==0){
                result.add(each);
            }
        }
        System.out.println(result);//[1, 2, 3, 4, 0, 0, 0, 0]


        System.out.println("-------------------------------------");

 /*     3. write a program that can extract the special characters, digits and letters from a string
        and stores them into separate ArrayLists of Characters
             ex:
               str = "ABCD123$%@&456EFG!"
               output:
                     list1:{1, 2, 3, 4, 5, 6}
                     list2:{A, B, C, D, E, F, G}
                     list3:{$, %, @, &, !}                                */

        String str = "ABCD123$%@&456EFG!";

        ArrayList<Character> chars= new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars);//[A, B, C, D, 1, 2, 3, $, %, @, &, 4, 5, 6, E, F, G, !]

        ArrayList<Character>letters = new ArrayList<>(chars);
        letters.removeIf(p->!Character.isLetter(p));//remove the characters that are not letters
        System.out.println("letters = " + letters);//letters = [A, B, C, D, E, F, G]


        ArrayList<Character>digits = new ArrayList<>(chars);//add all the characters
        digits.removeIf(p->!Character.isDigit(p));//remove the characters that are not digits
        System.out.println("digits = " + digits);//digits = [1, 2, 3, 4, 5, 6]


        ArrayList<Character>specialChars = new ArrayList<>(chars);

       // specialChars.removeIf(p->Character.isLetterOrDigit(p));
        //                or
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);

        System.out.println("specialChars = " + specialChars);//specialChars = [$, %, @, &, !]



    }
}
