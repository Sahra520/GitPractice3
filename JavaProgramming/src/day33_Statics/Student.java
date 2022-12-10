package day33_Statics;

public class Student {

//if one copy is enough we can make this method static
    //if we make static, ex: age, then all students ages are must same
    /*
Student Task:
		1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade
*/


    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;


    //Add a constructor that allows user to create object by setting the name of student
    public Student(String name) {
        this.name = name;
    }


    //Add a constructor that allows user to create object by setting the name and gender of the student
    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }


    //Add a constructor that allows user to create object by setting the name and studentID of the student
    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }



    //Add a constructor that allows user to create object by setting the name, studentID and grade of the student
    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }



    //Add a constructor that allows user to create object by setting the name, gender and age of the student

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }


    //Add a constructor that allows user to create object by setting the name, gender, age and studentID of the student

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }


//Add a constructor that allows user to create object by setting the name,gender,age,studentID and grade of the student
    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    //Actions: toString() ,study()



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}




