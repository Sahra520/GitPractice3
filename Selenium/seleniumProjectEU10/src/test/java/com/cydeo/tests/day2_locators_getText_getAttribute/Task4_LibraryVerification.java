package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryVerification {

    public static void main(String[] args) {

        //1. open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to http://library2.cybertekschool.com/login.html
        driver.navigate().to("http://library2.cybertekschool.com/login.html");

        //3. enter username: "incorrect@email.com"
        //Locate username input box using "className" locator
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        //4. enter password: "incorrect password"
        //Locate password input box using "id" locator
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");



        //Locate Sign in button using "tagName" locator
         WebElement signInButton = driver.findElement(By.tagName("button"));
         signInButton.click();

        //5. verify: visually "Sorry, Wrong Email or Password" displayed
    }
}
