package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i=='C'){
               continue;//skipping
            }
            System.out.println(i);//A B D

        }
        //break-is exiting, continue-is skipping
    }
}
