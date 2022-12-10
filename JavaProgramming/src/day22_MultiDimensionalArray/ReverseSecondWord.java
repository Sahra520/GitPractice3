package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";
        String[] words = sentence.split(" ");
        String reverse = "";
     // this is not an array element, this is String,we want reverse so we have decrease
        for (int i = words[1].length()-1; i >= 0; i--) {
            reverse += words[1].charAt(i);
        }
        System.out.println(reverse);

        //sentence = sentence.replaceFirst(words[1],reverse);
             // idex of love                    [1] because love is second word
        words[1] = reverse;

        System.out.println(Arrays.toString(words));

        for (String word:words){
            System.out.println(word+" ");
        }
    }
}
/*
Write a program that can reverse the second word of sentence
   Ex:
sentence = "I Love Java";
   Output:
I evoL Java
 */