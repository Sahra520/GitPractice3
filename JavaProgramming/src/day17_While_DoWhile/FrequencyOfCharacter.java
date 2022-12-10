package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBCDDDAAAAAAAAAAAA";
        char ch = 'A';

        int frequency = 0;//1+1+1

        for (int i = 0; i <str.length(); i++) { // i: indexes of str

            char eachChar = str.charAt(i);//each character of str

        if (ch==eachChar){
        /*if given ch is matching with the eachChar,
        then ch is appeared in the String*/
            frequency++;
            //frequency+=1;//same
        }
        }
        System.out.println(frequency);

    }
}
/*
Write a program that can return the frequency of a char from a String
          Ex:
                str = "AAABBBC"
                ch = 'A'

                output:
                     3

 */