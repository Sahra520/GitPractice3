package day34_GarbageCollection_AccessModifiers;

import day30_CustomClassIntro.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {
        /*
//null means in java== object does not exist
      //int n = null;

        String str = null;

        System.out.println(str.toUpperCase());
/*
"C:\Program Files\Java\jdk-11.0.12\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=61350:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\kuwwa\OneDrive\Desktop\JavaProgramming\out\production\JavaProgramming day34_GarbageCollection_AccessModifiers.GarbageCollection
Exception in thread "main" java.lang.NullPointerException
	at day34_GarbageCollection_AccessModifiers.GarbageCollection.main(GarbageCollection.java:11)

Process finished with exit code 1
 */


        String str = "Wooden Spoon";//after line 22,"Wooden Spoon" will be eligible for garbage collection
        str = null;//this is fastest way to make eligible garbage collection

        System.out.println(str);//null


        Car car1 = new Car("Toyota");
        System.out.println(car1);//Car{brand='Toyota', model='null', year=0, price=0.0, color='null'}
        car1 = null;

        System.out.println(car1);//null

//by null garbage collection is destroys object

        System.out.println("--------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";
        System.out.println(dog1);//Dog{name='Max', breed='null', age=0, gender= , size='null', color='null'}

        String language = "Python";
        language = "Java";
        System.out.println(language);


        System.out.println("------------------------");

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer>list2 = list1;
        System.out.println(list1);//[100]
        System.out.println(list2);//[100]

        list2.addAll(Arrays.asList(200,300,400));
        System.out.println(list1);//[100, 200, 300, 400]
        System.out.println(list2);//[100, 200, 300, 400]
        System.out.println(list1 == list2);

        System.out.println("-------------------------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println(student2);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}


        System.out.println("--------------------------------");

        ArrayList<String>l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String>l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);













    }






}
