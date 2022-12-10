package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence="JavaJavaJava";
        int frequency=0;
        for (int i = 0; i <= sentence.length()-4; i++) {

        //for (int i = 0; i <sentence.length()-3; i++) {
          //  for (int i = 0; i <sentence.length()-4; i++) {
           String eachSub = sentence.substring(i,i+4);
// if we write sentence.substring(i,4)
//output will be: " Java,  ava,  va,  a "
           // System.out.println(eachSub);

            if (eachSub.equals("Java")){
                frequency++;

            }
        }
        System.out.println(frequency);
        }
}

/*
Write a program that can return the
frequency of the word Java from the sentence.
    Ex:
      sentence = "JavaJavaJava";

      output: 3

      Str = "JavaJava";
      substrings:
      1. Java //substring(0,4)
      2. avaJ //substring(1,5)
      3. vaJa //substring(2,6)
      4. aJav //substring(3,7)
      5. Java //substring(4,8)
 */