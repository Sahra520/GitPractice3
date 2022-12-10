package day18_Nested_Loop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("----------------");

        for (int i = 0; i < 4; i++) { // i: 0, 1, 2, 3

            for (int j = 0; j < 5; j++) { // j: 0, 1, 2, 3, 4
                System.out.print("Wooden Spoon ");
            }
        }

    }
}
