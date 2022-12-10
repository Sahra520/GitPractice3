package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    //incele ve practice yap

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like enter?");
        int length = scan.nextInt();//10

        if (length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int[] numbers = new int[length];
     //array needs to have enough capacity to contain
     // all the elements user going to enter

        for (int i = 0; i < length; i++) {
            //index number is always less than length
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();//5
     //each input user provided during each execution of the loop,
     //will be assigned to the indexes of the array
        }

        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}

