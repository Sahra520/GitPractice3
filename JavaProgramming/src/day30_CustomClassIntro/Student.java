package day30_CustomClassIntro;

public class Student {
    /*
    Student Class
    Attributes:
        name, gender, age, studentID, grade
    Actions:
        eat(), sleep(), drink(), code, study(),
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student
     */
    //instance variable
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void study(){
        System.out.println(name + " is studying.");
    }

}
