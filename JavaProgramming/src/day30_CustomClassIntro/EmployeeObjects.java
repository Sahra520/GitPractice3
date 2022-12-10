package day30_CustomClassIntro;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();

    employee1.setInfo("Szahra",'F',38,1124,"SDET",100000,true);
    employee2.setInfo("John",'M',25,2237,"Developer",100000,true);
    employee3.setInfo("Anna",'F',28,2287,"QA",85000,true);
    employee4.setInfo("David",'M',35,2256,"QA",45000,false);
    employee5.setInfo("Lina",'F',45,2290,"Manager",80000,true);
    employee6.setInfo("Kevin",'M',35,2298,"Senior QA",110000,true);

    Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6};

    int countFullTime = 0;
    int countPartTime = 0;
    double max = employees[0].salary;
    double min = employees[0].salary;
        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if (employee.salary>max){
                max = employee.salary;
            }
            if (employee.salary<min){
                min = employee.salary;
            }
        }

        System.out.println(countFullTime);
        System.out.println(countPartTime);

        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
