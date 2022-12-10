package day13_String;



public class StringIntro {

    public static void main(String[] args) {
        String  name="Java";
        String name1="Java";
        String name5="Java";
        String  name6="Java";
        System.out.println(name5==name);
        System.out.println(name1==name6);

        System.out.println("====================================");

        String str1= new String("Java");
        String str2= new String("Java");
        System.out.println(str1==str2);

        System.out.println("==========================");

        String s1="Java";
        String s2=new String("Java");
        System.out.println(s1.equals(s2));//true

        System.out.println("*******************");

        String s3="Java";
        String s4=new String("java");
        System.out.println(s3.equals(s4));//false, because java is case-sensitive

    }
}
