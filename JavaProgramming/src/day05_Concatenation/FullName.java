package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        /*create a class called FullName.java
        declare the following variables
        1 firstName
        2 lastName
        3. use concatenation to print the full address
         */

        String firstName = "Conor";
        String lastName = "Khabib";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);
        System.out.println("I'm " + firstName + " " + lastName + ", and I live in Budapest.");

        //Full name of person is ___________
        System.out.println("Full name of person is " + fullName);
        System.out.println("");

        //___ is ___ years old.
        String firstName1 = "Jimmy";
        String lastName1 = "King";
        String fullName1 = firstName1 + " " + lastName1;
        int age = 45;
        System.out.println(fullName1 + " is " + age + " years old.");

        System.out.println("_____________________________");

        //Fullname is jobTitle +, works at + companyName
        String firstName2 = "Aaron";
        String lastName2 = "Daniel";
        String fullName2 = firstName2 + " " + lastName2;
        int age1 = 19;
        String jobTitle = "SDET";
        String CompanyName = "Apple Inc";
        double salary = 100_000.58;
        System.out.println(fullName2+" is "+jobTitle+", works at "+CompanyName+", and "+fullName2+"\'s salary is "+salary);

    }
}
