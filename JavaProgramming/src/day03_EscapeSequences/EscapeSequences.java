package day03_EscapeSequences;
/*Escape sequences:Must be given with double quote
\n: starts a new line
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java Python C#");
        System.out.println();
        System.out.println("Java \nPython C#");
        System.out.println();
        System.out.println("Java \nPython \nC#");
        System.out.println();
        System.out.println("Hello Cydeo!\nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");
        System.out.println("______________________________");
        /*
        \t Horizontal Tab(tab)paragraph space
         */
        System.out.println("\tJava is cool Programming Language");
        System.out.println();
        /*
        \\single backslash,in order to print one backward slash we need
        to give two backward slash
         */
        System.out.println(" /\\ \n/  \\");
        System.out.println();
        /*
        \"double quote
        in order to print double quote we need to use \"
         */
        System.out.println("My favorite TV show is \"Game of Thrones\"");
    }
}
