package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        // 100 + 50 = 150
        System.out.println(firstNumber+"+"+secondNumber +" = "+ (firstNumber + secondNumber));
        System.out.println(firstNumber+"+"+secondNumber+"="+addition);
        System.out.println();

        int subtraction = firstNumber - secondNumber;
        //100 - 50 = 100
        System.out.println(firstNumber+"-"+secondNumber+" = "+ (firstNumber - secondNumber));
        System.out.println(firstNumber+"-"+secondNumber+"="+subtraction);
        System.out.println();

        //100 * 50 = 5000
        System.out.println(firstNumber+"*"+secondNumber+" = "+ (firstNumber * secondNumber));
        int multiplication = firstNumber * secondNumber;
        System.out.println(firstNumber+"*"+secondNumber+"="+multiplication);
        System.out.println();

        //100 / 50 = 2
        int division=firstNumber / secondNumber;
        System.out.println(firstNumber+ "/"+secondNumber+" = "+ (firstNumber / secondNumber));
        System.out.println(firstNumber+"/"+secondNumber+"="+division);
        System.out.println();

        //103 % 30 = 13
        int firstNumber1 = 103;
        int secondNumber2 = 30;
        int remainder = firstNumber1 % secondNumber2; //13
        System.out.println(firstNumber1+"%"+secondNumber2+"="+(firstNumber1 % secondNumber2));
        System.out.println(firstNumber1+"%"+secondNumber2+"="+remainder);
    }
}
