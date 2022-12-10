package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

//find the maximum number between 100~200
      int maxNumber = max(100,200);

        System.out.println(maxNumber);
// multiply the max number by 2
        System.out.println(maxNumber*2);
        //or
        int multiplication=maxNumber*2;
        System.out.println("multiplication="+multiplication);







//if we want reuse our method more than one times, we have to use return method

//return method : return type is not void
        //return statement: used for exiting method

    }


    //create a method that can return maximum number between two numbers

    public static int max(int num1, int num2) {

        int result = 0;
        if (num1>num2){
            result = num1;
        }else{
            result=num2;
        }
       return result;

    }




}


