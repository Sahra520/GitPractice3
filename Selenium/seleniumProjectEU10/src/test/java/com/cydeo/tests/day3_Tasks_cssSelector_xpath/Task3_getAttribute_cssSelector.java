package com.cydeo.tests.day3_Tasks_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_getAttribute_cssSelector {

    public static void main(String[] args) {

        // 1. open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        // 2. go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        // 3. verify "Log in" button text is as expected.
            // Expected: Log in
                //tagName[attribute='value']
                //input[class='login-btn']
                        //LOCATED USING CLASS ATTRIBUTE
        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));  //1 of 1

                        //LOCATED USING TYPE ATTRIBUTE
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));  //1 of 2

                        //LOCATED USING VALUE ATTRIBUTE
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));  //1 of 1

        String expectedButtonText = "Log In";

        //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");
        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Login button text verification PASSED!");
        }else{
            System.out.println("Login button text verification FAILED!!!");
        }

        //PS1: inspect and decide which locator you should be using to locate web elements.
        //PS2: pay attention to where to get the text of this button from
    }
}
