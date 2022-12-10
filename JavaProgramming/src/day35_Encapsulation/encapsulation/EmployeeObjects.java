package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);
        System.out.println(employee1);

        //employee1.age = 32;//can not allow because age is private

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);

        System.out.println(employee2);

        employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee2);


    }
}
