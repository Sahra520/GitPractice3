package day20_Arrays;

import java.util.Arrays;          // work in this

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
/*
        letters[0] = 'A';
        letters[1] = 'B';
*/
/*
        for (char i = 'A',j = 0; i <= 'Z' && j< letters.length; i++,j++) {
            //i:index numbers 0~ last index
            //i can assign a char in int because every char ex:'A'=65 is number
           letters[j] = i;
           //letters[i]=char[j];

        }System.out.println(Arrays.toString(letters));//[A~Z]
*/

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters));
    }
}
