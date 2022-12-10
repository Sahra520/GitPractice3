package day12_Scanner;

import java.util.Scanner;
//import java.util.*;  // wild import: imports everything from the package/wasting
//if you input everything it takes more memory and memory is resource of java & cost
public class ScannerPractice {//regular import: import one class

    public static void main(String[] args) {
        //Scanner scan seklinde deklare edilmezse her defasinda
        //new Scanner(System.in).nextInt; seklinde yazmak lazim ki
        // bu da extra memory demek
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: ");
        int num=scan.nextInt();
        String result="";
        if(num>=1 && num<=7){
            //7
        result= (num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday"
          :(num==4)?"Thursday" :(num==5)? "Friday" :(num==6)?"Saturday" : "Sunday";
        }else{
            result="Invalid number";
        }
        System.out.println(result);

        scan.close();





    }
}
