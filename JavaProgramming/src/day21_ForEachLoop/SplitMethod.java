package day21_ForEachLoop;

import java.util.Arrays;

public class SplitMethod {

    public static void main(String[] args) {

String sentence="Wooden Spoon";
String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("-----------");

        String email = "WoodenSpoon@gmail.com";
        String[] arr=email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------");

        String s = "Today is a nice day. Today is Monday. Today we learn Java.";
        String[]sentences=s.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
/*split(value): returns String array
"I love learning java programming language".split(" ")==>{"I" "love"...}
"ABC".split("")==>{"A", "B","C"}
 */
