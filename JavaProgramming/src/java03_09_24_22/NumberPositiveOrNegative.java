package java03_09_24_22;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        int number = 200;
        boolean numberIsPositive = number > 0;
        //if(number>0){
        if(numberIsPositive){
            System.out.println(number+" is positive");
        }else{
            System.out.println(number + " is negative");
        }

        if(false)
            System.out.println("if block is working");
        System.out.println(" I am outside of the block");
// I am outside of the block
        System.out.println("-------------");

        if(true)
            System.out.println("if block is working");
        System.out.println(" I am outside of the block");

        // if block is working
        // I am outside of the block


        System.out.println("------------------");
        if(true) {
            System.out.println(45);
            System.out.println(60);
        }
        System.out.println("---------");

        if(true)
            System.out.println(6);
    }
}
