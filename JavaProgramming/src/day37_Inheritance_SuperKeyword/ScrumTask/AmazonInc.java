package day37_Inheritance_SuperKeyword.ScrumTask;

import java.util.Arrays;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";
        ProductOwner po = new ProductOwner("Suhaib", 29,'M',1,160000,company);


        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000,company);

        ScrumMaster sm = new ScrumMaster("Anel",26,'F', 3, 145000,company);

        Tester tester1 = new Tester("Chinara", 32,'F',"QA", 1415,125000,company);
        Tester tester2 = new Tester("Yasemin", 31, 'F', "QA",1416, 130000,company);
        Tester tester3 = new Tester("Irina", 29,'F',"QA", 1417,128000,company);
        Tester tester4 = new Tester("Aygul", 35,'F', "SDET", 1418, 150000,company);

        Tester[] testers = {tester4,tester1,tester2,tester3};


        Developer developer1 = new Developer("Szahra",40,'F',"FullStack developer",1218,200000,"Google");
        Developer developer2 = new Developer("Daniel",27,'M',"Java Developer",234,135000,"Amazon");

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDeveloper(developer2);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);
        //ScrumTeam{PO=Suhaib, BA=Cihad, SM=Anel, number of testers=4, number of developers=2}

        for (Tester tester : scrumTeam.testers){
            System.out.println(tester.name + " : " + tester.salary);
        }

        System.out.println();

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }


    }
}
