package day31_Constructors.ScrumTask;

public class Tester {

    public String name;
    public int employeeId;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public  void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }


    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    /*
    create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add a constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()   */

}
