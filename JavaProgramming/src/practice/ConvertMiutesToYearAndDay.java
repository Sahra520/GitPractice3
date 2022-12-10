package practice;

public class ConvertMiutesToYearAndDay {
    public static void main(String[] args) {

                int min = 3456789;
                int day = min/(60*24);
                int year = day/365;
                int remday = day%365;
                System.out.println("day = " + day);
                System.out.println("minute = " + min);
                System.out.println(" year ="+year);
                System.out.println("remday = " + remday);
                System.out.println(min+ " minutes is approximately " +year+ " years and "+remday + " days");

        /* Expected Output :
     3456789 minutes is approximately 6 years and 210 days*/
            }
        }


