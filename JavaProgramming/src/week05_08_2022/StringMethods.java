package week05_08_2022;

public class StringMethods {
    public static void main(String[] args) {
        //if we want to get specific char:charAt();
        String str = "Adam";
        System.out.println(str.charAt(0));//A

        System.out.println(str.charAt(3));//M

        //if we want to get length of String length
        System.out.println(str.length());

        //get the last character
        int lengthOfTheString=str.length();
        int indexOfLastChar=lengthOfTheString-1;
        System.out.println(str.charAt(indexOfLastChar));

        //in order to make letters lower case to toLowerCase();
        System.out.println(str.toLowerCase());

        //in order to make letters upper case to toUpperCase();
        System.out.println(str.toUpperCase());

        //in order to remove spaces before and after your String trim();
        String str1="   Adam   ";
        System.out.println(str1.trim());//Adam

        System.out.println(str1);//we will have spaces in here,
        //because String clas is immutable

        //if we want to get index of char or
        // String we need to use indexOf() method

        String number="0123456";
        //get the index of 3
        System.out.println(number.indexOf('3'));//3
        //get the index of 34//we have to follow char sequence
        System.out.println(number.indexOf(34));//-1
        //get the index of 34
        System.out.println(number.indexOf("34"));//3
        //get the index of 14
        System.out.println(number.indexOf("14"));
        //1 that means there is no 1 4 in that String

        String sentence="Java is a programming language";
         System.out.println(sentence.indexOf("programming"));//10

        System.out.println(sentence.indexOf("programming1"));//-1

        System.out.println(sentence.indexOf(" programming "));//9

        String sentence1="Java is Java";//0~12
        System.out.println(sentence1.lastIndexOf("Java"));//8

        System.out.println(sentence1.indexOf("Java"));//0
    }
}
