import day31_Constructors.ScrumTask.Developer;
import day31_Constructors.ScrumTask.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;


class  MyScrumTeam{
    public static void main(String[] args) {

//4 testers object
        day31_Constructors.ScrumTask.Tester tester1 = new day31_Constructors.ScrumTask.Tester("Layan", 11,"QA",110000);
        day31_Constructors.ScrumTask.Tester tester2 = new day31_Constructors.ScrumTask.Tester("Ali", 43,"SDET",142000);
        day31_Constructors.ScrumTask.Tester tester3 = new day31_Constructors.ScrumTask.Tester("Alex", 44,"SE",135000);
        day31_Constructors.ScrumTask.Tester tester4 = new day31_Constructors.ScrumTask.Tester("Lala",23,"SDET",115000);

        day31_Constructors.ScrumTask.Tester[] testers = {tester2, tester3, tester4};

        //5 developers object
        Developer developer1 = new Developer("Olga",22,"Java Developer",125000);
        Developer developer2 = new Developer("Aygul",39,"Java Master",185000);
        Developer developer3 = new Developer("Sahra",23,"Software Developer",135000);
        Developer developer4 = new Developer("Ahmet",13,"Senior Developer",200000);
        Developer developer5 = new Developer("Yusup",14,"Java Developer",155000);

        Developer[] developers = {developer2, developer3, developer4, developer5};

        //1 ScrumTeam object
        ScrumTeam scrum = new ScrumTeam("Nigara","Kuvat","Marcus",14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);

        scrum.addDevelopers(developers);

        System.out.println(scrum);
        //ScrumTeam{PO='Nigara', BA='Kuvat', SM='Marcus', total number of testers =4, total number of developers=5, daysOfSprint=14}


        scrum.removeTester(23);
        scrum.removeDeveloper(22);
        System.out.println(scrum);

    }

    }


class Tester {
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



class Developer{

    public String name;
    public int employeeId;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

}

class ScrumTeam {
    public String PO,BA,SM;
    ArrayList<day31_Constructors.ScrumTask.Tester> testersList = new ArrayList<>();
    ArrayList<day31_Constructors.ScrumTask.Developer> devopsList = new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_Constructors.ScrumTask.Tester tester){
        testersList.add(tester);
    }

    public void addTesters(day31_Constructors.ScrumTask.Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }


    public void addDeveloper(day31_Constructors.ScrumTask.Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(day31_Constructors.ScrumTask.Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }



    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeId==employeeID);
    }


    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p->p.employeeId==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers =" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }

}
}

