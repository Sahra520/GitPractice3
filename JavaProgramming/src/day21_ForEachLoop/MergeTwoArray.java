package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {
// interview question

       String[] group1 = {"Ahmet", "Yusup", "Tarik"};//3
       String[] group2 = {"Hatice", "Fatma", "Zeynep"};//3

       String[] students = new String[group1.length+ group2.length];//6
        int i = 0;
        for (String each : group1) {//"Ahmet", "Yusup", "Tarik"
            students[i++]=each;
        }
        for (String each : group2) {//"Hatice", "Fatma", "Zeynep"
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("----------------");

        char[] ch1= {'A','B', 'C'};
        char[] ch2={'D','E','F','G','H'};
        char[] chars = new char[ch1.length+ ch2.length];
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        int j = 0;
        for (char ch:ch1) {
            chars[j]=ch;
            j++;
        }
        for (char ch:ch2) {
            chars[j] = ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));
    }
}
/*
write a program that can merge two arrays of integers
     ex:
       arr1 = {1,2,3,4};
       arr2 = {5,6};
     output:
       arr3 = {1,2,3,4,5,6};//Arrays.sort
 */