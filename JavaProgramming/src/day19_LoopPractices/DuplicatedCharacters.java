package day19_LoopPractices;

public class DuplicatedCharacters {

    public static void main(String[] args) {
        String str = "aabccdeef";

        String result = "";//expecting result bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;//represents frequency of the ch

            for (int i = 0; i < str.length(); i++) {
                //compares the character that outer loop picked,
                //with each character's of string,
                char each = str.charAt(i);//each character of str
                if (ch == each) {
                    count++;
                }
            }
        /*    if (count==1) {//if the frequency of the character is 1,
                //then the character is unique
                result += ch;
            }*/
            if (count > 1){ //JUST CHANGED THIS PART from count!=1 to count > 1
                result += ch;
            }

        }
        System.out.println(result);
    }
}


