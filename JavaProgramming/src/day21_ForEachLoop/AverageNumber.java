package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 37, 6849, 648, 678, 5683, 454,345,45};
        double sum = 0;
        double averageNumber=0;
        for (int number:numbers) {
            sum+=number;
           averageNumber = sum/numbers.length;
        }
        System.out.println("averageNumber = " + averageNumber);

    }
}
