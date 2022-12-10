package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {
        String[] words = {"Java", "Java", "Aleksandra" , "C#", "Layan", "Python", "Python"};

        for (String each : words) {
            //each:"Java", "Java", "Aleksandra" , "C#", "Layan", "Python", "Python"
            int count = 0;

            for (String element : words) {
       // element: "Java", "Java", "Aleksandra" , "C#", "Layan", "Python", "Python"
                if (element.equals("Layan")){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }



    }
}
/*
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
 */