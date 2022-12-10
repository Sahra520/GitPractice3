package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (char each:chars) {
            System.out.println(each);
        }

        System.out.println("-----------------");
    }
}
//toCharArray(): returns a char array
//"abc"---------->{'a, 'b', 'c'}