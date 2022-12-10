package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 37, 6849, 648, 678, 5683, 454,345,45};
        int max = numbers[0];//current max number is 10-indexOf(0);
        /*
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){//if there is element in the array
                // that's greater than the current max number
                max=numbers[i];//assigning greater number to variable max
            }
        }
        System.out.println(max);*/


        for (int number:numbers){
            if (number>max){
                max=number;
            }
        }
        System.out.println(max);
    }
}
