package day36_InheritanceIntro.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Hulya", 27,'F','A',"Cydeo");
        Student student2 = new Student("Daniel", 29, 'M', 'D', "MIT");

        System.out.println(student1);//Student{name='Hulya', age=27, gender=F, grade=A, schoolName='Cydeo'}
        student1.setAge(39);

        System.out.println(student1);//Student{name='Hulya', age=39, gender=F, grade=A, schoolName='Cydeo'}
        System.out.println(student2);//Student{name='Daniel', age=29, gender=M, grade=D, schoolName='MIT'}


    }
}
