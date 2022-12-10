package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        //For each loop: loop that's already iterated
        //iteration starts from index 0
        //pre-condition: there MUST be a data structure

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        //                0   1   2   3   4   5   6
        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("--------");

        for(int each : numbers){//each: elements of the array
            System.out.println(each);
        }//we can not get like 70, 60, 50 in for each loop
    }
}
/*
  int[] numbers = {3,6,9};
        for(int each: numbers) {
            System.out.println(each);
        }
 */