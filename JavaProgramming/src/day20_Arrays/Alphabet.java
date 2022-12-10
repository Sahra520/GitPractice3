package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        //create a variable that can contain 26 character in seperate index

        char[] alphabets = new char[26]; // Z~A / 90-65

        alphabets[0] = 'Z';//90
        alphabets[1] = 'Y';//89
        alphabets[2] = 'X';//88

        char ch = 'Z';
        for (int i = 0 ; i < alphabets.length; i++,ch--) {
            alphabets[i] = ch;
            System.out.println(alphabets[i]);
        }

       // System.out.println(Arrays.toString(alphabets));//print the whole array //Z and 25 hashcode
        //System.out.println(alphabets[0]);//printing the element of array-Z

/*
        for (char i = 0, j = 'Z'; i < alphabets.length; i++,j--) {
            alphabets[i] = j;
        }System.out.println(Arrays.toString(alphabets));
        */


    }
}
