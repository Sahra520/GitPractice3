package week07_10_22_2022;

public class CountEachWord {

    public static void main(String[] args) {

       /* --  Task 3: Count each name in sentence.

                input :

        String names = "Adam Adam Barry Aysun Aysun";

        output:

        Adam-2 Barry-1 Aysun-2

        */
        String names = "Adam Adam Barry Aysun Aysun";
        String temp = "";
        String result="";
        for (int i = 0; i < names.length(); i++) {
            char ch = names.charAt(i);
            //we need to find the word one by one
            if (ch != ' ') {
                temp += ch;//we need to find each word
                continue;
                //we need to find each word in order to continue to next statement
            }
            //in order to count word
            int counter = 0;
            String search = temp;
            String dumy=names;
            while (dumy.contains(search)) {
                counter++;
                dumy = dumy.replaceFirst(search, "");

            }
            if (!result.contains(search)) {
                result += search + " " + counter + " ";
                temp = "";

                System.out.println("result = " + result);
            }
        }
    }
}
