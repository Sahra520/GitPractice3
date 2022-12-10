package day36_InheritanceIntro.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "small",2,"White");
        dog.bark();
        dog.drink();
        dog.eat();
        dog.sleep();
        System.out.println(dog);

        System.out.println("========================");

        Cat cat = new Cat();
        cat.setInfo("Masha", "British",'F',"small",3,"black" );
        cat.meow();
        cat.scratch();
        cat.drink();
        cat.sleep();
        System.out.println(cat);

        System.out.println("========================");
        Tiger tiger = new Tiger();
        tiger.setInfo("Shir","Bengal",'M',"large",4,"red" );
        tiger.hunt();
        tiger.roar();
        tiger.eat();
        System.out.println(tiger);

        System.out.println("=======================");
        Fish fish = new Fish();
        fish.setInfo("Nemo","Japan",'M',"medium",1,"orange");
        fish.swim();
        fish.move();
        System.out.println(fish);
    }
}
