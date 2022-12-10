package day14_String;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="xcodeX";
        str=str.replace("x","a").replace("X","a");
        //          "acodeX"                         "acodea"
        System.out.println(str);
        scan.close();
    }
}
  /*
        Write a program that asks user to enter a word
        and replace all the x or(||) X with character a
              input:
                  xcodeX
              output:
                  acodea
         */