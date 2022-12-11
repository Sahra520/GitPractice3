package day13_String;
import java.util.Scanner;
public class EmailTask1 {

    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";
        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        email=lastName+"_"+firstName+rest;
        System.out.println(email);//tyson_mike@gmail.com
        System.out.println(rest);//@gmail
    }
}
/*
create a class called EmailTask1
Assume that email address is constructed by person's first name
and followed by an underscore and last name.
write a program that can swap first name and last name in the email
(seperated by  any underscore).
If the email doesn't contain an underscore print the given input email.
     Ex:
        input : mike_tyson@gmail.com
        output: tyson_mike@gmail.com
 */