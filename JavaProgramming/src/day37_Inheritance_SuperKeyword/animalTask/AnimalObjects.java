package day37_Inheritance_SuperKeyword.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Husky",'M',"small",4, "grey",4);
        dog1.bark();
        System.out.println(dog1);

        System.out.println("===============");

        Cat cat1 = new Cat("Love","Siamese",'F',"Small",2,"White");
        cat1.scratch();
        System.out.println(cat1);

        System.out.println("===========");

        Parrot parrot1 = new Parrot("Bulut","Mucaw",'M',"small",1,"Blue","White");
        parrot1.sing();
        System.out.println(parrot1);
    }
}

