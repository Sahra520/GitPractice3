package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {


    Student student1 = new Student("Ahmet");
    Student student2 = new Student("Aygun", 'F');
    Student student3 = new Student("Nugara", 11);
    Student student4 = new Student("Mert", 12, 'A');
    Student student5 = new Student("Cihad", 'M', 28);
    Student student6 = new Student("Suhaib",'M',27,15);
    Student student7 = new Student("Ali",'M',42,33,'B');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        Student[]students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));

        /*
[Student{name='Ahmet', gender= , age=0, studentID=0, grade= },
 Student{name='Aygun', gender=F, age=0, studentID=0, grade= },
 Student{name='Nugara', gender= , age=0, studentID=11, grade= },
  Student{name='Mert', gender= , age=0, studentID=12, grade=A},
  Student{name='Cihad', gender=M, age=28, studentID=0, grade= },
  Student{name='Suhaib', gender=M, age=27, studentID=15, grade= },
   Student{name='Ali', gender=M, age=42, studentID=33, grade=B}]
         */


    }

}
