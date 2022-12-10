package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str ="aaabbcccdd";
        String result="";//abc
                  // i <= 7 ====> i < 8
        for (int i = 0; i <= str.length()-1; i++) {
//i: represents the all the index numbers of str(starts from 0)
            String ch = ""+str.charAt(i);
            // represents each Character of str
            System.out.println(ch);
            if (!result.contains(ch)){//if the charachter is not contained in the result
                //if the character is not  will be added to the result
                result+=ch;//the character will be added to the result
            }
        }
        System.out.println(result);
    }
}
/*
Write a program that can remove the duplicated characters from a String.
      Ex:
           Input:
               AABBCCBC
           Output:
               ABC
 Hint: You can add each character of the String into another String
 Condition: The character is not contained in the other String yet
 before you are adding
 */