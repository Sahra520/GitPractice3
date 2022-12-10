package day37_Inheritance_SuperKeyword.ScrumTask;

public class ProductOwner extends Employee{//PO IS A Employee, PO IS A Person
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }

    public void gatheringRequirement(){
        System.out.println(name + " is gathering requirement");
    }

}
