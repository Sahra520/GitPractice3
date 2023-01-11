package com.cydeo.tests.day4_findElements_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Task6_StaleElementReferenceException_Task {

    public static void main(String[] args) {

       // TC #6: StaleElementReferenceException Task
       // 1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       // 2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

       // 3- Locate “CYDEO” link, verify it is displayed.

       // 4- Refresh the page.

       // 5- Verify it is displayed, again.

    }
}
/*
TC #6: StaleElementReferenceException Task
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
This is a simple StaleElementReferenceException to understand what is
this exception and how to handle it.
 */