package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";

        String result=reverse(str);  //ajaJ

      if (str.equalsIgnoreCase(result)){
          System.out.println(str + " is palindrome");
      }else{
          System.out.println(str + " is not palindrome");
      }


        int total=7;
        total= sum(40,40);

    }

    public static String reverse(String str) {//"Java"
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


    public static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

}


