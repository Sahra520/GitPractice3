package day20_Arrays;

import java.util.Arrays;

public class Month {

    public static void main(String[] args) {

        int number = 10;

        String month[]={"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        if (number < 1 || number > 12){
            System.err.println("Invalid number");
            System.exit(0);
        }
       // System.out.println(Arrays.toString(month));
        System.out.println(month[number-1]);
    }
}
