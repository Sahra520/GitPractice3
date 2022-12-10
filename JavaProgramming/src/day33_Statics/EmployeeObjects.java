package day33_Statics;

import java.util.ArrayList;

public class EmployeeObjects {

    public static void main(String[] args) {

        /*public static String name;
from employee class
        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        System.out.println(employee1.name);//Ahmet
        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        System.out.println(employee2.name);//Aygun
        Employee employee3 = new Employee();
        employee3.name = "Fady";
        System.out.println(employee3.name);//Fady

        System.out.println(employee1.name);//Fady
        System.out.println(employee2.name);//Fady
        System.out.println(employee3.name);//Fady
         */

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Fady";
        employee3.salary = 120000;
//with public static double salary;Ahmet 120000.0     Aygun 120000.0      Fady 120000.0
        System.out.println(employee1.name+" "+employee1.salary);//Ahmet 110.000
        System.out.println(employee2.name+" "+employee2.salary);//Aygun 115.000
        System.out.println(employee3.name+" "+employee3.salary);//Fady 120.000

     //public static boolean isHuman = true;
        System.out.println(employee1.isHuman);//true
        System.out.println(employee2.isHuman);//true
        System.out.println(employee3.isHuman);//true



    }
}
