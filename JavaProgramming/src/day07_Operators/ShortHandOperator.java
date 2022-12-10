package day07_Operators;

public class ShortHandOperator {
    public static void main(String[] args) {
       // /*assignment: x=y; meaning x=y

        int num=100;
        System.out.println("num = " + num);//100
        num=200;
        System.out.println("num = " + num);//200
        
        String word ="Java Programming";
        System.out.println("word = " + word);//Java Programming

        word= "Wooden Spoon";
        System.out.println("word = " + word);//Wooden Spoon

        //word=123;//invalid initializing

        word="Cydeo";
        System.out.println("word = " + word);//Cydeo

        word ="Java Programming";
        System.out.println("word = " + word);//Java Programming

        System.out.println();

        //Addition Assignment Operator:
        int x=100;
        System.out.println("x = " + x);//100
        System.out.println(x+200);//300
        System.out.println("x="+x);//100

        //x=x+200;
        x+=200;
        System.out.println("x = " + x);//300
        
        String str = "Wooden";
        System.out.println("str = " + str);
        str+=" Spoon";
        System.out.println("str = " + str);
        
        double num1=2.5;
        System.out.println("num1 = " + num1);//2.5
        num1+=5.5;
        System.out.println("num1 = " + num1);//8.0

        double availableBalance= 1000.50;
        //deposit 300;
        //availableBalance=300;
        System.out.println("availableBalance = " + availableBalance);/*
        expecting output 1300.5, but gives 300;*/
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println();
        //Subtraction Assignment
        System.out.println();
        //withdrawing 500$
        availableBalance+=500;
        System.out.println("availableBalance = " + availableBalance);
       availableBalance-=600;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$,then depositing 400$
        availableBalance-=200;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance+=400;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println();
        //Multiplication Assignment
        double salary=50000.50;
        //after the graduation salary * 2;
        salary*=2;//salary=salary*2;;
        System.out.println("salary = " + salary);
        double dodge=0.00000001;
        dodge*=1000000;
        System.out.println("dodge = " + dodge);
        System.out.println();

        //Division Assignment
        double num2=25000;
        System.out.println("num2 = " + num2);
        num2/=2;
        System.out.println("num2 = " + num2);
        System.out.println("----------------------");
        
        //Remainder Assignment   %=
        double num3=100;
        num3 %=3;
        System.out.println("num3 = " + num3); //1.0

        int amount= 127; //cents
        int quarters=amount/25;
        int cents= amount/25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("-----------");
        int cents2=127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);
        System.out.println("****************");

        int y = 300;
        System.out.println("y = " + y);
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("___________________");
        int balance=3500;
        //insurance fee:$153;
        balance%=153;
        System.out.println("balance = " + balance);//134





        
        





    }
}
