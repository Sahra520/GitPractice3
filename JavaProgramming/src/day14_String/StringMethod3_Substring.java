package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word= "Cydeo School";
        //            012345678..
        String brand=word.substring(0,4+1);//(0,5)
        System.out.println("brand = " + brand);

        String str1= word.substring(6);
        System.out.println("str1 = " + str1);

        System.out.println("---------------");

        String word1="Java Programming Language";
        String s1=word1.substring(0, word1.indexOf(" "));//Java
        String s2=word1.substring(word1.indexOf(" ")+1,word1.lastIndexOf(" "));//Programming
        String s3=word1.substring(word1.lastIndexOf(" ")+1);//Language
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("---------------------");

        String word2="Python C# Ruby";
        String w1=word2.substring(0, word2.indexOf(" "));//Python
        String w2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));//C#
        String w3=word2.substring(word2.lastIndexOf(" ")+1);//Ruby
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);



    }
}
