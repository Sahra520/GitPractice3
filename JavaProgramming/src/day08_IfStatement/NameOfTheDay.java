package day08_IfStatement;

public class NameOfTheDay {
    public static void main(String[] args) {
     int number= 12;
     if(number<=7 || number>=1){
         if(number==1) {
             System.out.println("Monday");
         } else if (number==2) {
             System.out.println("Tuesday");
         } else if (number==3) {
             System.out.println("Wednesday");
         } else if (number==4) {
             System.out.println("Thursday");
         } else if (number==5) {
             System.out.println("Friday");
         } else if (number==6) {
             System.out.println("Saturday");
         } else if (number==7) {
             System.out.println("Sunday");
         }else {
             System.out.println("Please enter the valid number!");
         }
     }
    }
}
   /*
        Task:
        Write a program that can display the name of the day
        number = 1~7
         */