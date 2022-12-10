package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("list = " + list);
        //list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        
/*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 != 0){
                list.remove(i);//never use within loop,
                // because every time when loop executed every time index numbers will be change

                //but if we have to remove during the iteration then we can use removeIf() method within the loop
            }
        }
        System.out.println("list = " + list);//list = [2, 4, 6, 8, 10, 2, 4, 6, 8, 10, 2, 4, 6, 8, 10]
*/
        //Lambda expression
        list.removeIf(p-> p<5);//(p->)-is representing here all elements

        System.out.println(list);//[5, 6, 7, 8, 9, 10, 5, 6, 7, 8, 9, 10, 5, 6, 7, 8, 9, 10]


        System.out.println("---------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each->each%2 == 0);

        System.out.println(list2);//[1, 3, 5, 7, 9]


        System.out.println("------------------------------------");

        ArrayList<String>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf( p -> p.startsWith("J"));

        System.out.println(list3);//[Python, C#, C++]


        System.out.println("=======================");

        ArrayList<String>names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));

        //names.removeIf(name-> StringUtility.isPalindrome(name));//[Java, Python, Cydeo]

        names.removeIf(name-> !StringUtility.isPalindrome(name));//[Anna, Racecar, Level, Eye]

        System.out.println(names);

             /*
             Remove Functions:
       remove(): when we remove one element
       removeAll(): when we remove multiple elements (if the elements that we want to remove are known)
       retainAll(): when we want to retain/keep multiple elements (if the elements that we want to remove are known)
       removeIf(): when we remove under a condition (if the elements we want to remove are unknown)
              */

    }
}
