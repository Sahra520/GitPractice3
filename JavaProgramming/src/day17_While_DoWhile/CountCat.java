package day17_While_DoWhile;

public class CountCat {

    public static void main(String[] args) {

        String sentence = "cat cat caT cat Cat Cat dog cat cat dog pig cat dog";
        sentence=sentence.toLowerCase();
        int countCat=0;
        while (sentence.contains("cat")) {
            sentence=sentence.replaceFirst("cat", "");

            countCat++;
        }
        System.out.println("countCat = " + countCat);
        sentence=sentence.trim();
        sentence=sentence.replace("   "," ");
        sentence=sentence.replace("  "," ");
        System.out.println("sentence = " + sentence);


    }
}
