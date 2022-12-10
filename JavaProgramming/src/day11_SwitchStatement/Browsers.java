package day11_SwitchStatement;

public class Browsers {
    public static void main(String[] args) {

        String browserName="Cydeo";
        String result="";
        boolean validBrowser=browserName=="Chrome" || browserName== "firefox"
                || browserName=="opera"|| browserName=="safari"
                ||browserName=="edge" || browserName=="internet explorer";

        if(validBrowser){//5 options
            if(browserName=="Chrome"){
                result=browserName+" browser is selected";
            } else if (browserName=="firefox") {
                result=browserName+" browser is selected";
            } else if (browserName=="opera") {
                result=browserName+" browser is selected";
            } else if (browserName=="safari") {
                result=browserName+" browser is selected";
            } else if (browserName=="edge") {
                result=browserName+" browser is selected";
            }else {
                result="Internet Explorer browser is selected";
            }

        }else{
            result="invalid browser name";
        }
        System.out.println(result);
    }
}
/*Create a class called Browser.Write a program that
        can display the name of selected browser.
        1. Declare a String variable named browserName.
        2. Assume that the valid browsers are: chrome, firefox,
        opera, safari, edge, ie(internet explorer)
        3. If the browser name does not match with the valid
        browsers names, output should be:
                      "Invalid Browser Name"
        Ex:
          String browser = "Chrome";
          Output:
               "Chrome browser is selected"
        Note: MUST use nested if
         */
