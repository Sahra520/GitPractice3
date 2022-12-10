package day11_SwitchStatement;

public class NumberOfDays {
    public static void main(String[] args) {


//int month= 22;
//String result="";
//switch (month) {
        //  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        //      result = "31 days";
        //    break;
        //  case 4: case 6: case 9: case 11:
        //     result = "30 days";
        //      break;
        //   case 2:
        //      result = "28 days";
        //      break;
        //  default:
        //      result = "Invalid number";
        //      break;
        //   }
        //     System.out.println(result);

        //     System.out.println("*******************************************");

        int year = 2022;
        int number1 = 2;
        String result1 = "";
        if (number1 >= 1 && number1 <= 12) {
            switch (number1) {
                case 2:
                    result1 = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result1 = "30 days";
                    break;
                default:
                    result1 = "31 day";
                    break;
            }
        }else {
            result1 = "Invalid Number";
        }
            System.out.println(result1);

    }
}
/*
NumberOfDays:
 28 days: 2
 30 days: 4, 6, 9, 11
 31 days: 1, 3, 5, 7, 8, 10, 12
 if(1~12){
 }else{
 "Invalid Month"
 }
 */
