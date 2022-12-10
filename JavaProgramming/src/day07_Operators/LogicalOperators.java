package day07_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        All logical operators return Boolean(TRUE or FALSE)
        ***********************************************
        *     Operator         *        Description   *
        *---------------------------------------------*
        *        &&            *         Logical AND  *    both
        *        ||            *         Logical OR   *    either
        *        !             *         Logical NOT  *    nor
        ***********************************************
        1 false  &&  false========false
        2 false  &&  false========false
        3 false  &&  false========false
        4 true   &&  true  =======true

       In logical ||(or) operator only one expression needs to be true in
       order to return true.
       In logical operator, both expressions need to be true in order to
       return true

         */
        String name = "Steven";
        int age = 19;
        String citizen = "UK";
        boolean isEligible = age >= 18 && citizen == "USA";
        //                    19 >= 18 && "UK" == "USA"
        //                      TRUE   &&     FALSE    ======> False

        System.out.println(name + " is eligible to vote: "+ isEligible);

        System.out.println("-------------------------------------------------");

        String name2 = "Josh";
        int creditScore =720;
        int age2=23;
        int income = 40_000;
        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60_000;
        System.out.println(name2 + " is eligible for loan: "+ isEligible2);

        System.out.println("------------------------------------");

        String name3 = "Shay";
        int age3= 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //------------------------------------------------------------------
        //                      21 >= 18 &&    ( 'F'=='M'  ||   'F'=='F'  )
        //                        true         (  false    ||     true    )
        //                        true     &&   true(because of || operator)
        //------------------------------------------------------------------
        System.out.println(name3+ " is eligible to register: "+ isEligible3);


        System.out.println("-------------------------------------------------");

        String name4= "James";
        String countryOfBirth="UK";
        boolean marriedToUsCitizen=false;
        boolean isEligible4=countryOfBirth=="USA"||marriedToUsCitizen==true;
        //                      false            ||        false
        System.out.println(name4+" is eligible to apply for US citizenship: "+ isEligible4);

        System.out.println("*********************************************");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100_000;
        boolean isEligible5= gpa >=3.5 || familyIncome <= 60_000;
        //                      true---you don't need look other expression
        //                               true
        System.out.println(student+" is eligible for scholarship: "+isEligible5);

        System.out.println("**********************************");

        /*

                     LOGICAL NOT OPERATOR(!)
        *********************************
        * Expression  *  Returned Value *
        *********************************
        * False       *     True        *
        * True        *     False       *
        *********************************
         */
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3= !result2;
        System.out.println("result3 = "+result3);

        System.out.println("----------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }
}
