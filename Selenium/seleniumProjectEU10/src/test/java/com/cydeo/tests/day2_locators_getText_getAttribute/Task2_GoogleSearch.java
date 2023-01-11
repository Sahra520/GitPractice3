package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        /*
        task3 Google Search
   1. open a Chrome browser
   2. Go to : https://www.google.com
   3. write "apple" in search box
   4. click google search button
   5. verify title:
            expected: Title should start with "apple" word
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https:www.google.com");
        WebElement acceptButton = driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
        acceptButton.click();

        //stop code execution for 3 minutes
        Thread.sleep(3000);

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.err.println("Title verification FAILED!!!");
        }



    }
}
