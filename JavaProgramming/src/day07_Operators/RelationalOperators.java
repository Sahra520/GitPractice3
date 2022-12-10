package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        /*
        All relational operators return Boolean (TRUE or FALSE)

        Description               *         Operator       use
        ************************************************
        * Grater than             *             >      * numerical/compare numbers
        * Greater than or equal   *             >=     * numerical/compare numbers
        * Less than               *             <      * numerical/compare numbers
        * Less than or equal      *             <=     * numerical/compare numbers
        * Equal                   *             ==     *
        * Not Equal               *             !=     *
        ************************************************
         */
        //>,  >=,  <,  <=
        boolean result1=20>40;
        System.out.println("result1 = " + result1);//false
        
        boolean result2=160>=150;
        System.out.println("result2 = " + result2);//true

        boolean result3=100>=100;
        System.out.println("result3 = " + result3);//true
        
        boolean result4= 300<=500;
        System.out.println("result4 = " + result4);//false
        
        boolean result5= 300<500;
        System.out.println("result5 = " + result5);

        //credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;/*
        if the credit score is 720 or greater,then it's eligible for the loan*/
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);//true
        System.out.println("*******************************************");
        //less than<
        boolean result6=100<120; //true
        System.out.println("result6 = " + result6);
        boolean result7 = 200 < 180;//false
        System.out.println("result7 = " + result7);

        int score = 59;
        boolean hasFailed= score <= 59;
        //                   59<=59
        System.out.println("hasFailed = " + hasFailed);//false

        score = 75;
        System.out.println("hasFailed = " + hasFailed); //true
        
        boolean result8=45<=60;
        System.out.println("result8 = " + result8);//true

        System.out.println("*******************************************");

        /*just '=' sign reserved sign for assignment, if you want to use as a equal
        to compare you have to use '=='*/
        //egual operator
        int n=100;
        int m=200;
        boolean equal=n==m;
        System.out.println("equal = " + equal); //false

        boolean result9="Muhtar"=="Good Guy";
        System.out.println("result9 = " + result9);//false

        boolean result10='A'=='a';//65==97->false
        System.out.println("result10 = " + result10);//false
        
        boolean result11="java"=="Java"; //false,because java case sensitive
        System.out.println("result11 = " + result11);
        boolean result12="Java"=="  Java ";//false
        System.out.println("result12 = " + result12);

        System.out.println("***************");
        //"Hello World" =="hello world" //false
        boolean result13=100!=200.5;//true
        System.out.println("result13 = " + result13);

        boolean result14="Java"!="Break";//true
        System.out.println("result14 = " + result14);

        boolean result15=300!=300;//false
        System.out.println("result15 = " + result15);

    }
}
