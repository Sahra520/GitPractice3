package practice;

import java.time.LocalDateTime;

public class todayTime {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today = "+today);

        int hour = today.getHour();
        System.out.println("hour = " + hour);

        int minute = today.getMinute();

        int second = today.getSecond();

        System.out.println(hour+":"+minute+":"+second);


    }
}
/*write a java program that prints the current time
        hour:minutes:seconds
        output:3:55:23
        */
