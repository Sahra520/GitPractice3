package day37_Inheritance_SuperKeyword.animalTask;

public class Dog extends Animal{


    public int legs;
    public Dog(String name, String breed, char gender, String size, int age, String color, int legs){
       super(name, breed, gender, size, age, color);
       this.legs = legs;
    }

    public String toString() {
        return "Dog{"+
                " name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", legs=" + legs +
                '}';
    }


    public void bark(){
        System.out.println(name + " is barking.");
    }
}
