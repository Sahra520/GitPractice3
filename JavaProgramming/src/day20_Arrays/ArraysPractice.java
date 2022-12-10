package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] numbers={10, 20, 50, 70};//size:4

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------");

        //create a variable that can contain 5 scores

    int[] scores = new int[5];//0, 1, 2, 3, 4
    scores[0]= 10;
    scores[1]=20;
    scores[2]=30;
    scores[3]=40;
    scores[scores.length-1]=50;

        System.out.println(Arrays.toString(scores));

        System.out.println("----------------------");

        String month[]={"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
       //0~1 (length-1)
/*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);
*/

        for (int i = 0; i < month.length; i++) {
            // i: represents the index numbers of array starting from 0
            System.out.println(month[i]);
        }
            System.out.println("-----------------------");

            for (int i = month.length-1; i >= 0; i--) {
                System.out.println(month[i]);
        }

    }
}
/*
store the elements:10, 20, 50, 70
 */