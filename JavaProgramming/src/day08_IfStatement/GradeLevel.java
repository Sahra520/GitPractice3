package day08_IfStatement;

public class GradeLevel {
    public static void main(String[] args) {
      byte number = 10;
      if(number>=1 && number <=5){
          System.out.println("Elementary school");
      } else if (number>=6 && number<=8) {
          System.out.println("Middle school");
      } else if (number>=9 && number<=12) {
          System.out.println("High school");
      }else if(number>=13 && number<=16){
          System.out.println("College");
      } else if (number>=17 && number<=18) {
          System.out.println("Grad school");
      }else {
          System.out.println("Please enter the valid number!");
      }

    }
}
  /*
        Given a number (byte) grade level determine and print in which
        school type someone is in
              Grade level and types are:
              1-5:   Elementary school
              6-8:   Middle school
              9-12:  High school
              13-16: College
              17-18: Grad school
         Assume that the given number is 1~18
         */
