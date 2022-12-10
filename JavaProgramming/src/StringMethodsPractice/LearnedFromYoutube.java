package StringMethodsPractice;

public class LearnedFromYoutube {

    public static void main(String[] args) {
        String city= "Budapest";
        String town = "Debrecen";
        String s1 = "Tahtakale";
        String s2 = "Canakkale";
        System.out.println(s1.regionMatches(5,s2,5,3));//true
        System.out.println(city.regionMatches(5,town,5,3));//false

        System.out.println("-----------");

        String word="Budapest";
        int result = word.codePointAt(2);
        int result1 = word.codePointAt(3);
        System.out.println(result);//100
        System.out.println(result1);//97


    }
}
