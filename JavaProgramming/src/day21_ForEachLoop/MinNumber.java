package day21_ForEachLoop;

public class MinNumber {

    public static void main(String[] args) {
        int[] numbers = {10, 37, 6849, 648, 678, 5683, 454,345,45};
        int min = numbers[0];
        for (int number:numbers){
            if (number<min){
                min=number;
            }
        }
        System.out.println(min);
    }
}
