package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        /*
   Collections : utility class of collection
       sort():

       reverse():

       swap():

       max():

       min():

       replaceAll():

       frequency():
         */
        ArrayList<Integer>list = new ArrayList<>();

        list.addAll(Arrays.asList(12,123,677,14,155,56,342,323));

        Collections.sort(list);
        System.out.println(list);//[12, 14, 56, 123, 155, 323, 342, 677]

        System.out.println("-----------------------------");

        ArrayList<Character>list2 = new ArrayList<>();

        list2.addAll(Arrays.asList('A','B','C','D','E','F'));
        System.out.println(list2);//[A, B, C, D, E, F]

        Collections.reverse(list2);
        System.out.println(list2);//[F, E, D, C, B, A]

        System.out.println("-------------------------------");

        ArrayList<Integer>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3,1,4);
        System.out.println(list3);//[10, 50, 30, 40, 20, 60, 70]

        System.out.println("--------------------------------");

        int max = Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("min = " + min);//min = 10
        System.out.println("max = " + max);//max = 70


        System.out.println("-------------------------");

        ArrayList<Integer>list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4,10,1000);
        System.out.println("list4 = " + list4);//list4 = [1000, 1000, 20, 30, 40, 50, 1000, 1000, 1000]


        System.out.println(" ========================= ");

        int frequency= Collections.frequency(list4,1000);
        System.out.println("frequency = " + frequency);//frequency = 5


        System.out.println("---------------------------------");

        ArrayList<String>words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#"));

        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);//countJava = 2
        System.out.println("countPython = " + countPython);//countPython = 2
















    }
}
