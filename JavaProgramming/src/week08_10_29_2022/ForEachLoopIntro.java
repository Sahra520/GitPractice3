package week08_10_29_2022;

import java.util.Arrays;

public class ForEachLoopIntro {

    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5};
        for (int each : numbers) {
            System.out.println(each);
        }
        //toCharArray()
        String str = "Adam";
        char[] letters=str.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (char letter:letters) {
            System.out.println(letter);
        }
        String str1="Adam Barry";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        //split(regex)

        String sentence="Java is a good language";
        String[] words=sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
