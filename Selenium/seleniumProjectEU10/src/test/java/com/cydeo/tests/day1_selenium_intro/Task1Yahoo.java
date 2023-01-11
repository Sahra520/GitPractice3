package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Yahoo {

    public static void main(String[] args) {

        //Task1:
       // 1. Yahoo title verification
        //do setup for browser driver
         WebDriverManager.chromedriver().setup();

        //open Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        WebElement acceptButton = driver.findElement(By.xpath("//button[@class='btn primary']"));
        acceptButton.click();


        //3. verify title
      //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, News, Finance, Sports, Entertainment, Life, Shopping, Holiday Gift Ideas, Yahoo Plus, More...";

        //actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is NOT as expected. Verification FAILED!");
        }

    }
}
