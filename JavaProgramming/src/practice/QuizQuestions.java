package practice;

public class QuizQuestions {

    public static void main(String[] args) {

            System.out.println(5+5+"");
            String str="Java";

            System.out.println(str.length()-1);
//uzerinde dusun
            String s = "the time was tied at 2-2";
            String s2 = s.substring(5);
            int index1=s.indexOf("game");
            int index2 = s2.indexOf("game");
            if (index1==index2){
                System.out.println(index1);
            }else {
                System.out.println(index2);
            }
            int number=5;
            while (number<100){
                number+=number;
            }
            System.out.println(number);


            System.out.println("----------");

            int a = 0;
            do {
                a=a++ + --a -(a%3);
            }while (++a < 4);
            System.out.println(a);//7 coz





            String str1="The whole time it was raining.";

            do {
                System.out.print(str1.charAt(0));
                str1=str1.substring(3);
            }while (!str1.isEmpty());




            System.out.println(5+(-4));






        }
}
