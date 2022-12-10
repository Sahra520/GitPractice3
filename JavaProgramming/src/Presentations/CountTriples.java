package Presentations;
import java.util.Scanner;
public class CountTriples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int count=0;
        String triple="";

        for (int i = 0; i <= str.length(); i++) {
            triple=str.substring(i,i+3);
            System.out.println(triple);
            if(triple.charAt(0)==triple.charAt(1) && triple.charAt(1)==triple.charAt(2))
                count++;
        }
        System.out.println(count);

/*
### Use a `loop` to count the number of triples in the given `str`. A triple is when the same character
 appears three times in a row. So if there is a specific character that is repeated three times,
  that will be counted as one triple. Print the total number of triples found in the String. The triples may overlap.

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    abcXXXabc

  Output:
    1
```
```
Ex:
  Input:
    xxxabyyyycd

  Output:
    3

  -> the triples found are xxx yyy and another yyy
```
```
Ex:
  Input:
    java

  Output:
    0
 */





    }
}
