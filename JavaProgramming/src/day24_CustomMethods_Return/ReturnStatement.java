package day24_CustomMethods_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(10);

    }















    // create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        if (number < 1 || number > 7){//if the number is invalid
            System.out.println("Invalid");
            return;//exits nameOfDay method
            //if we use return statement inside the void method it executed just exits the void method like break;
            //we can use without value return method in void method
//we cannot use "return int..." like this

        }
        if(number==1){
            System.out.println("Monday");
        } else if (number==2) {
            System.out.println("Tuesday");
        } else if (number==3) {
            System.out.println("Wednesday");
        } else if (number==4) {
            System.out.println("Thursday");
        } else if (number==5) {
            System.out.println("Friday");
        } else if (number==6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
    }
}
 /*   // create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name = "";
        if(number>=1 && number<=7){
            name = (number==1)?"Monday" : (number==2)?"Tuesday" : (number==3)?"Wednesday" : (number==4)?"Thursday"
                    : (number==5)?"Friday" : (number==6)?"Saturday" : "Sunday";
        }else{
            name = "Invalid";
        }
        System.out.println(number + " = " + name);
    }
*/