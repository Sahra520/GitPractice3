package day10_NestedIf;

public class GradeReport2Ternary {

    public static void main(String[] args) {

       int score = 20;
      /*  String result = "";//temporary

        if(score >= 0 && score >= 100){//if the score is valid
            //5 possibilities : A, B, C, D, F
            if (score >= 90){//false:score < 90
                result = "Excellent";
            } else if (score >= 80) {//false: score < 80
                result = "Great";
            } else if (score >= 70) { //false: score < 70
                result = "Good";
            } else if (score >= 60) { // false: score < 60
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{//if the score is NOT valid
            result = "Invalid score";
        }
        System.out.println(result);

        System.out.println("***********************************");*/

        String res=(score >= 0 && score >= 100)?  (score >= 90)?"Excellent"
                :(score>=80)?"Great"  :(score>=70)?"Good"  :(score>=60)?"Passed"
                :"Failed"  :"Invalid score";
        System.out.println(res);
    }
}
