package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {//toplu islemler

    public static void main(String[] args) {

        //Bulk operations: argument MUST be a collection type

        //addAll(CollectionType): adds collection of values to the arraylist

        //Arrays:
        //  asList(array of values)===> returns the array as collectionType

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7]

        System.out.println("------------------------");

        //removeAll(CollectionType): removes all the matching elements from the arraylist
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        list1.removeAll(Arrays.asList(3, 5, 8));
        System.out.println(list1);//[1, 2, 4, 6, 7, 9, 10]

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 3, 3, 4, 5, 3, 5, 5, 5, 6, 8, 7, 8, 8, 8, 9, 10));
        System.out.println(list2);//[1, 2, 3, 3, 3, 4, 5, 3, 5, 5, 5, 6, 8, 7, 8, 8, 8, 9, 10]

        list1.removeAll(Arrays.asList(3, 5, 8));
        System.out.println(list1);//[1, 2, 4, 6, 7, 9, 10]

        System.out.println("---------------------");

        //retainAll(CollectionType): removes all the non-matching elements from the arraylist

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));
        numbers.retainAll(Arrays.asList(100, 200, 300));
        //retain All method is opposite of remove all method
        System.out.println(numbers);//[100, 200, 300, 100, 200, 300]

        System.out.println("-----------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);//[QA, SDET, SDET]

        System.out.println("------------------------");


        //containsAll(CollectionType): checks if all th elements are contained in the arraylist

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));
        System.out.println(nums);
        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        System.out.println("r1 = " + r1);//true
        System.out.println("r2 = " + r2);//true
        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10));

        System.out.println("r3 = " + r3);//true


        System.out.println("-----------------------------------------");


        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        /*
        ArrayList<String>namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        */
        System.out.println(namesList);//[Josh, Jack, Daniel, Shay, Breanna]


        System.out.println("-------------------------");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//if we use int, it gives error
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(arr));//we can use just for non-primitive array
        System.out.println(numbers1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("---------------");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list4 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list4 = " + list4);//list4 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}