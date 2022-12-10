package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word="Cydeo";
            //index: 01234
        char thirdChar=word.charAt(2);
        System.out.println("thirdChar = "+thirdChar);

        //char tenthChar = word.charAt(9);
        //System.out.println("tenthChar = " + tenthChar);
        //String index out of range


        //charAt(index): returns the character at the given index, returns char


        System.out.println(" ---------------------------");

        String s1="Batch 25 is the best batch. Java programming language";
        int totalChars=s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastchar=s1.charAt( s1.length()-1 );//not al this is a formula to find last index number
        System.out.println("lastchar = " + lastchar);
        //length(): returns the total number of characters, returns int.

        System.out.println("--------------");

        String str = "wooden spoon";
        str=str.toUpperCase(); //"WOODEN SPOON"

        System.out.println(str);

        String s="JAVA";
        s=s.toUpperCase();

        System.out.println(s);//Java

        System.out.println("-----------------------------");

        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);

    }
}
