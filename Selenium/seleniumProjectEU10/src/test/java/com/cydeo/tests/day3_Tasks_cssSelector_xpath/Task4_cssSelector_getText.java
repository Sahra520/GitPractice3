package com.cydeo.tests.day3_Tasks_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_cssSelector_getText {

    public static void main(String[] args) {

        // 1. open a Chrome browser
         WebDriver driver = WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();

        // 2. go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3. verify "Reset password" button text is as expected.
               // Expected: Reset password
        //locating reset password button using class attribute and its value
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //locating reset password button using VALUE attribute and its value
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText = resetPasswordButton.getText();

        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Reset password button text verification PASSED!");
        }else {
            System.out.println("Reset password button text verification FAILED!!!");
        }

        //PS1: inspect and decide which locator you should be using to locate web elements.
        //PS2: pay attention to where to get the text of this button from
    }
}
