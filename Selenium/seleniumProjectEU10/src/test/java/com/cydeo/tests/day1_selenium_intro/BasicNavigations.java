package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1-set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of the selenium webdriver
        //this line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //this line will maximize the browser size
        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();

        //3-go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title if the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //get the current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //stop code execution for 3 minutes
        Thread.sleep(3000);

        //4-use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 minutes
        Thread.sleep(3000);

        //5-use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 minutes
        Thread.sleep(3000);

        //6-use selenium to navigate refresh
        driver.navigate().refresh();

        //stop code execution for 3 minutes
        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.xpath("//div[text()='Az összes elfogadása']")).click();


        //get the title if the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        //get the title if the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get the current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //this will close the currently opened window
        driver.close();

        //this will close all the opened windows
       // driver.quit();








    }
}
