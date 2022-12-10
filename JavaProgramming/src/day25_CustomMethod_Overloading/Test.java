package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);


        System.out.println("-------------------");

        String s1="Wooden Spoon";
        String reverse=StringUtility.reverse(s1);
        System.out.println(reverse);//noopS nedooW


        System.out.println("--------------------");


        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);//true

        String word2 = "Java";
        boolean palindrome1 = StringUtility.isPalindrome(word2);
        System.out.println("palindrome = " + palindrome1);//false


        System.out.println("-----------------------");


        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each:names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);//3


        System.out.println("------------------");

        String s2 = "saaaaaaaaaaagjfhgjhkhggfgfgfgfgfgaabbbcc";
        String nonDup=StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);//sabc





    }
}
