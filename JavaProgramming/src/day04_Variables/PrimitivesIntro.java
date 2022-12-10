package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age: 38 years old
        byte age = 38;
        //Weight:160 pounds;
        //byte weight = 160; 160 is out of byte range
        //byte num = -128 and 127 is out of byte range
        short weight = 160; //160 is within the range of short

        //salary : 100000 $
        //short salary = 100.000 is out of short range
        int salary = 100_000; //int is the preferred data type for integer numbers
        //int asset=3_333_333_333; out of int range
        long asset=3_333_333_333l;
        //if you don't write 'l' java will understand it int
        System.out.println(")))))))))");

        //tax:0.26%
        float tax = 0.26f;

        double PI=3.14;

        /*primitive data types:
        numerical primitives:
        double=>float=>long=>int=>short=>byte
         */
        /*primitives:
        int: for integers
        double: for decimals
        char: for single characters, etc 'A'
        boolean: true/false

        non primitives:
        String: sequence of characters, " "
         */
        //char employeeName = "Wooden Spoon";
        String employeeName = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("employeeName = " + employeeName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        /*
        (123)-78-9876 <-- String
        123789876  <-- int
         */
        
        boolean isEmpleyeed = true;
        System.out.println("isEmpleyeed = " + isEmpleyeed);
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);
        boolean result = 100>300;
        System.out.println("result = " + result);

        
        char ch1 = 97;
        char ch2 = 65;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        /*variable naming rules:
      1  MUST be unique
      2  camelCase
      3  Can  Not start with digits
      4  starts with lower case letters
      5  Can Not be Java Reserved words
      6  Can Not have special characters other than _ and $
      7  Readable, understandable, meaningful-significant,

         */
    }
}
