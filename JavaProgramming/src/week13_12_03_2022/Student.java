package week13_12_03_2022;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    static ArrayList<Teacher> teachers= new ArrayList<>();
    static {


        Teacher teacher1=new Teacher("Muhtar","Abc",'M', LocalDate.of(1987,1,1),1L);
        Teacher teacher2=new Teacher("Gurhan","Abc",'M', LocalDate.of(1977,1,1),2L);
        Teacher teacher3=new Teacher("Asyun","Abc",'F', LocalDate.of(1967,1,1),3L);
        Teacher teacher4=new Teacher("Mike","Abc",'M', LocalDate.of(1970,1,1),4L);
        Teacher teacher5=new Teacher("Saim","Abc",'M', LocalDate.of(1989,1,1),5L);
        Teacher teacher6=new Teacher("Asya","Abc",'F', LocalDate.of(1990,1,1),6L);

        teachers.addAll(Arrays.asList(teacher2,teacher1,teacher3, teacher4,teacher6,teacher5));
    }

    public static void main(String[] args) {






    }

}
/*
 2. create a class which is School with main method
    3. create a list of teacher in School class inside the STATIC BLOCK
    4. create a method in School class which is returning the list of teachers
    if the last name start with "M"
    5. create a method in School class then you will find the female teachers
    6. create a method in School class then find the teachers age smaller than 30
    7. create a methot in School class then find the teachers born in 1967 year
 */