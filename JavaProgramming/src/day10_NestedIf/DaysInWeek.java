package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 1; //1~7
        if (number >= 1 && number <=7) {
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
          }

        System.out.println("---------------------------------------------");

        String result=(number==1)?"Monday":(number==2)?"Tuesday"
                :(number==3)?"Wednesday" :(number==4)?"Thursday"
                :(number==5)?"Friday" :(number==6)?"Saturday":"Sunday";
        System.out.println(result);
        }

    }