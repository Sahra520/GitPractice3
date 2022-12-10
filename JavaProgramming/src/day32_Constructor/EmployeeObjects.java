package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1);//Employee{name='Aaron', gender= , jobTitle='null', salary=0.0}



        Employee employee2 = new Employee("Yulia",'M');
        System.out.println(employee2);//Employee{name='Yulia', gender=M, jobTitle='null', salary=0.0}


        Employee employee3 = new Employee("OLga",'F',"SDET");
        System.out.println(employee3);//Employee{name='OLga', gender=F, jobTitle='SDET', salary=0.0}

        Employee employee4 = new Employee("Marcus", 'M',"QA",125000);
        System.out.println(employee4);//Employee{name='Marcus', gender=M, jobTitle='QA', salary=125000.0}


    }
}
