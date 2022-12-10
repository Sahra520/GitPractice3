package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String u=scan.next();

        System.out.println("Please enter your password: ");
        String p=scan.next();



        if (u.equals("Cydeo")&&p.equals("Cydeo123")) {
            //if credentials are valid
            System.out.println("Logged in");
        }else {//if credentials are not valid
            int attempts=3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0) {
                //while the credentials are invalid and
                // user has attempts to re-enter
                if (attempts==1){
                    System.out.println("This is your last chance");
                }
        System.out.println("Incorrect username or password," +
                " please re-enter");
                System.out.println("Please enter your username: ");
                u=scan.next();

                System.out.println("Please enter your password: ");
                p=scan.next();
                attempts--;

            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked");
                System.out.println("Call the customer service");
            }
        }
        scan.close();




    }

}
//username:"Cydeo"
//password:"Cydeo123"
        /*ask user to sign in and if user enter them correctly
        you need print "Logged in"
        if user enter them uncorrectly you need give them 3 attempts
        if all 3 attempts are failed you need to print
        "Your account is locked" or "Call the customer service"
        int attempt=3;
        //while (invalid && hasAttempts)
         */