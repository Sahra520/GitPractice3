package day08_IfStatement;

public class EligibleToBuyCigarette {
    public static void main(String[] args) {
        /*
        Given a number (byte) age, write a program that can check if
        person is eligible to buy Cigarettes
         */
        byte age = 12;
        boolean eligibleToBuyCigarette=age>=25;
        if(eligibleToBuyCigarette){
            System.out.println("Eligible to buy Cigarettes");

        }if(!eligibleToBuyCigarette){
            System.out.println("Not eligible to buy Cigarettes");
        }
    }
}
