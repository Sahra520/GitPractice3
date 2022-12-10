package week04_10_01_2022;

public class CodilityTask {
    public static void main(String[] args) {
        int number = 6;
        String result = "";
        if (number > 0) {
            if (number % 2 == 0) {
                result = "Codility";
            }
            if (number % 3 == 0) {
                result = result + "Test";
            }
            if (number % 5 == 0) {
                result = result + "Coders";
                //result+="Coders";
            } else {
             result="Your number is not divisible by 2, 3 or 5";
            }

        } else {
            result = "invalid number";
        }
        System.out.println(result);
    }
}
/*
 Task 1:
  Write a function:
            that, given a positive integer N  However, any number divisible
             by 2, 3 or 5 should be replaced by the word

                                Codility -- 2
                                Test     -- 3
                                Coders   -- 5

            - If a number is divisible by more than one of the
            numbers:2,3 or 5, it should be replaced by a concatenation
            of the respective words Codility, Test and Coders in this given order.

                                EXPECTED

       numbers divisible by both 2 and 3 should be replace by Codility Test
      INPUT : 6    OUTPUT :  Codility
       numbers divisible by all three numbers: 2,3 and 5, should
        be replaced by Codility Test Coders.
      INPUT : 30    OUTPUT :  CodilityTestCoders
 */