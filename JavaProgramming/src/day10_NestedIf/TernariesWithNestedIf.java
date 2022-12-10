package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int score = 150;

        if(score>= 0 && score <=100) {
            if(score >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid score");
        }

        System.out.println("-----------------------------------------------");

        String result=(score>=0 && score<=100)?(score>=60)?"Passed"
                :"Failed":"Invalid Score";
        System.out.println(result);
    }
}
