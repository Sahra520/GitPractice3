package day37_Inheritance_SuperKeyword.animalTask;

public class Parrot extends Animal{

    public String parrotWingColor;

    public Parrot(String name, String breed, char gender, String size, int age, String color,String parrotWingColor) {
        super(name, breed, gender, size, age, color);
        this.parrotWingColor = parrotWingColor;
    }
    public void sing(){
        System.out.println(name + " is singing");
    }

    public String toString() {
        return "Parrot{" +
                "  name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", parrotWingColor='" + parrotWingColor + '\'' +
                '}';
    }
}
