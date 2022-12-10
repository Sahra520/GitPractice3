package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str = "acdb";
        String str2 = "dbca";

        char[] ch1=str.toCharArray();
        char[] ch2=str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        //[a, c, d, b]
        //[d, b, c, a]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        //[a, b, c, d]
        //[a, b, c, d]

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);//true
    }
}
//write a program that can check if str1 & str2 are build out same characters
//use charAt() and compare, if its same characters ==true