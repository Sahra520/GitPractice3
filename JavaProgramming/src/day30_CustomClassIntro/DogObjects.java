package day30_CustomClassIntro;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color ="White";

        System.out.println(dog1);

        System.out.println("-------------------");

        Dog dog2 = new Dog();

        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 3;
        dog2.gender = 'M';
        dog2.size = "Small";
        dog2.color ="Brown";

        System.out.println(dog2);

        System.out.println("-------------------------------");

        Dog dog3 = new Dog();
        dog3.setInfo("Alabay","alabay",6,'M',"Big","Grey");
        dog3.toString();

        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        dog3.bark();

        System.out.println("---------");

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet","Labrador",3,'M',"Extra Large","Yellow");
        dog4.toString();
        System.out.println(dog4);

        System.out.println("-----------------------------------");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull",6,'M',"Large","Black");
        System.out.println(dog5);


        System.out.println("---------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        //at first find male and female dogs from array and add them to the arraylist
        ArrayList<Dog> femaleDogs = new ArrayList<>();

        ArrayList<Dog> maleDogs = new ArrayList<>();

//first solution use for loop, second solution do not use loop

    }
}
