package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_CydeoVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com");


        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL  verification PASSED!");
        }else {
            System.err.println("URL verification FAILED!!!");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.err.println("Title verification FAILED!");
        }

        driver.close();
    }
}
/*
Task1:
1. open Chrome browser
2. go to https://practice.cydeo.com
3. verify URL contains
    expected: cydeo
4. verify title:
    expected: practice

 */