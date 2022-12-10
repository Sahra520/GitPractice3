package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Szahra","Noor");//initial = S.N

        domain("szahragul@gmail.com");//gmail
        String[] emails={"josh@gmail.com","Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email:emails) {
        domain(email);//domain is : gmail  domain is : yahoo   domain is : cydeo   domain is : gmail
        }



        System.out.println(sum(5,878) );


        nameOfMonths(3);


        nameOfDay(5);




    }
// create a method that can display the initials of the person
    public static void initials(String firstName,String lastName) {
      String initial = firstName.charAt(0)+"."+lastName.charAt(0);
      initial=initial.toUpperCase();
        System.out.println("initial = "+initial);
    }



// create a method that can display the domain of the mail  domain(String email)
    public static void domain(String email){
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain is : " + domain);

    }



// create a method that can display the name of the months based on the given number to the method

    public static void nameOfMonths(int number){
        String name = "";
        if(number>=1 && number <=12){
            if (number==1){
                name = "January";
            } else if (number==2) {
                name = "Februaury";
            } else if (number==3) {
                name="March";
            } else if (number==4) {
                name="April";
            } else if (number==5) {
                name="May";
            } else if (number==6) {
                name="June";
            } else if (number==7) {
                name="July";
            } else if (number==8) {
                name="August";
            } else if (number==9) {
                 name="September";
            } else if (number==10) {
                name="October";
            } else if (number==11) {
                name="November";
            }else {
                name="December";
            }
        }else{
            name="Invalid number";
        }
        System.out.println(number + " = " + name);
    }





// create a method that can print the name of the day based on the given number to the method
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







//**************************************




//**************************************
    private static int sum(int number1, int number2) {
        return number1+number2;
    }




}
