package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniquesCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        String[] arr = str.split("");

        ArrayList<String>list = new ArrayList<>(Arrays.asList(arr));
        //list = [a, a, a, b, c, c, c, d, e, e, e, f]

        //ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split("")));
        //list = [a, a, a, b, c, c, c, d, e, e, e, f]

        System.out.println("list = " + list);

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if (frequency == 1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);//unique = bdf
    }
}
