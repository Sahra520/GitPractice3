package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);//[100, 200, 200, 200, 300, 400, 500]
       // int num = 1;
        //list.remove(num);
        //System.out.println(list);//[100, 200, 200, 300, 400, 500]

        Integer num = 200;
        list.remove(num);
        System.out.println(list);  //[100, 200, 200, 300, 400, 500]

        /*
        list.remove(200);
        System.out.println(list);//gives error because this number is taken as a primitive and
        // ArrayList does not support primitives
        */
        //but if we use with boolean
        Integer num1 = 200;
        boolean r = list.remove(num1);
        System.out.println(list);//[100, 200, 300, 400, 500]removed one 200
        System.out.println(r);//true

        System.out.println("-----------");

        //remove(int index): removes the element at the given index
        //remove(Object): removes th given object from arraylist, returns boolean

        //clear(): remove all the elements of the arraylist,size will be 0

        System.out.println(list.size());//5
        list.clear();
        System.out.println(list.size());//0

        //indexOf(Data): returns the first matching element's index number,returns int

        //lastIndexOf(Data): returns the last matching element's index number, returns int

        System.out.println("---------------------------------");

        ArrayList<Character>characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println(a);//0
        System.out.println(b);//5

        System.out.println("---------------------");


        //contains(Data): returns true if the element is contained in the arraylist,
        // otherwise returns false

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);//true
        System.out.println("r3 = " + r3);//false


        System.out.println("-----------------------------------");

        //equals(ArrayList): returns true if two arraylists are equal (same elements in same order),
        //otherwise returns false

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);//false,   because of new keyboard

        System.out.println(list1.equals(list2));//true, if each element is not same output will false


        System.out.println("--------------------");

        //isEmpty():

        boolean r4 = list1.isEmpty();
        System.out.println("r4 = " + r4);//false

        list1.clear();
        boolean r5 = list1.isEmpty();
        System.out.println("r5 = " + r5);//true


        System.out.println("------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]



    }
}
