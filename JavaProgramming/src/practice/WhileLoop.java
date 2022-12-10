package practice;

public class WhileLoop {

    public static void main(String[] args) {
        //1~10
        int i =1;
        while(i<=10){
            System.out.println("i = " + i);
            i++;


        }
        int num=-5;
        System.out.println(num=0);
        System.out.println(","+ --num);
        boolean one=('a'!= 'z')&&false;
        boolean two=one||0==(9-10+1);
        System.out.println(two);
        System.out.println(13+3*(10-6)%2);

        byte b=104;
        boolean check=b<100;
        if (check){
            b-=100;

        }else {
            b=50;

        }
        System.out.println(b);
    }
}
