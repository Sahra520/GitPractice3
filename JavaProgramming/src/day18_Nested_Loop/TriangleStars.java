package day18_Nested_Loop;

public class TriangleStars {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i; j++) {//look j <= i
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *
 */