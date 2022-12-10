package day37_Inheritance_SuperKeyword.ScrumTask;

public class ScrumMaster extends Employee{//ScrumMaster IS A Employee, ScrumMaster IS A Person

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

    public void arrangeMeetings(){
        System.out.println(jobTitle + " " + name + " is arranging meetings");
    }

}
