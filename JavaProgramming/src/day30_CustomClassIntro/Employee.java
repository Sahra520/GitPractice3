package day30_CustomClassIntro;

public class Employee {

    //this class is template, template is the blueprint of the objects class
    /*
    Employee class:
    name,ID,gender,jobTitle,salary,isFullTime(boolean)
    Actions:
    toString(): be able to print each employee object
    setInfo(): be able to set all the attributes
    work();...
     */
    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name,char gender,int age,int ID,String jobTitle,double salary,boolean isFullTime){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working.");
    }
}
