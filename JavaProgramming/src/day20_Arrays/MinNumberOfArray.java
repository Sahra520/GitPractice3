package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 85};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {//shortcut is: numbers.for
   //for(int i1 = numbers.length - 1; i1 >= 0; i1--){//shortcut : numbers.forr

            if (numbers[i]<min){
   //if there is element in the array that's greater than the current max number
                min = numbers[i];//assigning greater number to variable max
            }
        }
        System.out.println(min);
    }
}
