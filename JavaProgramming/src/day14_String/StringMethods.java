package day14_String;

public class StringMethods {

    public static void main(String[] args) {
        String str="      ";
        boolean r = str.isEmpty();
        System.out.println(r);

        System.out.println("------------");//false

        boolean r1 = str.isBlank();//wild space==isblank is true

        System.out.println(r1);//true

        System.out.println("---------------");

        String str2="Cydeo";
        System.out.println( str2.isBlank());//false

        System.out.println("-------------------");

        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("---------------------");

        //yes, Yes,yeS,yEs, YEs...equalsIgnoreCase
        System.out.println("yEs".equalsIgnoreCase("Yes"));//true
        System.out.println("------------");

        String sentence="My favorite programming language is Java";
        boolean hasCSharp=sentence.contains("C#");//false
        boolean hasJava=sentence.contains("Java");//true
        boolean hasjava2=sentence.contains("java");//false
        boolean hasjava3=sentence.toLowerCase().contains("java");//true
        boolean r3=sentence.contains("java")||sentence.contains("Java");//true

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasjava2);
        System.out.println(hasjava3);
        System.out.println(r3);

        System.out.println("-------------------");

        String input1="I love jAvA";
        String input2="Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false,
        // if I want to get true, the sentences must be equal index numbers

        System.out.println(input1.contains("Java"));//False
        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("-----------------");

        String a = "Wooden Spoon";
        System.out.println(a.charAt(0));//W
        boolean x = a.startsWith("Woo");
        //startsWith just check is index number of 0
        System.out.println(x);//True
        boolean y = a.endsWith("Spoon");
        System.out.println(y);//true
        boolean z=a.toLowerCase().startsWith("wooden");
        //in order to ignore the case sensitivity
        // we first create the lowercase/uppercase version of string
        //and then compare it with lowercase/uppercase
        System.out.println("z = " + z);//true

    }
}
