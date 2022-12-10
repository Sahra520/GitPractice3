package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum=sumOf2Numbers(10,25);
        System.out.println(sumOf2Numbers(15,25));
        System.out.println(sum);


        System.out.println("------------");


        System.out.println(sumOf3Numbers(132,2134,3434));

        int sum2= sumOf3Numbers(453,567,567);
        System.out.println(sum2);


        System.out.println("-----------------------");

        int sum3 = sumOf4Numbers(345,46,6789,46);

        System.out.println(sum3);

        System.out.println(sumOf4Numbers(4656,456,7656,9913));


    }
   /* create a method that can find the sum of two numbers
    method name : sumOf2Numbers*/
    public static int sumOf2Numbers(int num1,int num2){
        return num1+num2;
    }




/*
    create a method that can find the sum of three numbers
    method name : sumOf3Numbers
    */
    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }




/*
    create a method that can find the sum of four numbers
    method name : sumOf4Numbers
 */
    public static int sumOf4Numbers(int num1, int num2, int num3,int num4){
        return num1+num2+num3+num4;
    }



















}
