package day14_String;

public class FormatFullName {

    public static void main(String[] args) {
        String firstName = "JOSH",
               lastName = "smITh";

     //  firstName= firstName.substring(0, 1).toUpperCase()
         //       +firstName.substring(1).toLowerCase();

        firstName=(""+firstName.charAt(0)).toUpperCase()
                  //   "C"
                +firstName.substring(1).toLowerCase();//"Cydeo"
               //+"ydeo"
        lastName= lastName.substring(0,1).toUpperCase()
                +lastName.substring(1).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastName);
        String fullName=firstName+" "+lastName;
        System.out.println("fullName = " + fullName);
    }
}
        /*
        Write a program that asks user to enter first and last names,
        and then prints the full name in regular format (first character
        in upper case)
               input:
                   firstName= "cyDEo";  //substring use
                   lastName="SCHOOL";
               output:
                   Cydeo School
         */