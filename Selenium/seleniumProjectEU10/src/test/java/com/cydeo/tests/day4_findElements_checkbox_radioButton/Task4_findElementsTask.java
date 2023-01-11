package com.cydeo.tests.day4_findElements_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task4_findElementsTask {

    public static void main(String[] args) {

       // TC #4: FindElements Task
       // 1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       // 2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

       // 3- Locate all the links in the page.
        //windows: alt + enter--> press enter again
        //mac:     option + enter --> press enter again
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // 4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        // 6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("HREF VALUES: " + each.getAttribute("href"));
            // 5- Print out the texts of the links.
            System.out.println("text of link " + each.getText());
        }




    }
}
/*
TC #4: FindElements Task
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */