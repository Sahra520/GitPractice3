package java03_09_24_22;

public class IntroPostIncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        System.out.println("a = " + a);
        System.out.println(a++);
        System.out.println("a = " + a);
        System.out.println(a--);
        System.out.println("a = " + a);

        int b = 10;
        System.out.println(b--);//10
        System.out.println(b--);//9
        System.out.println(b);//8
        System.out.println(--b);//7
    }
}
/*Task 1 : Create a class which is "IntroPostIncrementDecrement" define a variable,

        int a=5;
        print a;
        print the a++;
        print the a--;
        
 */