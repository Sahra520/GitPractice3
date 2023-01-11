package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_LinkTextPractice {

    public static void main(String[] args) throws InterruptedException {
        //Task3 Back and forth navigation
  //1. open a Chrome browser
        WebDriverManager.chromedriver().setup();

  //2. go to "https://practice.cydeo.com"
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com");

        //stop code execution for 3 minutes
        Thread.sleep(3000);

        //3. Click to A/B Testing from top of the list
        //driver.findElement(By.linkText("A/B Testing")).click();
//  or
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

  //4. verify title is:
        //Expected: No A/B Test
        String expectedTitle = " No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.err.println("Title verification FAILED!!!");
        }

        Thread.sleep(3000);

  //5. go back to home page using the back();
        driver.navigate().back();

  //6. Verify title equals:
        //Expected: Practice
        String homePageTitle = "Practice";
        String actualHomePageTitle = driver.getTitle();

        if (actualHomePageTitle.equals(homePageTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.err.println("Title verification FAILED!!!");
        }

    }
}
