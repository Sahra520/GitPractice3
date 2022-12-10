package week05_08_2022;

public class StringIntro {
    public static void main(String[] args) {
        //we can create String two different ways
        //1. Sting litearl:
        String str = "Kazim";
        String str1 = "Kazim";
        System.out.println(str==str1);

        System.out.println("------------------");

        //2. New keyword
        String str2=new String("Kazim");
        String str3=new String("Kazim");
        System.out.println(str2==str3);

        System.out.println("--------------");

        System.out.println(str==str2);
    }
}
