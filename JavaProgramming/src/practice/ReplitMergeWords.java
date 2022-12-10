package practice;

import java.util.Scanner;

public class ReplitMergeWords {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE BELOW
        String result = "";
        if (word1.length()==3  &&  word2.length()==3) {
            result=""+word1.charAt(0)+word2.charAt(0)+
                    word1.charAt(1)+word2.charAt(1)+
                    word1.charAt(2)+word2.charAt(2);
        }else{
            System.out.println("cannot merge");
        }
        System.out.println(result);
    }
}
