package week08_10_29_2022;

public class Task4 {

    public static void main(String[] args) {
        /*
        racecar
        0123456
         */
        String[] words= {"java","longer word", "civic", "apple", "racecar", "mom", "anna"};
        //we need to get word one by one
        String longestPalindrome="";
        for (String eachWord:words){
            System.out.println(eachWord);
            //is palindrome or not:
            boolean isPalindrome=true;
            for (int i = 0; i< eachWord.length()/2;i++){
                //"racecar"
                char ch1=eachWord.charAt(i);
                char ch2=eachWord.charAt(eachWord.length()-i-1);
                if (ch1!=ch2){
                    isPalindrome=false;
                    break;
                }
            }
            if (isPalindrome&&eachWord.length()>longestPalindrome.length()){
                longestPalindrome=eachWord;
            }
            System.out.println("longestPalindrome: "+longestPalindrome);
        }

        String ta = "A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        ta.replace('C','D');
        ta=ta+tb;
        System.out.println(ta);//ABCC

        String str ="Hello world";
        str.trim();
        int z=str.indexOf(" ");
        System.out.println(z);//5

        String str2="Batch 21";
        int m= str2.trim().length();
        System.out.println(m);//11

        String s1="abc";
        String s2="abc";
        System.out.println("s1==s2 is"+s1==s2);//false

        String str3=" ";
        str3.trim();
        boolean A=str3.isEmpty();
        System.out.println(A);//false

    }
}
/*
 Task 4 :  For Each - Nested For
            Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
       Ex:
Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
       Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
 */