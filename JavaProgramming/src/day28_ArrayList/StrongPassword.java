package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";
        //if we use just "cydeo1990@" c==lowercase, when the code executed it throw us "false"

        isStrongPassword(password);

        System.out.println("isStrongPassword = " + isStrongPassword(password));

    }
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false; //has uppercase
        boolean r3 = false; //has lowercase
        boolean r4 = false; //has special character
        boolean r5 = false; //has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }else { //special char
                r4 = true;
            }

            if (r2 && r3 && r4 && r5){
                break;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }
}
        /*
        write a program that can verify if a password is a strong password.
        Characteristics of strong passwords are :
        1. Passwords MUST be at least have 8 characters long and should nt contain space
        2. Password should at least contain one upper case letter
        3. Password should at least contain one lower case letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
         */