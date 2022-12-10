package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "Aleksandra" , "C#", "Layan", "Python", "Python"};

        for (int j = 0; j < words.length; j++) {

            String element = words[j];
            int frequency = 0;
            for (int i = 0; i < words.length; i++) { //i="Java",...
        //finds the frequency of element from array
                if (words[i].equals(element)){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(element);
            }
        }





    }
}
