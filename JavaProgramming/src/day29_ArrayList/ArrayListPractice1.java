package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        /*
    1. Create an Array of string called country names
    2. Write a program that can remove all the country names that have length of 10 or greater
         */
  String[] countries = {"Japan","Korea","United States","United Kingdom","Canada","Turkmenistan"};
  //converting array to arraylist
        ArrayList<String>list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p->p.length()>=10);

        //converting arraylist to array
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));//[Japan, Korea, Canada]












    }
}
