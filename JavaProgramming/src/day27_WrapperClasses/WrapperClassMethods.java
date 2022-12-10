package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);//int

        System.out.println(str + 1);//124
        System.out.println(str + 1);//1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2); //it's not unboxing or autoboxing

        System.out.println(num2+2);//12.5
        System.out.println(str2 + 2);//10.52


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max);//2147483647
        System.out.println("min = " + min);//-2147483648

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println("min1 = " + min1);//min1 = -9223372036854775808
        System.out.println("max1 = " + max1);//max1 = 9223372036854775807

        String s1 = "maybe";//false
    //  String s1 = "true";//true
    //  String s1 = "false";//false
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("-----------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); // Integer
        int y = Integer.valueOf(s2);//Integer

        //valueOf method returns into the wrapper class
        //parse method returns into the primitive

        System.out.println(x);//123

        String s3 = "1.5";
        Double z  = Double.valueOf(s3);//Double
        System.out.println(z);

        System.out.println("------------");

        //isDigit();
        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);//true
        //isLetter();
        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);//false

        boolean r4 = !Character.isLetterOrDigit(ch1);
        System.out.println(r4);//true

        char ch2 = 'J';

        //isUpperCase();
        boolean r5 = Character.isUpperCase(ch2);
        System.out.println("is upper case = " + r5);//true

        //isLowerCase();
        boolean r6 = Character.isLowerCase(ch2);
        System.out.println("is lower case = " + r6);//false

        System.out.println("-----------------");

        String s = "ab1cde2efg3hi4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
             //   sum+=each;//sum=202
                sum += Integer.parseInt(""+each);//sum = 10
            }
        }
        System.out.println("sum = " + sum);
    }
}
