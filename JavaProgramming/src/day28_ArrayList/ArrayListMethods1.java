package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList< Integer > numbers = new ArrayList<>();
        //add(Data): adds the data after the last index of the ArrayList
        numbers.add(10); //0--->0
        numbers.add(20); //1--->1
        numbers.add(30); //2--->3
        numbers.add(40); //3--->4
        numbers.add(50); //4--->5--->5
        //add(index,Data): inserts the data at the given index
        numbers.add(2,25);//2

        numbers.add(5,45);//5
        System.out.println(numbers);//[10, 20, 30, 40, 50]
        System.out.println(numbers.toString());//[10, 20, 30, 40, 50]

        System.out.println("-----------------");

        System.out.println(numbers.size());//7(7 numbers)

        //size(): returns the total number of elements
        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);//lastIndex=6(because index numbers starting from 0)

        System.out.println("---------------");


        //get(index): returns the element at the given index
        int num = numbers.get(3);

        System.out.println("num = " + num);//num = 3

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");//10 20 25 30 40 45 50
        }

            System.out.println("--------------");


            //set(index,Data): replaces the element at given index with the new element
        ArrayList<String>list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "Javascript");
        System.out.println(list);//[Java, Python, Javascript, C#, Ruby]

        list.set(3, "C++");
        System.out.println(list);//[Java, Python, Javascript, C++, Ruby]


        System.out.println("-------------------");


        //remove(int index): removes the element at the given index

        ArrayList<String>employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);//[Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//[Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//[Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        System.out.println(employees);//[Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);
        System.out.println(employees);//[Neira, Hulya, Kaloyan]

        employees.remove(employees.size()-1);
        System.out.println(employees);//[Neira, Hulya]

        //remove(Object): removes the given object from ArrayList
        boolean r1 = employees.remove("Hulya");
        System.out.println(employees);

        boolean r2 = employees.remove("Neira");
        System.out.println(employees);//[]

        System.out.println("r1 = " + r1);//r1 = true
        System.out.println("r2 = " + r2);//r2 = true


    }
}
