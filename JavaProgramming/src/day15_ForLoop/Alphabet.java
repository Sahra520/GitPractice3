package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for (char let1 = 'A'; let1 <= 'Z'; let1++) {
            System.out.print(let1 + " ");
        }
        System.out.println();
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }

        System.out.println();
        System.out.println("**************");

        for (char dlet = 'Z'; dlet >= 'A'; --dlet) {
            System.out.print(dlet + " ");
        }
        System.out.println();
        for (int dlet2 = 90; dlet2 >= 65; --dlet2) {
            System.out.print((char)dlet2 + " ");
        }
            System.out.println();
            System.out.println("-------------");

            for (char dlet1 = 'z'; dlet1 >= 'a'; --dlet1) {
                System.out.print(dlet1 + " ");
            }

            System.out.println();
            System.out.println("---------------");

            for (int lowercase = 97; lowercase <= 122; lowercase++) {
                System.out.print((char) lowercase + " ");
            }

        System.out.println("-------------------------------------------");

            for (char v=1;v<= 40_000; v++){
                System.out.print(v+" ");
            }
        }
    }

