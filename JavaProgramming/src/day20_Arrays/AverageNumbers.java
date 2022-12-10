package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0; //10+20+30...

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double averageNumber = sum/ numbers.length;
        //10/3=3..
        System.out.println("averageNumber = " + averageNumber);
    }
}
/*
        4. Average number:
        Ask the user how many numbers they want to enter.
        Get all the inputs from the user and store them into an array
        Iterate the array & return the average number
 */