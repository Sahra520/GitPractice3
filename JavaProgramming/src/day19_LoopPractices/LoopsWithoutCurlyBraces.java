package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.println("Cydeo");
        System.out.println("Batch 25");
        // if we don't give here { curly braces loop will give us:
        /*Cydeo \n Cydeo \n Cydeo \n Cydeo \n Cydeo and Batch25
        because without curly braces loop will execute just for
        first statement 5 times and for second statement will execute
        just one time.
        */

        System.out.println("------------***-------------");

        for (int j = 0; j < 5; j++) {
            System.out.println("Full-stack SDET ");
            System.out.println("Senior SDET ");
        /* Full-stack SDET \n Full-stack SDET \n Full-stack SDET \n Full-stack SDET \n Full-stack SDET
        Senior SDET \n Senior SDET \n Senior SDET \n Senior SDET \n Senior SDET
             */
        }
    }
}
