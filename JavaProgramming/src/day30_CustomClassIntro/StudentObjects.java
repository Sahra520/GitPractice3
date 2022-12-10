package day30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Ahmet",'M',12,1124,'A');
        student1.code();
        student1.eat();
        student1.drink();

        System.out.println(student1);

        System.out.println("-----------------------");

        Student student2 = new Student();
        student2.setInfo("Yusup",'M',10,1815,'A');
        System.out.println(student2);

        System.out.println("------------------------");

        Student student3 = new Student();
        student3.setInfo("Hulya",'F',26,2123,'B');
        System.out.println(student3);

        System.out.println("-------------------------");

        Student student4 = new Student();
        student4.setInfo("Ali",'M',28,5511,'B');
        System.out.println(student4);

        System.out.println("-------------------------");

        Student student5 = new Student();
        student5.setInfo("Mert", 'M',26,2252,'C');
        System.out.println(student5);

        Student[] students = {student1,student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------");

        ArrayList<Student>earlyBirds = new ArrayList<>();//grade: A
        ArrayList<Student>angryBirds = new ArrayList<>();//

        for (Student student:students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);

        System.out.println("***************************");

        System.out.println(angryBirds);

    }
}
/*
earlyBirds.addAll(Arrays.asList(student1,student2,student3,student4,student5));
        angryBirds.addAll(Arrays.asList(student1,student2,student3,student4,student5));
        earlyBirds.removeIf(p-> !earlyBirds.contains('A'));
        angryBirds.removeIf(p->angryBirds.contains('A'));
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

 */