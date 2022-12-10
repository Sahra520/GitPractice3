package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1= "       batch 25   ";
        str1=str1.trim();//"batch 25"
        System.out.println(str1);
        //trim(): returns new String without the white spaces (unused spaces)

        String str2="Cydeo School";
        int n1=str2.indexOf("h");
        System.out.println("n1 = "+ n1);//8

        int n2=str2.indexOf("o");
        System.out.println("n2 = " + n2);//4

        int n3=str2.indexOf("ool");
        System.out.println("n3 = " + n3);//9

        String str3="Java Programming Language";

        int n4=str3.indexOf("a");
        System.out.println("n4 = " + n4);//1

        int n5=str3.indexOf("a ");
        System.out.println("n5 = " + n5);//3

        int n6=str3.indexOf("amm");
        System.out.println("n6 = " + n6);//10

        int n7=str3.indexOf("g");
        System.out.println("n7 = " + n7);//8

        int n8=str3.indexOf("g ");
        System.out.println("n8 = " + n8);//15

        int n9 = str3.lastIndexOf("g");
        System.out.println("n9 = " + n9);//23

        System.out.println("----------------------");
        
        String s="Java Nova Cava Wawa orange";
        int firstA=s.indexOf("a");
        System.out.println("firstA= "+firstA);
        
        int lastA=s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA=s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        
        int thirdA=s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);//8

        //int fourthA=s.indexOf("ava W");
        //System.out.println("fourthA = " + fourthA);//11
        //int fourthA=s.indexOf("Ca")+1;
        int fourthA=s.lastIndexOf("av");
        System.out.println("fourthA = " + fourthA);//11

       // int fifthA = s.lastIndexOf("va")+1;
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);//13

        int sixthA=s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);//16

        //int seventhA=s.indexOf("a o");//18
        int seventhA=s.lastIndexOf("a ");//18
        System.out.println("seventhA = " + seventhA);
    }
}
