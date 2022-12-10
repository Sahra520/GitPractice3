package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
        String[] group1 = {"Martin", "Yusup", "Muhammed"};
        String[] group2 = {"Ahmet", "Sam", "Marcus"};
        String[] group3 = {"Nadin", "Zaynab", "Lydia"};
String[][] groups = new String[3][3];//0,1,2
groups[0] = group1;
groups[1] = group2;
groups[2] = group3;
       //System.out.println(Arrays.toString(groups));
        // gives hashcode if we write code with toString
        System.out.println(Arrays.deepToString(groups));

        System.out.println("----------------*****-----------------");

//index of the elements:    0 1   0 1 2   0 1 2 3
        int[][] array2D = {{1,2},{3,4,5},{6,7,8,9}};
        //          index:   0      1        2

        System.out.println(Arrays.deepToString(array2D));
        //{3,4,5}
        System.out.println(Arrays.toString(array2D[1]));

// 8
        System.out.println(array2D[2][2]);


    }
}
/*String[] group1 = {"Martin", "Yusup", "Muhammed"};
  String[] group2 = {"Ahmet", "Sam", "Marcus"};
  String[] group3 = {"Nadin", "Zaynab", "Lydia"};
 */
/*
indexes ID array
int     []                []        array2={{1,2},{3,4,5},{6,7,8,9}};
                indexes of elements
 */