package day24_CustomMethods_Return;

public class daysInMonth {

    public static void main(String[] args) {

        daysInMonth(2,2021);
    }


// create a method that can print how many days a month has
    public static void daysInMonth(int number,int year){
        String month="";
        if ((number >= 1 && number <= 12)) {
            if ((number == 2) && (year % 4 == 0)) {
                month = "29 days";
            } else if ((number == 1 || number == 3 ||
                        number == 5 || number == 7 || number == 8 || number == 10 || number == 12)) {
                    month = "31 days";
                } else if ((number == 4 || number == 6 || number == 9 || number == 11)) {
                        month = "30 days";
                    } else if (number == 2) {
                        month = "28 days";
            }
                }  else {
            System.out.println("Invalid number");
        } System.out.println(number + ". month,  " + month + " " + year);
            }

 }