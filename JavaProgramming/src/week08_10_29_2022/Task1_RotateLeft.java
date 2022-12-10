package week08_10_29_2022;

import java.util.Arrays;

public class Task1_RotateLeft {

    public static void main(String[] args) {

        int[] x = {1,2,3};
        /*
        int temp=x[0];
         first place=2;
         x[0]=x[1];
         second place =3;
        x[1]=x[2];
       last=1;
        x[2]=temp;
               */

        int temp=x[0];
        //2<3
        for (int i = 0; i < x.length-1; i++) {
            x[i]=x[i+1];
        }

        //index of last element[2]
      x[x.length-1]=temp;

        System.out.println(Arrays.toString(x));

        System.out.println("=============================");

        int[] y = {1, 2, 3};
        int temp1 = x[0];

        for (int i = 0; i < y.length; i++) {
            if (i == y.length - 1) {
                y[y.length - 1] = temp1;
            } else {
                y[i] = y[i + 1];
            }
        }
        System.out.println(Arrays.toString(y));
    }
}
/*
Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”

        int[] x = {1,2,3};             // = > [2,3,1]
        int[] y = {17,12,10,8};         // = > [12,10,8,17]
        int[] a = {7,0,0};              // = > [0,0,7]
 */