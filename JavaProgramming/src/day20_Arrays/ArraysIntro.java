package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names.
        //single dimensional array
        //String myGroup[];   //same
        String[] myGroup = new String[5];//0~4
       //System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup));//[null, null, null, null, null]
        //["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        myGroup[0] ="Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        //myGroup[5] = "Muhtar"; // it is not contain index of number 5
        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number < 1||number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
//default values:
//non-primitive data types=null
//primitive data types(byte, short, int, long = 0
//float, double = 0.0
//boolean = false