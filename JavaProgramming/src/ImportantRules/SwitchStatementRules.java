package ImportantRules;

public class SwitchStatementRules {
    public static void main(String[] args) {
        /*
        data types supported by switch statement:
        int, short, byte, char, String

        boolean, long, double, float are not supported by switch statement.


        Syntax:
        switch (Data){
        case data1:
           Statements;
           break;
        case data2:
           Statements;
           break;
       default:
           Statements;
           break;
        }
         */

        int number=6;

        switch (number){ //1, 2, 3, 4, 5, 6, 7
            case 1:
                System.out.println("Monday");
                break; //exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: //only gets executed if none of the case blocks are matching
                System.out.println("Invalid number");
                break;
                /* we don't need to give break statement for the last block
            of the switch in order to exit the switch */
        }
    }
}
