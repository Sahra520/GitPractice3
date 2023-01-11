package com.cydeo.tests.day3_Tasks_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task1_NextBaseCRM_locators_getTextPractice {

    public static void main(String[] args) {

        //1. open a Chrome browser
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. go to: https://login1.nextbasecrm.com/
        //driver.navigate().to("https://login1.nextbasecrm.com");  or
        driver.get("https://login1.nextbasecrm.com");

        //3. enter incorrect username: "incorrect"
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        //4. enter incorrect password: "incorrect"
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //to auto generate local variable
        //Mac: option+Enter
        //Windows: Alt+Enter

        //5. click to log-in button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6. verify error message text is as expected.
          //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!");
        }else{
            System.err.println("Error message verification Failed!!!");
        }

        //PS: Inspect and decide which locator you should be using to locate web elements

    }
}
