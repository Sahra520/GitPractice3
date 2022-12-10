package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Nth_LargestNumber {

    public static void main(String[] args) {
        /*                            interview question
        Write a program that can return the nth largest number from an arraylist

        arraylist = {1,2,3,4,5,6,7,7,8,8}
        n = 5

        output: 5
        n: is here given the largest number of an arraylist

        //do not use sort method
         */
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 3;
        for (int i = 0; i < n; i++) {
            list.removeIf(p->Collections.max(list)==p);
        }

        int max = Collections.max(list);
        System.out.println(max);
    }
}
