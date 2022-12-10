package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming",
                "Selenium Automation", "API Testing", "Database Testing",
                "Manual Testing", "Automation Testing", "Fullstack Developer"};

        for (String classmate : classmates) {
            String initial = classmate.charAt(0)+"."+classmate.charAt(classmate.indexOf(" ")+1);
            System.out.println(initial);

            
        }


    }
}
