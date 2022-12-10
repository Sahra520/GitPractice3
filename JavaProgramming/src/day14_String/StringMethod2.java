package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str1=str.replace("Java" , "Python");
        //"Python is fun, I love learning Python"
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);

        System.out.println("------------------------");
        
        String email="JoshSmith@yahoo.com";
        email=email.replace("yahoo" , "gmail");
        System.out.println("email = " + email);

        System.out.println("-------------------------");

        String sentence="Java Java Python Python C# C# C+ C+ Python Python Python Python";
        System.out.println(sentence);

        String sentence1=sentence.replace("Python","");
        System.out.println("sentence1 = " + sentence1);

               sentence1=sentence1.replace("   "," ");
        System.out.println("sentence1 = " + sentence1);

        System.out.println("--------------------------");

        String s="Dog Dog Dog Dog Dog Dog";
        System.out.println("s = " + s);
        String s1=s.replace("Dog","Cat");
        System.out.println("s1 = " + s1);

        System.out.println("--------------------------");

        String s2 = "C# is fun, C# is cool.";
        System.out.println(s2);
        s2=s2.replace(" C#", " Java");
        System.out.println(s2);

        System.out.println("--------------------------");

        String s3 = "Java";
        s3=s3.replace("a","e");//Jeve
        System.out.println(s3);

        System.out.println("----------------------------");

        String result="Java Java Java";
        //result=result.replace("Java","Python");//Python Python Python
        result=result.replaceFirst("Java","Python");
        System.out.println("result = " + result);

        System.out.println("-----------------------------");

        String result1="C# is fun, C# is cool.";
        result1=result1.replaceFirst("C#","Java");
        System.out.println("result1 = " + result1);

        System.out.println("-----------------------------");

        String result2="Java";
        result2=result2.replaceFirst("va","vo");
        System.out.println("result2 = " + result2);

    }
}
