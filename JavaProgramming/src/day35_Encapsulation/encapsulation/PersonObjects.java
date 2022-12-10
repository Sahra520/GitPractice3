package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        //person1.name = "Daniel";because original was private
        person1.setName("Mike");
        //person1.age = 30;because original was private
        person1.setAge(150);


        System.out.println("Name: " + person1.getName());//if we write here just "name" it will give error
        System.out.println("Age: " + person1.getAge());









    }












}
