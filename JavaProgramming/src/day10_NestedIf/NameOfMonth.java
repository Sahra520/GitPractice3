package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int n = 11;
       //:----- means in ternary operator - else and ()?----- means if
      String result= (n==1)?"January" :(n==2)?"February" :(n==3)?"March"
      :(n==4)?"April" :(n==5)?"May" :(n==6)?"June" :(n==7)?"July" :(n==8)?"August"
              :(n==9)?"September" :(n==10)?"October" :(n==11)?"November" : "December";

        System.out.println(result);

        /*ternary operatorda () goyup goymamak islegine bagly-optional,yone goymak
        maslahat berilyar sebabi okamak ansat bolyar*/
    }
}
