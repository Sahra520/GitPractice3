package homework;

public class LearnToOS {
    public static void main(String[] args) {
        /*Write a java program in order to learn to OS
        Mac     ->     MacOS
        Lenova  ->     Windows
        Iphone  ->     IOS
        Samsung ->     Android

        input : Mac
        output: MacOS

         */
        String brand= "Mac";

        if (brand=="Mac"){
            System.out.println("MacOs");
        } else if (brand=="Lenova"){
            System.out.println("Windows");
        } else if (brand=="Iphone"){
            System.out.println("IOS");
        }else if (brand=="Samsung"){
            System.out.println("Android");
        }
    }
}
