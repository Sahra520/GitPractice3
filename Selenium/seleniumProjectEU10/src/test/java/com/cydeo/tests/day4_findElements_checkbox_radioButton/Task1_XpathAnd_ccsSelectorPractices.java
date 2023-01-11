package com.cydeo.tests.day4_findElements_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_XpathAnd_ccsSelectorPractices {

    public static void main(String[] args) {

        //1. open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the web elements on the page using Xpath and/or CSS locator (only total of 6)
        //a. "Home" link
               //Locate home link using cssSelector, class value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        
               //Locate home link using cssSelector,syntax # 2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

           //Locate home link using cssSelector, href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));
//WebElement homeLink_ex3 = driver.findElement(By.cssSelector("href='/'"));  if we delete 'a' it still work

   //     b. "Forgot password" header
        //Locate header using cssSelector: Locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));

           //Locate header using Xpath
       // WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));              same thing
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

   //     c. "E-mail" text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

   //     d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        //Locate input box using xpath contains method
        //tagName[contains(@attribute,'value')]
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[@type='text']"));

        WebElement inputBox_ex3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

   //     e. "Retrieve password" button
        //  "//button[@class='radius']"
        //  "//button[@type='submit']"
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

   //     f. "Powered by Cydeo" text
        WebElement poweredByCydeoText = driver.findElement(By.cssSelector("#page-footer > div > div"));

        //  4. Verify all web elements are displayed.


        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());

        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());

        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());

        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());

        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());

        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


        
    }
}
/*
Task1 Xpath and cssSelector practices
1. open Chrome browser
2. go to https://practice.cydeo.com/forgot_password
3. Locate all the web elements on the page using Xpath and/or CSS locator (only total of 6)

a. "Home" link
b. "Forgot password" header
c. "E-mail" text
d. E-mail input box
e. "Retrieve password" button
f. "Powered by Cydeo" text

4. Verify all web elements are displayed.

First solve the task with using cssSelector only. Try to create 2 different cssSelector if possible

Then solve the task using Xpath only. Try to create 2 different Xpath locator if possible
 */