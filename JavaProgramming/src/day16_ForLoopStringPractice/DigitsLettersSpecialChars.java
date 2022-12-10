package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School !@#$%WoodenSpoon";

        String digits="";//12345
        String letters="";//CydeoSchoolWoodenSpoon
        String specialChars="";//!@#$%

        for (int i = 0; i < str.length(); i++) {
            //i:index numbers of str(0~last index)

            char ch=str.charAt(i);//each character that we have in str
            //System.out.println(ch);

            if(ch>='0' && ch<='9'){
                //if the character is between '0'~'9' thn it's digit
                  digits += ch;
            } else if (ch>='A' && ch<='Z') {
               //if the character is between 'A'~'Z' then it's letter
                letters += ch;

            }else if (ch>='a' && ch<='z') {
              //if the character is between 'a'~'z' then it's letter
                letters += ch;
            }else{//if th character is neither digit nor letter,
                //then it's special character
                if (ch!=' ') {//if the special character is nor a space
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
