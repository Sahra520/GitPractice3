package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {
        /*create a class called StudentInfo,
         and declare variables for the followings:
        1. student name
        2. age
        3. gender
        4. school name
        5. phone number
        6. Isfulltime
         */
        String studentName = "Sam";
        int age = 13;
        char gender = 'M';
        String schoolName = "Orchidea Iskola";
        String phoneNumber = "+(36)70-212-70-86";
        boolean IsFullTime = true;
        double GPA = 2.5;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("IsFullTime = " + IsFullTime);
        System.out.println("GPA = " + GPA);

    }
}
