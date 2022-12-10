package day11_SwitchStatement;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'D';
        //String result="";
        switch (ch){
            case 'A': case 'B': case 'C': case 'D':
                System.out.println("Passed"); // result="Passed";
                break;
            case 'F':
                System.out.println("Failed"); // result="Failed";
                break;
            default:
                System.out.println("Invalid"); // result="Failed";
                break;
            // System.out.println(result);
        }

    }
}
/*
if the grade is A or B or C or D =====> "Passed"
otherwise =====> "Failed"
 */