package day11_SwitchStatement;

public class GradeLevel_SwitchCase {
    public static void main(String[] args) {

        char gradeLevel = 'A';
        //String result="";

        switch (gradeLevel){
            case 'A':
            //  result="Excellent";
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;
         //  System.out.println(result);
        }
    }
}
 /*
        A char variable named grade is given, use switch statement to
        print the following messages:
        'A': Excellent
        'B': Great job
        'C': Good
        'D': Passed
        'F': Failed
        Otherwise: Invalid
         */