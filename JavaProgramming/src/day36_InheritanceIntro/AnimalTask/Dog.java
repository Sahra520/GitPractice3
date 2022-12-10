package day36_InheritanceIntro.AnimalTask;

public class Dog extends Animal { //Dog is an Animal
    //     child         parent


    public void bark() {
        System.out.println(name + " is barking.");
    }


    public static void main(String[] args) {
Dog dog1 = new Dog();
dog1.setInfo("Max", "Husky", 'F',"110 cm", 2,"grey");
        System.out.println(dog1);
        dog1.bark();
    }
}
/*
Dog extends Animal:
			bark()
 */