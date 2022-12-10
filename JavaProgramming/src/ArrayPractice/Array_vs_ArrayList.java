package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_vs_ArrayList {

    public static void main(String[] args) {

        //Create
        String[] friendsArray=new String[4];
        String[] friendsArray2={"John", "Ahmet", "Sam", "Marcus"};
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Ahmet", "Sam", "Marcus"));

        //Get element
        System.out.println(friendsArray[1]);//null
        System.out.println(friendsArrayList.get(1));//Ahmet
        //Get size
        System.out.println(friendsArray.length);//4
        System.out.println(friendsArrayList.size());//4
        //Add an element
        //You can't do that with Arrays
        friendsArrayList.add("Hamoody");
        System.out.println(friendsArrayList.get(4));//Hamoody

        //Set an element
        friendsArray[0]="Yusup";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0,"Yusup");
        System.out.println(friendsArrayList.get(0));

        //Remove an element
        //can't remove elements, due to it's fixed size
        friendsArrayList.remove("Marcus");
        System.out.println(friendsArrayList.get(3));

        //Print
        System.out.println(friendsArray);
        System.out.println(friendsArrayList);
        System.out.println(Arrays.toString(friendsArray));
    }
}
