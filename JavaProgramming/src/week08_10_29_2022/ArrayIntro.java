package week08_10_29_2022;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        //if we know the elements of the array
        int[] arrayName={1,2,3,4,5,6,7};
        // if we don't know the elements we have to define size of array
        //use knew keyboard
        int[] array=new int[10];
        //put the values in an array
        array[0]=1;
        array[1]=23;
        array[2]=167;
        array[3]=17;
        array[4]=16;
        array[5]=187;
        array[6]=781;
        array[7]=16;
        array[8]=178;
        array[9]=1899;
       //print the element
        System.out.println(Arrays.toString(array));
        //0,1,2,3
        char[] letters={'B', 'S', 'D', 'Y'};
        System.out.println(Arrays.toString(letters));
        //how to get specific element
        System.out.println(letters[1]);//S
        System.out.println(letters[3]);//Y


        boolean[] array1=new boolean[3];
        //array1[0]="trtrttrt";we can not put different data type

        double[] doubles=new double[2];
        doubles[1]=10;

        //sort method is sorting elements to
        int[] numbers={2,3,4,8,6};
        Arrays.sort(numbers);
        System.out.println("----*------");


        //equals method order of elements are important
        int[] array3={1,2,3};
        int[] array4= {2,1,3};

        System.out.println(Arrays.equals(array3,array4));//false
        Arrays.sort(array4);

        System.out.println(Arrays.equals(array3,array4));//true

    }
}
