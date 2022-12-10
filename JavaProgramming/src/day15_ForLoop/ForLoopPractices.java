package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        for(int num=1;num<=15;num+=1){
            System.out.print(num+" ");
        }

        System.out.println("----------------");

        for(int i=50;i>=45;--i){
            System.out.print(i+" ");
        }

        System.out.println("-----------------------------");

        for (int num1=15;num1<=45;num1++){
            System.out.print(num1+" ");
        }

        System.out.println("-----------------");

        for (int num2=100;num2>=50;num2--){
            System.out.print(num2+" ");
        }

        System.out.println("------------------");

        for(int even=1; even<=55; even++) {
            if (even % 2 == 0) {
                System.out.print(even + " ");
            }
        }

        System.out.println("---------------------");

        for (int i=2;i<=54;i+=2){
            System.out.print(i+" ");
        }

        System.out.println("-------------------------");

        for (char let='a';let<='z';let+=1){
            System.out.print(let+" ");
        }

        System.out.println("-------------");





    }
}
