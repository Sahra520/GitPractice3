package day17_While_DoWhile;

public class EvenNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {//even numbers
            if (!(i % 2 == 0)) {//or---if(i % 2 != 0)
                continue;
            }
            System.out.print(i + " ");//2, 4, 6...
        }

        System.out.println();

        for (int i = 1; i <=10; i++) { //odd numbers
            if (i%2==0)
                continue;
            System.out.print(i + " ");//1, 3, 5,...
        }


    }
}
