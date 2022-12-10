package day37_Inheritance_SuperKeyword.ScrumTask;

public class Developer extends Employee{//Developer IS A Employee, Developer IS A Person

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is crying");
    }


}
